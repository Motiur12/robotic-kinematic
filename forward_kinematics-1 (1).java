
public class forward_kinematics {
    public static void main(String[] args) {
         double th1 = 60, th2 = 70, th3 = 80;// put your  Theta like (A*10),(B*10),(C*10)
                
        double l1 = 26, l2 = 20, l3 = 0, d2 = 32; 
        double thx = 180 - 90 - th2, thy = th3 - thx;

        double d3 = l1 * (Math.sin(Math.toRadians(th2)));
        double d4 = l1 * (Math.cos(Math.toRadians(th2)));

        double d5 = l2 * (Math.sin(Math.toRadians(thy)));
        double d6 = l2 * (Math.cos(Math.toRadians(thy)));

        double z = d2 + d3 - d6;

        double d1 = d4 + d5;

        double x = (d1 + l3) * (Math.cos(Math.toRadians(th1)));
        double y = (d1 + l3) * (Math.sin(Math.toRadians(th1)));

        System.out.printf("(x,y,z)=(%.4f,%.4f,%.4f)\n", x, y, z);
    }

}
