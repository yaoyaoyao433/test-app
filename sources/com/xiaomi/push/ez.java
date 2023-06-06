package com.xiaomi.push;

import com.xiaomi.push.da;
import com.xiaomi.push.ey;
import com.xiaomi.push.service.av;
/* loaded from: classes6.dex */
public final class ez extends av.a {
    final /* synthetic */ ey a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ez(ey eyVar) {
        this.a = eyVar;
    }

    @Override // com.xiaomi.push.service.av.a
    public final void a(da.b bVar) {
        if (bVar.e) {
            ey eyVar = ey.a.a;
            int i = bVar.f;
            if (i > 0) {
                int i2 = i * 1000;
                if (i2 > 604800000) {
                    i2 = 604800000;
                }
                if (eyVar.b == i2 && eyVar.a) {
                    return;
                }
                eyVar.a = true;
                eyVar.c = System.currentTimeMillis();
                eyVar.b = i2;
                com.xiaomi.channel.commonutils.logger.c.c("enable dot duration = " + i2 + " start = " + eyVar.c);
            }
        }
    }
}
