package menu.view;

public enum Message {
    START("점심 메뉴 추천을 시작합니다."),
    INPUT_COACH("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_NO_EAT("(이)가 못 먹는 메뉴를 입력해 주세요.");


    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}