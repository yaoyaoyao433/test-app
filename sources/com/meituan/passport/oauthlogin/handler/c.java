package com.meituan.passport.oauthlogin.handler;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.oauthlogin.handler.b;
import com.meituan.passport.pojo.YodaConfirmData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final b.AnonymousClass1 b;
    private final AccountApi c;
    private final String d;
    private final YodaConfirmData e;
    private final String f;
    private final FragmentActivity g;

    public c(b.AnonymousClass1 anonymousClass1, AccountApi accountApi, String str, YodaConfirmData yodaConfirmData, String str2, FragmentActivity fragmentActivity) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e78b44929ec62564a8189d33cd89a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e78b44929ec62564a8189d33cd89a04");
        } else {
            b.AnonymousClass1.a(this.b, this.c, this.d, this.e, this.f, this.g, (String) obj);
        }
    }
}
