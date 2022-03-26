package Metods;

public class Metods {
    public static String variables (String variant){
        String status;
        switch (variant){
            case "Variant1":
                status = "YouWin";
                break;
            case "Variant2":
                status = "YouAlmostWin";
                break;
            default:
                status = "YouLost";
        }
        return status;
    }

    public static String variables2 (int variant){
        String status;
        switch (variant){
            case 1:
                status = "YouChose_1";
                break;
            case 2:
                status = "YouChose_2";
                break;
            default:
                status = "YouLost";
        }
        return status;
    }

    public static String variable3(int variant){
        String status;
        status = switch (variant){
            case 1 -> "Popal";
            case 2 -> "NePopal";
            default -> "Mimo";
        };
        return status;
    }
}
