package com.meituan.passport.utils;

import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.pojo.LoginConfigResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private static o f;
    public ArrayList<String> b;
    public boolean c;
    com.meituan.passport.plugins.o d;
    public boolean e;

    public static o a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f1aa5832e80d399e03e7f8d91dfecfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f1aa5832e80d399e03e7f8d91dfecfb");
        }
        if (f == null) {
            f = new o();
        }
        return f;
    }

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe03d1b02997dad54a81918a557212f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe03d1b02997dad54a81918a557212f9");
            return;
        }
        this.b = null;
        this.c = false;
        this.e = true;
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06e3a95ecd14534ea4809d78de5f474f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06e3a95ecd14534ea4809d78de5f474f");
            return;
        }
        String m = PassportConfig.m();
        if (TextUtils.isEmpty(m)) {
            return;
        }
        s.b().requestLoginConfigs(m).a(new com.sankuai.meituan.retrofit2.f<LoginConfigResult>() { // from class: com.meituan.passport.utils.o.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<LoginConfigResult> call, Response<LoginConfigResult> response) {
                ArrayList<String> arrayList;
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a53d540c83517c4c534bb8dbf84558d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a53d540c83517c4c534bb8dbf84558d2");
                    return;
                }
                if ((response == null || !response.f() || response.e() == null) ? false : true) {
                    LoginConfigResult e = response.e();
                    o oVar = o.this;
                    o oVar2 = o.this;
                    Object[] objArr3 = {e};
                    ChangeQuickRedirect changeQuickRedirect3 = o.a;
                    if (PatchProxy.isSupport(objArr3, oVar2, changeQuickRedirect3, false, "9b62e0e97742c1ead02f5404cae74515", RobustBitConfig.DEFAULT_VALUE)) {
                        arrayList = (ArrayList) PatchProxy.accessDispatch(objArr3, oVar2, changeQuickRedirect3, false, "9b62e0e97742c1ead02f5404cae74515");
                    } else if (e == null || e.list == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>();
                        ArrayList<LoginConfigResult.EntryData> arrayList2 = e.list;
                        for (int i = 0; i < arrayList2.size(); i++) {
                            LoginConfigResult.EntryData entryData = arrayList2.get(i);
                            if (entryData != null && !TextUtils.isEmpty(entryData.name)) {
                                arrayList.add(entryData.name);
                            }
                        }
                    }
                    oVar.b = arrayList;
                    o.this.c = true;
                    if (com.meituan.passport.b.a()) {
                        System.out.println("LoginActivity-->LoginDynamicConfigUtil: request success!!");
                    }
                    if (e.switchData != null) {
                        o.this.e = e.switchData.passwordLogin;
                    }
                    n.a("LoginDynamicConfigUtil.requestLoginDynamicConfig", "response succeed", e.toString());
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<LoginConfigResult> call, Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1675d3bfd8a97e4da3b19fa5e88c33d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1675d3bfd8a97e4da3b19fa5e88c33d5");
                } else {
                    n.a("LoginDynamicConfigUtil.requestLoginDynamicConfig", "response error", th != null ? th.getMessage() : "");
                }
            }
        });
    }
}
