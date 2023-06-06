package com.meituan.passport.pojo.request;

import android.support.annotation.RestrictTo;
import com.meituan.passport.pojo.Mobile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<Mobile> b;
    public com.meituan.passport.clickaction.d<String> c;

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        return (this.b == null || this.c == null) ? false : true;
    }

    @Override // com.meituan.passport.pojo.request.c, com.meituan.passport.pojo.request.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6638710c405f0ce34159e071afcc89c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6638710c405f0ce34159e071afcc89c");
            return;
        }
        super.a(map);
        a(map, "encryptUser", com.meituan.passport.encryption.a.b(this.b.b().number));
        a(map, Constant.KEY_COUNTRY_CODE, this.b.b().countryCode);
        a(map, "pwd", com.meituan.passport.encryption.a.a(this.c.b()));
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f221510effa0f45f6068ebae99c14aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f221510effa0f45f6068ebae99c14aa");
            return;
        }
        this.b.a();
        this.c.a();
    }
}
