package com.sankuai.xm.imui.session.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public long d;

    public a(int i, long j, long j2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d222ae59c4be4164bd7fe75ebcf174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d222ae59c4be4164bd7fe75ebcf174");
            return;
        }
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89aa7bdd3eff557f2c40d289e0e39460", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89aa7bdd3eff557f2c40d289e0e39460");
        }
        return "HistoryMsgQueryParam{mQueryType=" + this.b + ", mHistoryStartStamp=" + this.c + ", mHistoryEndStamp=" + this.d + '}';
    }
}
