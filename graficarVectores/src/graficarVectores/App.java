package graficarVectores;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import graficarVectores.Data;
import java.awt.Color;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    Data data;
    int cantCoordenadas = 0;

    // contadores de las figuras para las estadisticas
    int contEqui = 0;
    int contEsca = 0;
    int contIsose = 0;
    int contCuad = 0;
    int contRect = 0;
    int contRombo = 0;
    int contRomboi = 0;
    int contTrapecio = 0;
    int contTrapezoide = 0;
    int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
    int y1 = 0, y2 = 0, y3 = 0, y4 = 0;

    public App() {
        initComponents();
        init();
        data = new Data();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opCantPuntos = new javax.swing.ButtonGroup();
        pnlPlano = new javax.swing.JPanel();
        pnlSelecPuntos = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        rbCuatro = new javax.swing.JRadioButton();
        rbTres = new javax.swing.JRadioButton();
        lbl1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        pnlPuntos = new javax.swing.JPanel();
        lblPuntoA = new javax.swing.JLabel();
        lblPuntoB = new javax.swing.JLabel();
        lblPuntoC = new javax.swing.JLabel();
        lblPuntoD = new javax.swing.JLabel();
        txtPuntoA = new javax.swing.JTextField();
        txtPuntoB = new javax.swing.JTextField();
        txtPuntoC = new javax.swing.JTextField();
        txtPuntoD = new javax.swing.JTextField();
        btnGraficar = new javax.swing.JButton();
        pnlFigura = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        lblMostrarNombre = new javax.swing.JLabel();
        lblMostrarArea = new javax.swing.JLabel();
        lblMostrarPerimetro = new javax.swing.JLabel();
        pnlVectorTranslacion = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtVectorTranslacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblMostrarNpA = new javax.swing.JLabel();
        lblMostrarNpC = new javax.swing.JLabel();
        lblMostrarNpB = new javax.swing.JLabel();
        lblMostrarNpD = new javax.swing.JLabel();
        btnTranslacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblContEquila = new javax.swing.JLabel();
        lblContEsca = new javax.swing.JLabel();
        lblContIsose = new javax.swing.JLabel();
        lblContCuadra = new javax.swing.JLabel();
        lblContRect = new javax.swing.JLabel();
        lblContRombo = new javax.swing.JLabel();
        lblContRomboi = new javax.swing.JLabel();
        lblContTrapecio = new javax.swing.JLabel();
        lblContTrapez = new javax.swing.JLabel();
        btnIngresarOtroPunto = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPlano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlPlano.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout pnlPlanoLayout = new javax.swing.GroupLayout(pnlPlano);
        pnlPlano.setLayout(pnlPlanoLayout);
        pnlPlanoLayout.setHorizontalGroup(
            pnlPlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        pnlPlanoLayout.setVerticalGroup(
            pnlPlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        pnlSelecPuntos.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad Puntos"));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        opCantPuntos.add(rbCuatro);
        rbCuatro.setText("Cuatro");

        opCantPuntos.add(rbTres);
        rbTres.setSelected(true);
        rbTres.setText("Tres");

        lbl1.setText("Seleccione Cuantos Puntos Desea Ingresar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSelecPuntosLayout = new javax.swing.GroupLayout(pnlSelecPuntos);
        pnlSelecPuntos.setLayout(pnlSelecPuntosLayout);
        pnlSelecPuntosLayout.setHorizontalGroup(
            pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecPuntosLayout.createSequentialGroup()
                .addGroup(pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSelecPuntosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSelecPuntosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerar)
                            .addComponent(rbTres))
                        .addGap(28, 28, 28)
                        .addGroup(pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbCuatro)
                            .addComponent(btnCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSelecPuntosLayout.setVerticalGroup(
            pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelecPuntosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addGroup(pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCuatro)
                    .addComponent(rbTres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlSelecPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pnlPuntos.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntos"));

        lblPuntoA.setText("Punto A :");

        lblPuntoB.setText("Punto B:");

        lblPuntoC.setText("Punto C:");

        lblPuntoD.setText("Punto D:");

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPuntosLayout = new javax.swing.GroupLayout(pnlPuntos);
        pnlPuntos.setLayout(pnlPuntosLayout);
        pnlPuntosLayout.setHorizontalGroup(
            pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPuntosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPuntosLayout.createSequentialGroup()
                        .addGroup(pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPuntoA)
                            .addComponent(lblPuntoC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPuntoA)
                            .addComponent(txtPuntoC, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPuntosLayout.createSequentialGroup()
                                .addComponent(lblPuntoD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPuntoD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPuntosLayout.createSequentialGroup()
                                .addComponent(lblPuntoB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlPuntosLayout.createSequentialGroup()
                        .addComponent(btnGraficar)
                        .addGap(60, 60, 60)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPuntosLayout.setVerticalGroup(
            pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPuntosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntoA)
                    .addComponent(lblPuntoB)
                    .addComponent(txtPuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntoC)
                    .addComponent(lblPuntoD)
                    .addComponent(txtPuntoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGraficar))
        );

        pnlFigura.setBorder(javax.swing.BorderFactory.createTitledBorder("Figura"));

        jLabel5.setText("Nombre :");

        jLabel6.setText("Area :");

        jlabel7.setText("Perimetro :");

        javax.swing.GroupLayout pnlFiguraLayout = new javax.swing.GroupLayout(pnlFigura);
        pnlFigura.setLayout(pnlFiguraLayout);
        pnlFiguraLayout.setHorizontalGroup(
            pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiguraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jlabel7))
                .addGap(40, 40, 40)
                .addGroup(pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMostrarPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFiguraLayout.setVerticalGroup(
            pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiguraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMostrarArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlFiguraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiguraLayout.createSequentialGroup()
                        .addComponent(jlabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMostrarPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlVectorTranslacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Vector Traslacion"));

        jLabel7.setText("Vector Translacion :");

        jLabel8.setText("Punto A :");

        jLabel9.setText("Punto B:");

        jLabel10.setText("Punto C:");

        jLabel11.setText("Punto D:");

        btnTranslacion.setText("Ingresar Vector");
        btnTranslacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVectorTranslacionLayout = new javax.swing.GroupLayout(pnlVectorTranslacion);
        pnlVectorTranslacion.setLayout(pnlVectorTranslacionLayout);
        pnlVectorTranslacionLayout.setHorizontalGroup(
            pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVectorTranslacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                        .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTranslacion)
                            .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                                .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMostrarNpA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMostrarNpC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMostrarNpB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblMostrarNpD, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlVectorTranslacionLayout.setVerticalGroup(
            pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVectorTranslacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                        .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMostrarNpA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMostrarNpC, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlVectorTranslacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))))
                    .addGroup(pnlVectorTranslacionLayout.createSequentialGroup()
                        .addComponent(lblMostrarNpB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMostrarNpD, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnTranslacion)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));

        jLabel12.setText("T. Equilatero :");

        jLabel13.setText("T. Isoseles :");

        jLabel14.setText("T. Escaleno :");

        jLabel15.setText("Cuadrado :");

        jLabel16.setText("Rectangulo :");

        jLabel17.setText("Rombo :");

        jLabel18.setText("Romboide :");

        jLabel19.setText("Trapecio :");

        jLabel20.setText("Trapezoide :");

        lblContEquila.setText("0");
        lblContEquila.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContEsca.setText("0");
        lblContEsca.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContIsose.setText("0");
        lblContIsose.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContCuadra.setText("0");
        lblContCuadra.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContRect.setText("0");
        lblContRect.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContRombo.setText("0");
        lblContRombo.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContRomboi.setText("0");
        lblContRomboi.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContTrapecio.setText("0");
        lblContTrapecio.setPreferredSize(new java.awt.Dimension(15, 15));

        lblContTrapez.setText("0");
        lblContTrapez.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20))))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContEsca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContRect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContEquila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContRomboi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblContIsose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel17))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblContCuadra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblContRombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(29, 29, 29)
                                .addComponent(lblContTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblContTrapez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(lblContEquila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContIsose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(lblContEsca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContCuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(lblContRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContRombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(lblContRomboi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContTrapecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblContTrapez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnIngresarOtroPunto.setText("Ingresar Otro Punto");
        btnIngresarOtroPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarOtroPuntoActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 0, 51));
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Figura Original");

        jLabel2.setText("Figura Trasladada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPuntos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSelecPuntos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFigura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresarOtroPunto)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlVectorTranslacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSelecPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlVectorTranslacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pnlPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnIngresarOtroPunto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        try {
            // genera el plano cartesiano
            Graphics g = pnlPlano.getGraphics();
            g.drawLine(0, pnlPlano.getHeight() / 2, pnlPlano.getWidth(), pnlPlano.getHeight() / 2);
            g.drawLine(pnlPlano.getWidth() / 2, 0, pnlPlano.getWidth() / 2, pnlPlano.getHeight());

            String[] coo;

            Coordenada coor = new Coordenada();
            Punto punto = new Punto();
            ArrayList<Coordenada> listCoordenadas = new ArrayList();

            // si la cantidad de coordenadas es igual a 3
            // rescatamos los datos correspondientes
            if (cantCoordenadas == 3) {
                // rescato el punto
                String pA = txtPuntoA.getText();
                // obtengo x e y 
                coo = pA.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(1, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                String pB = txtPuntoB.getText();
                // obtengo x e y 
                coo = pB.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(2, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                String pC = txtPuntoC.getText();
                // obtengo x e y 
                coo = pC.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(3, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                for (Coordenada c : listCoordenadas) {
                    if (c.getX() > -10 && c.getY() > -10 && c.getX() < 10 && c.getY() < 10) {
                        graficarPunto(pnlPlano.getGraphics(), (c.getX() * 10), (c.getY() * 10));
                    } else {
                        graficarPunto(pnlPlano.getGraphics(), c.getX(), c.getY());
                    }
                }

                for (Coordenada c : listCoordenadas) {
                    if (c.getId() == 1) {
                        System.out.println("x1 " + c.getX());
                        System.out.println("y1 " + c.getY());
                        x1 = c.getX();
                        y1 = c.getY();
                    }
                    if (c.getId() == 2) {
                        x2 = c.getX();
                        y2 = c.getY();
                    }
                    if (c.getId() == 3) {
                        x3 = c.getX();
                        y3 = c.getY();
                    }
                }

                // une los puntos para generar la figura
                if (x1 < 10 && x2 < 10 && x3 < 10 && y1 < 10 && y2 < 10 && y3 < 10
                        && x1 > -10 && x2 > -10 && x3 > -10 && y1 > -10 && y2 > -10 && y3 > -10) {
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1 * 10,/*y1*/ y1 * 10,/*x2*/ x2 * 10,/*y2*/ y2 * 10);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x2 * 10,/*y1*/ y2 * 10,/*x2*/ x3 * 10,/*y2*/ y3 * 10);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1 * 10,/*y1*/ y1 * 10,/*x2*/ x3 * 10,/*y2*/ y3 * 10);
                } else {
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1,/*y1*/ y1,/*x2*/ x2,/*y2*/ y2);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x2,/*y1*/ y2,/*x2*/ x3,/*y2*/ y3);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1,/*y1*/ y1,/*x2*/ x3,/*y2*/ y3);
                }

//            
                punto = new Punto(x1, x2, y1, y2);
                float distAB = data.calcularDistancia(punto);
                System.out.println("Distancia AB : " + distAB);

                punto = new Punto(x2, x3, y2, y3);
                float distBC = data.calcularDistancia(punto);
                System.out.println("Distancia BC : " + distBC);

                punto = new Punto(x1, x3, y1, y3);
                float distAC = data.calcularDistancia(punto);
                System.out.println("Distancia AC : " + distAC);

                String tipo = data.identificarTipoTriangulo(distAB, distBC, distAC);
                lblMostrarNombre.setText(tipo);
                float perimetro = data.getPerimetroTriangulo(distAB, distBC, distAC);
                lblMostrarPerimetro.setText(Integer.toString((int) perimetro));
                float area = data.getAreaTringulo(tipo, perimetro, distAB, distBC, distAC);
                lblMostrarArea.setText(Integer.toString((int) area));

                txtPuntoA.setText(null);
                txtPuntoB.setText(null);
                txtPuntoC.setText(null);

                txtPuntoA.setEnabled(false);
                txtPuntoB.setEnabled(false);
                txtPuntoC.setEnabled(false);

                btnGraficar.setEnabled(false);

                txtVectorTranslacion.setEnabled(true);
                btnTranslacion.setEnabled(true);

                actualizarEstadisticas(tipo);

                // si la cantidad de coordenadas es igual a 4
                // rescatamos los datos correspondientes    
            } else if (cantCoordenadas == 4) {
                // rescato el punto
                String pA = txtPuntoA.getText();
                // obtengo x e y 
                coo = pA.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(1, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                // rescato el punto
                String pB = txtPuntoB.getText();
                // obtengo x e y 
                coo = pB.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(2, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                // rescato el punto
                String pC = txtPuntoC.getText();
                // obtengo x e y 
                coo = pC.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(3, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                // rescato el punto
                String pD = txtPuntoD.getText();
                // obtengo x e y 
                coo = pD.split(",");
                // construyo una nueva coordenada
                coor = new Coordenada(4, Integer.parseInt(coo[0]), Integer.parseInt(coo[1]));
                // agrego a la lista de coordenadas
                listCoordenadas.add(coor);

                for (Coordenada c : listCoordenadas) {
                    if (c.getX() > -10 && c.getY() > -10 && c.getX() < 10 && c.getY() < 10) {
                        graficarPunto(pnlPlano.getGraphics(), (c.getX() * 10), (c.getY() * 10));
                    } else {
                        graficarPunto(pnlPlano.getGraphics(), c.getX(), c.getY());
                    }
                }

                for (Coordenada c : listCoordenadas) {
                    if (c.getId() == 1) {
                        x1 = c.getX();
                        y1 = c.getY();
                    }
                    if (c.getId() == 2) {
                        x2 = c.getX();
                        y2 = c.getY();
                    }
                    if (c.getId() == 3) {
                        x3 = c.getX();
                        y3 = c.getY();
                    }
                    if (c.getId() == 4) {
                        x4 = c.getX();
                        y4 = c.getY();
                    }
                }

                // une los puntos para generar la figura
                if (x1 < 10 && x2 < 10 && x3 < 10 && y1 < 10 && y2 < 10 && y3 < 10 && x4 < 10 && y4 < 10
                        && x1 > -10 && x2 > -10 && x3 > -10 && y1 > -10 && y2 > -10 && y3 > -10 && x4 > -10 && y4 > -10) {
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1 * 10,/*y1*/ y1 * 10,/*x2*/ x2 * 10,/*y2*/ y2 * 10);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x2 * 10,/*y1*/ y2 * 10,/*x2*/ x3 * 10,/*y2*/ y3 * 10);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x3 * 10,/*y1*/ y3 * 10,/*x2*/ x4 * 10,/*y2*/ y4 * 10);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1 * 10,/*y1*/ y1 * 10,/*x2*/ x4 * 10,/*y2*/ y4 * 10);
                } else {
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1,/*y1*/ y1,/*x2*/ x2,/*y2*/ y2);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x2,/*y1*/ y2,/*x2*/ x3,/*y2*/ y3);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x3,/*y1*/ y3,/*x2*/ x4,/*y2*/ y4);
                    graficarVector(pnlPlano.getGraphics(),/*x*/ x1,/*y1*/ y1,/*x2*/ x4,/*y2*/ y4);
                }

                punto = new Punto(x1, x2, y1, y2);
                float distAB = data.calcularDistancia(punto);
                System.out.println("Distancia AB : " + distAB);

                punto = new Punto(x2, x3, y2, y3);
                float distBC = data.calcularDistancia(punto);
                System.out.println("Distancia BC : " + distBC);

                punto = new Punto(x3, x4, y3, y4);
                float distCD = data.calcularDistancia(punto);
                System.out.println("Distancia CD : " + distCD);

                punto = new Punto(x1, x4, y1, y4);
                float distAD = data.calcularDistancia(punto);
                System.out.println("Distancia AD : " + distAD);

                Coordenada coo1 = new Coordenada(x1, y1);
                Coordenada coo2 = new Coordenada(x2, y2);
                Coordenada coo3 = new Coordenada(x3, y3);
                Coordenada coo4 = new Coordenada(x4, y4);

                String tipo = data.identificarTipoPoligono(distAB, distBC, distCD, distAD, coo1, coo2, coo3, coo4);
                lblMostrarNombre.setText(tipo);

                float perimetro = data.getPerimetroPoligono(distAB, distBC, distCD, distAD);
                lblMostrarPerimetro.setText(Integer.toString((int) perimetro));

                float area = data.getAreaPoligono(tipo, distAB, distBC, distCD, distAD, coo1, coo2, coo3, coo4);
                lblMostrarArea.setText(Integer.toString((int) area));

                txtPuntoA.setText(null);
                txtPuntoB.setText(null);
                txtPuntoC.setText(null);
                txtPuntoD.setText(null);

                txtPuntoA.setEnabled(false);
                txtPuntoB.setEnabled(false);
                txtPuntoC.setEnabled(false);
                txtPuntoD.setEnabled(false);

                btnGraficar.setEnabled(false);

                txtVectorTranslacion.setEnabled(true);
                btnTranslacion.setEnabled(true);

                actualizarEstadisticas(tipo);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Ingrese Solo Números");

            txtPuntoA.setText(null);
            txtPuntoB.setText(null);
            txtPuntoC.setText(null);
            txtPuntoD.setText(null);
            
            txtPuntoA.requestFocus();
        }
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (rbTres.isSelected()) {
            cantCoordenadas = 3;
        } else if (rbCuatro.isSelected()) {
            cantCoordenadas = 4;
        }

        if (cantCoordenadas == 3) {
            txtPuntoA.setEnabled(true);
            txtPuntoB.setEnabled(true);
            txtPuntoC.setEnabled(true);

            btnGraficar.setEnabled(true);

            btnGenerar.setEnabled(false);
        } else {
            txtPuntoA.setEnabled(true);
            txtPuntoB.setEnabled(true);
            txtPuntoC.setEnabled(true);
            txtPuntoD.setEnabled(true);

            btnGraficar.setEnabled(true);
            btnGenerar.setEnabled(false);
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        init();
        btnGenerar.setEnabled(true);

        Graphics g = pnlPlano.getGraphics();
        g.clearRect(0, 0, pnlPlano.getWidth(), pnlPlano.getHeight());
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarOtroPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarOtroPuntoActionPerformed
        Graphics g = pnlPlano.getGraphics();
        g.clearRect(0, 0, pnlPlano.getWidth(), pnlPlano.getHeight());

        lblMostrarNombre.setText(null);
        lblMostrarArea.setText(null);
        lblMostrarPerimetro.setText(null);

        lblMostrarNpA.setText(null);
        lblMostrarNpB.setText(null);
        lblMostrarNpC.setText(null);
        lblMostrarNpD.setText(null);

        btnGenerar.setEnabled(true);
    }//GEN-LAST:event_btnIngresarOtroPuntoActionPerformed

    private void btnTranslacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslacionActionPerformed
        try {
            Graphics g = pnlPlano.getGraphics();

            g.setColor(Color.red);

            String[] vect;
            String vector = txtVectorTranslacion.getText();
            vect = vector.split(",");

            int nX1 = 0, nX2 = 0, nX3 = 0, nX4 = 0;
            int nY1 = 0, nY2 = 0, nY3 = 0, nY4 = 0;

            int x = Integer.parseInt(vect[0]);
            int y = Integer.parseInt(vect[1]);

            // a(punto original) + v(vectorTranslacion) = nuevo punto
            if (cantCoordenadas == 3) {
                if (x1 < 10 && x2 < 10 && x3 < 10 && y1 < 10 && y2 < 10 && y3 < 10 && x4 < 10 && y4 < 10
                        && x1 > -10 && x2 > -10 && x3 > -10 && y1 > -10 && y2 > -10 && y3 > -10 && x4 > -10 && y4 > -10) {

                    nX1 = ((x1 * 10) + (x));
                    nY1 = ((y1 * 10) + (y));
                    lblMostrarNpA.setText("(" + nX1 + "," + nY1 + ")");
                    graficarPunto(g, nX1, nY1); // grafico el nuevo punto del vector

                    nX2 = ((x2 * 10) + (x));
                    nY2 = ((y2 * 10) + (y));
                    lblMostrarNpB.setText("(" + nX2 + "," + nY2 + ")");
                    graficarPunto(g, nX2, nY2); // grafico el nuevo punto del vector

                    nX3 = ((x3 * 10) + (x));
                    nY3 = ((y3 * 10) + (y));
                    lblMostrarNpC.setText("(" + nX3 + "," + nY3 + ")");
                    graficarPunto(g, nX3, nY3); // grafico el nuevo punto del vector

                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX2,/*y2*/ nY2);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX2,/*y1*/ nY2,/*x2*/ nX3,/*y2*/ nY3);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX3,/*y2*/ nY3);

                    txtVectorTranslacion.setEnabled(false);
                    txtVectorTranslacion.setText(null);
                    btnTranslacion.setEnabled(false);

                    btnIngresarOtroPunto.setEnabled(true);
                } else {
                    nX1 = (x1 + (x));
                    nY1 = (y1 + (y));
                    lblMostrarNpA.setText("(" + nX1 + "," + nY1 + ")");
                    graficarPunto(g, nX1, nY1); // grafico el nuevo punto del vector

                    nX2 = (x2 + (x));
                    nY2 = (y2 + (y));
                    lblMostrarNpB.setText("(" + nX2 + "," + nY2 + ")");
                    graficarPunto(g, nX2, nY2); // grafico el nuevo punto del vector

                    nX3 = (x3 + (x));
                    nY3 = (y3 + (y));
                    lblMostrarNpC.setText("(" + nX3 + "," + nY3 + ")");
                    graficarPunto(g, nX3, nY3); // grafico el nuevo punto del vector

                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX2,/*y2*/ nY2);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX2,/*y1*/ nY2,/*x2*/ nX3,/*y2*/ nY3);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX3,/*y2*/ nY3);

                    txtVectorTranslacion.setEnabled(false);
                    txtVectorTranslacion.setText(null);
                    btnTranslacion.setEnabled(false);

                    btnIngresarOtroPunto.setEnabled(true);
                }

            } else if (cantCoordenadas == 4) {

                if (x1 < 10 && x2 < 10 && x3 < 10 && y1 < 10 && y2 < 10 && y3 < 10 && x4 < 10 && y4 < 10
                        && x1 > -10 && x2 > -10 && x3 > -10 && y1 > -10 && y2 > -10 && y3 > -10 && x4 > -10 && y4 > -10) {

                    nX1 = ((x1 * 10) + (x));
                    nY1 = ((y1 * 10) + (y));
                    lblMostrarNpA.setText("(" + nX1 + "," + nY1 + ")");
                    graficarPunto(g, nX1, nY1); // grafico el nuevo punto del vector

                    nX2 = ((x2 * 10) + (x));
                    nY2 = ((y2 * 10) + (y));
                    lblMostrarNpB.setText("(" + nX2 + "," + nY2 + ")");
                    graficarPunto(g, nX2, nY2); // grafico el nuevo punto del vector

                    nX3 = ((x3 * 10) + (x));
                    nY3 = ((y3 * 10) + (y));
                    lblMostrarNpC.setText("(" + nX3 + "," + nY3 + ")");
                    graficarPunto(g, nX3, nY3); // grafico el nuevo punto del vector

                    nX4 = ((x4 * 10) + (x));
                    nY4 = ((y4 * 10) + (y));
                    lblMostrarNpD.setText("(" + nX4 + "," + nY4 + ")");
                    graficarPunto(g, nX4, nY4); // grafico el nuevo punto del vector

                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX2,/*y2*/ nY2);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX2,/*y1*/ nY2,/*x2*/ nX3,/*y2*/ nY3);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX3,/*y1*/ nY3,/*x2*/ nX4,/*y2*/ nY4);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX4,/*y2*/ nY4);

                    txtVectorTranslacion.setEnabled(false);
                    txtVectorTranslacion.setText(null);
                    btnTranslacion.setEnabled(false);

                    btnIngresarOtroPunto.setEnabled(true);

                } else {
                    nX1 = (x1 + (x));
                    nY1 = (y1 + (y));
                    lblMostrarNpA.setText("(" + nX1 + "," + nY1 + ")");
                    graficarPunto(g, nX1, nY1); // grafico el nuevo punto del vector

                    nX2 = (x2 + (x));
                    nY2 = (y2 + (y));
                    lblMostrarNpB.setText("(" + nX2 + "," + nY2 + ")");
                    graficarPunto(g, nX2, nY2); // grafico el nuevo punto del vector

                    nX3 = (x3 + (x));
                    nY3 = (y3 + (y));
                    lblMostrarNpC.setText("(" + nX3 + "," + nY3 + ")");
                    graficarPunto(g, nX3, nY3); // grafico el nuevo punto del vector

                    nX4 = (x4 + (x));
                    nY4 = (y4 + (y));
                    lblMostrarNpD.setText("(" + nX4 + "," + nY4 + ")");
                    graficarPunto(g, nX4, nY4); // grafico el nuevo punto del vector

                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX2,/*y2*/ nY2);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX2,/*y1*/ nY2,/*x2*/ nX3,/*y2*/ nY3);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX3,/*y1*/ nY3,/*x2*/ nX4,/*y2*/ nY4);
                    graficarVectorTranslacion(pnlPlano.getGraphics(),/*x*/ nX1,/*y1*/ nY1,/*x2*/ nX4,/*y2*/ nY4);

                    txtVectorTranslacion.setEnabled(false);
                    txtVectorTranslacion.setText(null);
                    btnTranslacion.setEnabled(false);

                    btnIngresarOtroPunto.setEnabled(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese Solo Números");
            
            txtVectorTranslacion.setText(null);
            txtVectorTranslacion.requestFocus();
        }


    }//GEN-LAST:event_btnTranslacionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnIngresarOtroPunto;
    private javax.swing.JButton btnTranslacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblContCuadra;
    private javax.swing.JLabel lblContEquila;
    private javax.swing.JLabel lblContEsca;
    private javax.swing.JLabel lblContIsose;
    private javax.swing.JLabel lblContRect;
    private javax.swing.JLabel lblContRombo;
    private javax.swing.JLabel lblContRomboi;
    private javax.swing.JLabel lblContTrapecio;
    private javax.swing.JLabel lblContTrapez;
    private javax.swing.JLabel lblMostrarArea;
    private javax.swing.JLabel lblMostrarNombre;
    private javax.swing.JLabel lblMostrarNpA;
    private javax.swing.JLabel lblMostrarNpB;
    private javax.swing.JLabel lblMostrarNpC;
    private javax.swing.JLabel lblMostrarNpD;
    private javax.swing.JLabel lblMostrarPerimetro;
    private javax.swing.JLabel lblPuntoA;
    private javax.swing.JLabel lblPuntoB;
    private javax.swing.JLabel lblPuntoC;
    private javax.swing.JLabel lblPuntoD;
    private javax.swing.ButtonGroup opCantPuntos;
    private javax.swing.JPanel pnlFigura;
    public javax.swing.JPanel pnlPlano;
    private javax.swing.JPanel pnlPuntos;
    private javax.swing.JPanel pnlSelecPuntos;
    private javax.swing.JPanel pnlVectorTranslacion;
    private javax.swing.JRadioButton rbCuatro;
    private javax.swing.JRadioButton rbTres;
    private javax.swing.JTextField txtPuntoA;
    private javax.swing.JTextField txtPuntoB;
    private javax.swing.JTextField txtPuntoC;
    private javax.swing.JTextField txtPuntoD;
    private javax.swing.JTextField txtVectorTranslacion;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        // desactivo algunas cosas        
        txtPuntoA.setEnabled(false);
        txtPuntoB.setEnabled(false);
        txtPuntoC.setEnabled(false);
        txtPuntoD.setEnabled(false);

        btnGraficar.setEnabled(false);

        txtVectorTranslacion.setEnabled(false);

        btnTranslacion.setEnabled(false);
        btnIngresarOtroPunto.setEnabled(false);
    }

    private void graficarPunto(Graphics g, int x1, int y1) {
        g.drawRect(coord_x(x1), coord_y(y1), 2, 2);
    }

    public void graficarVector(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(coord_x(x1), coord_y(y1), coord_x(x2), coord_y(y2));
    }

    public void graficarVectorTranslacion(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.red);
        g.drawLine(coord_x(x1), coord_y(y1), coord_x(x2), coord_y(y2));
    }

    private int coord_x(int x) {
        int real_x = x + pnlPlano.getWidth() / 2;
        return real_x;
    }

    private int coord_y(int y) {
        int real_y = -y + pnlPlano.getHeight() / 2;

        return (real_y);
    }

    private void actualizarEstadisticas(String nombreFigura) {
        if (nombreFigura.equalsIgnoreCase("Triangulo Equilatero")) {
            contEqui = contEqui + 1;
            lblContEquila.setText(Integer.toString(contEqui));
        }

        if (nombreFigura.equalsIgnoreCase("Triangulo Escaleno")) {
            contEsca = contEsca + 1;
            lblContEsca.setText(Integer.toString(contEsca));
        }

        if (nombreFigura.equalsIgnoreCase("Triangulo Isoseles")) {
            contIsose = contIsose + 1;
            lblContIsose.setText(Integer.toString(contIsose));
        }

        if (nombreFigura.equalsIgnoreCase("Cuadrado")) {
            contCuad = contCuad + 1;
            lblContCuadra.setText(Integer.toString(contCuad));
        }

        if (nombreFigura.equalsIgnoreCase("Rectangulo")) {
            contRect = contRect + 1;
            lblContRect.setText(Integer.toString(contRect));
        }

        if (nombreFigura.equalsIgnoreCase("Rombo")) {
            contRombo = contRombo + 1;
            lblContRombo.setText(Integer.toString(contRombo));
        }

        if (nombreFigura.equalsIgnoreCase("Romboide")) {
            contRomboi = contRomboi + 1;
            lblContRomboi.setText(Integer.toString(contRomboi));
        }

        if (nombreFigura.equalsIgnoreCase("Trapecio")) {
            contTrapecio = contTrapecio + 1;
            lblContTrapecio.setText(Integer.toString(contTrapecio));
        }

        if (nombreFigura.equalsIgnoreCase("Trapezoide")) {
            contTrapezoide = contTrapezoide + 1;
            lblContTrapez.setText(Integer.toString(contTrapezoide));
        }
    }

}
