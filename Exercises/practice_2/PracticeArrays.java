package practice_2;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PracticeArrays {




    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ex5();

    }

    private static void ex1() {


        JTextArea textBox = new JTextArea(2,2);

        float a = Float.parseFloat(JOptionPane.showInputDialog("Inrese a: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Inrese b: "));

        float x;

        float y;


        for(int i=0; i<10; i++) {

            x = (float) (Math.random()*i);

            y = a*x + b;

            String pair = x+","+y;

            //String pair = String.format("%.2f, %.2f \n", x,y);

            textBox.append(pair);
        }

        JOptionPane.showMessageDialog(null, textBox);


    }


    private static void ex2() {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Inrese a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Inrese b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Inrese c: "));


        double discriminante = Math.pow(b, 2)-4*a*c;

        if(discriminante<0) {
            JOptionPane.showMessageDialog(null, "No tiene solucion");

        }else if(discriminante>0) {

            double x1 = (-b+Math.sqrt(discriminante))/(2*a);
            double x2 = (-b-Math.sqrt(discriminante))/(2*a);

            JOptionPane.showMessageDialog(null, String.format("x1: %.2f x2: %.2f ",x1,x2));

        }else {

            double x = -b/(2*a);
            JOptionPane.showMessageDialog(null, String.format("x: %.2f",x));

        }

    }

    private static void ex3() {

        double total = 0;

        String opcionProducto;

        String[] productos = {"Pelota", "Termo", "Auto","Computadora", "Yerba"};


        while(true) {

            Object opcion = JOptionPane.showInputDialog(null, "Ingrese producto a comprar", null, JOptionPane.QUESTION_MESSAGE, null, productos, null);

            if(opcion ==null)break;

            opcionProducto = (String) opcion;

            int cant = Integer.parseInt(JOptionPane.showInputDialog("Inrese la cantidad: "));

            switch(opcionProducto) {

                case "Pelota":
                    total+=(cant*10);
                    break;

                case "Termo":
                    total+=(cant*90);

                    break;

                case "Auto":
                    total+=(cant*15);

                    break;

                case "Computadora":
                    total+=(cant*43);

                    break;

                case "Yerba":
                    total+=(cant*23);

                    break;

            }



        }


        JOptionPane.showMessageDialog(null, String.format("Total: %.2f ",total));

    }

    private static void ex4() {

        int totFem=0;
        int totMas=0;

        int[] vot = new int[6];





        int cantVot = Integer.parseInt(JOptionPane.showInputDialog("Inrese la cantidad de votantes: "));

        String[] opsSexo = {"Masculino", "Femenino"};
        Integer[] opsNum = {1,2,3,4,5};


        for(int i=0; i<cantVot;i++ ) {

            String opSexo = (String)JOptionPane.showInputDialog(null, "Ingrese sexo", null, JOptionPane.QUESTION_MESSAGE, null, opsSexo, null);

            if(opSexo.equals("Masculino")) {
                totMas++;
            }else {
                totFem++;
            }


            Object opNum = JOptionPane.showInputDialog(null, "Ingrese sexo", null, JOptionPane.QUESTION_MESSAGE, null, opsNum, null);

            if(opNum==null) {
                vot[5]++;
            }else{
                vot[(Integer)opNum-1]++;
            }

        }

        JOptionPane.showMessageDialog(null, String.format("Votos Femenino: %d \n"
                + "Votos Masculino: %d \n ",totFem, totMas));


    }

    private static void ex5() {

        List<Alumno> alumnos = new ArrayList<>();

        List<Falta> faltasAlumno = new ArrayList<>();

        String nombre = JOptionPane.showInputDialog("Inrese el nombre del alumno: ");
        String curso = JOptionPane.showInputDialog("Inrese el curso: ");
        String division = JOptionPane.showInputDialog("Inrese la division: ");

        int faltas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de faltas: "));

        for(int i=0; i<faltas; i++) {

            String justificada = JOptionPane.showInputDialog("Falta justificada? (si-no)");

            if(justificada.equals("si")) {
                faltasAlumno.add(new Falta(true));
            }else {
                faltasAlumno.add(new Falta(false));
            }

        }

        alumnos.add(new Alumno(nombre,curso,division,faltasAlumno));

        alumnos.forEach(e-> System.out.println(e.estado));

    }

    public static class Alumno{

        private String nombre;
        private String curso;
        private String division;
        private List<Falta> faltas;
        private final float averageJustifyFaults;
        private enum Estado { REGULAR, REINCORPORADO, LIBRE }
        private final Estado estado;


        public Alumno(String nombre, String curso, String division, List<Falta> faltas) {
            this.nombre = nombre;
            this.curso = curso;
            this.division = division;
            this.faltas = faltas;
            this.averageJustifyFaults = getAverageJustifyFaults();
            this.estado = obtenerEstado();
        }

        private float getAverageJustifyFaults() {


            if (faltas.isEmpty())return 0;

            return (float) faltas.stream()
                    .filter(Falta::isJustificada)
                    .count() /faltas.size();
        }

        public Estado obtenerEstado() {

            if(faltas.size()<=15) {
                return Estado.REGULAR;
            } else{
                return averageJustifyFaults > 0.3 ? Estado.REINCORPORADO:Estado.LIBRE ;
            }

        }


        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getCurso() {
            return curso;
        }
        public void setCurso(String curso) {
            this.curso = curso;
        }
        public String getDivision() {
            return division;
        }
        public void setDivision(String division) {
            this.division = division;
        }
        public List<Falta> getFaltas() {
            return faltas;
        }
        public void setFaltas(List<Falta> faltas) {
            this.faltas = faltas;
        }

        public Estado getEstado() {
            return estado;
        }
    }

    public static class Falta{

        private boolean justificada;

        public Falta(boolean justificada) {
            this.justificada = justificada;
        }

        public boolean isJustificada() {
            return justificada;
        }


        public void setJustificada(boolean justificada) {
            this.justificada = justificada;
        }


    }


}
