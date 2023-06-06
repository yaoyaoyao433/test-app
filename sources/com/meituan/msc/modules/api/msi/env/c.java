package com.meituan.msc.modules.api.msi.env;

import android.content.SharedPreferences;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.provider.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements f {
    public static ChangeQuickRedirect a;
    private h b;

    @Override // com.meituan.msi.provider.f
    public final long c() {
        return 10485760L;
    }

    public c(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "affe9b2e9d08284ea45f9eb16a713535", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "affe9b2e9d08284ea45f9eb16a713535");
            return;
        }
        this.b = null;
        this.b = hVar;
    }

    @Override // com.meituan.msi.provider.f
    public final SharedPreferences a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd71b14dbdc674393a2b7150d89b15b", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd71b14dbdc674393a2b7150d89b15b") : MSCEnvHelper.getSharedPreferences(MSCEnvHelper.getContext(), str);
    }

    @Override // com.meituan.msi.provider.f
    public final SharedPreferences a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a882dd0f2e4ea9aadb9a0eb3324908", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a882dd0f2e4ea9aadb9a0eb3324908");
        }
        return MSCEnvHelper.getSharedPreferences(MSCEnvHelper.getContext(), b());
    }

    @Override // com.meituan.msi.provider.f
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c609287cf67647d5f4ab043cf66c15", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c609287cf67647d5f4ab043cf66c15") : this.b == null ? ContainerInfo.ENV_MSC : this.b.d().f();
    }
}
