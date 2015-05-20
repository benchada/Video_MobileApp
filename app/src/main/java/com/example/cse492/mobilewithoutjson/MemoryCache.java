package com.example.cse492.mobilewithoutjson;

/**
 * Created by cse492 on 15/05/15.
 */

/**
 * Created by Manel on 28-Apr-15.
 */
        import java.lang.ref.SoftReference;
        import java.util.Collections;
        import java.util.HashMap;
        import java.util.Map;
        import android.graphics.Bitmap;

public class MemoryCache {
    private Map<String, SoftReference<Bitmap>> cache=Collections.synchronizedMap(new HashMap<String, SoftReference<Bitmap>>());

    public Bitmap get(String id){
        if(!cache.containsKey(id))
            return null;
        SoftReference<Bitmap> ref=cache.get(id);
        return ref.get();
    }

    public void put(String id, Bitmap bitmap){
        cache.put(id, new SoftReference<Bitmap>(bitmap));
    }

    public void clear() {
        cache.clear();
    }
}