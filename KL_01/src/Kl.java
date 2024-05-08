//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.net.IDN;
import java.util.Scanner;
import java.util.HashMap;//别忘记导入，要不用不了
public class Kl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //在包中的Scanner类里创建了一个叫做scanner的对象
        //new Scanner（）是给新的对象传递参数，（）里面是参数，System.in是从键盘上读取值给到这个新对象
        System.out.print("欢迎使用Windows ");
        System.out.print("\nID: ");
        String ID = scanner.nextLine();
        //以行为分隔读取输入的字符，next（）是以空格为分隔，会导致包含空格的字符不能被正确读取
        System.out.print("Password:");
        String Password = scanner.nextLine();


        HashMap<String, String> 用户信息 = new HashMap<>();
        //定义一个新的HashMap用来存储玩家信息，后面会调用做对比
        //HashMap<String, String>这个表里面的键和值都是String类型
        用户信息.put("账号", "kuiling");
        用户信息.put("密码", "123456");

        String correctID=用户信息.get("账号");
        String correctPassword=用户信息.get("密码");
        //把表里“账号”的值赋予给一个叫correctID的变量，密码同理

        while (true) {
            //循环得写while，不能上来就if
            if (correctID.equals(ID)) {
                //判断correctID是否等于ID如果等于跳转到下面的密码检测，如果不等于再输入密码后提示错误。
                if (correctPassword.equals(Password)) {
                    break;
                } else {
                    System.out.println("账号或密码错误");
                    break;
                }
            } else {
                System.out.println("账号或密码错误");
                break;
            }
        }
        scanner.close(); // 关闭scanner
    }
}
//感觉可以调整一下，Hashmap先写，然后剩下的东西直接丢到循环里，使得不输入正确就一直输入，还可以加一个按某键放弃？