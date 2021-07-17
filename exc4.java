package PrimeiroExercicio;

import java.util.Scanner;

public class exc4 {
	public static void main(String[] args){
		int x=1,idade=0,homensagr=0,nervosaS=0,agressivoS=0,calmosoutros=0,calmaS=0,nervoso40=0,calmo18=0;
        int sexo=0,feminino=0,masculino=0,outros=0,fatorpsico=0;
        Scanner leia=new Scanner (System.in);

        while(x<=3) {
                System.out.println("Pessoa numero:"+(x));
                System.out.println("Qual a sua idade?:");
                idade=leia.nextInt();
                System.out.println("Qual seu genero sexual+ 1=masculino 2=feminino 3=outros?:");
                sexo=leia.nextInt();
                System.out.println("Fator psicologico: 1=calmo 2=nervoso 3=agressivo ");
                fatorpsico=leia.nextInt();


            if(fatorpsico==1) {
                calmaS++;
            }

            if(sexo==2 && fatorpsico==1) {
                nervosaS++;
            }

            if(sexo==1 && fatorpsico==1)
            {
                homensagr++;
            }

            if(sexo==3 && fatorpsico==1) {

                calmosoutros++;

            }


            if(idade>40 && fatorpsico==1 ) {

                nervoso40++;

            }

            if(idade<18 && fatorpsico==1) {

            calmo18++;
            }
            x++;



        }



            System.out.println("\no número de pessoas calmas:"+calmaS);
            System.out.println("o número de mulheres nervosas"+nervosaS);
            System.out.println("o número de homens agressivos"+homensagr);
            System.out.println("o número de outros calmos"+calmosoutros);
            System.out.println("o número de pessoas nervosas com mais de 40 anos"+nervoso40);
            System.out.println("o número de pessoas calmas com menos de 18 anos."+calmo18);
	}
	}