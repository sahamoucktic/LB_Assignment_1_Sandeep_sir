import java.util.Date;
import java.text.SimpleDateFormat;

class SimplDatFormat{
    public static void main(String [] args)throws Exception{
        String Pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(Pattern);
        String source = "25/08/1996";
        Date dat = sdf.parse(source);
    }
}