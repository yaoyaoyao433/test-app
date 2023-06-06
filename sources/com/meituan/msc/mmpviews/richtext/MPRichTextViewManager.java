package com.meituan.msc.mmpviews.richtext;

import android.support.annotation.NonNull;
import android.text.Spanned;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCRichText")
/* loaded from: classes3.dex */
public class MPRichTextViewManager extends as<RichTextView, MPRichTextShadowNode> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCRichText";
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ RichTextView a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8286b9f7729cf1e448dd9e86008caab3", RobustBitConfig.DEFAULT_VALUE) ? (RichTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8286b9f7729cf1e448dd9e86008caab3") : new RichTextView(themedReactContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(@NonNull RichTextView richTextView, Object obj) {
        RichTextView richTextView2 = richTextView;
        Object[] objArr = {richTextView2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664303ffa36a57358c679dc69a523613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664303ffa36a57358c679dc69a523613");
        } else {
            richTextView2.setText((Spanned) obj);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ MPRichTextShadowNode d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5627312b2b3ffab0e3eb2d83c61cdf5e", RobustBitConfig.DEFAULT_VALUE) ? (MPRichTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5627312b2b3ffab0e3eb2d83c61cdf5e") : new MPRichTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<? extends MPRichTextShadowNode> c() {
        return MPRichTextShadowNode.class;
    }
}
