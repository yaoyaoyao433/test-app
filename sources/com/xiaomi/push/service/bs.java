package com.xiaomi.push.service;

import com.xiaomi.push.da;
import com.xiaomi.push.fo;
import com.xiaomi.push.fr;
import java.util.Map;
/* loaded from: classes6.dex */
public final class bs extends fo {
    final /* synthetic */ XMPushService h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(XMPushService xMPushService, Map map, int i, String str, fr frVar) {
        super(null, 5222, str, null);
        this.h = xMPushService;
    }

    @Override // com.xiaomi.push.fo
    public final byte[] b() {
        try {
            da.b bVar = new da.b();
            bVar.a(av.a().d());
            return bVar.d();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
