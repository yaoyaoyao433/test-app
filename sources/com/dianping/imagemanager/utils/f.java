package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends AtomicInteger implements ThreadFactory {
    public static ChangeQuickRedirect a;
    public String b;

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18d7561fabd4d0d24ef28369a6191ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18d7561fabd4d0d24ef28369a6191ab");
        } else {
            this.b = str;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6a152018b622d44b74f73df6fe8b29", RobustBitConfig.DEFAULT_VALUE)) {
            return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6a152018b622d44b74f73df6fe8b29");
        }
        Thread thread = new Thread(runnable, this.b + "#" + getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
