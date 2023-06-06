package com.meituan.android.mrn.services;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.util.Pair;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.CommonJsHost;
import com.dianping.titans.js.JsCallback;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBInitCallback;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.titans.base.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static final String b = "c";
    private static WeakHashMap<Activity, List<Pair<BridgeManager, CommonJsHost>>> c = null;
    private static Application.ActivityLifecycleCallbacks d = null;
    private static boolean e = false;

    static {
        c();
        d();
    }

    private static synchronized void c() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7842d32a4ce254fddd7b0a7c6a9a09ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7842d32a4ce254fddd7b0a7c6a9a09ec");
            } else {
                c = new WeakHashMap<>();
            }
        }
    }

    private static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0d6c556bf5072daf3d7eb83c5a681ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0d6c556bf5072daf3d7eb83c5a681ce");
        } else {
            d = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.mrn.services.c.1
                public static ChangeQuickRedirect a;
                private boolean b = false;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bca136e709ebd50075b439c1c9fe5e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bca136e709ebd50075b439c1c9fe5e5");
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "861213a9d20029fb751652f63abe643e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "861213a9d20029fb751652f63abe643e");
                    } else if (this.b) {
                        synchronized (c.class) {
                            if (c.c != null && c.c.containsKey(activity)) {
                                for (Pair pair : (List) c.c.get(activity)) {
                                    CommonJsHost commonJsHost = (CommonJsHost) pair.second;
                                    if (commonJsHost != null) {
                                        commonJsHost.publish("foreground");
                                    }
                                }
                            }
                        }
                        this.b = false;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f0fd019ef85112b2796a6d8a5a44a46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f0fd019ef85112b2796a6d8a5a44a46");
                        return;
                    }
                    this.b = ProcessUtils.isBackground(activity);
                    if (this.b) {
                        synchronized (c.class) {
                            if (c.c != null && c.c.containsKey(activity)) {
                                for (Pair pair : (List) c.c.get(activity)) {
                                    CommonJsHost commonJsHost = (CommonJsHost) pair.second;
                                    if (commonJsHost != null) {
                                        commonJsHost.publish("background");
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86215abd3b4c468d98c487fdab9ece57", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86215abd3b4c468d98c487fdab9ece57");
                        return;
                    }
                    synchronized (c.class) {
                        if (c.c != null && c.c.containsKey(activity)) {
                            for (Pair pair : (List) c.c.get(activity)) {
                                BridgeManager bridgeManager = (BridgeManager) pair.first;
                                if (bridgeManager != null) {
                                    bridgeManager.destory();
                                }
                            }
                            c.c.remove(activity);
                        }
                    }
                }
            };
        }
    }

    public static void a(Activity activity, final ReactContext reactContext, final String str, final String str2, final String str3, final Callback callback, final boolean z) {
        Object[] objArr = {activity, reactContext, str, str2, str3, callback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c0b7b65c8782116071db050f33da768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c0b7b65c8782116071db050f33da768");
            return;
        }
        String format = String.format("%s.invoke: getInitCallback null, method:%s params:%s callbackId:%s ", b, str, str2, str3);
        String format2 = String.format("%s.invoke: KNBBridge init success,", b);
        if (BridgeManager.getJSBPerformer() == null) {
            KNBInitCallback initCallback = KNBWebManager.getInitCallback();
            if (initCallback != null) {
                p.a("[KNBBridgeStrategy@invoke]", String.format("%s hasRegistered:%s", format2, Boolean.valueOf(e)));
                initCallback.init(activity);
                KNBWebManager.setInitCallback(null);
            } else {
                p.a("[KNBBridgeStrategy@invoke]", String.format("%s hasRegistered:%s", format, Boolean.valueOf(e)));
            }
        }
        if (!e) {
            e = true;
            KNBInitCallback initCallback2 = KNBWebManager.getInitCallback();
            if (initCallback2 != null) {
                p.a("[KNBBridgeStrategy@invoke]", String.format("%s hasRegistered:%s", format2, Boolean.valueOf(e)));
                initCallback2.init(activity);
                KNBWebManager.setInitCallback(null);
            } else {
                p.a("[KNBBridgeStrategy@invoke]", String.format("%s hasRegistered:%s", format, Boolean.valueOf(e)));
            }
            if (d == null) {
                d();
            }
            activity.getApplication().registerActivityLifecycleCallbacks(d);
        }
        CommonJsHost commonJsHost = new CommonJsHost(activity) { // from class: com.meituan.android.mrn.services.c.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.titans.js.CommonJsHost, com.dianping.titans.js.JsHost
            public final void getCapture(String str4, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
                Object[] objArr2 = {str4, bitmapCallbackListener};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d58170f7f482d452a8b0c8982ee16e3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d58170f7f482d452a8b0c8982ee16e3a");
                    return;
                }
                try {
                    bitmapCallbackListener.onGetBitmap(com.meituan.android.mrn.utils.b.a(this.activity), Bitmap.CompressFormat.JPEG);
                } catch (OutOfMemoryError unused) {
                    bitmapCallbackListener.onOOM();
                    com.facebook.common.logging.a.b("[KNBBridgeStrategy@getCapture]", String.format("method:%s invokeParams:%s callbackId:%s captureType:%s", str, str2, str3, str4));
                }
            }
        };
        BridgeManager bridgeManager = new BridgeManager(commonJsHost, new JsCallback() { // from class: com.meituan.android.mrn.services.c.3
            public static ChangeQuickRedirect a;

            @Override // com.dianping.titans.js.JsCallback
            public final void jsCallback(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bed20f987c3c787ba3a76a786746fabd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bed20f987c3c787ba3a76a786746fabd");
                    return;
                }
                Object[] objArr3 = new Object[4];
                objArr3[0] = str;
                objArr3[1] = str2;
                objArr3[2] = str3;
                objArr3[3] = jSONObject == null ? "" : jSONObject.toString();
                String format3 = String.format("method:%s invokeParams:%s callbackId:%s jsCallbackResult:%s", objArr3);
                if (z) {
                    if (reactContext == null) {
                        p.a("[KNBBridgeStrategy@jsCallback]", "reactContext is null");
                        return;
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("callbackId", str3);
                    try {
                        writableNativeMap.putMap("result", g.a(jSONObject));
                    } catch (Throwable th) {
                        com.facebook.common.logging.a.d("[KNBBridgeStrategy@jsCallback]", c.b, th);
                    }
                    boolean a2 = n.a(reactContext, "MRNKNBEvent", writableNativeMap);
                    p.a("[KNBBridgeStrategy@jsCallback]", "emitDeviceEventMessage :" + a2);
                } else if (callback != null && jSONObject != null) {
                    callback.invoke(str3, jSONObject.toString());
                } else {
                    if (callback == null) {
                        p.a("[KNBBridgeStrategy@jsCallback]", "callback is null, " + format3);
                    }
                    if (jSONObject == null) {
                        p.a("[KNBBridgeStrategy@jsCallback]", "result is null, " + format3);
                    }
                }
            }
        });
        bridgeManager.invoke(str, str2, str3, JsHandler.Source.MRN);
        a(activity, bridgeManager, commonJsHost);
    }

    public static synchronized void a(Activity activity, int i, int i2, Intent intent) {
        synchronized (c.class) {
            Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d759bec1195c4586b3a6acd419b2ecc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d759bec1195c4586b3a6acd419b2ecc");
            } else if (c != null) {
                synchronized (c) {
                    if (c.containsKey(activity)) {
                        for (Pair<BridgeManager, CommonJsHost> pair : c.get(activity)) {
                            BridgeManager bridgeManager = pair.first;
                            if (bridgeManager != null) {
                                bridgeManager.onActivityResult(i, i2, intent);
                            }
                        }
                    }
                }
            }
        }
    }

    private static synchronized void a(Activity activity, BridgeManager bridgeManager, CommonJsHost commonJsHost) {
        synchronized (c.class) {
            Object[] objArr = {activity, bridgeManager, commonJsHost};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f299caf72084db378fd006e0fcfb98c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f299caf72084db378fd006e0fcfb98c0");
                return;
            }
            if (!c.containsKey(activity)) {
                c.put(activity, new ArrayList());
            }
            c.get(activity).add(Pair.create(bridgeManager, commonJsHost));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public Callback a;
        public String b;

        public a(Callback callback, String str) {
            this.a = callback;
            this.b = str;
        }
    }
}
