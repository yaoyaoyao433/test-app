package com.meituan.msc.uimanager.bingingx;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.e;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.jse.modules.core.JSDeviceEventEmitter;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements LifecycleEventListener {
    public static ChangeQuickRedirect a;
    private ReactApplicationContext b;
    private com.alibaba.android.bindingx.core.a c;
    private com.alibaba.android.bindingx.core.e d;
    private ExecutorService e;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "4df1c72dad6fe45aff178f029ed48920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "4df1c72dad6fe45aff178f029ed48920");
            return;
        }
        if (dVar.d == null) {
            final ReactApplicationContext reactApplicationContext = dVar.b;
            Object[] objArr2 = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            dVar.d = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ee25523d5c9d8bb941f8d753c9614074", RobustBitConfig.DEFAULT_VALUE) ? (com.alibaba.android.bindingx.core.e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ee25523d5c9d8bb941f8d753c9614074") : new e.a().a(new e.c() { // from class: com.meituan.msc.uimanager.bingingx.d.8
                public static ChangeQuickRedirect a;

                @Override // com.alibaba.android.bindingx.core.e.c
                @Nullable
                public final View a(String str, Object... objArr3) {
                    Object[] objArr4 = {str, objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "e1f8edcc0dcceddeaeaec868f1ba238e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "e1f8edcc0dcceddeaeaec868f1ba238e");
                    }
                    if (ReactApplicationContext.this == null || ReactApplicationContext.this.getUIManagerModule() == null || ReactApplicationContext.this.getUIImplementation() == null) {
                        return null;
                    }
                    try {
                        return ReactApplicationContext.this.getUIManagerModule().b().g((int) Double.valueOf(str.trim()).doubleValue());
                    } catch (NumberFormatException e) {
                        com.alibaba.android.bindingx.core.d.a("number format error", e);
                        return null;
                    }
                }
            }).a(new e.d() { // from class: com.meituan.msc.uimanager.bingingx.d.7
                public static ChangeQuickRedirect a;

                @Override // com.alibaba.android.bindingx.core.e.d
                public final void a(@NonNull final View view, @NonNull final String str, @NonNull final Object obj, @NonNull final e.b bVar, @NonNull final Map<String, Object> map, Object... objArr3) {
                    final int i;
                    final UIImplementation b;
                    Object[] objArr4 = {view, str, obj, bVar, map, objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "5e2ed146783cab6cf6260eb00fc94754", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "5e2ed146783cab6cf6260eb00fc94754");
                        return;
                    }
                    String str2 = objArr3[0] instanceof String ? (String) objArr3[0] : null;
                    if (ReactApplicationContext.this == null || TextUtils.isEmpty(str2)) {
                        return;
                    }
                    try {
                        i = (int) Double.valueOf(str2.trim()).doubleValue();
                    } catch (Exception unused) {
                        i = -1;
                    }
                    UIManagerModule uIManagerModule = ReactApplicationContext.this.getUIManagerModule();
                    if (uIManagerModule == null || i == -1 || (b = uIManagerModule.b()) == null) {
                        return;
                    }
                    UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.uimanager.bingingx.d.7.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "a886baa6913a93407e0dea768cfe18fd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "a886baa6913a93407e0dea768cfe18fd");
                            } else {
                                e.a(str).a(i, view, obj, bVar, map, b);
                            }
                        }
                    });
                }
            }).a(new e.b() { // from class: com.meituan.msc.uimanager.bingingx.d.6
                @Override // com.alibaba.android.bindingx.core.e.b
                public final double a(double d, Object... objArr3) {
                    return d;
                }

                @Override // com.alibaba.android.bindingx.core.e.b
                public final double b(double d, Object... objArr3) {
                    return d;
                }
            }).a();
        }
        if (dVar.c == null) {
            dVar.c = new com.alibaba.android.bindingx.core.a(dVar.d);
            dVar.c.a(Constants.FPS_TYPE_SCROLL, new a.b<com.alibaba.android.bindingx.core.c, Context, com.alibaba.android.bindingx.core.e>() { // from class: com.meituan.msc.uimanager.bingingx.d.3
                public static ChangeQuickRedirect a;

                @Override // com.alibaba.android.bindingx.core.a.b
                public final /* synthetic */ com.alibaba.android.bindingx.core.c a(@NonNull Context context, @NonNull com.alibaba.android.bindingx.core.e eVar, Object[] objArr3) {
                    Context context2 = context;
                    com.alibaba.android.bindingx.core.e eVar2 = eVar;
                    Object[] objArr4 = {context2, eVar2, objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "ddbad6b5957eea5d1b964cf9af9ee547", RobustBitConfig.DEFAULT_VALUE) ? (com.alibaba.android.bindingx.core.c) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "ddbad6b5957eea5d1b964cf9af9ee547") : new com.meituan.msc.uimanager.bingingx.a(context2, eVar2, objArr3);
                }
            });
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a2835a9ef7bc5eaf3a2088f8dcf57c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a2835a9ef7bc5eaf3a2088f8dcf57c");
            return;
        }
        this.e = null;
        this.b = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public final WritableMap a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361de4ecdad4daa14e5681313e7eae72", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361de4ecdad4daa14e5681313e7eae72");
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList(2);
        final ReadableMap b = b(readableMap);
        a(new Runnable() { // from class: com.meituan.msc.uimanager.bingingx.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "713ab15126a98e67964af52ae4a18cce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "713ab15126a98e67964af52ae4a18cce");
                    return;
                }
                try {
                    d.a(d.this);
                    arrayList.add(d.this.c.a(d.this.b, null, b == null ? Collections.emptyMap() : b.toHashMap(), new a.InterfaceC0017a() { // from class: com.meituan.msc.uimanager.bingingx.d.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.alibaba.android.bindingx.core.a.InterfaceC0017a
                        public final void a(Object obj) {
                            JSDeviceEventEmitter jSDeviceEventEmitter;
                            Object[] objArr3 = {obj};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80127ac62dbe26029bd53ad277ccaa8e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80127ac62dbe26029bd53ad277ccaa8e");
                                return;
                            }
                            WritableMap createMap = Arguments.createMap();
                            Map map = (Map) obj;
                            createMap.putString("token", (String) map.get("source"));
                            createMap.putString("state", (String) map.get("state"));
                            if (d.this.b == null || (jSDeviceEventEmitter = (JSDeviceEventEmitter) d.this.b.getJSModule(JSDeviceEventEmitter.class)) == null) {
                                return;
                            }
                            jSDeviceEventEmitter.emit("bindingx:statechange", createMap);
                        }
                    }));
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        String str = arrayList.size() > 0 ? (String) arrayList.get(0) : null;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("token", str);
        return createMap;
    }

    private ReadableMap b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a529e602b4fbf671d6f2d6ec7bf43b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a529e602b4fbf671d6f2d6ec7bf43b");
        }
        if (readableMap == null || !readableMap.hasKey("eventType") || readableMap.getType("eventType") != ReadableType.String || !readableMap.getString("eventType").equals(Constants.FPS_TYPE_SCROLL) || !readableMap.hasKey("anchorTag") || !readableMap.hasKey("props") || readableMap.getType("props") != ReadableType.Array || readableMap.getArray("props") == null || readableMap.getArray("props").size() == 0) {
            throw new RuntimeException("bindingx params is not valid");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("eventType", readableMap.getString("eventType"));
        createMap.putInt("anchor", readableMap.getInt("anchorTag"));
        ReadableArray array = readableMap.getArray("props");
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            if (map != null) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putInt("element", map.getInt("targetTag"));
                createMap2.putString("property", map.getString("property"));
                WritableMap createMap3 = Arguments.createMap();
                createMap2.putMap("expression", createMap3);
                createMap3.putString("transformed", map.getString("expression"));
                createMap3.putString("origin", "");
                createArray.pushMap(createMap2);
            }
        }
        createMap.putArray("props", createArray);
        return createMap;
    }

    public void a(@Nullable Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb467858a0d5866620ff0ba867162b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb467858a0d5866620ff0ba867162b1");
            return;
        }
        if (this.e == null) {
            this.e = com.sankuai.android.jarvis.c.a("bindingX-thread");
        }
        this.e.execute(new a(runnable));
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e614d6163549de4c8df99fe4fd610be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e614d6163549de4c8df99fe4fd610be");
        } else {
            a(new Runnable() { // from class: com.meituan.msc.uimanager.bingingx.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "243f1212727a4b554f50e3aef498d56a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "243f1212727a4b554f50e3aef498d56a");
                    } else if (d.this.c != null) {
                        com.alibaba.android.bindingx.core.d.a("host resumed");
                        d.this.c.b();
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3640e18b53ab196f774a22336073c023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3640e18b53ab196f774a22336073c023");
        } else {
            a(new Runnable() { // from class: com.meituan.msc.uimanager.bingingx.d.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66b4c3f2782bb115b0ace7b5bc81caf1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66b4c3f2782bb115b0ace7b5bc81caf1");
                    } else if (d.this.c != null) {
                        com.alibaba.android.bindingx.core.d.a("host paused");
                        d.this.c.a();
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13f1f1881ebf36662074e1969237232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13f1f1881ebf36662074e1969237232");
        } else if (this.e != null) {
            this.e.shutdownNow();
            this.e = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        public Runnable b;

        public a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d96fbfaa35cbb585bec40df3f11b4cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d96fbfaa35cbb585bec40df3f11b4cc");
            } else {
                this.b = runnable;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05fb7f506a561ef430e01e3e31bda66b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05fb7f506a561ef430e01e3e31bda66b");
            } else if (this.b != null) {
                try {
                    this.b.run();
                } catch (Exception e) {
                    com.alibaba.android.bindingx.core.d.a("unexpected internal error", e);
                }
            }
        }
    }
}
