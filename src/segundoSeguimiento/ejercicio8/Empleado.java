package segundoSeguimiento.ejercicio8;

public class Empleado {
    // Atributos
    private String nombre;
    private int horasTrabajadas;
    private double salario;

    // Constructor
    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = calcularSalario();
    }

    // Método para calcular el salario
    private double calcularSalario() {
        double salarioPorHora;
        if (horasTrabajadas <= 10) {
            salarioPorHora = 15;
        } else {
            salarioPorHora = 18;
        }
        return horasTrabajadas * salarioPorHora;
    }

    // Método para mostrar el mensaje
    public void mostrarMensaje() {
        System.out.println("Señor " + nombre + ", el número de horas es " + horasTrabajadas + " y su salario equivale a " + salario);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.salario = calcularSalario(); // Recalcular el salario si cambian las horas
    }

    public double getSalario() {
        return salario;
    }
}
