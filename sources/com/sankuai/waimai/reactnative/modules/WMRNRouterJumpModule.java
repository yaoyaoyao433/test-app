package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNRouterJumpModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String REQUEST_CODE_KEY = "requestCode";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Promise mOpenUrlPromise;
    private int mRequestCode;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNRouterJumpModule";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public WMRNRouterJumpModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "969158e1e055ab8681412ab9df30ed47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "969158e1e055ab8681412ab9df30ed47");
        } else {
            reactApplicationContext.addActivityEventListener(this);
        }
    }

    @ReactMethod
    public void WMRouterJump(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70d110bff6ba1340046563ab36d9b844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70d110bff6ba1340046563ab36d9b844");
        } else if (TextUtils.isEmpty(str) || getCurrentActivity() == null) {
        } else {
            com.sankuai.waimai.foundation.router.a.a(getCurrentActivity(), str);
        }
    }

    @ReactMethod
    public void openSetting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16b6bb30d65aceec17b4b6275babf890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16b6bb30d65aceec17b4b6275babf890");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.startActivity(new Intent("android.settings.SETTINGS"));
    }

    private void runOnUiThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0985204105a0a02110d775687725c8cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0985204105a0a02110d775687725c8cb");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    @ReactMethod
    public void openUrlWithParams(final String str, final ReadableMap readableMap, final ReadableMap readableMap2) {
        Object[] objArr = {str, readableMap, readableMap2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c080715004f4ee8015fe9299d4baa94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c080715004f4ee8015fe9299d4baa94");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNRouterJumpModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fdbe46f1f0dae4c0efa4760ee3640c72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fdbe46f1f0dae4c0efa4760ee3640c72");
                    return;
                }
                String str2 = str;
                if (readableMap != null) {
                    str2 = WMRNRouterJumpModule.appendQueryParams(Uri.parse(str), g.a(readableMap)).toString();
                }
                com.sankuai.waimai.foundation.router.a.a(currentActivity, str2, com.sankuai.waimai.reactnative.utils.b.a(readableMap2));
            }
        });
    }

    @ReactMethod
    public void openUrlForResult(final String str, final int i, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51728e11e5ba1206065015d41ac10c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51728e11e5ba1206065015d41ac10c0f");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNRouterJumpModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f387edc2d55e8fc538f48d86e0e923b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f387edc2d55e8fc538f48d86e0e923b5");
                    return;
                }
                WMRNRouterJumpModule.this.mRequestCode = i;
                WMRNRouterJumpModule.this.mOpenUrlPromise = promise;
                com.sankuai.waimai.foundation.router.a.a(currentActivity, str, com.sankuai.waimai.reactnative.utils.b.a(readableMap), i);
            }
        });
    }

    @ReactMethod
    @Deprecated
    public void openUrlWithResult(String str, ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2bb2cf5ffe83c2334b60d9032536bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2bb2cf5ffe83c2334b60d9032536bd5");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mOpenUrlPromise = promise;
        a.C0950a a = com.sankuai.waimai.foundation.router.a.a();
        if (readableMap != null) {
            str = appendQueryParams(Uri.parse(str), g.a(readableMap)).toString();
            if (readableMap.hasKey("requestCode")) {
                int i = readableMap.getInt("requestCode");
                this.mRequestCode = i;
                a.a(i);
            }
        }
        a.a(new e() { // from class: com.sankuai.waimai.reactnative.modules.WMRNRouterJumpModule.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.core.e
            public final void a(@NonNull j jVar) {
            }

            @Override // com.sankuai.waimai.router.core.e
            public final void a(@NonNull j jVar, int i2) {
                Object[] objArr2 = {jVar, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "920ae87a81464a43354bf21712c983af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "920ae87a81464a43354bf21712c983af");
                } else {
                    promise.reject(String.valueOf(i2), "router start uri failed");
                }
            }
        });
        a.a(currentActivity, str);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d35f7bc308fe3ffedb737e7cf5ac2d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d35f7bc308fe3ffedb737e7cf5ac2d57");
        } else if (this.mRequestCode == i && i2 == -1) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(Constant.KEY_RESULT_CODE, -1);
            createMap.putInt("requestCode", i);
            if (intent != null) {
                Bundle extras = intent.getExtras();
                WritableMap createMap2 = Arguments.createMap();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        com.sankuai.waimai.reactnative.utils.b.a(str, extras.get(str), createMap2);
                    }
                }
                createMap.putMap("resultData", createMap2);
            }
            if (this.mOpenUrlPromise != null) {
                this.mOpenUrlPromise.resolve(createMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Uri appendQueryParams(Uri uri, Map<String, Object> map) {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "febf5e27f838b211342bab00d71c6f7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "febf5e27f838b211342bab00d71c6f7b");
        }
        if (uri == null) {
            return null;
        }
        if (map == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return buildUpon.build();
    }
}
