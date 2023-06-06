package com.sankuai.meituan.model.dao.region;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RegionDef {
    public static ChangeQuickRedirect changeQuickRedirect;
    String fullname;
    Long id;
    Integer level;
    String name;

    public RegionDef() {
    }

    public RegionDef(Long l, String str, Integer num, String str2) {
        Object[] objArr = {l, str, num, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a00fb0cc5466ed31c99e1d9f84f6708", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a00fb0cc5466ed31c99e1d9f84f6708");
            return;
        }
        this.id = l;
        this.name = str;
        this.level = num;
        this.fullname = str2;
    }
}
