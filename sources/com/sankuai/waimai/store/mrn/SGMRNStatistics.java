package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.module.utils.e;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
/* compiled from: ProGuard */
@ReactModule(name = SGMRNStatistics.NAME)
/* loaded from: classes5.dex */
public class SGMRNStatistics extends ReactContextBaseJavaModule {
    public static final String NAME = "SMMRNStatistics";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCid;
    private k mrnInstance;

    public static void hookMRNPVSG(String str, String str2) {
    }

    public static void hookMRNStatisticSG(EventInfo eventInfo) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public void hookForAutoCollectSG(EventInfo eventInfo) {
    }

    public SGMRNStatistics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c52da8ecb0b803a4e32d3b0ee7771adf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c52da8ecb0b803a4e32d3b0ee7771adf");
        }
    }

    public String getPageCid() {
        return this.mCid;
    }

    @ReactMethod
    public void updateMRNContainerCid(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86d0fda717d9eb9132d211cb2280a13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86d0fda717d9eb9132d211cb2280a13b");
            return;
        }
        try {
            if (r.a(getReactApplicationContext()) != null) {
                String str2 = r.a(getReactApplicationContext()).l;
                com.sankuai.waimai.store.mrn.shopcartbridge.b a = com.sankuai.waimai.store.mrn.shopcartbridge.b.a();
                Object[] objArr2 = {str2, str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.mrn.shopcartbridge.b.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "3e1f985ddc711a21d549f5a8e64ce25b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "3e1f985ddc711a21d549f5a8e64ce25b");
                } else if (!t.a(str2) && !t.a(str)) {
                    a.b.put(str2, str);
                }
                d.a(promise);
                return;
            }
            d.a(promise, new Exception("updateMRNContainerCid fail: getCurrentMRNInstance is null"));
        } catch (Exception e) {
            d.a(promise, new Exception("updateMRNContainerCid fail"));
            e.printStackTrace();
        }
    }

    @ReactMethod
    public void smMRNLxTrackMPT(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f51d9984e26da5a2611818869a930c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f51d9984e26da5a2611818869a930c3");
            return;
        }
        e.a(str, str2, str3, getPVMapFromRN(readableMap));
        hookMRNPVSG(str3, i.a(getPVMapFromRN(readableMap)));
    }

    @ReactMethod
    public void smMRNLxTrackPD(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cff4099edf55f8ea93a1568a0ebc003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cff4099edf55f8ea93a1568a0ebc003");
        } else {
            e.b(str, str2, str3, null);
        }
    }

    @ReactMethod
    public void smMRNLxClickEvent(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0de2427d46f30b55daf03a6e5c36c8bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0de2427d46f30b55daf03a6e5c36c8bf");
            return;
        }
        HashMap<String, Object> viewMapFromRN = getViewMapFromRN(readableMap);
        Object[] objArr2 = {str, str2, str3, viewMapFromRN};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "160fb5d0ed1cba0c14a9801d868dc326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "160fb5d0ed1cba0c14a9801d868dc326");
        } else {
            e.a(str).writeModelClick(str2, viewMapFromRN, str3);
        }
        createEventName(EventName.CLICK, str2, str3, getViewMapFromRN(readableMap));
    }

    @ReactMethod
    public void smMRNLxViewEvent(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5652566f97f785f59160202379b57bf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5652566f97f785f59160202379b57bf7");
            return;
        }
        HashMap<String, Object> viewMapFromRN = getViewMapFromRN(readableMap);
        Object[] objArr2 = {str, str2, str3, viewMapFromRN};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3df4ca4bd9074efb56523993b00d7c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3df4ca4bd9074efb56523993b00d7c0e");
        } else {
            e.a(str).writeModelView(str2, viewMapFromRN, str3);
        }
        createEventName(EventName.MODEL_VIEW, str2, str3, getViewMapFromRN(readableMap));
    }

    private HashMap<String, Object> getPVMapFromRN(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d1992d4f0101cdb676c29e3cee82444", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d1992d4f0101cdb676c29e3cee82444");
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (readableMap == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = readableMap.toHashMap();
        }
        hashMap2.put("custom", hashMap);
        hashMap2.put("poi_id", hashMap.remove("poi_id"));
        hashMap2.put("index", hashMap.remove("index"));
        hashMap2.put("stid", hashMap.remove("stid"));
        com.sankuai.waimai.store.manager.judas.a.a(hashMap);
        com.sankuai.waimai.store.manager.judas.a.b(hashMap);
        addCommonParam(hashMap);
        return hashMap2;
    }

    private HashMap<String, Object> getViewMapFromRN(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d83746820f2542c46cf4f5666c61458d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d83746820f2542c46cf4f5666c61458d");
        }
        if (readableMap == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = readableMap.toHashMap();
        }
        HashMap hashMap2 = null;
        if (hashMap.containsKey("custom")) {
            Object obj = hashMap.get("custom");
            if (obj instanceof HashMap) {
                hashMap2 = (HashMap) obj;
            }
        } else {
            hashMap2 = new HashMap();
            hashMap.put("custom", hashMap2);
        }
        com.sankuai.waimai.store.manager.judas.a.a(hashMap2);
        com.sankuai.waimai.store.manager.judas.a.b(hashMap2);
        addCommonParam(hashMap);
        return hashMap;
    }

    private void addCommonParam(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "066ab582158bd01c06f240dedb99333c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "066ab582158bd01c06f240dedb99333c");
        } else if (hashMap != null) {
            try {
                hashMap.put("from_mrn", "1");
                ensureMRNInstance();
                if (this.mrnInstance != null && this.mrnInstance.i != null) {
                    hashMap.put("mrn_bundle_name", this.mrnInstance.i.c);
                    hashMap.put("mrn_bundle_version", this.mrnInstance.i.f);
                }
                hashMap.put("x_env", com.sankuai.waimai.store.base.net.sg.c.a().b());
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    public void createEventName(EventName eventName, String str, String str2, HashMap<String, Object> hashMap) {
        Object[] objArr = {eventName, str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05057ea03021d854a080328a0821f55e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05057ea03021d854a080328a0821f55e");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = eventName;
        eventInfo.val_bid = str;
        eventInfo.val_cid = str2;
        eventInfo.val_lab = hashMap;
        hookForAutoCollectSG(eventInfo);
        com.sankuai.waimai.store.manager.judas.c.a(eventInfo);
        hookMRNStatisticSG(eventInfo);
        com.sankuai.waimai.store.search.ui.result.datamarket.d.a().a(eventInfo, 2);
    }

    private void ensureMRNInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36fb1ef8bc6fc50e2842d2fbf31fda13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36fb1ef8bc6fc50e2842d2fbf31fda13");
        } else if (this.mrnInstance == null) {
            this.mrnInstance = r.a(getReactApplicationContext());
        }
    }
}
