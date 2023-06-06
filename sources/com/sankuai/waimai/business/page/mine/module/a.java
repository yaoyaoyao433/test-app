package com.sankuai.waimai.business.page.mine.module;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.utils.cache.b<com.sankuai.waimai.business.page.mine.model.b> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.platform.utils.cache.b
    @NonNull
    public final /* synthetic */ com.sankuai.waimai.business.page.mine.model.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b750bb0040abff44ca96ce4d1d58683", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.page.mine.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b750bb0040abff44ca96ce4d1d58683") : new com.sankuai.waimai.business.page.mine.model.b();
    }

    public a() {
        super(com.sankuai.waimai.business.page.mine.model.b.class, "new_mine_data");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccf83bc0213e49f6b6eddaa31a9f9956", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccf83bc0213e49f6b6eddaa31a9f9956");
        }
    }
}
