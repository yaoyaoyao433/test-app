package com.sankuai.waimai.store.drug.mrn.bridge;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.JsonSyntaxException;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.drug.coupon.MemberCouponEntry;
import com.sankuai.waimai.store.drug.coupons.CouponsBaseDialogFragment;
import com.sankuai.waimai.store.drug.coupons.b;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMRNCouponsDataModule extends ReactContextBaseJavaModule {
    public static final int COUPON_TYPE_MT_PAY = 14;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mRequestTag;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "MEDMRNCouponsDataBridge";
    }

    public DrugMRNCouponsDataModule(@NonNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab76eea2dca6f96a9abb8cb0ccaf5218", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab76eea2dca6f96a9abb8cb0ccaf5218");
        } else {
            initTag(reactApplicationContext.getCurrentActivity());
        }
    }

    private void initTag(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "452a5f578dcd26559b95ba4589b3a5a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "452a5f578dcd26559b95ba4589b3a5a3");
            return;
        }
        if (activity instanceof SCBaseActivity) {
            this.mRequestTag = ((SCBaseActivity) activity).w();
        }
        if (TextUtils.isEmpty(this.mRequestTag)) {
            this.mRequestTag = DrugMRNCouponsDataModule.class.getSimpleName();
        }
    }

    private void loadPoiInfoNative(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4f412763a64a022356a581eda655c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4f412763a64a022356a581eda655c3f");
        } else {
            al.a(new al.b<WritableMap>() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.DrugMRNCouponsDataModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(WritableMap writableMap) {
                    WritableMap writableMap2 = writableMap;
                    Object[] objArr2 = {writableMap2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "987786a2a6f250d8b5919fa8f2836be0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "987786a2a6f250d8b5919fa8f2836be0");
                    } else if (promise != null) {
                        if (writableMap2 != null) {
                            promise.resolve(writableMap2);
                        } else {
                            d.a(promise, new RuntimeException("coupon parse error!"));
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public WritableMap a() {
                    WritableMap writableMap;
                    Map hashMap;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a68f36f53387df64989352945bfcadf", RobustBitConfig.DEFAULT_VALUE)) {
                        return (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a68f36f53387df64989352945bfcadf");
                    }
                    WritableMap createMap = Arguments.createMap();
                    try {
                        Activity currentActivity = DrugMRNCouponsDataModule.this.getCurrentActivity();
                        Object[] objArr3 = {currentActivity};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        writableMap = null;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "f77e2173d8499068ae74472a9b1b10d7", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap = (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "f77e2173d8499068ae74472a9b1b10d7");
                        } else {
                            hashMap = new HashMap();
                            if (currentActivity instanceof SCBaseActivity) {
                                hashMap.put("cid", com.sankuai.waimai.store.manager.judas.b.a((Context) currentActivity));
                                CouponsBaseDialogFragment couponsBaseDialogFragment = (CouponsBaseDialogFragment) ((SCBaseActivity) currentActivity).getSupportFragmentManager().findFragmentByTag("drug_coupons");
                                if (couponsBaseDialogFragment != null) {
                                    if (couponsBaseDialogFragment.a() != null) {
                                        hashMap.put("wm_poi_id", String.valueOf(couponsBaseDialogFragment.a().g()));
                                        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, couponsBaseDialogFragment.a().h());
                                        hashMap.put("stid", couponsBaseDialogFragment.a().b.abExpInfo);
                                    }
                                    hashMap.put("data", couponsBaseDialogFragment.b());
                                }
                            }
                        }
                    } catch (Exception e) {
                        a.a(e);
                    }
                    if (hashMap != null && !hashMap.isEmpty()) {
                        String str = (String) hashMap.get("data");
                        if (!TextUtils.isEmpty(str) && i.a(str)) {
                            writableMap = g.a(new JSONObject(str));
                        }
                        createMap.putMap("data", writableMap);
                        return createMap;
                    }
                    return createMap;
                }
            }, this.mRequestTag);
        }
    }

    @ReactMethod
    public void loadPoiInfoNew(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a222f586feb131a33cb56b38fa39091f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a222f586feb131a33cb56b38fa39091f");
        } else {
            loadPoiInfoNative(promise);
        }
    }

    @ReactMethod
    public void loadPoiInfo(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ca75f807687738d55348b7f2d65d588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ca75f807687738d55348b7f2d65d588");
        } else {
            loadPoiInfoNative(promise);
        }
    }

    @ReactMethod
    public void dismissCouponDialog(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a58e0f77daca3aad7a575d80f6a5c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a58e0f77daca3aad7a575d80f6a5c68");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.DrugMRNCouponsDataModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7996ac784202ba577f238d0571821ee9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7996ac784202ba577f238d0571821ee9");
                        return;
                    }
                    try {
                        b.a(DrugMRNCouponsDataModule.this.getCurrentActivity());
                        d.a(promise);
                    } catch (Exception e) {
                        a.a(e);
                    }
                }
            }, this.mRequestTag);
        }
    }

    @ReactMethod
    public void onCouponReceived(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af36fe1d0836f14efaa2a41ebf56a62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af36fe1d0836f14efaa2a41ebf56a62b");
        } else {
            al.a(new al.b<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.DrugMRNCouponsDataModule.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(Poi.PoiCouponItem poiCouponItem) {
                    Poi.PoiCouponItem poiCouponItem2 = poiCouponItem;
                    Object[] objArr2 = {poiCouponItem2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b39d1232be7de08a0d9c38ceb70242a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b39d1232be7de08a0d9c38ceb70242a");
                    } else if (poiCouponItem2 != null) {
                        if (poiCouponItem2.couponShowType == 14) {
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.drug.mrn.event.a());
                            return;
                        }
                        c.a().a(poiCouponItem2);
                        d.a(promise);
                    } else {
                        d.a(promise, new RuntimeException("coupon parse error!"));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public Poi.PoiCouponItem a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cbb64d8a84313a3175f3a87ff201d37a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Poi.PoiCouponItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cbb64d8a84313a3175f3a87ff201d37a");
                    }
                    try {
                        return (Poi.PoiCouponItem) i.a(i.a(readableMap.toHashMap().get("coupon")), Poi.PoiCouponItem.class);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }, this.mRequestTag);
        }
    }

    @ReactMethod
    public void onOpenBrandMemberCouponDialog(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "321c6d79d6e3f010d357888cb2f9df4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "321c6d79d6e3f010d357888cb2f9df4e");
        } else if (readableMap == null) {
        } else {
            if (!readableMap.hasKey("poi_id") && !readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                d.a(promise, new RuntimeException("error input"));
                return;
            }
            try {
                String string = readableMap.hasKey("poi_id") ? readableMap.getString("poi_id") : "";
                String string2 = readableMap.hasKey("coupon_item") ? readableMap.getString("coupon_item") : "";
                long a = r.a(string, -1L);
                String string3 = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
                int i = readableMap.hasKey("source_type") ? readableMap.getInt("source_type") : 2;
                com.sankuai.waimai.store.drug.coupon.d dVar = new com.sankuai.waimai.store.drug.coupon.d(new MemberCouponEntry(getCurrentActivity()));
                Poi.PoiCouponItem poiCouponItem = null;
                try {
                    if (!TextUtils.isEmpty(string2)) {
                        poiCouponItem = (Poi.PoiCouponItem) i.a().fromJson(string2, (Class<Object>) Poi.PoiCouponItem.class);
                    }
                } catch (JsonSyntaxException e) {
                    a.a(e);
                }
                dVar.a(a, string3, this.mRequestTag, b.a(getCurrentActivity(), getOfficialPoiId(string3, a)), i, poiCouponItem);
                d.a(promise);
            } catch (Exception unused) {
                d.a(promise, new RuntimeException("data parse error!"));
            }
        }
    }

    private String getOfficialPoiId(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f9f5a37ea36d2700ab0300720d1294e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f9f5a37ea36d2700ab0300720d1294e") : com.sankuai.waimai.store.platform.domain.manager.poi.a.b(str, j);
    }
}
