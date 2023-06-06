package com.meituan.android.mrn.router;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final b b = new b();
    private List<a> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1675e5d4b7a4dbc02f428b7916694ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1675e5d4b7a4dbc02f428b7916694ff");
        } else {
            this.c = null;
        }
    }

    public final List<a> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2dbd770b71752e3f65d4c3ac88a606b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2dbd770b71752e3f65d4c3ac88a606b");
        }
        if (this.c != null && !z) {
            return this.c;
        }
        a();
        return this.c;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9750b3e5458f79fbe8c8110ef73fe654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9750b3e5458f79fbe8c8110ef73fe654");
            return;
        }
        ArrayList<WeakReference<Activity>> arrayList = c.a().b;
        this.c = new ArrayList(arrayList.size());
        for (WeakReference<Activity> weakReference : arrayList) {
            if (weakReference != null && weakReference.get() != null) {
                this.c.add(new a(weakReference.get()));
            }
        }
    }

    public final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f097ee92a0424d801c89043074f0ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f097ee92a0424d801c89043074f0ac");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (a aVar : a(false)) {
            if (TextUtils.equals(aVar.c, str) && a(aVar.a())) {
                return aVar;
            }
        }
        return null;
    }

    public final void a(a aVar) {
        List<a> a2;
        int lastIndexOf;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d73ac61ff84cbf28f46d8978235f291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d73ac61ff84cbf28f46d8978235f291");
        } else if (aVar != null && aVar.a() != null && (lastIndexOf = (a2 = a(false)).lastIndexOf(aVar)) >= 0) {
            for (int size = a2.size() - 1; size > lastIndexOf; size--) {
                Activity a3 = a2.get(size).a();
                if (a3 != null) {
                    a3.finish();
                }
            }
        }
    }

    private boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480161d008cdc3cf7f578a779a13f7ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480161d008cdc3cf7f578a779a13f7ff")).booleanValue();
        }
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return Build.VERSION.SDK_INT < 17 || !activity.isDestroyed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
        if (android.text.TextUtils.equals(r0.getQueryParameter("mrn_component"), r1.getQueryParameter("mrn_component")) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.android.mrn.router.a b(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.router.b.b(java.lang.String):com.meituan.android.mrn.router.a");
    }
}
