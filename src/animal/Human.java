package animal;

class Human extends Animal implements Thinkable {

    // 趣味情報を保管するフィールド
    private String hobby;

    //名前と年齢の初期化はスーパークラス（Animal）のコンストラクタを利用
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}