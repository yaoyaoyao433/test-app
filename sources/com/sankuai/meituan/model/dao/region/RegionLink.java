package com.sankuai.meituan.model.dao.region;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RegionLink {
    public static ChangeQuickRedirect changeQuickRedirect;
    Long fromid;
    Long id;
    Integer level;
    Long toid;

    public RegionLink() {
    }

    public RegionLink(Long l, Long l2, Long l3, Integer num) {
        Object[] objArr = {l, l2, l3, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e61b2f7e8b92f42939fd0ed16fb4683f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e61b2f7e8b92f42939fd0ed16fb4683f");
            return;
        }
        this.id = l;
        this.fromid = l2;
        this.toid = l3;
        this.level = num;
    }
}
