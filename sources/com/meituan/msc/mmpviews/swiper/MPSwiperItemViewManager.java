package com.meituan.msc.mmpviews.swiper;

import android.view.View;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCSwiperItem")
/* loaded from: classes3.dex */
public class MPSwiperItemViewManager extends MPShellDelegateViewGroupManager<b> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCSwiperItem";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8567d72cc5823f1a4c4946890afcc4d3", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8567d72cc5823f1a4c4946890afcc4d3") : new b(themedReactContext);
    }
}
