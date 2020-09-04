package bo.edu.uagrm.inf310sb.UI;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import bo.edu.uagrm.inf310sb.arboles.ArbolBinarioBusqueda;
import bo.edu.uagrm.inf310sb.arboles.ExcepcionClaveYaExiste;
import bo.edu.uagrm.inf310sb.arboles.IArbolBusqueda;
import bo.edu.uagrm.inf310sb.arboles.NodoBinario;

public class TestArbol {
	
	public static void main(String[] args) throws ExcepcionClaveYaExiste{
		IArbolBusqueda<Integer, String> arbol1 = new ArbolBinarioBusqueda<>();
		try {
			arbol1.insertar(50, "Cincuenta");
			arbol1.insertar(45, "Cuarenta y Cinco");
			arbol1.insertar(47, "Cuarenta y Siete");
			arbol1.insertar(62, "Sesenta y Dos");
			arbol1.insertar(53, "Cincuenta y Tres");
			arbol1.insertar(40, "Cuarenta");
			arbol1.insertar(67, "Sesenta y Siete");
			arbol1.insertar(46, "Cuarenta y Seis");
			arbol1.insertar(52, "Cincuenta y Dos");
			arbol1.insertar(51, "Cincuenta y Uno");
		} catch (ExcepcionClaveYaExiste e) {
			e.toString();
		}
		
		//PRACTICO
		System.out.println("PRACTICO");
		
		//1. Implemente un método recursivo que retorne la cantidad nodos hojas que existen en un árbol binario
		System.out.println("1. Cantidad de nodos hoja recursivo: "+((ArbolBinarioBusqueda) arbol1).cantidadNodosHoja());
		
		//2. Implemente un método iterativo que retorne la cantidad nodos hojas que existen en un árbol binario
		System.out.println("2. Cantidad de nodos hoja iterativo: "+((ArbolBinarioBusqueda) arbol1).cantidadNodosHojaIterativo());
		
		//3. Implemente un método recursivo que retorne la cantidad nodos hojas que existen en un árbol binario, pero solo en el nivel N
		System.out.println("3. Cantidad de nodos hoja en el nivel recursivo: "+((ArbolBinarioBusqueda) arbol1).cantidadNodosHojadelNivel(2));
		
		//4. Implemente un método iterativo que retorne la cantidad nodos hojas que existen en un árbol binario, pero solo en el nivel N
		System.out.println("4. Cantidad de nodos hoja en el nivel iterativo: "+((ArbolBinarioBusqueda) arbol1).cantidadNodosHojadelNivelIterativo(2));
		
		//5. Implemente un método iterativo que retorne la cantidad nodos hojas que existen en un árbol binario, pero solo antes del nivel N
		System.out.println("5. Cantidad de nodos hoja antes del nivel iterativo: "+((ArbolBinarioBusqueda) arbol1).cantidadNodosHojaAntesdelNivel(3));
		
		/*6. Implemente un método recursivo que retorne verdadero, si un árbol binario esta balanceado según las reglas que establece un árbol AVL, 
		falso en caso contrario. */
		System.out.println("6. Verificar si un árbol está balanceado recursivo: "+((ArbolBinarioBusqueda) arbol1).estaBalanceado());
		
		//12. Para un árbol binario implemente un método que retorne la cantidad de nodos que tienen ambos hijos luego del nivel N.
		System.out.println("12. Cantidad de nodos con ambos hijos luego del nivel: "+((ArbolBinarioBusqueda) arbol1).cantidadNodosConAmbosHijosLuegoNivel(-1));
		System.out.println();
	}

}
