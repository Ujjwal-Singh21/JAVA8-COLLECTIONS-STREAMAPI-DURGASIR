package com.Java8.FunctionalInterfaces;
import java.util.function.Supplier;

//supplier that generate a 6 digit random otp
public class SupplierDemo2 {
    public static void main(String[] args) {

        Supplier<String> otpSupplier = () -> {
            String otp = " ";
            for (int i = 1; i <= 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }

            return otp;
        };

        //calling Supplier to get 6 digit OTP
        System.out.println(otpSupplier.get());
    }
}
