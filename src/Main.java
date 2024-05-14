public class Main {
    public static void main(String[] args) {
//        DatosPersonales obj = new DatosPersonales("Santiago","Izquierdo Varela");
//        System.out.println(obj.getNombre());

        Coleccion objc = new Coleccion();

        DatosPersonales dp1 = new DatosPersonales("Santiago","Izquierdo Varela");
        objc.add(new DatosPersonales("Santiago","Izquierdo Varela"));
        objc.add(new DatosPersonales("Santiago","Izquierdo Varela"));
        objc.add(new DatosPersonales("Valeria","Izquierdo Varela"));
        objc.add(new DatosPersonales("Santiago","Izquierdo Varela"));

//        objc.show();
//        objc.show2();
        objc.buscar("Valeria");

    }
}