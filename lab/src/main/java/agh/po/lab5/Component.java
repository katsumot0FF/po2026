package agh.po.lab5;

public class Component {
    String brand;
    float weight;
    float price;
    String model;

    public Component(String brand,float weight,float price,String model) {
        this.brand = brand;
        this.weight = weight;
        this.model = model;
        this.price = price;
    }
    public String getManufacturer(){

        return brand;

    }

    public String getModel(){

        return model;

    }
    public float getWeight(){

        return weight;

    }
    public float getPrice(){

        return price;

    }


}
