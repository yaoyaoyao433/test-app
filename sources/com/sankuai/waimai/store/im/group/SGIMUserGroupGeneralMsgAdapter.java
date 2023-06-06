package com.sankuai.waimai.store.im.group;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.im.base.SGIMBaseGeneralMsgAdapter;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.waimai.store.im.poi.provider.i;
import com.sankuai.waimai.store.im.provider.b;
import com.sankuai.waimai.store.im.provider.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupGeneralMsgAdapter extends SGIMBaseGeneralMsgAdapter {
    public static ChangeQuickRedirect e;
    private a f;
    private String g;
    private com.sankuai.waimai.store.im.poi.contract.a h;
    private SGCommonDataInfo i;

    public SGIMUserGroupGeneralMsgAdapter(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, a aVar2, String str, SGCommonDataInfo sGCommonDataInfo, com.sankuai.waimai.store.im.poi.contract.a aVar3) {
        super(aVar, bundle);
        Object[] objArr = {aVar, bundle, aVar2, str, sGCommonDataInfo, aVar3};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025213068915cb902849ddbd92419074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025213068915cb902849ddbd92419074");
            return;
        }
        this.f = aVar2;
        this.g = str;
        this.h = aVar3;
        this.i = sGCommonDataInfo;
    }

    @Override // com.sankuai.waimai.store.im.base.SGIMBaseGeneralMsgAdapter
    public final void a() {
        int a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12cc60f0bfc3761c27577e0fab5ea422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12cc60f0bfc3761c27577e0fab5ea422");
            return;
        }
        this.d.put(0, new b(this.b, this.c, this.f));
        this.d.put(104, new d(this.b, this.c, this.g, this.h));
        this.d.put(128, new com.sankuai.waimai.store.im.poi.provider.d());
        this.d.put(129, new i(this.b, this.c, true, 129, this.h.s()));
        if (this.i == null || !this.i.isUserDynamic || com.sankuai.waimai.foundation.utils.b.b(this.i.mIMDynamicCards)) {
            return;
        }
        for (SGCommonDataInfo.IMDynamicCard iMDynamicCard : this.i.mIMDynamicCards) {
            if (iMDynamicCard != null && (a = r.a(iMDynamicCard.msgCode, 0)) != 0 && TextUtils.equals(iMDynamicCard.nativeId, "mach")) {
                this.d.put(Integer.valueOf(a), new com.sankuai.waimai.store.im.poi.provider.b(this.b, null, r.a(this.h.r(), 0L), iMDynamicCard, this.h));
            }
        }
    }
}
