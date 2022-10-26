package Caso1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner lector;
	private static String encontrado;

	public static void main(String[] args) {

		lector = new Scanner(System.in);
		boolean fin = false;

		while (!fin) {

			System.out.println("\n( Traductor 1: sentencias desde DIANA )");
			System.out.println("----------------------------------------------------");
			System.out.println("1. Cargar las propiedades del traductor de ADA.");
			System.out.println("2. Cargar las propiedades del traductor de JOVIAL.");
			System.out.println("3. Cargar las propiedades del traductor de C.");
			System.out.println("4. Cargar las propiedades del traductor desde ADA.");
			System.out.println("5. Cargar las propiedades del traductor desde JOVIAL.");
			System.out.println("6. Cargar las propiedades del traductor de C.");
			System.out.println("0. Detener ejecucion.");
			System.out.println("----------------------------------------------------");
			System.out.println("Ingrese la opcion deseada  :) ");

			int option = lector.nextInt();

			switch (option) {
			case 1:
				System.out.println("Ingrese la sentencia BNF en DIANA a traducir: ");
				String sentenciaADA = lector.next();
				String[] xADA = sentenciaADA.split("-");
				ArrayList<String> xADAx = new ArrayList<String>();
				ArrayList<String> xMal = new ArrayList<String>();
				for(int i = 0; i < xADA.length; i++) {
					encontrado = cargarPropiedadesADA(xADA[i]);
					if(encontrado.equals("")){
						xMal.add(xADA[i]);
						xADAx.add("¡" + xADA[i] + "!");
					}else{
						xADAx.add(encontrado);
					}
				}
				System.out.println("En ADA la respuesta es: \n");
				for(int j = 0; j < xADAx.size(); j++) {
					if(j != xADAx.size()-1) {
						System.out.print(xADAx.get(j) + "-");
					}else{
						System.out.println("" + xADAx.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("Se deben verificar las siguientes sentencias: \n");
				for(int j = 0; j < xMal.size(); j++) {
					if(j != xMal.size()-1) {
						System.out.print(xMal.get(j) + "-");
					}else{
						System.out.println("" + xMal.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("                Respuesta ADA                ");
				break;

			case 2:
				System.out.println("Ingrese la sentencia BNF en DIANA a traducir: ");
				String sentenciaJOVIAL = lector.next();
				String[] xJOVIAL = sentenciaJOVIAL.split("-");
				ArrayList<String> xJOVIALx = new ArrayList<String>();
				ArrayList<String> xMalJ = new ArrayList<String>();
				for(int i = 0; i < xJOVIAL.length; i++) {
					encontrado = cargarPropiedadesJOVIAL(xJOVIAL[i]);
					if(encontrado.equals("")){
						xMalJ.add(xJOVIAL[i]);
						xJOVIALx.add("¡" + xJOVIAL[i] + "!");
					}else{
						xJOVIALx.add(encontrado);
					}
				}
				System.out.println("En JOVIAL la respuesta es: \n");
				for(int j = 0; j < xJOVIALx.size(); j++) {
					if(j != xJOVIALx.size()-1) {
						System.out.print(xJOVIALx.get(j) + "-");
					}else{
						System.out.println("" + xJOVIALx.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("Se deben verificar las siguientes sentencias: \n");
				for(int j = 0; j < xMalJ.size(); j++) {
					if(j != xMalJ.size()-1) {
						System.out.print(xMalJ.get(j) + "-");
					}else{
						System.out.println("" + xMalJ.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("                Respuesta JOVIAL                ");
				break;
				
			case 3:
				System.out.println("Ingrese la sentencia BNF en DIANA a traducir: ");
				String sentenciaC = lector.next();
				String[] xC = sentenciaC.split("-");
				ArrayList<String> xCx = new ArrayList<String>();
				ArrayList<String> xMalC = new ArrayList<String>();
				for(int i = 0; i < xC.length; i++) {
					encontrado = cargarPropiedadesC(xC[i]);
					if(encontrado.equals("")){
						xMalC.add(xC[i]);
						xCx.add("¡" + xC[i] + "!");
					}else{
						xCx.add(encontrado);
					}
				}
				System.out.println("En C la respuesta es: \n");
				for(int j = 0; j < xCx.size(); j++) {
					if(j != xCx.size()-1) {
						System.out.print(xCx.get(j) + "-");
					}else{
						System.out.println("" + xCx.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("Se deben verificar las siguientes sentencias: \n");
				for(int j = 0; j < xMalC.size(); j++) {
					if(j != xMalC.size()-1) {
						System.out.print(xMalC.get(j) + "-");
					}else{
						System.out.println("" + xMalC.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("                  Respuesta C                  ");
				break;

			case 4:
				System.out.println("Ingrese la sentencia BNF en ADA a traducir: ");
				String sentenciaADA2 = lector.next();
				String[] xADA2 = sentenciaADA2.split("-");
				ArrayList<String> xADA2x = new ArrayList<String>();
				ArrayList<String> xMal2 = new ArrayList<String>();
				for(int i = 0; i < xADA2.length; i++) {
					encontrado = cargarPropiedadesADA2(xADA2[i]);
					if(encontrado.equals("")){
						xMal2.add(xADA2[i]);
						xADA2x.add("¡" + xADA2[i] + "!");
					}else{
						xADA2x.add(encontrado);
					}
				}
				System.out.println("En DIANA la respuesta es: \n");
				for(int j = 0; j < xADA2x.size(); j++) {
					if(j != xADA2x.size()-1) {
						System.out.print(xADA2x.get(j) + "-");
					}else{
						System.out.println("" + xADA2x.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("Se deben verificar las siguientes sentencias: \n");
				for(int j = 0; j < xMal2.size(); j++) {
					if(j != xMal2.size()-1) {
						System.out.print(xMal2.get(j) + "-");
					}else{
						System.out.println("" + xMal2.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("                Respuesta DIANA                ");
				break;

			case 5:
				System.out.println("Ingrese la sentencia BNF en JOVIAL a traducir: ");
				String sentenciaJOVIAL2 = lector.next();
				String[] xJOVIAL2 = sentenciaJOVIAL2.split("-");
				ArrayList<String> xJOVIAL2x = new ArrayList<String>();
				ArrayList<String> xMalJ2 = new ArrayList<String>();
				for(int i = 0; i < xJOVIAL2.length; i++) {
					encontrado = cargarPropiedadesJOVIAL2(xJOVIAL2[i]);
					if(encontrado.equals("")){
						xMalJ2.add(xJOVIAL2[i]);
						xJOVIAL2x.add("¡" + xJOVIAL2[i] + "!");
					}else{
						xJOVIAL2x.add(encontrado);
					}
				}
				System.out.println("En DIANA la respuesta es: \n");
				for(int j = 0; j < xJOVIAL2x.size(); j++) {
					if(j != xJOVIAL2x.size()-1) {
						System.out.print(xJOVIAL2x.get(j) + "-");
					}else{
						System.out.println("" + xJOVIAL2x.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("Se deben verificar las siguientes sentencias: \n");
				for(int j = 0; j < xMalJ2.size(); j++) {
					if(j != xMalJ2.size()-1) {
						System.out.print(xMalJ2.get(j) + "-");
					}else{
						System.out.println("" + xMalJ2.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("                Respuesta DIANA                ");
				break;
				
			case 6:
				System.out.println("Ingrese la sentencia BNF en C a traducir: ");
				String sentenciaC2 = lector.next();
				String[] xC2 = sentenciaC2.split("-");
				ArrayList<String> xC2x = new ArrayList<String>();
				ArrayList<String> xMalC2 = new ArrayList<String>();
				for(int i = 0; i < xC2.length; i++) {
					encontrado = cargarPropiedadesC2(xC2[i]);
					if(encontrado.equals("")){
						xMalC2.add(xC2[i]);
						xC2x.add("¡" + xC2[i] + "!");
					}else{
						xC2x.add(encontrado);
					}
				}
				System.out.println("En DIANA la respuesta es: \n");
				for(int j = 0; j < xC2x.size(); j++) {
					if(j != xC2x.size()-1) {
						System.out.print(xC2x.get(j) + "-");
					}else{
						System.out.println("" + xC2x.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("Se deben verificar las siguientes sentencias: \n");
				for(int j = 0; j < xMalC2.size(); j++) {
					if(j != xMalC2.size()-1) {
						System.out.print(xMalC2.get(j) + "-");
					}else{
						System.out.println("" + xMalC2.get(j));
					}
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println("                  Respuesta DIANA                  ");
				break;

			default:
				fin = true;
				System.out.println("----------------------------------------------------");
				System.out.println("                Ejecucion finalizada                ");
				System.out.println("----------------------------------------------------");
				break;

			}
		}

	}

	private static String cargarPropiedadesADA(String buscar) {

		File archivo = new File("./data/traductor1.txt");
		String respuesta = "";

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			String[] data;

			String st;
			while ((st = br.readLine()) != null) {
				data = st.split(" = ");
				if (buscar.equals(data[0])) {
					respuesta = data[1];
					break;
				}
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		return respuesta;
	}
	
	private static String cargarPropiedadesJOVIAL(String buscar) {

		File archivo = new File("./data/traductor2.txt");
		String respuesta = "";

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			String[] data;

			String st;
			while ((st = br.readLine()) != null) {
				data = st.split(" = ");
				if (buscar.equals(data[0])) {
					respuesta = data[1];
					break;
				}
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		return respuesta;
	}
	
	private static String cargarPropiedadesC(String buscar) {

		File archivo = new File("./data/traductor3.txt");
		String respuesta = "";

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			String[] data;

			String st;
			while ((st = br.readLine()) != null) {
				data = st.split(" = ");
				if (buscar.equals(data[0])) {
					respuesta = data[1];
					break;
				}
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		return respuesta;
	}
	
	private static String cargarPropiedadesADA2(String buscar) {

		File archivo = new File("./data/traductor4.txt");
		String respuesta = "";

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			String[] data;

			String st;
			while ((st = br.readLine()) != null) {
				data = st.split(" = ");
				if (buscar.equals(data[0])) {
					respuesta = data[1];
					break;
				}
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		return respuesta;
	}
	
	private static String cargarPropiedadesJOVIAL2(String buscar) {

		File archivo = new File("./data/traductor5.txt");
		String respuesta = "";

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			String[] data;

			String st;
			while ((st = br.readLine()) != null) {
				data = st.split(" = ");
				if (buscar.equals(data[0])) {
					respuesta = data[1];
					break;
				}
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		return respuesta;
	}
	
	private static String cargarPropiedadesC2(String buscar) {

		File archivo = new File("./data/traductor6.txt");
		String respuesta = "";

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			String[] data;

			String st;
			while ((st = br.readLine()) != null) {
				data = st.split(" = ");
				if (buscar.equals(data[0])) {
					respuesta = data[1];
					break;
				}
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		return respuesta;
	}

	private static void modificarPropiedades() {

		File archivo = new File("./data/traductor1.txt");

		System.out.println();
		System.out.println("--Modificar las propiedades--");

		try {

			BufferedReader br = new BufferedReader(new FileReader(archivo)); 
			FileWriter escritura = new FileWriter(archivo.getParentFile()+"/config.txt");
			
			String st;
			
			while ((st = br.readLine()) != null) {
				escritura.write("" + st);
			}
			br.close();
			
			System.out.print("Desea modificar los datos? S/N: ");

			lector = new Scanner(System.in);
			String option = lector.nextLine();

			if (option.toUpperCase().equals("S")) {

				System.out.print("\nIngrese la sentencia del traductor: ");
				lector = new Scanner(System.in);
				String mod = lector.next();
				escritura.write("" + mod + "\n");
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("--Modificaciones realizadas correctamente--");
		System.out.println();

	}

}

