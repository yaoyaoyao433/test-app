package com.sankuai.xm.base.tinyorm;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    public static ChangeQuickRedirect a;
    private HashMap<String, d> b;
    private HashMap<String, TableProxy> c;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c4045451f984037f3feac5170a771e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c4045451f984037f3feac5170a771e");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }

    public final d a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90aee6ff8e20c40db26391128fa22ec", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90aee6ff8e20c40db26391128fa22ec");
        }
        if (obj == null) {
            return null;
        }
        return a((Class) obj.getClass());
    }

    public final d a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb8d21ce1461fc7e694cfee04079fbe", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb8d21ce1461fc7e694cfee04079fbe");
        }
        String d = d(cls);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        if (!a(d)) {
            c(cls);
        }
        return b(d);
    }

    public final TableProxy b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a4d9a10e009818c825c26bc0d62b36", 6917529027641081856L)) {
            return (TableProxy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a4d9a10e009818c825c26bc0d62b36");
        }
        if (obj == null) {
            return null;
        }
        return b((Class) obj.getClass());
    }

    public final TableProxy b(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdee1f827aaff3f5c8121f2f51962e0e", 6917529027641081856L)) {
            return (TableProxy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdee1f827aaff3f5c8121f2f51962e0e");
        }
        String d = d(cls);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        if (!a(d)) {
            c(cls);
        }
        return c(d);
    }

    private boolean c(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "863ba6f92defa12784f59110653270a4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "863ba6f92defa12784f59110653270a4")).booleanValue();
        }
        String name = cls.getName();
        try {
            if (this.b.get(name) == null) {
                TableProxy tableProxy = (TableProxy) Class.forName(name + "$$TableProxy").newInstance();
                a(name, tableProxy.create(Class.forName(name).newInstance()), tableProxy);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Unable to inject for " + name, e);
        }
    }

    private synchronized boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360aee10065c13bf04dfaf7fb45223de", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360aee10065c13bf04dfaf7fb45223de")).booleanValue();
        }
        return this.b.containsKey(str);
    }

    private synchronized void a(String str, d dVar, TableProxy tableProxy) {
        Object[] objArr = {str, dVar, tableProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf5472b5e9acaf0f140485af668f3b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf5472b5e9acaf0f140485af668f3b9");
            return;
        }
        if (!a(str)) {
            this.b.put(str, dVar);
            this.c.put(str, tableProxy);
        }
    }

    private synchronized d b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b87494d16397f0f93e11f7894c32cd", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b87494d16397f0f93e11f7894c32cd");
        }
        return this.b.get(str);
    }

    private synchronized TableProxy c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a953b658053661a74f0028ef6099d1a1", 6917529027641081856L)) {
            return (TableProxy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a953b658053661a74f0028ef6099d1a1");
        }
        return this.c.get(str);
    }

    private String d(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198b8af8b043ac3b8c49b8711b830780", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198b8af8b043ac3b8c49b8711b830780");
        }
        if (cls == null) {
            return null;
        }
        return cls.getName();
    }
}
