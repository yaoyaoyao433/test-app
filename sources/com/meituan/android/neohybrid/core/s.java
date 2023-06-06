package com.meituan.android.neohybrid.core;

import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements ValueCallback {
    public static ChangeQuickRedirect a;
    private static final s b = new s();

    public static ValueCallback a() {
        return b;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b3a8f39656a733cef72cf50e62f1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b3a8f39656a733cef72cf50e62f1aa");
            return;
        }
        Object[] objArr2 = {(String) obj};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ff0eec337f21b23c331b391f15914fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ff0eec337f21b23c331b391f15914fcb");
        }
    }
}
