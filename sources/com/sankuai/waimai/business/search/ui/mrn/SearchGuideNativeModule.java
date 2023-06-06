package com.sankuai.waimai.business.search.ui.mrn;

import android.app.Activity;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.GsonBuilder;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.common.util.e;
import com.sankuai.waimai.business.search.common.util.g;
import com.sankuai.waimai.business.search.model.HotLabel;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.mrn.a;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistory;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SearchGuideNativeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMSearchGuideNativeModule";
    }

    public SearchGuideNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e93df135eeca0665713a925dc25b1f0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e93df135eeca0665713a925dc25b1f0e");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
        }
    }

    private void runUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9d281d24b06cbd88e3d63046f4ff3c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9d281d24b06cbd88e3d63046f4ff3c3");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    @ReactMethod
    public void getRecommendSearchKeywords(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30818c78c229a333c2105377ab4bee6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30818c78c229a333c2105377ab4bee6a");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        final SearchShareData searchShareData = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(getCurrentActivity(), SearchShareData.class);
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a24bd3f6bebdd7ada6155b621bbc6d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a24bd3f6bebdd7ada6155b621bbc6d8");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (searchShareData.o != null) {
                    arrayList.add(searchShareData.o);
                }
                if (searchShareData.p != null) {
                    arrayList.add(searchShareData.p);
                }
                promise.resolve(new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping().enableComplexMapKeySerialization().create().toJson(arrayList));
            }
        });
    }

    @ReactMethod
    public void getHomeSearchKeywordsList(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c24cf10a0efbaee60ba309d74d77e1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c24cf10a0efbaee60ba309d74d77e1ce");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        final SearchShareData searchShareData = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(getCurrentActivity(), SearchShareData.class);
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b36b07883cdefd4971a586c3012fcc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b36b07883cdefd4971a586c3012fcc9");
                    return;
                }
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                if (d.a(searchShareData.r)) {
                    promise.resolve(writableNativeArray);
                    return;
                }
                Iterator<RecommendedSearchKeyword> it = searchShareData.r.iterator();
                while (it.hasNext()) {
                    RecommendedSearchKeyword next = it.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("keyWord", !TextUtils.isEmpty(next.scheme) ? next.scheme : next.searchKeyword);
                    writableNativeMap.putString("showWord", next.viewKeyword);
                    writableNativeMap.putInt("index", next.exposedIndex);
                    writableNativeMap.putBoolean("exposure", next.isExposed);
                    writableNativeMap.putInt("wordType", next.wordType);
                    writableNativeArray.pushMap((WritableMap) writableNativeMap);
                }
                promise.resolve(writableNativeArray);
            }
        });
    }

    @ReactMethod
    public void getPromotionWords(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddef3b199b11a0566368287e28668215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddef3b199b11a0566368287e28668215");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        promise.resolve(e.a());
    }

    @ReactMethod
    public void getHotlabelandhistory(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9ce5e5d9a391be237bbda739539afca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9ce5e5d9a391be237bbda739539afca");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        promise.resolve(g.a().b());
    }

    @ReactMethod
    public void getHotranksData(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1787919ad18f7aa8b0b5f476ae926ae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1787919ad18f7aa8b0b5f476ae926ae1");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        promise.resolve(g.a().c());
    }

    @ReactMethod
    public void getSearchHistory(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79722d979bac860af7bbcd3f5fa30d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79722d979bac860af7bbcd3f5fa30d21");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "094b30ded2f5cf3ef169530527a521ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "094b30ded2f5cf3ef169530527a521ad");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cf2258849149a60e09163abd406114a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cf2258849149a60e09163abd406114a");
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        List<PoiSearchHistory> all = PoiSearchHistoryLogic.getAll();
        if (d.a(all)) {
            promise.resolve(writableNativeArray);
            return;
        }
        if (all.size() > 10) {
            all = all.subList(0, 10);
        }
        for (PoiSearchHistory poiSearchHistory : all) {
            if (poiSearchHistory != null && !TextUtils.isEmpty(poiSearchHistory.getContent())) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("history_search_word", poiSearchHistory.getContent());
                writableNativeMap.putDouble("wm_poi_id", Double.valueOf(String.valueOf(poiSearchHistory.getPoiId())).doubleValue());
                writableNativeMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, poiSearchHistory.getPoiIdStr());
                writableNativeArray.pushMap((WritableMap) writableNativeMap);
            }
        }
        promise.resolve(writableNativeArray);
    }

    @ReactMethod
    public void setSearchHistory(final ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "181794ee200b31c60db4661fed35ac3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "181794ee200b31c60db4661fed35ac3e");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b74070b3aee4f024de324f84092d3f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b74070b3aee4f024de324f84092d3f6");
                } else if (readableArray != null) {
                    if (readableArray.size() == 0) {
                        com.meituan.android.bus.a.a().c(new a.C0863a());
                        return;
                    }
                    final ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < readableArray.size(); i++) {
                        ReadableMap map = readableArray.getMap(i);
                        if (map != null) {
                            String str = "";
                            String str2 = "";
                            if (map.hasKey("search_word") && !map.isNull("search_word")) {
                                str = map.getString("search_word");
                            }
                            String str3 = str;
                            long parseLong = (!map.hasKey("poi_id") || map.isNull("poi_id")) ? 0L : Long.parseLong(map.getString("poi_id"));
                            if (map.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) && !map.isNull(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                                str2 = map.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                            }
                            arrayList.add(new PoiSearchHistory(null, str3, Long.valueOf((System.currentTimeMillis() + readableArray.size()) - i), Long.valueOf(parseLong), 0L, str2));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    rx.d.a((Callable) new Callable<String>() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.4.1
                        public static ChangeQuickRedirect a;

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.util.concurrent.Callable
                        /* renamed from: a */
                        public String call() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7a60ef3a1b2331a0af5de3a860d123b5", RobustBitConfig.DEFAULT_VALUE)) {
                                return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7a60ef3a1b2331a0af5de3a860d123b5");
                            }
                            try {
                                PoiSearchHistoryLogic.saveHistoryList(arrayList);
                                return null;
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                                return null;
                            }
                        }
                    }).b(rx.schedulers.a.e()).f();
                }
            }
        });
    }

    @ReactMethod
    public void searchHotRank(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "653ad4f45f41f247ca18c5a7191e388e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "653ad4f45f41f247ca18c5a7191e388e");
        } else {
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9224c86ce62db6ba97ef066af4f2984", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9224c86ce62db6ba97ef066af4f2984");
                    } else if (readableMap == null) {
                    } else {
                        com.meituan.android.bus.a.a().c(new a.d(str, (!readableMap.hasKey("type") || readableMap.isNull("type")) ? 0 : readableMap.getInt("type"), (!readableMap.hasKey("search_word") || readableMap.isNull("search_word")) ? null : readableMap.getString("search_word"), (!readableMap.hasKey(NetLogConstants.Details.SCHEME) || readableMap.isNull(NetLogConstants.Details.SCHEME)) ? null : readableMap.getString(NetLogConstants.Details.SCHEME), (!readableMap.hasKey("view_word") || readableMap.isNull("view_word")) ? null : readableMap.getString("view_word")));
                    }
                }
            });
        }
    }

    @ReactMethod
    public void searchSpecialFoodRank(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e717883312283bfacbff67488ab6683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e717883312283bfacbff67488ab6683");
        } else {
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c9a0d5c443bc8f87d66cfdad25233a86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c9a0d5c443bc8f87d66cfdad25233a86");
                    } else if (readableMap == null) {
                    } else {
                        String str2 = null;
                        int i2 = (!readableMap.hasKey("type") || readableMap.isNull("type")) ? 0 : readableMap.getInt("type");
                        if (readableMap.hasKey("search_word") && !readableMap.isNull("search_word")) {
                            str2 = readableMap.getString("search_word");
                        }
                        if (readableMap.hasKey("inner_source") && !readableMap.isNull("inner_source")) {
                            i = readableMap.getInt("inner_source");
                        }
                        com.meituan.android.bus.a.a().c(new a.f(str, i2, str2, i));
                    }
                }
            });
        }
    }

    @ReactMethod
    public void searchHotLabelItem2(ReadableMap readableMap, String str, String str2) {
        Object[] objArr = {readableMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4519091d1df8f79b8daebd4a271897b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4519091d1df8f79b8daebd4a271897b3");
        } else {
            doSearchHotLabelItem(readableMap, str, str2);
        }
    }

    private void doSearchHotLabelItem(final ReadableMap readableMap, final String str, final String str2) {
        Object[] objArr = {readableMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fa89eb1d9528ffe74ea8fa2eab5eb19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fa89eb1d9528ffe74ea8fa2eab5eb19");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2027ba12f269c290f1b942b9334731f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2027ba12f269c290f1b942b9334731f7");
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
                    if (readableMap.hasKey("jumpe_scheme") && !readableMap.isNull("jumpe_scheme")) {
                        hotLabel.jumpScheme = readableMap.getString("jumpe_scheme");
                    }
                    if (readableMap.hasKey("click_url") && !readableMap.isNull("click_url")) {
                        hotLabel.clickUrl = readableMap.getString("click_url");
                    }
                    if (readableMap.hasKey("word_source") && !readableMap.isNull("word_source")) {
                        hotLabel.wordSource = readableMap.getString("word_source");
                    }
                    com.meituan.android.bus.a.a().c(new a.c(str, hotLabel, str2));
                }
            }
        });
    }

    @ReactMethod
    public void searchHistoryItem(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da49309a5ed990f59af98032845f28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da49309a5ed990f59af98032845f28c");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.8
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "93a788bd883492f0182d4879f5086d80", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "93a788bd883492f0182d4879f5086d80");
                } else if (readableMap == null) {
                } else {
                    long j = 0;
                    String str2 = "";
                    if (readableMap.hasKey("poi_id") && !readableMap.isNull("poi_id")) {
                        j = Long.parseLong(readableMap.getString("poi_id"));
                    }
                    long j2 = j;
                    if (readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) && !readableMap.isNull(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                        str2 = readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                    }
                    String str3 = str2;
                    if (!readableMap.hasKey("type") || readableMap.isNull("type")) {
                        z = 0;
                    } else {
                        int i = readableMap.getInt("type");
                        z = i == 0 ? 1 : 0;
                        r0 = i;
                    }
                    String string = (!readableMap.hasKey("search_word") || readableMap.isNull("search_word")) ? null : readableMap.getString("search_word");
                    String string2 = (!readableMap.hasKey(NetLogConstants.Details.SCHEME) || readableMap.isNull(NetLogConstants.Details.SCHEME)) ? null : readableMap.getString(NetLogConstants.Details.SCHEME);
                    a.b bVar = new a.b();
                    bVar.c = new com.sankuai.waimai.business.search.ui.guide.history.a(j2, str3, string, z, string2);
                    bVar.a = str;
                    bVar.b = r0;
                    com.meituan.android.bus.a.a().c(bVar);
                }
            }
        });
    }

    @ReactMethod
    public void onRecommendClick(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3816353f3c631140b18ac837a99e59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3816353f3c631140b18ac837a99e59e");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchGuideNativeModule.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "481baf7399f8a2372187ed85892219dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "481baf7399f8a2372187ed85892219dc");
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
