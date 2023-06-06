package com.sankuai.waimai.store.search.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.search.model.GuidedItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.data.f$f  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1297f {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public final GuidedItem a;
        public final String b;
        public boolean c;

        public c(GuidedItem guidedItem, String str) {
            this.c = true;
            this.a = guidedItem;
            this.b = str;
        }

        public c(GuidedItem guidedItem, String str, boolean z) {
            this.c = true;
            this.a = guidedItem;
            this.b = str;
            this.c = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class g {
        public final String a;

        public g(String str) {
            this.a = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public int a;
        public Runnable b;

        public e(int i, Runnable runnable) {
            this.a = i;
            this.b = runnable;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public int a;
        public int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public long b;
        public String c;
        public String d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;

        public b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de01ea1f241adcd50163b73657d4617", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de01ea1f241adcd50163b73657d4617");
                return;
            }
            this.b = 0L;
            this.c = "";
            this.d = null;
            this.f = -1;
            this.g = -1;
            this.h = false;
            this.i = false;
            this.e = i;
        }
    }
}
