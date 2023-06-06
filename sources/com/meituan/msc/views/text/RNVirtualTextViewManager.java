package com.meituan.msc.views.text;

import android.view.View;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.RNBaseViewManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNVirtualTextViewManager extends RNBaseViewManager<View, RNVirtualTextShadowNode> {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return ReactVirtualTextViewManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final void a(View view, Object obj) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ aa d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce954d2b59b229f0f41c0c057f5203f", RobustBitConfig.DEFAULT_VALUE) ? (RNVirtualTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce954d2b59b229f0f41c0c057f5203f") : new RNVirtualTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78838c24e73b85dc48cd2b471f9cf5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78838c24e73b85dc48cd2b471f9cf5d");
        }
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<RNVirtualTextShadowNode> c() {
        return RNVirtualTextShadowNode.class;
    }
}
