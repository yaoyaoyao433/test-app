package com.meituan.android.neohybrid.neo.breathe;

import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ValueCallback {
    public static ChangeQuickRedirect a;
    private final a b;
    private final long c;

    private e(a aVar, long j) {
        this.b = aVar;
        this.c = j;
    }

    public static ValueCallback a(a aVar, long j) {
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d8cf22c18bf180a60ff7327bb88907b", RobustBitConfig.DEFAULT_VALUE) ? (ValueCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d8cf22c18bf180a60ff7327bb88907b") : new e(aVar, j);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d3744eed3604267df9afea318bae88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d3744eed3604267df9afea318bae88");
        } else {
            a.a(this.b, this.c, (String) obj);
        }
    }
}
