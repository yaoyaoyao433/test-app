package com.meituan.android.legwork.mrn.scroll;

import android.support.v4.view.ViewCompat;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SpringScrollViewManager extends ViewGroupManager {
    public static final int COMMAND_END_LOADING = 10001;
    public static final int COMMAND_END_REFRESH = 10000;
    public static final int COMMAND_SCROLL_TO = 10002;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BMLWSpringScrollView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80e83cf464dd46d164e5062d882c935e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80e83cf464dd46d164e5062d882c935e");
        }
        SpringScrollView springScrollView = new SpringScrollView(aoVar);
        ViewCompat.setNestedScrollingEnabled(springScrollView, true);
        return springScrollView;
    }

    @ReactProp(name = "refreshHeaderHeight")
    public void setRefreshHeaderHeight(SpringScrollView springScrollView, float f) {
        Object[] objArr = {springScrollView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "080e2da701704b970f633a1671db645c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "080e2da701704b970f633a1671db645c");
        } else {
            springScrollView.setRefreshHeaderHeight(w.a(f));
        }
    }

    @ReactProp(name = "loadingFooterHeight")
    public void setLoadingFooterHeight(SpringScrollView springScrollView, float f) {
        Object[] objArr = {springScrollView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6edb5a86d9a965873bc0a5426e664e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6edb5a86d9a965873bc0a5426e664e95");
        } else {
            springScrollView.setLoadingFooterHeight(w.a(f));
        }
    }

    @ReactProp(name = "bounces")
    public void setBounces(SpringScrollView springScrollView, boolean z) {
        Object[] objArr = {springScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6f1635ecdd896ceac09144727b3ca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6f1635ecdd896ceac09144727b3ca1");
        } else {
            springScrollView.setBounces(z);
        }
    }

    @ReactProp(name = "scrollEnabled")
    public void setScrollEnabled(SpringScrollView springScrollView, boolean z) {
        Object[] objArr = {springScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6378604d5c98365c7334a5573acd1421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6378604d5c98365c7334a5573acd1421");
        } else {
            springScrollView.setScrollEnabled(z);
        }
    }

    @ReactProp(name = "initialContentOffset")
    public void setInitContentOffset(SpringScrollView springScrollView, ReadableMap readableMap) {
        Object[] objArr = {springScrollView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea11b0dd1b3773d28fdfaf1a9285693d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea11b0dd1b3773d28fdfaf1a9285693d");
        } else if (readableMap != null) {
            float a = w.a(readableMap.getDouble(Constants.GestureMoveEvent.KEY_X));
            float a2 = w.a(readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y));
            springScrollView.f.a = a;
            springScrollView.f.b = a2;
        }
    }

    @ReactProp(name = "allLoaded")
    public void setAllLoaded(SpringScrollView springScrollView, boolean z) {
        Object[] objArr = {springScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc2ffc187dbfaea5052453ace547f523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc2ffc187dbfaea5052453ace547f523");
        } else {
            springScrollView.setAllLoaded(z);
        }
    }

    @ReactProp(name = "inverted")
    public void setInverted(SpringScrollView springScrollView, boolean z) {
        Object[] objArr = {springScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb1d38a9218ee449bf8767c8dfdc06d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb1d38a9218ee449bf8767c8dfdc06d2");
        } else {
            springScrollView.setInverted(z);
        }
    }

    @ReactProp(name = "directionalLockEnabled")
    public void setDirectionalLockEnabled(SpringScrollView springScrollView, boolean z) {
        Object[] objArr = {springScrollView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffbdb9d5afdad15988731589c6072ebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffbdb9d5afdad15988731589c6072ebf");
        } else {
            springScrollView.setDirectionalLockEnabled(z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc4b5e0cc038a764860e0dde5589e91", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc4b5e0cc038a764860e0dde5589e91") : com.facebook.react.common.c.b().a("onScroll", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onScroll"))).a("onTouchBegin", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTouchBegin"))).a("onTouchEnd", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTouchEnd"))).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN))).a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", DMKeys.KEY_ON_MOMENTUM_SCROLL_END))).a("onScrollToBegin", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onScrollToBegin"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(View view, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {view, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a20a29257d9c473d901ebc94e3bac14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a20a29257d9c473d901ebc94e3bac14");
            return;
        }
        SpringScrollView springScrollView = (SpringScrollView) view;
        switch (i) {
            case 10000:
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = SpringScrollView.a;
                if (PatchProxy.isSupport(objArr2, springScrollView, changeQuickRedirect3, false, "2adaebbeb3a72b1fc75dd37f74f92b2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, springScrollView, changeQuickRedirect3, false, "2adaebbeb3a72b1fc75dd37f74f92b2b");
                    return;
                } else if (springScrollView.c.equals("refreshing")) {
                    springScrollView.c = "rebound";
                    if (springScrollView.b != null) {
                        springScrollView.b.cancel();
                    }
                    springScrollView.i.a = 0.0f;
                    springScrollView.b = new a(springScrollView.e.b, 0.0f, 500L) { // from class: com.meituan.android.legwork.mrn.scroll.SpringScrollView.4
                        public static ChangeQuickRedirect c;

                        @Override // com.meituan.android.legwork.mrn.scroll.a
                        public final void a(float f) {
                            Object[] objArr3 = {Float.valueOf(f)};
                            ChangeQuickRedirect changeQuickRedirect4 = c;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "06f4c7b6a75c69f2347455af004fcd9c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "06f4c7b6a75c69f2347455af004fcd9c");
                            } else {
                                SpringScrollView.this.b(SpringScrollView.this.e.a, f);
                            }
                        }
                    };
                    springScrollView.b.a();
                    return;
                } else {
                    return;
                }
            case 10001:
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = SpringScrollView.a;
                if (PatchProxy.isSupport(objArr3, springScrollView, changeQuickRedirect4, false, "d8df64a541f691550469f49b95e4b356", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, springScrollView, changeQuickRedirect4, false, "d8df64a541f691550469f49b95e4b356");
                    return;
                } else if (springScrollView.d.equals("loading")) {
                    springScrollView.d = "rebound";
                    if (springScrollView.b != null) {
                        springScrollView.b.cancel();
                    }
                    springScrollView.i.b = 0.0f;
                    springScrollView.b = new a(springScrollView.e.b, springScrollView.h.b - springScrollView.g.b, 500L) { // from class: com.meituan.android.legwork.mrn.scroll.SpringScrollView.5
                        public static ChangeQuickRedirect c;

                        @Override // com.meituan.android.legwork.mrn.scroll.a
                        public final void a(float f) {
                            Object[] objArr4 = {Float.valueOf(f)};
                            ChangeQuickRedirect changeQuickRedirect5 = c;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f6f905265a0e2e364c5fab1b74ed6feb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f6f905265a0e2e364c5fab1b74ed6feb");
                            } else {
                                SpringScrollView.this.b(SpringScrollView.this.e.a, f);
                            }
                        }
                    };
                    springScrollView.b.a();
                    return;
                } else {
                    return;
                }
            case 10002:
                float a = w.a(readableArray.getDouble(0));
                float a2 = w.a(readableArray.getDouble(1));
                boolean z = readableArray.getBoolean(2);
                Object[] objArr4 = {Float.valueOf(a), Float.valueOf(a2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect5 = SpringScrollView.a;
                if (PatchProxy.isSupport(objArr4, springScrollView, changeQuickRedirect5, false, "17a1d90285bad1ffd2d344ff74bf5f1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, springScrollView, changeQuickRedirect5, false, "17a1d90285bad1ffd2d344ff74bf5f1f");
                    return;
                }
                springScrollView.a();
                if (!z) {
                    springScrollView.a(a, a2);
                    return;
                }
                springScrollView.b = new a(springScrollView.e.b, a2, 500L) { // from class: com.meituan.android.legwork.mrn.scroll.SpringScrollView.6
                    public static ChangeQuickRedirect c;

                    @Override // com.meituan.android.legwork.mrn.scroll.a
                    public final void b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = c;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "f79015309551522e69595264f8f1f5b2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "f79015309551522e69595264f8f1f5b2");
                        } else {
                            SpringScrollView.this.a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, (WritableMap) null);
                        }
                    }

                    @Override // com.meituan.android.legwork.mrn.scroll.a
                    public final void a(float f) {
                        Object[] objArr5 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect6 = c;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "58357ac100b0dd55886a0476f066247d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "58357ac100b0dd55886a0476f066247d");
                        } else {
                            SpringScrollView.this.b(SpringScrollView.this.e.a, f);
                        }
                    }
                };
                springScrollView.b.a();
                springScrollView.a("onScrollToBegin", (WritableMap) null);
                return;
            default:
                return;
        }
    }
}
