package com.tencent.smtt.sdk;

import android.os.HandlerThread;
/* loaded from: classes6.dex */
public class o extends HandlerThread {
    private static o a;

    public o(String str) {
        super(str);
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (a == null) {
                o oVar2 = new o("TbsHandlerThread");
                a = oVar2;
                oVar2.start();
            }
            oVar = a;
        }
        return oVar;
    }
}
