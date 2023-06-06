package com.sankuai.waimai.store.mrn.shopcartbridge.event;

import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends k {
    public com.sankuai.waimai.store.platform.domain.manager.poi.a a;
    public GoodsSpu b;
    public int c;

    public j(String str, String str2, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu) {
        super(str, str2);
        this.a = aVar;
        this.b = goodsSpu;
    }

    public j(String str, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu) {
        this(str, "", aVar, goodsSpu);
    }
}
