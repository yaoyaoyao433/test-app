package com.meituan.msc.mmpviews.text;

import android.view.View;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.MPBaseViewManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCVirtualText")
/* loaded from: classes3.dex */
public class MPVirtualTextViewManager extends MPBaseViewManager<View, MPVirtualTextShadowNode> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCVirtualText";
    }

    @Override // com.meituan.msc.uimanager.as
    public final void a(View view, Object obj) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ aa d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba9418a76236514257bcc60a54b518b", RobustBitConfig.DEFAULT_VALUE) ? (MPVirtualTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba9418a76236514257bcc60a54b518b") : new MPVirtualTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829e50c06861b2b8544ccbe425853ac1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829e50c06861b2b8544ccbe425853ac1");
        }
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<MPVirtualTextShadowNode> c() {
        return MPVirtualTextShadowNode.class;
    }
}
