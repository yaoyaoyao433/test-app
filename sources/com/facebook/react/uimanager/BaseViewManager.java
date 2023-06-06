package com.facebook.react.uimanager;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.p;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.sampler.fps.FpsEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements b<T> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    public static final Map<String, Integer> sStateDescription;
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static p.a sMatrixDecompositionContext = new p.a();

    static {
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put("busy", Integer.valueOf((int) R.string.state_busy_description));
        sStateDescription.put(STATE_EXPANDED, Integer.valueOf((int) R.string.state_expanded_description));
        sStateDescription.put("collapsed", Integer.valueOf((int) R.string.state_collapsed_description));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@NonNull T t, int i) {
        t.setBackgroundColor(i);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "transform")
    public void setTransform(@NonNull T t, @Nullable ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(@NonNull T t, float f) {
        t.setAlpha(f);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "elevation")
    public void setElevation(@NonNull T t, float f) {
        ViewCompat.setElevation(t, w.a(f));
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "zIndex")
    public void setZIndex(@NonNull T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof ai) {
            ((ai) parent).updateDrawingOrder();
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(@NonNull T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "testID")
    public void setTestId(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.react_test_id, str);
        t.setTag(str);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "nativeID")
    public void setNativeId(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.view_tag_native_id, str);
        com.facebook.react.uimanager.util.a.a(t);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(@NonNull T t, @Nullable String str) {
        t.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(@NonNull T t, @Nullable String str) {
        if (str == null) {
            return;
        }
        t.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.a.a(str));
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "accessibilityState")
    public void setViewState(@NonNull T t, @Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t.setTag(R.id.accessibility_state, readableMap);
        t.setSelected(false);
        t.setEnabled(true);
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.equals("busy") || nextKey.equals(STATE_EXPANDED) || (nextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t);
                return;
            } else if (Build.VERSION.SDK_INT >= 21 && t.isAccessibilityFocused()) {
                t.sendAccessibilityEvent(1);
            }
        }
    }

    private void updateViewContentDescription(@NonNull T t) {
        Dynamic dynamic;
        String str = (String) t.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(R.id.accessibility_state);
        String str2 = (String) t.getTag(R.id.accessibility_hint);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t.getContext().getString(R.string.state_mixed_description));
                } else if (nextKey.equals("busy") && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(R.string.state_busy_description));
                } else if (nextKey.equals(STATE_EXPANDED) && dynamic2.getType() == ReadableType.Boolean) {
                    arrayList.add(t.getContext().getString(dynamic2.asBoolean() ? R.string.state_expanded_description : R.string.state_collapsed_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(R.id.accessibility_actions, readableArray);
    }

    @ReactProp(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t.setTag(R.id.accessibility_value, readableMap);
        if (readableMap.hasKey("text")) {
            updateViewContentDescription(t);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(@NonNull T t, @Nullable String str) {
        if (str == null || str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
            ViewCompat.setImportantForAccessibility(t, 0);
        } else if (str.equals("yes")) {
            ViewCompat.setImportantForAccessibility(t, 1);
        } else if (str.equals("no")) {
            ViewCompat.setImportantForAccessibility(t, 2);
        } else if (str.equals("no-hide-descendants")) {
            ViewCompat.setImportantForAccessibility(t, 4);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = RecceAnimUtils.ROTATION)
    @Deprecated
    public void setRotation(@NonNull T t, float f) {
        t.setRotation(f);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = RecceAnimUtils.SCALE_X)
    @Deprecated
    public void setScaleX(@NonNull T t, float f) {
        t.setScaleX(f);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = RecceAnimUtils.SCALE_Y)
    @Deprecated
    public void setScaleY(@NonNull T t, float f) {
        t.setScaleY(f);
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(@NonNull T t, float f) {
        t.setTranslationX(w.a(f));
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(@NonNull T t, float f) {
        t.setTranslationY(w.a(f));
    }

    @Override // com.facebook.react.uimanager.b
    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(@NonNull T t, @Nullable String str) {
        if (str == null || str.equals("none")) {
            ViewCompat.setAccessibilityLiveRegion(t, 0);
        } else if (str.equals("polite")) {
            ViewCompat.setAccessibilityLiveRegion(t, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.setAccessibilityLiveRegion(t, 2);
        }
    }

    @ReactProp(name = "lxParams")
    public void setLxParams(T t, ReadableMap readableMap) {
        t.setTag(R.id.react_lx_id, readableMap);
    }

    private static void setTransformProperty(@NonNull View view, ReadableArray readableArray) {
        double[] dArr = new double[16];
        aq.a(readableArray, dArr);
        p.a aVar = sMatrixDecompositionContext;
        com.facebook.infer.annotation.a.a(true);
        double[] dArr2 = aVar.perspective;
        double[] dArr3 = aVar.scale;
        double[] dArr4 = aVar.skew;
        double[] dArr5 = aVar.translation;
        double[] dArr6 = aVar.rotationDegrees;
        if (!p.a(dArr[15])) {
            double[][] dArr7 = (double[][]) Array.newInstance(double.class, 4, 4);
            double[] dArr8 = new double[16];
            for (int i = 0; i < 4; i++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = (i * 4) + i2;
                    double d = dArr[i3] / dArr[15];
                    dArr7[i][i2] = d;
                    if (i2 == 3) {
                        d = 0.0d;
                    }
                    dArr8[i3] = d;
                }
            }
            dArr8[15] = 1.0d;
            if (!p.a(p.a(dArr8))) {
                if (!p.a(dArr7[0][3]) || !p.a(dArr7[1][3]) || !p.a(dArr7[2][3])) {
                    p.a(new double[]{dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]}, p.c(p.b(dArr8)), dArr2);
                } else {
                    dArr2[2] = 0.0d;
                    dArr2[1] = 0.0d;
                    dArr2[0] = 0.0d;
                    dArr2[3] = 1.0d;
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    dArr5[i4] = dArr7[3][i4];
                }
                double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
                for (int i5 = 0; i5 < 3; i5++) {
                    dArr9[i5][0] = dArr7[i5][0];
                    dArr9[i5][1] = dArr7[i5][1];
                    dArr9[i5][2] = dArr7[i5][2];
                }
                dArr3[0] = p.d(dArr9[0]);
                dArr9[0] = p.a(dArr9[0], dArr3[0]);
                dArr4[0] = p.a(dArr9[0], dArr9[1]);
                dArr9[1] = p.a(dArr9[1], dArr9[0], 1.0d, -dArr4[0]);
                dArr4[0] = p.a(dArr9[0], dArr9[1]);
                dArr9[1] = p.a(dArr9[1], dArr9[0], 1.0d, -dArr4[0]);
                dArr3[1] = p.d(dArr9[1]);
                dArr9[1] = p.a(dArr9[1], dArr3[1]);
                dArr4[0] = dArr4[0] / dArr3[1];
                dArr4[1] = p.a(dArr9[0], dArr9[2]);
                dArr9[2] = p.a(dArr9[2], dArr9[0], 1.0d, -dArr4[1]);
                dArr4[2] = p.a(dArr9[1], dArr9[2]);
                dArr9[2] = p.a(dArr9[2], dArr9[1], 1.0d, -dArr4[2]);
                dArr3[2] = p.d(dArr9[2]);
                dArr9[2] = p.a(dArr9[2], dArr3[2]);
                dArr4[1] = dArr4[1] / dArr3[2];
                dArr4[2] = dArr4[2] / dArr3[2];
                if (p.a(dArr9[0], p.b(dArr9[1], dArr9[2])) < 0.0d) {
                    for (int i6 = 0; i6 < 3; i6++) {
                        dArr3[i6] = dArr3[i6] * (-1.0d);
                        double[] dArr10 = dArr9[i6];
                        dArr10[0] = dArr10[0] * (-1.0d);
                        double[] dArr11 = dArr9[i6];
                        dArr11[1] = dArr11[1] * (-1.0d);
                        double[] dArr12 = dArr9[i6];
                        dArr12[2] = dArr12[2] * (-1.0d);
                    }
                }
                dArr6[0] = p.b((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
                dArr6[1] = p.b((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
                dArr6[2] = p.b((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
            }
        }
        view.setTranslationX(w.a(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.translation[0])));
        view.setTranslationY(w.a(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.translation[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.rotationDegrees[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.rotationDegrees[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.rotationDegrees[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.scale[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.scale[1]));
        double[] dArr13 = sMatrixDecompositionContext.perspective;
        if (dArr13.length > 2) {
            float f = (float) dArr13[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = d.b.density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f < -3.4028235E38f || f > Float.MAX_VALUE) {
            if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
                return -3.4028235E38f;
            }
            if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
                return Float.MAX_VALUE;
            }
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            throw new IllegalStateException("Invalid float property value: " + f);
        }
        return f;
    }

    private static void resetTransformProperty(@NonNull View view) {
        view.setTranslationX(w.a(0.0f));
        view.setTranslationY(w.a(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    private void updateViewAccessibility(@NonNull T t) {
        ReactAccessibilityDelegate.a(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.b().a("topAccessibilityAction", com.facebook.react.common.c.a("registrationName", "onAccessibilityAction")).a();
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning(BorderRadius.LOWER_CASE_NAME);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(BorderBottomLeftRadius.LOWER_CASE_NAME);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(BorderBottomRightRadius.LOWER_CASE_NAME);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(BorderTopLeftRadius.LOWER_CASE_NAME);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(BorderTopRightRadius.LOWER_CASE_NAME);
    }

    private void logUnsupportedPropertyWarning(String str) {
        com.facebook.common.logging.a.a("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }
}
