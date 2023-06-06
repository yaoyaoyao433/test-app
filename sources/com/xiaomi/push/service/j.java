package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ha;
import com.xiaomi.push.hl;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.service.ax;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class j extends ax.a {
    final /* synthetic */ XMPushService a;
    final /* synthetic */ cm b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, long j, XMPushService xMPushService, cm cmVar) {
        super(str, j);
        this.a = xMPushService;
        this.b = cmVar;
    }

    @Override // com.xiaomi.push.service.ax.a
    final void a(ax axVar) {
        com.xiaomi.push.ab a = com.xiaomi.push.ab.a(this.a);
        String a2 = axVar.a("MSAID", "msaid");
        String str = ((String) null) + a.b() + ((String) null) + ((String) null);
        if (TextUtils.isEmpty(str) || TextUtils.equals(a2, str)) {
            return;
        }
        ax.a("MSAID", "msaid", str);
        ia iaVar = new ia();
        iaVar.d = this.b.d;
        iaVar.e = hl.ClientInfoUpdate.ah;
        iaVar.c = ad.a();
        iaVar.h = new HashMap();
        a.a(iaVar.h);
        this.a.a(this.a.getPackageName(), ik.a(h.a(this.a.getPackageName(), this.b.d, iaVar, ha.Notification)), true);
    }
}
