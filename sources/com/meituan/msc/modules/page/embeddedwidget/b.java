package com.meituan.msc.modules.page.embeddedwidget;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2417ed892dcdbf3d378d0c26862d082", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2417ed892dcdbf3d378d0c26862d082")).booleanValue() : (view instanceof MTWebView) && com.meituan.msc.common.config.b.q() && SameLayerManager.checkIfSupportSameLayer((MTWebView) view);
    }
}
