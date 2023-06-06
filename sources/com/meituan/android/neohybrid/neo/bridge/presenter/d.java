package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements ValueCallback {
    public static ChangeQuickRedirect a;
    private final b b;
    private final long c;

    private d(b bVar, long j) {
        this.b = bVar;
        this.c = j;
    }

    public static ValueCallback a(b bVar, long j) {
        Object[] objArr = {bVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3feb161ff5d01e894bcb06ea454b016", RobustBitConfig.DEFAULT_VALUE) ? (ValueCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3feb161ff5d01e894bcb06ea454b016") : new d(bVar, j);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8391fca9d16aaf5527e43ab60b937c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8391fca9d16aaf5527e43ab60b937c06");
        } else {
            b.a(this.b, this.c, (String) obj);
        }
    }
}
