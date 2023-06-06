package com.dianping.nvlbservice;

import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.nvlbservice.f;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements f {
    public static ChangeQuickRedirect a;
    static com.dianping.monitor.e b;
    final List<e> c;
    final List<f.a> d;
    final AtomicBoolean e;
    long f;
    String g;
    private final List<h> h;
    private final d i;
    private m j;

    public c(@NonNull m mVar, @NonNull final d dVar) {
        Object[] objArr = {mVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9ff6d86d5f2ad2bb884491151fc01b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9ff6d86d5f2ad2bb884491151fc01b");
            return;
        }
        this.j = mVar;
        this.i = dVar;
        this.c = new ArrayList();
        this.c.add(new a());
        this.d = new ArrayList();
        this.h = new ArrayList();
        this.e = new AtomicBoolean();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fdc11ffa79ccdf47ddfdc110a697a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fdc11ffa79ccdf47ddfdc110a697a90");
        } else {
            switch (this.j) {
                case PIKE:
                case PIKE_IPV6:
                    this.h.addAll(l.c());
                    break;
                case QUIC:
                    this.h.addAll(l.b());
                    break;
                case SHARK:
                case SHARK_WHALE:
                    this.h.addAll(l.a());
                    break;
                default:
                    throw new IllegalStateException("HttpDnsService type is error");
            }
        }
        NVLinker.registerBackgroundStateListener(new NVLinker.AppBackgroundStateListener() { // from class: com.dianping.nvlbservice.c.1
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.NVLinker.AppBackgroundStateListener
            public final void onBackgroundStateChanged(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3ee815b440b523f576be42d992938c69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3ee815b440b523f576be42d992938c69");
                    return;
                }
                StringBuilder sb = new StringBuilder("HttpDnsService service ");
                sb.append(z ? "background" : "foreground");
                i.a("HttpDnsService", sb.toString());
                if (dVar != null) {
                    c.this.a(dVar.c());
                }
            }
        });
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e658942e27d1317c29aa5d8f8d74ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e658942e27d1317c29aa5d8f8d74ad");
        } else if (this.i == null || !this.i.a() || j < 0 || System.currentTimeMillis() < j + this.f) {
        } else {
            this.g = this.i.b();
            if (TextUtils.isEmpty(this.g)) {
                return;
            }
            if (!this.e.compareAndSet(false, true)) {
                i.a("HttpDnsService", "fetch is started.");
                return;
            }
            i.a("HttpDnsService", "fetch...");
            final Runnable runnable = new Runnable() { // from class: com.dianping.nvlbservice.c.3
                public static ChangeQuickRedirect a;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
                    	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
                    	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 471
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvlbservice.c.AnonymousClass3.run():void");
                }
            };
            Object[] objArr2 = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f37fdea4d85531a58ace48824bf945ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f37fdea4d85531a58ace48824bf945ba");
            } else if (Looper.getMainLooper() != Looper.myLooper()) {
                runnable.run();
            } else {
                rx.d.a(new rx.j<Object>() { // from class: com.dianping.nvlbservice.c.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final void onCompleted() {
                    }

                    @Override // rx.e
                    public final void onNext(Object obj) {
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a83e6e2240fcbef9c9211ac87c03798", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a83e6e2240fcbef9c9211ac87c03798");
                        } else {
                            i.a("HttpDnsService", th);
                        }
                    }
                }, rx.d.a((d.a) new d.a<Object>() { // from class: com.dianping.nvlbservice.c.5
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        rx.j jVar = (rx.j) obj;
                        Object[] objArr3 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a63c4459e8004f3ff61c9ff6d49f2c44", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a63c4459e8004f3ff61c9ff6d49f2c44");
                            return;
                        }
                        runnable.run();
                        jVar.onNext("");
                        jVar.onCompleted();
                    }
                }).b(rx.schedulers.a.e()));
            }
        }
    }

    boolean a(IResponse iResponse) {
        boolean z = false;
        Object[] objArr = {iResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d47a851d7d958b62f0b32fd1c49ec9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d47a851d7d958b62f0b32fd1c49ec9a")).booleanValue();
        }
        try {
            if (iResponse.result() == null || !iResponse.isSuccess()) {
                return false;
            }
            String str = new String(iResponse.result(), "UTF-8");
            i.b("HttpDnsService", "HttpDnsService:" + str);
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("state"))) {
                if (this.j == m.PIKE) {
                    a(m.PIKE, a(jSONObject.optJSONArray("ipv4")));
                    a(m.PIKE_IPV6, a(jSONObject.optJSONArray("ipv6")));
                } else {
                    Set<String> a2 = a(jSONObject.optJSONArray("ipv4"));
                    a2.addAll(a(jSONObject.optJSONArray("ipv6")));
                    a(this.j, a2);
                }
                try {
                    i.b("HttpDnsService", "HttpDnsService result :: " + jSONObject);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    i.a("HttpDnsService", th);
                    if (iResponse.result() != null) {
                        i.b("HttpDnsService", new String(iResponse.result()));
                    } else {
                        i.b("HttpDnsService", "HttpDnsService: resp null");
                    }
                    return z;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.dianping.nvlbservice.f
    public final List<h> a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd76d07462b5ba4a4f7844a024bb2c6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd76d07462b5ba4a4f7844a024bb2c6") : a(mVar);
    }

    private List<h> a(m... mVarArr) {
        Object[] objArr = {mVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c0c8a74c21c3ceb51695f57eb947d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c0c8a74c21c3ceb51695f57eb947d9");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            try {
                Collection<h> b2 = b(mVarArr[0]);
                if (!b2.isEmpty()) {
                    arrayList.addAll(b2);
                }
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(a(this.h, mVarArr));
            return arrayList;
        }
        return arrayList;
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b06638bec3179cb367e39fb0075b411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b06638bec3179cb367e39fb0075b411");
        } else if (eVar == null || this.c.contains(eVar)) {
        } else {
            this.c.add(0, eVar);
        }
    }

    @Override // com.dianping.nvlbservice.f
    public final void a(f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdeacc7f94e356077a0f6a826e017577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdeacc7f94e356077a0f6a826e017577");
        } else if (aVar == null || this.d.contains(aVar)) {
        } else {
            this.d.add(aVar);
        }
    }

    private List<h> a(List<h> list, m... mVarArr) {
        Object[] objArr = {list, mVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24934ab86741a7f70ac70a347a4e7975", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24934ab86741a7f70ac70a347a4e7975");
        }
        ArrayList arrayList = new ArrayList();
        for (m mVar : mVarArr) {
            List<h> a2 = k.a(mVar, list);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
        }
        return arrayList;
    }

    @NonNull
    private Collection<h> b(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25460bb27f0551aa0cc0cf52884a276", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25460bb27f0551aa0cc0cf52884a276");
        }
        HashSet hashSet = new HashSet();
        Set<String> b2 = q.a(NVLinker.getContext(), "shark_http_dns").b(c(mVar), new HashSet());
        if (b2 != null) {
            for (String str : b2) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(new h(str, 443, mVar.g));
                }
            }
        }
        return hashSet;
    }

    private void a(@NonNull m mVar, Set<String> set) {
        Object[] objArr = {mVar, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53955371fa70da53d3af27f70df588ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53955371fa70da53d3af27f70df588ca");
        } else {
            q.a(NVLinker.getContext(), "shark_http_dns").a(c(mVar), set);
        }
    }

    private String c(@NonNull m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be2d43ff291d13160ae565d2e6fc8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be2d43ff291d13160ae565d2e6fc8cd");
        }
        String str = this.g;
        if (TextUtils.isEmpty(str) && this.i != null) {
            str = this.i.b();
        }
        if (TextUtils.isEmpty(str)) {
            return mVar.h;
        }
        return mVar.h + CommonConstant.Symbol.MINUS + str;
    }

    private Set<String> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1ea6a40d5f7b8e5e7b3523f4bc73e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1ea6a40d5f7b8e5e7b3523f4bc73e4");
        }
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    hashSet.add(optString);
                }
            }
        }
        return hashSet;
    }
}
