package com.ivanjunckes.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.ivanjunckes.entity.Order;

@Path("orders")
public class OrderResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOrders(){
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1, "T-Shirt", 20.0F));
		orders.add(new Order(2, "Pair of socks", 3.0F));
		orders.add(new Order(3, "Gloves", 4.0F));
		
		ResponseBuilder rb = Response.ok(orders);
		return rb.build();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOrder(@PathParam("id") Integer id){
		Order order = new Order(1, "T-Shirt", 20.0F);
		ResponseBuilder rb = Response.ok(order);
		return rb.build();
	}
}
