package discreetlearning;
import java.util.*;
import java.io.*;
public class Cuestionario {
        public static ArrayList<Pregunta> preguntas10 = new ArrayList <Pregunta>();
	public static ArrayList<Pregunta> preguntas = new ArrayList <Pregunta>();
	public static FileInputStream in;
	public static FileOutputStream out;
	public static ObjectInputStream fin;
	public static ObjectOutputStream fout;

    public static void abrirArch(String name)
    {
    	try{
    	File f = new File("src/Files/"+name+".dat");
    	if(f.exists())
    	{
                preguntas.clear();
    		in=new FileInputStream(name);
    		fin=new ObjectInputStream(in);
    		try{
    			do{
    				preguntas.add((Pregunta)fin.readObject());
    			}while(true);
    		}catch(EOFException e){
    			;
    		}catch(ClassNotFoundException e){;}
    	}
    	else{
    	
                insertaPregunta();
                f.createNewFile();
                out=new FileOutputStream(name);
                fout=new ObjectOutputStream(out);
                for(int i=0;i<preguntas.size();i++){
                    fout.writeObject(preguntas.get(i));
                }
                fout.close();
            }       
        }catch(Exception e){;}
    }
    
  
    public static void insertaPregunta()
    {
    	preguntas.add(new Pregunta("¿Qué tienen en comun un Array y un ArrayList?\nI. Ambos guardan información\nII. Ambos pueden recorrerse con ciclos\nIII. Ambos pueden cambiar su tamaño durante la ejecución de un programa", "Sólo I", "Sólo II", "I y II", "I, II y III", 3));
    	preguntas.add(new Pregunta("¿Cuál es una declaración válida de una variable booleana?", "boolean b1=0;", "boolean b2=False;", "boolean b3='False';", "boolean b4=no;",2));
    	preguntas.add(new Pregunta("¿Cuál de estas es una declaración incorrecta de un arreglo?", "int arr[]=new int[5]", "int[]arr=nww int[5]", "int arr[]\narr=new int[5]", "int arr[]=int[5] new", 4));
    	preguntas.add(new Pregunta("¿Cuál de los siguientes es necesario especificar al inicialiar un arreglo?", "Filas", "Columnas", "Tanto las Columnas como las Filas", "Ninguno de los anteriores", 1));
    	preguntas.add(new Pregunta("¿Cuál es el significado de AWT?", "All Windows Tools", "All Writing Tools", "Abstract Window Toolkit", "Abstract Writing Toolkit", 3));
    	preguntas.add(new Pregunta("¿Cuál de estos se usa para todas las operaciones de entrada y salida en Java?", "Flujos", "Variables", "Clases", "Metodos", 1));
    	preguntas.add(new Pregunta("¿Cuál de estos métodos de la clase ArrayList se usa para obtener el tamaño actual de un objeto?", "size()", "length()", "index()", "capacity()", 1));
    	preguntas.add(new Pregunta("¿Cuándo ocurren las Excepciones en una secuencia de código?", "Al ejecutar", "Al compilar", "En cualquier momento", "Ninguna de las anteriores", 1));
    	preguntas.add(new Pregunta("¿Cuál de estas Palabras Clave (Keywords) no sirve para el manejo de excepciones?", "try", "finally", "thrown", "catch", 3));
    	preguntas.add(new Pregunta("¿Cuál de las siguientes es una super clase de todas las clases de tipo excepción?", "String", "RuntimeExceptions", "Throwable", "Cachable", 3));
    	preguntas.add(new Pregunta("¿Cuál de estas Palabras Claves se puede usar para lanzar una excepción manualmente?", "try", "finally", "throw", "catch", 3));
    	preguntas.add(new Pregunta("¿Cuál de las siguientes declaraciones es verdadera?", "Una clase abstracta puede definir un constructor", "Una clase abstracta puede crear subclases y ser construída", "Una clase abstracta debe contener métodos abstractos", "Una clase abstracta no tiene ningún tipo de contenido", 1));
    	preguntas.add(new Pregunta("¿Cuál de las siguientes te permitiría definir una interface para Animal?", "public Animal extends Interface{}", "public interface Animal{}", "public class Animal implements Interface{}", "public class Animal{}", 2));
    	preguntas.add(new Pregunta("¿Cuál de las siguientes declaraciones es cierta?", "Un programa de Java sólo puede contener una super clase", "Una clase es un modelo que define las características de un objeto", "Una clase es una instancia de un objeto", "Una clase es un dato primitivo de Java", 2));
    	preguntas.add(new Pregunta("¿Qué operador se usa para asignar memoria a un objeto?", "malloc", "alloc", "new", "give", 3));
    	preguntas.add(new Pregunta("¿Cuál de estas es incorrecta?", "Toda clase debe contener un método main()", "Los applets no requieren un método main()", "Sólo puede haber un método main() en un programa", "El método main() debe ser público", 1));
    	preguntas.add(new Pregunta("¿Cuál de estas Palabras Claves se usa para heredar una clase?", "super", "this", "extent", "extends", 4));
    	preguntas.add(new Pregunta("¿Cuál es la forma correcta de que la clase B herede a la clase A?", "class B + class A {}", "class B inherits class A {}", "class B extends A {}", "class B extends class A {}", 3));
    	preguntas.add(new Pregunta("¿Cuál de estas interfaces hereda de la interfaz DataOutput?", "Serializable", "Externalization", "ObjectOutput", "ObjectInput", 3));
    	preguntas.add(new Pregunta("¿Qué palabra clave se usa para definir Librerías en Java?", "pkg", "Pkg", "package", "Package", 3));
    	preguntas.add(new Pregunta("¿Cuál de estos es un mecanismo para nombrar y controlar la visibilidad de una clase y sus contenidos?", "Object", "Packages", "Interfaces", "Ninguno de los anteriores", 2));
    	preguntas.add(new Pregunta("¿Cuál es la forma correcta de importar una librería 'pkg'?", "import pkg.", "Import pkg.", "import pkg.*", "Import pkg.*", 3));
    	preguntas.add(new Pregunta("¿Cuál de estas librerías contiene todas las clases estándares de Java?", "lang", "java", "util", "java.packages", 2));
    	preguntas.add(new Pregunta("Java usa ___ para representar caracteres", "Código ASCII", "Unicode", "Byte code", "Ninguno de los anteriores", 2));
    	preguntas.add(new Pregunta("¿Cuál es la salida del siguiente código?\nSystem.out.println(i);\nfor(int i=0;i<10;i++){\n  if(i==3)\n  break;\n  System.out.print(i);\n}", "0123", "012456789", "012", "0123456789", 3));
    	preguntas.add(new Pregunta("¿Qué declaración previene que un método sea invalidado (Override)?", "final void act(){}", "Static void act(){}", "void final act(){}", "final abstract void act(){}", 1));
    	preguntas.add(new Pregunta("public static void printArray(T[] array){... ¿es un ejemplo de qué?", "Un método concreto", "Una instancia genérica", "Un método genérico", "Una clase genérica", 3));
    	preguntas.add(new Pregunta("¿Cuál de estos métodos de Object class puede clonar un objeto?", "Objectcopy()", "copy()", "Object clone()", "clone()", 3));
    	preguntas.add(new Pregunta("¿Qué clase depende de sus subclases para implementar por completo sus métodos?", "Object class", "abstract class", "ArrayList class", "Ninguna de las anteriores", 2));
    	preguntas.add(new Pregunta("¿Cómo se le llama al proceso de definir un método dentro de una clase más de una vez con diferentes parámetros?", "Invalidar", "Sobrecargar", "Copiar", "Ninguna de las anteriores", 2));

        
       
    }

    public static void listarRandom(ArrayList<Pregunta> origen)
    {
        
    	int index;
        for(int i= 0; i<10;i++){
            preguntas10.add(new Pregunta("vacio",null, null, null, null, 0));
        }
        for(int i= 0; i<10;i++){
            do{
                index = (int)(Math.random()*(origen.size()-1));
                if(!(preguntas10.contains(origen.get(index)))){
                    preguntas10.set(i, origen.get(index));
                }
                else{
                    i--;
                }
            
            }while(!(preguntas10.contains(origen.get(index))));
        }
        
    }

    public static void main(String args[])
    {
    	abrirArch("Cuestionario");
    	//insertaPregunta();
    	//listarRandom(preguntas);
        System.out.println(preguntas.size());
    }

}
