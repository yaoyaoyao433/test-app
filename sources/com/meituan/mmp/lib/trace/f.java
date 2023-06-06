package com.meituan.mmp.lib.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f {
    public static ChangeQuickRedirect a;
    public String b;
    public long c;

    public f(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c6e941280e4002567e8c9c21bf6ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c6e941280e4002567e8c9c21bf6ebf");
            return;
        }
        this.b = str;
        this.c = j;
    }

    public long a() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends f {
        private b(String str, long j) {
            super(str, j);
        }

        public b(String str) {
            this(str, System.currentTimeMillis());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends f {
        public static ChangeQuickRedirect d;
        public long e;

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.mmp.lib.trace.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0425a extends a {
        }

        private a(String str, long j, long j2) {
            super(str, j);
            Object[] objArr = {str, new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07fd0898a0b719087c71aa2c35fac5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07fd0898a0b719087c71aa2c35fac5f");
            } else {
                this.e = j2;
            }
        }

        public a(String str, long j) {
            this(str, System.currentTimeMillis(), j);
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c07c0e414d34e1c559ea25d1d4e0e61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c07c0e414d34e1c559ea25d1d4e0e61");
            }
        }

        @Override // com.meituan.mmp.lib.trace.f
        public final long a() {
            return this.c - this.e;
        }
    }
}
