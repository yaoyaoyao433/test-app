package com.sankuai.waimai.bussiness.order.confirm.remark;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    public boolean b;
    private String c;
    private long d;
    private String e;

    public a(String str, long j, String str2, boolean z) {
        Object[] objArr = {str, new Long(j), str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c19422b809f2b56e4e59b29aac3e44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c19422b809f2b56e4e59b29aac3e44");
            return;
        }
        this.c = str;
        this.d = j;
        this.e = str2;
        this.b = false;
    }

    public static boolean a(a aVar, a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e9b3dedce2d4dab53d30e39b867a58c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e9b3dedce2d4dab53d30e39b867a58c")).booleanValue() : aVar != null && aVar2 != null && aVar.e.equals(aVar2.e) && aVar.c.equals(aVar2.c) && aVar.d == aVar2.d;
    }
}
