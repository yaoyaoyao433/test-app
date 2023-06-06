package com.meituan.msc.common.exception;

import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends Exception {
    public static ChangeQuickRedirect a;

    public a() {
    }

    public a(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6faf67e9f7772659a9d0524f154c77c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6faf67e9f7772659a9d0524f154c77c8");
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0db1bf5b5491998e8f09cd0727915df", RobustBitConfig.DEFAULT_VALUE) ? (Throwable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0db1bf5b5491998e8f09cd0727915df") : DebugHelper.a() ? super.fillInStackTrace() : this;
    }
}
