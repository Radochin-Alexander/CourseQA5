package HW;

public class HW_8_1_ {

    public class TreeDemo {

        public static void main(String[] args) {
            HW_8_1.Tree tree1 = new HW_8_1.Tree("Ольха", 250);
            HW_8_1.Tree tree2 = new HW_8_1.Tree(220, 15, "Белый");
            HW_8_1.Tree tree3 = new HW_8_1.Tree();
            HW_8_1.Tree tree4 = new HW_8_1.Tree("Береза");

            System.out.println(tree1);
            System.out.println(tree2);
            System.out.println(tree3);
            System.out.println(tree4);
        }
    }
}
