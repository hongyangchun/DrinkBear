public class DrinkBear {

    /**
     * @param args
     */
    public static int all = 5;//�ܹ��ܺȶ���ƿ����ʼֵ��5
    public static int leftBottle;//ʣ�¾�ƿ����
    public static int leftTop;//ʣ�¸��Ӹ���
    public static void main(String[] args) {
        all = all + drink(5,5);
        System.out.println("Total Drink"+all);
        System.out.println("left Bottle"+leftBottle);
        System.out.println("left Top"+leftTop);
    }

    public static int drink(int bottle, int top) {
        if(bottle >=2 || top >=4){
            leftBottle = (bottle/2)+(bottle%2)+(top/4);
            leftTop = (top/4) + (top%4) + (bottle/2);

            return (bottle/2) + (top/4) + drink(leftBottle,leftTop);//�ݹ麯��
        }
        return 0;
    }
}