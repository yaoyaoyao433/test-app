package com.meituan.passport.exception.monitor;

import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d implements c<User> {
    public static ChangeQuickRedirect c;
    private int a;

    public d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060df4bd46120c94f0d1202daa82ef5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060df4bd46120c94f0d1202daa82ef5b");
            return;
        }
        this.a = 0;
        this.a = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.passport.exception.monitor.c
    public void a(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e825964789284ace2a65f68c3998806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e825964789284ace2a65f68c3998806");
            return;
        }
        b a = b.a();
        String a2 = a();
        Object[] objArr2 = {a2, "success"};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "71914629a23fa02b2cdfe44887acfcf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "71914629a23fa02b2cdfe44887acfcf7");
        } else {
            Sniffer.normal(a.c(), a2, "success");
        }
    }

    @Override // com.meituan.passport.exception.monitor.c
    public final void a(Throwable th) {
        String str;
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8c731a7876f59f08e19c486fce4352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8c731a7876f59f08e19c486fce4352");
            return;
        }
        b a = b.a();
        String a2 = a();
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bff0adbbf5ad032901b0cea44cbc324", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bff0adbbf5ad032901b0cea44cbc324");
        } else if (th == null) {
            str = "unknown_exception";
        } else if (th instanceof com.meituan.passport.exception.a) {
            str = "cancel_exception";
        } else {
            str = th instanceof ApiException ? "api_exception" : "system_exception";
        }
        a.a(a2, str);
    }

    private String a() {
        int i = this.a;
        return i != 100 ? i != 200 ? i != 300 ? i != 400 ? "unknown_login" : "sso_login" : "other_login" : "dynamic_login" : "account_login";
    }
}
