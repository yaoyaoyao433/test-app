package com.dianping.live.report;

import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b extends a.AbstractC0145a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private final com.facebook.react.modules.core.a c;
    private final ReactContext d;
    private final UIManagerModule e;
    private final com.facebook.react.modules.debug.a f;
    private boolean g;
    private long h;
    private long i;
    private int j;
    private int k;
    private final float l;
    private int m;
    private double n;
    private double o;
    private int p;
    private double q;
    private int r;

    public b(com.facebook.react.modules.core.a aVar, ReactContext reactContext, int i) {
        Activity currentActivity;
        WindowManager windowManager;
        Display defaultDisplay;
        Object[] objArr = {aVar, reactContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7152f3751ed7d289243fc7121f6a299c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7152f3751ed7d289243fc7121f6a299c");
            return;
        }
        this.g = false;
        this.h = 0L;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.n = 0.0d;
        this.o = 0.0d;
        this.p = 0;
        this.q = 0.0d;
        this.r = 0;
        this.c = aVar;
        this.d = reactContext;
        this.m = i;
        this.e = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f = new com.facebook.react.modules.debug.a();
        float f = -1.0f;
        if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null && (windowManager = currentActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            f = defaultDisplay.getRefreshRate();
        }
        this.l = f <= 0.0f ? 60.0f : f;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0145a
    public void doFrame(long j) {
        double d;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f388af020a5a9143c47473eb000e70a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f388af020a5a9143c47473eb000e70a9");
        } else if (!this.g || this.d == null) {
        } else {
            if (this.h == 0) {
                this.h = j;
            } else {
                this.i += j - this.h;
                this.j++;
                if (this.f.a(this.h, j)) {
                    this.k++;
                }
                this.h = j;
                if (this.i > 1.0E9d) {
                    if (this.k <= 0 || this.i <= 0) {
                        d = -1.0d;
                    } else {
                        d = (this.k * 1.0E9d) / this.i;
                        if (d > this.l) {
                            d = this.l;
                        }
                    }
                    if (this.n > 0.0d) {
                        this.n = ((this.n * this.p) + d) / (this.p + 1);
                    } else {
                        this.n = d;
                    }
                    if (d < this.o || this.o == 0.0d) {
                        this.o = d;
                    }
                    this.p++;
                    if (this.q > 0.0d) {
                        this.q = ((this.q * this.r) + d) / (this.r + 1);
                    } else {
                        this.q = d;
                    }
                    this.r++;
                    if (this.p >= this.m) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7192bda0af3ec75e7729e2def09fcf4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7192bda0af3ec75e7729e2def09fcf4");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("MLIVE_JS_AVG_FPS", Double.valueOf(this.n));
                            hashMap.put("MLIVE_JS_MIN_FPS", Double.valueOf(this.o));
                            d.b.a(null, hashMap, null);
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e143702a597493adc056b399580cfd47", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e143702a597493adc056b399580cfd47");
                            } else {
                                this.n = 0.0d;
                                this.o = 0.0d;
                                this.p = 0;
                            }
                            c();
                        }
                    } else {
                        c();
                    }
                }
            }
            this.c.a(this);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2af07652a922dc0f1928ddae795e229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2af07652a922dc0f1928ddae795e229");
        } else if (this.g || this.d == null) {
        } else {
            this.g = true;
            c();
            this.d.getCatalystInstance().addBridgeIdleDebugListener(this.f);
            this.e.setViewHierarchyUpdateDebugListener(this.f);
            this.c.a(this, 1000L);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476aa480f577faea4d8e4ca1667487b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476aa480f577faea4d8e4ca1667487b6");
        } else if (!this.g || this.d == null) {
        } else {
            this.g = false;
            this.d.getCatalystInstance().removeBridgeIdleDebugListener(this.f);
            this.e.setViewHierarchyUpdateDebugListener(null);
            d();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb93966b45c15d3178094a3a1830325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb93966b45c15d3178094a3a1830325");
            return;
        }
        this.h = 0L;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8c07c12f3d2438262550f3354ee840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8c07c12f3d2438262550f3354ee840");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MLIVE_JS_PV_AVG_FPS", Double.valueOf(this.q));
        d.b.a(null, hashMap, null);
        this.q = 0.0d;
        this.r = 0;
    }
}
