package com.sankuai.waimai.store.drug.home.refactor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.shangou.stone.util.t;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiLocationAddress {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String address;
    public boolean isRefreshData;

    public PoiLocationAddress(String str, boolean z) {
        this.address = t.a(str) ? "未知地址" : str;
        this.isRefreshData = z;
    }
}
