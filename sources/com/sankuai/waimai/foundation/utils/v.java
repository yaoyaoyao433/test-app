package com.sankuai.waimai.foundation.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class v implements Executor {
    public static ChangeQuickRedirect a;
    private final ArrayDeque<Runnable> b;
    private Runnable c;
    private Executor d;

    public v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c294ddef2427ac2f6eea71fbf410d914", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c294ddef2427ac2f6eea71fbf410d914");
            return;
        }
        this.b = new ArrayDeque<>();
        this.d = com.sankuai.android.jarvis.c.a();
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(@NonNull final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845279952dcadd9faf2498ccd684aad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845279952dcadd9faf2498ccd684aad5");
        } else if (runnable == null) {
        } else {
            this.b.offer(new Runnable() { // from class: com.sankuai.waimai.foundation.utils.v.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e2f3fdd7ffa847ac5b9653755f17ab1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e2f3fdd7ffa847ac5b9653755f17ab1");
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        v.this.a();
                    }
                }

                public final String toString() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "880065faf54d7438efd36053b889e1a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "880065faf54d7438efd36053b889e1a1") : runnable.toString();
                }
            });
            if (this.c == null) {
                a();
            }
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318047259390e45674ba990b43141c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318047259390e45674ba990b43141c92");
            return;
        }
        Runnable poll = this.b.poll();
        this.c = poll;
        if (poll != null) {
            this.d.execute(this.c);
        }
    }
}
