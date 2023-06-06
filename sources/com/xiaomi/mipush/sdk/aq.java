package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.p;
import com.xiaomi.push.db;
import com.xiaomi.push.dh;
import com.xiaomi.push.dl;
import com.xiaomi.push.ha;
import com.xiaomi.push.he;
import com.xiaomi.push.hg;
import com.xiaomi.push.hl;
import com.xiaomi.push.ho;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.jj;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class aq implements dl {
    @Override // com.xiaomi.push.dl
    public final void a(Context context, HashMap<String, String> hashMap) {
        ia iaVar = new ia();
        iaVar.d = dh.a(context).b;
        iaVar.i = dh.a(context).c;
        iaVar.e = hl.AwakeAppResponse.ah;
        iaVar.c = com.xiaomi.push.service.ad.a();
        iaVar.h = hashMap;
        ag.a(context).a((ag) iaVar, ha.Notification, true, (ho) null, true);
        com.xiaomi.channel.commonutils.logger.c.a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.dl
    public final void b(Context context, HashMap<String, String> hashMap) {
        String a = db.a(hashMap);
        he heVar = new he();
        heVar.g = "category_awake_app";
        heVar.c = "wake_up_app";
        heVar.a(1L);
        heVar.b = a;
        p.a.a().a(heVar);
        com.xiaomi.channel.commonutils.logger.c.a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.dl
    public final void c(Context context, HashMap<String, String> hashMap) {
        com.xiaomi.channel.commonutils.logger.c.a("MoleInfo：\u3000" + db.b(hashMap));
        String str = hashMap.get("awake_info");
        if ("1007".equals(hashMap.get("event_type"))) {
            com.xiaomi.channel.commonutils.logger.c.a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("awake_info", str);
            hashMap2.put("event_type", "9999");
            hashMap2.put("description", "ping message");
            ia iaVar = new ia();
            iaVar.d = ap.a(context).b.a;
            iaVar.i = context.getPackageName();
            iaVar.e = hl.AwakeAppResponse.ah;
            iaVar.c = com.xiaomi.push.service.ad.a();
            iaVar.h = hashMap2;
            boolean a = com.xiaomi.push.service.z.a(context).a(hg.AwakeAppPingSwitch.by, false);
            int a2 = com.xiaomi.push.service.z.a(context).a(hg.AwakeAppPingFrequency.by, 0);
            if (a2 >= 0 && a2 < 30) {
                com.xiaomi.channel.commonutils.logger.c.c("aw_ping: frquency need > 30s.");
                a2 = 30;
            }
            if (a2 < 0) {
                a = false;
            }
            if (jj.a()) {
                if (a) {
                    com.xiaomi.push.m.a(context.getApplicationContext()).a(new bd(iaVar, context), a2, 0);
                    return;
                }
                return;
            }
            byte[] a3 = ik.a(iaVar);
            if (a3 == null) {
                com.xiaomi.channel.commonutils.logger.c.a("send message fail, because msgBytes is null.");
                return;
            }
            Intent intent = new Intent();
            intent.setAction("action_help_ping");
            intent.putExtra("extra_help_ping_switch", a);
            intent.putExtra("extra_help_ping_frequency", a2);
            intent.putExtra("mipush_payload", a3);
            intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
            ag.a(context).a(intent);
        }
    }
}
