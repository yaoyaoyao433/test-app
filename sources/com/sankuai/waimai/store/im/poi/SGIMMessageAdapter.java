package com.sankuai.waimai.store.im.poi;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.prepare.g;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.im.poi.listener.d;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.waimai.store.im.poi.provider.e;
import com.sankuai.waimai.store.im.poi.provider.f;
import com.sankuai.waimai.store.im.poi.provider.h;
import com.sankuai.waimai.store.im.poi.provider.i;
import com.sankuai.waimai.store.im.poi.provider.j;
import com.sankuai.waimai.store.im.poi.provider.k;
import com.sankuai.waimai.store.im.poi.provider.l;
import com.sankuai.waimai.store.im.provider.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMMessageAdapter extends IMMessageAdapter {
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.store.im.poi.listener.a c;
    private d d;
    private long e;
    private com.sankuai.waimai.store.expose.v2.a f;
    private SGCommonDataInfo g;
    private com.sankuai.waimai.store.im.poi.contract.a h;

    public SGIMMessageAdapter(g gVar, com.sankuai.waimai.store.im.poi.listener.a aVar, d dVar, long j, com.sankuai.waimai.store.expose.v2.a aVar2, SGCommonDataInfo sGCommonDataInfo, com.sankuai.waimai.store.im.poi.contract.a aVar3) {
        super(gVar);
        Object[] objArr = {gVar, aVar, dVar, new Long(j), aVar2, sGCommonDataInfo, aVar3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "defef56fc331bbb52fa7a809f2676465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "defef56fc331bbb52fa7a809f2676465");
            return;
        }
        this.c = aVar;
        this.d = dVar;
        this.e = j;
        this.f = aVar2;
        this.g = sGCommonDataInfo;
        this.h = aVar3;
    }

    @Override // com.sankuai.waimai.business.im.common.message.IMMessageAdapter
    public final void a(Map<Integer, com.sankuai.waimai.business.im.common.message.d> map) {
        int a;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3052304f6b93eb189d81d21a4921d461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3052304f6b93eb189d81d21a4921d461");
            return;
        }
        Bundle bundle = new Bundle();
        if (this.h != null) {
            bundle.putInt("buz_type", this.h.v());
        }
        map.put(5, new com.sankuai.waimai.store.im.poi.provider.g());
        map.put(102, new com.sankuai.waimai.store.im.poi.provider.g());
        map.put(101, new com.sankuai.waimai.store.im.poi.provider.g());
        map.put(6, new k(this.c));
        map.put(7, new h());
        map.put(104, new c(null, null, this.h));
        map.put(103, new com.sankuai.waimai.store.im.poi.provider.d());
        map.put(105, new l());
        map.put(107, new e(this.d, this.e));
        map.put(120, new com.sankuai.waimai.store.im.poi.provider.c(this.f, null, this.e, this.h.s()));
        map.put(121, new f(this.f, bundle, this.e, this.h.s()));
        map.put(125, new com.sankuai.waimai.store.im.poi.provider.d());
        map.put(126, new i(this.f, null, false, 126, this.h.s()));
        map.put(127, new j(this.f, null, this.e, this.h.s()));
        map.put(128, new com.sankuai.waimai.store.im.poi.provider.d());
        map.put(129, new i(this.f, null, false, 129, this.h.s()));
        if (this.g == null || !this.g.isUserDynamic || b.b(this.g.mIMDynamicCards)) {
            return;
        }
        for (SGCommonDataInfo.IMDynamicCard iMDynamicCard : this.g.mIMDynamicCards) {
            if (iMDynamicCard != null && (a = r.a(iMDynamicCard.msgCode, 0)) != 0 && TextUtils.equals(iMDynamicCard.nativeId, "mach")) {
                map.put(Integer.valueOf(a), new com.sankuai.waimai.store.im.poi.provider.b(this.f, null, this.e, iMDynamicCard, this.h));
            }
        }
    }
}
