public class Q2_Test {
    public static void main(String[] args) {
        Q2 box_1 = new Q2();
        BoxDetails(box_1);
        box_1.set_width(4);
        box_1.set_height(5);
        box_1.set_depth(3);
        box_1.set_name("Billy");
        box_1.set_fill(true);
        System.out.println("Box details where changed.");
        BoxDetails(box_1);

    }
    public static void BoxDetails(Q2 b){
        System.out.printf("Box has height of %d, width of %d, depth of %d. Box is %s and his name is %s.\n",b.get_height(),b.get_width(),b.get_depth(),b.get_status(),b.get_name());
        System.out.printf("Box volume is %d and surface area is %d.\n",b.get_volume(),b.get_surface());
    }
}
