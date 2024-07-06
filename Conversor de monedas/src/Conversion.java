public class Conversion {
    private Cambio cambio;

    public Conversion(Cambio cambio) {
        this.cambio = cambio;
    }

    public double convertir(double cantidad, String desdeMoneda, String aMoneda) {
        if (desdeMoneda.equalsIgnoreCase("quetzal") && aMoneda.equalsIgnoreCase("dollar")) {
            return cantidad / cambio.getQuetzalCambio();
        } else if (desdeMoneda.equalsIgnoreCase("dollar") && aMoneda.equalsIgnoreCase("quetzal")) {
            return cantidad * cambio.getQuetzalCambio();
        } else if (desdeMoneda.equalsIgnoreCase("peso") && aMoneda.equalsIgnoreCase("dollar")) {
            return cantidad / cambio.getPesoCambio();
        } else if (desdeMoneda.equalsIgnoreCase("dollar") && aMoneda.equalsIgnoreCase("peso")) {
            return cantidad * cambio.getPesoCambio();
        } else {
            return cantidad;
        }
    }
}
