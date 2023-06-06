package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static long b = -1;
    public static long c = -1;
    public static boolean d = false;
    b e;
    long f;
    long g;
    boolean h;
    String i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        NET,
        LOCAL,
        NET_PREFERRED,
        LOCAL_PREFERRED;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52dcccd6ad09fb1011c03b227d6f7802", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52dcccd6ad09fb1011c03b227d6f7802");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee11137e91dad0e71541773378210cb5", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee11137e91dad0e71541773378210cb5") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f462649260cece7f09d38ca8ceb3ca8", 6917529027641081856L) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f462649260cece7f09d38ca8ceb3ca8") : (b[]) values().clone();
        }
    }

    private d(b bVar, long j, long j2, boolean z, String str) {
        Object[] objArr = {bVar, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db77114939769640e43a09b7d39ec74c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db77114939769640e43a09b7d39ec74c");
            return;
        }
        this.e = bVar;
        this.f = j;
        this.g = j2;
        this.h = z;
        this.i = str;
    }

    public final b a() {
        return this.e;
    }

    public final boolean b() {
        return this.h;
    }

    public final String c() {
        return this.i;
    }

    public final void a(String str) {
        this.i = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private b b;
        private long c;
        private long d;
        private boolean e;
        private String f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7ebea5e19f8a4fe1957e79f3c2d4f4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7ebea5e19f8a4fe1957e79f3c2d4f4");
                return;
            }
            this.b = b.NET;
            this.c = d.b;
            this.d = d.c;
            this.e = d.d;
        }

        public a(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8d76bbe9751aa8d2d7c977f682cb09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8d76bbe9751aa8d2d7c977f682cb09");
                return;
            }
            this.b = b.NET;
            this.c = d.b;
            this.d = d.c;
            this.e = d.d;
            this.b = dVar.e;
            this.c = dVar.f;
            this.d = dVar.g;
            this.e = dVar.h;
            this.f = dVar.i;
        }

        public final d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e713541aee1d18111b01c9099cb0c7", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e713541aee1d18111b01c9099cb0c7") : new d(this.b, this.c, this.d, this.e, this.f);
        }
    }
}
