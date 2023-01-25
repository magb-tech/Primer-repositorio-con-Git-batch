package es.studium.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("José");
		empleado1.setApellidos("Romero Dominguez");
		empleado1.setDni("12345678M");
		empleado1.setDomicilio("Av. de la Paz");
		empleado1.setPuesto("Programador");
		empleado1.setTelefono(555876523);
		System.out.println(empleado1.getNombre()+" "+empleado1.getApellidos()+" "+empleado1.getDni()+" "+empleado1.getDomicilio()+" "+empleado1.getPuesto()+" "+empleado1.getTelefono() );

		Empleado  empleado2 = new Empleado ("Ramón","Navas Martinez","12345678N","Av Pueblo Saharahui","Programador",555666688);
		System.out.println(empleado2.getNombre()+" "+empleado2.getApellidos()+" "+empleado2.getDni()+" "+empleado2.getDomicilio()+" "+empleado2.getPuesto()+" "+empleado2.getTelefono());
	}

}
