package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.common.StringUtil;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class dh {
    private static volatile dh f;
    public Context a;
    public String b;
    public String c;
    public int d;
    public dl e;
    private HashMap<dj, dk> g = new HashMap<>();

    private dh(Context context) {
        this.a = context;
        this.g.put(dj.SERVICE_ACTION, new dn());
        this.g.put(dj.SERVICE_COMPONENT, new Cdo());
        this.g.put(dj.ACTIVITY, new df());
        this.g.put(dj.PROVIDER, new dm());
    }

    public static dh a(Context context) {
        if (f == null) {
            synchronized (dh.class) {
                if (f == null) {
                    f = new dh(context);
                }
            }
        }
        return f;
    }

    public static boolean b(Context context) {
        return com.xiaomi.push.service.l.a(context, context.getPackageName());
    }

    public final void a(dj djVar, Context context, Intent intent, String str) {
        if (djVar != null) {
            this.g.get(djVar).a(context, intent, str);
        } else {
            dc.a(context, StringUtil.NULL, 1008, "A receive a incorrect message with empty type");
        }
    }

    public final void a(String str, String str2, int i, dl dlVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = dlVar;
    }
}
