package com.sankuai.waimai.bussiness.order.transfer;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.submit.d;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class SchemeFactory {
    public static ChangeQuickRedirect a;
    public static String b;
    public static String c;

    static {
        if (com.sankuai.waimai.foundation.core.a.e()) {
            b = "scheme_order_confirm_mt_android";
            c = "scheme_global_cart_mt_android";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            b = "scheme_order_confirm_dp_android";
            c = "scheme_global_cart_dp_android";
        } else {
            b = "scheme_order_confirm_android";
            c = "scheme_global_cart_android";
        }
    }

    public static String a(d dVar) {
        String str;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41d974b15e775388223dfb913af41cd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41d974b15e775388223dfb913af41cd3");
        }
        String json = dVar != null ? new GsonBuilder().excludeFieldsWithModifiers(128).registerTypeAdapter(d.class, new SubmitOrderParamAdaptor()).create().toJson(dVar) : null;
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

    public static String a(GlobalCart globalCart, a.EnumC0947a enumC0947a, int i, String str) {
        String str2;
        Object[] objArr = {globalCart, enumC0947a, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4687cd67c5ae0f7bbf05c7ad0035305c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4687cd67c5ae0f7bbf05c7ad0035305c");
        }
        String json = globalCart != null ? new GsonBuilder().registerTypeAdapter(GlobalCart.class, new GlobalCartAdaptor(enumC0947a, str, i)).create().toJson(globalCart) : null;
        if (TextUtils.isEmpty(json)) {
            return json;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str2 = "imeituan://www.meituan.com";
        } else {
            str2 = com.sankuai.waimai.foundation.core.a.f() ? "dianping://waimai.dianping.com" : com.sankuai.waimai.foundation.router.interfaces.b.c;
        }
        return str2 + "/confirm/order?data=" + json;
    }

    public static String a(List<GlobalCart> list, a.EnumC0947a enumC0947a, int i, String str) {
        String str2;
        Object[] objArr = {list, enumC0947a, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fffcc41a2be10a2f41980dafebeaf118", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fffcc41a2be10a2f41980dafebeaf118");
        }
        if (list != null && list.size() != 0) {
            str3 = new GsonBuilder().registerTypeAdapter(new TypeToken<List<GlobalCart>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.SchemeFactory.1
            }.getType(), new GlobalCartsAdaptor(enumC0947a, str, i)).create().toJson(list, new TypeToken<List<GlobalCart>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.SchemeFactory.2
            }.getType());
        }
        if (TextUtils.isEmpty(str3)) {
            return str3;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str2 = "imeituan://www.meituan.com";
        } else {
            str2 = com.sankuai.waimai.foundation.core.a.f() ? "dianping://waimai.dianping.com" : com.sankuai.waimai.foundation.router.interfaces.b.c;
        }
        return str2 + "/confirm/order?is_cross=true&data=" + str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class GlobalCartsAdaptor extends TypeAdapter<List<GlobalCart>> {
        public static ChangeQuickRedirect a;
        private a.EnumC0947a b;
        private String c;
        private int d;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ List<GlobalCart> read(JsonReader jsonReader) throws IOException {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x015e A[LOOP:2: B:43:0x0158->B:45:0x015e, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ void write(com.google.gson.stream.JsonWriter r13, java.util.List<com.sankuai.waimai.globalcart.model.GlobalCart> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.transfer.SchemeFactory.GlobalCartsAdaptor.write(com.google.gson.stream.JsonWriter, java.lang.Object):void");
        }

        public GlobalCartsAdaptor(a.EnumC0947a enumC0947a, String str, int i) {
            Object[] objArr = {enumC0947a, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae5433a813ee7aba41f92f98438e7e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae5433a813ee7aba41f92f98438e7e5");
                return;
            }
            this.b = enumC0947a;
            this.c = str;
            this.d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class GlobalCartAdaptor extends TypeAdapter<GlobalCart> {
        public static ChangeQuickRedirect a;
        private a.EnumC0947a b;
        private String c;
        private int d;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ GlobalCart read(JsonReader jsonReader) throws IOException {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x019b A[LOOP:1: B:36:0x0195->B:38:0x019b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ void write(com.google.gson.stream.JsonWriter r13, com.sankuai.waimai.globalcart.model.GlobalCart r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 575
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.transfer.SchemeFactory.GlobalCartAdaptor.write(com.google.gson.stream.JsonWriter, java.lang.Object):void");
        }

        public GlobalCartAdaptor(a.EnumC0947a enumC0947a, String str, int i) {
            Object[] objArr = {enumC0947a, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa134960af77880ed3c977a1b4a70cf6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa134960af77880ed3c977a1b4a70cf6");
                return;
            }
            this.b = enumC0947a;
            this.c = str;
            this.d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SubmitOrderParamAdaptor extends TypeAdapter<d> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ d read(JsonReader jsonReader) throws IOException {
            return null;
        }

        public SubmitOrderParamAdaptor() {
        }

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, d dVar) throws IOException {
            d dVar2 = dVar;
            Object[] objArr = {jsonWriter, dVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60ba2dd1e9edfb6b84edd29a1c37189", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60ba2dd1e9edfb6b84edd29a1c37189");
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("poi_id").value(dVar2.d);
            jsonWriter.name(FoodDetailNetWorkPreLoader.URI_POI_STR).value(dVar2.e);
            jsonWriter.name("source_type").value(dVar2.o);
            jsonWriter.name("business_type_from_restaurant").value(dVar2.m);
            jsonWriter.name("page_from").value(dVar2.j);
            jsonWriter.name(PackageLoadReporter.LoadType.LOCAL);
            jsonWriter.beginObject();
            jsonWriter.name(AgainManager.EXTRA_POI_NAME).value(dVar2.i);
            jsonWriter.name("self_delivery").value(dVar2.f);
            jsonWriter.name(OtherVerifyTypeConstants.REQUEST_CODE).value(dVar2.k);
            jsonWriter.name("login_from").value(com.sankuai.waimai.bussiness.order.transfer.single.d.a(dVar2.l));
            jsonWriter.name("tag").value(dVar2.h);
            jsonWriter.name("business_scene").value(dVar2.p);
            jsonWriter.name("is_from_mt_other_channel").value(dVar2.n);
            jsonWriter.name("common_param").jsonValue(dVar2.v);
            jsonWriter.endObject();
            jsonWriter.name("transfer");
            jsonWriter.beginObject();
            jsonWriter.name("allowance_alliance_scenes").value(dVar2.q);
            String str = dVar2.r;
            if (!TextUtils.isEmpty(str)) {
                if (!str.equals(Uri.decode(str))) {
                    str = Uri.decode(str);
                }
                jsonWriter.name("ad_activity_flag").jsonValue(str);
            }
            jsonWriter.name("cart_recommend_coupon_info").value(dVar2.t);
            jsonWriter.name("goods_coupon_view_id").value(dVar2.s);
            jsonWriter.name("coupon_view_id").value(dVar2.w);
            jsonWriter.name("ap_params").jsonValue(new Gson().toJson(dVar2.u));
            jsonWriter.endObject();
            jsonWriter.endObject();
        }
    }

    public static int a(String str) {
        com.sankuai.waimai.platform.domain.core.shop.a a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94964a2896ffce535b64d3e908119e62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94964a2896ffce535b64d3e908119e62")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray(PushConstants.INTENT_ACTIVITY_NAME);
            int i = 0;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    String optString = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString) && (a2 = com.sankuai.waimai.platform.domain.core.shop.a.a(optString)) != null && "plus_discount".equals(a2.b)) {
                        i = a2.c;
                    }
                } catch (Exception unused) {
                    return i;
                }
            }
            return i;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "508d6bcb8bde1bdbb27a2e7844780075", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "508d6bcb8bde1bdbb27a2e7844780075");
        }
        JSONArray jSONArray = new JSONArray();
        if (i2 > 0) {
            jSONArray.put(new com.sankuai.waimai.platform.domain.core.shop.a("plus_discount", i2).a());
        }
        JSONObject jSONObject = new JSONObject();
        if (jSONArray.length() > 0) {
            try {
                jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            jSONObject.put("groupChatShare", str);
            jSONObject.put("seckill", i);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
