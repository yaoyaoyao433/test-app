package com.facebook.react.views.switchview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.bb;
import com.facebook.react.uimanager.w;
import com.facebook.react.viewmanagers.e;
import com.facebook.react.viewmanagers.f;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<a> implements f<a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new CompoundButton.OnCheckedChangeListener() { // from class: com.facebook.react.views.switchview.ReactSwitchManager.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(compoundButton.getId(), z));
        }
    };
    public static final String REACT_CLASS = "AndroidSwitch";
    private final bb<a> mDelegate = new e(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public void setNativeValue(a aVar, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ReactSwitchShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
        private int a;
        private int b;
        private boolean c;

        private ReactSwitchShadowNode() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.c) {
                a aVar = new a(getThemedContext());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.a = aVar.getMeasuredWidth();
                this.b = aVar.getMeasuredHeight();
                this.c = true;
            }
            return c.a(this.a, this.b);
        }
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        a aVar = new a(aoVar);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(a aVar, boolean z) {
        aVar.setEnabled(!z);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(name = "on")
    public void setOn(a aVar, boolean z) {
        setValueInternal(aVar, z);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(name = "value")
    public void setValue(a aVar, boolean z) {
        setValueInternal(aVar, z);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(a aVar, @Nullable Integer num) {
        setThumbColor(aVar, num);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(customType = "Color", name = "thumbColor")
    public void setThumbColor(a aVar, @Nullable Integer num) {
        aVar.setThumbColor(num);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(a aVar, @Nullable Integer num) {
        aVar.setTrackColorForFalse(num);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(a aVar, @Nullable Integer num) {
        aVar.setTrackColorForTrue(num);
    }

    @Override // com.facebook.react.viewmanagers.f
    @ReactProp(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(a aVar, @Nullable Integer num) {
        aVar.setTrackColor(num);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull a aVar, String str, @Nullable ReadableArray readableArray) {
        boolean z = false;
        if (((str.hashCode() == -669744680 && str.equals("setNativeValue")) ? (char) 0 : (char) 65535) != 0) {
            return;
        }
        if (readableArray != null && readableArray.getBoolean(0)) {
            z = true;
        }
        setValueInternal(aVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bb<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable int[] iArr) {
        a aVar = new a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return c.a(w.c(aVar.getMeasuredWidth()), w.c(aVar.getMeasuredHeight()));
    }

    private static void setValueInternal(a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.setOn(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
