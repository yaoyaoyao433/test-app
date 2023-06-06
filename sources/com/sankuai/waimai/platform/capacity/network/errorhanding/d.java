package com.sankuai.waimai.platform.capacity.network.errorhanding;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private a b;

    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78006dc6cf4860178448903bc54b1677", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78006dc6cf4860178448903bc54b1677")).booleanValue() : i == 405 || i == 404 || i == 403 || i == 402 || i == 401;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc4092aff3e12166fdd092de0c925f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc4092aff3e12166fdd092de0c925f5");
        } else {
            this.b = a.GENERAL;
        }
    }

    public final void a(int i, String str) throws e {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3630edceeada1d48c4184dd21896510a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3630edceeada1d48c4184dd21896510a");
        } else {
            b(i, str);
        }
    }

    private void b(int i, String str) throws e {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f7f1d67c011193b55d68af8597c2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f7f1d67c011193b55d68af8597c2d2");
        } else {
            c(i, str);
        }
    }

    private void c(int i, String str) throws e {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1d159febb4deb1746634912ecdfc4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1d159febb4deb1746634912ecdfc4e");
        } else if (a(i)) {
            throw new e(i, str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        PASSPORT,
        GENERAL;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1064498c7ccca6dab8e32a520244bfab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1064498c7ccca6dab8e32a520244bfab");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1011fdd666aa4f0cfd57361c6bd2666", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1011fdd666aa4f0cfd57361c6bd2666") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5d1c7c7048d296e3bb6549e34204aa7", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5d1c7c7048d296e3bb6549e34204aa7") : (a[]) values().clone();
        }
    }
}
