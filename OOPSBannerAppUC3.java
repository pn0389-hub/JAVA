/**
 * OOPSBannerAppUC3
 *
 * Prints "OOPS" in banner format using String.join() for memory efficiency.
 * Each letter (O, O, P, S) is 7 lines tall and 9 characters wide.
 *
 * @author YourName
 * @version 1.0
 */
public class OOPSBannerAppUC3 {

    public static void main(String[] args) {
        // Each line of OOPS banner constructed using String.join with empty delimiter

        System.out.println(String.join("",
            "  *****  ", "  *****  ", "  *****  ", "  *****  "
        ));
        System.out.println(String.join("",
            " **   ** ", " **   ** ", " **   ** ", " **   ** "
        ));
        System.out.println(String.join("",
            " **   ** ", " **   ** ", " **   ** ", " **      "
        ));
        System.out.println(String.join("",
            " **   ** ", " **   ** ", " ******  ", "  *****  "
        ));
        System.out.println(String.join("",
            " **   ** ", " **   ** ", " **      ", "      ** "
        ));
        System.out.println(String.join("",
            " **   ** ", " **   ** ", " **      ", " **   ** "
        ));
        System.out.println(String.join("",
            "  *****  ", "  *****  ", " **      ", "  *****  "
        ));
    }
}