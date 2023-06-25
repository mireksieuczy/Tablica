public class TablicaProgram {
    public static void main(String[] args) {
        // Tworzenie tablicy o rozmiarze 10
        int[] tablica = new int[10];

        // Wypełnianie tablicy liczbami od 1 do 10
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1;
        }

        // Wyświetlanie liczb z tablicy
        System.out.println("Liczby w tablicy:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
