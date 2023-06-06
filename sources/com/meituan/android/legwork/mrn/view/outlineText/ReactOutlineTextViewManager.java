package com.meituan.android.legwork.mrn.view.outlineText;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.h;
import com.facebook.react.views.text.ReactTextAnchorViewManager;
import com.facebook.react.views.text.i;
import com.facebook.react.views.text.j;
import com.facebook.react.views.text.m;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.q;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactOutlineTextViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactOutlineTextViewManager extends ReactTextAnchorViewManager<OutlineTextView, ReactOutLineTextShadowNode> implements h {
    @VisibleForTesting
    public static final String REACT_CLASS = "BMLWOutlineTextView";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    protected j mReactTextViewManagerCallback;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.h
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public OutlineTextView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04e1313333dd5d7a150c5d3d90d1000", RobustBitConfig.DEFAULT_VALUE) ? (OutlineTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04e1313333dd5d7a150c5d3d90d1000") : new OutlineTextView(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(OutlineTextView outlineTextView, Object obj) {
        Object[] objArr = {outlineTextView, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89b3806194cd452d8ba2b17d7d69a00e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89b3806194cd452d8ba2b17d7d69a00e");
            return;
        }
        i iVar = (i) obj;
        if (iVar.b()) {
            o.a(iVar.a(), outlineTextView);
        }
        outlineTextView.setText(iVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactOutLineTextShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02eb55152c3a4631386c319aa6b09280", RobustBitConfig.DEFAULT_VALUE) ? (ReactOutLineTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02eb55152c3a4631386c319aa6b09280") : new ReactOutLineTextShadowNode();
    }

    public ReactOutLineTextShadowNode createShadowNodeInstance(@Nullable j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b46687e78e5248c26f26ca5ad86cfff", RobustBitConfig.DEFAULT_VALUE) ? (ReactOutLineTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b46687e78e5248c26f26ca5ad86cfff") : new ReactOutLineTextShadowNode(jVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ReactOutLineTextShadowNode> getShadowNodeClass() {
        return ReactOutLineTextShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(OutlineTextView outlineTextView) {
        Object[] objArr = {outlineTextView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ebf0d1c5030b7b936cd99d74b2deda7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ebf0d1c5030b7b936cd99d74b2deda7");
            return;
        }
        super.onAfterUpdateTransaction((ReactOutlineTextViewManager) outlineTextView);
        outlineTextView.updateView();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(OutlineTextView outlineTextView, ag agVar, @Nullable an anVar) {
        Object[] objArr = {outlineTextView, agVar, anVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05787dda2dfa232e914e9c43cc7ba03d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05787dda2dfa232e914e9c43cc7ba03d");
        }
        ReadableNativeMap a = anVar.a();
        ReadableNativeMap map = a.getMap("attributedString");
        ReadableNativeMap map2 = a.getMap("paragraphAttributes");
        Spannable a2 = q.a(outlineTextView.getContext(), map, this.mReactTextViewManagerCallback);
        outlineTextView.setSpanned(a2);
        return new i(a2, a.hasKey("mostRecentEventCount") ? a.getInt("mostRecentEventCount") : -1, false, m.a(agVar), m.a(map2.getString("textBreakStrategy")), m.b(agVar));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a3b0deca99f9f375d185809ed4080e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a3b0deca99f9f375d185809ed4080e") : c.a("topTextLayout", c.a("registrationName", "onTextLayout"), "topInlineViewLayout", c.a("registrationName", "onInlineViewLayout"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable int[] iArr) {
        Object[] objArr = {context, readableMap, readableMap2, readableMap3, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45f4ddd9b373c104a77af9426dd28759", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45f4ddd9b373c104a77af9426dd28759")).longValue() : q.a(context, readableMap, readableMap2, f, yogaMeasureMode, f2, yogaMeasureMode2, this.mReactTextViewManagerCallback, iArr);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(OutlineTextView outlineTextView, int i, int i2, int i3, int i4) {
        Object[] objArr = {outlineTextView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b0e89eb0ff8be69ae4cf4766d014a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b0e89eb0ff8be69ae4cf4766d014a1");
        } else {
            outlineTextView.setPadding(i, i2, i3, i4);
        }
    }

    @ReactProp(name = "outlineColor")
    public void setOutlineColor(@NonNull OutlineTextView outlineTextView, String str) {
        Object[] objArr = {outlineTextView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a35f7bd75225cd0832c1a904178381d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a35f7bd75225cd0832c1a904178381d");
        } else {
            outlineTextView.setStrokeColor(Color.parseColor(str));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "outlineWidth")
    public void setOutlineWidth(OutlineTextView outlineTextView, int i) {
        Object[] objArr = {outlineTextView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92440aba17e3d03b7001f241753e16c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92440aba17e3d03b7001f241753e16c0");
        } else {
            outlineTextView.setStrokeWidth(com.meituan.android.legwork.utils.h.a(i));
        }
    }
}
