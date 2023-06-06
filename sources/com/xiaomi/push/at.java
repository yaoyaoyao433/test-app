package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class at extends m.a {
    private Context a;

    public at(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (com.xiaomi.clientreport.manager.b.a(this.a).a().c) {
                com.xiaomi.clientreport.manager.b a = com.xiaomi.clientreport.manager.b.a(this.a);
                if (a.a().c) {
                    au auVar = new au();
                    auVar.a = a.h;
                    auVar.b = a.d;
                    a.a.execute(auVar);
                }
                com.xiaomi.channel.commonutils.logger.c.c(this.a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.d("fail to send perf data. " + e);
        }
    }
}
