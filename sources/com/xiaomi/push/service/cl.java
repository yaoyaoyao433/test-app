package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ha;
import com.xiaomi.push.ho;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public final class cl extends XMPushService.j {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ String c;
    final /* synthetic */ ck d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(ck ckVar, int i, String str, List list, String str2) {
        super(4);
        this.d = ckVar;
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        ck ckVar = this.d;
        String str = this.a;
        String string = "com.xiaomi.xmsf".equals(str) ? "1000271" : ckVar.a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
        ArrayList<ia> a = az.a(this.b, this.a, string, 32768);
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
            return;
        }
        Iterator<ia> it = a.iterator();
        while (it.hasNext()) {
            ia next = it.next();
            next.a("uploadWay", "longXMPushService");
            hx a2 = h.a(this.a, string, next, ha.Notification);
            if (!TextUtils.isEmpty(this.c) && !TextUtils.equals(this.a, this.c)) {
                if (a2.h == null) {
                    ho hoVar = new ho();
                    hoVar.a = "-1";
                    a2.h = hoVar;
                }
                ho hoVar2 = a2.h;
                String str2 = this.c;
                if (hoVar2.k == null) {
                    hoVar2.k = new HashMap();
                }
                hoVar2.k.put("ext_traffic_source_pkg", str2);
            }
            this.d.a.a(this.a, ik.a(a2), true);
        }
    }
}
