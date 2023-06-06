package com.meituan.android.msc.yoga;

import android.os.Handler;
import com.meituan.android.msc.csslib.CSSParserNative;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class p extends YogaNodeJNIBase {
    public static ChangeQuickRedirect e;
    public static final AtomicLong f = new AtomicLong(0);

    public p(c cVar, Handler handler) {
        super(cVar);
        Object[] objArr = {cVar, handler};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae7a3315eba725c1f585a8cd10bc88a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae7a3315eba725c1f585a8cd10bc88a");
        } else {
            f.incrementAndGet();
        }
    }

    public p() {
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6754df12b72455e8a9986062ca7ce00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6754df12b72455e8a9986062ca7ce00c");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31f2964e3020b5b9e515a264d1eb918b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31f2964e3020b5b9e515a264d1eb918b");
            } else {
                synchronized (CSSParserNative.b) {
                    if (this.d != 0) {
                        long j = this.d;
                        this.d = 0L;
                        YogaNative.jni_YGNodeFreeJNI(j);
                        f.decrementAndGet();
                    }
                }
            }
        } finally {
            super.finalize();
        }
    }
}
