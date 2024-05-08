//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.HashMap;//别忘记导入，要不用不了
public class Kl02 {
    public static void main(String[] args) {
        Scanner scan01= new Scanner(System.in);
        HashMap<String,String> userid=new HashMap<String,String>();//可以换个写法更简单
        userid.put("kuiling","123");
        userid.put("rsh","456");
        userid.put("Gario","789");
        System.out.println("FinalFantasyIXV");
        System.out.print("id:");
        String ID=scan01.nextLine();
        System.out.print("password:");
        String Password=scan01.nextLine();

        while (true) {
            if (userid.containsKey(ID)) {
                //从表里找是否包含名为ID所对应字符串的键，例如输入rsh，就去表里找名为rsh的键
                if (userid.get(ID).equals(Password)) {
                //从表里找名为ID的键并提取对应的值与password去比较是否相等
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
        scan01.close(); // 关闭scan
        }
    }
//感觉可以调整一下，Hashmap先写，然后剩下的东西直接丢到循环里，使得不输入正确就一直输入，还可以加一个按某键放弃？（后面补充吧，滚去从0