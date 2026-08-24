package TrabalhoLampada

public class Lampada {

/*
* Variáveis da classe
* A variável ligada guarda se a lâmpada está acesa ou apagada
* A variável watts armazena a potência da lâmpada
*/
private boolean ligada;
private int watts;

/*
* Construtor com dois parâmetros
* O construtor permite criar a lâmpada informando tanto o estado inicial quanto a potência em watts
*/
public Lampada(boolean estadoInicial, int wattsLampada) {
ligada = estadoInicial;
watts = wattsLampada;
}

/*
* Recebe apenas o estado atual e define 60 wats como parametro
*/
public Lampada(boolean estadoInicial) {
ligada = estadoInicial;
watts = 60;
}

/*
* Método interruptor, autoexplicativo
*/
public void interruptor() {

ligada = !ligada;

if (ligada) {
System.out.println("A lâmpada está acesa.");
} else {
System.out.println("A lâmpada está apagada.");
}
}

/*
* Diz se a variavel esta "ligada", mostrando se a lampada ta acesa ou apagada
*/
public void mostrarEstado() {

if (ligada) {
System.out.println("A lâmpada está acesa.");
} else {
System.out.println("A lâmpada está apagada.");
}
}

/*
* Exibe a potência da lâmpada.
* Mostra a quantidade de watts armazenada no atributo watts da classe.
*/
public void mostrarWatts() {
System.out.println("Potência: " + watts + "W");
}

/*
* Principal, cria objetos da classe e os executa para ver se o programa roda
*/
public static void main(String[] args) {

Lampada l1 = new Lampada(true, 100);
Lampada l2 = new Lampada(false);

System.out.println("Lâmpada 1:");
l1.mostrarEstado();
l1.mostrarWatts();

System.out.println();

System.out.println("Lâmpada 2:");
l2.mostrarEstado();
l2.mostrarWatts();

System.out.println();

l1.interruptor();
l2.interruptor();
}
}