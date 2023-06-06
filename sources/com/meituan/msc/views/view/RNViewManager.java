package com.meituan.msc.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.facebook.react.views.view.ReactViewManager;
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
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.uimanager.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNViewManager extends RNReactClippingViewManager<b> {
    public static ChangeQuickRedirect b;
    private static final int[] e = {8, 0, 2, 1, 3, 4, 5};

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return ReactViewManager.REACT_CLASS;
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(b bVar, boolean z) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1b9e317903210609eefe7c3299833b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1b9e317903210609eefe7c3299833b") : new b(themedReactContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, int i, @Nullable ReadableArray readableArray) {
        b bVar = (b) view;
        Object[] objArr = {bVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0bb8acdce82eaefbc10e224cc8011d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0bb8acdce82eaefbc10e224cc8011d");
            return;
        }
        switch (i) {
            case 1:
                b(bVar, readableArray);
                return;
            case 2:
                a(bVar, readableArray);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view, String str, @Nullable ReadableArray readableArray) {
        b bVar = (b) view;
        Object[] objArr = {bVar, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a6e9472b5aeecf5f8af1d3941518c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a6e9472b5aeecf5f8af1d3941518c82");
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1639565984) {
            if (hashCode == -399823752 && str.equals("hotspotUpdate")) {
                c = 0;
            }
        } else if (str.equals("setPressed")) {
            c = 1;
        }
        switch (c) {
            case 0:
                b(bVar, readableArray);
                return;
            case 1:
                a(bVar, readableArray);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public /* synthetic */ void setOpacity(@NonNull View view, float f) {
        b bVar = (b) view;
        Object[] objArr = {bVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5c2bc300f9d5b5142500d0f8e69fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5c2bc300f9d5b5142500d0f8e69fd1");
        } else {
            bVar.setOpacityIfPossible(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public /* synthetic */ void setTransform(@NonNull View view, @Nullable ReadableArray readableArray) {
        b bVar = (b) view;
        Object[] objArr = {bVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aefdb8a06bda48513da9d14c75e6cb5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aefdb8a06bda48513da9d14c75e6cb5f");
            return;
        }
        super.setTransform(bVar, readableArray);
        bVar.c();
    }

    @ReactProp(name = "accessible")
    public void setAccessible(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc78c41afe2e75e8e746f6c1e22ac3d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc78c41afe2e75e8e746f6c1e22ac3d1");
        } else {
            bVar.setFocusable(z);
        }
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d18c0218b9ad7de398cc64cf1dd01b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d18c0218b9ad7de398cc64cf1dd01b4");
        } else if (z) {
            bVar.setFocusable(true);
            bVar.setFocusableInTouchMode(true);
            bVar.requestFocus();
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3e4f9a856bfa73ec5d16d0974cba4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3e4f9a856bfa73ec5d16d0974cba4f9");
        } else {
            bVar.setNextFocusDownId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94b622952b1eee732b8cdef9b303217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94b622952b1eee732b8cdef9b303217");
        } else {
            bVar.setNextFocusForwardId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81bc3b0131eb3a648b3ba6d19ba6fbdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81bc3b0131eb3a648b3ba6d19ba6fbdc");
        } else {
            bVar.setNextFocusLeftId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e91426e577dfe8580d6f65d1e2240d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e91426e577dfe8580d6f65d1e2240d");
        } else {
            bVar.setNextFocusRightId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cabaf6d93cc2c3996a6410c2b45deb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cabaf6d93cc2c3996a6410c2b45deb4");
        } else {
            bVar.setNextFocusUpId(i);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME, BorderTopStartRadius.LOWER_CASE_NAME, BorderTopEndRadius.LOWER_CASE_NAME, BorderBottomStartRadius.LOWER_CASE_NAME, BorderBottomEndRadius.LOWER_CASE_NAME})
    public void setBorderRadius(b bVar, int i, Dynamic dynamic) {
        Object[] objArr = {bVar, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11c7e732552c126e2e78835198c4d55c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11c7e732552c126e2e78835198c4d55c");
            return;
        }
        float a = s.a(dynamic);
        if (!com.meituan.android.msc.yoga.f.a(a) && a < 0.0f) {
            a = Float.NaN;
        }
        if (!com.meituan.android.msc.yoga.f.a(a)) {
            a = s.a(a);
        }
        float f = a;
        if (i == 0) {
            bVar.setBorderRadius(f);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = b.b;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1b69909675174eb131a351bcdab4d597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1b69909675174eb131a351bcdab4d597");
            return;
        }
        d orCreateReactViewBackground = bVar.getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f, i2);
        if (Build.VERSION.SDK_INT < 18) {
            int i3 = orCreateReactViewBackground.a() ? 1 : 2;
            if (i3 != bVar.getLayerType()) {
                bVar.setLayerType(i3, null);
            }
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(b bVar, @Nullable String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f7473d3d0276002ec0baae7b44425d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f7473d3d0276002ec0baae7b44425d6");
        } else {
            bVar.setBorderStyle(str);
        }
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(b bVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {bVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afaea009de42bbcf0cdebf197660d1d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afaea009de42bbcf0cdebf197660d1d2");
        } else if (readableMap == null) {
            bVar.setHitSlopRect(null);
        } else {
            bVar.setHitSlopRect(new Rect(readableMap.hasKey("left") ? (int) s.a(readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) s.a(readableMap.getDouble("top")) : 0, readableMap.hasKey("right") ? (int) s.a(readableMap.getDouble("right")) : 0, readableMap.hasKey("bottom") ? (int) s.a(readableMap.getDouble("bottom")) : 0));
        }
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(b bVar, @Nullable String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201aed0f941b71623717dc87bdbdc904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201aed0f941b71623717dc87bdbdc904");
        } else if (str == null) {
            bVar.setPointerEvents(t.AUTO);
        } else {
            bVar.setPointerEvents(t.valueOf(str.toUpperCase(Locale.US).replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE)));
        }
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(b bVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {bVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97938db4989c0fba993d20ad99640323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97938db4989c0fba993d20ad99640323");
        } else {
            bVar.setTranslucentBackgroundDrawable(readableMap == null ? null : c.a(bVar.getContext(), readableMap));
        }
    }

    @ReactProp(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(b bVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {bVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32036a5769c419e3e5b447938436173c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32036a5769c419e3e5b447938436173c");
        } else {
            bVar.setForeground(readableMap == null ? null : c.a(bVar.getContext(), readableMap));
        }
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2ae2122e8e6b0b0b0d3233493093a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2ae2122e8e6b0b0b0d3233493093a1");
        } else {
            bVar.setNeedsOffscreenAlphaCompositing(z);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME, BorderStartWidth.LOWER_CASE_NAME, BorderEndWidth.LOWER_CASE_NAME})
    public void setBorderWidth(b bVar, int i, Dynamic dynamic) {
        Object[] objArr = {bVar, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5d5832c050d0ffa0bbaa9aa8ec90ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5d5832c050d0ffa0bbaa9aa8ec90ab");
            return;
        }
        float a = s.a(dynamic);
        if (!com.meituan.android.msc.yoga.f.a(a) && a < 0.0f) {
            a = Float.NaN;
        }
        if (!com.meituan.android.msc.yoga.f.a(a)) {
            a = s.a(a);
        }
        float f = a;
        int i2 = e[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = b.b;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c62f0968c870fb939554e8be794c08c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c62f0968c870fb939554e8be794c08c6");
        } else {
            bVar.getOrCreateReactViewBackground().a(i2, f);
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME, BorderStartColor.LOWER_CASE_NAME, BorderEndColor.LOWER_CASE_NAME})
    public void setBorderColor(b bVar, int i, Integer num) {
        Object[] objArr = {bVar, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32cc6e9564df99f08c23edacb5b165c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32cc6e9564df99f08c23edacb5b165c");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num == null ? Float.NaN : num.intValue() >>> 24;
        int i2 = e[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect2 = b.b;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e8394d7f5d0935b569c60ffee9711604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e8394d7f5d0935b569c60ffee9711604");
        } else {
            bVar.getOrCreateReactViewBackground().a(i2, intValue, intValue2);
        }
    }

    @ReactProp(name = "focusable")
    public void setFocusable(final b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515e4f0abd7bada76c52ad58a6909ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515e4f0abd7bada76c52ad58a6909ede");
        } else if (z) {
            bVar.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.views.view.RNViewManager.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "429e3fc733d827effc6642aa22f96629", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "429e3fc733d827effc6642aa22f96629");
                    } else {
                        ((ReactContext) bVar.getContext()).getUIManagerModule().a().a(new f(bVar.getId()));
                    }
                }
            });
            bVar.setFocusable(true);
        } else {
            bVar.setOnClickListener(null);
            bVar.setClickable(false);
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd6e73c48ceba1246e61c2ab7aa2b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd6e73c48ceba1246e61c2ab7aa2b7d");
        } else {
            bVar.setOverflow(str);
        }
    }

    @ReactProp(name = BackfaceVisibility.LOWER_CASE_NAME)
    public void setBackfaceVisibility(b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a19c4270bdce96be4da62ea63f89e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a19c4270bdce96be4da62ea63f89e9");
        } else {
            bVar.setBackfaceVisibility(str);
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public final Map<String, Integer> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e79c8b37c5f0e726a3ca63175092d38", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e79c8b37c5f0e726a3ca63175092d38") : com.meituan.msc.jse.common.a.a("hotspotUpdate", 1, "setPressed", 2);
    }

    private void a(b bVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {bVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86965b6720b7133ab72d055a704005b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86965b6720b7133ab72d055a704005b");
        } else if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        } else {
            bVar.setPressed(readableArray.getBoolean(0));
        }
    }

    private void b(b bVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {bVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0080571ba610679adc7f47b8370b37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0080571ba610679adc7f47b8370b37");
        } else if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                bVar.drawableHotspotChanged(s.a(readableArray.getDouble(0)), s.a(readableArray.getDouble(1)));
            }
        }
    }
}
