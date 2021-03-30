public class TriangleTester {

    public static void main(String[] args) {
        System.out.println("--------- Test From Code ---------");
        Triangle equilateralTr = new Equalateral(12);
        Triangle isoscelesTr = new Isosceles(12);
        System.out.println("Equilateral " + equilateralTr.getRatio());
        System.out.println("Right isosceles " + isoscelesTr.getRatio());
        System.out.println("\n--------- More Tests ---------");
        Triangle right1 = new Isosceles(4.0);
        Triangle right2 = new Isosceles(6.0);
        Triangle equal1 = new Equalateral(4.0);
        Triangle equal2 = new Equalateral(6.0);
        Triangle[] triangleList = {right1, right2, equal1, equal2};
        for(Triangle current : triangleList)
        {
            System.out.println("\n" + current );
            System.out.println("Area = " + current.getArea());
            System.out.println("Perimeter = " + current.getPerimeter());
            System.out.println("Ratio = " + current.getRatio());
        }
    }
}
