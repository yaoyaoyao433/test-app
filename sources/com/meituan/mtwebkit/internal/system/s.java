package com.meituan.mtwebkit.internal.system;

import android.os.Build;
import android.webkit.WebViewRenderProcess;
import com.meituan.mtwebkit.MTWebViewRenderProcess;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s extends MTWebViewRenderProcess {
    public static ChangeQuickRedirect a;
    public WebViewRenderProcess b;

    public s(WebViewRenderProcess webViewRenderProcess) {
        Object[] objArr = {webViewRenderProcess};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2937337d4cadfdc593543c644f851562", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2937337d4cadfdc593543c644f851562");
        } else {
            this.b = webViewRenderProcess;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewRenderProcess
    public final boolean terminate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d611b17e5426c9805b9871c7ad978d20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d611b17e5426c9805b9871c7ad978d20")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.b.terminate();
        }
        return false;
    }
}
