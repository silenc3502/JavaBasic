package Fifth;

// Good Abstraction을 달성하기 위한 최소한의 두 가지 조건
// 1. 사용하는 데이터와
//    해당 데이터를 제어할 수 있는 기능(매서드)을 캡슐화한다.
// 2. 정보 은닉(공개할 필요 없는 정보는 은폐한다)
class ACL {
    // private은 비공개 데이터
    private int x, y;

    // public은 공개 데이터
    public ACL(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class ACLTest {
    public static void main(String[] args) {
        ACL acl = new ACL(1000000000, 7);

        //acl.x = 0;
        //acl.y = 0;

        System.out.println(
            "x = " + acl.getX() +
            ", y = " + acl.getY()
        );
    }
}
