// 클라이언트 코드
public class FactoryMethodExample {
    public static void main(String[] args) {
        Dialog dialog;

        // 윈도우 버튼을 생성하는 팩토리
        dialog = new WindowsDialog();
        dialog.renderWindow();

        // 웹 버튼을 생성하는 팩토리
        dialog = new WebDialog();
        dialog.renderWindow();
    }
}