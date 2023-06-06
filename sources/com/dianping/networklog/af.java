package com.dianping.networklog;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public final class af implements Cloneable {
    public static ChangeQuickRedirect a;
    public int A;
    public String B;
    public int b;
    public String c;
    public String d;
    public long e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public String l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public List<a> q;
    public String r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public d w;
    public String x;
    public String y;
    public int z;

    /* loaded from: classes.dex */
    public static class a {
        public File a;
        public int b;
        public int c;
        public String d;

        public a(File file, int i, int i2, String str) {
            this.a = file;
            this.b = i;
            this.c = i2;
            this.d = str;
        }
    }

    public static String c() {
        return "4";
    }

    /* renamed from: a */
    public final af clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6d1103375045bb0905cbb7a7619aa8", 6917529027641081856L)) {
            return (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6d1103375045bb0905cbb7a7619aa8");
        }
        try {
            return (af) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c106efdab96936a20c371074be84d1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c106efdab96936a20c371074be84d1")).booleanValue();
        }
        if (TextUtils.isEmpty(this.i) || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.l)) ? false : true;
    }
}
