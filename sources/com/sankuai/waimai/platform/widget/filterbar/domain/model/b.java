package com.sankuai.waimai.platform.widget.filterbar.domain.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public ArrayList<a> b;
    public ArrayList<a> c;
    public C1091b d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public String a;
        public boolean b;
        public List<C1086a> c = new ArrayList();
        public int d;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.model.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C1086a {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
            public C1088b f;
            public com.sankuai.waimai.platform.widget.filterbar.domain.model.a g;
            public String h;
            public C1087a i;

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.model.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static class C1087a {
                public String a;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.model.b$a$a$b  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static class C1088b {
                public int a;
                public int b;
                public int c;
                public C1090b d;
                public ArrayList<C1089a> e;

                /* compiled from: ProGuard */
                /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.model.b$a$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static class C1089a {
                    public int a;
                    public int b;
                }

                /* compiled from: ProGuard */
                /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.model.b$a$a$b$b  reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static class C1090b {
                    public String a;
                    public int b;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.filterbar.domain.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1091b {
        public String a;
    }

    public static boolean a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c874511cd601da59ec7eb086934a7db5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c874511cd601da59ec7eb086934a7db5")).booleanValue() : bVar == null || bVar.b == null || bVar.b.isEmpty();
    }

    public static boolean a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df44440d71b68c963c3a657abab451d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df44440d71b68c963c3a657abab451d9")).booleanValue() : aVar == null || aVar.c == null || aVar.c.isEmpty();
    }

    public static boolean b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1209b635b94777a1fcd4d21a39ae43f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1209b635b94777a1fcd4d21a39ae43f9")).booleanValue() : (bVar == null || com.sankuai.waimai.foundation.utils.b.b(bVar.c) || com.sankuai.waimai.foundation.utils.b.b(bVar.c.get(0).c) || TextUtils.isEmpty(bVar.c.get(0).c.get(0).h)) ? false : true;
    }

    public final a.C1086a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3837495c30a7b01ca36754933a31b2b5", RobustBitConfig.DEFAULT_VALUE) ? (a.C1086a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3837495c30a7b01ca36754933a31b2b5") : this.c.get(0).c.get(0);
    }

    public static boolean a(a.C1086a c1086a) {
        Object[] objArr = {c1086a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "095a863052470a6ac49139b3bf126c18", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "095a863052470a6ac49139b3bf126c18")).booleanValue() : c1086a == null || TextUtils.isEmpty(c1086a.a);
    }

    public static boolean a(b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3eef78d59ca3f670386b2951fbb72ff1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3eef78d59ca3f670386b2951fbb72ff1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || a(bVar)) {
            return false;
        }
        Iterator<a> it = bVar.b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!a(next)) {
                for (a.C1086a c1086a : next.c) {
                    if (c1086a != null && str.equals(c1086a.a)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
