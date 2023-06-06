package com.meituan.mmp.lib.embeddedwidget;

import android.view.View;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.internal.hyper.SameLayerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91512d9769f8a5deaaa1a1d836840430", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91512d9769f8a5deaaa1a1d836840430")).booleanValue() : (view instanceof MTWebView) && com.meituan.mmp.lib.config.b.E() && SameLayerManager.checkIfSupportSameLayer((MTWebView) view);
    }
}
