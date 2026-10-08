package exercise08;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên (100 - 999): ");

        // Kiểm tra xem người dùng có nhập số nguyên hay không
        if (!scanner.hasNextInt()) {
            System.out.println("Số nhập vào không hợp lệ");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();

        // Kiểm tra điều kiện phạm vi từ 100 đến 999
        if (n < 100 || n > 999) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            // Tách các chữ số hàng trăm, hàng chục, hàng đơn vị
            int hundreds = n / 100;
            int tens = (n % 100) / 10;
            int units = n % 10;

            String result = "";

            // Đọc hàng trăm
            switch (hundreds) {
                case 1: result += "Một trăm"; break;
                case 2: result += "Hai trăm"; break;
                case 3: result += "Ba trăm"; break;
                case 4: result += "Bốn trăm"; break;
                case 5: result += "Năm trăm"; break;
                case 6: result += "Sáu trăm"; break;
                case 7: result += "Bảy trăm"; break;
                case 8: result += "Tám trăm"; break;
                case 9: result += "Chín trăm"; break;
            }

            // Đọc hàng chục và hàng đơn vị
            if (tens == 0) {
                if (units != 0) {
                    result += " lẻ ";
                    switch (units) {
                        case 1: result += "một"; break;
                        case 2: result += "hai"; break;
                        case 3: result += "ba"; break;
                        case 4: result += "bốn"; break;
                        case 5: result += "năm"; break;
                        case 6: result += "sáu"; break;
                        case 7: result += "bảy"; break;
                        case 8: result += "tám"; break;
                        case 9: result += "chín"; break;
                    }
                }
            } else if (tens == 1) {
                result += " mười";
                if (units == 1) {
                    result += " một";
                } else if (units == 5) {
                    result += " lăm";
                } else if (units > 0) {
                    switch (units) {
                        case 2: result += " hai"; break;
                        case 3: result += " ba"; break;
                        case 4: result += " bốn"; break;
                        case 6: result += " sáu"; break;
                        case 7: result += " bảy"; break;
                        case 8: result += " tám"; break;
                        case 9: result += " chín"; break;
                    }
                }
            } else {
                // Trường hợp hàng chục từ 2 đến 9
                switch (tens) {
                    case 2: result += " hai mươi"; break;
                    case 3: result += " ba mươi"; break;
                    case 4: result += " bốn mươi"; break;
                    case 5: result += " năm mươi"; break;
                    case 6: result += " sáu mươi"; break;
                    case 7: result += " bảy mươi"; break;
                    case 8: result += " tám mươi"; break;
                    case 9: result += " chín mươi"; break;
                }

                if (units == 1) {
                    result += " mốt";
                } else if (units == 5) {
                    result += " lăm";
                } else if (units > 0) {
                    switch (units) {
                        case 2: result += " hai"; break;
                        case 3: result += " ba"; break;
                        case 4: result += " bốn"; break;
                        case 6: result += " sáu"; break;
                        case 7: result += " bảy"; break;
                        case 8: result += " tám"; break;
                        case 9: result += " chín"; break;
                    }
                }
            }

            // In kết quả cuối cùng
            System.out.println(result);
        }

        scanner.close();
    }
}