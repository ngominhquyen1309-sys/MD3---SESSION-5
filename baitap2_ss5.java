public class baitap2_ss5 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello, Java World!");

        // In chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: " + text);

        // Xóa các ký tự từ vị trí 5 đến 9
        text.delete(5, 10);
        System.out.println("Chuỗi sau khi xóa: " + text);

        // Thay thế "World" bằng "Universe"
        int start = text.indexOf("World");
        int end = start + "World".length();

        text.replace(start, end, "Universe");
        System.out.println("Chuỗi sau khi thay thế: " + text);
    }
}
