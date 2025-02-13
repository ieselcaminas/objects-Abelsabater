package POO.Maquinaexpendedora;

import java.util.ArrayList;
import java.util.List;

public class Cajon {
    private int cod;
    private List<MonedaoBillete>monedaoBilletes;
    private double cantidad;
    private List<Tiquet>tiquets;

    public Cajon(int cod) {
        this.cod = cod;
        this.monedaoBilletes=new ArrayList<>();
        this.tiquets=new ArrayList<>();
    }
    public void addm(MonedaoBillete monedaoBillete){
        this.monedaoBilletes.add(monedaoBillete);
    }
    public void addt(Tiquet tiquet){
        this.tiquets.add(tiquet);
    }
    public List<MonedaoBillete> getMonedaoBilletes() {
        return monedaoBilletes;
    }

    public List<Tiquet> getTiquets() {
        return tiquets;
    }

    public int getCod() {
        return cod;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void quantostiquets(){
        int i=1;
        while (getCantidad()!=0){
            if(getCantidad()-tiquets.get(0).getPrecio()*i==0){
                break;
            }
            if(getCantidad()<tiquets.get(0).getPrecio()*i){
                break;
            }else{
                setCantidad(getCantidad()-tiquets.get(0).getPrecio()*i);
                i+=1;
            }
        }
    }
    public void devolvercanvio(){
        List<Double> cambio=new ArrayList<>();
        while (getCantidad()!=0){
            if(this.monedaoBilletes.isEmpty() && getCantidad()>0){
                System.out.println("Donameu just que no tenim cambi");
                break;
            }else{
                if(getCantidad()>500){
                    setCantidad(getCantidad()-500);
                    cambio.add(500.0);
                } else if (getCantidad()>200){
                    setCantidad(getCantidad()-200);
                    cambio.add(200.0);
                }else if (getCantidad()>100){
                    setCantidad(getCantidad()-100);
                    cambio.add(100.0);
                }else if (getCantidad()>50){
                    setCantidad(getCantidad()-50);
                    cambio.add(50.0);
                }else if (getCantidad()>20){
                    setCantidad(getCantidad()-20);
                    cambio.add(20.0);
                }else if (getCantidad()>10){
                    setCantidad(getCantidad()-10);
                    cambio.add(10.0);
                }else if (getCantidad()>5){
                    setCantidad(getCantidad()-5);
                    cambio.add(5.0);
                }else if (getCantidad()>2){
                    setCantidad(getCantidad()-2);
                    cambio.add(2.0);
                }else if (getCantidad()>1){
                    setCantidad(getCantidad()-1);
                    cambio.add(1.0);
                }else if (getCantidad()>0.50){
                    setCantidad(getCantidad()-0.50);
                    cambio.add(0.50);
                }else if (getCantidad()>0.20){
                    setCantidad(getCantidad()-0.20);
                    cambio.add(0.20);
                }else if (getCantidad()>0.10){
                    setCantidad(getCantidad()-0.10);
                    cambio.add(0.10);
                }else if (getCantidad()>0.05){
                    setCantidad(getCantidad()-0.05);
                    cambio.add(0.05);
                }else if (getCantidad()>0.02){
                    setCantidad(getCantidad()-0.02);
                    cambio.add(0.02);
                }else if (getCantidad()>0.01){
                    setCantidad(getCantidad()-0.01);
                    cambio.add(0.01);
                }
            }
            System.out.println(cambio.get(0)+"€");
            cambio.remove(0);
        }
    }
}