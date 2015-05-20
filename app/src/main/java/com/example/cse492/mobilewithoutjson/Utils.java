package com.example.cse492.mobilewithoutjson;

/**
 * Created by cse492 on 15/05/15.
 */

/**
 * Created by Manel on 28-Apr-15.
 */
        import java.io.InputStream;
        import java.io.OutputStream;

public class Utils {
    public static void CopyStream(InputStream is, OutputStream os)
    {
        final int buffer_size=1024;
        try
        {
            byte[] bytes=new byte[buffer_size];
            for(;;)
            {
                int count=is.read(bytes, 0, buffer_size);
                if(count==-1)
                    break;
                os.write(bytes, 0, count);
            }
        }
        catch(Exception ex){}
    }
}