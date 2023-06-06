package com.sankuai.meituan.kernel.net.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.dianping.nvnetwork.g;
import com.google.gson.Gson;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.httpdns.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.INetFactory;
import com.sankuai.meituan.kernel.net.base.c;
import com.sankuai.meituan.kernel.net.d;
import com.sankuai.meituan.kernel.net.impl.c;
import com.sankuai.meituan.kernel.net.singleton.e;
import com.sankuai.meituan.kernel.net.singleton.h;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.c;
import dianping.com.nvlinker.NVLinker;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class INetFactoryImpl implements INetFactory {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"retrofit_netlog"};
    private volatile boolean c;
    private com.sankuai.meituan.kernel.net.a d;
    private Application e;

    public static /* synthetic */ void b(INetFactoryImpl iNetFactoryImpl) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iNetFactoryImpl, changeQuickRedirect, false, "f4fabc5a63ea60f13c0e153817136ae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iNetFactoryImpl, changeQuickRedirect, false, "f4fabc5a63ea60f13c0e153817136ae1");
        } else {
            i.a(iNetFactoryImpl.e, com.sankuai.meituan.kernel.net.base.c.a() != null ? String.valueOf(com.sankuai.meituan.kernel.net.base.c.a().c()) : "");
        }
    }

    private static PackageInfo a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92ef6d4f5ef4107f9e5954cdcc752829", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92ef6d4f5ef4107f9e5954cdcc752829");
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final void a(com.sankuai.meituan.kernel.net.c cVar) {
        PackageInfo a2;
        final com.sankuai.meituan.kernel.net.base.b bVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52de93b5822de6b7d2d5745b7aba9563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52de93b5822de6b7d2d5745b7aba9563");
            return;
        }
        this.e = cVar.a();
        this.d = cVar.b();
        final com.sankuai.meituan.kernel.net.a aVar = this.d;
        Application application = this.e;
        Object[] objArr2 = {aVar, application};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "10de675b2f46a67b7c509a5c7085d29c", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.meituan.kernel.net.base.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "10de675b2f46a67b7c509a5c7085d29c");
        } else {
            final String str = "";
            final int i = -1;
            if (aVar == null || TextUtils.isEmpty(aVar.j())) {
                a2 = a(application);
                if (a2 != null) {
                    str = a2.versionName;
                }
            } else {
                str = aVar.j();
                a2 = null;
            }
            if (aVar == null || aVar.k() < 0) {
                if (a2 == null) {
                    a2 = a(application);
                }
                if (a2 != null) {
                    i = a2.versionCode;
                }
            } else {
                i = aVar.k();
            }
            if (aVar != null) {
                bVar = new com.sankuai.meituan.kernel.net.base.b() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.1
                    public static ChangeQuickRedirect b;

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final int h() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "83fa6a88eb60567cdfac0e2b4243ec34", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "83fa6a88eb60567cdfac0e2b4243ec34")).intValue();
                        }
                        return 11;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final long a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db44231dd2c8974114a7d3f7db8ad389", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db44231dd2c8974114a7d3f7db8ad389")).longValue() : com.sankuai.meituan.kernel.net.a.this.a();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d249e62840edf68726009bcb17c7d1b8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d249e62840edf68726009bcb17c7d1b8") : com.sankuai.meituan.kernel.net.a.this.e();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final long c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e25db0cd69700deb4dfd7b7b69c2a4f5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e25db0cd69700deb4dfd7b7b69c2a4f5")).longValue() : com.sankuai.meituan.kernel.net.a.this.b();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String d() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eeb73ec0c682e7e77d3637ed7d1ee702", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eeb73ec0c682e7e77d3637ed7d1ee702") : com.sankuai.meituan.kernel.net.a.this.g();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final Object e() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b740ea39ab1570fea37edd36f82c2470", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b740ea39ab1570fea37edd36f82c2470") : com.sankuai.meituan.kernel.net.a.this.f();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String f() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e9efcf893873b1c2258be7fe17a21886", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e9efcf893873b1c2258be7fe17a21886") : com.sankuai.meituan.kernel.net.a.this.h();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String g() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c60697d2fec38bee300799e5229376e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c60697d2fec38bee300799e5229376e1") : com.sankuai.meituan.kernel.net.a.this.c();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String i() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de82504dd568f67974e217aa5ca17ed6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de82504dd568f67974e217aa5ca17ed6") : com.sankuai.meituan.kernel.net.a.this.i();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String j() {
                        return str;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final int k() {
                        return i;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String l() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "45826c673ff72c92a88ec57a35802354", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "45826c673ff72c92a88ec57a35802354") : com.sankuai.meituan.kernel.net.a.this.d();
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String m() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ba05913eebe4d6cb036ef6ef88b8f9f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ba05913eebe4d6cb036ef6ef88b8f9f") : com.sankuai.meituan.kernel.net.a.this.m();
                    }
                };
            } else {
                bVar = new com.sankuai.meituan.kernel.net.base.b() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.2
                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final long a() {
                        return -1L;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String b() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final long c() {
                        return -1L;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String d() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final Object e() {
                        return null;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String f() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String g() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final int h() {
                        return -1;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String i() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String l() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String m() {
                        return "";
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final String j() {
                        return str;
                    }

                    @Override // com.sankuai.meituan.kernel.net.base.b
                    public final int k() {
                        return i;
                    }
                };
            }
        }
        b.a = this.e;
        Application application2 = this.e;
        c.a aVar2 = new c.a() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.kernel.net.base.c.a
            public final boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f1b21c4790dc7c3e87d13a21dac7a75", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f1b21c4790dc7c3e87d13a21dac7a75")).booleanValue();
                }
                if (INetFactoryImpl.this.d == null) {
                    return false;
                }
                return INetFactoryImpl.this.d.l();
            }
        };
        com.sankuai.meituan.kernel.net.base.c.b = application2;
        com.sankuai.meituan.kernel.net.base.c.c = bVar;
        com.sankuai.meituan.kernel.net.base.c.d = aVar2;
        Application application3 = this.e;
        Object[] objArr3 = {application3};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.kernel.net.base.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "aec9dcba67b6300fd663f1f02a40ca34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "aec9dcba67b6300fd663f1f02a40ca34");
        } else if (!com.sankuai.meituan.kernel.net.base.a.f && application3.getResources() != null) {
            DisplayMetrics displayMetrics = application3.getResources().getDisplayMetrics();
            com.sankuai.meituan.kernel.net.base.a.b = displayMetrics.widthPixels;
            com.sankuai.meituan.kernel.net.base.a.c = displayMetrics.heightPixels;
            com.sankuai.meituan.kernel.net.base.a.d = displayMetrics.density;
            com.sankuai.meituan.kernel.net.base.a.e = displayMetrics.densityDpi;
            com.sankuai.meituan.kernel.net.base.a.f = true;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.kernel.net.tunnel.c.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2b535c0dac73482218696f2365bb0547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2b535c0dac73482218696f2365bb0547");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.meituan.kernel.net.tunnel.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "84b3b5cdbe3a5f69eb0f3b55b15af04f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "84b3b5cdbe3a5f69eb0f3b55b15af04f");
                        return;
                    }
                    c.a(Horn.accessCache("network_tunnel_switch_config"));
                    Horn.register("network_tunnel_switch_config", new HornCallback() { // from class: com.sankuai.meituan.kernel.net.tunnel.c.1.1
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.meituan.android.common.horn.HornCallback
                        public final void onChanged(boolean z, String str2) {
                            Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e300b08fbc1d023287b3788a14565f89", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e300b08fbc1d023287b3788a14565f89");
                                return;
                            }
                            PrintStream printStream = System.out;
                            printStream.println("TunnelConfig, result: " + str2);
                            if (!z || TextUtils.isEmpty(str2)) {
                                return;
                            }
                            c.a(str2);
                        }
                    });
                    Horn.register("network_tunnel_common_config_v1", new HornCallback() { // from class: com.sankuai.meituan.kernel.net.tunnel.c.1.2
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.meituan.android.common.horn.HornCallback
                        public final void onChanged(boolean z, String str2) {
                            Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6ca5203ddd197021b71371e700fa0ae4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6ca5203ddd197021b71371e700fa0ae4");
                                return;
                            }
                            PrintStream printStream = System.out;
                            printStream.println("TunnelCommonConfig, result: " + str2);
                            if (!z || TextUtils.isEmpty(str2)) {
                                return;
                            }
                            Object[] objArr7 = {str2};
                            ChangeQuickRedirect changeQuickRedirect7 = c.a;
                            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "ab90adfadb676eeec42e35a77bd70183", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "ab90adfadb676eeec42e35a77bd70183");
                            } else if (TextUtils.isEmpty(str2)) {
                            } else {
                                try {
                                    c.c = (a) new Gson().fromJson(str2, (Class<Object>) a.class);
                                } catch (Exception e) {
                                    c.a(e);
                                }
                            }
                        }
                    });
                }
            });
        }
        NVLinker.init(this.e, bVar.h(), bVar.i(), bVar.j(), new NVLinker.ILikner() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.4
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.NVLinker.ILikner
            public final String getUnionID() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0ef46c9173edad3cbe66cc908bfa5664", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0ef46c9173edad3cbe66cc908bfa5664");
                }
                String g = bVar.g();
                return g == null ? "" : g;
            }

            @Override // dianping.com.nvlinker.NVLinker.ILikner
            public final String getCityID() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fafbc29fe30fbb2d84c7c6be520245b2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fafbc29fe30fbb2d84c7c6be520245b2") : String.valueOf(bVar.c());
            }
        });
        g.a(this.e, bVar.h(), 0, bVar.i(), new g.b() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.5
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.g.b
            public final String a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a9cc705048fe7e87e2a9da07af997b44", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a9cc705048fe7e87e2a9da07af997b44");
                }
                String g = bVar.g();
                return g == null ? "" : g;
            }
        });
        if (this.d != null ? this.d.l() : false) {
            aa.a(true);
        } else {
            aa.a(new aa.b() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.aa.b
                public final void a(String str2) {
                    Object[] objArr5 = {str2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6abbcf3c1141865a5d6ccf7093c92439", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6abbcf3c1141865a5d6ccf7093c92439");
                    } else {
                        com.dianping.networklog.c.a(str2, 2, INetFactoryImpl.b);
                    }
                }
            });
        }
        com.sankuai.android.jarvis.c.a("httpdns-init", new Runnable() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6e6ccfdd3b5c820f847220832978b8c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6e6ccfdd3b5c820f847220832978b8c3");
                    return;
                }
                i.a(com.sankuai.meituan.kernel.net.base.c.a().h());
                INetFactoryImpl.b(INetFactoryImpl.this);
            }
        }).start();
        this.c = true;
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final boolean a() {
        return this.c;
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final a.InterfaceC0637a a(String str) {
        a.InterfaceC0637a interfaceC0637a;
        a.InterfaceC0637a interfaceC0637a2;
        a.InterfaceC0637a interfaceC0637a3;
        a.InterfaceC0637a interfaceC0637a4;
        a.InterfaceC0637a interfaceC0637a5;
        a.InterfaceC0637a interfaceC0637a6;
        com.sankuai.meituan.kernel.net.tunnel.b bVar;
        a.InterfaceC0637a interfaceC0637a7;
        a.InterfaceC0637a interfaceC0637a8;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8b1466ff94f549d68f484cb937ee14", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8b1466ff94f549d68f484cb937ee14");
        }
        if (!this.c) {
            com.dianping.networklog.c.a("Try to get " + str + " call factory, but net module not initialized!", 3, b);
            return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(h.a().a("okdefault"));
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51fa9a33a18a9636788e0052a6496e84", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51fa9a33a18a9636788e0052a6496e84");
        }
        if (str == null) {
            interfaceC0637a8 = c.e.b;
            return interfaceC0637a8;
        } else if (str.equals("defaultokhttp")) {
            interfaceC0637a7 = c.b.b;
            return interfaceC0637a7;
        } else if (str.equals("okhttp")) {
            bVar = c.g.b;
            return bVar;
        } else if (str.equals("nvnetwork")) {
            interfaceC0637a6 = c.e.b;
            return interfaceC0637a6;
        } else if (str.equals("oknv")) {
            interfaceC0637a5 = c.e.b;
            return interfaceC0637a5;
        } else if (str.equals("mapi")) {
            interfaceC0637a4 = c.C0588c.b;
            return interfaceC0637a4;
        } else if (str.equals("statistics")) {
            interfaceC0637a3 = c.h.b;
            return interfaceC0637a3;
        } else if (str.equals("defaultnvnetwork")) {
            interfaceC0637a2 = c.a.b;
            return interfaceC0637a2;
        } else if (str.equals("uuid")) {
            interfaceC0637a = c.i.b;
            return interfaceC0637a;
        } else {
            throw new IllegalArgumentException("key:" + str + " not supported");
        }
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final a.InterfaceC0637a a(@NonNull d dVar) {
        com.sankuai.meituan.kernel.net.tunnel.b bVar;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4c851d7b0bde06f6d247c0db392c31", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4c851d7b0bde06f6d247c0db392c31");
        }
        if (!this.c) {
            com.dianping.networklog.c.a("Try to getCallFactoryWithInjector, but net module not initialized!", 3, b);
            return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(h.a().a(dVar));
        }
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "012a822383aca63117797c1d1160cbe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "012a822383aca63117797c1d1160cbe8");
        }
        if (dVar == null) {
            bVar = c.g.b;
            return bVar;
        } else if (dVar.a()) {
            com.sankuai.meituan.retrofit2.callfactory.ok3nv.a a2 = com.sankuai.meituan.retrofit2.callfactory.ok3nv.a.a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(h.a().a(dVar)), com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(e.a().a(dVar)));
            a2.b = true;
            return a2;
        } else {
            return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(h.a().a(dVar));
        }
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final c.a a(@NonNull com.sankuai.meituan.kernel.net.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02683a384d78b779f13dbbda1990358f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02683a384d78b779f13dbbda1990358f");
        }
        if (!this.c) {
            com.dianping.networklog.c.a("Try to getWebSocketFactory, but net module not initialized!", 3, b);
            return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(h.a().a(eVar));
        }
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "808f164183d53fa834a0a573e2c1e2e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "808f164183d53fa834a0a573e2c1e2e3");
        }
        if (eVar == null) {
            eVar = new com.sankuai.meituan.kernel.net.e() { // from class: com.sankuai.meituan.kernel.net.impl.c.1
            };
        }
        return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(h.a().a(eVar));
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final com.sankuai.meituan.kernel.net.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4adc8e88e9f95dec20ea67866ef4f06", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.kernel.net.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4adc8e88e9f95dec20ea67866ef4f06") : new com.sankuai.meituan.kernel.net.b() { // from class: com.sankuai.meituan.kernel.net.impl.INetFactoryImpl.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.kernel.net.b
            public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7) {
                Object[] objArr2 = {new Long(j), str, Integer.valueOf(i), 0, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), null, str3, Integer.valueOf(i7)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3aeff7cc4c420f7d2cc5c4d1e3f99cf4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3aeff7cc4c420f7d2cc5c4d1e3f99cf4");
                } else if (INetFactoryImpl.this.c) {
                    com.sankuai.meituan.kernel.net.report.a.a().pv4(j, str, i, 0, i3, i4, i5, i6, null, str3, i7);
                }
            }
        };
    }
}
