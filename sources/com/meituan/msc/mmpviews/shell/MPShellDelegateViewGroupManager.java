package com.meituan.msc.mmpviews.shell;

import android.graphics.Rect;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.uimanager.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MPShellDelegateViewGroupManager<T extends ViewGroup> extends MPShellDelegateViewManager<T, MPLayoutShadowNode> implements com.meituan.msc.uimanager.e<T>, com.meituan.msc.uimanager.f {
    private static WeakHashMap<View, Integer> a = new WeakHashMap<>();
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msc.uimanager.f
    public boolean h() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @CallSuper
    public /* bridge */ /* synthetic */ void a(@NonNull View view) {
        a((MPShellDelegateViewGroupManager<T>) ((ViewGroup) view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager
    public final /* synthetic */ e c(View view) {
        return d((MPShellDelegateViewGroupManager<T>) ((ViewGroup) view));
    }

    @Override // com.meituan.msc.uimanager.as
    /* renamed from: g */
    public MPLayoutShadowNode d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec9779a6291e226d62c8ff3937bf493", RobustBitConfig.DEFAULT_VALUE) ? (MPLayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec9779a6291e226d62c8ff3937bf493") : new MPLayoutShadowNode();
    }

    @Override // com.meituan.msc.uimanager.as
    public final Class<? extends MPLayoutShadowNode> c() {
        return MPLayoutShadowNode.class;
    }

    @Override // com.meituan.msc.uimanager.e
    public void a(T t, View view, int i) {
        Object[] objArr = {t, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ce07472898bdf71b41f42ff7aaa939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ce07472898bdf71b41f42ff7aaa939");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        f d = d((MPShellDelegateViewGroupManager<T>) t);
        if (d.o) {
            Object[] objArr2 = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = f.m;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "5e8f3ca2dfae6206ec8872c52c193f63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "5e8f3ca2dfae6206ec8872c52c193f63");
                return;
            } else {
                d.a(view, i, f.n);
                return;
            }
        }
        Object[] objArr3 = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = f.m;
        if (PatchProxy.isSupport(objArr3, d, changeQuickRedirect3, false, "81e263638c5991252e362c7d9b44685b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, d, changeQuickRedirect3, false, "81e263638c5991252e362c7d9b44685b");
        } else if (d.C != null) {
            d.C.addView(view, i);
        } else {
            d.D.addView(view, i);
        }
    }

    @Override // com.meituan.msc.uimanager.e
    public int b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78835a001d1dcead3154922b4ac7c710", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78835a001d1dcead3154922b4ac7c710")).intValue();
        }
        f d = d((MPShellDelegateViewGroupManager<T>) t);
        if (!d.o) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.m;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "bc753ba6f4fea3a93e37bd7c390275fb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "bc753ba6f4fea3a93e37bd7c390275fb")).intValue();
            }
            if (d.C != null) {
                return d.C.getChildCount();
            }
            return d.D.getChildCount();
        }
        return d.q;
    }

    @Override // com.meituan.msc.uimanager.e
    public View a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2be7e1816450429be550e32e3a4fe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2be7e1816450429be550e32e3a4fe7");
        }
        f d = d((MPShellDelegateViewGroupManager<T>) t);
        if (d.o) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = f.m;
            return PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "918adaac3b098236b2e4809f3d1af1a3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "918adaac3b098236b2e4809f3d1af1a3") : ((View[]) com.facebook.infer.annotation.a.a(d.p))[i];
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = f.m;
        if (PatchProxy.isSupport(objArr3, d, changeQuickRedirect3, false, "fbd8739087bc5bb43b7485dcb0fab13b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr3, d, changeQuickRedirect3, false, "fbd8739087bc5bb43b7485dcb0fab13b");
        }
        if (d.C != null) {
            return d.C.getChildAt(i);
        }
        return d.D.getChildAt(i);
    }

    @Override // com.meituan.msc.uimanager.e
    public void b(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8928affd6fc6ca76804cb78752ecb66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8928affd6fc6ca76804cb78752ecb66a");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        f d = d((MPShellDelegateViewGroupManager<T>) t);
        if (d.o) {
            View a2 = a((MPShellDelegateViewGroupManager<T>) t, i);
            if (a2.getParent() != null) {
                t.removeView(a2);
            }
            d.b(a2);
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "80b17b894ad17b1da9c27ed3d0c1b5fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "80b17b894ad17b1da9c27ed3d0c1b5fa");
        } else if (d.C != null) {
            d.C.removeViewAt(i);
        } else {
            d.D.removeViewAt(i);
        }
    }

    @Override // com.meituan.msc.uimanager.e
    public void a(T t, View view) {
        Object[] objArr = {t, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4255bc1a08305b32520f17081c76e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4255bc1a08305b32520f17081c76e6c");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < b((MPShellDelegateViewGroupManager<T>) t); i++) {
            if (a((MPShellDelegateViewGroupManager<T>) t, i) == view) {
                b((MPShellDelegateViewGroupManager<T>) t, i);
                return;
            }
        }
    }

    @Override // com.meituan.msc.uimanager.e
    public void c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bdce4f2755650d0c74f6b3b20ce4953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bdce4f2755650d0c74f6b3b20ce4953");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        f d = d((MPShellDelegateViewGroupManager<T>) t);
        if (d.o) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.m;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "abc6f0e017e93cdca2483e5c729fd7d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "abc6f0e017e93cdca2483e5c729fd7d7");
                return;
            }
            com.facebook.infer.annotation.a.a(d.o);
            com.facebook.infer.annotation.a.a(d.p);
            for (int i = 0; i < d.q; i++) {
                d.p[i].removeOnLayoutChangeListener(d.u);
            }
            d.D.removeAllViewsInLayout();
            d.q = 0;
            return;
        }
        t.removeAllViews();
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53263f089ebc140e43c84ac733a2ff14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53263f089ebc140e43c84ac733a2ff14");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        d((MPShellDelegateViewGroupManager<T>) t).a(z);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(T t, @Nullable ReadableMap readableMap) {
        Object[] objArr = {t, readableMap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b55b4b67b5118ee2473d7101d838662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b55b4b67b5118ee2473d7101d838662");
        } else if (readableMap == null) {
            d((MPShellDelegateViewGroupManager<T>) t).s = null;
        } else {
            d((MPShellDelegateViewGroupManager<T>) t).s = new Rect(readableMap.hasKey("left") ? (int) s.a(readableMap.getDouble("left")) : 0, readableMap.hasKey("top") ? (int) s.a(readableMap.getDouble("top")) : 0, readableMap.hasKey("right") ? (int) s.a(readableMap.getDouble("right")) : 0, readableMap.hasKey("bottom") ? (int) s.a(readableMap.getDouble("bottom")) : 0);
        }
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(T t, @Nullable String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb81d50a7dc7ad1978811c2b2a9fb0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb81d50a7dc7ad1978811c2b2a9fb0d4");
        } else if (str == null) {
            d((MPShellDelegateViewGroupManager<T>) t).t = t.AUTO;
        } else {
            d((MPShellDelegateViewGroupManager<T>) t).t = t.valueOf(str.toUpperCase(Locale.US).replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE));
        }
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db59c324841c329c1f17890d9571c29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db59c324841c329c1f17890d9571c29");
        } else {
            d((MPShellDelegateViewGroupManager<T>) t).w = z;
        }
    }

    @ReactProp(name = "overflowX")
    public void setOverflowX(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397915c9037b854f2840ab7ec1370300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397915c9037b854f2840ab7ec1370300");
        } else {
            d((MPShellDelegateViewGroupManager<T>) t).z = com.meituan.msc.mmpviews.csstypes.f.a(str);
        }
    }

    @ReactProp(name = "overflowY")
    public void setOverflowY(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91ec96e875a1f07e505a3f7e94112cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91ec96e875a1f07e505a3f7e94112cab");
        } else {
            d((MPShellDelegateViewGroupManager<T>) t).A = com.meituan.msc.mmpviews.csstypes.f.a(str);
        }
    }

    @CallSuper
    public void a(@NonNull T t) {
        boolean z = true;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32ee0072c73ce13ba7cdbe3f1a54928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32ee0072c73ce13ba7cdbe3f1a54928");
            return;
        }
        super.a((MPShellDelegateViewGroupManager<T>) t);
        f d = d((MPShellDelegateViewGroupManager<T>) t);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.m;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "ab81946b928d150b3595bfd7d55fe719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "ab81946b928d150b3595bfd7d55fe719");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f.m;
        if (PatchProxy.isSupport(objArr3, d, changeQuickRedirect3, false, "ee6e3d2768b471dbbec92d7b91ad12f7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, d, changeQuickRedirect3, false, "ee6e3d2768b471dbbec92d7b91ad12f7")).booleanValue();
        } else if (!d.p() && !d.q()) {
            z = false;
        }
        if (z) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = f.m;
            if (PatchProxy.isSupport(objArr4, d, changeQuickRedirect4, false, "88a0cf43020ba8f7b5cd35bad4ef6180", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, d, changeQuickRedirect4, false, "88a0cf43020ba8f7b5cd35bad4ef6180");
            } else if (d.C == null) {
                d.C = new com.meituan.msc.mmpviews.shell.scroll.c(d.n(), d);
                if (d.q()) {
                    d.B = new com.meituan.msc.mmpviews.shell.scroll.b(d.n(), d);
                } else if (d.p()) {
                    d.B = new com.meituan.msc.mmpviews.shell.scroll.a(d.n(), d);
                }
                f.a(d.D, d.C);
                d.B.addView(d.C);
                d.D.addView(d.B, 0);
            }
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = f.m;
            if (PatchProxy.isSupport(objArr5, d, changeQuickRedirect5, false, "376e524fd1e1150f10bcc960cf85a672", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, d, changeQuickRedirect5, false, "376e524fd1e1150f10bcc960cf85a672");
            } else if (d.C != null) {
                f.a(d.C, d.D);
                d.D.removeView(d.B);
                d.B = null;
                d.C = null;
            }
        }
        d.D.invalidate();
    }

    private f d(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fe19e787f7d1d2d2f20fafb9ff23a8", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fe19e787f7d1d2d2f20fafb9ff23a8") : ((b) t).getDelegate();
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewManager, com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    @Nullable
    public Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82fd267186e94c5b80523f3e1463d06", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82fd267186e94c5b80523f3e1463d06");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fbacd8e864a2e0562bdf9e0c0eb015fd", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fbacd8e864a2e0562bdf9e0c0eb015fd") : com.meituan.msc.jse.common.a.c().a(com.meituan.msc.mmpviews.scroll.e.a(com.meituan.msc.mmpviews.scroll.e.SCROLL), com.meituan.msc.jse.common.a.a("registrationName", "onScroll")).a(com.meituan.msc.mmpviews.scroll.e.a(com.meituan.msc.mmpviews.scroll.e.SCROLL_TO_UPPER), com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(com.meituan.msc.mmpviews.scroll.e.a(com.meituan.msc.mmpviews.scroll.e.SCROLL_TO_UPPER), com.meituan.msc.jse.common.a.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a("topAccessibilityAction", com.meituan.msc.jse.common.a.a("registrationName", "onAccessibilityAction")).a();
    }
}
