package com.meituan.android.mrn.module;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.event.listeners.b;
import com.meituan.android.mrn.event.listeners.c;
import com.meituan.android.mrn.module.jshandler.pageRouter.PageRouterBaseJsHandler;
import com.meituan.android.mrn.router.e;
import com.meituan.android.mrn.router.f;
import com.meituan.android.mrn.utils.aa;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.v;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = PageRouterModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class PageRouterModule extends ReactContextBaseJavaModule implements f.b {
    private static final String ERROR_CODE = "E_PAGR_ROUTER";
    public static final String MODULE_NAME = "MRNPageRouter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.meituan.android.mrn.event.listeners.f mContainerListener;
    private c mOnActivityResultListener;
    private f mPageRouter;
    private final WeakHashMap<Activity, Promise> mSetResultPromises;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public PageRouterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c26a7ccb09e5b0ffd6485f2c9fdbe2d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c26a7ccb09e5b0ffd6485f2c9fdbe2d9");
            return;
        }
        this.mSetResultPromises = new WeakHashMap<>();
        this.mPageRouter = new f(this);
        this.mContainerListener = new b(this.mSetResultPromises);
        this.mOnActivityResultListener = new a(this);
        com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.c.a(reactApplicationContext, "MRNContainerListener"), this.mContainerListener);
        com.meituan.android.mrn.event.c.b.a(com.meituan.android.mrn.event.c.a(reactApplicationContext, "MRNOnActivityResultListener"), this.mOnActivityResultListener);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends com.meituan.android.mrn.event.listeners.f {
        public static ChangeQuickRedirect a;
        private WeakHashMap<Activity, Promise> b;

        public b(WeakHashMap<Activity, Promise> weakHashMap) {
            Object[] objArr = {weakHashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ababf81f20863f06303b0c2350c28055", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ababf81f20863f06303b0c2350c28055");
                return;
            }
            this.b = new WeakHashMap<>();
            this.b = weakHashMap;
        }

        @Override // com.meituan.android.mrn.event.listeners.f, com.meituan.android.mrn.event.listeners.b
        public final void a(b.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd9c7640d66a30756cb27fe5eaaa9b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd9c7640d66a30756cb27fe5eaaa9b8");
            } else {
                this.b.remove(fVar.e());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements c {
        public static ChangeQuickRedirect b;
        private WeakReference<PageRouterModule> c;

        public a(PageRouterModule pageRouterModule) {
            Object[] objArr = {pageRouterModule};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53190012262d25096e0090e3adb8bbbd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53190012262d25096e0090e3adb8bbbd");
                return;
            }
            this.c = new WeakReference<>(null);
            this.c = new WeakReference<>(pageRouterModule);
        }

        @Override // com.meituan.android.mrn.event.listeners.c
        public final void a(c.C0288c c0288c) {
            Object[] objArr = {c0288c};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8eeb063d25cd8402a0de2e6d02677f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8eeb063d25cd8402a0de2e6d02677f0");
            } else if (this.c.get() != null) {
                this.c.get().onActivityResult(c0288c.h(), c0288c.e(), c0288c.f(), c0288c.g());
            }
        }
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "660c8cc605ac484525b6c82efc525606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "660c8cc605ac484525b6c82efc525606");
            return;
        }
        Promise promise = this.mSetResultPromises.get(activity);
        if (promise == null) {
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            if (intent != null) {
                if (intent.hasExtra("resultData") && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "resultData"))) {
                    createMap.putString("resultData", com.sankuai.waimai.platform.utils.f.a(intent, "resultData"));
                } else if (intent.getExtras() != null) {
                    createMap.putMap("resultData", Arguments.fromBundle(intent.getExtras()));
                }
            }
            if (!createMap.hasKey(Constant.KEY_RESULT_CODE)) {
                createMap.putInt(Constant.KEY_RESULT_CODE, i2);
            }
            if (!createMap.hasKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                createMap.putInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i);
            }
            promise.resolve(createMap);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    @ReactMethod
    public void openUrl(final String str, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2275fa1e4f798cfcf45c974a3ea514b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2275fa1e4f798cfcf45c974a3ea514b7");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "13af3ba1fc0ba44137108450d1502491", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "13af3ba1fc0ba44137108450d1502491");
                        return;
                    }
                    try {
                        f fVar = PageRouterModule.this.mPageRouter;
                        String str2 = str;
                        Map<String, Object> a2 = g.a(readableMap);
                        Object[] objArr3 = {str2, a2, null};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "62e6c6ad3c648181a9cfe7ccae1e1bc0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "62e6c6ad3c648181a9cfe7ccae1e1bc0");
                        } else {
                            fVar.a(str2, a2, (e) null);
                        }
                    } catch (Throwable th) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("url", str);
                        if (readableMap instanceof ReadableNativeMap) {
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.merge(readableMap);
                            createMap.putMap("param", createMap2);
                        }
                        promise.reject(PageRouterModule.ERROR_CODE, th, createMap);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void openUrlWithResult(String str, ReadableMap readableMap, Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdeccb037230dc810c5674048a0a4692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdeccb037230dc810c5674048a0a4692");
        } else {
            openUrlWithResultCustom(str, readableMap, null, promise);
        }
    }

    @ReactMethod
    public void switchPage(final String str, final String str2, final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {str, str2, readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eb4b1a2602f7e60109450e52c00417c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eb4b1a2602f7e60109450e52c00417c");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "840d85266341710c42bf8d14ee4a702c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "840d85266341710c42bf8d14ee4a702c");
                        return;
                    }
                    try {
                        com.meituan.android.mrn.router.a a2 = PageRouterModule.this.mPageRouter.a(str, str2, g.a(readableMap), readableMap2 == null ? null : PageRouterBaseJsHandler.convertOpenPageOption(new JSONObject(g.a(readableMap2))));
                        if (a2 != null && a2.b) {
                            MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) a2.a();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("id", str);
                            createMap.putString("url", str2);
                            createMap.putMap("params", g.b(readableMap));
                            if (readableMap2 != null) {
                                createMap.putMap("options", g.b(readableMap2));
                            }
                            if (mRNBaseActivity.e != null) {
                                createMap.putInt("rootTag", mRNBaseActivity.e.e());
                            }
                            n.a(mRNBaseActivity.l(), "containerDidSwitched", createMap);
                        }
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putString("action", "startActivity");
                        promise.resolve(createMap2);
                    } catch (Exception e) {
                        WritableMap createMap3 = Arguments.createMap();
                        createMap3.putString("url", str2);
                        if (readableMap instanceof ReadableNativeMap) {
                            WritableMap createMap4 = Arguments.createMap();
                            createMap4.merge(readableMap);
                            createMap3.putMap("params", createMap4);
                        }
                        if (readableMap2 instanceof ReadableNativeMap) {
                            WritableMap createMap5 = Arguments.createMap();
                            createMap5.merge(readableMap2);
                            createMap3.putMap("options", createMap5);
                        }
                        promise.reject(PageRouterModule.ERROR_CODE, e, createMap3);
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void openUrlWithResultCustom(final String str, final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {str, readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a58a15307605f1bb0337036b182a505a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a58a15307605f1bb0337036b182a505a");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2040096db9297ea61b71f577a7fa6886", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2040096db9297ea61b71f577a7fa6886");
                        return;
                    }
                    try {
                        PageRouterModule.this.mSetResultPromises.put(PageRouterModule.this.getCurrentActivity(), promise);
                        PageRouterModule.this.mPageRouter.b(str, g.a(readableMap), readableMap2 == null ? null : PageRouterBaseJsHandler.convertOpenPageOption(new JSONObject(g.a(readableMap2))));
                    } catch (Exception e) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("url", str);
                        if (readableMap instanceof ReadableNativeMap) {
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.merge(readableMap);
                            createMap.putMap("param", createMap2);
                        }
                        if (readableMap2 instanceof ReadableNativeMap) {
                            WritableMap createMap3 = Arguments.createMap();
                            createMap3.merge(readableMap2);
                            createMap.putMap("extraParam", createMap3);
                        }
                        promise.reject(PageRouterModule.ERROR_CODE, e, createMap);
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void startActivity(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e97d6d093f2837f19e821df7020ff24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e97d6d093f2837f19e821df7020ff24d");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67b0901f982a5e2dba58c628fdc4ef16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67b0901f982a5e2dba58c628fdc4ef16");
                        return;
                    }
                    try {
                        f fVar = PageRouterModule.this.mPageRouter;
                        String str3 = str;
                        Map<String, Object> b2 = g.b(g.a(str2));
                        Object[] objArr3 = {str3, b2};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "a39a8ef056e91800bf148b3a274538e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "a39a8ef056e91800bf148b3a274538e7");
                        } else {
                            fVar.a(str3, b2, 1);
                        }
                    } catch (Throwable th) {
                        promise.reject(th);
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void startActivityForResult(final String str, final String str2, final int i, final Promise promise) {
        Object[] objArr = {str, str2, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da4ed1710c87acfa87db8ecdab8792ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da4ed1710c87acfa87db8ecdab8792ef");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5c0288a6f69ba9895d69647ad49034c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5c0288a6f69ba9895d69647ad49034c5");
                        return;
                    }
                    try {
                        PageRouterModule.this.mPageRouter.a(str, g.b(g.a(str2)), i);
                    } catch (Throwable th) {
                        promise.reject(th);
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void closeWithParams(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99a71cfd816ac38dea71761390ffe3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99a71cfd816ac38dea71761390ffe3c");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cf7c3e8d3be05d3bbf979f550d791a39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cf7c3e8d3be05d3bbf979f550d791a39");
                    } else if (readableMap == null || !readableMap.hasKey("rootTag")) {
                        try {
                            PageRouterModule.this.mPageRouter.a(null);
                            promise.resolve(Boolean.TRUE);
                        } catch (f.a unused) {
                        } catch (Exception e) {
                            e.printStackTrace();
                            WritableMap createMap = Arguments.createMap();
                            if (readableMap instanceof ReadableNativeMap) {
                                WritableMap createMap2 = Arguments.createMap();
                                createMap2.merge(readableMap);
                                createMap.putMap("params", createMap2);
                            }
                            promise.reject(PageRouterModule.ERROR_CODE, e, createMap);
                        }
                    } else {
                        v.a(readableMap.getInt("rootTag"));
                        promise.resolve(Boolean.TRUE);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void close(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cca6c068b2756fd252c8b729af72995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cca6c068b2756fd252c8b729af72995");
        } else {
            closeWithParams(null, promise);
        }
    }

    @ReactMethod
    public void closeWithRootTag(int i, Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "633b3c3a6ead0b5e2386bf9fcd6fef28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "633b3c3a6ead0b5e2386bf9fcd6fef28");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("rootTag", i);
        closeWithParams(createMap, promise);
    }

    @ReactMethod
    public void backPressed(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "449301812e839fb021314d481fa93cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "449301812e839fb021314d481fa93cf6");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2af5bfb5a5888a3060a0d1bbf6f2af0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2af5bfb5a5888a3060a0d1bbf6f2af0a");
                        return;
                    }
                    try {
                        PageRouterModule.this.mPageRouter.a(null);
                        promise.resolve(Boolean.TRUE);
                    } catch (f.a unused) {
                    } catch (Exception e) {
                        e.printStackTrace();
                        promise.resolve(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void setResult(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac609cdfffe6e48dfce9405ae2ee299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac609cdfffe6e48dfce9405ae2ee299");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7e4b00394b6275bc3a97a3904c39f852", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7e4b00394b6275bc3a97a3904c39f852");
                        return;
                    }
                    try {
                        Map<String, Object> b2 = g.b(g.a(str));
                        f fVar = PageRouterModule.this.mPageRouter;
                        Object[] objArr3 = {-1, b2};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "f6225573b18df28724103d38abd2a0f9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "f6225573b18df28724103d38abd2a0f9");
                        } else {
                            Intent intent = new Intent();
                            intent.addCategory("android.intent.category.DEFAULT");
                            if (b2 != null) {
                                intent.putExtras(g.a(b2));
                            }
                            Activity a2 = fVar.a();
                            intent.setPackage(a2.getPackageName());
                            a2.setResult(-1, intent);
                            a2.finish();
                        }
                        promise.resolve(Boolean.TRUE);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        WritableMap createMap = Arguments.createMap();
                        if (str != null) {
                            createMap.putString("jsonResults", str);
                        }
                        promise.reject(PageRouterModule.ERROR_CODE, th, createMap);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void go(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "707dd05aa8098a425568f0cbe52f4c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "707dd05aa8098a425568f0cbe52f4c35");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e279cce543e1e9eb52761180ee5b1ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e279cce543e1e9eb52761180ee5b1ce");
                        return;
                    }
                    try {
                        JSONObject a2 = g.a(str);
                        e convertOpenPageOption = PageRouterBaseJsHandler.convertOpenPageOption(a2, true);
                        Map<String, Object> b2 = g.b(a2);
                        b2.remove(Constants.TRAFFIC_URI);
                        PageRouterModule.this.mPageRouter.a((String) b2.get(Constants.TRAFFIC_URI), b2, convertOpenPageOption);
                    } catch (Throwable th) {
                        promise.reject(th);
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void sendMail(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4396edef5668e6dd2c6fdedc5c0d02b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4396edef5668e6dd2c6fdedc5c0d02b4");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.PageRouterModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2788d139b615549a1710c32ead754431", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2788d139b615549a1710c32ead754431");
                        return;
                    }
                    try {
                        f fVar = PageRouterModule.this.mPageRouter;
                        String str2 = str;
                        Object[] objArr3 = {str2};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "fad8933fe93ebe3e6ba80efa22d41424", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "fad8933fe93ebe3e6ba80efa22d41424");
                        } else if (!TextUtils.isEmpty(str2)) {
                            Context b2 = fVar.b();
                            Intent a2 = aa.a(b2, Uri.parse(str2), "android.intent.action.SENDTO", "android.intent.category.DEFAULT", null, null, null, null);
                            Matcher matcher = Pattern.compile("[?&]body=([^&]+)", 2).matcher(str2);
                            if (matcher.find()) {
                                a2.putExtra("android.intent.extra.TEXT", Uri.decode(matcher.group(1)));
                            }
                            aa.a(b2, a2);
                        }
                        promise.resolve(Boolean.TRUE);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        WritableMap createMap = Arguments.createMap();
                        if (str != null) {
                            createMap.putString("data", str);
                        }
                        promise.reject(PageRouterModule.ERROR_CODE, th, createMap);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void setDefaultOpenPageOption(ReadableMap readableMap, Promise promise) {
        e convertOpenPageOption;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74da7a8375ec60f3ccd86a22cf68256c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74da7a8375ec60f3ccd86a22cf68256c");
            return;
        }
        if (readableMap == null) {
            convertOpenPageOption = null;
        } else {
            try {
                convertOpenPageOption = PageRouterBaseJsHandler.convertOpenPageOption(new JSONObject(g.a(readableMap)));
            } catch (Throwable th) {
                th.printStackTrace();
                WritableMap createMap = Arguments.createMap();
                if (readableMap instanceof ReadableNativeMap) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.merge(readableMap);
                    createMap.putMap("options", createMap2);
                }
                promise.reject(ERROR_CODE, th, createMap);
                return;
            }
        }
        this.mPageRouter.b = convertOpenPageOption;
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod
    public void listContainers(Promise promise) {
        WritableMap writableMap;
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "290c2b7940eca49a1024240046d314cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "290c2b7940eca49a1024240046d314cf");
            return;
        }
        try {
            List<com.meituan.android.mrn.router.a> c = this.mPageRouter.c();
            WritableArray createArray = Arguments.createArray();
            for (com.meituan.android.mrn.router.a aVar : c) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.router.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "9dd89d805a0dc0de6639c0f7aa8397fc", RobustBitConfig.DEFAULT_VALUE)) {
                    writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "9dd89d805a0dc0de6639c0f7aa8397fc");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("id", aVar.c);
                    createMap.putString("type", aVar.b ? DiagnoseLog.MRN : "native");
                    createMap.putString("url", aVar.d);
                    createMap.putString("biz", aVar.e);
                    createMap.putString("entry", aVar.f);
                    createMap.putString("component", aVar.g);
                    writableMap = createMap;
                }
                createArray.pushMap(writableMap);
            }
            promise.resolve(createArray);
        } catch (Throwable th) {
            th.printStackTrace();
            promise.reject(ERROR_CODE, th);
        }
    }

    @Override // com.meituan.android.mrn.router.f.b
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eef645ae72ca231cb1c26aba169755b", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eef645ae72ca231cb1c26aba169755b") : super.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4962d98c6d5da68ad8eec6c16b4fef16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4962d98c6d5da68ad8eec6c16b4fef16");
            return;
        }
        super.onCatalystInstanceDestroy();
        this.mSetResultPromises.clear();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        com.meituan.android.mrn.event.c.b.b(com.meituan.android.mrn.event.c.a(reactApplicationContext, "MRNContainerListener"), this.mContainerListener);
        com.meituan.android.mrn.event.c.b.b(com.meituan.android.mrn.event.c.a(reactApplicationContext, "MRNOnActivityResultListener"), this.mOnActivityResultListener);
    }
}
