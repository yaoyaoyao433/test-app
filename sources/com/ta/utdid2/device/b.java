package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.a.a.g;
import java.util.zip.Adler32;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static a a;
    public static final Object d = new Object();

    public static long a(a aVar) {
        if (aVar != null) {
            String format = String.format("%s%s%s%s%s", aVar.f(), aVar.getDeviceId(), Long.valueOf(aVar.a()), aVar.getImsi(), aVar.e());
            if (g.m29a(format)) {
                return 0L;
            }
            Adler32 adler32 = new Adler32();
            adler32.reset();
            adler32.update(format.getBytes());
            return adler32.getValue();
        }
        return 0L;
    }

    public static synchronized a b(Context context) {
        synchronized (b.class) {
            a aVar = a;
            if (aVar != null) {
                return aVar;
            }
            if (context != null) {
                a a2 = a(context);
                a = a2;
                return a2;
            }
            return null;
        }
    }

    public static a a(Context context) {
        if (context != null) {
            synchronized (d) {
                String value = c.a(context).getValue();
                if (g.m29a(value)) {
                    return null;
                }
                if (value.endsWith("\n")) {
                    value = value.substring(0, value.length() - 1);
                }
                a aVar = new a();
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = com.ta.utdid2.a.a.e.a(context);
                String c = com.ta.utdid2.a.a.e.c(context);
                aVar.d(a2);
                aVar.b(a2);
                aVar.b(currentTimeMillis);
                aVar.c(c);
                aVar.e(value);
                aVar.a(a(aVar));
                return aVar;
            }
        }
        return null;
    }
}
