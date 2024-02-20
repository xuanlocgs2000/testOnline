
import java.util.HashSet;
import java.util.Scanner;
class testOnline {
        public static int countVietnameseLetters(String input) {
        HashSet<String> vietnameseLetters = new HashSet<>();//HashSet để lưu các ký tự Tiếng Việt
        vietnameseLetters.add("aw");
        vietnameseLetters.add("aa");
        vietnameseLetters.add("dd");
        vietnameseLetters.add("ee");
        vietnameseLetters.add("oo");
        vietnameseLetters.add("ow");
        vietnameseLetters.add("w");

        int count = 0;
        int i = 0;
        //Duyệt qua từng ký tự trong chuỗi nhập vào. Trong mỗi vòng lặp,  kiểm tra xem ký tự hiện tại có phải là một ký tự Tiếng Việt không
        while (i < input.length()) {
            //case 1: vị trí hiện tại nhỏ hơn chiều dài của chuỗi và còn ít nhất một ký tự nữa sau ký tự hiện tại
            if (i < input.length() - 1) {
                String twoChars = input.substring(i, i + 2);//Lấy hai ký tự từ vị trí i                
                if (vietnameseLetters.contains(twoChars)) {
                    count++; // Nếu đúng, tăng biến đếm lên 1
                    i += 2;// Di chuyển chỉ số i lên 2 để bỏ qua ký tự tiếp theo
                    continue;
                }
            }
            //case 2: chỉ lấy được một ký tự từ vị trí i
            String oneChar = input.substring(i, i + 1);
            if (vietnameseLetters.contains(oneChar)) {
                count++;// Nếu đúng, tăng biến đếm lên 1
            }
            i++;
        }
        return count;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "input:");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println("vietnamese letters: " + countVietnameseLetters(input));
    }
}
























