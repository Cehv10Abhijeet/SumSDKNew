package com.example.sumsdk;


    public class SumSdkCalculator {
        // Public method to calculate the sum of two numbers
        public static int calculateSum(int num1, int num2) {
            return SumCalculator.calculateSum(num1, num2);
        }

        // Internal implementation details hidden from users
        private static class SumCalculator {
            private static int calculateSum(int num1, int num2) {
                // Actual implementation logic
                return num1 + num2;
            }
        }
    }