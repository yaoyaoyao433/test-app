package com.sankuai.meituan.retrofit2.callfactory.okhttp;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.b;
import com.sankuai.meituan.retrofit2.y;
import com.squareup.okhttp.e;
import com.squareup.okhttp.r;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okio.c;
import okio.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private v b;

    public static a a(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b5bca8754735b919bd565ade24931dc", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b5bca8754735b919bd565ade24931dc") : new a(vVar);
    }

    public a() {
    }

    private a(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6d248f333de197ff2faf6efe25fe48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6d248f333de197ff2faf6efe25fe48");
        } else if (vVar == null) {
            throw new NullPointerException("client == null");
        } else {
            this.b = vVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65c7448f1b11caa8922d68f323b4665", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65c7448f1b11caa8922d68f323b4665") : new C0630a(this.b, ajVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.callfactory.okhttp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0630a implements Interceptor.a, com.sankuai.meituan.retrofit2.raw.a {
        public static ChangeQuickRedirect a;
        private v b;
        private aj c;
        private e d;
        private int e;
        private volatile boolean f;
        private boolean g;
        private boolean h;

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe5aaca40ce7be53b87861a42d6df98", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe5aaca40ce7be53b87861a42d6df98") : new C0630a(this.b, this.c);
        }

        public C0630a(v vVar, aj ajVar) {
            Object[] objArr = {vVar, ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be0c4b9fb667a4248292b71d244f8de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be0c4b9fb667a4248292b71d244f8de");
                return;
            }
            this.e = -1;
            this.h = !aa.b();
            this.b = vVar;
            this.c = ajVar;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.c;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3507988970d3f60bfd5d334f834024c", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3507988970d3f60bfd5d334f834024c");
            }
            if (!this.h) {
                this.h = true;
                try {
                    return new y(getClass().getSimpleName(), false).intercept(this);
                } finally {
                }
            } else {
                return execute();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final b execute() throws IOException {
            e a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10f20c3bd09bf0635cbbb1c60f5d535", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10f20c3bd09bf0635cbbb1c60f5d535");
            }
            if (!this.h) {
                return a(null);
            }
            synchronized (this) {
                if (this.g) {
                    throw new IllegalStateException("Already executed.");
                }
                this.g = true;
                this.e = b(this.c);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98b1ae6b58b117aefaff774febcdde86", 6917529027641081856L)) {
                    a2 = (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98b1ae6b58b117aefaff774febcdde86");
                } else if (this.e >= 0) {
                    v clone = this.b.clone();
                    clone.a(this.e, TimeUnit.MILLISECONDS);
                    clone.b(this.e, TimeUnit.MILLISECONDS);
                    a2 = clone.a(c(this.c));
                } else {
                    a2 = this.b.a(c(this.c));
                }
                this.d = a2;
            }
            if (this.f) {
                throw new IOException("Already canceled");
            }
            return a(this.c.b(), this.d.a());
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final void cancel() {
            e eVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4d66d2bc94c3d545cf1b0c8e7d48eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4d66d2bc94c3d545cf1b0c8e7d48eb");
                return;
            }
            this.f = true;
            synchronized (this) {
                eVar = this.d;
            }
            if (eVar != null) {
                eVar.cancel();
            }
        }

        private static int b(aj ajVar) {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00cd1501450f79639d19381fe9d797aa", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00cd1501450f79639d19381fe9d797aa")).intValue();
            }
            String a2 = ajVar.a("retrofit-mt-request-timeout");
            if (TextUtils.isEmpty(a2)) {
                return -1;
            }
            try {
                return Integer.parseInt(a2);
            } catch (NumberFormatException unused) {
                throw new NumberFormatException("retrofit-mt-request-timeout set failed and its value should be int");
            }
        }

        private static x c(final aj ajVar) {
            com.squareup.okhttp.y yVar;
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f6e23cf8cf753c156f0a2a3a0cb3d5e", 6917529027641081856L)) {
                return (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f6e23cf8cf753c156f0a2a3a0cb3d5e");
            }
            if (ajVar == null) {
                return null;
            }
            r.a aVar = new r.a();
            if (ajVar.d() != null && ajVar.d().size() > 0) {
                for (q qVar : ajVar.d()) {
                    aVar.a(qVar.a(), qVar.b());
                }
            }
            if (ajVar.i() != null) {
                String contentType = ajVar.i().contentType();
                final u a2 = contentType != null ? u.a(contentType) : null;
                yVar = new com.squareup.okhttp.y() { // from class: com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.okhttp.y
                    public final u contentType() {
                        return u.this;
                    }

                    @Override // com.squareup.okhttp.y
                    public final void writeTo(d dVar) throws IOException {
                        Object[] objArr2 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3d95ac809b42ecbd50652059128b4f4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3d95ac809b42ecbd50652059128b4f4");
                        } else {
                            ajVar.i().writeTo(dVar.b());
                        }
                    }

                    @Override // com.squareup.okhttp.y
                    public final long contentLength() throws IOException {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92f57c830fe063ea753193b16da44d15", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92f57c830fe063ea753193b16da44d15")).longValue() : ajVar.i().contentLength();
                    }
                };
            } else {
                yVar = null;
            }
            x.a aVar2 = new x.a();
            aVar2.a(ajVar.b()).a(aVar.a()).a(ajVar.c(), yVar);
            return aVar2.a();
        }

        private static b a(final String str, z zVar) {
            okio.e cVar;
            final ArrayList emptyList;
            Object[] objArr = {str, zVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2348e0b01afb1681135c2a6e2c0defc", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2348e0b01afb1681135c2a6e2c0defc");
            }
            if (zVar != null) {
                final com.squareup.okhttp.aa aaVar = zVar.g;
                final String str2 = zVar.d;
                final int i = zVar.c;
                try {
                    cVar = aaVar.c();
                } catch (Throwable unused) {
                    cVar = new c();
                }
                final InputStream e = cVar.e();
                final ap apVar = new ap() { // from class: com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.retrofit2.ap
                    public final String contentType() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adaf9c86138cdf288870a8d97e063676", 6917529027641081856L)) {
                            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adaf9c86138cdf288870a8d97e063676");
                        }
                        u a2 = com.squareup.okhttp.aa.this.a();
                        if (a2 != null) {
                            return a2.toString();
                        }
                        return null;
                    }

                    @Override // com.sankuai.meituan.retrofit2.ap
                    public final long contentLength() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0135231a771e1791b863a2db42b7f52c", 6917529027641081856L)) {
                            return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0135231a771e1791b863a2db42b7f52c")).longValue();
                        }
                        try {
                            return com.squareup.okhttp.aa.this.b();
                        } catch (IOException unused2) {
                            return -1L;
                        }
                    }

                    @Override // com.sankuai.meituan.retrofit2.ap
                    public final InputStream source() {
                        return e;
                    }

                    @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36a2ac18f3a7a7ac5d79ca6c464020d2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36a2ac18f3a7a7ac5d79ca6c464020d2");
                            return;
                        }
                        try {
                            com.squareup.okhttp.aa.this.close();
                        } catch (Throwable unused2) {
                        }
                    }
                };
                r rVar = zVar.f;
                if (rVar == null) {
                    emptyList = Collections.emptyList();
                } else {
                    int length = rVar.a.length / 2;
                    ArrayList arrayList = new ArrayList(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(new q(rVar.a(i2), rVar.b(i2)));
                    }
                    emptyList = arrayList;
                }
                return new b() { // from class: com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a.3
                    @Override // com.sankuai.meituan.retrofit2.raw.b
                    public final String url() {
                        return str;
                    }

                    @Override // com.sankuai.meituan.retrofit2.raw.b
                    public final int code() {
                        return i;
                    }

                    @Override // com.sankuai.meituan.retrofit2.raw.b
                    public final String reason() {
                        return str2;
                    }

                    @Override // com.sankuai.meituan.retrofit2.raw.b
                    public final List<q> headers() {
                        return emptyList;
                    }

                    @Override // com.sankuai.meituan.retrofit2.raw.b
                    public final ap body() {
                        return apVar;
                    }
                };
            }
            return null;
        }
    }
}
