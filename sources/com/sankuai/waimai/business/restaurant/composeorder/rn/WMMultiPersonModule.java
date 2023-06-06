package com.sankuai.waimai.business.restaurant.composeorder.rn;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.util.c;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.Product;
import com.sankuai.waimai.platform.utils.n;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMultiPersonModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMMultiPersonModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public WMMultiPersonModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08dc69886af41c53f89f499accdec86b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08dc69886af41c53f89f499accdec86b");
        }
    }

    @ReactMethod
    public void clearCart(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1aa6f8c528000a87e75a0bcf539f296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1aa6f8c528000a87e75a0bcf539f296");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a4c3e3903b44e1b045b1dc7190ce3d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a4c3e3903b44e1b045b1dc7190ce3d7");
                        return;
                    }
                    try {
                        String a2 = c.a(readableMap.getString("poiIdStr"));
                        k.a().a(a2);
                        k.a().f(a2);
                        com.sankuai.waimai.business.order.api.submit.c.a().clearOrder();
                    } catch (NumberFormatException unused) {
                    }
                }
            });
        }
    }

    @ReactMethod
    public void jumpToMultiPersonRest(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d98119eb8c0ef4b1ff41f7331950d3b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d98119eb8c0ef4b1ff41f7331950d3b4");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList<Product> arrayList;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d69234b7ea57e0c121bf6e141ec5caf3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d69234b7ea57e0c121bf6e141ec5caf3");
                        return;
                    }
                    String string = readableMap.getString("poiIdStr");
                    String string2 = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
                    String string3 = readableMap.getString("productStr");
                    String string4 = readableMap.getString("shopcartId");
                    String string5 = readableMap.getString("identityId");
                    ArrayList<Product> arrayList2 = new ArrayList<>();
                    long j = 0;
                    try {
                        arrayList = Product.formJsonArray(new JSONArray(string3));
                        try {
                            j = Long.parseLong(string);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        arrayList = arrayList2;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("poiId", j);
                    bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, string2);
                    bundle.putSerializable("multi_person_cart", arrayList);
                    bundle.putString("multi_person_cart_id", string4);
                    bundle.putString("multi_person_cart_identity_id", string5);
                    bundle.putBoolean("isopenshopcart", true);
                    bundle.putBoolean("is_restrict_restaurant", true);
                    bundle.putBoolean("multi_person_is_from_rn", true);
                    com.sankuai.waimai.foundation.router.a.a(WMMultiPersonModule.this.getCurrentActivity(), com.sankuai.waimai.foundation.router.interfaces.c.c, bundle);
                }
            });
        }
    }

    @ReactMethod
    public void calculateAndRefresh(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "744ed3035e3d15aa5fad5c81aeb9bdc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "744ed3035e3d15aa5fad5c81aeb9bdc3");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3950b3d322f2c1cfd46be342ebcf7063", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3950b3d322f2c1cfd46be342ebcf7063");
                        return;
                    }
                    final String a2 = c.a(readableMap.getString("poiIdStr"));
                    k.a().b(a2, new e() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.3.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f9ba2d53d244eba963a6d8af608a34ab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f9ba2d53d244eba963a6d8af608a34ab");
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a7f8836b22e876d0f49535ef9cad3d21", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a7f8836b22e876d0f49535ef9cad3d21");
                            } else {
                                k.a().b(a2);
                            }
                        }
                    });
                }
            });
        }
    }

    @ReactMethod
    public void orderPreview(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "638747bb7bd445b7d0ad2124647a2002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "638747bb7bd445b7d0ad2124647a2002");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "160f840e2a6946c1638cd2a4cc15a935", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "160f840e2a6946c1638cd2a4cc15a935");
                        return;
                    }
                    String string = readableMap.getString("multi_person_data");
                    String string2 = readableMap.getString("goods_coupon_view_id");
                    if (string != null) {
                        try {
                            MultiPersonCart fromJson = MultiPersonCart.fromJson(new JSONObject(string));
                            fromJson.setGoodsCouponViewId(string2);
                            if (com.sankuai.waimai.business.order.api.confirm.a.a()) {
                                com.sankuai.waimai.foundation.router.a.a(WMMultiPersonModule.this.getCurrentActivity(), WMMultiPersonModule.this.cast(fromJson));
                                n.a().a(fromJson);
                                return;
                            }
                            com.sankuai.waimai.business.order.api.submit.c.a().setSourceType(15);
                            com.sankuai.waimai.business.order.api.submit.c.a().multiPersonPreOrder(WMMultiPersonModule.this.getCurrentActivity(), fromJson, WMMultiPersonModule.REACT_CLASS);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String cast(MultiPersonCart multiPersonCart) {
        String str;
        Object[] objArr = {multiPersonCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a7c2756d933d01fb89e3e96cb668ab5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a7c2756d933d01fb89e3e96cb668ab5");
        }
        String json = multiPersonCart != null ? new GsonBuilder().registerTypeAdapter(MultiPersonCart.class, new MultiCartDataAdaptor()).create().toJson(multiPersonCart) : null;
        if (TextUtils.isEmpty(json)) {
            return json;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "imeituan://www.meituan.com";
        } else {
            str = com.sankuai.waimai.foundation.core.a.f() ? "dianping://waimai.dianping.com" : com.sankuai.waimai.foundation.router.interfaces.b.c;
        }
        return str + "/confirm/order?data=" + json;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class MultiCartDataAdaptor extends TypeAdapter<MultiPersonCart> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ MultiPersonCart read(JsonReader jsonReader) throws IOException {
            return null;
        }

        private MultiCartDataAdaptor() {
            Object[] objArr = {WMMultiPersonModule.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc917bc840d4a2201582e9e53f598439", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc917bc840d4a2201582e9e53f598439");
            }
        }

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, MultiPersonCart multiPersonCart) throws IOException {
            MultiPersonCart multiPersonCart2 = multiPersonCart;
            Object[] objArr = {jsonWriter, multiPersonCart2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4327ae71c66dbfcb435d431c9064f7cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4327ae71c66dbfcb435d431c9064f7cc");
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("poi_id").value(multiPersonCart2.getPoiInfo().getPoiId());
            jsonWriter.name(FoodDetailNetWorkPreLoader.URI_POI_STR).value(multiPersonCart2.getPoiInfo().getPoiIdStr());
            jsonWriter.name("source_type").value(15L);
            jsonWriter.name("page_from").value("from_multi_order");
            if (multiPersonCart2.isSelfDelivery()) {
                jsonWriter.name("business_type").value(1L);
            } else {
                jsonWriter.name("business_type").value(0L);
            }
            jsonWriter.name("transfer");
            jsonWriter.beginObject();
            jsonWriter.name("cart_id").value(multiPersonCart2.getShoppingCart().getId());
            if (!TextUtils.isEmpty(multiPersonCart2.getGoodsCouponViewId())) {
                jsonWriter.name("goods_coupon_view_id").value(multiPersonCart2.getGoodsCouponViewId());
            }
            jsonWriter.endObject();
            jsonWriter.name(PackageLoadReporter.LoadType.LOCAL);
            jsonWriter.beginObject();
            jsonWriter.name(KnbConstants.PARAMS_SCENE).value(2L);
            jsonWriter.name("self_delivery").value(multiPersonCart2.isSelfDelivery());
            jsonWriter.name("tag").value(WMMultiPersonModule.REACT_CLASS);
            jsonWriter.name("cart").value(true);
            jsonWriter.endObject();
            jsonWriter.endObject();
        }
    }

    @ReactMethod
    public void updateCartId(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb9dda3ba887cffffb3ab3ed3f570c1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb9dda3ba887cffffb3ab3ed3f570c1f");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6bcac8eef35b5703c2940102342e6623", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6bcac8eef35b5703c2940102342e6623");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.composeorder.a.a().e = str;
                }
            });
        }
    }

    @ReactMethod
    public void updateIdentifyId(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccd6d5b735c47d6513176eae4fa56071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccd6d5b735c47d6513176eae4fa56071");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.WMMultiPersonModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5bce081e35c9feadaade6f79d8997a74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5bce081e35c9feadaade6f79d8997a74");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.composeorder.a.a().f = str;
                }
            });
        }
    }
}
