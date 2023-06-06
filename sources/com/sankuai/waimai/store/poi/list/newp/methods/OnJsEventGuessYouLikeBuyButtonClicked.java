package com.sankuai.waimai.store.poi.list.newp.methods;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class OnJsEventGuessYouLikeBuyButtonClicked implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class GuessItemBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("add_shopping_cart_scheme")
        public String addShoppingCartScheme;
        @SerializedName("need_clear_shopcart")
        public boolean needClearShopcart = true;
        @SerializedName("poi_info")
        public Poi poiInfo;
        @SerializedName("product_spu_list")
        public List<GoodsSpu> spus;
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        GuessItemBean guessItemBean;
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab2639ae8dc988227615d057fa1377f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab2639ae8dc988227615d057fa1377f");
        } else if (map == null || map.size() == 0 || (guessItemBean = (GuessItemBean) com.sankuai.waimai.store.util.i.a(new JSONObject(map).toString(), GuessItemBean.class)) == null) {
        } else {
            a(aVar.a(), guessItemBean);
        }
    }

    private void a(Context context, @NonNull GuessItemBean guessItemBean) {
        Object[] objArr = {context, guessItemBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "871810f85ee500a7b530249a2a97ca7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "871810f85ee500a7b530249a2a97ca7b");
            return;
        }
        List<GoodsSpu> list = guessItemBean.spus;
        com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = new com.sankuai.waimai.store.platform.domain.manager.poi.a(guessItemBean.poiInfo);
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        if (guessItemBean.needClearShopcart) {
            com.sankuai.waimai.store.order.a.e().a(aVar.f(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
        }
        for (GoodsSpu goodsSpu : list) {
            if (!com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkus())) {
                GoodsSku goodsSku = goodsSpu.getSkus().get(0);
                arrayList.add(new OrderedFood(goodsSpu, goodsSku, null, goodsSku.minOrderCount));
            }
        }
        com.sankuai.waimai.store.order.a.e().a(aVar.f(), aVar.b);
        com.sankuai.waimai.store.order.a.e().a(aVar.f(), arrayList);
        com.sankuai.waimai.store.router.d.a(context, guessItemBean.addShoppingCartScheme);
    }
}
