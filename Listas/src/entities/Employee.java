package entities;

public class Employee {
	private int id;
	private String name;
	private double salario;
	public Employee(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public Employee() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void aumentarSalario(double porcentagem ) {
		 salario += salario * porcentagem / 100.0;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]"+ String.format("%.2f", salario);
	}
	
	

	}
