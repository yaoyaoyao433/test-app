package com.meituan.android.cipstorage;

import com.meituan.android.cipstorage.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends j.c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.j.c
    public final String a() {
        return "report.detail";
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final boolean a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edcb9897353b7c49a88dee20a937aa60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edcb9897353b7c49a88dee20a937aa60")).booleanValue() : v.g != null && afVar.j();
    }

    @Override // com.meituan.android.cipstorage.j.c
    public final void b(af afVar) {
        boolean z;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a960acef5a53014e99913c1e6fa307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a960acef5a53014e99913c1e6fa307");
            return;
        }
        Object[] objArr2 = {afVar, null, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "68fe9accf1d303dbbc8b95abe02253b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "68fe9accf1d303dbbc8b95abe02253b3");
            return;
        }
        Object[] objArr3 = {(byte) 0, afVar};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "89add443a02ba6a2883e417f000c8a54", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "89add443a02ba6a2883e417f000c8a54")).booleanValue();
        } else {
            z = afVar.j() && new Random().nextDouble() < 0.06666666666666667d;
        }
        if (z) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("/internal", 1);
            hashMap3.put("/internal/cache/cips", 2);
            hashMap3.put("/internal/files/cips", 2);
            y.a(hashMap, hashMap3);
            long a2 = d.a(true, hashMap, null);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("/external", 1);
            hashMap4.put("/external/cache/cips", 2);
            hashMap4.put("/external/files/cips", 2);
            y.a(hashMap2, hashMap4);
            long a3 = d.a(false, hashMap2, null);
            long j = a2 + a3;
            d.a(null, "/internal", a2, j, "/", 1, 1);
            d.a(null, "/external", a3, j, "/", 1, 1);
        }
    }
}
