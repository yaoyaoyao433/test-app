package com.sankuai.meituan.location.collector.io;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.io.util.a;
import com.sankuai.meituan.location.collector.utils.k;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static CountDownLatch d = new CountDownLatch(1);
    k b;
    private volatile a.C0599a c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516b9ae2eb6398f4bec3c8c5c023aa6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516b9ae2eb6398f4bec3c8c5c023aa6a");
        } else {
            this.c = null;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebc4be2e150705469cc1e307d8a566c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebc4be2e150705469cc1e307d8a566c9");
            return;
        }
        try {
            d.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtils.a(e);
        }
    }
}
