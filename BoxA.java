public class BoxA {
    private float width, height, depth;

    public BoxA() {
        width = height = depth = 0;
    }

   
    public BoxA(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    
    public BoxA(BoxA b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }


    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

    
    public void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume = " + volume);
    }
}
