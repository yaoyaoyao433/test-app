package com.meituan.android.yoda.data;

import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.meituan.android.yoda.callbacks.a b;
    public YodaResult c;
    public IYodaVerifyListener d;
    public int e;
    public c f;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d9efab895281f3bdb75998fcc8da1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d9efab895281f3bdb75998fcc8da1c");
        }
        return "CallerPackage{yodaResult=" + this.c + ", yodaLocalListener=" + this.d + ", typeChecker=" + this.f + ", selectedVerifyGroupIndex=" + this.e + '}';
    }
}
