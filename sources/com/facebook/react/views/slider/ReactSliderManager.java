package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.bb;
import com.facebook.react.uimanager.w;
import com.facebook.react.viewmanagers.k;
import com.facebook.react.viewmanagers.l;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.meituan.metrics.common.Constants;
import com.tencent.mapsdk.internal.bw;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactSliderManager extends SimpleViewManager<ReactSlider> implements l<ReactSlider> {
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;
    private final bb<ReactSlider> mDelegate = new k(this);
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new SeekBar.OnSeekBarChangeListener() { // from class: com.facebook.react.views.slider.ReactSliderManager.1
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new a(seekBar.getId(), ((ReactSlider) seekBar).a(i), z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new b(seekBar.getId(), ((ReactSlider) seekBar).a(seekBar.getProgress())));
        }
    };
    protected static ReactSliderAccessibilityDelegate sAccessibilityDelegate = new ReactSliderAccessibilityDelegate();

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.l
    public void setDisabled(ReactSlider reactSlider, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.l
    public void setMaximumTrackImage(ReactSlider reactSlider, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.l
    public void setMinimumTrackImage(ReactSlider reactSlider, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.l
    public void setThumbImage(ReactSlider reactSlider, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.l
    public void setTrackImage(ReactSlider reactSlider, @Nullable ReadableMap readableMap) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ReactSliderShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
        private int a;
        private int b;
        private boolean c;

        private ReactSliderShadowNode() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.c) {
                ReactSlider reactSlider = new ReactSlider(getThemedContext(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                reactSlider.measure(makeMeasureSpec, makeMeasureSpec);
                this.a = reactSlider.getMeasuredWidth();
                this.b = reactSlider.getMeasuredHeight();
                this.c = true;
            }
            return c.a(this.a, this.b);
        }
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSliderShadowNode();
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSliderShadowNode.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSlider createViewInstance(ao aoVar) {
        ReactSlider reactSlider = new ReactSlider(aoVar, null, STYLE);
        ViewCompat.setAccessibilityDelegate(reactSlider, sAccessibilityDelegate);
        return reactSlider;
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSlider reactSlider, boolean z) {
        reactSlider.setEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(defaultDouble = 0.0d, name = "value")
    public void setValue(ReactSlider reactSlider, double d) {
        reactSlider.setOnSeekBarChangeListener(null);
        reactSlider.setValue(d);
        reactSlider.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMinValue(d);
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(defaultDouble = bw.a, name = "maximumValue")
    public void setMaximumValue(ReactSlider reactSlider, double d) {
        reactSlider.setMaxValue(d);
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(defaultDouble = 0.0d, name = Constants.SPEED_METER_STEP)
    public void setStep(ReactSlider reactSlider, double d) {
        reactSlider.setStep(d);
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(ReactSlider reactSlider, Integer num) {
        if (num == null) {
            reactSlider.getThumb().clearColorFilter();
        } else {
            reactSlider.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(ReactSlider reactSlider, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.viewmanagers.l
    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(ReactSlider reactSlider, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) reactSlider.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.viewmanagers.l
    public void setTestID(ReactSlider reactSlider, @Nullable String str) {
        super.setTestId(reactSlider, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, ReactSlider reactSlider) {
        reactSlider.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.a("topSlidingComplete", com.facebook.react.common.c.a("registrationName", "onSlidingComplete"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable int[] iArr) {
        ReactSlider reactSlider = new ReactSlider(context, null, STYLE);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        reactSlider.measure(makeMeasureSpec, makeMeasureSpec);
        return c.a(w.c(reactSlider.getMeasuredWidth()), w.c(reactSlider.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bb<ReactSlider> getDelegate() {
        return this.mDelegate;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ReactSliderAccessibilityDelegate extends AccessibilityDelegateCompat {
        protected ReactSliderAccessibilityDelegate() {
        }

        private static boolean a(int i) {
            return i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId() || i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId() || i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS.getId();
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (a(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
            }
            boolean performAccessibilityAction = super.performAccessibilityAction(view, i, bundle);
            if (a(i)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
            }
            return performAccessibilityAction;
        }
    }
}
