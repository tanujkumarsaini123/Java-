public class BoxWeightA extends BoxA {
    private float weight;

    
    public BoxWeightA() {
        super();
        weight = 0;
    }

    public BoxWeightA(float w, float h, float d, float weight) {
        super(w, h, d);
        this.weight = weight;
    }


    public BoxWeightA(BoxWeightA bw) {
        super(bw);
        this.weight = bw.weight;
    }

    
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    
    public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}
