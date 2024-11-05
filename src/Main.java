// Product 인터페이스
interface Button {
    void render();
    void onClick();
}

// ConcreteProduct 1: WindowsButton
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("윈도우 스타일 버튼을 렌더링합니다.");
    }

    @Override
    public void onClick() {
        System.out.println("윈도우 버튼 클릭!");
    }
}

// ConcreteProduct 2: WebButton
class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("웹 스타일 버튼을 렌더링합니다.");
    }

    @Override
    public void onClick() {
        System.out.println("웹 버튼 클릭!");
    }
}

// Creator 클래스
abstract class Dialog {
    // 팩토리 메서드
    public abstract Button createButton();

    public void renderWindow() {
        Button button = createButton();
        button.render();
        button.onClick();
    }
}

// ConcreteCreator 1: WindowsDialog
class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

// ConcreteCreator 2: WebDialog
class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}

