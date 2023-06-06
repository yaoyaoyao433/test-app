package com.sankuai.waimai.store.platform.marketing;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    private String d;

    public a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "152e47cd612a726cd5b4c945b96ae18b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "152e47cd612a726cd5b4c945b96ae18b");
            return;
        }
        this.b = str;
        this.d = str2;
        this.c = str3;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5baae3d9e5d89ebaed0d68eb2c02f714", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5baae3d9e5d89ebaed0d68eb2c02f714") : t.a(this.d) ? this.b : this.d;
    }
}
