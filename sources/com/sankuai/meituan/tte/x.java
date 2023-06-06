package com.sankuai.meituan.tte;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.e;
import com.sankuai.meituan.tte.q;
import com.tencent.mapsdk.internal.ki;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class x {
    public static ChangeQuickRedirect a = null;
    @SuppressLint({"StaticFieldLeak"})
    public static volatile Context b = null;
    public static volatile boolean c = false;
    private static final com.sankuai.meituan.tte.b<b, x> e = new com.sankuai.meituan.tte.b<b, x>() { // from class: com.sankuai.meituan.tte.x.1
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.meituan.tte.b
        public final /* synthetic */ x b(b bVar) {
            b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d907e0d349b9fd3cbc61617b1baedc90", RobustBitConfig.DEFAULT_VALUE) ? (x) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d907e0d349b9fd3cbc61617b1baedc90") : new x(bVar2);
        }
    };
    private static final AtomicBoolean h = new AtomicBoolean();
    public final n d;
    private final b f;
    private final s g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum d {
        PROD,
        TEST;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7187c7a096ac543b657ee13c1a328df1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7187c7a096ac543b657ee13c1a328df1");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "152382cd01ab532c746e4016499ae290", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "152382cd01ab532c746e4016499ae290") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93dff3cab21c41ac80d0c5cbc36b72e8", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93dff3cab21c41ac80d0c5cbc36b72e8") : (d[]) values().clone();
        }

        public static d a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cff5bb07b195fbc9445161c6e32d3c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cff5bb07b195fbc9445161c6e32d3c1");
            }
            if (i == PROD.ordinal()) {
                return PROD;
            }
            if (i == TEST.ordinal()) {
                return TEST;
            }
            throw new IllegalArgumentException("Unknown env code: " + i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        SM(c.SM4_GCM),
        FIPS(c.AES_GCM);
        
        public static ChangeQuickRedirect a;
        public c d;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b8086bd711eeef79752a6b28be288ca", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b8086bd711eeef79752a6b28be288ca") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a543ff8befa97584fe62a8fb2e4a3a4", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a543ff8befa97584fe62a8fb2e4a3a4") : (a[]) values().clone();
        }

        a(c cVar) {
            Object[] objArr = {r10, Integer.valueOf(r11), cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84eed04372a976e78b5a68f6930bd7d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84eed04372a976e78b5a68f6930bd7d3");
            } else {
                this.d = cVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        SM4_GCM(8, "SM4"),
        AES_GCM(3, "AES");
        
        public static ChangeQuickRedirect a;
        public int d;
        public String e;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c034813196275395704701ad35bca483", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c034813196275395704701ad35bca483") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cc3f70888945e39af8c240c788d04e5", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cc3f70888945e39af8c240c788d04e5") : (c[]) values().clone();
        }

        c(int i, String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f250fdb9139d5e38a392c78dc6983a17", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f250fdb9139d5e38a392c78dc6983a17");
                return;
            }
            this.d = i;
            this.e = str;
        }

        public static c a(int i) throws com.sankuai.meituan.tte.c {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7982e32bbfa96b35ba651122b3e6a75a", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7982e32bbfa96b35ba651122b3e6a75a");
            }
            if (i == SM4_GCM.d) {
                return SM4_GCM;
            }
            if (i == AES_GCM.d) {
                return AES_GCM;
            }
            throw new com.sankuai.meituan.tte.c("Unsupported cipher type: " + i, -10101);
        }

        public final q a() throws com.sankuai.meituan.tte.c {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971c303028d0265822f88ba445c52c05", RobustBitConfig.DEFAULT_VALUE)) {
                return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971c303028d0265822f88ba445c52c05");
            }
            if (this == SM4_GCM) {
                return q.c.a();
            }
            if (this == AES_GCM) {
                return new q.a();
            }
            throw new com.sankuai.meituan.tte.c("Unsupported cipher: " + this, -10101);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public final d b;
        public final a c;
        public final String d;

        private b(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2a147eafd11a351b202db07bee6cdd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2a147eafd11a351b202db07bee6cdd");
                return;
            }
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = TextUtils.isEmpty(aVar.d) ? "default" : aVar.d;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2298d1be4e6c2a8a6605e13c1f62057", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2298d1be4e6c2a8a6605e13c1f62057")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b == bVar.b && this.c == bVar.c) {
                return this.d != null ? this.d.equals(bVar.d) : bVar.d == null;
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c333e28dd5a3689c1e77d658a5adedc9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c333e28dd5a3689c1e77d658a5adedc9")).intValue();
            }
            return ((((this.b != null ? this.b.hashCode() : 0) * 31) + (this.c != null ? this.c.hashCode() : 0)) * 31) + (this.d != null ? this.d.hashCode() : 0);
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba61a214d53ef446be4a0b88ef46441", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba61a214d53ef446be4a0b88ef46441");
            }
            return "[" + this.c + ", " + this.b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }

        public static a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48760eb41d28083bc9e68d43dccd8311", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48760eb41d28083bc9e68d43dccd8311") : new a();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static final class a {
            public static ChangeQuickRedirect a;
            public d b;
            public a c;
            public String d;

            public a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9a6e3509c48e49bd8c54538953504e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9a6e3509c48e49bd8c54538953504e");
                    return;
                }
                this.b = d.PROD;
                this.c = a.SM;
            }

            public final b a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f0c766de53c016d27d0039d5bb5180", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f0c766de53c016d27d0039d5bb5180") : new b(this);
            }
        }
    }

    @Nullable
    public static Context a() {
        return b;
    }

    public static x a(@NonNull Context context, @NonNull b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0917d68991443ccae882c4742ace714", RobustBitConfig.DEFAULT_VALUE)) {
            return (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0917d68991443ccae882c4742ace714");
        }
        if (b == null) {
            b = context.getApplicationContext();
            w.b = true;
        }
        return e.a(bVar);
    }

    private x(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b0bce080c55216ef2df8ff8664e2d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b0bce080c55216ef2df8ff8664e2d8");
            return;
        }
        this.f = bVar;
        this.g = s.a(bVar);
        this.d = new n(bVar, this.g);
    }

    public static void a(@NonNull final Context context, long j) {
        Object[] objArr = {context, 500L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f59acb2d60058c8476669907973ebf54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f59acb2d60058c8476669907973ebf54");
        } else if (h.compareAndSet(false, true)) {
            if (b == null) {
                b = context.getApplicationContext();
                w.b = true;
            }
            g.c().execute(new Runnable() { // from class: com.sankuai.meituan.tte.x.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecc5d35c3411aba99fbb7da640adc744", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecc5d35c3411aba99fbb7da640adc744");
                    } else {
                        e.a(context);
                    }
                }
            });
            g.c().schedule(new Runnable() { // from class: com.sankuai.meituan.tte.x.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    a[] valuesCustom;
                    d[] valuesCustom2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78e8b38a784638adb77c3229a164a192", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78e8b38a784638adb77c3229a164a192");
                        return;
                    }
                    for (a aVar : a.valuesCustom()) {
                        e.a a2 = e.a(context).a(aVar);
                        if (a2.b || a2.h) {
                            u.c(ki.m, "skip launch task: " + aVar);
                            return;
                        }
                        for (d dVar : x.c ? d.valuesCustom() : new d[]{d.PROD}) {
                            Context context2 = context;
                            b.a b2 = b.b();
                            b2.c = aVar;
                            b2.b = dVar;
                            try {
                                x.a(context2, b2.a()).g.a();
                            } catch (Throwable th) {
                                u.b(ki.m, "get key error", th);
                            }
                        }
                    }
                }
            }, 500L, TimeUnit.MILLISECONDS);
        }
    }
}
