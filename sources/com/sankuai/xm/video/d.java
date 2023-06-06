package com.sankuai.xm.video;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.integration.crypto.CryptoProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends com.sankuai.xm.recorder.d {
    public static ChangeQuickRedirect l;

    public d(com.sankuai.xm.recorder.c cVar) {
        super(new a(cVar));
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983cfda31a65c1267467ac4b6fda1a86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983cfda31a65c1267467ac4b6fda1a86");
        }
    }

    @Override // com.sankuai.xm.recorder.d
    public final boolean a(String str, String str2, Pair<Integer, Integer> pair, int i, int i2) {
        Object[] objArr = {str, str2, pair, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69805161f1b0d0b34cfcafe21587548", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69805161f1b0d0b34cfcafe21587548")).booleanValue();
        }
        if (b(str) && b(str2)) {
            return false;
        }
        com.sankuai.xm.log.c.d("SecurityVideoRecorder", "onEnd::failed in encrypting", new Object[0]);
        return true;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c0616d4d2edd85b8d00e175acddf11", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c0616d4d2edd85b8d00e175acddf11")).booleanValue();
        }
        if (CryptoProxy.c().c(str)) {
            String str2 = str + ".temp";
            if (!k.b(str, str2) || CryptoProxy.c().a(str2, str, 2) != 0) {
                com.sankuai.xm.recorder.c cVar = this.e;
                if (cVar != null) {
                    cVar.a(20, "failed in encrypting file " + str);
                }
                return false;
            }
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a implements com.sankuai.xm.recorder.c {
        public static ChangeQuickRedirect a;
        public com.sankuai.xm.recorder.c b;
        public String c;
        public String d;

        public a(com.sankuai.xm.recorder.c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec93046c41458fd1a0fda6d4f96300d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec93046c41458fd1a0fda6d4f96300d0");
            } else {
                this.b = cVar;
            }
        }

        @Override // com.sankuai.xm.recorder.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f947d59e8710cad6671ec689dbf00a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f947d59e8710cad6671ec689dbf00a");
            } else if (this.b != null) {
                this.b.a();
            }
        }

        @Override // com.sankuai.xm.recorder.c
        public final void a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290701daffc47d27cedcdeca5e56a390", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290701daffc47d27cedcdeca5e56a390");
                return;
            }
            this.c = str;
            this.d = str2;
            if (this.b != null) {
                this.b.a(str, str2);
            }
        }

        @Override // com.sankuai.xm.recorder.c
        public final void b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d77b3c8caf73bb0a9e0a189b9f609a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d77b3c8caf73bb0a9e0a189b9f609a");
                return;
            }
            b();
            if (this.b != null) {
                this.b.b(str, str2);
            }
        }

        @Override // com.sankuai.xm.recorder.c
        public final void a(String str, String str2, int i, int i2, short s, short s2, int i3, int i4) {
            Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Short.valueOf(s), Short.valueOf(s2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03cc2da0a30fe6fb587ed408bddd3c37", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03cc2da0a30fe6fb587ed408bddd3c37");
            } else if (this.b != null) {
                this.b.a(str, str2, i, i2, s, s2, i3, i4);
            }
        }

        @Override // com.sankuai.xm.recorder.c
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466163a94ae4df35d683e2f3de3fd2ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466163a94ae4df35d683e2f3de3fd2ff");
                return;
            }
            b();
            if (this.b != null) {
                this.b.a(i, str);
            }
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d69a4afb6f929cb6b1c79f1494cc44", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d69a4afb6f929cb6b1c79f1494cc44");
            } else if (CryptoProxy.c().a()) {
                k.e(this.c);
                k.e(this.d);
            }
        }
    }
}
