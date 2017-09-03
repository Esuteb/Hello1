import javax.swing.JOptionPane;
public class Permutador {
	//Aqui tambien estoy
	//Aquí estoy
	private static String totalPermutaciones = "";
    // print n! permutation of the characters of the string s (in order)
    //public  static void perm1(String s) { perm1("", s); }
    private static void fijador(String prefix, String suffix) {
        int n = suffix.length();
		//System.out.println(suffix.length());
        if (n == 0) {acumulador(prefix);}
        else {
            for (int i = 0; i < n; i++){
			//System.out.printf( "valor i: %d\n", i);
			permutador(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, n));
			}
        }
	}
	public static void main(String[] args) {
        int n = 4;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);
        fijador("", elements);
        imprimir();
	}
	public static void permutador (String prefix, String suffix){
		int n = suffix.length();
	if (n == 0) {acumulador(prefix);}
		else {for (int j = 0; j < n; j++){
			permutador(prefix + suffix.charAt(j), suffix.substring(0, j) + suffix.substring(j+1, n));
		}
		
	}
}

	public static void acumulador (String permutacion){
		
		totalPermutaciones += permutacion + "\n";
		
	}
	public static void imprimir (){
		JOptionPane.showMessageDialog (null, totalPermutaciones);
	}

}
