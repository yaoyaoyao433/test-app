package com.sankuai.waimai.store.search.ui.mrn;

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
import com.sankuai.waimai.store.search.common.util.e;
import com.sankuai.waimai.store.search.ui.mrn.a;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchSuggestNativeModule extends ReactContextBaseJavaModule {
    public static final int TYPE_SUGGEST_AIRPLANE = 3;
    public static final int TYPE_SUGGEST_BOTTOM = 2;
    public static final int TYPE_SUGGEST_POI = 0;
    public static final int TYPE_SUGGEST_QUERY = 1;
    public static final int TYPE_SUGGEST_SEARCH = 4;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SGSearchSuggestNativeModule";
    }

    public SearchSuggestNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7975b61f4ce2b77de0993bdf32a44555", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7975b61f4ce2b77de0993bdf32a44555");
        }
    }

    @ReactMethod
    public void getPromotionWords(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11b1cc0ba60c3ecd3894e8abb00dd0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11b1cc0ba60c3ecd3894e8abb00dd0ad");
        } else {
            promise.resolve(e.a());
        }
    }

    @ReactMethod
    public void notifySuggestDataChanged(final ReadableMap readableMap, final String str, final Promise promise) {
        Object[] objArr = {readableMap, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e11728198c8d0babe29da31108ea5c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e11728198c8d0babe29da31108ea5c0f");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchSuggestNativeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18858d678ee9d6b139fcdceb4236fcf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18858d678ee9d6b139fcdceb4236fcf2");
                } else if (readableMap == null) {
                } else {
                    if (readableMap.hasKey(DMKeys.KEY_IS_EMPTY) && !readableMap.isNull(DMKeys.KEY_IS_EMPTY) && !readableMap.getBoolean(DMKeys.KEY_IS_EMPTY) && readableMap.hasKey("searchWord") && !readableMap.isNull("searchWord")) {
                        a.i iVar = new a.i();
                        iVar.a = str;
                        iVar.b = readableMap.getString("searchWord");
                        if (readableMap.hasKey("logId") && !readableMap.isNull("logId")) {
                            iVar.c = readableMap.getString("logId");
                        }
                        if (readableMap.hasKey("stid") && !readableMap.isNull("stid")) {
                            iVar.d = readableMap.getString("stid");
                        }
                        com.meituan.android.bus.a.a().c(iVar);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13d5880f6b9e1c9787c6f63ec1fdf64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13d5880f6b9e1c9787c6f63ec1fdf64d");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchSuggestNativeModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "577e5b1b7d1830d4d2e59710356bdea4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "577e5b1b7d1830d4d2e59710356bdea4");
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
                    long j = 0;
                    if (readableMap.hasKey("poiId") && !readableMap.isNull("poiId")) {
                        j = Long.parseLong(readableMap.getString("poiId"));
                    }
                    long j2 = j;
                    String str4 = "";
                    if (readableMap.hasKey("poiIdStr") && !readableMap.isNull("poiIdStr")) {
                        str4 = readableMap.getString("poiIdStr");
                    }
                    String str5 = str4;
                    String str6 = "";
                    if (readableMap.hasKey("poiScheme") && !readableMap.isNull("poiScheme")) {
                        str6 = readableMap.getString("poiScheme");
                    }
                    String str7 = str6;
                    int i2 = (!readableMap.hasKey("queryWordType") || readableMap.isNull("queryWordType")) ? 0 : readableMap.getInt("queryWordType");
                    String str8 = "";
                    if (readableMap.hasKey("searchQuery") && !readableMap.isNull("searchQuery")) {
                        str8 = readableMap.getString("searchQuery");
                    }
                    String str9 = "";
                    if (readableMap.hasKey("clickUrl") && !readableMap.isNull("clickUrl")) {
                        str9 = readableMap.getString("clickUrl");
                    }
                    switch (i) {
                        case 0:
                            com.meituan.android.bus.a.a().c(new a.g(str, j2, str5, str3, str7));
                            break;
                        case 1:
                            com.meituan.android.bus.a.a().c(new a.h(str, str3, i2, str7));
                            break;
                        case 2:
                            com.meituan.android.bus.a.a().c(new a.f(str, str7));
                            break;
                        case 3:
                            com.meituan.android.bus.a.a().c(new a.b(str, str9));
                            break;
                        case 4:
                            com.meituan.android.bus.a.a().c(new a.h(str, str8, i2, str7));
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ec46a9acb4b9aab502f5737383cde1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ec46a9acb4b9aab502f5737383cde1d");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }
}
