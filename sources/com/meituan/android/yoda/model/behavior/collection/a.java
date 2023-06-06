package com.meituan.android.yoda.model.behavior.collection;

import com.meituan.android.yoda.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a<T> implements g {
    public static ChangeQuickRedirect a;
    private Object[] b;
    private int c;
    private int d;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3caa2b1a06ae7263c9a4b419bb6480ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3caa2b1a06ae7263c9a4b419bb6480ca");
            return;
        }
        this.c = 4;
        this.d = -1;
        this.c = i <= 0 ? 0 : i;
        this.b = new Object[this.c];
    }

    public final T b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9085d49470cf3bfe448a81b25991323", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9085d49470cf3bfe448a81b25991323");
        }
        c();
        if (this.d >= 0) {
            T t = (T) this.b[this.d];
            this.b[this.d] = null;
            this.d--;
            return t;
        }
        return null;
    }

    public final boolean a(T t) {
        boolean z;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99e59a610eedc1ef2d7814a40fe63c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99e59a610eedc1ef2d7814a40fe63c3")).booleanValue();
        }
        Object[] objArr2 = {t};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "046f9aefa700ec26c285b7e3cbeb6487", RobustBitConfig.DEFAULT_VALUE)) {
            c();
            int i = 0;
            while (true) {
                if (i >= this.d) {
                    z = false;
                    break;
                } else if (this.b[i] == t) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "046f9aefa700ec26c285b7e3cbeb6487")).booleanValue();
        }
        if (z) {
            return false;
        }
        c();
        if (this.d < this.b.length - 1) {
            this.d++;
            this.b[this.d] = t;
            return true;
        }
        return false;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4edeeec211d2a4a0774fabe486d26f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4edeeec211d2a4a0774fabe486d26f");
        } else if (this.b == null) {
            this.b = new Object[this.c];
            this.d = -1;
        }
    }

    @Override // com.meituan.android.yoda.interfaces.g
    public final void a() {
        this.b = null;
        this.d = -1;
    }
}
