package com.meituan.android.customerservice.cscallsdk.inner;

import com.meituan.android.customerservice.callbase.base.f;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.cscallsdk.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements e, Cloneable {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public byte e;
    public String f;
    public ArrayList<f> g;
    public byte h;
    public long i;
    public boolean j;
    private int k;
    private int l;
    private long m;
    private long n;
    private long o;
    private HashSet<f> p;
    private boolean q;
    private List<e.a> r;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8abb509b860b78ef35f479a01157df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8abb509b860b78ef35f479a01157df");
            return;
        }
        this.k = 0;
        this.l = 0;
        this.n = 0L;
        this.p = new HashSet<>();
        this.h = (byte) 0;
        this.r = new CopyOnWriteArrayList();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f62983135ac1f633830f841057dcd3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f62983135ac1f633830f841057dcd3") : (c) super.clone();
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e80c783983f734896a4e9a101c46c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e80c783983f734896a4e9a101c46c0");
        } else {
            this.i = j;
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final String a() {
        return this.d;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final String b() {
        return this.c;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final boolean g() {
        return this.j;
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final String c() {
        return this.b;
    }

    public final synchronized HashSet<f> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaa6d2f7800b25126d71207830ecdd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaa6d2f7800b25126d71207830ecdd9");
        }
        HashSet<f> hashSet = new HashSet<>();
        if (!this.p.isEmpty()) {
            Iterator<f> it = this.p.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().a());
            }
        }
        Class<?> cls = getClass();
        CallLog.log(cls, "getMeetingMembers " + b(hashSet));
        return hashSet;
    }

    private String b(HashSet<f> hashSet) {
        Object[] objArr = {hashSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a117916bd85f3a267a1e63811000d511", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a117916bd85f3a267a1e63811000d511");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (hashSet.size() > 0) {
            Iterator<f> it = hashSet.iterator();
            while (it.hasNext()) {
                f next = it.next();
                sb.append("{ mber: ");
                sb.append(next.c);
                sb.append(" role: ");
                sb.append((int) next.d);
                sb.append(" status: ");
                sb.append((int) next.g);
                sb.append(" fmber: ");
                sb.append(next.h);
                sb.append(" type: ");
                sb.append((int) next.e);
                sb.append(" change: ");
                sb.append(next.i);
                sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            }
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public final synchronized void a(HashSet<f> hashSet) {
        Object[] objArr = {hashSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfccf3642e68cf7425753e81dcd53b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfccf3642e68cf7425753e81dcd53b83");
            return;
        }
        this.p.clear();
        this.p.addAll(hashSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b387ac91ef5f861936264763d4960d69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b387ac91ef5f861936264763d4960d69")).booleanValue();
        }
        synchronized (this) {
            switch (i) {
                case 0:
                    if (this.k != 0) {
                        b(i);
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (this.k == 0) {
                        b(i);
                        this.h = (byte) 1;
                        return true;
                    }
                    z = false;
                    break;
                case 2:
                    if (this.k == 0) {
                        b(i);
                        this.h = (byte) 2;
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (this.k == 1 || this.k == 2) {
                        b(i);
                        break;
                    }
                    z = false;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z && this.r != null && this.r.size() != 0) {
                for (e.a aVar : this.r) {
                    aVar.a(this.l, this.k);
                }
            }
            return z;
        }
    }

    public final synchronized boolean i() {
        return this.q;
    }

    public final synchronized void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896d981c591e252b386846dad0ff0a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896d981c591e252b386846dad0ff0a5a");
            return;
        }
        this.q = true;
        this.k = 0;
        this.l = 0;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.e = (byte) 0;
        this.i = 0L;
        this.b = "";
        this.c = "";
        this.j = false;
        this.p.clear();
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10bac1a3280dfad894481e1eb8786885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10bac1a3280dfad894481e1eb8786885");
        } else if (this.k == i) {
        } else {
            this.l = this.k;
            this.k = i;
            switch (i) {
                case 0:
                    this.o = l();
                    return;
                case 1:
                    this.q = false;
                    this.m = l();
                    return;
                case 2:
                    this.q = false;
                    this.m = l();
                    return;
                case 3:
                    this.n = l();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final synchronized int d() {
        return this.k;
    }

    public final synchronized int k() {
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[RETURN] */
    @Override // com.meituan.android.customerservice.cscallsdk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.customerservice.cscallsdk.inner.c.a
            java.lang.String r10 = "0579235908373d8c08cddd34aba4eee1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r9, r0, r10)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L1f:
            int r1 = r13.k
            r2 = 3
            r3 = 0
            if (r1 != r2) goto L2b
            long r0 = r13.l()
            goto L5a
        L2b:
            long r1 = r13.n
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L5e
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r2 = com.meituan.android.customerservice.cscallsdk.inner.c.a
            java.lang.String r12 = "9bc6d8ba441a9b189c6aef86661cf9c4"
            r8 = 0
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r1
            r6 = r13
            r7 = r2
            r9 = r12
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)
            if (r5 == 0) goto L4f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r13, r2, r0, r12)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            goto L5a
        L4f:
            int r0 = r13.k
            if (r0 == 0) goto L58
            long r0 = r13.l()
            goto L5a
        L58:
            long r0 = r13.o
        L5a:
            long r5 = r13.n
            long r0 = r0 - r5
            goto L5f
        L5e:
            r0 = r3
        L5f:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L64
            return r3
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.cscallsdk.inner.c.e():long");
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final long f() {
        return this.n;
    }

    private long l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef70db16dac39546775a26c68c9e885", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef70db16dac39546775a26c68c9e885")).longValue() : System.currentTimeMillis();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final void a(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f366c7d71a00918913d73d31a6be2a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f366c7d71a00918913d73d31a6be2a58");
            return;
        }
        b(aVar);
        this.r.add(aVar);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e
    public final void b(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657cdd6c98df0035b11130bbccea8ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657cdd6c98df0035b11130bbccea8ed3");
        } else {
            this.r.remove(aVar);
        }
    }
}
