package com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final WebViewDialogCloseActivity b;

    private a(WebViewDialogCloseActivity webViewDialogCloseActivity) {
        this.b = webViewDialogCloseActivity;
    }

    public static View.OnClickListener a(WebViewDialogCloseActivity webViewDialogCloseActivity) {
        Object[] objArr = {webViewDialogCloseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "364bbd3266fca89f0453ed20f77ec822", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "364bbd3266fca89f0453ed20f77ec822") : new a(webViewDialogCloseActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d2e91351e764d7659b38d98e30992c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d2e91351e764d7659b38d98e30992c");
        } else {
            WebViewDialogCloseActivity.a(this.b, view);
        }
    }
}
