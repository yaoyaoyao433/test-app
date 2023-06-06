package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.x;
import com.meituan.android.recce.props.gens.BackfaceVisibility;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomEndRadius;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomStartRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderEndColor;
import com.meituan.android.recce.props.gens.BorderEndWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStartColor;
import com.meituan.android.recce.props.gens.BorderStartWidth;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopEndRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.BorderTopStartRadius;
import com.meituan.robust.common.CommonConstant;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewManager extends ReactClippingViewManager<f> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    @VisibleForTesting
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(f fVar, boolean z) {
    }

    @ReactProp(name = "accessible")
    public void setAccessible(f fVar, boolean z) {
        fVar.setFocusable(z);
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(f fVar, boolean z) {
        if (z) {
            fVar.setFocusable(true);
            fVar.setFocusableInTouchMode(true);
            fVar.requestFocus();
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(f fVar, int i) {
        fVar.setNextFocusDownId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(f fVar, int i) {
        fVar.setNextFocusForwardId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(f fVar, int i) {
        fVar.setNextFocusLeftId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(f fVar, int i) {
        fVar.setNextFocusRightId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(f fVar, int i) {
        fVar.setNextFocusUpId(i);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME, BorderTopStartRadius.LOWER_CASE_NAME, BorderTopEndRadius.LOWER_CASE_NAME, BorderBottomStartRadius.LOWER_CASE_NAME, BorderBottomEndRadius.LOWER_CASE_NAME})
    public void setBorderRadius(f fVar, int i, Dynamic dynamic) {
        float a = w.a(dynamic);
        if (!com.facebook.yoga.b.a(a) && a < 0.0f) {
            a = Float.NaN;
        }
        if (!com.facebook.yoga.b.a(a)) {
            a = w.a(a);
        }
        if (i == 0) {
            fVar.setBorderRadius(a);
        } else {
            fVar.setBorderRadius(a, i - 1);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(f fVar, @Nullable String str) {
        fVar.setBorderStyle(str);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(f fVar, @Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            fVar.setHitSlopRect(null);
        } else {
            fVar.setHitSlopRect(new Rect(readableMap.hasKey("left") ? (int) w.a((float) readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) w.a((float) readableMap.getDouble("top")) : 0, readableMap.hasKey("right") ? (int) w.a((float) readableMap.getDouble("right")) : 0, readableMap.hasKey("bottom") ? (int) w.a((float) readableMap.getDouble("bottom")) : 0));
        }
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(f fVar, @Nullable String str) {
        if (str == null) {
            fVar.setPointerEvents(x.AUTO);
        } else {
            fVar.setPointerEvents(x.valueOf(str.toUpperCase(Locale.US).replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE)));
        }
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(f fVar, @Nullable ReadableMap readableMap) {
        fVar.setTranslucentBackgroundDrawable(readableMap == null ? null : c.a(fVar.getContext(), readableMap));
    }

    @ReactProp(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(f fVar, @Nullable ReadableMap readableMap) {
        fVar.setForeground(readableMap == null ? null : c.a(fVar.getContext(), readableMap));
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(f fVar, boolean z) {
        fVar.setNeedsOffscreenAlphaCompositing(z);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME, BorderStartWidth.LOWER_CASE_NAME, BorderEndWidth.LOWER_CASE_NAME})
    public void setBorderWidth(f fVar, int i, Dynamic dynamic) {
        float a = w.a(dynamic);
        if (!com.facebook.yoga.b.a(a) && a < 0.0f) {
            a = Float.NaN;
        }
        if (!com.facebook.yoga.b.a(a)) {
            a = w.a(a);
        }
        fVar.setBorderWidth(SPACING_TYPES[i], a);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME, BorderStartColor.LOWER_CASE_NAME, BorderEndColor.LOWER_CASE_NAME})
    public void setBorderColor(f fVar, int i, Integer num) {
        fVar.setBorderColor(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ReactProp(name = "focusable")
    public void setFocusable(final f fVar, boolean z) {
        if (z) {
            fVar.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.views.view.ReactViewManager.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((UIManagerModule) ((ReactContext) fVar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new g(fVar.getId()));
                }
            });
            fVar.setFocusable(true);
            return;
        }
        fVar.setOnClickListener(null);
        fVar.setClickable(false);
    }

    @ReactProp(name = "overflow")
    public void setOverflow(f fVar, String str) {
        fVar.setOverflow(str);
    }

    @ReactProp(name = BackfaceVisibility.LOWER_CASE_NAME)
    public void setBackfaceVisibility(f fVar, String str) {
        fVar.setBackfaceVisibility(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setOpacity(@NonNull f fVar, float f) {
        fVar.setOpacityIfPossible(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setTransform(@NonNull f fVar, @Nullable ReadableArray readableArray) {
        super.setTransform((ReactViewManager) fVar, readableArray);
        fVar.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(ao aoVar) {
        return new f(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.c.a(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, int i, @Nullable ReadableArray readableArray) {
        switch (i) {
            case 1:
                handleHotspotUpdate(fVar, readableArray);
                return;
            case 2:
                handleSetPressed(fVar, readableArray);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, String str, @Nullable ReadableArray readableArray) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1639565984) {
            if (hashCode == -399823752 && str.equals(HOTSPOT_UPDATE_KEY)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("setPressed")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                handleHotspotUpdate(fVar, readableArray);
                return;
            case 1:
                handleSetPressed(fVar, readableArray);
                return;
            default:
                return;
        }
    }

    private void handleSetPressed(f fVar, @Nullable ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        fVar.setPressed(readableArray.getBoolean(0));
    }

    private void handleHotspotUpdate(f fVar, @Nullable ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            fVar.drawableHotspotChanged(w.a((float) readableArray.getDouble(0)), w.a((float) readableArray.getDouble(1)));
        }
    }
}
