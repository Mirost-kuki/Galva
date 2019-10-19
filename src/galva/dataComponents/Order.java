package galva.dataComponents;

import java.util.ArrayList;
import java.util.Date;

public class Order 
{
	private static int ID = 1;
	
	private int id;
	
	private Client client;
	private ArrayList<Ware> wares;
	private Date dateOfAcceptance;
	private ORDER_STATE orderState;
	private boolean acceptedOnWeldon;
	private boolean invoiced;
	private int weight;
	private String notes;
	
	public Order(Client client)
	{
		this.id = ID;
		ID++;
		
		this.client = client;
		this.wares = new ArrayList<Ware>();
		this.dateOfAcceptance = new Date();
		this.orderState = ORDER_STATE.FreshlyReceived;
		this.acceptedOnWeldon = false;
		this.invoiced = false;
		
	}
	public Order(Client client, int weight)
	{
		this(client);
		this.weight = weight;
	}
	public Order(Client client, ArrayList<Ware> wares, int weight)
	{
		this(client, weight);
		this.wares = wares;
		
	}

	public int getId() {
		return id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Ware> getWares() {
		return wares;
	}

	public void setWares(ArrayList<Ware> wares) {
		this.wares = wares;
	}

	public void addWare(Ware ware) {
		this.wares.add(ware);
	}
	
	public void removeWare(int i) {
		this.wares.remove(i);
	}
	public void removeWare(Ware ware) {
		this.wares.remove(ware);
	}

	public void clearWareList() {
		this.wares.clear();
	}

	public Date getDateOfAcceptance() {
		return dateOfAcceptance;
	}

	public void setDateOfAcceptance(Date dateOfAcceptance) {
		this.dateOfAcceptance = dateOfAcceptance;
	}

	public ORDER_STATE getOrderState() {
		return orderState;
	}

	public void setOrderState(ORDER_STATE orderState) {
		this.orderState = orderState;
	}

	public boolean isAcceptedOnWeldon() {
		return acceptedOnWeldon;
	}

	public void setAcceptedOnWeldon(boolean acceptedOnWeldon) {
		this.acceptedOnWeldon = acceptedOnWeldon;
	}

	public boolean isInvoiced() {
		return invoiced;
	}

	public void setInvoiced(boolean invoiced) {
		this.invoiced = invoiced;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}	
}
