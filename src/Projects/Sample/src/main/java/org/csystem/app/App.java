/*----------------------------------------------------------------------------------------------------------------------
    ~
    << >> >>>
    &
    ^
    |
    >>=, <<=, >>>=, &=, |=, ^=
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        WriteBitsByteTest.run();
    }
}

class WriteBitsByteTest {
    public static void run()
    {
        for (;;) {
            var a = Console.readByte("Bir sayı giriniz:");

            Util.writeBits(a);
            if (a == 0)
                break;
        }
    }
}

class Util {
    private static void writeBits(String bitStr, int bitsLength)
    {
        var lengthOfZeros = bitsLength - bitStr.length();

        Console.writeLine(lengthOfZeros != 0 ? String.format("%0" + lengthOfZeros + "d%s", 0, bitStr) : bitStr);
    }

    private Util()
    {
    }

    public static void writeBits(int a)
    {
        writeBits(Integer.toBinaryString(a), 32);
    }

    public static void writeBits(long a)
    {
        writeBits(Long.toBinaryString(a), 64);
    }

    public static void writeBits(short a)
    {
        writeBits(Integer.toBinaryString(a), 16);
    }

    public static void writeBits(byte a)
    {
        writeBits(Integer.toBinaryString(a), 8);
    }

    public static void writeBits(char a)
    {
        writeBits(Integer.toBinaryString(a), 16);
    }
}

