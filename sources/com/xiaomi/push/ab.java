package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import java.util.Map;
/* loaded from: classes6.dex */
public class ab implements v {
    private static volatile ab a;
    private v b;
    private int c;

    public static ab a(Context context) {
        if (a == null) {
            synchronized (ab.class) {
                if (a == null) {
                    a = new ab(context.getApplicationContext());
                }
            }
        }
        return a;
    }

    public final void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            map.put(Constants.Environment.KEY_UDID, null);
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            map.put("oaid", b);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("vaid", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map.put("aaid", null);
        }
        map.put("oaid_type", String.valueOf(this.c));
    }

    @Override // com.xiaomi.push.v
    public final boolean a() {
        return this.b.a();
    }

    @Override // com.xiaomi.push.v
    public final String b() {
        String b = this.b.b();
        return b == null ? "" : b;
    }

    private ab(Context context) {
        v agVar;
        if (jj.a()) {
            aa.a = 1;
            agVar = new z(context);
        } else if (t.a(context)) {
            aa.a = 2;
            agVar = new t(context);
        } else if (ad.a(context)) {
            aa.a = 4;
            agVar = new ad(context);
        } else if (ah.a(context)) {
            aa.a = 5;
            agVar = new ah(context);
        } else if (y.a(context)) {
            aa.a = 3;
            agVar = new w(context);
        } else {
            aa.a = 0;
            agVar = new ag();
        }
        this.b = agVar;
        this.c = aa.a;
        com.xiaomi.channel.commonutils.logger.c.a("create id manager is: " + this.c);
    }
}
