public class ConstruirEscala {

    private String[] sotenidos={"F","C","G","D","A","E","B"};
    private String[] bemoles={"B","E","A","D","G","C","F"};
    private Escala escala;

    ConstruirEscala(String notaRaiz,String alteracion,String tipoEscala){

        escala=new Escala(notaRaiz,alteracion,tipoEscala);
        meterAlteraciones();
        corregirDobleSotenidoBemol();
        corregirPrimerUltimoSostenidoBemol();

    }

    public Escala getEscala(){ return this.escala; }

    public void meterAlteraciones(){
        String simbolo;
        if (escala.getNumeroFinalEscala()>0){
            simbolo="#";
            meterSostenidosBemoles(sotenidos,simbolo);
        }else if (escala.getNumeroFinalEscala()<0){
            simbolo="b";
            meterSostenidosBemoles(bemoles,simbolo);
        }

        if (!escala.getTipoEscala().equals("Mayor")){
            alterarSegunTipoEscala();
        }
    }

    public String[] crearArrAlteraciones(String[] arrSostenidosBemoles){
        int numeroFinalEscala=Math.abs(escala.getNumeroFinalEscala());
        String[] arrAlteraciones=new String[numeroFinalEscala];
        int contadorArrSB=0;
        for (int i=0;i<arrAlteraciones.length;i++){
            arrAlteraciones[i]=arrSostenidosBemoles[contadorArrSB];
            contadorArrSB++;
            if (contadorArrSB==arrSostenidosBemoles.length){
                contadorArrSB=0;
            }
        }
        return arrAlteraciones;
    }

    public void meterSostenidosBemoles(String[] arrSostenidosBemoles,String simbolo){
        String[] arrAlteraciones=crearArrAlteraciones(arrSostenidosBemoles);

        Nota[] notasEscala=escala.getNotasEscala();

        int alteracionesMetidas=0;
        int contadorEscala=0;
        while(alteracionesMetidas<arrAlteraciones.length){
            Nota notaActual=notasEscala[contadorEscala];
            if (notaActual.getNota().contains(arrAlteraciones[alteracionesMetidas])){
                notaActual.setNota(notaActual.getNota()+simbolo);

                alteracionesMetidas++;
            }
            contadorEscala++;
            if (contadorEscala==notasEscala.length){
                contadorEscala=0;
            }
        }
    }

    public void alterarSegunTipoEscala(){
        String tipoEscala=escala.getTipoEscala();
        Nota subtonica7=escala.getNotasEscala()[escala.getNotasEscala().length-2];//Subtonica es la 7ª nota
        Nota submedainte6=escala.getNotasEscala()[escala.getNotasEscala().length-3];//Submediante es la 6ª nota
        if (tipoEscala.equals("Menor Armónica")){
            alterarNotaTipoEscalaMenor(subtonica7);
        }else if(tipoEscala.equals("Menor Melódica")){
            alterarNotaTipoEscalaMenor(submedainte6);
            alterarNotaTipoEscalaMenor(subtonica7);
        }
    }

    public void alterarNotaTipoEscalaMenor(Nota nota){
        if (nota.getNota().contains("b")){
            nota.setNota(nota.getNota().substring(0,1));
        }else if (nota.getNota().contains("bb")){
            nota.setNota(nota.getNota().substring(0,2));
        }else{
            nota.setNota(nota.getNota()+"#");
        }
    }

    //CoreccionesFinales
    public void corregirDobleSotenidoBemol(){
        for (Nota n:escala.getNotasEscala()) {
            if (n.getNota().contains("##")){
                n.setNota(n.getNota().charAt(0)+"x");
            }
        }
    }

    public void corregirPrimerUltimoSostenidoBemol(){
        Nota tonica=escala.getNotasEscala()[0];
        Nota octava=escala.getNotasEscala()[7];
        if (tonica.getNota().contains(escala.getAlteracion())){
            octava.setNota(octava.getNota()+escala.getAlteracion());
        }else if(octava.getNota().contains(escala.getAlteracion())){
            tonica.setNota(tonica.getNota()+escala.getAlteracion());
        }
    }
}
