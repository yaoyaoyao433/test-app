package com.meituan.android.yoda.model.behavior.entry;

import android.support.annotation.NonNull;
import com.meituan.android.yoda.interfaces.g;
import com.meituan.android.yoda.model.behavior.collection.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements g, c.a<c>, Comparable<c> {
    public static ChangeQuickRedirect a;
    private static com.meituan.android.yoda.model.behavior.collection.a<c> b = new com.meituan.android.yoda.model.behavior.collection.a<>(15);
    private StringBuilder c;
    private StringBuilder d;
    private int e;
    private long f;

    @Override // com.meituan.android.yoda.model.behavior.collection.c.a
    public final /* synthetic */ void a(c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0409ce4ce25450fc27c0fdc2cd8e5f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0409ce4ce25450fc27c0fdc2cd8e5f3c");
        } else {
            this.d.append((CharSequence) cVar2.d);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0e6fb75fc2a32544f9035d00b5ae4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0e6fb75fc2a32544f9035d00b5ae4d")).intValue();
        }
        if (-1 != cVar2.e) {
            if (cVar2.e == this.e) {
                return 0;
            }
            if (cVar2.e <= this.e) {
                return 1;
            }
        }
        return -1;
    }

    private c(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5d8c151d18b2d818fabf20b3e69698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5d8c151d18b2d818fabf20b3e69698");
            return;
        }
        this.c = new StringBuilder();
        this.d = new StringBuilder();
        this.f = 0L;
        this.d = new StringBuilder(str == null ? "" : str);
        this.e = i;
        this.f = j;
    }

    public static c a(CharSequence charSequence, int i, long j) {
        Object[] objArr = {charSequence, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f3702ca8229d24723f2a6f7fc4bf3b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f3702ca8229d24723f2a6f7fc4bf3b5");
        }
        c b2 = b.b();
        if (b2 == null) {
            return new c(charSequence, i, j);
        }
        b2.d.append(charSequence);
        b2.e = i;
        b2.f = j;
        return b2;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4c777f67b0846c4a4791684db1d2b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4c777f67b0846c4a4791684db1d2b1");
        }
        this.c.delete(0, this.c.length());
        StringBuilder sb = this.c;
        sb.append(CommonConstant.Symbol.BRACKET_LEFT);
        sb.append((CharSequence) this.d);
        sb.append(",input");
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.f);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    @Override // com.meituan.android.yoda.interfaces.g
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24550335e32fb6950cbf22e502780a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24550335e32fb6950cbf22e502780a1c");
            return;
        }
        this.d.delete(0, this.d.length());
        this.e = -1;
        this.f = 0L;
        this.c.delete(0, this.c.length());
        b.a(this);
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0cbd5dc075b3b59d79e999d30d0f91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0cbd5dc075b3b59d79e999d30d0f91a");
        } else {
            b.a();
        }
    }
}
