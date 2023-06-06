package com.sankuai.waimai.store.mrn.preload;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private final Lock b;
    private final c c;
    private final b d;
    private final e e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(@NonNull m<T> mVar);

        void b(@NonNull m mVar);
    }

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cf1e988af2f26dafc8bba3ab4369c46", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cf1e988af2f26dafc8bba3ab4369c46") : d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class d {
        private static final l a = new l();
    }

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "184eec440fc702a2bd4654d1368522a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "184eec440fc702a2bd4654d1368522a5");
            return;
        }
        this.b = new ReentrantLock();
        this.c = new c();
        this.d = new b();
        this.e = new e();
    }

    public final boolean a(p pVar) {
        boolean z = true;
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12fa1076eb004da8d7ac8547a37770c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12fa1076eb004da8d7ac8547a37770c7")).booleanValue();
        }
        if (pVar == null) {
            return false;
        }
        try {
            this.b.lock();
            e eVar = this.e;
            String str = pVar.b;
            long j = pVar.c;
            Object[] objArr2 = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "9e583022b4ce5cc9f610baf09b94434b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "9e583022b4ce5cc9f610baf09b94434b")).booleanValue();
            } else {
                if (str != null && !"".equals(str)) {
                    e.a aVar = eVar.b.get(str);
                    if (aVar == null) {
                        eVar.b.put(str, new e.a(j, n.PROCESSING));
                    } else if (j >= aVar.b) {
                        aVar.b = j;
                        aVar.c = n.PROCESSING;
                    }
                }
                z = false;
            }
            return z;
        } finally {
            this.b.unlock();
        }
    }

    @NonNull
    public final o a(p pVar, a aVar) {
        m mVar;
        o oVar;
        e.a aVar2;
        Object[] objArr = {pVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe135d495d82fd18174a62df25a8b507", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe135d495d82fd18174a62df25a8b507");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        n nVar = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f156cdb866567e12fe9e76d0c4aaf4d9", RobustBitConfig.DEFAULT_VALUE)) {
            mVar = (m) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f156cdb866567e12fe9e76d0c4aaf4d9");
        } else {
            m mVar2 = new m();
            mVar2.b = null;
            mVar2.c = null;
            mVar2.e = null;
            mVar2.f = null;
            mVar = mVar2;
        }
        Object[] objArr3 = {mVar};
        ChangeQuickRedirect changeQuickRedirect3 = o.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9c14731db0c3738f715b42dabe79c38d", RobustBitConfig.DEFAULT_VALUE)) {
            oVar = (o) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9c14731db0c3738f715b42dabe79c38d");
        } else {
            o oVar2 = new o();
            oVar2.b = null;
            oVar2.c = mVar;
            oVar = oVar2;
        }
        if (pVar == null) {
            return oVar;
        }
        try {
            this.b.lock();
            e eVar = this.e;
            String str = pVar.b;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "b3e2727d60d6878b4cb053e5259604ed", RobustBitConfig.DEFAULT_VALUE)) {
                nVar = (n) PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "b3e2727d60d6878b4cb053e5259604ed");
            } else if (str != null && !"".equals(str) && (aVar2 = eVar.b.get(str)) != null) {
                nVar = aVar2.c;
            }
            oVar.b = nVar;
            c cVar = this.c;
            String str2 = pVar.b;
            Object[] objArr5 = {str2};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            oVar.c = PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "bdc664fcdf4e1efee9a674e72ba971f5", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "bdc664fcdf4e1efee9a674e72ba971f5") : cVar.b.get(str2);
            if (n.PROCESSING == oVar.b) {
                b bVar = this.d;
                String str3 = pVar.b;
                Object[] objArr6 = {str3, aVar};
                ChangeQuickRedirect changeQuickRedirect6 = b.a;
                if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "e0da3633ed120e9d0bd2342781571587", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "e0da3633ed120e9d0bd2342781571587");
                } else {
                    bVar.b.put(str3, aVar);
                }
            } else if (n.SUCCESS == oVar.b || n.FAILED == oVar.b) {
                this.e.a(pVar.b);
                this.c.a(pVar.b);
            }
            return oVar;
        } finally {
            this.b.unlock();
        }
    }

    public final void a(p pVar, m mVar) {
        Object[] objArr = {pVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94982a3e21b3ddbaf22a0301a6661812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94982a3e21b3ddbaf22a0301a6661812");
        } else if (pVar == null || mVar == null) {
        } else {
            a(pVar.b, pVar.c, n.SUCCESS, mVar);
        }
    }

    public final void b(p pVar, m mVar) {
        Object[] objArr = {pVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4385a07d4d244ca808ff331696c648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4385a07d4d244ca808ff331696c648");
        } else if (pVar == null || mVar == null) {
        } else {
            a(pVar.b, pVar.c, n.FAILED, mVar);
        }
    }

    private void a(String str, long j, n nVar, @NonNull m mVar) {
        Object[] objArr = {str, new Long(j), nVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7103a81755033b8c648c313102f33de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7103a81755033b8c648c313102f33de");
            return;
        }
        try {
            this.b.lock();
            if (this.e.a(str, j, nVar)) {
                a a2 = this.d.a(str);
                if (a2 != null) {
                    if (nVar == n.SUCCESS) {
                        a2.a(mVar);
                    } else {
                        a2.b(mVar);
                    }
                    this.d.b(str);
                    this.c.a(str);
                    this.e.a(str);
                    return;
                }
                this.c.a(str, mVar);
            }
        } finally {
            this.b.unlock();
        }
    }

    public final void b(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b70cf25b8f13ec704e23903e7ebdf63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b70cf25b8f13ec704e23903e7ebdf63");
        } else if (pVar == null) {
        } else {
            try {
                this.b.lock();
                this.d.b(pVar.b);
                this.c.a(pVar.b);
                this.e.a(pVar.b);
            } finally {
                this.b.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c {
        public static ChangeQuickRedirect a;
        final Map<String, m> b;

        private c() {
            Object[] objArr = {l.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85172ee23415c33b679ecd6e10349ca6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85172ee23415c33b679ecd6e10349ca6");
            } else {
                this.b = new HashMap();
            }
        }

        public final void a(String str, m mVar) {
            Object[] objArr = {str, mVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946aa25e8f693d98424180261b53945a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946aa25e8f693d98424180261b53945a");
            } else {
                this.b.put(str, mVar);
            }
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8922e2be175383bac2b4f042521d699", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8922e2be175383bac2b4f042521d699");
            } else {
                this.b.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b {
        public static ChangeQuickRedirect a;
        final Map<String, a> b;

        private b() {
            Object[] objArr = {l.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a0f2de4d6a93a6798ca4a4896b0c39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a0f2de4d6a93a6798ca4a4896b0c39");
            } else {
                this.b = new HashMap();
            }
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd16e15450b028f8eb749d6932f796a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd16e15450b028f8eb749d6932f796a") : this.b.get(str);
        }

        public final void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd075dfc9fe2c1e5f422b99f4efbbaa3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd075dfc9fe2c1e5f422b99f4efbbaa3");
            } else {
                this.b.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class e {
        public static ChangeQuickRedirect a;
        final Map<String, a> b;

        private e() {
            Object[] objArr = {l.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d9128ee1d474db205ed6c1272dffb4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d9128ee1d474db205ed6c1272dffb4");
            } else {
                this.b = new HashMap();
            }
        }

        public final boolean a(String str, long j, n nVar) {
            a aVar;
            Object[] objArr = {str, new Long(j), nVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd0ad408946f511b7e6eac60b42bbc7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd0ad408946f511b7e6eac60b42bbc7")).booleanValue();
            }
            if (str == null || "".equals(str) || (aVar = this.b.get(str)) == null || j != aVar.b) {
                return false;
            }
            aVar.c = nVar;
            return true;
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28785450de07933b4c770682196618ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28785450de07933b4c770682196618ce");
            } else if (str == null || "".equals(str)) {
            } else {
                this.b.remove(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public class a {
            public static ChangeQuickRedirect a;
            long b;
            n c;

            private a(long j, n nVar) {
                Object[] objArr = {e.this, new Long(j), nVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d14e8a7a2774c22971886ba28dd925b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d14e8a7a2774c22971886ba28dd925b");
                    return;
                }
                this.b = j;
                this.c = nVar;
            }
        }
    }
}
