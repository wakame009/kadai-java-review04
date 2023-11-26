package animal;

class Animal {

    // 名前を格納するフィールド
    private String name;
    
    //年齢を格納するフィールド
    private int age;
    
    // コンストラクタに名前・年齢の情報を格納する引数を設定し、
    // 処理内容として名前・年齢の各フィールドを引数の情報で初期化
    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    
    //say という名前のpublicなメソッドを定義
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}