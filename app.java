public class Main{
    public static void Main(String[] args){
	Empleado emp = new Empleado("Diego", 250000);
    emp.informacionempleado();	
    }
}

class Empleado{
    String nombre;
    private double salario;

 public Empleado(String nombre, double salario){
     this.nombre = nombre;
     this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
    public double totalsalarioanual(){
        return salario * 14;
    }
    public void informacionempleado(){
        System.out.println("El nombre del Empleado es: " + nombre);
        System.out.println("Su salario es: " + salario);
        System.out.println("su salario anual es: " + totalsalarioanual());
    }
}