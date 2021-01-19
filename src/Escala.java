public class Escala {

    private String notaTonica;
    private String alteracion;
    private String tipoEscala;
    private Nota[] notasEscala;
    private int numeroFinalEscala;

    Escala(String notaTonica,String alteracion,String tipoEscala){
        this.notaTonica=notaTonica;
        this.alteracion=alteracion;
        this.tipoEscala=tipoEscala;

        initEscala();
    }

    public String getNotaTonica() {
        return notaTonica;
    }

    public String getAlteracion() {
        return alteracion;
    }

    public String getTipoEscala() {
        return tipoEscala;
    }

    public Nota[] getNotasEscala() {
        return notasEscala;
    }

    public int getNumeroFinalEscala() {
        return numeroFinalEscala;
    }


    private void initEscala(){
        construirArrayNotas();
        numeroFinalEscala=elegirNumeroEscala();
    }

    public void construirArrayNotas(){
        String[]notasArr={"C","D","E","F","G","A","B"};
        notasEscala=new Nota[8];
        int posArrNotas=0;
        int contadorNotasMetidas=0;
        boolean meterNotaEnEscala=false;
        while (contadorNotasMetidas<8){
            if (notaTonica.equals(notasArr[posArrNotas])){
                meterNotaEnEscala=true;
            }
            if(meterNotaEnEscala){
                notasEscala[contadorNotasMetidas]=new Nota(notasArr[posArrNotas]);
                contadorNotasMetidas++;
            }
            posArrNotas++;

            if(posArrNotas==notasArr.length){
                posArrNotas=0;
            }

        }

    }

    public int elegirNumeroEscala(){
        int numero = switch (this.notaTonica) {
            case "D" -> 2;
            case "E" -> 4;
            case "F" -> -1;
            case "G" -> 1;
            case "A" -> 3;
            case "B" -> 5;
            default -> 0;
        };
        if(!this.tipoEscala.equals("Mayor")){
            numero-=3;
        }
        if(this.alteracion.equals("#")){
            numero+=7;
        }else if(this.alteracion.equals("b")){
            numero-=7;
        }
        return numero;
    }

    public void printEscalaNotas(){
        for (Nota n: notasEscala) {
            System.out.print(n.getNota()+" ");
        }
    }

    public String convertirEscalaToString(){
        StringBuilder escala= new StringBuilder();
        for (Nota n: notasEscala) {
            escala.append(n.getNota()).append(" ");
        }
        return escala.toString();
    }
}
