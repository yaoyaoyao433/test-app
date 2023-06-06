package com.meituan.android.recce.views.text;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.h;
import com.facebook.react.views.text.ReactTextAnchorViewManager;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.text.i;
import com.facebook.react.views.text.j;
import com.facebook.react.views.text.m;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.q;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.android.recce.views.annotation.BaseView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@BaseView
/* loaded from: classes3.dex */
public class RecceTextViewManager extends ReactTextAnchorViewManager<ReactTextView, RecceTextShadowNode> implements h, b {
    @VisibleForTesting
    public static final String REACT_CLASS = "RCTText";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    protected j mReactTextViewManagerCallback;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.uimanager.h
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public PropVisitor<Void> getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0bc959ed7b3108317f943e6f3931d20", RobustBitConfig.DEFAULT_VALUE) ? (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0bc959ed7b3108317f943e6f3931d20") : new RecceTextViewManagerVisitor(this, (ReactTextView) view);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbf7cde94bb4acdbe66668cd54d6de51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbf7cde94bb4acdbe66668cd54d6de51");
        } else {
            onAfterUpdateTransaction((ReactTextView) view);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactTextView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe4dad8d5ebd32f9e5e1929e0f498732", RobustBitConfig.DEFAULT_VALUE) ? (ReactTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe4dad8d5ebd32f9e5e1929e0f498732") : new RecceTextView(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactTextView reactTextView, Object obj) {
        Object[] objArr = {reactTextView, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "928fe668fecac4766a6cfd6f5d2086b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "928fe668fecac4766a6cfd6f5d2086b8");
            return;
        }
        i iVar = (i) obj;
        if (iVar.b()) {
            o.a(iVar.a(), reactTextView);
        }
        reactTextView.setText(iVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RecceTextShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0923810896c1be1df0d46b9ce6678ed", RobustBitConfig.DEFAULT_VALUE) ? (RecceTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0923810896c1be1df0d46b9ce6678ed") : new RecceTextShadowNode();
    }

    public RecceTextShadowNode createShadowNodeInstance(@Nullable j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bb3296a28dc7295756018f74d9051c9", RobustBitConfig.DEFAULT_VALUE) ? (RecceTextShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bb3296a28dc7295756018f74d9051c9") : new RecceTextShadowNode(jVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<RecceTextShadowNode> getShadowNodeClass() {
        return RecceTextShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactTextView reactTextView) {
        Object[] objArr = {reactTextView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8b9d6d30310490047e76100e6654de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8b9d6d30310490047e76100e6654de4");
            return;
        }
        super.onAfterUpdateTransaction((RecceTextViewManager) reactTextView);
        reactTextView.updateView();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactTextView reactTextView, ag agVar, @Nullable an anVar) {
        Object[] objArr = {reactTextView, agVar, anVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77db8957913186006f7ef56e0e05e393", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77db8957913186006f7ef56e0e05e393");
        }
        ReadableNativeMap a = anVar.a();
        ReadableNativeMap map = a.getMap("attributedString");
        ReadableNativeMap map2 = a.getMap("paragraphAttributes");
        Spannable a2 = q.a(reactTextView.getContext(), map, this.mReactTextViewManagerCallback);
        reactTextView.setSpanned(a2);
        return new i(a2, a.hasKey("mostRecentEventCount") ? a.getInt("mostRecentEventCount") : -1, false, m.a(agVar), m.a(map2.getString("textBreakStrategy")), m.b(agVar));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "188db5b331806da3df8a7c05daddf9d7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "188db5b331806da3df8a7c05daddf9d7") : c.a("topTextLayout", c.a("registrationName", "onTextLayout"), "topInlineViewLayout", c.a("registrationName", "onInlineViewLayout"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable int[] iArr) {
        Object[] objArr = {context, readableMap, readableMap2, readableMap3, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618895fd02389fe3c5342a9a5a4503de", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618895fd02389fe3c5342a9a5a4503de")).longValue() : q.a(context, readableMap, readableMap2, f, yogaMeasureMode, f2, yogaMeasureMode2, this.mReactTextViewManagerCallback, iArr);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ReactTextView reactTextView, int i, int i2, int i3, int i4) {
        Object[] objArr = {reactTextView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9840673b9191190708f3cd6172c5b4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9840673b9191190708f3cd6172c5b4ff");
        } else {
            reactTextView.setPadding(i, i2, i3, i4);
        }
    }
}
