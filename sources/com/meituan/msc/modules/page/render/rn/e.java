package com.meituan.msc.modules.page.render.rn;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.soloader.k;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactBridge;
import com.meituan.msc.modules.page.render.rn.RNRootView;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.av;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.RobustRecorder;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    ReactApplicationContext b;
    UIImplementation c;
    com.meituan.msc.modules.viewmanager.h d;
    f e;
    volatile AtomicBoolean f;
    ConcurrentLinkedQueue<Runnable> g;
    protected RNRootView.a h;
    protected RCTEventEmitter i;
    protected com.meituan.msc.modules.engine.h j;
    protected com.meituan.msc.b k;
    protected av l;
    boolean m;
    final String n;
    private Context o;
    private ThemedReactContext p;

    public e(ReactApplicationContext reactApplicationContext, com.meituan.msc.modules.engine.h hVar, com.meituan.msc.b bVar) {
        Object[] objArr = {reactApplicationContext, hVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cdb1a2cfc20791d5267ea0769952b98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cdb1a2cfc20791d5267ea0769952b98");
            return;
        }
        this.f = new AtomicBoolean(false);
        this.g = new ConcurrentLinkedQueue<>();
        this.m = false;
        this.n = "MSCRNController@" + Integer.toHexString(hashCode());
        this.o = MSCEnvHelper.getContext();
        this.b = reactApplicationContext;
        this.j = hVar;
        this.k = bVar;
        this.l = this.j.t;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c851fec893bc3d1b0bc632ec2ac517e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c851fec893bc3d1b0bc632ec2ac517e7");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.n, "[initUIManager] init start");
        k.a(MSCEnvHelper.getContext(), false);
        ReactBridge.staticInit();
        this.p = new ThemedReactContext(this.b, this.b.getLastQueueConfig(), this.o);
        this.b.getRuntimeDelegate().setContextForPreCreateView(this.p);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ab35c3d5870e8655b313cc0cfa3432d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ab35c3d5870e8655b313cc0cfa3432d");
        } else {
            this.d = new com.meituan.msc.modules.viewmanager.h(this.b, this.k, this.l, -1);
            this.b.setUIManagerModule(this.d.c);
            this.c = this.d.c.b();
            com.meituan.msc.modules.reporter.g.d(this.n, "[createUIManager] UIManager created, MSCUIManagerModule:", this.d, ", UIImplementation: ", this.c);
        }
        a(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "805c576bc34e5a2590e0e2ab100c55f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "805c576bc34e5a2590e0e2ab100c55f7");
                } else {
                    e.this.b.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.e.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "59dda3927274514c300a5f468491bce8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "59dda3927274514c300a5f468491bce8");
                            } else if (e.this.m) {
                            } else {
                                e.this.e.getReactRootView().startReactApplication("MSC", null);
                                com.meituan.msc.modules.reporter.g.d(e.this.n, "[initUIManager] startApplication end, touch event dispatch enabled");
                            }
                        }
                    });
                }
            }
        });
    }

    public final f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44fbc342aadd8bed0cc51e21da9ed39", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44fbc342aadd8bed0cc51e21da9ed39");
        }
        if (this.e == null) {
            this.e = new f(this.b);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            RNRootView rNRootView = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc601c1c48afa274b2c953e3b63fcc64", RobustBitConfig.DEFAULT_VALUE) ? (RNRootView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc601c1c48afa274b2c953e3b63fcc64") : new RNRootView(this.o) { // from class: com.meituan.msc.modules.page.render.rn.e.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.page.render.rn.RNRootView, com.meituan.msc.views.ReactRootView, android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    Object[] objArr3 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "051d5e149fef24197398d329dd324f37", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "051d5e149fef24197398d329dd324f37")).booleanValue() : super.onInterceptTouchEvent(motionEvent);
                }

                @Override // com.meituan.msc.modules.page.render.rn.RNRootView, com.meituan.msc.views.ReactRootView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    Object[] objArr3 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "edd1808e70f552f304ad649ede8940e6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "edd1808e70f552f304ad649ede8940e6")).booleanValue() : super.onTouchEvent(motionEvent);
                }

                @Override // com.meituan.msc.modules.page.render.rn.RNRootView, com.meituan.msc.views.ReactRootView, android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "069d6668ce1253b378d96b626dd5f6f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "069d6668ce1253b378d96b626dd5f6f0");
                        return;
                    }
                    super.onMeasure(i, i2);
                    e.this.a(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.e.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4d440e089fb529d16cc7495035e821f7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4d440e089fb529d16cc7495035e821f7");
                            } else if (e.this.m) {
                                com.meituan.msc.modules.reporter.g.a(e.this.n, "[onMeasure] mDestroyed");
                            } else {
                                e.this.c.a(getRootViewTag(), getWidthMeasureSpec(), getHeightMeasureSpec());
                                e.this.f.set(true);
                                com.meituan.msc.modules.reporter.g.d(e.this.n, "[onMeasure] rootTag:", Integer.valueOf(getRootViewTag()), "widSpec:", Integer.valueOf(View.MeasureSpec.getSize(getWidthMeasureSpec())), "height:", Integer.valueOf(View.MeasureSpec.getSize(getHeightMeasureSpec())));
                                while (!e.this.g.isEmpty()) {
                                    e.this.g.poll().run();
                                }
                            }
                        }
                    });
                }
            };
            rNRootView.setReactContext(this.b);
            rNRootView.d = this.h;
            this.e.setReactRootView(rNRootView);
            f fVar = this.e;
            ReactApplicationContext reactApplicationContext = this.b;
            Object[] objArr3 = {reactApplicationContext, this.d};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "f723718d716dbb7fe044744f44a6942d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "f723718d716dbb7fe044744f44a6942d");
            } else if (fVar.e) {
                com.meituan.msc.modules.reporter.g.a("[MSCRNView]", "try to call initRootView while MRNBoxView is destroyed!");
            } else {
                fVar.c = reactApplicationContext;
            }
            this.c.a((UIImplementation) rNRootView, rNRootView.getRootViewTag(), this.p);
            com.meituan.msc.modules.reporter.g.d(this.n, "[generateView] rootView with tag:", Integer.valueOf(rNRootView.getRootViewTag()), RobustRecorder.RegisteredFieldNameStr, rNRootView);
        }
        return this.e;
    }

    void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079c1ae183de05808e14bb2711e396a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079c1ae183de05808e14bb2711e396a6");
        } else if (this.b == null) {
            com.meituan.msc.modules.reporter.g.a(this.n, "[enqueueNativeModuleThreadTask] reactContext null!");
        } else {
            this.b.runOnNativeModulesQueueThread(runnable);
        }
    }

    public final void a(RNRootView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d56ec27a3f22624188feab9c7131622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d56ec27a3f22624188feab9c7131622");
            return;
        }
        this.h = aVar;
        if (this.e != null) {
            this.e.getReactRootView().d = aVar;
        }
    }

    public final void a(RCTEventEmitter rCTEventEmitter) {
        this.i = rCTEventEmitter;
    }
}
