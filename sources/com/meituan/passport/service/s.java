package com.meituan.passport.service;

import com.meituan.passport.handler.resume.l;
import com.meituan.passport.pojo.Mobile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements l.a {
    public static ChangeQuickRedirect a;
    private final r b;
    private final String c;
    private final Mobile d;

    public s(r rVar, String str, Mobile mobile) {
        this.b = rVar;
        this.c = str;
        this.d = mobile;
    }

    @Override // com.meituan.passport.handler.resume.l.a
    public final rx.d a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49274043bedd20043b1a86b71b07e85b", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49274043bedd20043b1a86b71b07e85b") : r.b(this.b, this.c, this.d, str, str2);
    }
}
