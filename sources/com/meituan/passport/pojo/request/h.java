package com.meituan.passport.pojo.request;

import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends b {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<String> b;
    public com.meituan.passport.clickaction.d<String> c;
    public com.meituan.passport.clickaction.d<Integer> h;
    public com.meituan.passport.clickaction.d<String> i;
    public com.meituan.passport.clickaction.d<String> j;
    public com.meituan.passport.clickaction.d<String> k;

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        return true;
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a596ab2ede1ca0714946aeeb66763b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a596ab2ede1ca0714946aeeb66763b4e");
            return;
        }
        a(map, "token", this.b.b());
        a(map, "unionid", this.c.b());
        a(map, "type", this.h.b());
        if (this.i != null) {
            a(map, GearsLocator.DETAIL, this.i.b());
        }
        if (this.j != null) {
            a(map, "newToken", this.j.b());
        }
        if (this.k != null) {
            a(map, "oldToken", this.k.b());
        }
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88299d54f01bc62a8e8b3c8247dd070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88299d54f01bc62a8e8b3c8247dd070");
            return;
        }
        this.b.a();
        this.c.a();
        this.h.a();
    }
}
