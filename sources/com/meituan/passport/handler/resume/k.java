package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.handler.resume.j;
import com.meituan.passport.pojo.YodaConfirmData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final j.AnonymousClass1 b;
    private final AccountApi c;
    private final String d;
    private final YodaConfirmData e;
    private final String f;
    private final FragmentActivity g;

    public k(j.AnonymousClass1 anonymousClass1, AccountApi accountApi, String str, YodaConfirmData yodaConfirmData, String str2, FragmentActivity fragmentActivity) {
        this.b = anonymousClass1;
        this.c = accountApi;
        this.d = str;
        this.e = yodaConfirmData;
        this.f = str2;
        this.g = fragmentActivity;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d513f51244afb2c5efc91e741b05944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d513f51244afb2c5efc91e741b05944");
        } else {
            j.AnonymousClass1.a(this.b, this.c, this.d, this.e, this.f, this.g, (String) obj);
        }
    }
}
