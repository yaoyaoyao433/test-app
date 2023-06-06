package com.facebook.react.views.text;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.ao;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = "RCTText")
/* loaded from: classes.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<ReactTextView, ReactTextShadowNode> implements com.facebook.react.uimanager.h {
    @VisibleForTesting
    public static final String REACT_CLASS = "RCTText";
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

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactTextView createViewInstance(ao aoVar) {
        return new ReactTextView(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactTextView reactTextView, Object obj) {
        i iVar = (i) obj;
        if (iVar.c) {
            o.a(iVar.a, reactTextView);
        }
        reactTextView.setText(iVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactTextShadowNode createShadowNodeInstance() {
        return new ReactTextShadowNode();
    }

    public ReactTextShadowNode createShadowNodeInstance(@Nullable j jVar) {
        return new ReactTextShadowNode(jVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ReactTextShadowNode> getShadowNodeClass() {
        return ReactTextShadowNode.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactTextView reactTextView) {
        super.onAfterUpdateTransaction((ReactTextViewManager) reactTextView);
        reactTextView.updateView();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactTextView reactTextView, ag agVar, @Nullable an anVar) {
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
        return com.facebook.react.common.c.a("topTextLayout", com.facebook.react.common.c.a("registrationName", "onTextLayout"), "topInlineViewLayout", com.facebook.react.common.c.a("registrationName", "onInlineViewLayout"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable int[] iArr) {
        return q.a(context, readableMap, readableMap2, f, yogaMeasureMode, f2, yogaMeasureMode2, this.mReactTextViewManagerCallback, iArr);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ReactTextView reactTextView, int i, int i2, int i3, int i4) {
        reactTextView.setPadding(i, i2, i3, i4);
    }
}
