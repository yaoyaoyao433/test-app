package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public class x {
    private static volatile x a;
    private Context b;
    private List<bk> c = new ArrayList();

    private x(Context context) {
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
    }

    public static x a(Context context) {
        if (a == null) {
            synchronized (x.class) {
                if (a == null) {
                    a = new x(context);
                }
            }
        }
        return a;
    }

    public final synchronized String a(am amVar) {
        return this.b.getSharedPreferences("mipush_extra", 0).getString(amVar.name(), "");
    }

    public final synchronized void a(am amVar, String str) {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(amVar.name(), str).commit();
    }

    public final void a(String str) {
        synchronized (this.c) {
            bk bkVar = new bk();
            bkVar.a = 0;
            bkVar.b = str;
            if (this.c.contains(bkVar)) {
                this.c.remove(bkVar);
            }
            this.c.add(bkVar);
        }
    }

    public final void b(String str) {
        synchronized (this.c) {
            bk bkVar = new bk();
            bkVar.b = str;
            if (this.c.contains(bkVar)) {
                Iterator<bk> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bk next = it.next();
                    if (bkVar.equals(next)) {
                        bkVar = next;
                        break;
                    }
                }
            }
            bkVar.a++;
            this.c.remove(bkVar);
            this.c.add(bkVar);
        }
    }

    public final int c(String str) {
        synchronized (this.c) {
            bk bkVar = new bk();
            bkVar.b = str;
            if (this.c.contains(bkVar)) {
                for (bk bkVar2 : this.c) {
                    if (bkVar2.equals(bkVar)) {
                        return bkVar2.a;
                    }
                }
            }
            return 0;
        }
    }

    public final void d(String str) {
        synchronized (this.c) {
            bk bkVar = new bk();
            bkVar.b = str;
            if (this.c.contains(bkVar)) {
                this.c.remove(bkVar);
            }
        }
    }

    public final boolean e(String str) {
        synchronized (this.c) {
            bk bkVar = new bk();
            bkVar.b = str;
            return this.c.contains(bkVar);
        }
    }
}
