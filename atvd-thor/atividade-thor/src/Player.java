import java.util.*;
import java.io.*;
import java.math.*;

		class Player {

		    public static void main(String args[])

		    {

		        Scanner in = new Scanner(System.in);

		        int raioX = in.nextInt(); // the X position of the light of power

		        int raioY = in.nextInt(); // the Y position of the light of power

		        int thorX = in.nextInt(); // Thor's starting X position

		        int thorY = in.nextInt(); // Thor's starting Y position

		 

		        //o looping fica rodando enquanto for verdadeiro

		        while (true)

		        {

		            int remainingTurns = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.

		           // string vazia indicando a dire��o

		            String direcao = "";

		           

		            //in�cio das condi��es at� que a posi��o do thor esteja igual a do raio

		       

		            //se thorY < raioY ent�o a direcao � S

		            if (thorY < raioY) {

		                //incremento do thorY

		                thorY++;

		                // informando a dire��o igual a "S" = South

		                direcao = "S";

		 

		            //ent�o se thorY > raioY ent�o a direcao � N

		            } else if (thorY > raioY)  {

		 //decrecremento do thorY

		                thorY--;

		                 // informando a dire��o igual a "N" = North

		                direcao = "N";

		            }

		 

		             //se thorX < raiX ent�o a direcao � E            

		            if (thorX < raioX) {

		                 //incremento do thorX

		                thorX++;

		                  // informando a dire��o igual a "E" = East

		                direcao += "E";

		               

		            //ent�o se thorX > raioX ent�o a direcao � N

		            } else if (thorX > raioX) {

		                      //decrecremento do thorY

		                thorX--;

		                // informando a dire��o igual a "W" = West

		                direcao += "W";

		            }

		           

		            //imprime no console a direcao do thor

		            System.out.println(direcao);

		        }

		    }

		}