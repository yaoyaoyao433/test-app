package com.meituan.msc.jse.bridge;

import android.support.annotation.GuardedBy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JavaScriptContextHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @GuardedBy("this")
    private long mContext;

    public JavaScriptContextHolder(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d49846951841cf2bdfc9205412b7e307", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d49846951841cf2bdfc9205412b7e307");
        } else {
            this.mContext = j;
        }
    }

    @GuardedBy("this")
    public long get() {
        return this.mContext;
    }

    public synchronized void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "960d7ec5688c2b0df9e8ce0f68a97903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "960d7ec5688c2b0df9e8ce0f68a97903");
        } else {
            this.mContext = 0L;
        }
    }
}
