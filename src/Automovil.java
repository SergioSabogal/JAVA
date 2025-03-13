public class Automovil {

    private long id;
    private String manufacturer;
    private String model;
    private Color color;
    private double cylinder;
    private boolean avalaible ;
    private int year;
    private double price;
    private int km;     // Kilometros por galon.

    public Automovil(){}

    public Automovil(long id, String manufacturer, String model, Color color, double cylinder, boolean avalaible, int year, double price, int km){
        this.id = id;
        this.manufacturer  = manufacturer;
        this.model = model;
        this.color = color;
        this.cylinder = cylinder;
        this.avalaible = avalaible;
        this.year = year;
        this.price =  price;
        this.km = km;
    }
    public String detail(){
        return "Auto fabricante: " + this.manufacturer +
                "\nAuto modelo : " + this.model +
                "\nAuto color: " + this.color +
                "\nCilindraje: " + this.cylinder +
                "\nDisponible: " + this.avalaible +
                "\nKilometros x galon: " + this.km +
                "\nPrecio día : " + this.price+
                "\nAño: " + this.year;
    }


    public double consumption(int km ){
        return (double)(km/this.km);
    }

    public double priceConsumption(int km){
        return (double)(km/this.km)*15000;
    }

    public double total(){
        return (double)(price + priceConsumption(km) + consumption(km));
    }



    public void setId(long id){this.id = id; }
    public long getId() {return id;}


    public void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}
    public String getManufacturer(){return manufacturer;}


    public void setModel(String model){ this.model = model; }
    public String getModel(){ return model; }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCylinder(double cylinder){this.cylinder = cylinder;}
    public double getCylinder(){return cylinder;}


    public  void setAvalaible(boolean avalaible){ this.avalaible = avalaible;}
    public boolean getAvalaible(){return  avalaible;}


    public void setYear(int year){ this.year = year;}
    public int getYear(){ return year;}


    public void setPrice(double price){this.price = price;}
    public double getPrice(){ return price; }


    public void setKm(int km){this.km = km;}
    public int getKm(){return km;}

    @Override
    public boolean equals(Object obj) {
        if(this == obj){     //Primero se  verifica si ambos objetos son el mismo
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.manufacturer != null && this.model != null
                && this.manufacturer.equals(a.getManufacturer())
                && this.model.equals(a.getModel()));

    }
}
