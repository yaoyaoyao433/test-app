package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.mipush.sdk.p;
import com.xiaomi.push.ha;
import com.xiaomi.push.he;
import com.xiaomi.push.ho;
import com.xiaomi.push.ia;
import java.util.Arrays;
/* loaded from: classes6.dex */
public final class u implements Runnable {
    final /* synthetic */ p.a.C1517a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(p.a.C1517a c1517a) {
        this.a = c1517a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        if (this.a.b.size() != 0) {
            p.a.C1517a c1517a = this.a;
            he remove = c1517a.b.remove(0);
            context = p.a.this.b;
            String packageName = context.getPackageName();
            context2 = p.a.this.b;
            for (ia iaVar : com.xiaomi.push.service.az.a(Arrays.asList(remove), packageName, ap.a(context2).b.a, 30720)) {
                com.xiaomi.channel.commonutils.logger.c.c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.i);
                context3 = p.a.this.b;
                ag.a(context3).a((ag) iaVar, ha.Notification, true, (ho) null);
            }
        } else if (this.a.c != null) {
            this.a.c.cancel(false);
            this.a.c = null;
        }
    }
}
