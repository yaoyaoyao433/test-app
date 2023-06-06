package com.sankuai.waimai.business.page.home.head.banner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.domain.core.ad.Ad;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public ArrayList<Ad> b;
    public Ad.d c;

    public b(ArrayList<Ad> arrayList, Ad.d dVar) {
        Object[] objArr = {arrayList, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d9a4f0e9dcfaed0e8e95b860436777", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d9a4f0e9dcfaed0e8e95b860436777");
            return;
        }
        this.b = arrayList;
        this.c = dVar;
    }
}
