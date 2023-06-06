package com.meituan.passport.pojo.request;

import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends b {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<String> b;
    public com.meituan.passport.clickaction.d<String> c;
    public com.meituan.passport.clickaction.d<String> h;
    public com.meituan.passport.clickaction.d<String> i;
    public com.meituan.passport.clickaction.d<String> j;
    public com.meituan.passport.clickaction.d<String> k;

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227df96b0fa17cb8d0e24bf82e81dc76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227df96b0fa17cb8d0e24bf82e81dc76")).booleanValue() : (!super.a() || this.b == null || this.c == null || this.h == null || this.i == null || this.j == null || this.k == null) ? false : true;
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d71886aee757d9f27f14a0d613a324cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d71886aee757d9f27f14a0d613a324cd");
            return;
        }
        super.a(map);
        a(map, "encryptMobile", com.meituan.passport.encryption.a.b(this.b.b()));
        a(map, Constant.KEY_COUNTRY_CODE, this.c.b());
        a(map, "pwd", this.k.b());
        a(map, "ticket", this.h.b());
        a(map, OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.i.b());
        a(map, OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY, this.j.b());
    }
}
