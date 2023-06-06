package com.meituan.msc.uimanager;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import com.hhmedic.android.sdk.tim.TCommand;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableMapKeySetIterator;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.uimanager.LayoutShadowNode;
import com.meituan.msc.uimanager.ReactAccessibilityDelegate;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends as<T, C> implements b<T> {
    private static final float a = (float) Math.sqrt(5.0d);
    private static k.a b = new k.a();
    public static ChangeQuickRedirect f;
    public static final Map<String, Integer> g;

    @ReactProp(name = "fspIgnore")
    @Deprecated
    public void setFspIgnore(T t, boolean z) {
    }

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put(TCommand.busy, Integer.valueOf((int) R.string.state_busy_description));
        g.put("expanded", Integer.valueOf((int) R.string.state_expanded_description));
        g.put("collapsed", Integer.valueOf((int) R.string.state_collapsed_description));
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@NonNull T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f1b8b5f286152efed6e03db16a0a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f1b8b5f286152efed6e03db16a0a8f");
        } else {
            t.setBackgroundColor(i);
        }
    }

    @ReactProp(name = "transform")
    public void setTransform(@NonNull T t, @Nullable ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8d124c7c723fe1084a1a0eff0ae3f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8d124c7c723fe1084a1a0eff0ae3f3");
        } else if (readableArray == null) {
            Object[] objArr2 = {t};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b304572f247d89e93ed2a75a12add679", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b304572f247d89e93ed2a75a12add679");
                return;
            }
            t.setTranslationX(s.a(0.0f));
            t.setTranslationY(s.a(0.0f));
            t.setRotation(0.0f);
            t.setRotationX(0.0f);
            t.setRotationY(0.0f);
            t.setScaleX(1.0f);
            t.setScaleY(1.0f);
            t.setCameraDistance(0.0f);
        } else {
            Object[] objArr3 = {t, readableArray};
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0f513dc3b58a0d6cede2de66d2931627", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0f513dc3b58a0d6cede2de66d2931627");
                return;
            }
            double[] dArr = new double[16];
            al.a(readableArray, dArr);
            k.a(dArr, b);
            t.setTranslationX(s.a(a((float) b.e[0])));
            t.setTranslationY(s.a(a((float) b.e[1])));
            t.setRotation(a((float) b.f[2]));
            t.setRotationX(a((float) b.f[0]));
            t.setRotationY(a((float) b.f[1]));
            t.setScaleX(a((float) b.c[0]));
            t.setScaleY(a((float) b.c[1]));
            double[] dArr2 = b.b;
            if (dArr2.length > 2) {
                float f2 = (float) dArr2[2];
                if (f2 == 0.0f) {
                    f2 = 7.8125E-4f;
                }
                float f3 = (-1.0f) / f2;
                float f4 = c.c.density;
                t.setCameraDistance(a(f4 * f4 * f3 * a));
            }
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "085a1278cc78c8c31717c1a26b552a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "085a1278cc78c8c31717c1a26b552a9f");
        } else {
            t.setAlpha(f2);
        }
    }

    @ReactProp(name = "elevation")
    public void setElevation(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a877b621263e07277d7902beaaee15da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a877b621263e07277d7902beaaee15da");
        } else {
            ViewCompat.setElevation(t, s.a(f2));
        }
    }

    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(@NonNull T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed42acf0fbbad7484cd2234ab1320b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed42acf0fbbad7484cd2234ab1320b0");
        } else {
            t.setLayerType(z ? 2 : 0, null);
        }
    }

    @ReactProp(name = "testID")
    public void setTestId(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e01ea8fa6b3512bc80553514e0409169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e01ea8fa6b3512bc80553514e0409169");
            return;
        }
        t.setTag(R.id.react_test_id, str);
        t.setTag(str);
    }

    @ReactProp(name = "nativeID")
    public void setNativeId(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1df711fee4280e87137d2b621b769e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1df711fee4280e87137d2b621b769e0");
            return;
        }
        t.setTag(R.id.view_tag_native_id, str);
        com.meituan.msc.uimanager.util.a.a(t);
    }

    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b74f0312874a60e6ed78fd719f07f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b74f0312874a60e6ed78fd719f07f0");
            return;
        }
        t.setTag(R.id.accessibility_label, str);
        c(t);
    }

    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c9a644c2075bf9b7b67a392a4a01bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c9a644c2075bf9b7b67a392a4a01bb");
            return;
        }
        t.setTag(R.id.accessibility_hint, str);
        c(t);
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae9a6a282d505d7967a99bbcef205ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae9a6a282d505d7967a99bbcef205ef");
        } else if (str == null) {
        } else {
            t.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.a.a(str));
        }
    }

    @ReactProp(name = "accessibilityState")
    public void setViewState(@NonNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359e8ba56a5255a851605f30ec797f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359e8ba56a5255a851605f30ec797f3d");
        } else if (readableMap == null) {
        } else {
            t.setTag(R.id.accessibility_state, readableMap);
            t.setSelected(false);
            t.setEnabled(true);
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (nextKey.equals(TCommand.busy) || nextKey.equals("expanded") || (nextKey.equals("checked") && readableMap.getType("checked") == ReadableType.String)) {
                    c(t);
                    return;
                } else if (Build.VERSION.SDK_INT >= 21 && t.isAccessibilityFocused()) {
                    t.sendAccessibilityEvent(1);
                }
            }
        }
    }

    private void c(@NonNull T t) {
        Dynamic dynamic;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374054e47a33b98f9a488303107b3d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374054e47a33b98f9a488303107b3d64");
            return;
        }
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
                if (nextKey.equals("checked") && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals("mixed")) {
                    arrayList.add(t.getContext().getString(R.string.state_mixed_description));
                } else if (nextKey.equals(TCommand.busy) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(R.string.state_busy_description));
                } else if (nextKey.equals("expanded") && dynamic2.getType() == ReadableType.Boolean) {
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

    @ReactProp(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51a5b2772f5bcbcdb91520965ea12e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51a5b2772f5bcbcdb91520965ea12e2");
        } else if (readableArray == null) {
        } else {
            t.setTag(R.id.accessibility_actions, readableArray);
        }
    }

    @ReactProp(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deccb313b58672928ea9daf8adac967a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deccb313b58672928ea9daf8adac967a");
        } else if (readableMap == null) {
        } else {
            t.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                c(t);
            }
        }
    }

    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c50696a67719074c7aec1b0d9eaf400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c50696a67719074c7aec1b0d9eaf400");
        } else if (str == null || str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
            ViewCompat.setImportantForAccessibility(t, 0);
        } else if (str.equals("yes")) {
            ViewCompat.setImportantForAccessibility(t, 1);
        } else if (str.equals("no")) {
            ViewCompat.setImportantForAccessibility(t, 2);
        } else if (str.equals("no-hide-descendants")) {
            ViewCompat.setImportantForAccessibility(t, 4);
        }
    }

    @ReactProp(name = RecceAnimUtils.ROTATION)
    @Deprecated
    public void setRotation(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eed943bcd52609cb8ac484ba36376fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eed943bcd52609cb8ac484ba36376fd");
        } else {
            t.setRotation(f2);
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = RecceAnimUtils.SCALE_X)
    @Deprecated
    public void setScaleX(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73f9b524abbbb4a26801a2f42d9d40f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73f9b524abbbb4a26801a2f42d9d40f");
        } else {
            t.setScaleX(f2);
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = RecceAnimUtils.SCALE_Y)
    @Deprecated
    public void setScaleY(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06971ed88d82e1f2ff4a87046b1a7097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06971ed88d82e1f2ff4a87046b1a7097");
        } else {
            t.setScaleY(f2);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc831d4e67f7a3131b5e89345ef05546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc831d4e67f7a3131b5e89345ef05546");
        } else {
            t.setTranslationX(s.a(f2));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(@NonNull T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcac2107af0db3755c8be5896dfa0f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcac2107af0db3755c8be5896dfa0f2d");
        } else {
            t.setTranslationY(s.a(f2));
        }
    }

    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b107af5a53830a51ff77774d1c2e8251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b107af5a53830a51ff77774d1c2e8251");
        } else if (str == null || str.equals("none")) {
            ViewCompat.setAccessibilityLiveRegion(t, 0);
        } else if (str.equals("polite")) {
            ViewCompat.setAccessibilityLiveRegion(t, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.setAccessibilityLiveRegion(t, 2);
        }
    }

    @ReactProp(name = "lxParams")
    public void setLxParams(T t, ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fa180192cdc6f96517880e839e9abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fa180192cdc6f96517880e839e9abe");
        } else {
            t.setTag(R.id.react_lx_id, readableMap);
        }
    }

    private static float a(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c52efc073f66adbbcc18fff71e36515", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c52efc073f66adbbcc18fff71e36515")).floatValue();
        }
        if (f2 < -3.4028235E38f || f2 > Float.MAX_VALUE) {
            if (f2 < -3.4028235E38f || f2 == Float.NEGATIVE_INFINITY) {
                return -3.4028235E38f;
            }
            if (f2 > Float.MAX_VALUE || f2 == Float.POSITIVE_INFINITY) {
                return Float.MAX_VALUE;
            }
            if (Float.isNaN(f2)) {
                return 0.0f;
            }
            throw new IllegalStateException("Invalid float property value: " + f2);
        }
        return f2;
    }

    @Override // com.meituan.msc.uimanager.as
    public void a(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3e284a6b58efc6374f7d82cd97180f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3e284a6b58efc6374f7d82cd97180f");
            return;
        }
        super.a((BaseViewManager<T, C>) t);
        Object[] objArr2 = {t};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ceac3867ad19c8dca6581ec34817ac32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ceac3867ad19c8dca6581ec34817ac32");
        } else {
            ReactAccessibilityDelegate.a(t);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    @Nullable
    public Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c166668fe529ebe06e2182835c3d4d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c166668fe529ebe06e2182835c3d4d") : com.meituan.msc.jse.common.a.c().a("topAccessibilityAction", com.meituan.msc.jse.common.a.a("registrationName", "onAccessibilityAction")).a();
    }

    public void a(T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e400812ce5e9f82e08664c94dce2057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e400812ce5e9f82e08664c94dce2057");
        } else {
            a(BorderRadius.LOWER_CASE_NAME);
        }
    }

    public void b(T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aefc689c7bc6437eea7f0717b755a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aefc689c7bc6437eea7f0717b755a96");
        } else {
            a(BorderBottomLeftRadius.LOWER_CASE_NAME);
        }
    }

    public void c(T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fce76027e14de3e1cc1803ab5049d25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fce76027e14de3e1cc1803ab5049d25");
        } else {
            a(BorderBottomRightRadius.LOWER_CASE_NAME);
        }
    }

    public void d(T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48bf4b75cca89e97814a5ea2ef07ac5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48bf4b75cca89e97814a5ea2ef07ac5a");
        } else {
            a(BorderTopLeftRadius.LOWER_CASE_NAME);
        }
    }

    public void e(T t, float f2) {
        Object[] objArr = {t, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7badf2cccb7b2c1e3d4d09705d25f2a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7badf2cccb7b2c1e3d4d09705d25f2a5");
        } else {
            a(BorderTopRightRadius.LOWER_CASE_NAME);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1e1d2eb06947ec9b3c3066a48158f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1e1d2eb06947ec9b3c3066a48158f3");
        } else {
            com.meituan.msc.modules.reporter.g.e("ReactNative", "%s doesn't support property '%s'", a(), str);
        }
    }
}
