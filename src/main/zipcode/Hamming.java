package src.main.zipcode;

public class Hamming {
    String s;
    String s1;

    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (this.s.length() < this.s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if (this.s.length() > this.s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int i = 0;
        int count = 0;
        while (i < s.length()) {
            if (s.charAt(i) != s1.charAt(i)) {
                count++;
            }
            i++;
        }
        return count;
    }
}

