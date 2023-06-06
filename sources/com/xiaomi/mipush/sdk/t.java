package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.p;
import com.xiaomi.push.he;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public final class t implements Runnable {
    final /* synthetic */ he a;
    final /* synthetic */ p.a.C1517a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(p.a.C1517a c1517a, he heVar) {
        this.b = c1517a;
        this.a = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.add(this.a);
        p.a.C1517a c1517a = this.b;
        if (c1517a.c == null) {
            c1517a.c = c1517a.a.scheduleAtFixedRate(c1517a.d, 1000L, 1000L, TimeUnit.MILLISECONDS);
        }
    }
}
