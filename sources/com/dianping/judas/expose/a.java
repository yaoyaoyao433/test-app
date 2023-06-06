package com.dianping.judas.expose;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Set<b> b;
    com.dianping.judas.interfaces.a c;
    private WeakReference<Activity> d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f50eebe793db2944c06c7118c9199b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f50eebe793db2944c06c7118c9199b");
        } else {
            this.b = new HashSet();
        }
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a03be87b0506a9a94452826d20e87944", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a03be87b0506a9a94452826d20e87944");
            return;
        }
        this.b = new HashSet();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.d = new WeakReference<>(activity);
        if (activity instanceof com.dianping.judas.interfaces.a) {
            this.c = (com.dianping.judas.interfaces.a) activity;
        } else {
            this.c = new com.dianping.judas.a(activity);
        }
    }

    public final boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13bf5a58ccc7547b3e45a3fbbecf8cc6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13bf5a58ccc7547b3e45a3fbbecf8cc6")).booleanValue() : (this.d == null || this.d.get() == null || activity == null || this.d.get() != activity) ? false : true;
    }

    public b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fc1ba38325acddf3d087d1b86d8f154", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fc1ba38325acddf3d087d1b86d8f154");
        }
        b bVar = null;
        Iterator<b> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (TextUtils.equals(next.b, str)) {
                bVar = next;
                break;
            }
        }
        if (bVar == null) {
            b bVar2 = new b(this);
            bVar2.b = str;
            this.b.add(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b61cb7beee5a2157a3ef048c9447b01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b61cb7beee5a2157a3ef048c9447b01");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b bVar = null;
            Iterator<b> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (TextUtils.equals(next.b, str)) {
                    bVar = next;
                    break;
                }
            }
            if (bVar != null) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "857c897a97714bf44dda30ee9c73be3d", RobustBitConfig.DEFAULT_VALUE)) {
                    List list = (List) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "857c897a97714bf44dda30ee9c73be3d");
                    return;
                }
                bVar.c = i;
                bVar.d = i2;
                bVar.a(false);
            }
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3411e1691ff1c21e263bce68f9a9b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3411e1691ff1c21e263bce68f9a9b4")).intValue() : (this.d == null || this.d.get() == null) ? super.hashCode() : this.d.get().hashCode();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d7f9fad5da73acbd5e4201df874433", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d7f9fad5da73acbd5e4201df874433")).booleanValue();
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.d == this.d) {
                return true;
            }
            return (aVar.d.get() == null || this.d.get() == null || aVar.d.get() != this.d.get()) ? false : true;
        }
        return false;
    }
}
