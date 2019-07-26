package practice;

public class Anonymous {
    private int field;

    public void method(final int arg1, int arg2) {
        final int var1 = 0;
        int var2 =0;

        field = 10;

//        arg1=20;
//        arg2 = 20; //(x)
//
//        var1 = 30;
//        var2 = 30; //(x)

        //익명겍체에서 사용된 매개 변수와 로컬 변수는 (속해있는 메소드 안의) 모두 final 특성을 갖는다는 것만 알면 된다
        //메소드 내에서 생성된 익명 객체는 메소드 실행이 끝나도 힙 메모리에존재 해서 계속 사용할 수 있다.

        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };
        System.out.println(calc.sum());
    }
}
