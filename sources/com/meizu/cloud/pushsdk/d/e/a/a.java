package com.meizu.cloud.pushsdk.d.e.a;

import com.meizu.cloud.pushsdk.d.c.b;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public class a extends com.meizu.cloud.pushsdk.d.e.a {
    private static final String n = "a";
    private static ScheduledExecutorService o;

    @Override // com.meizu.cloud.pushsdk.d.e.a
    public final void a(final b bVar, final boolean z) {
        com.meizu.cloud.pushsdk.d.b.a.b.a(new Runnable() { // from class: com.meizu.cloud.pushsdk.d.e.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.super.a(bVar, z);
            }
        });
    }

    public a(a.C0530a c0530a) {
        super(c0530a);
        com.meizu.cloud.pushsdk.d.b.a.b.a(this.k);
        if (o == null && this.i) {
            c.b(n, "Session checking has been resumed.", new Object[0]);
            final com.meizu.cloud.pushsdk.d.e.b bVar = this.d;
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            o = newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.meizu.cloud.pushsdk.d.e.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.meizu.cloud.pushsdk.d.e.b bVar2 = bVar;
                    c.b(com.meizu.cloud.pushsdk.d.e.b.a, "Checking and updating session information.", new Object[0]);
                    if (e.a(bVar2.c, System.currentTimeMillis(), bVar2.b.get() ? bVar2.e : bVar2.d)) {
                        return;
                    }
                    bVar2.b();
                    bVar2.c = System.currentTimeMillis();
                }
            }, this.j, this.j, this.l);
        }
    }
}
