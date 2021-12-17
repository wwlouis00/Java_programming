import java.util.*;
import java.text.DateFormat;
class Jdate{
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance(new Locale("ja", "JP", "JP"));
      DateFormat dtform = DateFormat.getDateInstance(
         DateFormat.FULL,new Locale("ja", "JP", "JP"));
      cal.setTime(new Date());
      String[] era = { "　", "明治", "大正", "昭和", "平成" };
      String eraName = era [cal.get(Calendar.ERA)];
      System.out.println("現在年號 ＝" + eraName);
      String formatted = dtform.format(new Date());
      System.out.println(formatted);
   }
}