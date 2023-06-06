package com.meituan.msc.modules.api.msi.env;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.msi.location.b {
    public static ChangeQuickRedirect a;
    private final com.meituan.msc.modules.api.map.b b;

    public d(com.meituan.msc.modules.api.map.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee979da4b32e83c3cf7ce558858a70c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee979da4b32e83c3cf7ce558858a70c0");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.meituan.msi.location.b
    public final void a(@NonNull final com.meituan.msi.location.a aVar, @NonNull String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b48a0a418592f14f09eafe06ab54a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b48a0a418592f14f09eafe06ab54a63");
        } else {
            this.b.a(new com.meituan.msc.modules.api.map.a() { // from class: com.meituan.msc.modules.api.msi.env.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.api.map.a
                public final void a(int i, com.meituan.msi.api.location.a aVar2, String str2) {
                    Object[] objArr2 = {Integer.valueOf(i), aVar2, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74f90fedb915f4a1048586218541ccd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74f90fedb915f4a1048586218541ccd2");
                    } else {
                        aVar.a(i, aVar2, str2);
                    }
                }
            }, str);
        }
    }

    @Override // com.meituan.msi.location.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e32e8aa55c3ece22ffe630b37260f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e32e8aa55c3ece22ffe630b37260f0");
        } else {
            this.b.a();
        }
    }
}
