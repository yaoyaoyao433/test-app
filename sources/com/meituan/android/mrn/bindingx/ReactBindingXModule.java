package com.meituan.android.mrn.bindingx;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.e;
import com.alibaba.android.bindingx.core.internal.t;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ExposeAction;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.as;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@ReactModule(name = ReactBindingXModule.NAME)
/* loaded from: classes2.dex */
public final class ReactBindingXModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    @Deprecated
    private static final String KEY_SOURCE = "source";
    private static final String KEY_TOKEN = "token";
    public static final String NAME = "bindingx";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExecutorService executor;
    private com.alibaba.android.bindingx.core.a mBindingXCore;
    private com.alibaba.android.bindingx.core.e mPlatformManager;

    @Override // com.facebook.react.bridge.NativeModule
    public final String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    public ReactBindingXModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a85a2d27b5dfae60446bc729c1a812d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a85a2d27b5dfae60446bc729c1a812d");
        } else {
            this.executor = null;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8a603b47cc86bb79bf1c9bed9fbef6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8a603b47cc86bb79bf1c9bed9fbef6b");
            return;
        }
        super.initialize();
        if (getReactApplicationContext() != null) {
            getReactApplicationContext().addLifecycleEventListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareInternal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cbdf1d9ac29b237cd87d426bda0060f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cbdf1d9ac29b237cd87d426bda0060f");
            return;
        }
        if (this.mPlatformManager == null) {
            this.mPlatformManager = createPlatformManager(getReactApplicationContext());
        }
        if (this.mBindingXCore == null) {
            this.mBindingXCore = new com.alibaba.android.bindingx.core.a(this.mPlatformManager);
            this.mBindingXCore.a(Constants.FPS_TYPE_SCROLL, new a.b<com.alibaba.android.bindingx.core.c, Context, com.alibaba.android.bindingx.core.e>() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.1
                public static ChangeQuickRedirect a;

                @Override // com.alibaba.android.bindingx.core.a.b
                public final /* synthetic */ com.alibaba.android.bindingx.core.c a(@NonNull Context context, @NonNull com.alibaba.android.bindingx.core.e eVar, Object[] objArr2) {
                    Context context2 = context;
                    com.alibaba.android.bindingx.core.e eVar2 = eVar;
                    Object[] objArr3 = {context2, eVar2, objArr2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de20a84ff125bcd48c51da9aad449c86", RobustBitConfig.DEFAULT_VALUE) ? (com.alibaba.android.bindingx.core.c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de20a84ff125bcd48c51da9aad449c86") : new b(context2, eVar2, objArr2);
                }
            });
        }
    }

    @ReactMethod
    public final void prepare(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7f87e91ce5b6ff6c29d736c54c9be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7f87e91ce5b6ff6c29d736c54c9be8");
        } else {
            executeAsynchronously(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba6a83131a6dc3852d2bd86a60b25561", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba6a83131a6dc3852d2bd86a60b25561");
                    } else {
                        ReactBindingXModule.this.prepareInternal();
                    }
                }
            });
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final WritableMap bind(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00e89d23b88b80839cc07724d1ba6576", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00e89d23b88b80839cc07724d1ba6576");
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList(2);
        executeAsynchronously(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2cb48437d4e866299ba81368a161591c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2cb48437d4e866299ba81368a161591c");
                    return;
                }
                try {
                    ReactBindingXModule.this.prepareInternal();
                    arrayList.add(ReactBindingXModule.this.mBindingXCore.a(ReactBindingXModule.this.getReactApplicationContext(), null, readableMap == null ? Collections.emptyMap() : readableMap.toHashMap(), new a.InterfaceC0017a() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.alibaba.android.bindingx.core.a.InterfaceC0017a
                        public final void a(Object obj) {
                            Object[] objArr3 = {obj};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2c84560521f64d795fdfaed533c30553", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2c84560521f64d795fdfaed533c30553");
                                return;
                            }
                            ReactApplicationContext reactApplicationContext = ReactBindingXModule.this.getReactApplicationContext();
                            if (reactApplicationContext != null) {
                                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("bindingx:statechange", Arguments.makeNativeMap((Map) obj));
                            }
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
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        hashMap.put("source", str);
        return Arguments.makeNativeMap(hashMap);
    }

    @ReactMethod
    public final void unbind(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e76e250bcf2dc8eef6e1a0cff531249d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e76e250bcf2dc8eef6e1a0cff531249d");
        } else if (readableMap == null) {
        } else {
            executeAsynchronously(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "38ffbf3d5b131992a5f094ea732b1ba5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "38ffbf3d5b131992a5f094ea732b1ba5");
                    } else if (ReactBindingXModule.this.mBindingXCore != null) {
                        ReactBindingXModule.this.mBindingXCore.a(readableMap.toHashMap());
                    }
                }
            });
        }
    }

    @ReactMethod
    public final void unbindAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55541b323dd96f0a3ae219bc9ffc0754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55541b323dd96f0a3ae219bc9ffc0754");
        } else {
            executeAsynchronously(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7498cf58eb1c0f3afbcca4a9f2e2083f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7498cf58eb1c0f3afbcca4a9f2e2083f");
                    } else if (ReactBindingXModule.this.mBindingXCore != null) {
                        com.alibaba.android.bindingx.core.a aVar = ReactBindingXModule.this.mBindingXCore;
                        if (aVar.a != null) {
                            try {
                                for (Map.Entry<String, Map<String, com.alibaba.android.bindingx.core.c>> entry : aVar.a.entrySet()) {
                                    String key = entry.getKey();
                                    Map<String, com.alibaba.android.bindingx.core.c> value = entry.getValue();
                                    if (value != null && !value.isEmpty()) {
                                        for (Map.Entry<String, com.alibaba.android.bindingx.core.c> entry2 : value.entrySet()) {
                                            String key2 = entry2.getKey();
                                            com.alibaba.android.bindingx.core.c value2 = entry2.getValue();
                                            if (value2 != null) {
                                                value2.c(key, key2);
                                                value2.a();
                                            }
                                        }
                                    }
                                }
                                aVar.a.clear();
                                aVar.a = null;
                            } catch (Exception e) {
                                com.alibaba.android.bindingx.core.d.a("release failed", e);
                            }
                        }
                    }
                }
            });
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final WritableMap getComputedStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d24d2e45de1045726ebcc7771441cab4", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d24d2e45de1045726ebcc7771441cab4");
        }
        prepareInternal();
        e.b bVar = this.mPlatformManager.a;
        View a2 = this.mPlatformManager.b.a(String.valueOf(i), new Object[0]);
        if (a2 == null) {
            return Arguments.makeNativeMap(Collections.emptyMap());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("translateX", Double.valueOf(bVar.b(a2.getTranslationX(), new Object[0])));
        hashMap.put("translateY", Double.valueOf(bVar.b(a2.getTranslationY(), new Object[0])));
        hashMap.put(AnimationViewCommandModel.RotationX, Float.valueOf(t.a(a2.getRotationX())));
        hashMap.put(AnimationViewCommandModel.RotationY, Float.valueOf(t.a(a2.getRotationY())));
        hashMap.put("rotateZ", Float.valueOf(t.a(a2.getRotation())));
        hashMap.put(RecceAnimUtils.SCALE_X, Float.valueOf(a2.getScaleX()));
        hashMap.put(RecceAnimUtils.SCALE_Y, Float.valueOf(a2.getScaleY()));
        hashMap.put("opacity", Float.valueOf(a2.getAlpha()));
        if (a2.getBackground() != null) {
            int d = a2.getBackground() instanceof com.facebook.react.views.view.d ? ((com.facebook.react.views.view.d) a2.getBackground()).d() : -16777216;
            hashMap.put(BackgroundColor.NAME, String.format(Locale.getDefault(), "rgba(%d,%d,%d,%f)", Integer.valueOf(Color.red(d)), Integer.valueOf(Color.green(d)), Integer.valueOf(Color.blue(d)), Double.valueOf(Color.alpha(d) / 255.0d)));
        }
        if (a2 instanceof TextView) {
            int currentTextColor = ((TextView) a2).getCurrentTextColor();
            hashMap.put("color", String.format(Locale.getDefault(), "rgba(%d,%d,%d,%f)", Integer.valueOf(Color.red(currentTextColor)), Integer.valueOf(Color.green(currentTextColor)), Integer.valueOf(Color.blue(currentTextColor)), Double.valueOf(Color.alpha(currentTextColor) / 255.0d)));
        }
        return Arguments.makeNativeMap(hashMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final WritableArray supportFeatures() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6c17f7c1ab643a9f0db340427d5dc99", RobustBitConfig.DEFAULT_VALUE) ? (WritableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6c17f7c1ab643a9f0db340427d5dc99") : Arguments.makeNativeArray(Arrays.asList("pan", DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, "timing", Constants.FPS_TYPE_SCROLL));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9bd14c37122c02287a2d94f99602908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9bd14c37122c02287a2d94f99602908");
        } else {
            executeAsynchronously(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "854d51c4d06cf0923ee6c1af9217b213", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "854d51c4d06cf0923ee6c1af9217b213");
                    } else if (ReactBindingXModule.this.mBindingXCore != null) {
                        com.alibaba.android.bindingx.core.d.a("host resumed");
                        ReactBindingXModule.this.mBindingXCore.b();
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db66c0145eac6ffb8e762626abac0b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db66c0145eac6ffb8e762626abac0b0c");
        } else {
            executeAsynchronously(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19cf887a6acbceafea73ae7daebd1209", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19cf887a6acbceafea73ae7daebd1209");
                    } else if (ReactBindingXModule.this.mBindingXCore != null) {
                        com.alibaba.android.bindingx.core.d.a("host paused");
                        ReactBindingXModule.this.mBindingXCore.a();
                    }
                }
            });
        }
    }

    @NonNull
    private static com.alibaba.android.bindingx.core.e createPlatformManager(final ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "760753efdfa1f3722025c926bb761aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.alibaba.android.bindingx.core.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "760753efdfa1f3722025c926bb761aa6");
        }
        e.a aVar = new e.a();
        aVar.b = new e.c() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.2
            public static ChangeQuickRedirect a;

            @Override // com.alibaba.android.bindingx.core.e.c
            @Nullable
            public final View a(String str, Object... objArr2) {
                Object[] objArr3 = {str, objArr2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69a701e518ac339f5c75f1cac08547f4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69a701e518ac339f5c75f1cac08547f4");
                }
                Activity currentActivity = ReactApplicationContext.this.getCurrentActivity();
                if (currentActivity == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    return currentActivity.findViewById((int) Double.valueOf(str.trim()).doubleValue());
                } catch (NumberFormatException e) {
                    com.alibaba.android.bindingx.core.d.a("number format error", e);
                    return null;
                }
            }
        };
        aVar.c = new e.d() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.10
            public static ChangeQuickRedirect a;

            @Override // com.alibaba.android.bindingx.core.e.d
            public final void a(@NonNull final View view, @NonNull final String str, @NonNull final Object obj, @NonNull final e.b bVar, @NonNull final Map<String, Object> map, Object... objArr2) {
                final int i;
                final as uIImplementation;
                Object[] objArr3 = {view, str, obj, bVar, map, objArr2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9e00f76a53d876bca03e0112d40653c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9e00f76a53d876bca03e0112d40653c");
                    return;
                }
                String str2 = objArr2[0] instanceof String ? (String) objArr2[0] : null;
                if (ReactApplicationContext.this == null || TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    i = (int) Double.valueOf(str2.trim()).doubleValue();
                } catch (Exception unused) {
                    i = -1;
                }
                UIManagerModule uIManagerModule = (UIManagerModule) ReactApplicationContext.this.getNativeModule(UIManagerModule.class);
                if (uIManagerModule == null || i == -1 || (uIImplementation = uIManagerModule.getUIImplementation()) == null) {
                    return;
                }
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.10.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4925f1edb6e115f5e6b3fff06adb6d86", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4925f1edb6e115f5e6b3fff06adb6d86");
                        } else {
                            e.a(str).a(i, view, obj, bVar, map, uIImplementation);
                        }
                    }
                });
            }
        };
        aVar.a = new e.b() { // from class: com.meituan.android.mrn.bindingx.ReactBindingXModule.9
            @Override // com.alibaba.android.bindingx.core.e.b
            public final double a(double d, Object... objArr2) {
                return d;
            }

            @Override // com.alibaba.android.bindingx.core.e.b
            public final double b(double d, Object... objArr2) {
                return d;
            }
        };
        return aVar.a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "328f1c845087bcb9738e4ef3528c8860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "328f1c845087bcb9738e4ef3528c8860");
            return;
        }
        super.onCatalystInstanceDestroy();
        if (this.executor != null) {
            this.executor.shutdownNow();
            this.executor = null;
        }
    }

    private void executeAsynchronously(@Nullable Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21e6f544f52f7c393073b54787c479a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21e6f544f52f7c393073b54787c479a7");
            return;
        }
        if (this.executor == null) {
            this.executor = com.sankuai.android.jarvis.c.a("bindingX-thread");
        }
        this.executor.execute(new a(runnable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        public Runnable b;

        public a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce4be9213d9e80a2304920e38abb90cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce4be9213d9e80a2304920e38abb90cb");
            } else {
                this.b = runnable;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad2fa79aad4ef56de9b60f7bc9ff55ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad2fa79aad4ef56de9b60f7bc9ff55ff");
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
