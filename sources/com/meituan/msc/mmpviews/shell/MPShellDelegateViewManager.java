package com.meituan.msc.mmpviews.shell;

import android.net.Uri;
import android.os.Build;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import com.dianping.titans.widget.DynamicTitleParser;
import com.hhmedic.android.sdk.tim.TCommand;
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
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginEnd;
import com.meituan.android.recce.props.gens.MarginHorizontal;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginStart;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MarginVertical;
import com.meituan.android.recce.props.gens.PaddingEnd;
import com.meituan.android.recce.props.gens.PaddingStart;
import com.meituan.android.recce.props.gens.PaddingVertical;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableMapKeySetIterator;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.mmpviews.csstypes.a;
import com.meituan.msc.mmpviews.csstypes.b;
import com.meituan.msc.mmpviews.csstypes.c;
import com.meituan.msc.mmpviews.shell.MPLayoutShadowNode;
import com.meituan.msc.mmpviews.shell.background.f;
import com.meituan.msc.mmpviews.shell.background.g;
import com.meituan.msc.uimanager.MPBaseViewManager;
import com.meituan.msc.uimanager.ReactAccessibilityDelegate;
import com.meituan.msc.uimanager.ah;
import com.meituan.msc.uimanager.al;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.msc.uimanager.ax;
import com.meituan.msc.uimanager.k;
import com.meituan.msc.uimanager.q;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MPShellDelegateViewManager<T extends View, C extends MPLayoutShadowNode> extends MPBaseViewManager<T, C> {
    private static final float a = (float) Math.sqrt(5.0d);
    private static k.a b = new k.a();
    private static final int[] c = {8, 0, 2, 1, 3};
    public static ChangeQuickRedirect d;

    @ReactProp(name = "collapsable")
    public void setCollapsable(T t, boolean z) {
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager
    @ReactProp(name = "fspIgnore")
    @Deprecated
    public void setFspIgnore(T t, boolean z) {
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@NonNull T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84d8841bf650e95aa2fa935f0c7ccec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84d8841bf650e95aa2fa935f0c7ccec");
        } else {
            c((MPShellDelegateViewManager<T, C>) t).a(i);
        }
    }

    @ReactProp(name = DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE)
    public void setBackgroundImages(@NonNull T t, ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae87a269ddf756cc5e58cd59bfc585a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae87a269ddf756cc5e58cd59bfc585a4");
            return;
        }
        e c2 = c((MPShellDelegateViewManager<T, C>) t);
        com.meituan.msc.mmpviews.csstypes.a a2 = com.meituan.msc.mmpviews.csstypes.a.a(readableArray);
        c2.l = true;
        c2.h = a2;
    }

    @ReactProp(name = "backgroundRepeat")
    public void setBackgroundRepeats(@NonNull T t, ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b10e548d6cfc91445679f86c8f275d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b10e548d6cfc91445679f86c8f275d5");
            return;
        }
        e c2 = c((MPShellDelegateViewManager<T, C>) t);
        com.meituan.msc.mmpviews.csstypes.b a2 = com.meituan.msc.mmpviews.csstypes.b.a(readableArray);
        c2.l = true;
        c2.i = a2;
    }

    @ReactProp(name = "backgroundSize")
    public void setBackgroundSizes(@NonNull T t, ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142c78da280b44334dc98917ce60096e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142c78da280b44334dc98917ce60096e");
            return;
        }
        e c2 = c((MPShellDelegateViewManager<T, C>) t);
        com.meituan.msc.mmpviews.csstypes.c a2 = com.meituan.msc.mmpviews.csstypes.c.a(readableArray);
        c2.l = true;
        c2.j = a2;
    }

    @ReactProp(name = "boxShadow")
    public void setBoxShadow(@NonNull T t, ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9209ebc9f121fa514b7422db0291b134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9209ebc9f121fa514b7422db0291b134");
        } else {
            c((MPShellDelegateViewManager<T, C>) t).a(readableMap);
        }
    }

    @ReactProp(name = "backdropFilter")
    @RequiresApi(api = 17)
    public void setBackdropFilter(@NonNull T t, ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b273d0d2d87f7ca0e8263e1c31bad3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b273d0d2d87f7ca0e8263e1c31bad3ed");
            return;
        }
        final e c2 = c((MPShellDelegateViewManager<T, C>) t);
        Object[] objArr2 = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "75adb3283d0c93c9718ff14fa64313ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "75adb3283d0c93c9718ff14fa64313ec");
        } else if (readableMap == null || !readableMap.hasKey("blur")) {
        } else {
            final float f = (float) readableMap.getDouble("blur");
            if (c2.n() instanceof ReactContext) {
                ((ReactContext) c2.n()).getUIManagerModule().a().a(new com.meituan.msc.uimanager.events.c() { // from class: com.meituan.msc.mmpviews.shell.e.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
                    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
                    @Override // com.meituan.msc.uimanager.events.c
                    @android.support.annotation.RequiresApi(api = 17)
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(com.meituan.msc.uimanager.events.a r15) {
                        /*
                            Method dump skipped, instructions count: 372
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.shell.e.AnonymousClass1.a(com.meituan.msc.uimanager.events.a):void");
                    }
                });
            }
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "transform")
    public void setTransform(@NonNull T t, @Nullable ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8d7877a8f973495d6455a62d1d16af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8d7877a8f973495d6455a62d1d16af");
            return;
        }
        if (readableArray == null) {
            Object[] objArr2 = {t};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6533b0bcc1e81828c9f6fd19519b5096", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6533b0bcc1e81828c9f6fd19519b5096");
            } else {
                t.setTranslationX(s.a(0.0f));
                t.setTranslationY(s.a(0.0f));
                t.setRotation(0.0f);
                t.setRotationX(0.0f);
                t.setRotationY(0.0f);
                t.setScaleX(1.0f);
                t.setScaleY(1.0f);
                t.setCameraDistance(0.0f);
            }
        } else {
            Object[] objArr3 = {t, readableArray};
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f283ecff1bba2fbeafef747a13c98065", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f283ecff1bba2fbeafef747a13c98065");
            } else {
                double[] dArr = new double[16];
                al.a(readableArray, dArr);
                k.a(dArr, b);
                t.setTranslationX(a((float) b.e[0]));
                t.setTranslationY(a((float) b.e[1]));
                t.setRotation(a((float) b.f[2]));
                t.setRotationX(a((float) b.f[0]));
                t.setRotationY(a((float) b.f[1]));
                t.setScaleX(a((float) b.c[0]));
                t.setScaleY(a((float) b.c[1]));
                double[] dArr2 = b.b;
                if (dArr2.length > 2) {
                    float f = (float) dArr2[2];
                    if (f == 0.0f) {
                        f = 7.8125E-4f;
                    }
                    float f2 = (-1.0f) / f;
                    float f3 = com.meituan.msc.uimanager.c.c.density;
                    t.setCameraDistance(a(f3 * f3 * f2 * a));
                }
            }
        }
        c((MPShellDelegateViewManager<T, C>) t).j();
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e0704376e5126cbb8b271d7f97ae20f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e0704376e5126cbb8b271d7f97ae20f");
        } else {
            t.setAlpha(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "elevation")
    public void setElevation(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148d22e3b2d09e7a4f65d98c104b95a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148d22e3b2d09e7a4f65d98c104b95a0");
        } else {
            ViewCompat.setElevation(t, f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(@NonNull T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf8b88e99954cbc72f9a36d4d6e208c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf8b88e99954cbc72f9a36d4d6e208c");
        } else {
            t.setLayerType(z ? 2 : 0, null);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "testID")
    public void setTestId(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e5a109e2d2ae9d67fa5b529a3b35d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e5a109e2d2ae9d67fa5b529a3b35d9");
            return;
        }
        t.setTag(R.id.react_test_id, str);
        t.setTag(str);
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "nativeID")
    public void setNativeId(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db83184b0ece4863b14edfae82b09e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db83184b0ece4863b14edfae82b09e6a");
            return;
        }
        t.setTag(R.id.view_tag_native_id, str);
        com.meituan.msc.uimanager.util.a.a(t);
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85367da2ab373b69acbce095be05025c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85367da2ab373b69acbce095be05025c");
            return;
        }
        t.setTag(R.id.accessibility_label, str);
        d(t);
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1190235e0bbf6861dd510e57e9a95425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1190235e0bbf6861dd510e57e9a95425");
            return;
        }
        t.setTag(R.id.accessibility_hint, str);
        d(t);
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bde978c140144d8f1d99f8a175a97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bde978c140144d8f1d99f8a175a97e");
        } else if (str == null) {
        } else {
            t.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.a.a(str));
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "accessibilityState")
    public void setViewState(@NonNull T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a75a248e57fd9236e723bdbf88fa8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a75a248e57fd9236e723bdbf88fa8b");
        } else if (readableMap == null) {
        } else {
            t.setTag(R.id.accessibility_state, readableMap);
            t.setSelected(false);
            t.setEnabled(true);
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (nextKey.equals(TCommand.busy) || nextKey.equals("expanded") || (nextKey.equals("checked") && readableMap.getType("checked") == ReadableType.String)) {
                    d(t);
                    return;
                } else if (Build.VERSION.SDK_INT >= 21 && t.isAccessibilityFocused()) {
                    t.sendAccessibilityEvent(1);
                }
            }
        }
    }

    private void d(@NonNull T t) {
        Dynamic dynamic;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d03c96c2c5a054bdcd79b30f6639bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d03c96c2c5a054bdcd79b30f6639bf");
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

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39e8a73e6a8444b6a781fb4a9500807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39e8a73e6a8444b6a781fb4a9500807");
        } else if (readableArray == null) {
        } else {
            t.setTag(R.id.accessibility_actions, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager
    @ReactProp(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1abc956cd4dc0f3b711282aa16eeed4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1abc956cd4dc0f3b711282aa16eeed4a");
        } else if (readableMap == null) {
        } else {
            t.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                d(t);
            }
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d20349db6e0a349c91e8f4e5d06690c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d20349db6e0a349c91e8f4e5d06690c3");
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

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = RecceAnimUtils.ROTATION)
    @Deprecated
    public void setRotation(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddeff23e647e105ac6b4623fb447bc77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddeff23e647e105ac6b4623fb447bc77");
        } else {
            t.setRotation(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = RecceAnimUtils.SCALE_X)
    @Deprecated
    public void setScaleX(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25458d3dc3398102880bee919ea13f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25458d3dc3398102880bee919ea13f8");
        } else {
            t.setScaleX(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = RecceAnimUtils.SCALE_Y)
    @Deprecated
    public void setScaleY(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b15167edec2e6d6ba571695b5d96cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b15167edec2e6d6ba571695b5d96cf");
        } else {
            t.setScaleY(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2a279019a654fcaaf7dcd0930c7f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2a279019a654fcaaf7dcd0930c7f87");
        } else {
            t.setTranslationX(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbafb41802e6619e76a24a8255b394a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbafb41802e6619e76a24a8255b394a");
        } else {
            t.setTranslationY(f);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(@NonNull T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a6714ac33200a4124f970bc2924fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a6714ac33200a4124f970bc2924fb7");
        } else if (str == null || str.equals("none")) {
            ViewCompat.setAccessibilityLiveRegion(t, 0);
        } else if (str.equals("polite")) {
            ViewCompat.setAccessibilityLiveRegion(t, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.setAccessibilityLiveRegion(t, 2);
        }
    }

    private static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b30c01ec263fb1df0d03e473a23abc88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b30c01ec263fb1df0d03e473a23abc88")).floatValue();
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.meituan.msc.mmpviews.shell.background.d] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.meituan.msc.mmpviews.shell.background.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @CallSuper
    public void a(@NonNull T t) {
        ?? dVar;
        RequestCreator a2;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664147f50dfd1d84faf03ad3e898f63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664147f50dfd1d84faf03ad3e898f63f");
            return;
        }
        super.a((MPShellDelegateViewManager<T, C>) t);
        Object[] objArr2 = {t};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8175f07818b6923189e32c21b5ea5d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8175f07818b6923189e32c21b5ea5d8e");
        } else {
            ReactAccessibilityDelegate.a(t);
        }
        e c2 = c((MPShellDelegateViewManager<T, C>) t);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, c2, changeQuickRedirect3, false, "36c869763b492a26d48a1f5a9ddcf4d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c2, changeQuickRedirect3, false, "36c869763b492a26d48a1f5a9ddcf4d1");
        } else if (c2.l) {
            c2.l = false;
            if (c2.h != null) {
                com.meituan.msc.mmpviews.csstypes.b bVar = c2.i != null ? c2.i : com.meituan.msc.mmpviews.csstypes.b.b;
                com.meituan.msc.mmpviews.csstypes.c cVar = c2.j != null ? c2.j : com.meituan.msc.mmpviews.csstypes.c.b;
                com.meituan.msc.mmpviews.shell.background.a[] aVarArr = new com.meituan.msc.mmpviews.shell.background.a[c2.h.b()];
                for (int i = 0; i < c2.h.b(); i++) {
                    a.c a3 = c2.h.a(i);
                    b.C0448b a4 = bVar.a(i);
                    c.a a5 = cVar.a(i);
                    Object[] objArr4 = {a3, a4, a5};
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (PatchProxy.isSupport(objArr4, c2, changeQuickRedirect4, false, "0fe3855d200e15e64db4294d5e65fe29", RobustBitConfig.DEFAULT_VALUE)) {
                        dVar = (com.meituan.msc.mmpviews.shell.background.a) PatchProxy.accessDispatch(objArr4, c2, changeQuickRedirect4, false, "0fe3855d200e15e64db4294d5e65fe29");
                    } else if (a3 instanceof a.b) {
                        dVar = new com.meituan.msc.mmpviews.shell.background.g(c2.n(), ((a.b) a3).b, a4, a5);
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.mmpviews.shell.background.g.i;
                        if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "c11c20033339db12cea6f9c6571ae0d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "c11c20033339db12cea6f9c6571ae0d4");
                        } else {
                            Uri uri = dVar.j.b;
                            if (dVar.j.i) {
                                a2 = com.meituan.msc.views.imagehelper.a.a(dVar.k.getApplicationContext(), dVar.j.b);
                            } else if (uri != null) {
                                a2 = dVar.b().a(uri);
                            } else if (dVar.j.h && dVar.j.e > 0) {
                                a2 = dVar.b().a(dVar.j.e);
                            } else {
                                a2 = dVar.j.j != null ? dVar.b().a(dVar.j.j) : null;
                            }
                            if (a2 != null) {
                                a2.a();
                                a2.a(DiskCacheStrategy.SOURCE);
                                a2.a(new g.a(dVar));
                            }
                        }
                        dVar.start();
                    } else {
                        dVar = a3 instanceof a.C0447a ? new com.meituan.msc.mmpviews.shell.background.d((a.C0447a) a3, a4, a5) : 0;
                    }
                    aVarArr[i] = dVar;
                }
                c2.i().a(aVarArr);
                return;
            }
            c2.i().a((com.meituan.msc.mmpviews.shell.background.a[]) null);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb321f810c15d90c4aae3bf2775da3f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb321f810c15d90c4aae3bf2775da3f") : com.meituan.msc.jse.common.a.c().a("topAccessibilityAction", com.meituan.msc.jse.common.a.a("registrationName", "onAccessibilityAction")).a();
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public final void a(T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c3d10ed1a4328ee582ba0035c3958f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c3d10ed1a4328ee582ba0035c3958f");
        } else {
            a(BorderRadius.LOWER_CASE_NAME);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public final void b(T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e43fc0d7c948008de8685ae8e825c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e43fc0d7c948008de8685ae8e825c6");
        } else {
            a(BorderBottomLeftRadius.LOWER_CASE_NAME);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public final void c(T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f053fa16772981623387eb6a8180eebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f053fa16772981623387eb6a8180eebf");
        } else {
            a(BorderBottomRightRadius.LOWER_CASE_NAME);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public final void d(T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed10295e858e43b38caedec7a0baf977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed10295e858e43b38caedec7a0baf977");
        } else {
            a(BorderTopLeftRadius.LOWER_CASE_NAME);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.b
    public final void e(T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "953438b7705243045630f8e546c8fd13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "953438b7705243045630f8e546c8fd13");
        } else {
            a(BorderTopRightRadius.LOWER_CASE_NAME);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af742aca68a14185a36c4585d22796dd", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException(String.format("%s doesn't support property '%s'", a(), str));
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af742aca68a14185a36c4585d22796dd");
    }

    @Override // com.meituan.msc.uimanager.as
    public void a(T t, Object obj) {
        Object[] objArr = {t, obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d71def8a841f2eda2501455645120f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d71def8a841f2eda2501455645120f5b");
        } else if (obj instanceof g) {
            g gVar = (g) obj;
            e c2 = c((MPShellDelegateViewManager<T, C>) t);
            c2.d = gVar.b;
            c2.e = gVar.c;
        }
    }

    @ReactProp(name = "accessible")
    public void setAccessible(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa1ad8205eae8da7d0985bbfed13dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa1ad8205eae8da7d0985bbfed13dac");
        } else {
            t.setFocusable(z);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47410e20fd3ff21f11aca1baf8cd2b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47410e20fd3ff21f11aca1baf8cd2b23");
        } else {
            t.setNextFocusDownId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc27dcfd569f428096fdfa8dee3d23ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc27dcfd569f428096fdfa8dee3d23ce");
        } else {
            t.setNextFocusForwardId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae4453fc9c10ae01c5b5c547068a1f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae4453fc9c10ae01c5b5c547068a1f6");
        } else {
            t.setNextFocusLeftId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c9167671cd238f4c9e96393e384080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c9167671cd238f4c9e96393e384080");
        } else {
            t.setNextFocusRightId(i);
        }
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da49664b500232ffc0afa53bdc1bbcff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da49664b500232ffc0afa53bdc1bbcff");
        } else {
            t.setNextFocusUpId(i);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME, BorderTopStartRadius.LOWER_CASE_NAME, BorderTopEndRadius.LOWER_CASE_NAME, BorderBottomStartRadius.LOWER_CASE_NAME, BorderBottomEndRadius.LOWER_CASE_NAME})
    public void setBorderRadius(T t, int i, Dynamic dynamic) {
        float asDouble;
        Object[] objArr = {t, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02d7efaa87260e6ffbb2c1170dc1d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02d7efaa87260e6ffbb2c1170dc1d2a");
        } else if (dynamic == null || dynamic.isNull()) {
        } else {
            if (dynamic.getType() == ReadableType.String && dynamic.asString().endsWith("px")) {
                String asString = dynamic.asString();
                asDouble = Float.parseFloat(asString.substring(0, asString.length() - 2));
            } else if (dynamic.getType() == ReadableType.Number) {
                asDouble = (float) dynamic.asDouble();
            } else {
                throw new IllegalArgumentException("Unsupported value: " + dynamic);
            }
            if (i == 0) {
                c((MPShellDelegateViewManager<T, C>) t).a(asDouble);
            } else {
                c((MPShellDelegateViewManager<T, C>) t).a(asDouble, i - 1);
            }
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderLeftStyle", "borderTopStyle", "borderRightStyle", "borderBottomStyle", BorderStyle.LOWER_CASE_NAME})
    public void setBorderStyle(T t, int i, @Nullable Dynamic dynamic) {
        Object[] objArr = {t, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acd92e8f4db9ff44c2fd9b1ebad6050b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acd92e8f4db9ff44c2fd9b1ebad6050b");
        } else if (dynamic == null) {
        } else {
            String asString = dynamic.asString();
            if ("none".equals(asString)) {
                asString = null;
            }
            e c2 = c((MPShellDelegateViewManager<T, C>) t);
            Object[] objArr2 = {asString, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "ef74d36998bad18e28614eead11a6d5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "ef74d36998bad18e28614eead11a6d5e");
                return;
            }
            com.meituan.msc.mmpviews.shell.background.f i2 = c2.i();
            Object[] objArr3 = {asString, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.mmpviews.shell.background.f.a;
            if (PatchProxy.isSupport(objArr3, i2, changeQuickRedirect3, false, "810691484399176c1e1e341b91661f53", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, i2, changeQuickRedirect3, false, "810691484399176c1e1e341b91661f53");
                return;
            }
            if (i2.e == null) {
                i2.e = new f.b[5];
            }
            f.b valueOf = asString != null ? f.b.valueOf(asString.toUpperCase(Locale.US)) : null;
            if (i2.e[i] != valueOf) {
                i2.e[i] = valueOf;
                i2.f = true;
                i2.invalidateSelf();
            }
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME, BorderStartWidth.LOWER_CASE_NAME, BorderEndWidth.LOWER_CASE_NAME})
    public void setBorderWidths(T t, int i, Dynamic dynamic) {
        float asDouble;
        Object[] objArr = {t, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ce200ab8f3bc180c724b121675c6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ce200ab8f3bc180c724b121675c6ed");
        } else if (dynamic == null || dynamic.isNull()) {
        } else {
            if (dynamic.getType() == ReadableType.String && dynamic.asString().endsWith("px")) {
                String asString = dynamic.asString();
                asDouble = Float.parseFloat(asString.substring(0, asString.length() - 2));
            } else if (dynamic.getType() == ReadableType.Number) {
                asDouble = (float) dynamic.asDouble();
            } else {
                throw new IllegalArgumentException("Unsupported value: " + dynamic);
            }
            e c2 = c((MPShellDelegateViewManager<T, C>) t);
            int i2 = c[i];
            Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(asDouble)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "1ee660b315efade4b8a8aacd564d510c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "1ee660b315efade4b8a8aacd564d510c");
                return;
            }
            com.meituan.msc.mmpviews.shell.background.f i3 = c2.i();
            Object[] objArr3 = {Integer.valueOf(i2), Float.valueOf(asDouble)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.mmpviews.shell.background.f.a;
            if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "8d64b455780836e49ce3a259f82da6b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "8d64b455780836e49ce3a259f82da6b0");
                return;
            }
            if (i3.b == null) {
                i3.b = new ah();
            }
            if (q.a(i3.b.b[i2], asDouble)) {
                return;
            }
            i3.b.a(i2, asDouble);
            if (i2 != 8) {
                switch (i2) {
                }
                i3.invalidateSelf();
            }
            i3.f = true;
            i3.invalidateSelf();
        }
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME, BorderStartColor.LOWER_CASE_NAME, BorderEndColor.LOWER_CASE_NAME})
    public void setBorderColor(T t, int i, Integer num) {
        Object[] objArr = {t, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "863f2939e6bf06a54439d8554408fd3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "863f2939e6bf06a54439d8554408fd3d");
            return;
        }
        float intValue = num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK;
        float intValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        e c2 = c((MPShellDelegateViewManager<T, C>) t);
        int i2 = c[i];
        Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "9f89ec102caf7e08b6dcb03ba2457ad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "9f89ec102caf7e08b6dcb03ba2457ad2");
            return;
        }
        com.meituan.msc.mmpviews.shell.background.f i3 = c2.i();
        Object[] objArr3 = {Integer.valueOf(i2), Float.valueOf(intValue), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.mmpviews.shell.background.f.a;
        if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "b08515dc814cb975a49d53c19c2e02aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "b08515dc814cb975a49d53c19c2e02aa");
            return;
        }
        Object[] objArr4 = {Integer.valueOf(i2), Float.valueOf(intValue)};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.mmpviews.shell.background.f.a;
        if (PatchProxy.isSupport(objArr4, i3, changeQuickRedirect4, false, "9688f76e4af3ee6baea87f1a16a5c22c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, i3, changeQuickRedirect4, false, "9688f76e4af3ee6baea87f1a16a5c22c");
        } else {
            if (i3.c == null) {
                i3.c = new ah(0.0f);
            }
            if (!q.a(i3.c.b[i2], intValue)) {
                i3.c.a(i2, intValue);
                i3.invalidateSelf();
            }
        }
        Object[] objArr5 = {Integer.valueOf(i2), Float.valueOf(intValue2)};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.mmpviews.shell.background.f.a;
        if (PatchProxy.isSupport(objArr5, i3, changeQuickRedirect5, false, "9b79280a9f9ecd20995a282dfbfe7df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, i3, changeQuickRedirect5, false, "9b79280a9f9ecd20995a282dfbfe7df1");
            return;
        }
        if (i3.d == null) {
            i3.d = new ah(255.0f);
        }
        if (q.a(i3.d.b[i2], intValue2)) {
            return;
        }
        i3.d.a(i2, intValue2);
        i3.invalidateSelf();
    }

    @ReactProp(name = "focusable")
    public void setFocusable(final T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a948e415a1676241d9bc9aa161706e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a948e415a1676241d9bc9aa161706e7d");
        } else if (z) {
            t.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9b1bb5c4dc9d5b180d31b614ffd479a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9b1bb5c4dc9d5b180d31b614ffd479a");
                    } else {
                        ((ReactContext) t.getContext()).getUIManagerModule().a().a(new com.meituan.msc.views.view.f(t.getId()));
                    }
                }
            });
            t.setFocusable(true);
        } else {
            t.setOnClickListener(null);
            t.setClickable(false);
        }
    }

    @ReactProp(name = BackfaceVisibility.LOWER_CASE_NAME)
    public void setBackfaceVisibility(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe5bfb302db7929e925c0454d433034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe5bfb302db7929e925c0454d433034");
            return;
        }
        e c2 = c((MPShellDelegateViewManager<T, C>) t);
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "d073143520a14545cde326177c41cea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "d073143520a14545cde326177c41cea7");
            return;
        }
        c2.g = str;
        c2.j();
    }

    @Override // com.meituan.msc.uimanager.as
    public Map<String, Integer> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f55ee8556be09480217928ba7ee1ec", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f55ee8556be09480217928ba7ee1ec") : com.meituan.msc.jse.common.a.a("hotspotUpdate", 1, "setPressed", 2);
    }

    @Override // com.meituan.msc.uimanager.as
    public final void a(T t, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {t, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0ee6535d97519f6f56d7fff9daa3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0ee6535d97519f6f56d7fff9daa3b9");
            return;
        }
        switch (i) {
            case 1:
                b((MPShellDelegateViewManager<T, C>) t, readableArray);
                return;
            case 2:
                a((MPShellDelegateViewManager<T, C>) t, readableArray);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.msc.uimanager.as
    public void a(T t, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {t, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94727403a8e3a942d0302313620c1cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94727403a8e3a942d0302313620c1cd2");
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1639565984) {
            if (hashCode == -399823752 && str.equals("hotspotUpdate")) {
                c2 = 0;
            }
        } else if (str.equals("setPressed")) {
            c2 = 1;
        }
        switch (c2) {
            case 0:
                b((MPShellDelegateViewManager<T, C>) t, readableArray);
                return;
            case 1:
                a((MPShellDelegateViewManager<T, C>) t, readableArray);
                return;
            default:
                return;
        }
    }

    private void a(T t, @Nullable ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6dbcf2697b81fbeb8fadf0678ebbbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6dbcf2697b81fbeb8fadf0678ebbbe");
        } else if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        } else {
            t.setPressed(readableArray.getBoolean(0));
        }
    }

    private void b(T t, @Nullable ReadableArray readableArray) {
        Object[] objArr = {t, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e5dab7aeb2abbfc896759327c7a6e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e5dab7aeb2abbfc896759327c7a6e9");
        } else if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                t.drawableHotspotChanged((float) readableArray.getDouble(0), (float) readableArray.getDouble(1));
            }
        }
    }

    public e c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd82a157ae30ce6c55669a29350dc27e", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd82a157ae30ce6c55669a29350dc27e") : ((a) t).getDelegate();
    }

    @ReactPropGroup(names = {"padding", PaddingVertical.LOWER_CASE_NAME, "paddingHorizontal", PaddingStart.LOWER_CASE_NAME, PaddingEnd.LOWER_CASE_NAME, "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(T t, int i, Dynamic dynamic) {
        Object[] objArr = {t, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c9e1cd121ecb0f21df18bb1ede8595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c9e1cd121ecb0f21df18bb1ede8595");
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.endsWith("px")) {
                float parseFloat = Float.parseFloat(asString.substring(0, asString.length() - 2));
                e c2 = c((MPShellDelegateViewManager<T, C>) t);
                int i2 = ax.c[i];
                Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(parseFloat)};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "5ad871819cac0ea65f6b21f7baf5d2c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "5ad871819cac0ea65f6b21f7baf5d2c8");
                    return;
                }
                if (c2.d == null) {
                    c2.d = new ah();
                }
                c2.d.a(i2, parseFloat);
            }
        }
    }

    @ReactPropGroup(names = {"margin", MarginVertical.LOWER_CASE_NAME, MarginHorizontal.LOWER_CASE_NAME, MarginStart.LOWER_CASE_NAME, MarginEnd.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, MarginBottom.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME})
    public void setMargins(T t, int i, Dynamic dynamic) {
        Object[] objArr = {t, Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c510ee67368052d47c71270a8a5e9816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c510ee67368052d47c71270a8a5e9816");
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.endsWith("px")) {
                float parseFloat = Float.parseFloat(asString.substring(0, asString.length() - 2));
                e c2 = c((MPShellDelegateViewManager<T, C>) t);
                int i2 = ax.c[i];
                Object[] objArr2 = {Integer.valueOf(i2), Float.valueOf(parseFloat)};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "28448a18dc792bd9879742e609598427", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "28448a18dc792bd9879742e609598427");
                    return;
                }
                if (c2.e == null) {
                    c2.e = new ah();
                }
                c2.e.a(i2, parseFloat);
            }
        }
    }
}
