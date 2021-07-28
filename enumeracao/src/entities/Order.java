package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItem() {
		return itens;
	}

	public void addItem(OrderItem item) {//// this function add a item the list////////
		itens.add(item);

	}

	public void removeItem(OrderItem item) { //// this function remove a item the list////////
		itens.remove(item);

	}

	public Double total() {
		double aux = 0;
		for (OrderItem item : itens) {
			aux += item.subTotal();

		}
		return aux;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem Moment :");
		sb.append(sdf.format(moment) + "\n");
		sb.append("status:");
		sb.append(status + "\n");
		sb.append("Client:");
		sb.append(client + "\n");
		sb.append("itens:");
		for (OrderItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}

}
