package com.sankuai.waimai.store.mach;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class OrderNumFinderModule implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class Parameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("poi_id")
        public String poiID;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String poiIDStr;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "sg_order_num_finder";
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e57c6797a48de433e9aec0720c7a06", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e57c6797a48de433e9aec0720c7a06") : new String[]{"getOrderNumByPoiID"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Parameter parameter;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c63b514cf90044f55a461e3d3360fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c63b514cf90044f55a461e3d3360fd");
        } else if (!"getOrderNumByPoiID".equals(str) || t.a(str2) || (parameter = (Parameter) i.a(str2, new TypeToken<Parameter>() { // from class: com.sankuai.waimai.store.mach.OrderNumFinderModule.1
        }.getType())) == null || aVar == null) {
        } else {
            String str4 = !t.a(parameter.poiIDStr) ? parameter.poiIDStr : parameter.poiID;
            if (com.sankuai.waimai.store.platform.domain.manager.poi.a.b(str4)) {
                CallbackInfo callbackInfo = new CallbackInfo();
                callbackInfo.orderNum = com.sankuai.waimai.foundation.core.service.globalcart.a.a().getOrderedNum(str4);
                Response response = new Response();
                response.data = callbackInfo;
                aVar.a(str3, i.a(response));
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class CallbackInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("order_num")
        public int orderNum;

        public CallbackInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class Response {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackInfo data;
        public int status;

        public Response() {
            this.status = 0;
        }
    }
}
