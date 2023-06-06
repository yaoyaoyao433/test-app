package com.meituan.android.ptcommonim.video.play.manager;

import com.meituan.android.ptcommonim.video.play.manager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final String b;
    private final CountDownLatch c;

    private e(String str, CountDownLatch countDownLatch) {
        this.b = str;
        this.c = countDownLatch;
    }

    public static Runnable a(String str, CountDownLatch countDownLatch) {
        Object[] objArr = {str, countDownLatch};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ad9f47a6ea715d22a81643bad2817cd", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ad9f47a6ea715d22a81643bad2817cd") : new e(str, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a37b1a5c97a02c235d8d8165bb004efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a37b1a5c97a02c235d8d8165bb004efa");
            return;
        }
        String str = this.b;
        CountDownLatch countDownLatch = this.c;
        Object[] objArr2 = {str, countDownLatch};
        ChangeQuickRedirect changeQuickRedirect2 = a.RunnableC0358a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6188cebd9a501edb1bc185dbbfbf9c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6188cebd9a501edb1bc185dbbfbf9c49");
            return;
        }
        com.meituan.android.ptcommonim.video.utils.b.a(str);
        countDownLatch.countDown();
    }
}
