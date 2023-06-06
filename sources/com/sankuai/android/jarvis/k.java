package com.sankuai.android.jarvis;

import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends AtomicInteger implements ThreadFactory {
    public static ChangeQuickRedirect a;
    private final String b;
    private final n c;
    private final long d;

    public k(String str, long j) {
        this(str, null, j);
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd1c8092614263e12e7a1962a83990a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd1c8092614263e12e7a1962a83990a");
        }
    }

    public k(String str, n nVar, long j) {
        Object[] objArr = {str, nVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7401aa19042456641bdc9c482e8933d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7401aa19042456641bdc9c482e8933d6");
            return;
        }
        this.b = str;
        this.c = nVar;
        this.d = j;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c340a453a9a6c00d9d3bed40ff6c60", RobustBitConfig.DEFAULT_VALUE)) {
            return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c340a453a9a6c00d9d3bed40ff6c60");
        }
        String str = this.b + "#" + getAndIncrement();
        if (this.c == null) {
            return new Thread(null, runnable, str, this.d);
        }
        return new Thread(null, new Runnable() { // from class: com.sankuai.android.jarvis.k.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "720bbd901b6e65cacc72f14193a25360", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "720bbd901b6e65cacc72f14193a25360");
                    return;
                }
                Process.setThreadPriority(k.this.c.e);
                runnable.run();
            }
        }, str, this.d);
    }
}
