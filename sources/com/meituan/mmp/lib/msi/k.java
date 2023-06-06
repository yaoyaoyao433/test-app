package com.meituan.mmp.lib.msi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements com.meituan.msi.provider.f {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.config.a b;

    @Override // com.meituan.msi.provider.f
    public final long c() {
        return 10485760L;
    }

    public k(com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca7f7acca6fd61f13545dc40697a312f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca7f7acca6fd61f13545dc40697a312f");
            return;
        }
        this.b = null;
        this.b = aVar;
    }

    @Override // com.meituan.msi.provider.f
    public final SharedPreferences a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ebefb081a8c8439eb7c15486dec984", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ebefb081a8c8439eb7c15486dec984") : MMPEnvHelper.getSharedPreferences(MMPEnvHelper.getContext(), str);
    }

    @Override // com.meituan.msi.provider.f
    public final SharedPreferences a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598e265b0754db98fd6411ecafe0cc94", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598e265b0754db98fd6411ecafe0cc94");
        }
        return MMPEnvHelper.getSharedPreferences(MMPEnvHelper.getContext(), b());
    }

    @Override // com.meituan.msi.provider.f
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e7d48d4d7238e1e7bb4935871d6ed2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e7d48d4d7238e1e7bb4935871d6ed2");
        }
        if (this.b == null) {
            return null;
        }
        return !TextUtils.isEmpty(this.b.b()) ? String.format("mmp_%s%s", this.b.c(), this.b.b()) : String.format("mmp_%s", this.b.c());
    }
}
