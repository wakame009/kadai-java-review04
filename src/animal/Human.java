package animal;

public class Human {
    
     //Animal クラスを継承し、Thinkable インターフェイスを実装
    public class Human extends Animal implements Thinkable {
        
     //趣味の情報を保管するフィールド、カプセル化
        private String hobby;

        //コンストラクタで名前・年齢・趣味の情報を格納する引数を設定
        public Human(String name, int age, String hobby) {
        
         //名前と年齢の初期化については、スーパークラス（Animal）のコンストラクタを利用
            super(name, age);
            this.hobby = hobby;
            
            @Override
         // think メソッドを実装
            public void think() {
                
            // 私は□□について考えています。
            System.out.println("私は" + hobby + "について考えています。");
            
            
            
            }
            }
    }

}
