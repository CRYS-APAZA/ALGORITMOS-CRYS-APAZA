public class Principal {
    public static void main(String[] args) {
        // Bolsa de Chocolatinas
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(5);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        // Mostrar el contenido de la bolsa de chocolatinas
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        // Bolsa de Golosinas
        Bolsa<Golosina> bolsaGolosina = new Bolsa<>(5);
        Golosina g1 = new Golosina("Chicles", 10);
        Golosina g2 = new Golosina("Paletas", 20);
        Golosina g3 = new Golosina("Chocolate", 30);
        bolsaGolosina.add(g1);
        bolsaGolosina.add(g2);
        bolsaGolosina.add(g3);

        // Mostrar el contenido de la bolsa de golosinas
        for (Golosina golosina : bolsaGolosina) {
            System.out.println("Nombre: " + golosina.getNombre() + ", Peso: " + golosina.getPeso());
        }

        // Uso del método genérico encontrarIndice
        String[] nombres = {"Luis", "Ana", "Carlos", "Marta"};
        int indice = encontrarIndice(nombres, "Carlos");
        System.out.println("El índice de Carlos es: " + indice);
    }

    // Método genérico para encontrar el índice de un elemento en un arreglo
    public static <T> int encontrarIndice(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
