package ConceptsCode.PassBy;

public class passbyReference {
    public static class Point {
        int x, y;

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;


        }
    }

    public static void Move(Point p) {
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static void main(String[] args) {
        Point First = new Point(1, 2);
        System.out.println(First);

        Move(First);
        System.out.println(First);

    }
}
