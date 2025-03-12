public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJA("Naranja"),
    NEGRO("Negro");


    private final String color;

    // Constructor para asignar el valor de la cadena
    Color(String color) {
        this.color = color ;
    }

    //Metodo para devolver el valor en minuscula
    public String getColor() {
        return color;
    }


}
