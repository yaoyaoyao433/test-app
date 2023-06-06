package com.meituan.android.mrn.component.mrnwebview;

import android.webkit.JavascriptInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private a b;

    public f(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab6e98b49a347377b81fd28b94b5a8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab6e98b49a347377b81fd28b94b5a8d");
        } else {
            this.b = aVar;
        }
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4092b0fe11a7cdf2085b9af1453ffd8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4092b0fe11a7cdf2085b9af1453ffd8c");
        } else {
            this.b.b(str);
        }
    }
}
