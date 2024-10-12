package com.cibertec.edu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.edu.clients.PagoSoapClient;
import com.cibertec.edu.soap.entities.ListadoPagos;

@RestController
@RequestMapping("/api/pagos")
public class PagoRestController {

    @Autowired
    private PagoSoapClient pagoSoapClient;

    @GetMapping("/consultar")
    public ResponseEntity<List<Map<String, Object>>> consultarPagos(@RequestParam(required = false) String fechaConsulta) {
        ListadoPagos listadoPagos;

        if (fechaConsulta != null && !fechaConsulta.isEmpty()) {
            listadoPagos = pagoSoapClient.getPagosPorFecha(fechaConsulta);
        } else {
            listadoPagos = pagoSoapClient.getTodosLosPagos();
        }

        List<Map<String, Object>> resultado = new ArrayList<>();

        listadoPagos.getPago().forEach(pago -> {
            Map<String, Object> detallesPago = new HashMap<>();
            Map<String, Double> monedas = new HashMap<>();

            double montoOriginal = pago.getMontoTotalPago();
            double igv = montoOriginal * 0.18;
            double valorNeto = montoOriginal - igv;

            if (pago.getMoneda().equalsIgnoreCase("Soles")) {
                monedas.put("soles", montoOriginal);
                monedas.put("dolares", montoOriginal / 3.85);
            } else {
                monedas.put("soles", montoOriginal * 3.85);
                monedas.put("dolares", montoOriginal);
            }

            detallesPago.put("monedas", monedas);
            detallesPago.put("montoOriginal", montoOriginal);
            detallesPago.put("monedaOriginal", pago.getMoneda());
            detallesPago.put("impuestos", igv);
            detallesPago.put("valorNeto", valorNeto);
            detallesPago.put("fechaVenta", pago.getFechaPago());

            resultado.add(detallesPago);
        });

        return ResponseEntity.ok(resultado);
    }
}


