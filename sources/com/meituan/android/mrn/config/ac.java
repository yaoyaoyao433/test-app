package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ac {
    public static ChangeQuickRedirect a;
    public static ac b = new ac();

    public static ac a() {
        return b;
    }

    public ac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab29dd34975c590f443b44cfda1e8241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab29dd34975c590f443b44cfda1e8241");
            return;
        }
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.TRUE;
        Object[] objArr2 = {"MRNWebView.shouldUseDeprecatedMRNWebView", cls, bool, "是否启用MRNWebView旧的实现方案"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a890573c3b056a040856a071eb9984a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a890573c3b056a040856a071eb9984a");
        } else {
            t.a("MRNWebView.shouldUseDeprecatedMRNWebView", cls, bool, "mrn_webview_config_android", "是否启用MRNWebView旧的实现方案");
        }
    }
}
