package com.meituan.android.mrn.codecache;

import com.meituan.android.mrn.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e implements Comparable<e> {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    long d;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        Object[] objArr = {eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7813d456690d6be2510472684d01ac2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7813d456690d6be2510472684d01ac2")).intValue();
        }
        if (eVar2 == this) {
            return 0;
        }
        if (eVar2 == null) {
            return -1;
        }
        int a2 = z.a(this.b, eVar2.b);
        return a2 != 0 ? a2 : com.meituan.android.mrn.utils.e.a(this.c, eVar2.c);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a254501f37cca28d6efa45e750c9ef4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a254501f37cca28d6efa45e750c9ef4")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return z.a((Object) this.b, (Object) eVar.b) && z.a((Object) this.c, (Object) eVar.c);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110e025a8bc51ccecb2139f1054dc65a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110e025a8bc51ccecb2139f1054dc65a")).intValue();
        }
        Object[] objArr2 = {this.b, this.c};
        Object[] objArr3 = {objArr2};
        ChangeQuickRedirect changeQuickRedirect2 = z.a;
        return PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "b90183ba0869609885ebbc66f7040d18", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "b90183ba0869609885ebbc66f7040d18")).intValue() : Arrays.hashCode(objArr2);
    }
}
