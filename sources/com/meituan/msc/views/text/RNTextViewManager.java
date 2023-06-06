package com.meituan.msc.views.text;

import android.support.annotation.Nullable;
import android.text.Spannable;
import android.view.View;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = "RCTText")
/* loaded from: classes3.dex */
public class RNTextViewManager extends RNTextAnchorViewManager<ReactTextView, RNTextShadowNode> implements com.meituan.msc.uimanager.f {
    public static ChangeQuickRedirect c;
    @Nullable
    protected j d;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "RCTText";
    }

    @Override // com.meituan.msc.uimanager.f
    public final boolean h() {
        return true;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2816ce7b629ae8631817d6282b0263ec", RobustBitConfig.DEFAULT_VALUE) ? (ReactTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2816ce7b629ae8631817d6282b0263ec") : new ReactTextView(themedReactContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ Object a(View view, ab abVar, @Nullable ai aiVar) {
        ReactTextView reactTextView = (ReactTextView) view;
        Object[] objArr = {reactTextView, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbf74749444f51ef0d931d1cec8c73c", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbf74749444f51ef0d931d1cec8c73c");
        }
        ReadableMap a = aiVar.a();
        ReadableMap map = a.getMap("attributedString");
        ReadableMap map2 = a.getMap("paragraphAttributes");
        Spannable b = q.b(reactTextView.getContext(), map, this.d);
        reactTextView.setSpanned(b);
        return new i(null, b, a.hasKey("mostRecentEventCount") ? a.getInt("mostRecentEventCount") : -1, false, m.a(abVar), m.a(map2.getString("textBreakStrategy")), m.b(abVar));
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view) {
        ReactTextView reactTextView = (ReactTextView) view;
        Object[] objArr = {reactTextView};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5a4cbc7f8c4b5b2c01e6fddca1dbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5a4cbc7f8c4b5b2c01e6fddca1dbdd");
            return;
        }
        super.a((RNTextViewManager) reactTextView);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ReactTextView.a;
        if (PatchProxy.isSupport(objArr2, reactTextView, changeQuickRedirect2, false, "5a084c5dd82486f6a8cc17f8e00b4e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, reactTextView, changeQuickRedirect2, false, "5a084c5dd82486f6a8cc17f8e00b4e54");
        } else {
            reactTextView.setEllipsize((reactTextView.b == Integer.MAX_VALUE || reactTextView.d) ? null : reactTextView.c);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, Object obj) {
        ReactTextView reactTextView = (ReactTextView) view;
        Object[] objArr = {reactTextView, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b06224c34adc9c7fba08b6e1e127c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b06224c34adc9c7fba08b6e1e127c6");
            return;
        }
        i iVar = (i) obj;
        if (iVar.d) {
            o.a(iVar.c, reactTextView);
        }
        reactTextView.setText(iVar);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ aa d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f36bbb701431f62171d26896cd7cd7", RobustBitConfig.DEFAULT_VALUE) ? (RNTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f36bbb701431f62171d26896cd7cd7") : new RNTextShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<RNTextShadowNode> c() {
        return RNTextShadowNode.class;
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public final Map b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e951b7291d221a9a74a561cee1d5de", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e951b7291d221a9a74a561cee1d5de") : com.meituan.msc.jse.common.a.a("topTextLayout", com.meituan.msc.jse.common.a.a("registrationName", "onTextLayout"), "topInlineViewLayout", com.meituan.msc.jse.common.a.a("registrationName", "onInlineViewLayout"));
    }
}
