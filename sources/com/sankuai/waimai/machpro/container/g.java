package com.sankuai.waimai.machpro.container;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPBridge;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.bridge.MPJSContext;
import com.sankuai.waimai.machpro.module.builtin.MPKNBModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.machpro.container.a {
    public static ChangeQuickRedirect d;
    b e;
    int f;
    String g;
    String h;
    com.sankuai.waimai.machpro.monitor.b i;
    boolean j;
    CacheException k;
    HashMap<String, com.sankuai.waimai.mach.manager.cache.c> l;
    com.sankuai.waimai.mach.manager.cache.c m;
    MachMap n;
    List<String> o;
    public com.sankuai.waimai.mach.lifecycle.a p;
    private long q;
    private a r;
    private com.sankuai.waimai.machpro.b s;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, MPJSCallBack mPJSCallBack);
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7e51a716496e96e2e1d47e7beb254e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7e51a716496e96e2e1d47e7beb254e");
        }
    }

    public g(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eeee1d8b1983aeac95850e9232dfec5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eeee1d8b1983aeac95850e9232dfec5");
            return;
        }
        this.f = 10000;
        this.n = new MachMap();
        this.o = new LinkedList();
        this.r = new a() { // from class: com.sankuai.waimai.machpro.container.g.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.container.g.a
            public final void a(final String str, final MPJSCallBack mPJSCallBack) {
                Object[] objArr2 = {str, mPJSCallBack};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f74db71bb7d96ec7a6446cd8bb21647", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f74db71bb7d96ec7a6446cd8bb21647");
                } else if (TextUtils.isEmpty(str) || g.this.m == null) {
                    if (mPJSCallBack != null) {
                        MachMap machMap = new MachMap();
                        machMap.put("errorMsg", "bundleName为空");
                        mPJSCallBack.invoke(machMap);
                    }
                } else {
                    com.sankuai.waimai.machpro.util.a.a("Mach Pro 开始加载子包 | " + str);
                    com.sankuai.waimai.mach.manager.a a2 = com.sankuai.waimai.mach.manager.a.a();
                    int i = g.this.f;
                    a.b bVar2 = new a.b() { // from class: com.sankuai.waimai.machpro.container.g.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.manager.a.b
                        public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.c cVar) {
                            Object[] objArr3 = {cVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2cf8be58d24955174138a04151033cf2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2cf8be58d24955174138a04151033cf2");
                                return;
                            }
                            if (g.this.b != null) {
                                com.sankuai.waimai.machpro.instance.a aVar = g.this.b;
                                Object[] objArr4 = {cVar};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.instance.a.a;
                                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "07a40a7026ff548c4e18939eb3afbbe3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "07a40a7026ff548c4e18939eb3afbbe3");
                                } else if (cVar != null) {
                                    aVar.e.addSubBundle(cVar.d, cVar);
                                    aVar.d.b.putAll(cVar.b);
                                    if (aVar.f != null) {
                                        aVar.f.a(cVar.c);
                                    }
                                }
                            }
                            if (mPJSCallBack != null) {
                                mPJSCallBack.invoke((MachMap) null);
                            }
                            if (g.this.l == null) {
                                g.this.l = new HashMap<>();
                            }
                            g.this.l.put(cVar.d, cVar);
                            if (g.this.e != null) {
                                g.this.e.b(cVar);
                            }
                            com.sankuai.waimai.machpro.monitor.c.a().a(cVar.d, cVar.e, cVar.n ? "2" : "1", g.this.e.az_());
                            com.sankuai.waimai.machpro.util.a.a("Mach Pro 子包加载成功：BundleName：" + cVar.d + " version：" + cVar.e);
                        }

                        @Override // com.sankuai.waimai.mach.manager.a.b
                        public final void a(@NonNull CacheException cacheException) {
                            Object[] objArr3 = {cacheException};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15c4d901035d961b36e65c3850862ab4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15c4d901035d961b36e65c3850862ab4");
                                return;
                            }
                            if (mPJSCallBack != null) {
                                MachMap machMap2 = new MachMap();
                                machMap2.put("errorMsg", cacheException.a());
                                mPJSCallBack.invoke(machMap2);
                            }
                            com.sankuai.waimai.mach.manager.a a3 = com.sankuai.waimai.mach.manager.a.a();
                            String str2 = str;
                            Object[] objArr4 = {str2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.mach.manager.a.a;
                            com.sankuai.waimai.machpro.monitor.c.a().a(str, PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "75c2cc53589ca37f9ef27bfc2f9e87a7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "75c2cc53589ca37f9ef27bfc2f9e87a7") : ((com.sankuai.waimai.mach.manager_new.b) a3.b).b(str2), g.this.a(cacheException, str), "3", g.this.e.az_());
                            com.sankuai.waimai.machpro.util.a.a("Mach Pro 子包加载失败：BundleName：" + str + "误码：" + g.this.a(cacheException, str));
                        }
                    };
                    com.sankuai.waimai.mach.manager.cache.c cVar = g.this.m;
                    boolean contains = g.this.o.contains(str);
                    Object[] objArr3 = {str, Integer.valueOf(i), bVar2, cVar, Byte.valueOf(contains ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.manager.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "131ab90e224614cbb7747a9e1730e86b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "131ab90e224614cbb7747a9e1730e86b");
                    } else {
                        a2.b.a(str, i, bVar2, cVar, contains);
                    }
                }
            }
        };
        this.s = new com.sankuai.waimai.machpro.b() { // from class: com.sankuai.waimai.machpro.container.g.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed5b669fdb61ef847456928e9ad65045", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed5b669fdb61ef847456928e9ad65045");
                } else {
                    super.a();
                }
            }

            @Override // com.sankuai.waimai.machpro.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30de96d0455e6c5e11b2d0b71062d06d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30de96d0455e6c5e11b2d0b71062d06d");
                } else {
                    super.b();
                }
            }

            @Override // com.sankuai.waimai.machpro.b
            public final void a(Throwable th) {
                com.sankuai.waimai.mach.manager.cache.c cVar;
                String[] split;
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f149d75ec97dd4ef52e620131bb389f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f149d75ec97dd4ef52e620131bb389f1");
                    return;
                }
                super.a(th);
                String a2 = com.sankuai.waimai.machpro.util.b.a(th, g.this.m, g.this.l);
                g gVar = g.this;
                Object[] objArr3 = {a2};
                ChangeQuickRedirect changeQuickRedirect3 = g.d;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "a199770b75a7a697d5e74e735eae0da4", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = (com.sankuai.waimai.mach.manager.cache.c) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "a199770b75a7a697d5e74e735eae0da4");
                } else {
                    if (!TextUtils.isEmpty(a2) && gVar.l != null) {
                        loop0: for (String str : a2.split("\n")) {
                            if (!TextUtils.isEmpty(str) && str.contains(gVar.m.d)) {
                                break;
                            }
                            for (com.sankuai.waimai.mach.manager.cache.c cVar2 : gVar.l.values()) {
                                if (!TextUtils.isEmpty(str) && str.contains(cVar2.d)) {
                                    cVar = cVar2;
                                    break loop0;
                                }
                            }
                        }
                    }
                    cVar = gVar.m;
                }
                com.sankuai.waimai.machpro.monitor.c a3 = com.sankuai.waimai.machpro.monitor.c.a();
                String str2 = g.this.b.B;
                String str3 = cVar.d;
                String str4 = cVar.e;
                String az_ = g.this.e.az_();
                Object[] objArr4 = {str2, str3, str4, a2, az_};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.monitor.c.a;
                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "0f2df311d8a71c44491b035a40539b68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "0f2df311d8a71c44491b035a40539b68");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("MPJSException", 1);
                    Map<String, String> b = a3.b();
                    b.put("bundle_name", str3);
                    b.put("bundle_version", str4);
                    b.put("biz", az_);
                    if (a3.b != null) {
                        a3.b.a(hashMap, b);
                        com.sankuai.waimai.mach.utils.e.a(str2, str3, str4, a2, null, true, false);
                    }
                }
                g.this.e.a(th);
            }
        };
        this.p = new com.sankuai.waimai.mach.lifecycle.a() { // from class: com.sankuai.waimai.machpro.container.g.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.lifecycle.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1f9cc2209115bfd1c1f0d1b57bc5b52", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1f9cc2209115bfd1c1f0d1b57bc5b52");
                } else if (g.this.b != null) {
                    g.this.b.a("applicationWillEnterForeground", null);
                    g.this.b.a("applicationDidBecomeActive", null);
                }
            }

            @Override // com.sankuai.waimai.mach.lifecycle.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7edfacbe48482a0c0390bc2fa6cb71bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7edfacbe48482a0c0390bc2fa6cb71bd");
                } else if (g.this.b != null) {
                    g.this.b.a("applicationWillResignActive", null);
                    g.this.b.a("applicationDidEnterBackground", null);
                }
            }
        };
        this.e = bVar;
        this.g = this.e.j();
        this.h = "***";
        this.i = new com.sankuai.waimai.machpro.monitor.b("MPPageLoadTime_" + this.g);
        this.b = new com.sankuai.waimai.machpro.instance.a(this.e.aA_());
        this.b.t = this.e.az_();
        this.b.q = this.i;
        com.sankuai.waimai.machpro.instance.a aVar = this.b;
        com.sankuai.waimai.machpro.b bVar2 = this.s;
        Object[] objArr2 = {bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a35e6d08bcca4202931e9058af28038a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a35e6d08bcca4202931e9058af28038a");
        } else if (bVar2 != null) {
            if (aVar.o == null) {
                aVar.o = new LinkedList<>();
            }
            aVar.o.add(bVar2);
        }
        this.b.s = this.r;
        com.sankuai.waimai.machpro.view.pool.a aVar2 = this.b.r;
        String str = this.g;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.view.pool.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "d1f9a9bcc09a33bd8a4da01944c59cf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "d1f9a9bcc09a33bd8a4da01944c59cf4");
        } else {
            aVar2.b = str;
            String a2 = l.a(aVar2.i, "mach_pro", aVar2.b, "");
            if (!TextUtils.isEmpty(a2)) {
                String[] split = a2.split(CommonConstant.Symbol.COMMA);
                if (split.length == 3) {
                    aVar2.c = com.sankuai.waimai.machpro.util.b.c((Object) split[0].trim());
                    aVar2.d = com.sankuai.waimai.machpro.util.b.c((Object) split[1].trim());
                    aVar2.e = com.sankuai.waimai.machpro.util.b.c((Object) split[2].trim());
                }
            }
        }
        com.sankuai.waimai.machpro.view.pool.a aVar3 = this.b.r;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.view.pool.a.a;
        if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "2ab53fbac69f4bf27c65837890b98a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "2ab53fbac69f4bf27c65837890b98a1e");
        } else {
            if (aVar3.j == null) {
                aVar3.j = new com.sankuai.waimai.machpro.view.pool.b();
            }
            if (aVar3.c > 0) {
                com.sankuai.waimai.machpro.view.pool.b bVar3 = aVar3.j;
                Context context = aVar3.i;
                int i = aVar3.c;
                Object[] objArr5 = {context, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.machpro.view.pool.b.a;
                if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "56b7f90f6f139f16ae77840c37a2a3a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "56b7f90f6f139f16ae77840c37a2a3a4");
                } else {
                    Message obtainMessage = bVar3.f.obtainMessage(1);
                    obtainMessage.arg1 = i;
                    obtainMessage.obj = new WeakReference(context);
                    bVar3.f.sendMessage(obtainMessage);
                }
            }
            if (aVar3.d > 0) {
                com.sankuai.waimai.machpro.view.pool.b bVar4 = aVar3.j;
                Context context2 = aVar3.i;
                int i2 = aVar3.d;
                Object[] objArr6 = {context2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.machpro.view.pool.b.a;
                if (PatchProxy.isSupport(objArr6, bVar4, changeQuickRedirect6, false, "8af4fe8b3f56e60bafbf31b68cce2aa5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar4, changeQuickRedirect6, false, "8af4fe8b3f56e60bafbf31b68cce2aa5");
                } else {
                    Message obtainMessage2 = bVar4.f.obtainMessage(2);
                    obtainMessage2.arg1 = i2;
                    obtainMessage2.obj = new WeakReference(context2);
                    bVar4.f.sendMessage(obtainMessage2);
                }
            }
            if (aVar3.e > 0) {
                com.sankuai.waimai.machpro.view.pool.b bVar5 = aVar3.j;
                Context context3 = aVar3.i;
                int i3 = aVar3.e;
                Object[] objArr7 = {context3, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.machpro.view.pool.b.a;
                if (PatchProxy.isSupport(objArr7, bVar5, changeQuickRedirect7, false, "a6219553e042f147d88ebc7519f84cfd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, bVar5, changeQuickRedirect7, false, "a6219553e042f147d88ebc7519f84cfd");
                } else {
                    Message obtainMessage3 = bVar5.f.obtainMessage(3);
                    obtainMessage3.arg1 = i3;
                    obtainMessage3.obj = new WeakReference(context3);
                    bVar5.f.sendMessage(obtainMessage3);
                }
            }
        }
        this.b.A = this.n;
        this.n.put("appLaunchTime", Long.valueOf(System.currentTimeMillis() - (SystemClock.elapsedRealtime() - TimeUtil.processStartElapsedTimeMillis())));
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1400c16d773270ad53be68ccc9818648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1400c16d773270ad53be68ccc9818648");
            return;
        }
        this.n.put("entryPageTime", Long.valueOf(System.currentTimeMillis()));
        this.q = SystemClock.elapsedRealtime();
        this.b.b = this.e.ay_();
        com.sankuai.waimai.mach.lifecycle.e.a().a(this.p);
        Uri h = h();
        if (h != null && !TextUtils.isEmpty(h.getQueryParameter("usePreset"))) {
            for (String str : h.getQueryParameter("usePreset").split(CommonConstant.Symbol.COMMA)) {
                String trim = str.trim();
                if (!TextUtils.isEmpty(trim)) {
                    this.o.add(trim);
                }
            }
        }
        i();
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e5f89a531fe6033fbcde1cd7265551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e5f89a531fe6033fbcde1cd7265551");
        } else {
            i();
        }
    }

    private Uri h() {
        Intent intent;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1654fd2125350c862f550a3d0b6caba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1654fd2125350c862f550a3d0b6caba8");
        }
        if (this.e instanceof Fragment) {
            if (((Fragment) this.e).getActivity() != null) {
                intent = ((Fragment) this.e).getActivity().getIntent();
            }
            intent = null;
        } else {
            if (this.e instanceof Activity) {
                intent = ((Activity) this.e).getIntent();
            }
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75bf34d48b4a81132557d15ef1f03ecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75bf34d48b4a81132557d15ef1f03ecf");
            return;
        }
        com.sankuai.waimai.machpro.util.a.a("开始加载Bundle | " + this.g);
        this.i.a("loadBundle_start");
        this.e.i();
        this.e.f();
        this.n.put("loadBundleStartTime", Long.valueOf(System.currentTimeMillis()));
        boolean contains = this.o.contains(this.g);
        Uri h = h();
        com.sankuai.waimai.mach.manager.a.a().a(this.g, this.f, this.c, h != null ? "1".equals(h.getQueryParameter("useCache")) : false, contains, new a.b() { // from class: com.sankuai.waimai.machpro.container.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager.a.b
            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7328ec2cac5c5e647c84427ccf49825", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7328ec2cac5c5e647c84427ccf49825");
                    return;
                }
                g.this.n.put("loadBundleEndTime", Long.valueOf(System.currentTimeMillis()));
                g.this.n.put("loadBundleHitCache", Boolean.valueOf(cVar.h));
                com.sankuai.waimai.machpro.util.a.a("Bundle加载成功 | " + g.this.g);
                g.this.m = cVar;
                g.this.h = cVar.e;
                g.this.j = true;
                g.this.i.a("loadBundle_end");
                g.this.e.g();
                com.sankuai.waimai.machpro.instance.a aVar = g.this.b;
                MachMap d2 = g.this.e.d();
                Object[] objArr3 = {cVar, d2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.instance.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d420dfab0bbf23d55a0ed519dc11036e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d420dfab0bbf23d55a0ed519dc11036e");
                } else {
                    try {
                        if (!aVar.g) {
                            MachMap machMap = new MachMap();
                            machMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, cVar.d);
                            machMap.put("bundleVersion", cVar.e);
                            aVar.a(machMap);
                            Object[] objArr4 = {cVar, d2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.instance.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "6723695bb04c829eed5cb7ceea1e7b53", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "6723695bb04c829eed5cb7ceea1e7b53");
                            } else if (cVar != null && cVar.b() && aVar.b != null) {
                                aVar.b.setClipChildren(false);
                                aVar.b.removeAllViews();
                                aVar.c = new FrameLayout(aVar.e.getContext());
                                aVar.c.setClipChildren(false);
                                aVar.b.addView(aVar.c, new FrameLayout.LayoutParams(-1, -1));
                                aVar.d = cVar;
                                aVar.e.setBundle(cVar);
                                aVar.p = SystemClock.elapsedRealtime();
                                if (aVar.A != null) {
                                    aVar.A.put("createEngineStartTime", Long.valueOf(System.currentTimeMillis()));
                                }
                                SystemClock.elapsedRealtime();
                                aVar.q.a("createJSEngine_start");
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.machpro.instance.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "610751e46ff047dc919076e3936bc18b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "610751e46ff047dc919076e3936bc18b");
                                } else {
                                    if (aVar.f != null) {
                                        aVar.d();
                                        aVar.f.b();
                                    }
                                    if (aVar.h != null) {
                                        aVar.h.onDestroy();
                                    }
                                    aVar.h = new MPBridge(aVar.e);
                                    aVar.f = new MPJSContext(aVar.h);
                                    aVar.f.d = aVar.C;
                                }
                                aVar.q.a("createJSEngine_end");
                                aVar.e.setJSContext(aVar.f);
                                aVar.n = d2;
                                aVar.f.b(d2);
                                if (aVar.i != null && aVar.i.size() > 0) {
                                    aVar.f.a(aVar.i);
                                }
                                if (aVar.j != null && aVar.j.size() > 0) {
                                    aVar.f.a(aVar.j);
                                }
                                if (aVar.A != null) {
                                    aVar.A.put("createEngineEndTime", Long.valueOf(System.currentTimeMillis()));
                                }
                                if (aVar.A != null) {
                                    aVar.A.put("executeJSStartTime", Long.valueOf(System.currentTimeMillis()));
                                }
                                SystemClock.elapsedRealtime();
                                aVar.q.a("executeJS_start");
                                if (aVar.d.c != null && aVar.d.c.length > 0) {
                                    aVar.f.a(aVar.d.c);
                                }
                                aVar.q.a("executeJS_end");
                                if (aVar.A != null) {
                                    aVar.A.put("executeJSEndTime", Long.valueOf(System.currentTimeMillis()));
                                    aVar.A.put("layoutStartTime", Long.valueOf(System.currentTimeMillis()));
                                }
                                if (aVar.e.getBodyComponent() != null) {
                                    aVar.c.addView(aVar.e.getBodyComponent().getView(), new FrameLayout.LayoutParams(-1, -1));
                                } else if (aVar.C != null) {
                                    aVar.C.a(new Exception("JS异常：Body = null！！！"));
                                }
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
                    }
                }
                g.this.e.a(cVar);
            }

            @Override // com.sankuai.waimai.mach.manager.a.b
            public final void a(@NonNull CacheException cacheException) {
                Object[] objArr2 = {cacheException};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec7bf59d3a304a62f13b4a58fa4696d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec7bf59d3a304a62f13b4a58fa4696d");
                    return;
                }
                g.this.i.a("loadBundle_end");
                g.this.e.g();
                g.this.e.h();
                g.this.e.a(cacheException);
                g.this.k = cacheException;
                com.sankuai.waimai.machpro.util.a.a("Mach Pro Bundle Load Failed! | " + g.this.g + cacheException.a());
            }
        });
    }

    public final int a(CacheException cacheException, String str) {
        Object[] objArr = {cacheException, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c42caa12b7827aa4614062bb1a265e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c42caa12b7827aa4614062bb1a265e1")).intValue();
        }
        if (this.o.contains(str)) {
            return 11;
        }
        int i = cacheException.c;
        switch (i) {
            case 17807:
                return 3;
            case 17808:
                return 4;
            case 17809:
                return 1;
            case 17810:
                return 2;
            default:
                switch (i) {
                    case 17901:
                        return 6;
                    case 17902:
                        return 7;
                    default:
                        return 5;
                }
        }
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c14f9203910902581a0412031ca3a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c14f9203910902581a0412031ca3a1");
            return;
        }
        super.d();
        if (this.b != null) {
            this.b.a("pageWillAppear", null);
            this.b.a("pageDidAppear", null);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e54ce2bea84bff1ac96879273e9c031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e54ce2bea84bff1ac96879273e9c031");
        } else {
            super.e();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66963091bbdacf4acb9db41c686ec5cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66963091bbdacf4acb9db41c686ec5cf");
        } else if (this.b != null) {
            this.b.a("pageWillDisappear", null);
            this.b.a("pageDidDisappear", null);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b18a0cb94c0d8b37fc752c9f123a4c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b18a0cb94c0d8b37fc752c9f123a4c1");
            return;
        }
        if (!this.j) {
            if (this.k != null) {
                com.sankuai.waimai.machpro.monitor.c.a().a(this.g, this.h, a(this.k, this.g), "3", this.e.az_());
            }
        } else {
            String str = this.m.n ? "2" : "1";
            if (this.o.contains(this.g)) {
                str = "10";
            }
            com.sankuai.waimai.machpro.monitor.c.a().a(this.g, this.h, str, this.e.az_());
        }
        com.sankuai.waimai.mach.lifecycle.e.a().b(this.p);
        com.sankuai.waimai.machpro.instance.a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e39016bb17a16dc3f018872bcd73d139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e39016bb17a16dc3f018872bcd73d139");
            return;
        }
        aVar.g = true;
        if (aVar.e.getBodyComponent() != null && aVar.e.getBodyComponent().getView() != null) {
            aVar.e.getBodyComponent().getView().removeAllViews();
        }
        if (aVar.h != null) {
            aVar.h.onDestroy();
        }
        if (aVar.f != null) {
            aVar.d();
            aVar.f.b();
        }
        if (aVar.y != null) {
            for (int size = aVar.y.size() - 1; size >= 0; size--) {
                aVar.y.get(size);
            }
            aVar.y.clear();
        }
        if (aVar.r != null) {
            com.sankuai.waimai.machpro.view.pool.a aVar2 = aVar.r;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.view.pool.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "32707a1d4efa395bbdf05310e7611ed6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "32707a1d4efa395bbdf05310e7611ed6");
            } else if (aVar2.j != null) {
                com.sankuai.waimai.machpro.view.pool.b bVar = aVar2.j;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.machpro.view.pool.b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "b7c8a9774802a33e785684b4c217da0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "b7c8a9774802a33e785684b4c217da0c");
                } else {
                    com.sankuai.waimai.machpro.util.a.d("viewcount->" + bVar.b.size() + "TextCount-->" + bVar.c.size() + "ImageCount-->" + bVar.d.size());
                    bVar.e = true;
                    bVar.f.removeCallbacksAndMessages(null);
                    bVar.g.removeCallbacksAndMessages(null);
                    bVar.b.clear();
                    bVar.c.clear();
                    bVar.d.clear();
                }
            }
        }
        com.sankuai.waimai.mach.utils.e.b = null;
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void a(FFPReportListener.IReportEvent iReportEvent) {
        String str;
        String str2;
        Object[] objArr = {iReportEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf11a065ce746c526232f5633019b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf11a065ce746c526232f5633019b67");
        } else if (iReportEvent != null) {
            String str3 = com.sankuai.waimai.machpro.f.a().i.d;
            String[] split = str3.split("\\.");
            if (split.length > 0) {
                if (split[split.length - 1].length() >= 3) {
                    str2 = str.charAt(0) + "xx";
                } else {
                    str2 = Constants.GestureMoveEvent.KEY_X;
                }
                str3 = str3.substring(0, str3.lastIndexOf(CommonConstant.Symbol.DOT)) + CommonConstant.Symbol.DOT + str2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("bundle_name", this.g);
            hashMap.put("platform", "android");
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, str3);
            hashMap.put("app_name", com.sankuai.waimai.machpro.f.a().i.b);
            com.sankuai.waimai.machpro.monitor.c a2 = com.sankuai.waimai.machpro.monitor.c.a();
            Object[] objArr2 = {iReportEvent, hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.monitor.c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a4935c3f59f3587078a7c2a37cc0bbd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a4935c3f59f3587078a7c2a37cc0bbd9");
            } else if (a2.b != null) {
                a2.b.a(iReportEvent, hashMap);
            }
            if (this.b != null) {
                MachMap machMap = new MachMap();
                machMap.put("startTime", Long.valueOf(iReportEvent.startTimeInMs()));
                machMap.put("endTime", Long.valueOf(iReportEvent.endTimeInMs()));
                machMap.put("costTime", Long.valueOf(iReportEvent.ffpInMs()));
                this.b.a("FFPResult", machMap);
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.container.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9c9ea4a64dd2c346dd83ed1cf634ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9c9ea4a64dd2c346dd83ed1cf634ce");
            return;
        }
        super.a(i, i2, intent);
        if (this.e.aA_() instanceof Activity) {
            MPKNBModule.onActivityResult((Activity) this.e.aA_(), i, i2, intent);
        }
    }
}
