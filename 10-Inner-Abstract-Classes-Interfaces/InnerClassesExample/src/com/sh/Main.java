package com.sh;

public class Main {

    public static void main(String[] args) {
	    class ShowBits {
	        int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;
                mask <<= numbits-1;
                int spacer = 0;
                for (; mask != 0; mask >>>=1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }
    }
}
