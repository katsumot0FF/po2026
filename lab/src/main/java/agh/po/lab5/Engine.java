package agh.po.lab5;

public class Engine extends Component {
    public Engine(String brand,float weight,float price,String model){
        super(brand,weight,price,model);
    }
    int rpm;
    int capacity;
    int cylinder;
    int hp;
    int torqueNm;
}
