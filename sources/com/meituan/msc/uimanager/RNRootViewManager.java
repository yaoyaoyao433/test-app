package com.meituan.msc.uimanager;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.RootViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNRootViewManager extends RNViewGroupManager<ViewGroup> {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return RootViewManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640a42e20a36fad0f99a16b927fa2945", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640a42e20a36fad0f99a16b927fa2945") : new FrameLayout(themedReactContext);
    }
}
