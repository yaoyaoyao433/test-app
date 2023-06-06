package com.sankuai.waimai.irmo.canvas.container;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.INFJSContext;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.canvas.module.INFCanvasApi;
import com.sankuai.waimai.irmo.utils.d;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends a {
    public static ChangeQuickRedirect d;
    b e;
    String f;
    com.sankuai.waimai.mach.manager.cache.c g;
    boolean h;
    CacheException i;
    boolean j;
    private int k;

    public c(b bVar, @NonNull com.sankuai.waimai.irmo.canvas.mach.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e53b039f136dca0e299a6878e43cad6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e53b039f136dca0e299a6878e43cad6");
            return;
        }
        this.k = 5000;
        this.j = false;
        this.e = bVar;
        this.b = new com.sankuai.waimai.irmo.canvas.instance.a(this.e.a(), this.e.d());
        this.b.b = aVar;
    }

    @Override // com.sankuai.waimai.irmo.canvas.container.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dca6112415289593f2a83d6adf7d44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dca6112415289593f2a83d6adf7d44a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a1fda803b45dd60a83eba75d4fab1a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a1fda803b45dd60a83eba75d4fab1a7");
            return;
        }
        this.f = this.e.b();
        if (TextUtils.isEmpty(this.f)) {
            d.a("Java inf_canvas_log: Mach Pro Bundle Load Failed! |    BundleName  is Empty", new Object[0]);
        } else {
            com.sankuai.waimai.mach.manager.a.a().a(this.f, this.k, this.c, false, false, new a.b() { // from class: com.sankuai.waimai.irmo.canvas.container.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.b
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.c cVar) {
                    Object[] objArr3 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "44f9f46d21c2e609f5fa94aa931a991b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "44f9f46d21c2e609f5fa94aa931a991b");
                        return;
                    }
                    d.a("Java inf_canvas_log: Bundle加载成功 | " + c.this.f + " | version: " + cVar.e, new Object[0]);
                    c.this.g = cVar;
                    c.this.f = c.this.g.d;
                    if (c.this.j) {
                        d.a("Java inf_canvas_log: mDestroy = true  stop render ", new Object[0]);
                        return;
                    }
                    com.sankuai.waimai.irmo.canvas.instance.a aVar = c.this.b;
                    com.sankuai.waimai.mach.manager.cache.c cVar2 = c.this.g;
                    CanvasMap c = c.this.e.c();
                    Object[] objArr4 = {cVar2, c};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.irmo.canvas.instance.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "ed54ff542015a26e7908025ce27300f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "ed54ff542015a26e7908025ce27300f9");
                    } else {
                        try {
                            if (!aVar.f) {
                                Object[] objArr5 = {cVar2, c};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.irmo.canvas.instance.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "604cf83891de4486808b76b15c57381a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "604cf83891de4486808b76b15c57381a");
                                } else {
                                    if (cVar2 != null && cVar2.b() && aVar.b != null && INFJSContext.b) {
                                        aVar.b.setClipChildren(false);
                                        aVar.b.removeAllViews();
                                        aVar.c = cVar2;
                                        aVar.d.setBundle(cVar2);
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.irmo.canvas.instance.a.a;
                                        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "cc742577f5b7e5ef54f1cba06cfb6c48", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "cc742577f5b7e5ef54f1cba06cfb6c48");
                                        } else {
                                            if (aVar.e != null) {
                                                aVar.e.c();
                                            }
                                            if (aVar.g != null) {
                                                aVar.g.onDestroy();
                                            }
                                            aVar.g = new INFBridge(aVar.d);
                                            aVar.h = new INFCanvasApi(aVar.d);
                                            aVar.e = new INFJSContext(aVar.g, aVar.h);
                                        }
                                        aVar.d.setJSContext(aVar.e);
                                        aVar.e.a(c);
                                        if (aVar.c.c != null && aVar.c.c.length > 0) {
                                            aVar.e.a(aVar.c.c);
                                        }
                                        if (aVar.d.getBodyComponent() != null) {
                                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                            ViewParent parent = aVar.d.getBodyComponent().getView().getParent();
                                            if (parent instanceof ViewGroup) {
                                                d.a("Java inf_canvas_log: body has parent, is: " + parent.toString(), new Object[0]);
                                                ((ViewGroup) parent).removeView(aVar.d.getBodyComponent().getView());
                                            }
                                            aVar.b.addView(aVar.d.getBodyComponent().getView(), layoutParams);
                                            aVar.a("attached", null);
                                        } else {
                                            d.e("Java inf_canvas_log:  JS Error: JS异常：Body = null！！！", new Object[0]);
                                        }
                                    }
                                    d.a("Java inf_canvas_log: render failed ,  so loaded : " + INFJSContext.b, new Object[0]);
                                }
                            }
                        } catch (Exception e) {
                            d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.irmo.canvas.util.b.a(e.getStackTrace()), new Object[0]);
                        }
                    }
                    c.this.h = true;
                }

                @Override // com.sankuai.waimai.mach.manager.a.b
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr3 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "447c95048a3a2177180bacfce0ff2313", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "447c95048a3a2177180bacfce0ff2313");
                        return;
                    }
                    d.a("Java inf_canvas_log: Mach Pro Bundle Load Failed! | " + c.this.f + cacheException.a(), new Object[0]);
                    c.this.i = cacheException;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.canvas.container.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee427ecd5263e1dfbc5baa3988b2d9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee427ecd5263e1dfbc5baa3988b2d9f2");
            return;
        }
        super.e();
        if (this.b != null) {
            this.b.a("show", null);
        }
    }

    @Override // com.sankuai.waimai.irmo.canvas.container.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c4578ca442c551ea7496677b0d9408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c4578ca442c551ea7496677b0d9408");
            return;
        }
        super.f();
        if (this.b != null) {
            this.b.a("hide", null);
        }
    }

    @Override // com.sankuai.waimai.irmo.canvas.container.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53af4093ee305541144f061bf7d71712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53af4093ee305541144f061bf7d71712");
            return;
        }
        super.c();
        if (this.b != null) {
            this.b.a("start", null);
        }
    }

    @Override // com.sankuai.waimai.irmo.canvas.container.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce0a68f2ab5c817961f71df01eb75cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce0a68f2ab5c817961f71df01eb75cc");
            return;
        }
        super.d();
        if (this.b != null) {
            this.b.a("stop", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // com.sankuai.waimai.irmo.canvas.container.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.irmo.canvas.container.c.b():void");
    }
}
