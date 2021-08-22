package Leave2;

class Sulosion{


    public static String bunney(long x, long y) {
        long y_diff = y - 1;
        long corner = x + y_diff;
        long val = corner * (corner + 1);

        long id = Math.floorDiv(val, 2);

        id -= y_diff;
        String type_casting = String.valueOf(id);
        return type_casting;
    }


    public static void main(String[] args) {
        String result = bunney(5 , 10);
        System.out.println(result);

    }
}