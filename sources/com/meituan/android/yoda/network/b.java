package com.meituan.android.yoda.network;

import android.content.Context;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.network.retrofit.d;
import com.meituan.android.yoda.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b extends com.meituan.android.yoda.network.a {
    public static ChangeQuickRedirect d = null;
    private static final String e = "b";
    private static m h;
    private com.meituan.android.yoda.network.a f;
    private AtomicBoolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static b a = new b();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9053fd757dc4222f8eda0558b60182", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9053fd757dc4222f8eda0558b60182");
        } else {
            this.g = new AtomicBoolean(false);
        }
    }

    public static b e() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.yoda.network.a
    /* renamed from: b */
    public synchronized b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f871629f027712c084e79660fe41b9a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f871629f027712c084e79660fe41b9a7");
        }
        if (this.g.compareAndSet(false, true)) {
            this.f = d.a.a.a(context.getApplicationContext());
            com.meituan.android.yoda.plugins.d a2 = com.meituan.android.yoda.plugins.d.a();
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            com.meituan.android.yoda.interfaces.e cVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0e5012e7419fad8c4f8ef6fc435a0889", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.yoda.interfaces.e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0e5012e7419fad8c4f8ef6fc435a0889") : new c(this);
            Object[] objArr3 = {cVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.plugins.d.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "12685673df76adfd6811e55d966becf7", RobustBitConfig.DEFAULT_VALUE)) {
                com.meituan.android.yoda.plugins.d dVar = (com.meituan.android.yoda.plugins.d) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "12685673df76adfd6811e55d966becf7");
            } else if (cVar != null) {
                a2.c.add(cVar);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = m.a;
            h = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "79587aab6457bdcc57948398246b0cc8", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "79587aab6457bdcc57948398246b0cc8") : new m();
        }
        String str = e;
        com.meituan.android.yoda.monitor.log.a.a(str, "init, mNetworkHelper:" + this.f, false);
        return this;
    }

    @Override // com.meituan.android.yoda.network.a
    public final synchronized com.meituan.android.yoda.network.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a55c3862cc8ef979ddaa84883bed428", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.yoda.network.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a55c3862cc8ef979ddaa84883bed428");
        }
        if (this.f != null) {
            this.f.c();
        }
        return this;
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bcfd30d0e7a31300e658152bff970d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bcfd30d0e7a31300e658152bff970d9");
        } else {
            a(d.a(this, str, hVar));
        }
    }

    public static /* synthetic */ void a(b bVar, String str, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49884ff91bf8a3b381f21fbc5258d06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49884ff91bf8a3b381f21fbc5258d06c");
        } else if (bVar.f != null) {
            bVar.f.a(str, hVar);
        }
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, int i, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ecacde37dfbe5e069e29e1eefcdd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ecacde37dfbe5e069e29e1eefcdd50");
        } else {
            a(e.a(this, str, i, str2, str3, str4, z, hashMap, hVar));
        }
    }

    public static /* synthetic */ void b(b bVar, String str, int i, String str2, String str3, String str4, boolean z, HashMap hashMap, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8f6783a37f788883411d63c18e18cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8f6783a37f788883411d63c18e18cc2");
        } else if (bVar.f != null) {
            bVar.f.a(str, i, str2, str3, str4, z, hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.network.a
    public final void b(String str, int i, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7658efdb679a318775327511ae424f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7658efdb679a318775327511ae424f44");
        } else {
            a(f.a(this, str, i, str2, str3, str4, z, hashMap, hVar));
        }
    }

    public static /* synthetic */ void a(b bVar, String str, int i, String str2, String str3, String str4, boolean z, HashMap hashMap, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53510d6d837bc41aee39dfa26a930373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53510d6d837bc41aee39dfa26a930373");
        } else if (bVar.f != null) {
            bVar.f.b(str, i, str2, str3, str4, z, hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, int i, String str2, String str3, String str4, File file, String str5, boolean z, HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, str4, file, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891a93282abfc895a44f7b624542ad68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891a93282abfc895a44f7b624542ad68");
        } else {
            a(g.a(this, str, i, str2, str3, str4, file, str5, z, hashMap, hVar));
        }
    }

    public static /* synthetic */ void a(b bVar, String str, int i, String str2, String str3, String str4, File file, String str5, boolean z, HashMap hashMap, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, Integer.valueOf(i), str2, str3, str4, file, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48e83de6bed7fffaf246e8d7f97eb951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48e83de6bed7fffaf246e8d7f97eb951");
        } else if (bVar.f != null) {
            bVar.f.a(str, i, str2, str3, str4, file, str5, z, hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.network.a
    public final void a(String str, String str2, com.meituan.android.yoda.interfaces.h<ap> hVar) {
        Object[] objArr = {str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181febb7532e8a70ebb32b97ed4f1f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181febb7532e8a70ebb32b97ed4f1f9c");
        } else {
            a(h.a(this, str, str2, hVar));
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8dfaf18cb24b631401ca5ca17c3a602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8dfaf18cb24b631401ca5ca17c3a602");
        } else if (bVar.f != null) {
            bVar.f.a(str, str2, hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb A[Catch: Exception -> 0x0337, TryCatch #2 {Exception -> 0x0337, blocks: (B:7:0x0047, B:11:0x007e, B:14:0x0086, B:16:0x0093, B:38:0x0127, B:47:0x01aa, B:49:0x01cb, B:51:0x01d1, B:52:0x01e5, B:56:0x0203, B:57:0x0213, B:59:0x0219, B:60:0x021d, B:78:0x0329, B:61:0x023b, B:63:0x0266, B:65:0x0272, B:67:0x028f, B:71:0x02c7, B:72:0x02d7, B:74:0x02dd, B:75:0x02e1, B:76:0x02fe, B:46:0x018e, B:36:0x010a, B:40:0x014f, B:41:0x0158, B:43:0x015e, B:18:0x0099, B:20:0x00ad, B:22:0x00bb, B:24:0x00c1, B:26:0x00dd, B:28:0x00e3, B:32:0x00f0, B:33:0x0104), top: B:88:0x0047, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0266 A[Catch: Exception -> 0x0337, TryCatch #2 {Exception -> 0x0337, blocks: (B:7:0x0047, B:11:0x007e, B:14:0x0086, B:16:0x0093, B:38:0x0127, B:47:0x01aa, B:49:0x01cb, B:51:0x01d1, B:52:0x01e5, B:56:0x0203, B:57:0x0213, B:59:0x0219, B:60:0x021d, B:78:0x0329, B:61:0x023b, B:63:0x0266, B:65:0x0272, B:67:0x028f, B:71:0x02c7, B:72:0x02d7, B:74:0x02dd, B:75:0x02e1, B:76:0x02fe, B:46:0x018e, B:36:0x010a, B:40:0x014f, B:41:0x0158, B:43:0x015e, B:18:0x0099, B:20:0x00ad, B:22:0x00bb, B:24:0x00c1, B:26:0x00dd, B:28:0x00e3, B:32:0x00f0, B:33:0x0104), top: B:88:0x0047, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.meituan.android.yoda.network.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.net.Network r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.meituan.android.yoda.interfaces.h<java.lang.String> r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.network.b.a(android.net.Network, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.meituan.android.yoda.interfaces.h, boolean):void");
    }

    private synchronized void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f538275a039e6941c96b3da4194b0fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f538275a039e6941c96b3da4194b0fd6");
            return;
        }
        if (h != null) {
            m mVar = h;
            Object[] objArr2 = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = m.a;
            if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "49970010a9923500d2a17b1203e1f1bf", RobustBitConfig.DEFAULT_VALUE)) {
                m mVar2 = (m) PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "49970010a9923500d2a17b1203e1f1bf");
            } else {
                Object[] objArr3 = {runnable, 0L};
                ChangeQuickRedirect changeQuickRedirect3 = m.a;
                if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "f4f56d9a5bb2b2d09a2651383c10d920", RobustBitConfig.DEFAULT_VALUE)) {
                    m mVar3 = (m) PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "f4f56d9a5bb2b2d09a2651383c10d920");
                } else if (!mVar.a()) {
                    mVar.c.execute(runnable);
                }
            }
        }
    }
}
