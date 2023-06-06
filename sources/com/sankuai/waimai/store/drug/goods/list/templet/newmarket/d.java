package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements c.a {
    public static ChangeQuickRedirect a;
    private final b b;
    private final SCBaseActivity c;

    public d(b bVar, SCBaseActivity sCBaseActivity) {
        this.b = bVar;
        this.c = sCBaseActivity;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6778653bf9bbed6fe40ad45098eca9d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6778653bf9bbed6fe40ad45098eca9d1");
        } else {
            b.a(this.b, this.c);
        }
    }
}
