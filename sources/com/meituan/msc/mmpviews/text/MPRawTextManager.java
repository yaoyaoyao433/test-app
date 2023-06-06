package com.meituan.msc.mmpviews.text;

import android.view.View;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.as;
import com.meituan.msc.views.text.ReactTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCRawText")
/* loaded from: classes3.dex */
public class MPRawTextManager extends as<View, MPRawTextShadowNode> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCRawText";
    }

    @Override // com.meituan.msc.uimanager.as
    public final void a(View view, Object obj) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef381cff0b72136ab4b6ecd64379e408", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef381cff0b72136ab4b6ecd64379e408");
        }
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ MPRawTextShadowNode d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449af4d1999b9323499818438f28816c", RobustBitConfig.DEFAULT_VALUE) ? (MPRawTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449af4d1999b9323499818438f28816c") : new MPRawTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<? extends MPRawTextShadowNode> c() {
        return MPRawTextShadowNode.class;
    }
}
