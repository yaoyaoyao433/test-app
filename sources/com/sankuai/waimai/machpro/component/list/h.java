package com.sankuai.waimai.machpro.component.list;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    ArrayMap<String, String> b;
    private SparseArray<String> c;
    private int d;
    private SparseArray<String> e;
    private SparseArray<String> f;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa67046af4f702df905596896719a7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa67046af4f702df905596896719a7b");
            return;
        }
        this.c = new SparseArray<>();
        this.e = new SparseArray<>();
        this.f = new SparseArray<>();
        this.b = new ArrayMap<>();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9722dab44ed3b5d4b4ef53adfb86ad41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9722dab44ed3b5d4b4ef53adfb86ad41");
            return;
        }
        this.e.clear();
        this.f.clear();
        this.b.clear();
    }

    private int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f35576a562f5579308ed9b363f5cde", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f35576a562f5579308ed9b363f5cde")).intValue();
        }
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (str.equals(this.c.valueAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319691f1537c24ff93e23199ad05be60", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319691f1537c24ff93e23199ad05be60")).intValue();
        }
        int b = b(str);
        if (b == -1) {
            this.d++;
            this.c.put(this.d, str);
            return this.d;
        }
        return this.c.keyAt(b);
    }

    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc50dbb468c5e5341d36cfcd3a7f11ab", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc50dbb468c5e5341d36cfcd3a7f11ab") : this.c.get(i);
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70eb47000b6b9e3fc8cfb1d229e22b12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70eb47000b6b9e3fc8cfb1d229e22b12");
        } else {
            this.e.put(i, str);
        }
    }

    public final String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69df9d6ec2e6e2a66c8996f122b55acd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69df9d6ec2e6e2a66c8996f122b55acd") : this.e.get(i);
    }

    public final void b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5e92691fda0a90a084e73dc68391d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5e92691fda0a90a084e73dc68391d1");
        } else {
            this.f.put(i, str);
        }
    }

    public final String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183ab9126208ef28c8dbe4b4290f1a50", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183ab9126208ef28c8dbe4b4290f1a50") : this.f.get(i);
    }
}
