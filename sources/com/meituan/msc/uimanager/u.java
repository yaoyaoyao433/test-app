package com.meituan.msc.uimanager;

import android.view.View;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.views.view.RNLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u extends UIImplementation {
    public static ChangeQuickRedirect a;

    public u(ReactApplicationContext reactApplicationContext, av avVar, ag agVar, UIViewOperationQueue uIViewOperationQueue, com.meituan.msc.uimanager.events.b bVar) {
        super(reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar);
        Object[] objArr = {reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da711a93b4885c1a5e33a815784f6c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da711a93b4885c1a5e33a815784f6c2");
        }
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i, String str, int i2, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c79cd92878666b9f5d438af5344986a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c79cd92878666b9f5d438af5344986a");
        } else if (this.t) {
            synchronized (this.h) {
                if (!this.p.contains(Integer.valueOf(i2))) {
                    this.p.add(Integer.valueOf(i2));
                }
                aa a2 = a(i, i2, str);
                aa c = this.k.c(i2);
                com.facebook.infer.annotation.a.a(c, "Root node with tag " + i2 + " doesn't exist");
                a2.f(i);
                a2.a(c.t());
                this.k.b(a2);
                ab abVar = null;
                if (readableMap != null) {
                    abVar = new ab(readableMap);
                    a2.a(abVar);
                }
                if (!a2.b()) {
                    this.n.a(a2, a2.t(), abVar);
                }
            }
        }
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb68b994bc16bc11409a5026eb00dccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb68b994bc16bc11409a5026eb00dccc");
            return;
        }
        com.meituan.msc.systrace.a.a(0L, "UIImplementation.updateViewHierarchy");
        RenderPerf renderPerf = this.j.getRuntimeDelegate().getRenderPerf();
        for (int i2 = 0; i2 < this.k.a(); i2++) {
            try {
                aa c = this.k.c(this.k.e(i2));
                if (c.L() != null && c.M() != null) {
                    com.meituan.msc.systrace.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive");
                    renderPerf.a("notifyBeforeLayout", i);
                    b(c);
                    com.meituan.msc.systrace.a.a(0L);
                    renderPerf.b("notifyBeforeLayout", i);
                    renderPerf.a("layout", i);
                    long currentTimeMillis = System.currentTimeMillis();
                    c(c);
                    com.meituan.msc.modules.reporter.g.d("ReactNative", "[UIImplementation@calculateRootLayout] cost: " + (System.currentTimeMillis() - currentTimeMillis));
                    renderPerf.b("layout", i);
                    renderPerf.a("updateLayoutProperties", i);
                    a(c, 0.0f, 0.0f);
                    com.meituan.msc.systrace.a.a(0L);
                    renderPerf.b("updateLayoutProperties", i);
                    if (this.r != null) {
                        this.m.a(c, this.r);
                    }
                }
            } finally {
                com.meituan.msc.systrace.a.a(0L);
            }
        }
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i, ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca1a21433711eef61677bf0a6e303beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca1a21433711eef61677bf0a6e303beb");
        } else if (this.t) {
            synchronized (this.h) {
                aa c = this.k.c(i);
                if (c == null) {
                    com.meituan.msc.modules.reporter.g.a("[UIImplementation@setChildren]", "cssNodeToManage with tag: " + i + " is null");
                    return;
                }
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    aa c2 = this.k.c(readableArray.getInt(i2));
                    if (c2 == null) {
                        throw new g("Trying to add unknown view tag: " + readableArray.getInt(i2));
                    }
                    c.a(c2, i2);
                }
                this.n.a(c, readableArray, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        if (r26 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r3 != r26.size()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        throw new com.meituan.msc.uimanager.g("Size of addChildTags != size of addAtIndices!");
     */
    @Override // com.meituan.msc.uimanager.UIImplementation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r22, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r23, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r24, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r25, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r26, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.u.a(int, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray):void");
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final <T extends View> void a(T t, final int i, final ThemedReactContext themedReactContext) {
        Object[] objArr = {t, Integer.valueOf(i), themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d48929464faac29f8e7d9c29631891e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d48929464faac29f8e7d9c29631891e");
            return;
        }
        synchronized (this.h) {
            themedReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.u.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    aa rNLayoutShadowNode;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3fa2265f903b920161dff08e3dbd837", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3fa2265f903b920161dff08e3dbd837");
                        return;
                    }
                    u uVar = u.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = u.a;
                    if (PatchProxy.isSupport(objArr3, uVar, changeQuickRedirect3, false, "d0de94ddf13d7f7751aed464198c2f27", RobustBitConfig.DEFAULT_VALUE)) {
                        rNLayoutShadowNode = (aa) PatchProxy.accessDispatch(objArr3, uVar, changeQuickRedirect3, false, "d0de94ddf13d7f7751aed464198c2f27");
                    } else {
                        rNLayoutShadowNode = new RNLayoutShadowNode();
                        com.meituan.msc.jse.modules.i18nmanager.a.a();
                        rNLayoutShadowNode.b(ReactViewManager.REACT_CLASS);
                    }
                    rNLayoutShadowNode.f(i);
                    rNLayoutShadowNode.a(themedReactContext);
                    u.this.k.a(rNLayoutShadowNode);
                }
            });
            this.m.a(i, (View) t);
        }
    }

    private void a(aa aaVar, float f, float f2) {
        Object[] objArr = {aaVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191cf0c8685b0575e7006ce75c7c4473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191cf0c8685b0575e7006ce75c7c4473");
        } else if (aaVar != null && aaVar.k()) {
            List<aa> a2 = aaVar.a(this.k);
            if (a2 != null) {
                for (aa aaVar2 : a2) {
                    a(aaVar2, aaVar.B() + f, aaVar.C() + f2);
                }
            }
            int p = aaVar.p();
            if (!this.k.d(p) && aaVar.a(f, f2, this.m, this.n) && aaVar.u()) {
                this.i.a(r.a(p, aaVar.F(), aaVar.G(), aaVar.H(), aaVar.I()));
            }
            aaVar.l();
            if (com.meituan.msc.jse.config.a.h) {
                this.n.d(aaVar);
            }
        }
    }
}
