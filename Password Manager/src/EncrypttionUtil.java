public class EncrypttionUtil {

    public static String encrypt(String password) {
        int shift = 2;
        return password.substring(shift) + password.substring(0, shift);
    }

    public static String decrypt(String password) {
        int shift = 2;
        int size = password.length();
        return password.substring(size - shift) + password.substring(0, size - shift);
    }
}
