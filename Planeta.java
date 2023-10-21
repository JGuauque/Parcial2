public class Planeta {
    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaSol;
    private boolean observable;

    public Planeta(String nombre, int satelites, double masa, double volumen, double diametro, double distanciaSol, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public double calcularDensidad() {
        double densidad = masa / volumen;
        return densidad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Satélites: " + satelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km3");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al sol: " + distanciaSol + " km");
        System.out.println("Observable: " + observable);
    }

   

    public static void main(String[] args) {

        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12756.2, 149597870.7, true);

        tierra.imprimir();

        System.out.println("Densidad: " + tierra.calcularDensidad() + " kg/m3");
    }
}
