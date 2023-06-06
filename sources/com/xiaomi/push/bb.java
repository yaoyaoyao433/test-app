package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.m;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public final class bb extends m.a {
    final /* synthetic */ az a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(az azVar) {
        this.a = azVar;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "10054";
    }

    @Override // java.lang.Runnable
    public final void run() {
        String b;
        Context context;
        Context context2;
        com.xiaomi.channel.commonutils.logger.c.c("exec== DbSizeControlJob");
        b = this.a.b();
        context = this.a.a;
        bf bfVar = new bf(b, new WeakReference(context));
        context2 = this.a.a;
        bm.a(context2).a(bfVar);
        az.a(this.a, "check_time");
    }
}
