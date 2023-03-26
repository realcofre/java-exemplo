public class Triangulo { //Classe de um determinado domínio

    //Atributos ou propriedades
    private double a;
    private double b;
    private double c;
    private double area;

    //Método construtor "default"
    // Tringulo trianguloX = new Tringulo();
    // tringuloX.a = 0 ou null;
    // tringuloX.b = 0 ou null;
    // tringuloX.c = 0 ou null;
    public Triangulo() {}

    // Tringaulo tringauloY = new Triangulo(2.5, 4.5, 7.8);
    // tringuloY.a = 2.5 ou null;
    // tringuloY.b = 4.5 ou null;
    // tringuloY.c = 7.8 ou null;
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Metodos de acesso [SET/GET]
    //SET é usado para atribuir valores aos atributos
    //GET é usado pare recuperar valores dos atributos

    //"public" indica a visibilidade do método
    //"void" indica o tipo de retorno (não retorna nada ou retorna vazio)
    //nome do método setA
    //lista de argumentos
    // meuTriangulo.setA(2.4); Atribuindo um valor ao atributo a do objeto
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getArea() {
        return area;
    }

    public double calcularArea(){
        double p = (a + b + c) / 2.0;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }


}
