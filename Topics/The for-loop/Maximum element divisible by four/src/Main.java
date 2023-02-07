import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        //序列中始终有一个可被 4 整除的元素，并且元素的数量不超过 1000。
        //
        //作为输入，程序接收序列 n（第一行）中的元素数量，然后接收元素本身（接下来的 n 行）。
        /*给定一个自然数序列，不超过 30000。
         * 求出可被 4 整除的最大元素。
         * 首先，输入元素的数量。
         * 然后输入元素本身。
         * 它测试每个元素以查看它是否可以被 4 整除。
         * 然后它测试每个新数字是否大于最大值。
         * 如果输入的数字的两个测试都为真，则它将成为新的最大值。
         *
         *
         * 在序列中，始终有一个可被 4 整除的元素。
         * 元素数量不超过 1000 个。
         * 程序应打印单个数字：序列中可被 4 整除的最大元素*/
        final int FOUR = 4;
        int number = scanner.nextInt();
        int max = 4;
        for (int i = 0; i < number; i++) {
            int newNumber = scanner.nextInt();
            if (newNumber % 4 == 0) {
                if (newNumber > max){
                    max = newNumber;
                }
            }

        }
        System.out.println(max);
    }
}
