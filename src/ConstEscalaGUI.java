import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConstEscalaGUI extends JFrame {

    private JButton[] botonesNotas=new JButton[7];
    private JButton[] botonesAlteraciones=new JButton[3];
    private JButton[] botonesTipoEscala=new JButton[4];

    private JPanel zonaTitulo=new JPanel();
    private JPanel zonaBotones=new JPanel();
    private JPanel zonaMostrarEscala=new JPanel();
    private JButton botonCrear=new JButton("CREAR");
    private JLabel tituloApp=new JLabel("CONSTRUIR ESCALAS");
    private JLabel infoPasos=new JLabel();
    private JLabel mostrarEscala=new JLabel();
    private JButton botonSeleccionado=new JButton();

    private ConstruirEscala construirEscala;
    private String notaRaiz;
    private String alteracion;
    private String tipoEscala;

    ConstEscalaGUI(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLayout(new GridLayout(3,1));
        setResizable(false);

        initBotones();


        //ZONA TITULO
        zonaTitulo.setBackground(Color.BLACK);
        zonaTitulo.setLayout(new GridLayout(2,1));

        tituloApp.setFont(new Font("Arial",Font.BOLD,40));
        tituloApp.setForeground(Color.CYAN);
        tituloApp.setHorizontalAlignment(JLabel.CENTER);
        tituloApp.setVerticalAlignment(JLabel.BOTTOM);
        zonaTitulo.add(tituloApp);

        //JLabel infoPasos=new JLabel();
        infoPasos.setFont(new Font("Arial",Font.PLAIN,25));
        infoPasos.setForeground(Color.ORANGE);
        infoPasos.setHorizontalAlignment(JLabel.CENTER);
        infoPasos.setVerticalAlignment(JLabel.BOTTOM);
        zonaTitulo.add(infoPasos);

        //ZONA BOTONES
        botonCrear.setFocusable(false);
        botonCrear.setPreferredSize(new Dimension(190,110));
        botonCrear.setFont(new Font("Arial",Font.BOLD,20));
        botonCrear.addActionListener(e->botonCrearEscala());

        zonaBotones.setBackground(Color.BLACK);
        zonaBotones.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.CENTER;
        gbc.insets=new Insets(0,5,0,5);

        zonaBotones.add(botonCrear);
        addZonaBotones(gbc);

        //ZONA MOSTRAR ESCALA
        zonaMostrarEscala.setBackground(Color.BLACK);
        zonaMostrarEscala.setLayout(new BorderLayout());
        mostrarEscala.setFont(new Font("Arial",Font.PLAIN,40));
        mostrarEscala.setForeground(Color.GREEN);
        mostrarEscala.setHorizontalAlignment(JLabel.CENTER);

        zonaMostrarEscala.add(mostrarEscala,BorderLayout.CENTER);

        add(zonaTitulo);
        add(zonaBotones);
        add(zonaMostrarEscala);

        setVisible(true);

    }

    public void initBotones(){
        String[] botonesNotasTexto={"C","D","E","F","G","A","B"};
        String[] botonesAlteracionesTexto={"#","b","SIN"};
        String[] botonesTipoEscalaTexto={"Mayor","Menor","Menor Armónica","Menor Melódica"};

        for (int i = 0; i < botonesNotas.length; i++) {
            botonesNotas[i]=new JButton(botonesNotasTexto[i]);
        }
        for (int i = 0; i < botonesAlteraciones.length; i++) {
            botonesAlteraciones[i]=new JButton(botonesAlteracionesTexto[i]);
        }
        for (int i = 0; i < botonesTipoEscala.length; i++) {
            botonesTipoEscala[i]=new JButton(botonesTipoEscalaTexto[i]);
        }
    }

    public void addZonaBotones(GridBagConstraints gbc){
        for (JButton botonN :botonesNotas) {

            botonN.setPreferredSize(new Dimension(100,90));
            botonN.setFont(new Font("Arial",Font.BOLD,20));
            botonN.setVisible(false);
            botonN.setFocusable(false);
            botonN.addActionListener(this::botonSeleccionNotaRaiz);
            zonaBotones.add(botonN,gbc);
        }
        for (JButton botonA :botonesAlteraciones) {
            botonA.setPreferredSize(new Dimension(100,90));
            botonA.setFont(new Font("Arial",Font.BOLD,20));
            botonA.setVisible(false);
            botonA.setFocusable(false);
            botonA.addActionListener(this::botonSeleccionAlteracion);
            zonaBotones.add(botonA,gbc);
        }

        for (JButton botonTE :botonesTipoEscala) {
            botonTE.setPreferredSize(new Dimension(170,90));
            botonTE.setFont(new Font("Arial",Font.BOLD,17));
            botonTE.setVisible(false);
            botonTE.setFocusable(false);
            botonTE.addActionListener(this::botonSeleccionTipoEscala);
            zonaBotones.add(botonTE,gbc);
        }
    }

    public void botonCrearEscala(){
        botonCrear.setVisible(false);

        for (JButton b: botonesNotas) {
            b.setVisible(true);
        }

        infoPasos.setText("Escoge la nota raíz de la escala");
        infoPasos.setVisible(true);
        mostrarEscala.setVisible(false);
    }

    public void botonSeleccionNotaRaiz(ActionEvent e){
        for (JButton b: botonesNotas) {
            b.setVisible(false);
        }

        for (JButton b: botonesAlteraciones) {
            b.setVisible(true);
        }
        infoPasos.setText("Escoge la alteración de la escala");
        botonSeleccionado=(JButton)e.getSource();
        notaRaiz=botonSeleccionado.getText();
    }

    public void botonSeleccionAlteracion(ActionEvent e){
        for (JButton b: botonesAlteraciones) {
            b.setVisible(false);
        }

        for (JButton b: botonesTipoEscala) {
            b.setVisible(true);
        }
        infoPasos.setText("Escoge el tipo de escala");
        botonSeleccionado=(JButton)e.getSource();
        alteracion=botonSeleccionado.getText();
    }

    public void botonSeleccionTipoEscala(ActionEvent e){
        for (JButton b: botonesTipoEscala) {
            b.setVisible(false);
        }

        botonCrear.setVisible(true);
        botonCrear.setText("CREAR NUEVA");
        infoPasos.setText("¡Escala Creada!");

        botonSeleccionado=(JButton)e.getSource();
        tipoEscala=botonSeleccionado.getText();

        construirEscala=new ConstruirEscala(notaRaiz,alteracion,tipoEscala);
        String escalaTexto=construirEscala.getEscala().convertirEscalaToString();
        mostrarEscala.setText(escalaTexto);
        mostrarEscala.setVisible(true);

    }

}
