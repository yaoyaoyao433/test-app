package com.sankuai.waimai.store.goods.list.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.HashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpecModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long bottomHeight;
    public String bridge_config_extra;
    public String cid;
    public long food_sku_id;
    public GoodsSpu goods_spu;
    public String pay_sdk_version;
    public long poi_id;
    public String poi_id_str;
    public String poi_info;
    public HashMap<Long, Integer> shop_cart;
    public int show_type = 0;
    public String unique_stype = "";

    public SpecModel(GoodsSpu goodsSpu, String str, long j, String str2, HashMap<Long, Integer> hashMap, long j2) {
        this.goods_spu = goodsSpu;
        this.cid = str;
        this.poi_id = j;
        this.poi_id_str = str2;
        this.shop_cart = hashMap;
        this.bottomHeight = j2;
    }
}
