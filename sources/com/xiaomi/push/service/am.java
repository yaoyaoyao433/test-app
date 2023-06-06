package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.db;
import com.xiaomi.push.dh;
import com.xiaomi.push.dl;
import com.xiaomi.push.gy;
import com.xiaomi.push.ha;
import com.xiaomi.push.he;
import com.xiaomi.push.hl;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class am implements dl {
    @Override // com.xiaomi.push.dl
    public final void c(Context context, HashMap<String, String> hashMap) {
        com.xiaomi.channel.commonutils.logger.c.a("MoleInfo：\u3000" + db.b(hashMap));
    }

    @Override // com.xiaomi.push.dl
    public final void a(Context context, HashMap<String, String> hashMap) {
        ia iaVar = new ia();
        iaVar.d = dh.a(context).b;
        iaVar.i = dh.a(context).c;
        iaVar.e = hl.AwakeAppResponse.ah;
        iaVar.c = ad.a();
        iaVar.h = hashMap;
        byte[] a = ik.a(h.a(iaVar.i, iaVar.d, iaVar, ha.Notification));
        if (context instanceof XMPushService) {
            com.xiaomi.channel.commonutils.logger.c.a("MoleInfo : send data directly in pushLayer " + iaVar.c);
            ((XMPushService) context).a(context.getPackageName(), a, true);
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("MoleInfo : context is not correct in pushLayer " + iaVar.c);
    }

    @Override // com.xiaomi.push.dl
    public final void b(Context context, HashMap<String, String> hashMap) {
        gy a = gy.a(context);
        if (a != null) {
            String a2 = db.a(hashMap);
            String packageName = a.a.getPackageName();
            String packageName2 = a.a.getPackageName();
            he heVar = new he();
            heVar.g = "category_awake_app";
            heVar.c = "wake_up_app";
            heVar.a(1L);
            heVar.b = a2;
            heVar.a(true);
            heVar.a = "push_sdk_channel";
            heVar.h = packageName2;
            a.a(heVar, packageName);
        }
    }
}
