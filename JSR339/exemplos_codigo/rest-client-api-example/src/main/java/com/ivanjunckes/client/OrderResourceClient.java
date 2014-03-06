package com.ivanjunckes.client;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ivanjunckes.entity.Order;


public class OrderResourceClient {
	public static void main(String[] args) { 
		
		Client orderClient = ClientBuilder.newClient();
		
		WebTarget target = orderClient.target("http://localhost:8082/rest-client-api-example/resources/orders/{id}");
		
		Response response = target
				 				.resolveTemplate("id", 1)
				 				.request(MediaType.APPLICATION_JSON)
				 				.get();
		
		if(response.getStatus() == Status.OK.getStatusCode()){
			Order order = (Order) response.readEntity(Order.class);
			
			System.out.println("Id: " + order.getId());
			System.out.println("Name: " + order.getName());
			System.out.println("Price: " + order.getPrice());
		}else{
			System.out.println(response.getStatus() + " " + response.getStatusInfo());
		}
	}
}
