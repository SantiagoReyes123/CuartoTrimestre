import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaGUI {

    static String[] titulos = {"Libro Q", "Libro B", "Libro C"};
    static String[] autores = {"Autor P", "Autor B", "Autor C"};
    static int[] cantidades = {3, 2, 6};

    // MOSTRAR INVENTARIO
    public static void mostrarInventario() {
        StringBuilder inventario = new StringBuilder("Inventario:\n");
        for (int i = 0; i < titulos.length; i++) {
            inventario.append(titulos[i]).append(" por ").append(autores[i]).append(" - ").append(cantidades[i]).append(" copias\n");
        }
        JOptionPane.showMessageDialog(null, inventario.toString(), "Inventario", JOptionPane.INFORMATION_MESSAGE);
    }

    // AGREGAR COPIAS
    public static void agregarCopias(String titulo, int cantidad) {
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i].equalsIgnoreCase(titulo)) {
                cantidades[i] += cantidad;
                JOptionPane.showMessageDialog(null, "Copias agregadas");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Libro no encontrado.");
    }

    // PRESTAR LIBROS
    public static void prestarLibro(String titulo) {
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i].equalsIgnoreCase(titulo)) {
                if (cantidades[i] > 0) {
                    cantidades[i]--;
                    JOptionPane.showMessageDialog(null, "Libro prestado");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay copias disponibles");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Libro no encontrado.");
    }

    // BUSCAR LIBRO
    public static void buscarLibro(String titulo) {
        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i].equalsIgnoreCase(titulo)) {
                JOptionPane.showMessageDialog(null, "Libro encontrado: " + titulos[i] + " por " + autores[i] + " - " + cantidades[i] + " copias");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Libro no encontrado.");
    }

    // ORDENAR EL INVENTARIO POR TITULO
    public static void ordenarInventario() {
        for (int i = 0; i < titulos.length; i++) {
            for (int j = i + 1; j < titulos.length; j++) {
                if (titulos[i].compareTo(titulos[j]) > 0) {
                    String tempTitulo = titulos[i];
                    String tempAutor = autores[i];
                    int tempCantidad = cantidades[i];

                    titulos[i] = titulos[j];
                    autores[i] = autores[j];
                    cantidades[i] = cantidades[j];

                    titulos[j] = tempTitulo;
                    autores[j] = tempAutor;
                    cantidades[j] = tempCantidad;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Inventario ordenado por título");
    }

    public static void main(String[] args) {
        // Crear el JFrame
        JFrame frame = new JFrame("Biblioteca");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el JComboBox con las opciones del menú
        String[] opciones = {"Seleccionar...", "Mostrar Inventario", "Agregar Copias", "Prestar Libros", "Buscar Libros", "Ordenar Inventario", "Salir"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        // Añadir ActionListener para manejar la selección
        comboBox.addActionListener((ActionEvent e) -> {
            String seleccion = (String) comboBox.getSelectedItem();
            switch (seleccion) {
                case "Mostrar Inventario":
                    mostrarInventario();
                    break;
                case "Agregar Copias":
                    String tituloAgregar = JOptionPane.showInputDialog("Ingresa el nombre del libro para agregar copias:");
                    String cantidadAgregarStr = JOptionPane.showInputDialog("Ingrese la cantidad de copias a agregar:");
                    int cantidadAgregar = Integer.parseInt(cantidadAgregarStr);
                    agregarCopias(tituloAgregar, cantidadAgregar);
                    break;
                case "Prestar Libros":
                    String tituloPrestar = JOptionPane.showInputDialog("Ingrese el nombre del libro para prestar:");
                    prestarLibro(tituloPrestar);
                    break;
                case "Buscar Libros":
                    String tituloBuscar = JOptionPane.showInputDialog("Ingrese el nombre del libro para buscar:");
                    buscarLibro(tituloBuscar);
                    break;
                case "Ordenar Inventario":
                    ordenarInventario();
                    break;
                case "Salir":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        });

        // Añadir el JComboBox al JFrame
        frame.getContentPane().add(comboBox);
        frame.setVisible(true);
    }
}

