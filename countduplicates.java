import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class countduplicates {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=readFile();
        System.out.println(getCount(br));
    }


    static BufferedReader readFile() throws IOException
    {
        File f=new File("C:\\Users\\MT1063\\Documents\\sampletest.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));

        return br;
    }

    static HashMap<String,Integer> getCount(BufferedReader br) throws IOException
    {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        String st;
        while((st=br.readLine())!=null)
        {
            StringTokenizer st1=new StringTokenizer(st);
            while(st1.hasMoreTokens())
            {
                String k=st1.nextToken();
                if(hm.containsKey(k))
                {
                    Integer c =hm.get(k);
                    hm.put(k,++c);
                }
                else
                {
                    hm.put(k,1);

                }

            }
        }
        return hm;
    }
}
