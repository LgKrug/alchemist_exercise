public class main {
    public static void main(String args[]) {

// 10 hidrogenio -> 1 iterbio
// 1 hidrogenio -> 1 praseodimio
// 2 hidrogenio -> 1 cromo
// 8 hidrogenio -> 1 protactinio
// 3 hidrogenio -> 1 cadmio
// 6 hidrogenio -> 1 europio
// 7 hidrogenio -> 1 cesio
// 10 hidrogenio -> 1 itrio
// 1 hidrogenio -> 1 erbio
// 3 iterbio 3 itrio -> 1 promecio
// 4 cromo 3 praseodimio -> 1 zinco
// 8 cadmio 6 netunio -> 1 paladio
// 3 europio 3 protactinio -> 1 selenio
// 5 cesio 2 erbio -> 1 netunio
// 8 promecio 9 paladio -> 1 zinco
// 6 zinco 1 selenio -> 1 ouro

        Elemento hidrogenio = new Elemento("Hidrogenio");
        Elemento iterbio = new Elemento("Iterbio", hidrogenio, 10);
        Elemento praseodimio = new Elemento("Praseodimio", hidrogenio, 1);
        Elemento cromo = new Elemento("Cromo", hidrogenio, 2);
        Elemento protactinio = new Elemento("protactinio", hidrogenio, 8);
        Elemento cadmio = new Elemento("Cadmio", hidrogenio, 3);
        Elemento europio = new Elemento("Europio", hidrogenio, 6);
        Elemento cesio = new Elemento("Cesio", hidrogenio, 7);
        Elemento itrio = new Elemento("Itrio", hidrogenio, 10);
        Elemento erbio = new Elemento("Erbio", hidrogenio, 1);
        Elemento promecio = new Elemento("Promecio", iterbio, 3, itrio, 3);
        Elemento netunio = new Elemento("Netunio", cesio, 5, erbio, 2);
        Elemento paladio = new Elemento("Paladio", cadmio, 8, netunio, 6);
        Elemento zinco = new Elemento("Zinco", cromo, 4, praseodimio, 3);
        Elemento zinco2 = new Elemento("Zinco", promecio, 8, paladio, 9);
        Elemento selenio = new Elemento("Selenio", europio, 3, protactinio, 3);
        Elemento ouro = new Elemento("Ouro", zinco, 6, selenio, 1);

        Elemento teste = itrio;
        calcularHidrogenio(teste);
        System.out.println("Quantidade de hidrogenio: " + teste.getQuantidadeHidrogenio());

        // calcularHidrogenio(ouro);
        // System.out.println("Quantidade de hidrogenio: " + calcularHidrogenio(ouro));

    }

    public static int calcularHidrogenio(Elemento elemento) {

        if(!elemento.getNome().equals("Hidrogenio") && elemento.getQuantidadeHidrogenio() != 0) {
            return elemento.getQuantidadeHidrogenio();
        }
        
        if(elemento.getNome().equals("Hidrogenio")) {
            return 1;
        }

        if(elemento.getElemento2() == null) {
            elemento.setQuantidadeHidrogenio(calcularHidrogenio(elemento.getElemento1()) * elemento.getQuantidade1());
            return elemento.getQuantidadeHidrogenio();
        }
        else {
            elemento.setQuantidadeHidrogenio(calcularHidrogenio(elemento.getElemento1()) * elemento.getQuantidade1() + calcularHidrogenio(elemento.getElemento2()) * elemento.getQuantidade2());
        return elemento.getQuantidadeHidrogenio();
        }
        
    }
}
