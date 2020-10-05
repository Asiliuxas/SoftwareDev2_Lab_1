public class Q2 {
    private int height = 1,width = 1, depth =1;
    private boolean fill = false;
    private String name = "Bob";

    /**
     * Creates box with default values.
     */
    public Q2(){}

    /**
    *   Creates a box with specifications
    * @param h Height of the box.
    * @param w Width of the box.
    * @param d Depth of the box.
    * @param f Boolean value if the box is filled or not.
    * @param n Name of the box.
     */
    public Q2(int h,int w, int d, boolean f,String n) {
        height = h;
        width = w;
        depth = d;
        fill = f;
        name = n;
    }

    /**
     * Returns specific box value.
     * @return Returns box height.
     */
    public int get_height(){
        return height;
    }

    /**
     * Returns specific box value.
     * @return Returns box width.
     */
    public int get_width(){
        return width;
    }

    /**
     * Returns specific box value.
     * @return Returns box depth.
     */
    public int get_depth(){
        return depth;
    }

    /**
     * Returns specific box value.
     * @return Returns box fill.
     */
    public boolean get_fill(){
        return fill;
    }

    /**
     * Returns specific box value.
     * @return Returns box name.
     */
    public String get_name(){
        return name;
    }

    /**
     * Sets specific box value.
     * @param h Sets height of the box.
     */
    public void set_height(int h){
        height = h;
    }

    /**
     * Sets specific box value.
     * @param w Sets width of the box.
     */
    public void set_width(int w){
        width = w;
    }

    /**
     * Sets specific box value.
     * @param d Sets depth of the box.
     */
    public void set_depth(int d){
        width = d;
    }

    /**
     * Sets specific box value.
     * @param f Sets box fill state.
     */
    public void set_fill(boolean f){
        fill = f;
    }

    /**
     * Sets specific box value.
     * @param n Sets name of the box.
     */
    public void set_name(String n){
        name = n;
    }

    /**
     * Returns the volume of the box.
     * @return Height * Width * Depth
     */
    public int get_volume() {
        return height * width * depth;
    }

    /**
     * Returns the surface area of the box
     * @return Surface area.
     */
    public int get_surface() {
        return (height*width+height*depth+width*depth)*2;
    }

    /**
     * Returns fill status of the box as a string.
     * @return Full or Empty
     */
    public String get_status() {
        if(fill)
            return "Full";
        else
            return "Empty";
    }

    /**
     * Returns dimensions of box as an Int array.
     * @return 0:Height,1:Width,2:Depth
     */
    public int[] get_dimensions(){
        int[] dims = {height,width,depth};
        return dims;
    }
}
