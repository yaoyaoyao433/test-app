package com.meituan.msc.views.text;

import android.view.View;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "RCTRawText")
/* loaded from: classes3.dex */
public class RNRawTextManager extends as<View, RNRawTextShadowNode> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "RCTRawText";
    }

    @Override // com.meituan.msc.uimanager.as
    public final void a(View view, Object obj) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76532fad7a2acce153f8a598431cb291", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76532fad7a2acce153f8a598431cb291");
        }
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ RNRawTextShadowNode d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02250a8faaf9d54e1c198fb4919e175c", RobustBitConfig.DEFAULT_VALUE) ? (RNRawTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02250a8faaf9d54e1c198fb4919e175c") : new RNRawTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<? extends RNRawTextShadowNode> c() {
        return RNRawTextShadowNode.class;
    }
}
