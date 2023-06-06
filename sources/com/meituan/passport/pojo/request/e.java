package com.meituan.passport.pojo.request;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends c {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<String> b;
    public com.meituan.passport.clickaction.d<String> c;
    public com.meituan.passport.clickaction.d<String> i;
    public com.meituan.passport.clickaction.d<String> j;
    public com.meituan.passport.clickaction.d<String> k;
    public com.meituan.passport.clickaction.d<String> l;
    public com.meituan.passport.clickaction.d<String> m;

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        return (this.c == null || this.b == null || this.i == null) ? false : true;
    }

    @Override // com.meituan.passport.pojo.request.c, com.meituan.passport.pojo.request.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9922fbf8c7ba73e5459cf8b471a5f96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9922fbf8c7ba73e5459cf8b471a5f96");
            return;
        }
        super.a(map);
        a(map, Constant.KEY_COUNTRY_CODE, this.b.b());
        a(map, "encryptMobile", com.meituan.passport.encryption.a.b(this.c.b()));
        a(map, "encryptUser", com.meituan.passport.encryption.a.b(this.c.b()));
        a(map, "userTicket", this.i.b());
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a288f678707459c87545247db23d145e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a288f678707459c87545247db23d145e");
            return;
        }
        this.b.a();
        this.c.a();
        this.i.a();
    }
}
