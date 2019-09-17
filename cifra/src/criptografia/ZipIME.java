package criptografia;

import java.io.IOException;
import java.util.Scanner;

import arq.Arq;
import crp.CifraCesar;
import crp.Huff;

public class ZipIME {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Insira o nome do arquivo que será lido: ");
		var leitura = new Scanner (System.in);
		String filename = new String (leitura.next());
		Arq file = new Arq();
		String plain = Arq.read(filename);
		int n;
		System.out.println("Insira o valor da cifra de César: ");
		n=leitura.nextInt();
		Huff.encode(CifraCesar.crpt(plain,n));
		Arq.write("decriptografado", CifraCesar.dcrpt(Huff.decode(Arq.read("cifrado.txt")), n));
		System.out.println("Criptografado com sucesso!");
	}

}
