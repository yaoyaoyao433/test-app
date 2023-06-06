package com.sankuai.meituan.retrofit2;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.d;
import com.sankuai.meituan.retrofit2.o;
import com.sankuai.meituan.retrofit2.r;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class am {
    public static ChangeQuickRedirect a;
    private static final char[] o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String b;
    final t c;
    String d;
    t.a e;
    r.a f;
    ad g;
    final boolean h;
    final boolean i;
    final boolean j;
    d.a k;
    ae.a l;
    o.a m;
    ak n;

    public am(String str, t tVar, String str2, r rVar, ad adVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object[] objArr = {str, tVar, str2, rVar, adVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20528677e5b2d417bd8362100614af1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20528677e5b2d417bd8362100614af1");
            return;
        }
        this.b = str;
        this.c = tVar;
        this.d = str2;
        this.g = adVar;
        this.h = z;
        this.i = z4;
        this.j = z5;
        this.f = new r.a();
        if (rVar != null) {
            this.f = rVar.b();
        }
        if (z2) {
            this.m = new o.a();
        } else if (z3) {
            this.l = new ae.a();
            this.l.a(ae.f);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358e871ee8de519f465cfda10247bafe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358e871ee8de519f465cfda10247bafe");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            ad a2 = ad.a(str2);
            if (a2 == null) {
                throw new IllegalArgumentException("Malformed content type: " + str2);
            }
            this.g = a2;
        } else {
            this.f.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2e678065c0abcb6245ffeb342c87ffd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2e678065c0abcb6245ffeb342c87ffd");
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                okio.c cVar = new okio.c();
                cVar.a(str, 0, i);
                a(cVar, str, i, length, z);
                return cVar.p();
            }
        }
        return str;
    }

    private static void a(okio.c cVar, String str, int i, int i2, boolean z) {
        Object[] objArr = {cVar, str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        okio.c cVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be473e9064b9e66fc0797e1422c38140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be473e9064b9e66fc0797e1422c38140");
            return;
        }
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new okio.c();
                    }
                    cVar2.a(codePointAt);
                    while (!cVar2.d()) {
                        int g = cVar2.g() & 255;
                        cVar.h(37);
                        cVar.h((int) o[(g >> 4) & 15]);
                        cVar.h((int) o[g & 15]);
                    }
                } else {
                    cVar.a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41fa3f9cc0b3f3b91be567080745e91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41fa3f9cc0b3f3b91be567080745e91");
            return;
        }
        if (this.d != null) {
            this.e = this.c.d(this.d);
            if (this.e == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.c + ", Relative: " + this.d);
            }
            this.d = null;
        }
        if (z) {
            this.e.b(str, str2);
        } else {
            this.e.a(str, str2);
        }
    }

    public final void b(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476eb11dac1c207274839f3997df1103", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476eb11dac1c207274839f3997df1103");
        } else if (z) {
            this.m.b(str, str2);
        } else {
            this.m.a(str, str2);
        }
    }

    public final void a(r rVar, ak akVar) {
        Object[] objArr = {rVar, akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b3d0eff47f14bd8581557c2d2ec106", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b3d0eff47f14bd8581557c2d2ec106");
        } else {
            this.l.a(rVar, akVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01be83e775eeb0c227256c4904e8bcb2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01be83e775eeb0c227256c4904e8bcb2")).booleanValue() : str.equals("POST") || str.equals(OneIdNetworkTool.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static ChangeQuickRedirect a;
        private final ak b;
        private final ad c;

        public a(ak akVar, ad adVar) {
            Object[] objArr = {akVar, adVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170257fb95c1cf0c335e48e0e63a9205", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170257fb95c1cf0c335e48e0e63a9205");
                return;
            }
            this.b = akVar;
            this.c = adVar;
        }

        @Override // com.sankuai.meituan.retrofit2.ak
        public final String contentType() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2307dd6505d5c6dc504568653120b8e0", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2307dd6505d5c6dc504568653120b8e0") : this.c.toString();
        }

        @Override // com.sankuai.meituan.retrofit2.ak
        public final long contentLength() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5484b9fdf3ffc9b6b53d842d467e3d3f", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5484b9fdf3ffc9b6b53d842d467e3d3f")).longValue() : this.b.contentLength();
        }

        @Override // com.sankuai.meituan.retrofit2.ak
        public final void writeTo(OutputStream outputStream) throws IOException {
            Object[] objArr = {outputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6fd6cd7e7e2f7741c289126d5ebca2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6fd6cd7e7e2f7741c289126d5ebca2");
            } else {
                this.b.writeTo(outputStream);
            }
        }
    }
}
