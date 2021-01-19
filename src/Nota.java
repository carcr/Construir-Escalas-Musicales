public class Nota {

    private String nota;
    private String alteracionNota;

    Nota(String nota){
        this.nota=nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getAlteracionNota() {
        return alteracionNota;
    }

    public void setAlteracionNota(String alteracionNota) {
        this.alteracionNota = alteracionNota;
    }
}
