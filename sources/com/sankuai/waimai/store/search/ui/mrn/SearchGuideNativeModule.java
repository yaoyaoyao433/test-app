package com.sankuai.waimai.store.search.ui.mrn;

import android.app.Activity;
import android.support.annotation.Keep;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistory;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import com.sankuai.waimai.store.search.common.util.e;
import com.sankuai.waimai.store.search.model.HotLabel;
import com.sankuai.waimai.store.search.ui.mrn.a;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import rx.d;
import rx.functions.b;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchGuideNativeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SGSearchGuideNativeModule";
    }

    public SearchGuideNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e70f91744ce3f5b9254234229b50bc91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e70f91744ce3f5b9254234229b50bc91");
        }
    }

    private void runUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed8a1c28492998ac339b600b8360899b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed8a1c28492998ac339b600b8360899b");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    @ReactMethod
    public void getPromotionWords(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbc08168169232748149c37854dbaa93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbc08168169232748149c37854dbaa93");
        } else {
            promise.resolve(e.a());
        }
    }

    @ReactMethod
    public void getSearchHistory(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "385ac4db92fac87d1b5b1fd97e42a54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "385ac4db92fac87d1b5b1fd97e42a54d");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4985c0285c7387e211ad897464c00e12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4985c0285c7387e211ad897464c00e12");
                } else {
                    SearchGuideNativeModule.this.initLocalHistory(promise);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initLocalHistory(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb5b83626d99c70f4d11da93ca0cac3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb5b83626d99c70f4d11da93ca0cac3e");
        } else {
            promise.resolve(getLocalHistory());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r6 < 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.react.bridge.WritableArray getLocalHistory() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.changeQuickRedirect
            java.lang.String r10 = "748c5c10c1ac0ab0b3d24adc7ad04c45"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            if (r1 == 0) goto L1d
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r0, r9, r2, r10)
            com.facebook.react.bridge.WritableArray r0 = (com.facebook.react.bridge.WritableArray) r0
            return r0
        L1d:
            com.facebook.react.bridge.WritableNativeArray r1 = new com.facebook.react.bridge.WritableNativeArray
            r1.<init>()
            java.util.List r3 = com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic.getHistoryList()
            boolean r4 = com.sankuai.waimai.foundation.utils.d.a(r3)
            if (r4 == 0) goto L2d
            return r1
        L2d:
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L31
            java.lang.String r5 = "_@-#_"
            java.lang.String[] r4 = r4.split(r5)
            java.lang.String r5 = ""
            r6 = r4[r0]
            int r7 = r4.length
            r8 = 0
            if (r7 <= r2) goto L73
            r6 = r4[r0]     // Catch: java.lang.NumberFormatException -> L5c
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L5c
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L5d
        L5c:
            r6 = r8
        L5d:
            r10 = r4[r2]
            r11 = 2
            r11 = r4[r11]     // Catch: java.lang.NumberFormatException -> L6c
            long r11 = java.lang.Long.parseLong(r11)     // Catch: java.lang.NumberFormatException -> L6c
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 >= 0) goto L6b
            goto L6c
        L6b:
            r8 = r11
        L6c:
            int r11 = r4.length
            r12 = 3
            if (r11 <= r12) goto L75
            r5 = r4[r12]
            goto L75
        L73:
            r10 = r6
            r6 = r8
        L75:
            com.facebook.react.bridge.WritableNativeMap r4 = new com.facebook.react.bridge.WritableNativeMap
            r4.<init>()
            java.lang.String r11 = "history_search_word"
            r4.putString(r11, r10)
            java.lang.String r10 = "wm_poi_id"
            double r6 = (double) r6
            r4.putDouble(r10, r6)
            java.lang.String r6 = "biz_source"
            double r7 = (double) r8
            r4.putDouble(r6, r7)
            java.lang.String r6 = "poi_id_str"
            r4.putString(r6, r5)
            r1.pushMap(r4)
            goto L31
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.getLocalHistory():com.facebook.react.bridge.WritableArray");
    }

    @ReactMethod
    public void setSearchHistory(final ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d72f3af541647af1997d8490be2b1ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d72f3af541647af1997d8490be2b1ae");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dda47c4804597c4cc43d6d201ca02431", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dda47c4804597c4cc43d6d201ca02431");
                } else if (readableArray != null) {
                    if (readableArray.size() == 0) {
                        com.meituan.android.bus.a.a().c(new a.C1321a());
                        return;
                    }
                    final ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < readableArray.size(); i++) {
                        ReadableMap map = readableArray.getMap(i);
                        if (map != null) {
                            String str = "";
                            String str2 = "";
                            if (map.hasKey("search_word") && !map.isNull("search_word")) {
                                str2 = map.getString("search_word");
                            }
                            String str3 = str2;
                            if (!i.a(str3)) {
                                long parseLong = (!map.hasKey("poi_id") || map.isNull("poi_id")) ? 0L : Long.parseLong(map.getString("poi_id"));
                                if (map.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) && !map.isNull(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                                    str = map.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                                }
                                String str4 = str;
                                if (map.hasKey("biz_source") && !map.isNull("biz_source")) {
                                    try {
                                        j = Long.parseLong(map.getString("biz_source"));
                                    } catch (Exception e) {
                                        com.sankuai.shangou.stone.util.log.a.a(e);
                                    }
                                    arrayList.add(new PoiSearchHistory(null, str3, Long.valueOf((System.currentTimeMillis() + readableArray.size()) - i), Long.valueOf(parseLong), Long.valueOf(j), str4));
                                }
                                j = 0;
                                arrayList.add(new PoiSearchHistory(null, str3, Long.valueOf((System.currentTimeMillis() + readableArray.size()) - i), Long.valueOf(parseLong), Long.valueOf(j), str4));
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    d.a((Callable) new Callable<String>() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.2.2
                        public static ChangeQuickRedirect a;

                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ String call() throws Exception {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "46e37647062e4982abbf3e762498a824", RobustBitConfig.DEFAULT_VALUE)) {
                                return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "46e37647062e4982abbf3e762498a824");
                            }
                            PoiSearchHistoryLogic.saveHistoryList(arrayList);
                            return null;
                        }
                    }).a(new b<Throwable>() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.2.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(Throwable th) {
                            Throwable th2 = th;
                            Object[] objArr3 = {th2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b171f876517678d96ec38e3b0188a930", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b171f876517678d96ec38e3b0188a930");
                            } else {
                                com.sankuai.shangou.stone.util.log.a.a(th2);
                            }
                        }
                    }).b(rx.schedulers.a.e()).f();
                }
            }
        });
    }

    @ReactMethod
    public void searchHotLabelItem(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e58ece7b29f535699e061b156aff6a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e58ece7b29f535699e061b156aff6a2e");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e661ccffdc60d8a1b349c58d29c1c88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e661ccffdc60d8a1b349c58d29c1c88");
                } else if (readableMap == null) {
                } else {
                    HotLabel hotLabel = new HotLabel();
                    if (readableMap.hasKey("search_keyword") && !readableMap.isNull("search_keyword")) {
                        hotLabel.searchKeyword = readableMap.getString("search_keyword");
                    }
                    if (readableMap.hasKey("wm_poi_id_string") && !readableMap.isNull("wm_poi_id_string")) {
                        hotLabel.poiId = Long.parseLong(readableMap.getString("wm_poi_id_string"));
                    }
                    if (readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) && !readableMap.isNull(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                        hotLabel.poiIdStr = readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    }
                    if (readableMap.hasKey("label_type") && !readableMap.isNull("label_type")) {
                        hotLabel.labelType = readableMap.getInt("label_type");
                    }
                    if (readableMap.hasKey("label_name") && !readableMap.isNull("label_name")) {
                        hotLabel.labelName = readableMap.getString("label_name");
                    }
                    if (readableMap.hasKey("jump_scheme") && !readableMap.isNull("jump_scheme")) {
                        hotLabel.jumpScheme = readableMap.getString("jump_scheme");
                    }
                    if (readableMap.hasKey("click_url") && !readableMap.isNull("click_url")) {
                        hotLabel.clickUrl = readableMap.getString("click_url");
                    }
                    com.meituan.android.bus.a.a().c(new a.d(str, hotLabel));
                }
            }
        });
    }

    @ReactMethod
    public void searchHistoryItem(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edaf4250ace8d5968d0f7fa771eed0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edaf4250ace8d5968d0f7fa771eed0bb");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                long j;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58a8b5c2b035ef9ac21bfd75b0bbb587", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58a8b5c2b035ef9ac21bfd75b0bbb587");
                } else if (readableMap == null) {
                } else {
                    long parseLong = (!readableMap.hasKey("poi_id") || readableMap.isNull("poi_id")) ? 0L : Long.parseLong(readableMap.getString("poi_id"));
                    String string = (!readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) || readableMap.isNull(FoodDetailNetWorkPreLoader.URI_POI_STR)) ? null : readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    if (!readableMap.hasKey("type") || readableMap.isNull("type")) {
                        z = false;
                    } else {
                        z = readableMap.getInt("type") == 0;
                    }
                    String string2 = (!readableMap.hasKey("search_word") || readableMap.isNull("search_word")) ? null : readableMap.getString("search_word");
                    String string3 = (!readableMap.hasKey(NetLogConstants.Details.SCHEME) || readableMap.isNull(NetLogConstants.Details.SCHEME)) ? null : readableMap.getString(NetLogConstants.Details.SCHEME);
                    if (readableMap.hasKey("biz_source") && !readableMap.isNull("biz_source")) {
                        try {
                            j = Long.parseLong(readableMap.getString("biz_source"));
                        } catch (Exception e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                        a.c cVar = new a.c();
                        cVar.b = new com.sankuai.waimai.store.search.model.e(parseLong, string, string2, z, string3, j);
                        cVar.a = str;
                        com.meituan.android.bus.a.a().c(cVar);
                    }
                    j = 0;
                    a.c cVar2 = new a.c();
                    cVar2.b = new com.sankuai.waimai.store.search.model.e(parseLong, string, string2, z, string3, j);
                    cVar2.a = str;
                    com.meituan.android.bus.a.a().c(cVar2);
                }
            }
        });
    }

    @ReactMethod
    public void onRecommendClick(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e95a33664b0ba34c6118b819ed3e1d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e95a33664b0ba34c6118b819ed3e1d3d");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d96e5a9f58532381f5b97904bce5295", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d96e5a9f58532381f5b97904bce5295");
                } else if (readableMap == null) {
                } else {
                    long j = 0;
                    if (readableMap.hasKey("wm_poi_id_string") && !readableMap.isNull("wm_poi_id_string")) {
                        j = Long.parseLong(readableMap.getString("wm_poi_id_string"));
                    }
                    com.meituan.android.bus.a.a().c(new a.e(str, (!readableMap.hasKey("content") || readableMap.isNull("content")) ? null : readableMap.getString("content"), (!readableMap.hasKey("pic_url") || readableMap.isNull("pic_url")) ? null : readableMap.getString("pic_url"), (!readableMap.hasKey(NetLogConstants.Details.SCHEME) || readableMap.isNull(NetLogConstants.Details.SCHEME)) ? null : readableMap.getString(NetLogConstants.Details.SCHEME), j, (!readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) || readableMap.isNull(FoodDetailNetWorkPreLoader.URI_POI_STR)) ? null : readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR)));
                }
            }
        });
    }
}
