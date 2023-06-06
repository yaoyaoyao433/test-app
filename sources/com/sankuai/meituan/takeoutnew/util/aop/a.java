package com.sankuai.meituan.takeoutnew.util.aop;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.waimai.metrics.annotation.SkipInstrumentation;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final AtomicLong b = new AtomicLong(0);
    private static int c = WaimaiSP.d();

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "531316d51b45220e0f5f5d35cafcea69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "531316d51b45220e0f5f5d35cafcea69");
            return;
        }
        c = i;
        WaimaiSP.a(i);
    }

    public static URLConnection a(URL url) throws IOException {
        Object[] objArr = {url};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a63cc1b24bef490c76df709446747dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (URLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a63cc1b24bef490c76df709446747dd");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3eea20e82d65cef39d882d679e04ea35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3eea20e82d65cef39d882d679e04ea35");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            b.compareAndSet(0L, elapsedRealtime);
            long j = c;
            if (elapsedRealtime - b.get() < j) {
                synchronized (b) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 - b.get() < j) {
                        try {
                            b.wait(j - (elapsedRealtime2 - b.get()));
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
        return url.openConnection();
    }
}
