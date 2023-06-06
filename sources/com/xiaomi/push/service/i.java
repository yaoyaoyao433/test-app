package com.xiaomi.push.service;

import android.text.TextUtils;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import com.xiaomi.push.ha;
import com.xiaomi.push.hf;
import com.xiaomi.push.hl;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.service.ax;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class i extends ax.a {
    final /* synthetic */ XMPushService a;
    final /* synthetic */ cm b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, long j, XMPushService xMPushService, cm cmVar) {
        super(str, 172800L);
        this.a = xMPushService;
        this.b = cmVar;
    }

    @Override // com.xiaomi.push.service.ax.a
    final void a(ax axVar) {
        String a = axVar.a("GAID", GroupAnnouncement.GROUP_ANNOUNCEMENT_ID);
        String a2 = hf.a(this.a);
        if (TextUtils.isEmpty(a2) || TextUtils.equals(a, a2)) {
            return;
        }
        ax.a("GAID", GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, a2);
        ia iaVar = new ia();
        iaVar.d = this.b.d;
        iaVar.e = hl.ClientInfoUpdate.ah;
        iaVar.c = ad.a();
        iaVar.h = new HashMap();
        iaVar.h.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, a2);
        this.a.a(this.a.getPackageName(), ik.a(h.a(this.a.getPackageName(), this.b.d, iaVar, ha.Notification)), true);
    }
}
