package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.MemberCouponStatusResponse;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGCouponDialogModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mRequestTag;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SGCouponDialogModule";
    }

    public SGCouponDialogModule(@NonNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0cdf3c14fc7588261e601c0808be848", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0cdf3c14fc7588261e601c0808be848");
        } else {
            initTag(reactApplicationContext.getCurrentActivity());
        }
    }

    private void initTag(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8472eba60c530ec6781b302eb61cf79c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8472eba60c530ec6781b302eb61cf79c");
            return;
        }
        if (activity instanceof SCBaseActivity) {
            this.mRequestTag = ((SCBaseActivity) activity).w();
        }
        if (TextUtils.isEmpty(this.mRequestTag)) {
            this.mRequestTag = SGCouponDialogModule.class.getSimpleName();
        }
    }

    @ReactMethod
    public void onCouponReceived(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17cc062258f75fc4f34a3df41f4e1e62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17cc062258f75fc4f34a3df41f4e1e62");
        } else {
            al.a(new al.b<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.mrn.SGCouponDialogModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(Poi.PoiCouponItem poiCouponItem) {
                    Poi.PoiCouponItem poiCouponItem2 = poiCouponItem;
                    Object[] objArr2 = {poiCouponItem2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b7e5978bf0842ac2cfddb9167060f88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b7e5978bf0842ac2cfddb9167060f88");
                    } else if (poiCouponItem2 != null) {
                        com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem2);
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4129fbb7e153006dad6aecb8088040b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Poi.PoiCouponItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4129fbb7e153006dad6aecb8088040b");
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
    public void onSGCouponDialog(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e836b4c401d62c77d5142a632c934d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e836b4c401d62c77d5142a632c934d7e");
        } else {
            al.a(new al.b<WritableMap>() { // from class: com.sankuai.waimai.store.mrn.SGCouponDialogModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(WritableMap writableMap) {
                    WritableMap writableMap2 = writableMap;
                    Object[] objArr2 = {writableMap2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ed576c91a0a45091d4afadc1f8ab65a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ed576c91a0a45091d4afadc1f8ab65a0");
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
                    Set<String> keySet;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab7a1b67214e27a80f09075583383018", RobustBitConfig.DEFAULT_VALUE)) {
                        return (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab7a1b67214e27a80f09075583383018");
                    }
                    WritableMap createMap = Arguments.createMap();
                    try {
                        Map<String, String> a2 = com.sankuai.waimai.store.coupons.a.a().a(SGCouponDialogModule.this.getCurrentActivity(), (String) null);
                        if (a2 != null && !a2.isEmpty() && (keySet = a2.keySet()) != null && !keySet.isEmpty()) {
                            for (String str : keySet) {
                                createMap.putString(str, a2.get(str));
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                    return createMap;
                }
            }, this.mRequestTag);
        }
    }

    @ReactMethod
    public void dismissCouponDialog(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f81002fa360a627b23c1e21167c056a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f81002fa360a627b23c1e21167c056a");
        } else {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void onOpenBrandMemberCouponDialog(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b869e3218ceced03878a257886c67edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b869e3218ceced03878a257886c67edc");
        } else if (readableMap == null) {
        } else {
            if (!readableMap.hasKey("poi_id") && !readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                d.a(promise, new RuntimeException("error input"));
                return;
            }
            try {
                String string = readableMap.hasKey("poi_id") ? readableMap.getString("poi_id") : "";
                String string2 = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
                if (string == null) {
                    string = "0";
                }
                final long parseLong = Long.parseLong(string);
                final com.sankuai.waimai.store.coupon.b bVar = new com.sankuai.waimai.store.coupon.b(getCurrentActivity());
                final String str = string2;
                com.sankuai.waimai.store.base.net.sg.a.a((Object) this.mRequestTag).a(parseLong, string2, new j<MemberCouponStatusResponse>() { // from class: com.sankuai.waimai.store.mrn.SGCouponDialogModule.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(MemberCouponStatusResponse memberCouponStatusResponse) {
                        MemberCouponStatusResponse memberCouponStatusResponse2 = memberCouponStatusResponse;
                        Object[] objArr2 = {memberCouponStatusResponse2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b498545ae151e357f44b98eadf150263", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b498545ae151e357f44b98eadf150263");
                        } else if (memberCouponStatusResponse2.cardInfo != null) {
                            bVar.a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, parseLong), memberCouponStatusResponse2.title, memberCouponStatusResponse2.subTitle, memberCouponStatusResponse2.cardInfo.logoUrl, memberCouponStatusResponse2.cardInfo.brandName, memberCouponStatusResponse2.scheme, promise);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f5f268d4f996b0e57c4d8a1b3ff87ae0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f5f268d4f996b0e57c4d8a1b3ff87ae0");
                        } else {
                            bVar.a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a9d789a69e2a3a659da9f97f00cc86f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a9d789a69e2a3a659da9f97f00cc86f2");
                        } else {
                            bVar.b();
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                        com.sankuai.waimai.store.mrn.dialog.c cVar;
                        Object[] objArr2 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d46fe4e3ccc53822e083fe11b85ee4c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d46fe4e3ccc53822e083fe11b85ee4c");
                        } else if (bVar2 == null || TextUtils.isEmpty(bVar2.b)) {
                        } else {
                            try {
                                if (SGCouponDialogModule.this.getCurrentActivity() instanceof BaseMemberActivity) {
                                    BaseMemberActivity baseMemberActivity = (BaseMemberActivity) SGCouponDialogModule.this.getCurrentActivity();
                                    if (!(baseMemberActivity.b instanceof com.sankuai.waimai.store.mrn.dialog.c) || (cVar = (com.sankuai.waimai.store.mrn.dialog.c) baseMemberActivity.b) == null) {
                                        return;
                                    }
                                    cVar.a(bVar2.b);
                                }
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                        }
                    }
                });
            } catch (Exception unused) {
                d.a(promise, new RuntimeException("data parse error!"));
            }
        }
    }

    @ReactMethod
    public void anchorCategory(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb59015c84136c0c6bd41413fb50d908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb59015c84136c0c6bd41413fb50d908");
        } else if (!readableMap.hasKey("tag_id") || TextUtils.isEmpty(readableMap.getString("tag_id"))) {
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.coupons.event.a(readableMap.getString("tag_id")));
            d.a(promise);
        }
    }

    @ReactMethod
    public void poiStoreyRefresh(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19e8640ccb33a02f0ef09a3543e5ec35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19e8640ccb33a02f0ef09a3543e5ec35");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGCouponDialogModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fbe328b41eca1f70c2b5cd479e66536f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fbe328b41eca1f70c2b5cd479e66536f");
                        return;
                    }
                    try {
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.newp.event.c());
                        d.a(promise);
                    } catch (Exception e) {
                        promise.reject("", "");
                        com.dianping.judas.util.a.a(e);
                    }
                }
            }, "");
        }
    }
}
