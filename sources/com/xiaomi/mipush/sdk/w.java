package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ha;
import com.xiaomi.push.hh;
import com.xiaomi.push.hl;
import com.xiaomi.push.ho;
import com.xiaomi.push.ht;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class w extends m.a {
    private Context a;

    public w(Context context) {
        this.a = context;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.xiaomi.push.service.z a = com.xiaomi.push.service.z.a(this.a);
        ht htVar = new ht();
        htVar.a = com.xiaomi.push.service.aa.a(a, hh.MISC_CONFIG);
        htVar.a(true);
        htVar.b = com.xiaomi.push.service.aa.a(a, hh.PLUGIN_CONFIG);
        htVar.b(true);
        ia iaVar = new ia("-1", false);
        iaVar.e = hl.DailyCheckClientConfig.ah;
        iaVar.a(ik.a(htVar));
        ag.a(this.a).a((ag) iaVar, ha.Notification, (ho) null);
    }
}
