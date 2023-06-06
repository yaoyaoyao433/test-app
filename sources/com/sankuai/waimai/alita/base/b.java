package com.sankuai.waimai.alita.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    private String k;
    private String l;
    private String m;
    private int n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public int i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
    }

    private b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e50705c26badce41b96cec63483dcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e50705c26badce41b96cec63483dcf");
            return;
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.k = aVar.e;
        this.e = aVar.f;
        this.l = aVar.g;
        this.m = aVar.h;
        this.n = aVar.i;
        this.f = aVar.j;
        this.g = aVar.k;
        this.h = aVar.l;
        this.i = aVar.m;
        this.j = aVar.n;
    }
}
