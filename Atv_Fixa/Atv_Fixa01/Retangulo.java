package Atv_Fixa.Atv_Fixa01;

class Retangulo {

        private double width;
        private double height;

        public Retangulo(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }

        public double perimetro() {
            return 2 * (width + height);
        }

        public double diagonal() {
            return Math.sqrt(width * width + height * height);
        }
    }