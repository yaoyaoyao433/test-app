package com.sankuai.waimai.alita.core.feature.repo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;
    String c;
    public d d;
    public c e;
    private final String f;

    public b(@NonNull String str, @NonNull String str2, @NonNull h hVar) {
        Object[] objArr = {str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d749b4b2abd0d6af3bb4b33b7a1c88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d749b4b2abd0d6af3bb4b33b7a1c88");
            return;
        }
        this.f = str;
        this.c = str2;
        this.d = new d(this.f, str2);
        this.e = new c(this.f, str2, hVar);
    }

    @Override // com.sankuai.waimai.alita.core.feature.repo.a
    public final String a() {
        return this.c;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438c1ec6dabca7541c990aae83f08884", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438c1ec6dabca7541c990aae83f08884");
        }
        return "AlitaFeatureRepo{BIZ='" + this.f + "', mTableName='" + this.c + "', mMemRepo=" + this.d + ", mJSRepo=" + this.e + '}';
    }
}
