package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ha;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
/* loaded from: classes6.dex */
public final class bi implements Runnable {
    final /* synthetic */ ia a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bi(ia iaVar) {
        this.a = iaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        byte[] a = ik.a(h.a(this.a.i, this.a.d, this.a, ha.Notification));
        context = bh.c;
        if (!(context instanceof XMPushService)) {
            com.xiaomi.channel.commonutils.logger.c.a("UNDatas UploadNotificationDatas failed because not xmsf");
            return;
        }
        context2 = bh.c;
        ((XMPushService) context2).a(this.a.i, a, true);
    }
}
