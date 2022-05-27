package primerParcial.ejercicio4;

public class Estudiante {
        private String name;
        private int ci;

        public Estudiante(){}

        public Estudiante(String name,int ci){
            this.name=name;
            this.ci=ci;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCi() {
            return ci;
        }

        public void setCi(int ci) {
            this.ci = ci;
        }
}
