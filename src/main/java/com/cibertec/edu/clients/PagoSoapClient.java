package com.cibertec.edu.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.cibertec.edu.soap.entities.ConsultaPagosRequest;
import com.cibertec.edu.soap.entities.ListadoPagos;

@Service
public class PagoSoapClient {

    @Autowired
    private WebServiceTemplate webServiceTemplate;
    
    public ListadoPagos getTodosLosPagos() {
        ConsultaPagosRequest request = new ConsultaPagosRequest();
        request.setFechaConsulta("");

        return (ListadoPagos) webServiceTemplate.marshalSendAndReceive(request);
    }


    public ListadoPagos getPagosPorFecha(String fechaConsulta) {
        ConsultaPagosRequest request = new ConsultaPagosRequest();
        request.setFechaConsulta(fechaConsulta);

        return (ListadoPagos) webServiceTemplate.marshalSendAndReceive(request);
    }
    
    
}

