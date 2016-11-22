/**
 * Created by ayako_sayama on 2016/11/21.
 */
public class SUPERHUMAN extends HUMAN {
    private String nickName;

    /**
     * super: 継承元のコンストラクタ（クラスを作成したときに呼ばれるやつ（メソッド名＝クラス名））を呼ぶ
     * @param firstName
     * @param lastName
     * @param nickName
     */
    public SUPERHUMAN(String firstName, String lastName, String nickName) {
        // まずファーストネームとラストネームの初期化
        super(firstName, lastName);
        // ニックネーム初期化
        this.nickName = nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void printAllinfo()
    {
        super.printAllinfo();
        System.out.println(nickName);
        return;
    }
}
