package com.meituan.msc.views.scroll;

import android.view.View;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.views.view.RNReactClippingViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNHorizontalScrollContainerViewManager extends RNReactClippingViewManager<c> {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return ReactHorizontalScrollContainerViewManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0003d3ad2e7c554fb8e6be5ae98d48eb", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0003d3ad2e7c554fb8e6be5ae98d48eb") : new c(themedReactContext);
    }
}
