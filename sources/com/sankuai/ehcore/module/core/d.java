package com.sankuai.ehcore.module.core;

import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ValueCallback {
    public static ChangeQuickRedirect a;
    private final a b;

    private d(a aVar) {
        this.b = aVar;
    }

    public static ValueCallback a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac208048c71caa8674315217cda06a75", RobustBitConfig.DEFAULT_VALUE) ? (ValueCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac208048c71caa8674315217cda06a75") : new d(aVar);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8840f82db13c08965d18556f87178d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8840f82db13c08965d18556f87178d9");
        } else {
            a.a(this.b, (String) obj);
        }
    }
}
