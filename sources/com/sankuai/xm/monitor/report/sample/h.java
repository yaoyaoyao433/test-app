package com.sankuai.xm.monitor.report.sample;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h implements d {
    public static ChangeQuickRedirect a;
    public long b;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c16943a7e42a2e10b4b80867b5427d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c16943a7e42a2e10b4b80867b5427d");
        } else {
            this.b = LocationStrategy.LOCATION_TIMEOUT;
        }
    }

    @Override // com.sankuai.xm.monitor.report.sample.d
    public final f a() {
        return f.TIME;
    }
}
