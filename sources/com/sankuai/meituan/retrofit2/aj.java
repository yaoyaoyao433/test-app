package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class aj {
    public static ChangeQuickRedirect a;
    final boolean b;
    final boolean c;
    final boolean d;
    public final String e;
    public final String f;
    public final List<q> g;
    public final ak h;
    final d i;
    final int j;

    public aj(String str, String str2, List<q> list, ak akVar, boolean z, boolean z2, d dVar) {
        Object[] objArr = {str, str2, list, akVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a5857ff96fd66328b671645ae8d6c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a5857ff96fd66328b671645ae8d6c0");
        } else if (str == null) {
            throw new NullPointerException("URL must not be null.");
        } else {
            if (str2 == null) {
                throw new NullPointerException("Method must not be null.");
            }
            this.e = str;
            this.f = str2;
            if (list == null) {
                this.g = Collections.emptyList();
            } else {
                this.g = Collections.unmodifiableList(new ArrayList(list));
            }
            this.h = akVar;
            this.b = z;
            this.i = dVar;
            this.c = z2;
            this.d = false;
            this.j = -1;
        }
    }

    public aj(String str, String str2, List<q> list, ak akVar, boolean z, boolean z2, boolean z3, d dVar, int i) {
        Object[] objArr = {str, str2, list, akVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2622fbf5f8c25dfc17cd583cf7f03c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2622fbf5f8c25dfc17cd583cf7f03c");
        } else if (str == null) {
            throw new NullPointerException("URL must not be null.");
        } else {
            if (str2 == null) {
                throw new NullPointerException("Method must not be null.");
            }
            this.e = str;
            this.f = str2;
            if (list == null) {
                this.g = Collections.emptyList();
            } else {
                this.g = Collections.unmodifiableList(new ArrayList(list));
            }
            this.h = akVar;
            this.b = z;
            this.i = dVar;
            this.c = z2;
            this.d = z3;
            this.j = i;
        }
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0433cf63bd4080cff18c10271e997a2b", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0433cf63bd4080cff18c10271e997a2b") : new a(this);
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final List<q> d() {
        return this.g;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.c;
    }

    public final d g() {
        return this.i;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce519a69492954af9e339a8700cf1189", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce519a69492954af9e339a8700cf1189") : a("catCmd");
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ec3e200381f8e5dd47df1540ae7b4dc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ec3e200381f8e5dd47df1540ae7b4dc");
        }
        if (this.g == null || this.g.isEmpty()) {
            return null;
        }
        for (q qVar : this.g) {
            if (str.equalsIgnoreCase(qVar.b)) {
                return qVar.c;
            }
        }
        return null;
    }

    public final ak i() {
        return this.h;
    }

    public final int j() {
        return this.j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public ak d;
        public int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private r.a i;
        private d j;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7e0bbe1de17e58b2fb273f3d159432", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7e0bbe1de17e58b2fb273f3d159432");
                return;
            }
            this.e = -1;
            this.c = "GET";
            this.i = new r.a();
        }

        public a(aj ajVar) {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193e13121134293db920b74886579260", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193e13121134293db920b74886579260");
                return;
            }
            this.e = -1;
            this.b = ajVar.e;
            this.c = ajVar.f;
            this.d = ajVar.h;
            this.i = new r.a().a(ajVar.g);
            this.f = ajVar.b;
            this.g = ajVar.c;
            this.j = ajVar.i;
            this.h = ajVar.d;
            this.e = ajVar.j;
        }

        public final a a(String str) {
            this.c = str;
            return this;
        }

        public final a b(String str) {
            this.b = str;
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00fe84ebc5402b880a3b6b0340367c24", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00fe84ebc5402b880a3b6b0340367c24");
            }
            this.i.b(str, str2);
            return this;
        }

        public final a a(List<q> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9276e600438662b52c65210ad266995f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9276e600438662b52c65210ad266995f");
            }
            this.i = new r.a().a(list);
            return this;
        }

        public final a b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4166b0a4e621c47cb345fc4ddda14ca6", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4166b0a4e621c47cb345fc4ddda14ca6");
            }
            this.i.a(str, str2);
            return this;
        }

        public final a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0e9d961c8dfc2af8280a4847c975660", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0e9d961c8dfc2af8280a4847c975660");
            }
            this.i.a(str);
            return this;
        }

        public final a a(ak akVar) {
            this.d = akVar;
            return this;
        }

        public final aj a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1a56bec477cc053a6f1e6b783d2997", 6917529027641081856L) ? (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1a56bec477cc053a6f1e6b783d2997") : new aj(this.b, this.c, this.i.a().b, this.d, this.f, this.g, this.h, this.j, this.e);
        }
    }
}
