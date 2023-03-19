package test_url;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class TestUrl {
    public static void main(String[] args)
    {
        try
        {
              URL url = new URL("http://10.248.68.11:80/Document_WS?wsdl");
            // URL url = new URL("http://192.168.1.105:8322/netyuz/createTicketService?wsdl");
            URLConnection urlcon=url.openConnection();
            System.out.println("------------------------------------");
            // System.out.println(url.toExternalForm());
            Source source = new StreamSource(url.toExternalForm());
            //System.out.println(source.getSystemId());
            URL url1 = getEncodedURL(((Source)source).getSystemId());
            System.out.println(url1);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static URL getEncodedURL(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        String scheme = String.valueOf(url.getProtocol()).toLowerCase();
        if (!scheme.equals("http") && !scheme.equals("https")) {
            return url;
        } else {
            try {
                return new URL(url.toURI().toASCIIString());
            } catch (URISyntaxException var5) {
                MalformedURLException malformedURLException = new MalformedURLException(var5.getMessage());
                malformedURLException.initCause(var5);
                throw malformedURLException;
            }
        }
    }
}
