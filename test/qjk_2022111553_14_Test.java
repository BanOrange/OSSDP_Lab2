import org.junit.Test;
import src.Solution14;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 测试类，用于测试第14个题目，个人学号为2022111553
 * 测试策略：最小覆盖各种情况
 * s：
 *    正确字符串：四个零字符串，即只有一种划分方式；长度大于四的正常字符串
 *    错误字符串：长度不足4；含有非法字符；含有负数；含有大于255的数字
 */

public class qjk_2022111553_14_Test {
   /**
    * 测试四个零的输入字符串能否产生结果，即唯一结果0.0.0.0
    */
   @Test
   public void testFourZero(){
      Solution14 solution14 = new Solution14();
      List<String> list = new ArrayList<>();
      list.add("0.0.0.0");
      assertEquals(list,solution14.restoreIpAddresses("0000"));
   }

   /**
    * 测试正确的字符串输入能否带来正确的结果
    * 测试用例为101023,25525511135
    */
   @Test
   public void testForRight(){
      Solution14 solution0 = new Solution14();
      List<String> list = new ArrayList<>();
      list.add("1.0.10.23");
      list.add("1.0.102.3");
      list.add("10.1.0.23");
      list.add("10.10.2.3");
      list.add("101.0.2.3");
      assertEquals(list,solution0.restoreIpAddresses("101023"));

      Solution14 solution1 = new Solution14();
      List<String> list1 = new ArrayList<>();
      list1.add("255.255.11.135");
      list1.add("255.255.111.35");
      assertEquals(list1,solution1.restoreIpAddresses("25525511135"));
   }

   /**
    * 测试不足4个数字时是否会产生输出
    * 测试用例为111
    */
   @Test
   public void testForLessFour(){
      Solution14 solution0 = new Solution14();
      List<String> list = new ArrayList<>();
      assertEquals(list,solution0.restoreIpAddresses("111"));
   }

   /**
    * 测试各种非法输入，包括含有非法符号@，含有.，负数，超过上界等
    * 测试用例为111@,1.1.1.1,255256257258,-9999
    */
   @Test
   public void testForWrong(){
      Solution14 solution0 = new Solution14();
      List<String> list = new ArrayList<>();
      assertEquals(list,solution0.restoreIpAddresses("111@"));
      assertEquals(list,solution0.restoreIpAddresses("1.1.1.1"));
      assertEquals(list,solution0.restoreIpAddresses("255256257258"));
      assertEquals(list,solution0.restoreIpAddresses("-9999"));
   }

}
