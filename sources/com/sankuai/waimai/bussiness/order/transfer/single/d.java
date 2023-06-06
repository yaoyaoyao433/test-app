package com.sankuai.waimai.bussiness.order.transfer.single;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    @SerializedName("transfer")
    JsonObject b;
    @SerializedName("poi_id")
    long c;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    String d;
    @SerializedName("source_type")
    public int e;
    @SerializedName(alternate = {"business_type_from_restaurant"}, value = "business_type")
    int f;
    @SerializedName("page_from")
    public String g;
    @SerializedName("sub_biz_type")
    public int h;
    @SerializedName(PackageLoadReporter.LoadType.LOCAL)
    private JsonObject i;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dd974f15028f15a7b7a877c9bb3ce5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dd974f15028f15a7b7a877c9bb3ce5");
            return;
        }
        this.c = -1L;
        this.d = "";
        this.e = 15;
        this.f = 0;
    }

    private JsonPrimitive b(int i, String str) {
        JsonElement jsonElement;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd7d4ba468329324c4197e661e2842d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonPrimitive) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd7d4ba468329324c4197e661e2842d");
        }
        if (i == 1 && this.i != null) {
            jsonElement = this.i.get(str);
        } else {
            jsonElement = (i != 2 || this.b == null) ? null : this.b.get(str);
        }
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return null;
        }
        return jsonElement.getAsJsonPrimitive();
    }

    public final JsonPrimitive a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b5c91b9055585952ffddfc6f0dbebf", RobustBitConfig.DEFAULT_VALUE) ? (JsonPrimitive) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b5c91b9055585952ffddfc6f0dbebf") : b(1, str);
    }

    public final JsonPrimitive b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3102e37aa5683ff7b9591c35ede51e1", RobustBitConfig.DEFAULT_VALUE) ? (JsonPrimitive) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3102e37aa5683ff7b9591c35ede51e1") : b(2, str);
    }

    private <T> T a(int i, String str, Type type) {
        Object[] objArr = {2, str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60aca1311b9ad96e8359f38370e7e29f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60aca1311b9ad96e8359f38370e7e29f");
        }
        JsonElement jsonElement = this.b != null ? this.b.get(str) : null;
        if (jsonElement == null || !(jsonElement.isJsonObject() || jsonElement.isJsonArray())) {
            return null;
        }
        return (T) new Gson().fromJson(jsonElement, type);
    }

    public final JsonElement a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9bb648a4eb4f03f8a2e04117360dbec", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9bb648a4eb4f03f8a2e04117360dbec");
        }
        if (i == 1 && this.i != null) {
            return this.i.get(str);
        }
        if (i != 2 || this.b == null) {
            return null;
        }
        return this.b.get(str);
    }

    public final <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68177b60b0f4e90b15d647be8fe61f1", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68177b60b0f4e90b15d647be8fe61f1") : (T) a(2, str, type);
    }

    public final int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d500191f309c7231bd7560219b1a20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d500191f309c7231bd7560219b1a20")).intValue();
        }
        if (this.i == null || !this.i.has(str) || this.i.get(str).isJsonNull()) {
            return (this.b == null || !this.b.has(str) || this.b.get(str).isJsonNull()) ? -1 : 2;
        }
        return 1;
    }

    public final JsonObject a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06e69d8aa548d81d598128dba703c10", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06e69d8aa548d81d598128dba703c10");
        }
        JsonObject jsonObject = null;
        if (this.b != null && this.b != null && this.b.size() > 0) {
            jsonObject = this.b.deepCopy();
            for (String str : strArr) {
                if (jsonObject.has(str)) {
                    jsonObject.remove(str);
                }
            }
        }
        return jsonObject;
    }

    public static int a(a.EnumC0947a enumC0947a) {
        Object[] objArr = {enumC0947a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "794d15bee1b1184a5d701961fd1375a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "794d15bee1b1184a5d701961fd1375a7")).intValue();
        }
        if (enumC0947a == null) {
            return 0;
        }
        switch (enumC0947a) {
            case NONE:
                return 0;
            case FROM_COLLECT:
                return 1;
            case FROM_COUPON:
                return 2;
            case FROM_PRODUCT_LIST_PREORDER:
                return 3;
            case FROM_ORDER_LIST_PREORDER:
                return 4;
            case FROM_ORDER_DETAIL_PREORDER:
                return 5;
            case FROM_RETAIL_JSBRIDGE:
                return 6;
            case FROM_GLOBAL_SHOP_CART:
                return 7;
            case FROM_SMART_ASSISTANT:
                return 8;
            case FROM_COMPOSE_ORDER:
                return 9;
            case FROM_TODAY_RECOMMEND:
                return 10;
            default:
                return 0;
        }
    }

    public static a.EnumC0947a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7067e8a3d289da5d8ed9c3e5d46577af", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.EnumC0947a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7067e8a3d289da5d8ed9c3e5d46577af");
        }
        switch (i) {
            case 0:
                return a.EnumC0947a.NONE;
            case 1:
                return a.EnumC0947a.FROM_COLLECT;
            case 2:
                return a.EnumC0947a.FROM_COUPON;
            case 3:
                return a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER;
            case 4:
                return a.EnumC0947a.FROM_ORDER_LIST_PREORDER;
            case 5:
                return a.EnumC0947a.FROM_ORDER_DETAIL_PREORDER;
            case 6:
                return a.EnumC0947a.FROM_RETAIL_JSBRIDGE;
            case 7:
                return a.EnumC0947a.FROM_GLOBAL_SHOP_CART;
            case 8:
                return a.EnumC0947a.FROM_SMART_ASSISTANT;
            case 9:
                return a.EnumC0947a.FROM_COMPOSE_ORDER;
            case 10:
                return a.EnumC0947a.FROM_TODAY_RECOMMEND;
            default:
                return a.EnumC0947a.NONE;
        }
    }
}
