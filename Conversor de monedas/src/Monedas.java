import java.util.Date;

public class Monedas {
    private double dollar;
    private double quetzalGt;
    private double pesoMx;
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getQuetzalGt() {
        return quetzalGt;
    }

    public void setQuetzalGt(double quetzalGt) {
        this.quetzalGt = quetzalGt;
    }

    public double getPesoMx() {
        return pesoMx;
    }

    public void setPesoMx(double pesoMx) {
        this.pesoMx = pesoMx;
    }
}
