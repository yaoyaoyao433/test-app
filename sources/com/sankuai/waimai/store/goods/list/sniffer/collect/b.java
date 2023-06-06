package com.sankuai.waimai.store.goods.list.sniffer.collect;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.goods.list.sniffer.SGGoodListSnifferLogFoodModel;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import com.sankuai.waimai.store.util.w;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.monitor.b<RestMenuResponse> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.monitor.b
    public final void collect(String str, String str2, String str3, @NonNull BaseResponse<RestMenuResponse> baseResponse) {
        boolean z = false;
        Object[] objArr = {str, str2, str3, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf8da5bd1e416bec0bcdc79c93931c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf8da5bd1e416bec0bcdc79c93931c7");
            return;
        }
        if (baseResponse.code == 1 && !TextUtils.isEmpty(baseResponse.msg) && baseResponse.msg.contains("稍后再来")) {
            z = true;
        }
        if (baseResponse.code != 0 && !z) {
            SGGoodListSnifferLogFoodModel sGGoodListSnifferLogFoodModel = new SGGoodListSnifferLogFoodModel(str, str2, str3, baseResponse.data);
            SGStoreContentRender sGStoreContentRender = SGStoreContentRender.FoodReturnCodeException;
            String a2 = i.a(sGGoodListSnifferLogFoodModel);
            c.a(sGStoreContentRender, a2, "food接口:errorCode" + baseResponse.code);
        } else if (baseResponse.data == null || baseResponse.data.getPoi() == null) {
            c.a(SGStoreContentRender.FoodReturnCodeException, i.a(new SGGoodListSnifferLogFoodModel(str, str2, str3, baseResponse.data)), "food接口:data_empty");
        } else if (w.b(baseResponse.data.getPoi()) || !com.sankuai.shangou.stone.util.a.b(baseResponse.data.getmGoodPoiCategoryList())) {
        } else {
            c.a(baseResponse.data.getPoi().getBuzType() == 9 ? SGStoreContentRender.FoodDrugReturnEmptyData : SGStoreContentRender.FoodReturnEmptyData, i.a(new SGGoodListSnifferLogFoodModel(str, str2, str3, baseResponse.data)), "food接口:category_empty");
        }
    }
}
