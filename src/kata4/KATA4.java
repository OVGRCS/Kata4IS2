package kata4;

import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Omaro Vega
 */
public class KATA4 {

    public static void main(String[] args) throws IOException{
        
        String name = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\KATA4\\DATA\\emails.txt";
        
        ArrayList<String> listMail = MailList.read(name);
        Histogram<String> histogram = MainHistogramBuilder.build(listMail);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}