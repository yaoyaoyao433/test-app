package com.meituan.passport.clickaction;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class d<T> {
    public static ChangeQuickRedirect a;
    public T b;
    private c<T> c;

    private d(c<T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96c9134c65f59ccf7b225ea185f8598", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96c9134c65f59ccf7b225ea185f8598");
        } else {
            this.c = cVar;
        }
    }

    private d(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9348e2df86d6a0dab967b0a4e591767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9348e2df86d6a0dab967b0a4e591767");
        } else {
            this.b = t;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7beaf908929757260dcc4c76a01322c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7beaf908929757260dcc4c76a01322c4");
        } else if (this.c != null) {
            this.b = this.c.getParam();
        }
    }

    public final T b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e263a6efb49fef302aa3d5e28e7cbe0", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e263a6efb49fef302aa3d5e28e7cbe0");
        }
        if (this.b == null && this.c != null) {
            return this.c.getParam();
        }
        return this.b;
    }

    public static <T> d<T> a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be17883b70fa6a12c37170051d2bc02f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be17883b70fa6a12c37170051d2bc02f") : new d<>(t);
    }

    public static <T> d<T> a(@NonNull c<T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9e0bef418828afd73f0094046428622", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9e0bef418828afd73f0094046428622") : new d<>((c) cVar);
    }
}
