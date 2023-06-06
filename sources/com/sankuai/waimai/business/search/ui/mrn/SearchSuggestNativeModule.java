package com.sankuai.waimai.business.search.ui.mrn;

import android.app.Activity;
import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.e;
import com.sankuai.waimai.business.search.ui.mrn.a;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SearchSuggestNativeModule extends ReactContextBaseJavaModule {
    public static final int TYPE_SUGGEST_BOTTOM = 2;
    public static final int TYPE_SUGGEST_COUPON = 3;
    public static final int TYPE_SUGGEST_POI = 0;
    public static final int TYPE_SUGGEST_QUERY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMSearchSuggestNativeModule";
    }

    public SearchSuggestNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa5656a15343a0bd752c4e141edcf462", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa5656a15343a0bd752c4e141edcf462");
        }
    }

    @ReactMethod
    public void getPromotionWords(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b43bb5f563da10a3011f3598823cfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b43bb5f563da10a3011f3598823cfc4");
        } else {
            promise.resolve(e.a());
        }
    }

    @ReactMethod
    public void notifySuggestDataChanged(final ReadableMap readableMap, final String str, final Promise promise) {
        Object[] objArr = {readableMap, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0ca2171d82a96e1447ed7d3e0c59cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0ca2171d82a96e1447ed7d3e0c59cfe");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchSuggestNativeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "975e89055d9c11f62c7f4cf54adee58c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "975e89055d9c11f62c7f4cf54adee58c");
                } else if (readableMap == null) {
                } else {
                    if (readableMap.hasKey(DMKeys.KEY_IS_EMPTY) && !readableMap.isNull(DMKeys.KEY_IS_EMPTY) && !readableMap.getBoolean(DMKeys.KEY_IS_EMPTY) && readableMap.hasKey("searchWord") && !readableMap.isNull("searchWord")) {
                        a.j jVar = new a.j();
                        jVar.a = str;
                        jVar.b = readableMap.getString("searchWord");
                        if (readableMap.hasKey("logId") && !readableMap.isNull("logId")) {
                            jVar.c = readableMap.getString("logId");
                        }
                        com.meituan.android.bus.a.a().c(jVar);
                    }
                    promise.resolve(0);
                }
            }
        });
    }

    @ReactMethod
    public void selectItem(final ReadableMap readableMap, final String str, final Promise promise) {
        Object[] objArr = {readableMap, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d495c9a1ebb8a1363ca7f18649ff1b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d495c9a1ebb8a1363ca7f18649ff1b1");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchSuggestNativeModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0aafeafc5057ee25b5f479844e70ee8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0aafeafc5057ee25b5f479844e70ee8e");
                } else if (readableMap == null || !readableMap.hasKey("suggestType") || readableMap.isNull("suggestType")) {
                } else {
                    int i = readableMap.getInt("suggestType");
                    if (readableMap.hasKey("poiStatus") && !readableMap.isNull("poiStatus")) {
                        readableMap.getInt("poiStatus");
                    }
                    String str2 = "";
                    if (readableMap.hasKey("contentText") && !readableMap.isNull("contentText")) {
                        str2 = readableMap.getString("contentText");
                    }
                    String str3 = str2;
                    String str4 = "";
                    if (readableMap.hasKey("showText") && !readableMap.isNull("showText")) {
                        str4 = readableMap.getString("showText");
                    }
                    String str5 = str4;
                    long j = 0;
                    if (readableMap.hasKey("poiId") && !readableMap.isNull("poiId")) {
                        j = Long.parseLong(readableMap.getString("poiId"));
                    }
                    long j2 = j;
                    String str6 = "";
                    if (readableMap.hasKey("poiIdStr") && !readableMap.isNull("poiIdStr")) {
                        str6 = readableMap.getString("poiIdStr");
                    }
                    String str7 = str6;
                    String str8 = "";
                    if (readableMap.hasKey("poiScheme") && !readableMap.isNull("poiScheme")) {
                        str8 = readableMap.getString("poiScheme");
                    }
                    int i2 = (!readableMap.hasKey("queryWordType") || readableMap.isNull("queryWordType")) ? 0 : readableMap.getInt("queryWordType");
                    switch (i) {
                        case 0:
                            com.meituan.android.bus.a.a().c(new a.h(str, j2, str7, str3, str8));
                            break;
                        case 1:
                        case 3:
                            com.meituan.android.bus.a.a().c(new a.i(str, str3, str5, i2, str8));
                            break;
                        case 2:
                            com.meituan.android.bus.a.a().c(new a.g(str, str8));
                            break;
                    }
                    promise.resolve(0);
                }
            }
        });
    }

    private void runUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21cc5955f5064efeaacdf83265a627b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21cc5955f5064efeaacdf83265a627b3");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }
}
