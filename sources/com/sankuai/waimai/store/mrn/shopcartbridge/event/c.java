package com.sankuai.waimai.store.mrn.shopcartbridge.event;

import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends k {
    public String a;
    public final boolean b;
    public final GoodsSpu c;
    public final GoodsSku d;

    public c(String str, String str2, String str3, boolean z, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        super(str, str2);
        this.a = str3;
        this.b = z;
        this.c = goodsSpu;
        this.d = goodsSku;
    }

    public c(String str, String str2, boolean z, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        this(str, "", str2, z, goodsSpu, goodsSku);
    }
}
