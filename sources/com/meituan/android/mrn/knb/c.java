package com.meituan.android.mrn.knb;

import android.app.Activity;
import android.util.SparseArray;
import com.dianping.titans.js.JsHost;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends ReactApplicationContext implements JSInstance {
    public static ChangeQuickRedirect a;
    private SparseArray<Callback> b;
    private int c;
    private WeakReference<JsHost> d;
    private e e;
    private b f;

    @Override // com.facebook.react.bridge.JSInstance
    public final void garbageCollect() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final CatalystInstance getCatalystInstance() {
        return null;
    }

    @Override // com.facebook.react.bridge.JSInstance
    public final long getMemoryUsage() {
        return -1L;
    }

    public c(JsHost jsHost, e eVar) {
        super(jsHost.getContext());
        Object[] objArr = {jsHost, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f674d3dd51ea765e3e7e17a3e7f09f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f674d3dd51ea765e3e7e17a3e7f09f7");
            return;
        }
        this.b = new SparseArray<>();
        this.c = 0;
        this.f = new b();
        this.d = new WeakReference<>(jsHost);
        this.e = eVar;
    }

    public final int a(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b0c6c460fb70a3fa44714f05b7772f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b0c6c460fb70a3fa44714f05b7772f")).intValue();
        }
        if (callback == null) {
            return -1;
        }
        this.c = (this.c + 1) % Integer.MAX_VALUE;
        int i = this.c;
        this.b.put(i, callback);
        return i;
    }

    @Override // com.facebook.react.bridge.JSInstance
    public final void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        Object obj;
        Object[] objArr = {Integer.valueOf(i), nativeArrayInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541a60fe7c7620ad75a112581e1205db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541a60fe7c7620ad75a112581e1205db");
            return;
        }
        Callback callback = this.b.get(i);
        if (callback != null) {
            if (nativeArrayInterface instanceof ReadableArray) {
                ReadableArray readableArray = (ReadableArray) nativeArrayInterface;
                Object[] objArr2 = new Object[readableArray.size()];
                for (int i2 = 0; i2 < objArr2.length; i2++) {
                    switch (readableArray.getType(i2)) {
                        case Null:
                            obj = null;
                            break;
                        case Boolean:
                            obj = Boolean.valueOf(readableArray.getBoolean(i2));
                            break;
                        case Number:
                            double d = readableArray.getDouble(i2);
                            int i3 = (int) d;
                            if (d == i3) {
                                obj = Integer.valueOf(i3);
                                break;
                            } else {
                                obj = Double.valueOf(d);
                                break;
                            }
                        case String:
                            obj = readableArray.getString(i2);
                            break;
                        case Map:
                            obj = readableArray.getMap(i2);
                            break;
                        case Array:
                            obj = readableArray.getArray(i2);
                            break;
                        default:
                            throw new IllegalArgumentException("Could not convert object with index: " + i2 + CommonConstant.Symbol.DOT);
                    }
                    objArr2[i2] = obj;
                }
                callback.invoke(objArr2);
            } else {
                callback.invoke(nativeArrayInterface);
            }
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "aee1644a5fa4367e90c2cfcda75d7abf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "aee1644a5fa4367e90c2cfcda75d7abf");
            } else {
                this.b.remove(i);
            }
        }
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public final Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c25ffcbf221f10bbe25ad33733f8ffe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c25ffcbf221f10bbe25ad33733f8ffe");
        }
        if (this.d.get() != null && this.d.get().getActivity() != null) {
            return this.d.get().getActivity();
        }
        return super.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911af521fbd967c3b501013a94fccf64", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911af521fbd967c3b501013a94fccf64")).booleanValue() : getCurrentActivity() != null;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07a052c0c00de97df3f1349b759a94b", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07a052c0c00de97df3f1349b759a94b") : (T) this.f.a(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252814d6d57735649b29159c5691b6fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252814d6d57735649b29159c5691b6fc")).booleanValue();
        }
        e eVar = this.e;
        String a2 = a(cls);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "b9f1d96b725f072235aa7a3ec467d32a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "b9f1d96b725f072235aa7a3ec467d32a")).booleanValue() : eVar.b.containsKey(a2);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final <T extends NativeModule> T getNativeModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b7b0ac2f715e4a33c8c8d72759f8fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b7b0ac2f715e4a33c8c8d72759f8fd");
        }
        e eVar = this.e;
        String a2 = a(cls);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a3e94fabaa1e76dae71032ba3e407a89", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a3e94fabaa1e76dae71032ba3e407a89");
        }
        JavaModuleWrapper javaModuleWrapper = eVar.b.get(a2);
        if (javaModuleWrapper == null) {
            return null;
        }
        return javaModuleWrapper.getModule();
    }

    private <T extends NativeModule> String a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e45dc686369b62559c9cb5eaed9d6ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e45dc686369b62559c9cb5eaed9d6ca");
        }
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule == null) {
            throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
        }
        return reactModule.name();
    }
}
