package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class as extends m.a {
    private Context a;

    public as(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (com.xiaomi.clientreport.manager.b.a(this.a).a().b) {
                com.xiaomi.channel.commonutils.logger.c.c(this.a.getPackageName() + " begin upload event");
                com.xiaomi.clientreport.manager.b a = com.xiaomi.clientreport.manager.b.a(this.a);
                if (a.a().b) {
                    au auVar = new au();
                    auVar.b = a.d;
                    auVar.a = a.g;
                    a.a.execute(auVar);
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }
}
