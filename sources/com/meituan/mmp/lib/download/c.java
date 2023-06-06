package com.meituan.mmp.lib.download;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c implements Runnable {
    public static ChangeQuickRedirect a;
    public CountDownLatch b;
    public g c;

    public c(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494738689bd6f0cfbbe375bd765ddb1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494738689bd6f0cfbbe375bd765ddb1c");
            return;
        }
        this.c = gVar;
        this.b = new CountDownLatch(1);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482601704eedc6d9385beb898d53489a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482601704eedc6d9385beb898d53489a");
        } else {
            this.b.countDown();
        }
    }
}
