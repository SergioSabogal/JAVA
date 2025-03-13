public enum TiposDeCarro {
    SEDAN("Sedan","4",""),
    COMPACTO,
    HATCHBACK,
    COUPE,
    STATION_WAGON,
    SUV,
    CROSSOVER,
    PICKUP,
    MONOVOLUMEN,
    DEPORTIVO,
    CONVERTIBLE;

    private final String nombre;
    private final int puertas;
    private final String detalle;
    TiposDeCarro(String nombre, int puerta, String detalle ) {
        this.nombre = nombre;
        this.puertas = puerta;
        this.detalle = detalle;
    }


    public String getNombre() {
        return nombre;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getDetalle() {
        return detalle;
    }


    @Override
    public String toString() {
        return  nombre + puertas + detalle;
    }
}
