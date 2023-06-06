package com.sankuai.waimai.touchmatrix.rebuild.mach;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.component.countdown.CountDownTagProcessor;
import com.sankuai.waimai.mach.component.indicator.IndicatorTagProcessor;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.js.KNBCallback;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.mach.p;
import com.sankuai.waimai.mach.r;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.mach.CatJsNativeMethod;
import com.sankuai.waimai.touchmatrix.mach.WmMachImageLoaderUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends com.sankuai.waimai.mach.container.a {
    public static ChangeQuickRedirect f;
    private static final com.sankuai.waimai.mach.d x = new com.sankuai.waimai.mach.d() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.1
        @Override // com.sankuai.waimai.mach.d
        public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        }
    };
    private final CatJsNativeMethod a;
    private final com.sankuai.waimai.touchmatrix.dialog.d b;
    private Dialog c;
    private com.sankuai.waimai.touchmatrix.mach.a<String> d;
    private com.sankuai.waimai.touchmatrix.mach.b e;
    protected Rect g;
    public a.c t;
    public Map<String, Object> u;
    com.sankuai.waimai.touchmatrix.show.e v;
    com.sankuai.waimai.touchmatrix.monitor.d w;
    private com.sankuai.waimai.mach.container.d y;

    public void c() {
    }

    public com.sankuai.waimai.mach.d d() {
        return null;
    }

    public g(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514c8006eea8f1ec4a729639c8e67224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514c8006eea8f1ec4a729639c8e67224");
            return;
        }
        this.u = new HashMap();
        this.y = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaacf5fd22f80bbcaf57e3448396a4ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaacf5fd22f80bbcaf57e3448396a4ee");
                    return;
                }
                super.c();
                g.this.r().setVisibility(8);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e(getClass().getSimpleName() + " onInputParamsError()", new Object[0]);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c806c5e366091246237743fbff688399", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c806c5e366091246237743fbff688399");
                } else if (g.this.l != null) {
                    g.this.l.removeAllViews();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b812105329ee76c6485ee0f0bc29a30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b812105329ee76c6485ee0f0bc29a30");
                } else {
                    super.f();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bb42e136d43eca2b1effddc8a98b783", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bb42e136d43eca2b1effddc8a98b783");
                    return;
                }
                super.b();
                g.this.r().setVisibility(8);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e(getClass().getSimpleName() + " onMachBundleLoadFailure()", new Object[0]);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "803bdb610df6f136dfefde32a5867139", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "803bdb610df6f136dfefde32a5867139");
                    return;
                }
                super.a();
                g.this.r().setVisibility(8);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e(getClass().getSimpleName() + " onMachRenderFailure()", new Object[0]);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba649f60f0ca662f395f96a403e848d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba649f60f0ca662f395f96a403e848d7");
                } else {
                    super.d();
                }
            }
        };
        this.b = new com.sankuai.waimai.touchmatrix.dialog.d(activity);
        this.a = new CatJsNativeMethod(activity, str);
        this.d = new com.sankuai.waimai.touchmatrix.mach.a<>();
        a(this.y);
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee957bbc2b58690e5ed4385d936e761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee957bbc2b58690e5ed4385d936e761");
            return;
        }
        super.a(mach);
        if (this.e != null) {
            com.sankuai.waimai.touchmatrix.dialog.e.a().b(this.e);
        }
        this.e = new com.sankuai.waimai.touchmatrix.mach.b(mach);
        com.sankuai.waimai.touchmatrix.dialog.e.a().a(this.e);
    }

    public final void a(Rect rect) {
        this.g = rect;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0dca9ca167325b511007642a370c37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0dca9ca167325b511007642a370c37");
        } else if (q() && this.k != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.k.searchNodeWithViewReport();
            if (com.sankuai.waimai.foundation.utils.d.a(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar : searchNodeWithViewReport) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d678d3bcc1770525cc2e7efdab7abe24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d678d3bcc1770525cc2e7efdab7abe24");
                } else if (aVar != null) {
                    if (!com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.swiper.b.class)) {
                        if (com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                            com.sankuai.waimai.mach.component.scroller.b bVar = (com.sankuai.waimai.mach.component.scroller.b) aVar.e.h;
                            if (!com.sankuai.waimai.foundation.utils.d.a(bVar.e())) {
                                List<Integer> e = bVar.e();
                                int indexOf = aVar.e.b().indexOf(aVar);
                                if (indexOf >= 0 && e.contains(Integer.valueOf(indexOf))) {
                                    a(aVar);
                                }
                            }
                        } else {
                            this.k.triggerViewReport(aVar);
                        }
                    } else if (aVar.e.b().indexOf(aVar) == ((com.sankuai.waimai.mach.component.swiper.b) aVar.e.h).b) {
                        a(aVar);
                    }
                }
            }
            c();
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    @CallSuper
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a77b1a3d8ccd0dd0f88c872b9ed12c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a77b1a3d8ccd0dd0f88c872b9ed12c");
            return;
        }
        aVar.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.c
            public final void a(c.a aVar2, k kVar) {
                Object[] objArr2 = {aVar2, kVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80cde7bf4158d0d9dca0f2ecd9e599f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80cde7bf4158d0d9dca0f2ecd9e599f0");
                    return;
                }
                Object[] objArr3 = {aVar2, kVar};
                ChangeQuickRedirect changeQuickRedirect3 = WmMachImageLoaderUtil.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5671bca459677e72f5aa20906dbb60ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5671bca459677e72f5aa20906dbb60ff");
                    return;
                }
                Object[] objArr4 = {aVar2, kVar, null};
                ChangeQuickRedirect changeQuickRedirect4 = WmMachImageLoaderUtil.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2cb7dc08af7e7a87c3db8d72c71165c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2cb7dc08af7e7a87c3db8d72c71165c0");
                } else if (aVar2 != null) {
                    com.sankuai.waimai.mach.imageloader.c.a(new WmMachImageLoaderUtil.a(null), aVar2, kVar);
                }
            }
        };
        com.sankuai.waimai.mach.d dVar = this.w;
        if (dVar == null) {
            dVar = d();
        }
        if (dVar == null) {
            dVar = x;
        }
        aVar.d = dVar;
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.b("最终设置给mach的logReport：" + dVar, new Object[0]);
        aVar.a(new SwiperTagProcessor());
        aVar.a(new ScrollerTagProcessor());
        aVar.a(new IndicatorTagProcessor());
        aVar.a(new CountDownTagProcessor());
        aVar.g = new r() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.4
            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int a() {
                return R.drawable.wm_common_dot_square_yellow_selected;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int b() {
                return R.drawable.wm_common_dot_square_yellow_normal;
            }
        };
        aVar.m = new com.sankuai.waimai.mach.component.interf.a() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.interf.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dfb506ba395bb4b9fed5fca335ffdd4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dfb506ba395bb4b9fed5fca335ffdd4")).longValue() : com.meituan.android.time.c.b();
            }
        };
        aVar.a(this.b);
        aVar.a(this.a);
        aVar.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
                Object[] objArr2 = {str, map, jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4459f07f0b6a0bf6ca11c2e8ff337679", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4459f07f0b6a0bf6ca11c2e8ff337679");
                } else {
                    com.sankuai.waimai.addrsdk.retrofit.c.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.addrsdk.retrofit.c.a(HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, g.this.i);
                }
            }
        });
        aVar.a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8201a9627ad828dcdb069512c7b1df44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8201a9627ad828dcdb069512c7b1df44");
                } else {
                    g.this.b();
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f26361ddd38c3840fce9eff2dfa9d76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f26361ddd38c3840fce9eff2dfa9d76");
                } else {
                    g.this.g();
                }
            }
        });
        aVar.k = new KNBCallback() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.KNBCallback
            public final void callback(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa9020e7afba021d4f02d85663a8cef0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa9020e7afba021d4f02d85663a8cef0");
                } else if (!"getUserInfo".equals(str) || com.sankuai.waimai.touchmatrix.dialog.e.a().b()) {
                } else {
                    com.sankuai.waimai.touchmatrix.dialog.e.a(g.this.j);
                }
            }
        };
        aVar.n = this.u;
        aVar.l = new p() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.g.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a51b72cc2fd848b8f15893bdf30b848", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a51b72cc2fd848b8f15893bdf30b848")).booleanValue();
                }
                if (aVar2.h() == null || aVar2.h().get("extra") == null) {
                    if (g.this.t != null) {
                        g.this.t.a(str);
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(g.this.j, str);
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra", aVar2.h().get("extra").toString());
                    if (g.this.t != null) {
                        g.this.t.a(str, bundle);
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(g.this.j, str, bundle);
                    }
                }
                return true;
            }
        };
        if (this.v != null) {
            this.v.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd548e8177eb892cbef0035345aa15c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd548e8177eb892cbef0035345aa15c9");
        } else if (TextUtils.equals("indexChanged", str)) {
            e();
        } else if (TextUtils.equals("std_trigger_expose_event", str)) {
            e();
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ecc65ff19bbef9e06bdc149a73de2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ecc65ff19bbef9e06bdc149a73de2c");
        } else if (aVar == null || this.d == null || this.d.a(aVar.i) || !a()) {
        } else {
            this.k.triggerViewReport(aVar);
            this.d.b(aVar.i);
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83093288bdeb7606f03d8f1d1e6afc57", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83093288bdeb7606f03d8f1d1e6afc57")).booleanValue() : this.k != null && q() && h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c05bb38543207fe31a9a8b39cb66b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c05bb38543207fe31a9a8b39cb66b5")).booleanValue();
        }
        if (com.sankuai.waimai.mach.utils.e.c(this.j)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.c);
        this.c = com.sankuai.waimai.foundation.core.utils.d.a(this.j);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d27dfa7aa91f38f3253d86c17e4906f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d27dfa7aa91f38f3253d86c17e4906f")).booleanValue();
        }
        if (com.sankuai.waimai.mach.utils.e.c(this.j)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.c);
        this.c = null;
        return true;
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e719c42612ab9b0ade54887520911f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e719c42612ab9b0ade54887520911f")).booleanValue() : ah.a(r(), this.g);
    }

    @Override // com.sankuai.waimai.mach.container.a, com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5289695eb544642883f51ae395c9c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5289695eb544642883f51ae395c9c58");
            return;
        }
        super.onActivityDestroyed();
        if (this.e != null) {
            com.sankuai.waimai.touchmatrix.dialog.e.a().b(this.e);
        }
    }

    public final com.sankuai.waimai.mach.node.a f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab94a73ed06666985a73ae4083c75ca1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab94a73ed06666985a73ae4083c75ca1");
        }
        if (this.k == null) {
            return null;
        }
        return this.k.getRootNode();
    }

    public final void a(com.sankuai.waimai.mach.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90a8e55c03971253be3243709f552f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90a8e55c03971253be3243709f552f9");
        } else if (this.k != null) {
            this.k.setLogReporter(dVar);
        }
    }
}
