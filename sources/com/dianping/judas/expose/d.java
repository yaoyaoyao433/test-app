package com.dianping.judas.expose;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static d d;
    Set<a> b;
    private Handler c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c6125861fa62bc8d2dde5ff981f724", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c6125861fa62bc8d2dde5ff981f724");
            return;
        }
        this.c = new Handler();
        this.b = new HashSet();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "532efeed1d9adb83e45a7c32e9eb561f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "532efeed1d9adb83e45a7c32e9eb561f");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }

    public final a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db68fa1f1fbb32c3c4ffdab10ab89377", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db68fa1f1fbb32c3c4ffdab10ab89377");
        }
        for (a aVar : this.b) {
            if (aVar.a(activity)) {
                return aVar;
            }
        }
        a aVar2 = new a(activity);
        this.b.add(aVar2);
        return aVar2;
    }

    public final b a(Activity activity, String str) {
        Set<b> set;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cdc49ded015508abffbcd44344e8077", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cdc49ded015508abffbcd44344e8077");
        }
        a a2 = a(activity);
        Set<b> set2 = a2.b;
        b bVar = null;
        if (set2 != null) {
            Iterator<b> it = set2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b next = it.next();
                if (TextUtils.equals(str, next.b)) {
                    bVar = next;
                    break;
                }
            }
            if (bVar == null) {
                b bVar2 = new b(a2);
                bVar2.b = str;
                set2.add(bVar2);
                return bVar2;
            }
            return bVar;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc5f7fcbd651e97e08114131b5c04f84", RobustBitConfig.DEFAULT_VALUE)) {
            set = (Set) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc5f7fcbd651e97e08114131b5c04f84");
        } else {
            a aVar = new a(activity);
            this.b.add(aVar);
            set = aVar.b;
        }
        b bVar3 = new b(a2);
        bVar3.b = str;
        set.add(bVar3);
        return bVar3;
    }

    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, 300L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c37f51ff09df798e78092b4d28e233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c37f51ff09df798e78092b4d28e233");
        } else if (this.c != null) {
            this.c.postDelayed(runnable, 300L);
        }
    }
}
