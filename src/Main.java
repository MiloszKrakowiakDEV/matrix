// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        int suma = 0;
        int zmienna = 0;
        int matryca[][] = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                if (j == i || j + i == 9){
                    matryca[i][j] = 1;
                    suma += matryca[i][j];
                }
                else {
                    matryca[i][j] = 0;
                }
                System.out.print(matryca[i][j]);
                zmienna++;

            }
            if (zmienna == 10) {
                System.out.println(" ");
                zmienna = 0;
            }
        }
        System.out.println("Suma liczb na przekątnych to " + suma);
    }
}