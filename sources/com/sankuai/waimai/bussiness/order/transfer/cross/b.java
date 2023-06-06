package com.sankuai.waimai.bussiness.order.transfer.cross;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.CrossOrderPoiParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.request.d;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.bussiness.order.transfer.base.a<String, d.a> {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.a
    public final /* synthetic */ d.a a(@Nullable String str, @Nullable AddressItem addressItem) {
        List<PoiOrderParam> list;
        String str2 = str;
        Object[] objArr = {str2, addressItem};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a9744e489a99605038149ddc2fedf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (d.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a9744e489a99605038149ddc2fedf7");
        }
        JsonObject jsonObject = (JsonObject) new Gson().fromJson(str2, (Class<Object>) JsonObject.class);
        String str3 = "";
        if (jsonObject.has("page_from") && jsonObject.get("page_from").isJsonPrimitive()) {
            str3 = jsonObject.get("page_from").getAsString();
        }
        JsonArray jsonArray = (JsonArray) jsonObject.get("orders");
        if (com.sankuai.waimai.business.order.api.submit.constants.a.c(str3)) {
            list = com.sankuai.waimai.business.order.submit.b.a((List) new Gson().fromJson(jsonArray, new TypeToken<List<CrossOrderPoiParam>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.cross.b.1
            }.getType()));
        } else {
            list = (List) new Gson().fromJson(jsonArray, new TypeToken<List<PoiOrderParam>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.cross.b.2
            }.getType());
        }
        return new d.a().a(PoiAddressParam.formAddress(addressItem)).a(list);
    }
}
