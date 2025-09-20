public class BoxWeightDemoA {
    public static void main(String[] args) {
        
        BoxWeightA bw1 = new BoxWeightA(2, 3, 4, 5);
        bw1.displayVolume();
        bw1.displayWeight();

    
        BoxWeightA bw2 = new BoxWeightA(bw1);
        bw2.displayVolume();
        bw2.displayWeight();


        BoxWeightA bw3 = new BoxWeightA();
        bw3.setWidth(5);
        bw3.setHeight(5);
        bw3.setDepth(5);
        bw3.setWeight(10);
        bw3.displayVolume();
        bw3.displayWeight();
    }
}
