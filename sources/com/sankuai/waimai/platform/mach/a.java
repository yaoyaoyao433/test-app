package com.sankuai.waimai.platform.mach;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import com.sankuai.waimai.irmo.mach.effect.WmEffectTagProcessor;
import com.sankuai.waimai.irmo.mach.vap.VapTagProcessor;
import com.sankuai.waimai.irmo.mach.video.VideoPlayerTagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.component.countdown.CountDownTagProcessor;
import com.sankuai.waimai.mach.component.indicator.IndicatorTagProcessor;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.js.KNBCallback;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.mach.p;
import com.sankuai.waimai.mach.r;
import com.sankuai.waimai.platform.capacity.ad.WMADStrategyNativeModule;
import com.sankuai.waimai.platform.mach.extension.nested.EmbedProcessor;
import com.sankuai.waimai.platform.mach.lottieextend.LottieTagProcessor;
import com.sankuai.waimai.platform.mach.monitor.c;
import com.sankuai.waimai.platform.mach.order.CakeEditTextTagProcessor;
import com.sankuai.waimai.platform.mach.order.EditTextTagProcessor;
import com.sankuai.waimai.platform.mach.order.OrderRichTextProcessor;
import com.sankuai.waimai.platform.mach.order.OrderRichTextProcessorComp;
import com.sankuai.waimai.platform.mach.rooimage.RooImageProcessor;
import com.sankuai.waimai.platform.mach.statistics.CatJsNativeMethod;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
import com.sankuai.waimai.platform.mach.videoextend.VideoTagProcessor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.mach.container.a {
    public static ChangeQuickRedirect t;
    private static final d z = new d() { // from class: com.sankuai.waimai.platform.mach.a.1
        @Override // com.sankuai.waimai.mach.d
        public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        }
    };
    private com.sankuai.waimai.mach.container.d A;
    private b a;
    private final CatJsNativeMethod b;
    private final com.sankuai.waimai.platform.mach.statistics.d c;
    private com.sankuai.waimai.platform.mach.videoextend.d d;
    private Dialog e;
    private com.sankuai.waimai.platform.mach.statistics.b<String> f;
    private com.sankuai.waimai.platform.mach.extension.a g;
    public InterfaceC1053a u;
    protected Rect v;
    public boolean w;
    private c x;
    private Map<String, Object> y;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1053a {
        void a();
    }

    public boolean a() {
        return true;
    }

    public void c() {
    }

    public d d() {
        return null;
    }

    public a(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5115f345587404c2f8843b7119556cc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5115f345587404c2f8843b7119556cc4");
            return;
        }
        this.y = new HashMap();
        this.A = new e() { // from class: com.sankuai.waimai.platform.mach.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d55b3882aa82063c7d6d5db61c6ce048", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d55b3882aa82063c7d6d5db61c6ce048");
                    return;
                }
                super.c();
                a.this.w = false;
                if (a.this.u != null) {
                    a.this.u.a();
                } else {
                    a.this.r().setVisibility(8);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "525dbb53a04ef7a22cb7149aa668fbd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "525dbb53a04ef7a22cb7149aa668fbd0");
                    return;
                }
                a.this.w = false;
                if (a.this.l != null) {
                    if (a.this.a()) {
                        a.this.l.removeAllViews();
                    }
                    a.this.d.b = false;
                    a.this.d.b();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a546a0ab22ed14e699b50597c7c5411", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a546a0ab22ed14e699b50597c7c5411");
                    return;
                }
                super.f();
                com.sankuai.waimai.platform.mach.monitor.b.a().a(a.this.x, a.this.p);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b089d0d4e9a381dda86f14c50f39ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b089d0d4e9a381dda86f14c50f39ad");
                    return;
                }
                super.b();
                a.this.w = false;
                if (a.this.u != null) {
                    a.this.u.a();
                } else {
                    a.this.r().setVisibility(8);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "047d75b21cb4198e44109512c7a8a475", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "047d75b21cb4198e44109512c7a8a475");
                    return;
                }
                super.a();
                a.this.w = false;
                if (a.this.u != null) {
                    a.this.u.a();
                } else if (a.this.r() != null) {
                    a.this.r().setVisibility(8);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cda8244713abe21ee3afea5105634752", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cda8244713abe21ee3afea5105634752");
                    return;
                }
                super.d();
                a.this.w = true;
                com.sankuai.waimai.platform.mach.monitor.b.a().a(a.this.x, a.this.p, com.sankuai.waimai.platform.mach.monitor.e.a(a.this.k));
            }
        };
        this.d = new com.sankuai.waimai.platform.mach.videoextend.d();
        this.c = new com.sankuai.waimai.platform.mach.statistics.d(activity);
        this.b = new CatJsNativeMethod(activity, str);
        this.f = new com.sankuai.waimai.platform.mach.statistics.b<>();
        a(this.A);
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b8fcb126b159f960f20fd09f37a4e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b8fcb126b159f960f20fd09f37a4e4");
            return;
        }
        super.a(mach);
        if (this.g != null) {
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this.g);
        }
        this.g = new com.sankuai.waimai.platform.mach.extension.a(mach);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this.g);
    }

    public final b g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0068dce951529cb06ca04c5f83091ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0068dce951529cb06ca04c5f83091ef");
        }
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public final a a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0636710fea9f243b1ecd994ccb2c76", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0636710fea9f243b1ecd994ccb2c76");
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.y.put(str, obj);
        }
        return this;
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a060ffb43fec481fac076e594b4fda19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a060ffb43fec481fac076e594b4fda19");
        } else if (com.sankuai.waimai.mach.utils.e.a(map)) {
        } else {
            e();
            this.y.putAll(map);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cea37ae0c10650ade829c27d989636e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cea37ae0c10650ade829c27d989636e");
        } else if (this.k != null) {
            this.k.synchronizeEnvironment();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b1ba3ff73cc14f43d33544b154f474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b1ba3ff73cc14f43d33544b154f474");
        } else {
            this.y.clear();
        }
    }

    public final void a(Rect rect) {
        this.v = rect;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f78ac1a832e17d8d38d7e18c1cdd38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f78ac1a832e17d8d38d7e18c1cdd38");
        } else if (q() && this.k != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.k.searchNodeWithViewReport();
            if (com.sankuai.waimai.foundation.utils.d.a(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar : searchNodeWithViewReport) {
                a(aVar);
            }
            c();
        }
    }

    public void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07b593db6266fececa0eb48da0bb0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07b593db6266fececa0eb48da0bb0f9");
        } else if (aVar == null) {
        } else {
            if (!com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.swiper.b.class)) {
                if (com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                    com.sankuai.waimai.mach.component.scroller.b bVar = (com.sankuai.waimai.mach.component.scroller.b) aVar.e.h;
                    if (com.sankuai.waimai.foundation.utils.d.a(bVar.e())) {
                        return;
                    }
                    List<Integer> e = bVar.e();
                    int indexOf = aVar.e.b().indexOf(aVar);
                    if (indexOf < 0 || !e.contains(Integer.valueOf(indexOf))) {
                        return;
                    }
                    c(aVar);
                    return;
                }
                this.k.triggerViewReport(aVar);
            } else if (aVar.e.b().indexOf(aVar) == ((com.sankuai.waimai.mach.component.swiper.b) aVar.e.h).b) {
                c(aVar);
            }
        }
    }

    public final void b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3eb481ad111dde200430fc27c88ff86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3eb481ad111dde200430fc27c88ff86");
        } else if (aVar == null) {
        } else {
            if (!com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.swiper.b.class)) {
                if (com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                    com.sankuai.waimai.mach.component.scroller.b bVar = (com.sankuai.waimai.mach.component.scroller.b) aVar.e.h;
                    if (com.sankuai.waimai.foundation.utils.d.a(bVar.e())) {
                        return;
                    }
                    List<Integer> e = bVar.e();
                    int indexOf = aVar.e.b().indexOf(aVar);
                    if (indexOf < 0 || !e.contains(Integer.valueOf(indexOf))) {
                        return;
                    }
                    c(aVar);
                } else if (aVar == null || this.f == null || this.f.a(aVar.i)) {
                } else {
                    this.k.triggerViewReport(aVar);
                    this.f.b(aVar.i);
                }
            } else if (aVar.e.b().indexOf(aVar) == ((com.sankuai.waimai.mach.component.swiper.b) aVar.e.h).b) {
                c(aVar);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    @CallSuper
    public void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b34ab8955b664ef934e66550878b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b34ab8955b664ef934e66550878b86");
            return;
        }
        aVar.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.platform.mach.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.c
            public final void a(c.a aVar2, k kVar) {
                Object[] objArr2 = {aVar2, kVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99be3e83545fd4f1247f87240c5632e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99be3e83545fd4f1247f87240c5632e9");
                } else {
                    WmMachImageLoaderUtil.a(aVar2, kVar);
                }
            }
        };
        d d = d();
        if (d == null) {
            d = z;
        }
        aVar.d = d;
        aVar.a(new VideoTagProcessor(this.d));
        aVar.a(new SwiperTagProcessor());
        aVar.a(new ScrollerTagProcessor());
        aVar.a(new IndicatorTagProcessor());
        aVar.a(new CountDownTagProcessor());
        aVar.a(new LottieTagProcessor());
        aVar.a(new VapTagProcessor());
        aVar.a(new VideoPlayerTagProcessor());
        aVar.a(new WmEffectTagProcessor());
        aVar.a(new EmbedProcessor());
        aVar.a(new DynamicTagProcessor());
        aVar.a(new RooImageProcessor());
        aVar.a(new EditTextTagProcessor());
        aVar.a(new CakeEditTextTagProcessor());
        aVar.a(new OrderRichTextProcessor());
        aVar.a(new OrderRichTextProcessorComp());
        aVar.g = new r() { // from class: com.sankuai.waimai.platform.mach.a.4
            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int a() {
                return R.drawable.wm_common_dot_square_yellow_selected;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int b() {
                return R.drawable.wm_common_dot_square_yellow_normal;
            }
        };
        aVar.m = new com.sankuai.waimai.mach.component.interf.a() { // from class: com.sankuai.waimai.platform.mach.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.interf.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "495917095826e5c8393f36ab28340755", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "495917095826e5c8393f36ab28340755")).longValue() : com.meituan.android.time.c.b();
            }
        };
        aVar.a(this.c);
        aVar.a(new com.sankuai.waimai.platform.mach.extension.nestedv2.c());
        aVar.a(this.b);
        aVar.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.platform.mach.a.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
                Object[] objArr2 = {str, map, jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6308755812a1185a9e35dee0d2f3d67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6308755812a1185a9e35dee0d2f3d67");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, a.this.i);
                }
            }
        });
        aVar.a(new WMADStrategyNativeModule());
        aVar.a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.platform.mach.a.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab561cfeb773fab0b4a00ea3bd040b9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab561cfeb773fab0b4a00ea3bd040b9c");
                } else {
                    a.this.k();
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d6c7ee06d1df4b5b93866d095670437", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d6c7ee06d1df4b5b93866d095670437");
                } else {
                    a.this.m();
                }
            }
        });
        aVar.k = new KNBCallback() { // from class: com.sankuai.waimai.platform.mach.a.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.KNBCallback
            public final void callback(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "506b0074cd4fa53932ca905b454a9c2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "506b0074cd4fa53932ca905b454a9c2f");
                } else if (!"getUserInfo".equals(str) || com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                } else {
                    com.sankuai.waimai.platform.domain.manager.user.a.a((Context) a.this.j);
                }
            }
        };
        aVar.n = this.y;
        aVar.l = new p() { // from class: com.sankuai.waimai.platform.mach.a.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09714ab46b21f3f970efada4ef3a2623", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09714ab46b21f3f970efada4ef3a2623")).booleanValue();
                }
                if (aVar2.h() == null || aVar2.h().get("extra") == null) {
                    com.sankuai.waimai.foundation.router.a.a(a.this.j, str);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra", aVar2.h().get("extra").toString());
                    com.sankuai.waimai.foundation.router.a.a(a.this.j, str, bundle);
                }
                return true;
            }
        };
    }

    @Override // com.sankuai.waimai.mach.container.a
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d5266db864172e3efa40664b34a70e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d5266db864172e3efa40664b34a70e3");
        } else if (TextUtils.equals("indexChanged", str)) {
            b();
        } else if (TextUtils.equals("std_trigger_expose_event", str)) {
            b();
        }
    }

    public final void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e5512ebe1177e1cbc938cbb3d332b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e5512ebe1177e1cbc938cbb3d332b5");
        } else if (aVar == null || this.f == null || this.f.a(aVar.i) || !j()) {
        } else {
            this.k.triggerViewReport(aVar);
            this.f.b(aVar.i);
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1a73688415c3ea7626211014a501d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1a73688415c3ea7626211014a501d2");
            return;
        }
        com.sankuai.waimai.platform.mach.statistics.b<String> bVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.mach.statistics.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0024a3d06012e185ebce8bbcf43cc86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0024a3d06012e185ebce8bbcf43cc86f");
        } else {
            bVar.b.clear();
        }
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc07972d93804e4ab1de327af56e9fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc07972d93804e4ab1de327af56e9fd")).booleanValue() : this.k != null && q() && i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060d4e653f004deab099c11c9314feaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060d4e653f004deab099c11c9314feaa")).booleanValue();
        }
        if (com.sankuai.waimai.mach.utils.e.c(this.j)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.e);
        this.e = com.sankuai.waimai.foundation.core.utils.d.a(this.j);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee482bbd207ca4bfc57b98861393630", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee482bbd207ca4bfc57b98861393630")).booleanValue();
        }
        if (com.sankuai.waimai.mach.utils.e.c(this.j)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.e);
        this.e = null;
        return true;
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffec897d496817e010cf2c32a2afbab9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffec897d496817e010cf2c32a2afbab9")).booleanValue() : ah.a(r(), this.v);
    }

    @Override // com.sankuai.waimai.mach.container.a, com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f1f7d02d7d8acfa31664b7e565f4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f1f7d02d7d8acfa31664b7e565f4b4");
            return;
        }
        super.onActivityDestroyed();
        this.u = null;
        if (this.g != null) {
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this.g);
        }
    }

    public void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5563bf28014d7d9370a76b841a98b9ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5563bf28014d7d9370a76b841a98b9ef");
        } else if (this.k != null) {
            this.k.setLogReporter(dVar);
        }
    }

    public final com.sankuai.waimai.mach.node.a l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32c3770f2f9a5b60f9559e12acef6af", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32c3770f2f9a5b60f9559e12acef6af");
        }
        if (this.k == null) {
            return null;
        }
        return this.k.getRootNode();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b {
        public static ChangeQuickRedirect a;

        public b() {
        }
    }
}
