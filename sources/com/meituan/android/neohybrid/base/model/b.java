package com.meituan.android.neohybrid.base.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b<T> implements a<T> {
    public static ChangeQuickRedirect a;
    protected final Set<c<T>> b;
    public T c;

    public b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "860ab34156dc75bf729b9600ea9d1a9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "860ab34156dc75bf729b9600ea9d1a9d");
            return;
        }
        this.b = new HashSet();
        this.c = t;
    }

    @Override // com.meituan.android.neohybrid.base.model.a
    public final T a() {
        return this.c;
    }

    @Override // com.meituan.android.neohybrid.base.model.a
    public void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e55d9d9f610c506708ad7e7e8fb626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e55d9d9f610c506708ad7e7e8fb626");
            return;
        }
        boolean z = !equals(t);
        this.c = t;
        if (z) {
            Object[] objArr2 = {t};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73f9105ca00d6c0c98b3c35141cd6beb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73f9105ca00d6c0c98b3c35141cd6beb");
                return;
            }
            for (c<T> cVar : this.b) {
                try {
                    cVar.a(t);
                } catch (Exception e) {
                    com.meituan.android.neohybrid.neo.report.b.a(e, "NeoModel_notifyValueChanged", (Map<String, Object>) null);
                }
            }
        }
    }

    public void a(c<T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5e30dc6b376b0997f04391761787c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5e30dc6b376b0997f04391761787c7");
        } else if (cVar != null) {
            this.b.add(cVar);
        }
    }

    public final void b(c<T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0b5a06cd54079c108918194d0a6a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0b5a06cd54079c108918194d0a6a71");
        } else {
            this.b.remove(cVar);
        }
    }

    @Override // com.meituan.android.neohybrid.base.model.a
    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f476093c992ae8ced4bbf5b6e2d90977", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f476093c992ae8ced4bbf5b6e2d90977")).booleanValue();
        }
        if (obj instanceof a) {
            return Objects.equals(this.c, ((a) obj).a());
        }
        return Objects.equals(this.c, obj);
    }

    @NonNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3e63e5febdb60bcba54aa43c2ec16e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3e63e5febdb60bcba54aa43c2ec16e");
        }
        return getClass().getName() + "@" + Integer.toHexString(super.hashCode());
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "299b4f968e4c3834c8ae12126f3c3649", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "299b4f968e4c3834c8ae12126f3c3649")).intValue();
        }
        if (this.c != null) {
            return this.c.hashCode();
        }
        return 0;
    }
}
