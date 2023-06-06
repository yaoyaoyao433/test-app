package com.meituan.shadowsong.mss;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d<T> implements com.sankuai.meituan.retrofit2.f<T> {
    public static ChangeQuickRedirect a;

    public abstract void a(Response<T> response);

    public abstract void a(Throwable th);

    @Override // com.sankuai.meituan.retrofit2.f
    public final void onResponse(Call<T> call, Response<T> response) {
        Object[] objArr = {call, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e10dcd2371d313e2255fa03a5c6fa23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e10dcd2371d313e2255fa03a5c6fa23");
        } else if (response.b() != 200 && response.b() != 204 && response.b() != 205 && response.b() != 206) {
            StringBuilder sb = new StringBuilder();
            sb.append(response.b());
            a(new Exception(sb.toString()));
        } else {
            a(response);
        }
    }

    @Override // com.sankuai.meituan.retrofit2.f
    public final void onFailure(Call<T> call, Throwable th) {
        Object[] objArr = {call, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fffd0a7b579d067a5ee3a8a821d1ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fffd0a7b579d067a5ee3a8a821d1ad");
        } else {
            a(th);
        }
    }
}
