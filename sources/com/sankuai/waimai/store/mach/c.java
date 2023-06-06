package com.sankuai.waimai.store.mach;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.js.KNBCallback;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.mach.p;
import com.sankuai.waimai.mach.r;
import com.sankuai.waimai.platform.mach.extension.nestedv2.EmbedProcessorV2;
import com.sankuai.waimai.platform.mach.statistics.CatJsNativeMethod;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.newwidgets.list.o;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    Activity b;
    protected final String c;
    List<com.sankuai.waimai.store.mach.clickhandler.b> d;
    private Mach.a e;
    private Dialog f;
    private final CatJsNativeMethod g;
    private final com.sankuai.waimai.platform.mach.statistics.d h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.app.Activity r10, java.lang.String r11) {
        /*
            r9 = this;
            com.sankuai.waimai.mach.Mach$a r0 = new com.sankuai.waimai.mach.Mach$a
            r0.<init>()
            r0.b = r10
            r9.<init>(r10, r11, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r10
            r10 = 1
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.mach.c.a
            java.lang.String r11 = "e954774ab835b938a8c272d74fd260b5"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r10, r8, r11)
            return
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mach.c.<init>(android.app.Activity, java.lang.String):void");
    }

    public c(Activity activity, String str, Mach.a aVar) {
        Object[] objArr = {activity, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d25f2bc41310f203b495f4b5f0a960b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d25f2bc41310f203b495f4b5f0a960b");
            return;
        }
        this.b = activity;
        this.c = str;
        this.e = aVar;
        this.h = new com.sankuai.waimai.platform.mach.statistics.d(this.b);
        this.g = new CatJsNativeMethod(this.b, str);
    }

    public final void a(List<com.sankuai.waimai.store.mach.clickhandler.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a2c2a5e7cf6bbc905918306dfa7791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a2c2a5e7cf6bbc905918306dfa7791");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.d = Collections.unmodifiableList(list);
        }
    }

    public final Mach.a a(com.sankuai.waimai.mach.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3d51334b3c848d7cf4e80352c1c4a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3d51334b3c848d7cf4e80352c1c4a4");
        }
        this.e.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.store.mach.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.c
            public final void a(c.a aVar, k kVar) {
                Object[] objArr2 = {aVar, kVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "283331e12490602a80662b321c2fecb0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "283331e12490602a80662b321c2fecb0");
                } else {
                    WmMachImageLoaderUtil.a(aVar, kVar);
                }
            }
        };
        this.e.d = dVar;
        this.e.a(new com.sankuai.waimai.store.mach.swiper.b());
        this.e.g = new r() { // from class: com.sankuai.waimai.store.mach.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int a() {
                return R.drawable.wm_sc_common_mach_dot_square_yellow_selected;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int b() {
                return R.drawable.wm_sc_common_mach_dot_square_yellow_normal;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final Typeface a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27ac71e8f1909ad199711371ab813f5e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Typeface) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27ac71e8f1909ad199711371ab813f5e");
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = o.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0163f34d1c97e473ef3335ac6f706e00", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0163f34d1c97e473ef3335ac6f706e00")).booleanValue() : i.h().a("optimize/use_mach_text_type", true)) {
                    return c.this.a(str);
                }
                return null;
            }
        };
        this.e.m = new com.sankuai.waimai.mach.component.interf.a() { // from class: com.sankuai.waimai.store.mach.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.interf.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e15596b237fba77ee1414f012f61609", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e15596b237fba77ee1414f012f61609")).longValue() : com.meituan.android.time.c.b();
            }
        };
        this.e.a(new OrderNumFinderModule());
        this.e.a(new SGCommonMachUtilModule());
        this.e.a(this.h);
        this.e.a(this.g);
        this.e.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.store.mach.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
                Object[] objArr2 = {str, map, jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac1ad09c1048cd7f615a00167c80bee9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac1ad09c1048cd7f615a00167c80bee9");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, c.this.c);
                }
            }
        });
        b bVar = new b() { // from class: com.sankuai.waimai.store.mach.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3492a758407ee820605f41ed3131645", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3492a758407ee820605f41ed3131645");
                } else {
                    c.this.a();
                }
            }

            @Override // com.sankuai.waimai.store.mach.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "583e7f83579c60db6edd03808280d26d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "583e7f83579c60db6edd03808280d26d");
                } else {
                    c.this.b();
                }
            }
        };
        IMachHttpNativeMethod iMachHttpNativeMethod = (IMachHttpNativeMethod) com.sankuai.waimai.router.a.a(IMachHttpNativeMethod.class, IMachHttpNativeMethod.DRUG_HTTP);
        if (iMachHttpNativeMethod != null) {
            iMachHttpNativeMethod.initParam(this.c);
            iMachHttpNativeMethod.bindLoading(bVar);
            this.e.a(iMachHttpNativeMethod);
        }
        SGHttpJSNativeMethod sGHttpJSNativeMethod = new SGHttpJSNativeMethod(this.c);
        sGHttpJSNativeMethod.b = bVar;
        this.e.a(sGHttpJSNativeMethod);
        this.e.a(new SGCalculatorSizeJSNativeMethod(this.b));
        this.e.a(new f(this.b));
        this.e.a(new SGPoiLiveJSNativeMethod(this.b));
        this.e.a(new com.sankuai.waimai.platform.mach.extension.nestedv2.c());
        this.e.a(new EmbedProcessorV2());
        this.e.a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.store.mach.c.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b7db579cd50c5e102ffb5c49857ec7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b7db579cd50c5e102ffb5c49857ec7");
                } else {
                    c.this.a();
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddde3bcaf636bfb37a1cabceaa6d13d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddde3bcaf636bfb37a1cabceaa6d13d2");
                } else {
                    c.this.b();
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        KNBCallback kNBCallback = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a997cc5dff14d7418b7ccd65345a879", RobustBitConfig.DEFAULT_VALUE) ? (KNBCallback) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a997cc5dff14d7418b7ccd65345a879") : new KNBCallback() { // from class: com.sankuai.waimai.store.mach.c.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.KNBCallback
            public final void callback(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd71c29e3e1b0a7c7fc2916c93f1d66b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd71c29e3e1b0a7c7fc2916c93f1d66b");
                } else if ("login".equals(str)) {
                    com.sankuai.waimai.store.manager.user.a.a((Context) c.this.b);
                } else if (!"getUserInfo".equals(str) || com.sankuai.waimai.store.manager.user.a.a().b()) {
                } else {
                    com.sankuai.waimai.store.manager.user.a.a((Context) c.this.b);
                }
            }
        };
        if (kNBCallback == null) {
            kNBCallback = new KNBCallback() { // from class: com.sankuai.waimai.store.mach.c.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.js.KNBCallback
                public final void callback(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6b0353a8652c0945d3577417dcd87e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6b0353a8652c0945d3577417dcd87e3");
                    } else if (!"getUserInfo".equals(str) || com.sankuai.waimai.store.manager.user.a.a().b()) {
                    } else {
                        com.sankuai.waimai.store.manager.user.a.a((Context) c.this.b);
                    }
                }
            };
        }
        this.e.k = kNBCallback;
        this.e.l = new p() { // from class: com.sankuai.waimai.store.mach.c.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr3 = {str, view, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c98206260778f74671ef99fc26c8e77", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c98206260778f74671ef99fc26c8e77")).booleanValue();
                }
                c cVar = c.this;
                Activity activity = c.this.b;
                Object[] objArr4 = {activity, str, view, aVar};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "d3a7253932c1b0b1e02f0bf642b3d0a9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "d3a7253932c1b0b1e02f0bf642b3d0a9")).booleanValue();
                }
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) cVar.d)) {
                    for (com.sankuai.waimai.store.mach.clickhandler.b bVar2 : cVar.d) {
                        if (bVar2.a(str, view, aVar)) {
                            return true;
                        }
                    }
                }
                com.sankuai.waimai.store.router.d.a(activity, str);
                return true;
            }

            @Override // com.sankuai.waimai.mach.p, com.sankuai.waimai.mach.b
            public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr3 = {str, view, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "32e6c5506bc8aa93ed3f16a0013d5f63", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "32e6c5506bc8aa93ed3f16a0013d5f63")).booleanValue();
                }
                try {
                    Object b = aVar.c().b("OnLongClickListener");
                    if (b instanceof View.OnLongClickListener) {
                        ((View.OnLongClickListener) b).onLongClick(view);
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
                return false;
            }
        };
        return this.e;
    }

    boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49fa30443bf36068f2b9e484b751cf5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49fa30443bf36068f2b9e484b751cf5")).booleanValue();
        }
        if (com.sankuai.waimai.store.util.b.a(this.b)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.f);
        this.f = com.sankuai.waimai.foundation.core.utils.d.a(this.b);
        return true;
    }

    boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74692fe43698bada062ff18ff47f2b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74692fe43698bada062ff18ff47f2b0")).booleanValue();
        }
        if (com.sankuai.waimai.store.util.b.a(this.b)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.f);
        this.f = null;
        return true;
    }

    Typeface a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ecf1f1425a7e85d4b8f83382f493f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ecf1f1425a7e85d4b8f83382f493f5");
        }
        try {
            if (t.a(str)) {
                return null;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.insert(0, "fonts/");
            sb.append(".ttf");
            return Typeface.createFromAsset(this.b.getAssets(), sb.toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
