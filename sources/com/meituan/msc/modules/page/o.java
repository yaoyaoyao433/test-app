package com.meituan.msc.modules.page;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.annotation.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Scroller;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.ax;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.page.IPage;
import com.meituan.msi.view.ToastView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class o extends com.meituan.msc.modules.manager.k implements e {
    public static ChangeQuickRedirect a;
    public com.meituan.msc.modules.page.render.d b;
    public com.meituan.msc.modules.page.view.d c;
    public h d;
    public boolean e;
    public boolean f;
    public f g;
    public com.meituan.msc.modules.page.transition.c h;
    public String i;
    public b j;
    public com.meituan.msc.modules.api.msi.webview.d k;
    Map<String, String> l;
    private volatile boolean m;

    public o(com.meituan.msc.modules.page.render.d dVar, com.meituan.msc.modules.page.view.d dVar2, h hVar, String str, com.meituan.msc.modules.api.msi.webview.d dVar3) {
        Object[] objArr = {dVar, dVar2, hVar, str, dVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d334e8e0f307b6b6ec02a70b404e4b5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d334e8e0f307b6b6ec02a70b404e4b5e");
            return;
        }
        this.m = false;
        this.b = dVar;
        this.c = dVar2;
        this.d = hVar;
        this.g = new p(dVar2);
        this.i = str;
        this.k = dVar3;
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(com.meituan.msc.modules.engine.h hVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f317c2eff67fa0704471f87ba46687d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f317c2eff67fa0704471f87ba46687d");
            return;
        }
        super.a(hVar);
        Set<com.meituan.msc.modules.manager.k> b = this.b.b();
        Class[] clsArr = new Class[0];
        Object[] objArr2 = {b, clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.manager.k.n;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31f364e92887f2060f0b477b19f254a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31f364e92887f2060f0b477b19f254a1");
        } else {
            for (com.meituan.msc.modules.manager.k kVar : b) {
                a(kVar, clsArr);
            }
        }
        String str = this.i;
        com.meituan.msc.modules.update.a aVar = hVar.s;
        Object[] objArr3 = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.transition.c.a;
        com.meituan.msc.modules.page.transition.c cVar = null;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "89d209ac0ebbdfe42feb4b67410fc79e", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (com.meituan.msc.modules.page.transition.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "89d209ac0ebbdfe42feb4b67410fc79e");
        } else if (aVar != null && aVar.d != null && (optJSONObject = aVar.d.optJSONObject(am.b(str))) != null && (optJSONObject2 = optJSONObject.optJSONObject("transitionStyle")) != null) {
            cVar = new com.meituan.msc.modules.page.transition.c();
            cVar.b = optJSONObject2.optInt("pushStyle");
            cVar.c = optJSONObject2.optInt("popStyle");
            cVar.d = optJSONObject2.optBoolean("overrideContainerPop");
        }
        this.h = cVar;
    }

    @Override // com.meituan.msc.modules.manager.k
    public final String J_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9c350e4c0f6e530d6cfd2c84e34868", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9c350e4c0f6e530d6cfd2c84e34868") : String.valueOf(d());
    }

    @Override // com.meituan.msc.modules.page.e
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85129677ad3645514b166d621ae9c428", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85129677ad3645514b166d621ae9c428")).intValue() : this.b.j();
    }

    @Override // com.meituan.msc.modules.page.e
    public final int[] j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1739f46c2437f77e32815aac791fbf0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1739f46c2437f77e32815aac791fbf0b");
        }
        if (this.c == null || !this.c.isLaidOut()) {
            return null;
        }
        return new int[]{this.c.getWidth(), this.c.getHeight()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r15.equals("removeRootView") != false) goto L21;
     */
    @Override // com.meituan.msc.modules.manager.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a_(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.msc.modules.page.o.a
            java.lang.String r12 = "c8e96cfd922aa3b7a15e75143a3bd6dd"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            return r14
        L25:
            boolean r1 = r13.m
            if (r1 == 0) goto L99
            java.lang.String r1 = "UIManager"
            boolean r1 = android.text.TextUtils.equals(r14, r1)
            r2 = -1
            if (r1 == 0) goto L7a
            int r14 = r15.hashCode()
            r1 = -1761245365(0xffffffff9705874b, float:-4.314538E-25)
            if (r14 == r1) goto L6a
            r0 = -1526066370(0xffffffffa50a133e, float:-1.1976111E-16)
            if (r14 == r0) goto L60
            r0 = 1369272769(0x519d71c1, float:8.4527292E10)
            if (r14 == r0) goto L56
            r0 = 1935813252(0x73622a84, float:1.7918723E31)
            if (r14 == r0) goto L4b
            goto L74
        L4b:
            java.lang.String r14 = "manageChildren"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L74
            r0 = 0
            goto L75
        L56:
            java.lang.String r14 = "createView"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L74
            r0 = 3
            goto L75
        L60:
            java.lang.String r14 = "batchDidComplete"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L74
            r0 = 1
            goto L75
        L6a:
            java.lang.String r14 = "removeRootView"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L74
            goto L75
        L74:
            r0 = -1
        L75:
            switch(r0) {
                case 0: goto L79;
                case 1: goto L79;
                case 2: goto L79;
                case 3: goto L79;
                default: goto L78;
            }
        L78:
            return r9
        L79:
            return r10
        L7a:
            java.lang.String r0 = "IntersectionObserver"
            boolean r14 = android.text.TextUtils.equals(r14, r0)
            if (r14 == 0) goto L99
            int r14 = r15.hashCode()
            r0 = 530405532(0x1f9d589c, float:6.663868E-20)
            if (r14 == r0) goto L8c
            goto L95
        L8c:
            java.lang.String r14 = "disconnect"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L95
            r2 = 0
        L95:
            if (r2 == 0) goto L98
            return r9
        L98:
            return r10
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.page.o.a_(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.meituan.msc.modules.page.d
    @MSCMethod
    public void disableScrollBounce(boolean z) {
        com.meituan.msc.modules.page.widget.d refreshLayout;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c16bf936fd1414424cd288ed92b145c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c16bf936fd1414424cd288ed92b145c");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "cedb5c19d716a4c99f680ed07e0c0bb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "cedb5c19d716a4c99f680ed07e0c0bb4");
        } else if (!dVar.c || (refreshLayout = dVar.getRefreshLayout()) == null) {
        } else {
            if (refreshLayout.isEnabled() && z) {
                refreshLayout.setEnabled(false);
            } else if (refreshLayout.isEnabled() || z) {
            } else {
                refreshLayout.setEnabled(true);
            }
        }
    }

    @Override // com.meituan.msc.modules.page.d
    @MSCMethod
    public void startPullDownRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3094544d573e704de483df65e866ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3094544d573e704de483df65e866ca");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "68ab807ffca129d9c2cecca37453d697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "68ab807ffca129d9c2cecca37453d697");
            return;
        }
        com.meituan.msc.modules.page.widget.d refreshLayout = dVar.getRefreshLayout();
        if (refreshLayout == null || !refreshLayout.isEnabled() || refreshLayout.f) {
            return;
        }
        refreshLayout.setRefreshing(true);
    }

    @Override // com.meituan.msc.modules.page.d
    @MSCMethod
    public void stopPullDownRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3824b23b34f3e311712bb29c7ec60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3824b23b34f3e311712bb29c7ec60d");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "d95d9e497e412f5cc67c1133ac762a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "d95d9e497e412f5cc67c1133ac762a16");
            return;
        }
        com.meituan.msc.modules.page.widget.d refreshLayout = dVar.getRefreshLayout();
        if (refreshLayout == null || !refreshLayout.f) {
            return;
        }
        refreshLayout.setRefreshing(false);
    }

    @Override // com.meituan.msc.modules.page.d
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee0dce4c04630b6eb9dc63e1d38d680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee0dce4c04630b6eb9dc63e1d38d680");
        } else {
            this.c.setBackgroundColor(i);
        }
    }

    @Override // com.meituan.msc.modules.page.d
    public void setBackgroundTextStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a89dfb0a02956a7d39b2a2f21f2251ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a89dfb0a02956a7d39b2a2f21f2251ae");
        } else {
            this.c.setBackgroundTextStyle(z);
        }
    }

    @Override // com.meituan.msc.modules.page.e
    public final View b() {
        return this.c;
    }

    @Override // com.meituan.msc.modules.page.e
    public final com.meituan.msc.b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e74fe1a381434f8788290caadf570d8", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e74fe1a381434f8788290caadf570d8") : this.b.n();
    }

    @Override // com.meituan.msc.modules.page.e
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ca9b9234d129adef99c2b768114a29", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ca9b9234d129adef99c2b768114a29") : this.b.k.a;
    }

    @Override // com.meituan.msc.modules.page.e
    public final boolean g() {
        return this.d != null;
    }

    @Override // com.meituan.msc.modules.page.e
    public final h h() {
        return this.d;
    }

    @Override // com.meituan.msc.modules.page.e
    public final boolean i() {
        return this.e;
    }

    @Override // com.meituan.msc.modules.page.e
    public final void a(boolean z) {
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.ViewGroup] */
    @Override // com.meituan.msc.modules.page.i
    public final void a(View view, IPage.a aVar) {
        Window d;
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8d21b44b4b54ec8ffc600808d1a984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8d21b44b4b54ec8ffc600808d1a984");
            return;
        }
        final com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "11f8e7f37715a05a77c76ddf6bd2651b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "11f8e7f37715a05a77c76ddf6bd2651b");
            return;
        }
        if (dVar.l == null) {
            dVar.l = (ToastView) view;
        }
        com.meituan.msc.modules.page.view.d dVar2 = null;
        dVar2 = null;
        dVar2 = null;
        if (aVar != null && aVar.a) {
            if (dVar.getRenderer() == null || (d = dVar.getRenderer().d()) == null) {
                com.meituan.msc.modules.reporter.g.d("showMsiToast", "can't find current msc window, downgrade to show toast in current view");
            } else {
                dVar2 = (ViewGroup) d.getDecorView();
            }
        }
        if (dVar2 == null) {
            dVar2 = dVar;
        }
        if (dVar.l.getParent() != dVar2) {
            dVar2.addView(ax.a(dVar.l));
        }
        if (dVar.h.k.m) {
            dVar.l.setVisibility(0);
            return;
        }
        dVar.l.setVisibility(8);
        dVar.s = new Runnable() { // from class: com.meituan.msc.modules.page.view.d.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa5c9682e7e55b1fcd887d51eb69dc52", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa5c9682e7e55b1fcd887d51eb69dc52");
                } else {
                    dVar.l.setVisibility(0);
                }
            }
        };
    }

    @Override // com.meituan.msc.modules.page.i
    public final View P_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555dcbf6ffbb733cd73263db448fcc33", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555dcbf6ffbb733cd73263db448fcc33") : this.c.getToastView();
    }

    @Override // com.meituan.msc.modules.page.i
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad04829d83c537992005a5ff261dc03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad04829d83c537992005a5ff261dc03f");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "1cdcb725df43cfc9415ec2d665fa2c08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "1cdcb725df43cfc9415ec2d665fa2c08");
            return;
        }
        if (dVar.l != null) {
            dVar.l.b();
        }
        dVar.s = null;
        dVar.l = null;
    }

    @Override // com.meituan.msc.modules.page.e
    public final f k() {
        return this.g;
    }

    @Override // com.meituan.msc.modules.page.e
    public final com.meituan.msc.modules.page.render.a l() {
        if (this.b != null) {
            return this.b.k.j;
        }
        return null;
    }

    @Override // com.meituan.msc.modules.page.e
    public final com.meituan.msc.modules.page.transition.c m() {
        return this.h;
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5786a04c4f0cdeb1da5991ce95ace30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5786a04c4f0cdeb1da5991ce95ace30");
            return;
        }
        super.L_();
        this.m = true;
    }

    @Override // com.meituan.msc.modules.page.e
    public final com.meituan.msc.modules.page.render.d n() {
        return this.b;
    }

    @Override // com.meituan.msc.modules.page.e
    public final void a(int i, int i2, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5e2f49a7be67192773bc7c687e2f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5e2f49a7be67192773bc7c687e2f29");
            return;
        }
        final com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8764fae259436a48a686943b064b6c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8764fae259436a48a686943b064b6c18");
            return;
        }
        final com.meituan.msc.modules.page.view.c cVar = dVar.t;
        Object[] objArr3 = {dVar, Integer.valueOf(i), Integer.valueOf(i2), msiContext};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.view.c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "aa7f1d3b3c93b2ae2c185a707965765c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "aa7f1d3b3c93b2ae2c185a707965765c");
            return;
        }
        cVar.cancel();
        int a2 = cVar.a(dVar);
        cVar.d = a2;
        cVar.e = msiContext;
        cVar.b = new Scroller(msiContext.getActivity());
        cVar.b.startScroll(0, a2, 0, i - a2, i2);
        cVar.c = dVar.animate();
        cVar.c.setDuration(i2).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.msc.modules.page.view.c.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr4 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "43d6790f563199056182fa6f421e8311", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "43d6790f563199056182fa6f421e8311");
                    return;
                }
                int a3 = cVar.a(dVar);
                if (!dVar.isAttachedToWindow()) {
                    cVar.cancel();
                } else if (Math.abs(cVar.d - a3) > 1) {
                    g.e("PageScroller", "lastScrollY ", Integer.valueOf(cVar.d), " != actualY ", Integer.valueOf(a3), ", seems user scrolling, cancel auto scroll");
                    cVar.cancel();
                } else {
                    if (cVar.d != a3) {
                        g.e("PageScroller", "lastScrollY ", Integer.valueOf(cVar.d), " != actualY ", Integer.valueOf(a3), ", ignored");
                    }
                    cVar.b.computeScrollOffset();
                    cVar.a(dVar, cVar.b.getCurrY() - a3);
                    cVar.d = cVar.b.getCurrY();
                    g.a("PageScroller", "currY: ", Integer.valueOf(cVar.b.getCurrY()));
                }
            }
        }).setListener(new AnimatorListenerAdapter() { // from class: com.meituan.msc.modules.page.view.c.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr4 = {animator};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e114a45ad5d97cdffa85a2cdea53df3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e114a45ad5d97cdffa85a2cdea53df3c");
                    return;
                }
                if (cVar.e != null) {
                    cVar.e.onSuccess(null);
                    cVar.e = null;
                }
                cVar.b = null;
                cVar.c = null;
            }
        }).start();
    }

    @Override // com.meituan.msc.modules.page.e
    public final b Q_() {
        return this.j;
    }

    @Override // com.meituan.msc.modules.page.e
    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a6c1acd6fc2931df3a6942dc4946ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a6c1acd6fc2931df3a6942dc4946ece");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "51d7b353257547fc8c67d1c2f7f9b4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "51d7b353257547fc8c67d1c2f7f9b4bc");
        } else if (i > 0) {
            dVar.a(i, i2, z);
        } else if (i >= 0 || dVar.getPan() <= 0 || dVar.getPan() < (-i)) {
        } else {
            dVar.a(i, i2, z);
        }
    }

    @Override // com.meituan.msc.modules.page.e
    public final int R_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3f654331683e9fe74e9113e553fb6d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3f654331683e9fe74e9113e553fb6d")).intValue() : this.c.getKeyboardHeight();
    }

    @Override // com.meituan.msc.modules.page.e
    public final void a(@Size(2) int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02599494e9a12808b5a5a5ab2eb95554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02599494e9a12808b5a5a5ab2eb95554");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar = this.c;
        Object[] objArr2 = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8487dbecca4d4644e04f667b3036e00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8487dbecca4d4644e04f667b3036e00c");
        } else if (dVar.getRefreshLayout() != null) {
            dVar.getRefreshLayout().getLocationInWindow(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
    }

    @Override // com.meituan.msc.modules.page.e
    public final int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fca35bee81574b55e1e0184328876d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fca35bee81574b55e1e0184328876d")).intValue() : this.c.getContentHeight();
    }

    @Override // com.meituan.msc.modules.page.e
    public final void a(com.meituan.msi.page.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856837a5c63bd5a987342bc810cc0df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856837a5c63bd5a987342bc810cc0df0");
            return;
        }
        com.meituan.msc.modules.page.view.d dVar2 = this.c;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar2, changeQuickRedirect2, false, "432527ecf8cde90869e0be947f4edd6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar2, changeQuickRedirect2, false, "432527ecf8cde90869e0be947f4edd6e");
        } else {
            dVar2.u.add(dVar);
        }
    }

    @Override // com.meituan.msc.modules.page.e
    public final j S_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c43ede62e5ed112988b00fc3f180676", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c43ede62e5ed112988b00fc3f180676") : new j() { // from class: com.meituan.msc.modules.page.o.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.j
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69a765b019a987ab666e22e76edf11bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69a765b019a987ab666e22e76edf11bf")).booleanValue() : o.this.c.f();
            }

            @Override // com.meituan.msc.modules.page.j
            public final com.meituan.msc.modules.api.msi.webview.d b() {
                return o.this.k;
            }

            @Override // com.meituan.msc.modules.page.j
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c7ce7fae794503703618a76feebe0ce", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c7ce7fae794503703618a76feebe0ce")).booleanValue();
                }
                o oVar = o.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = o.a;
                return PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "465685f464d00e6bb598b8fc98aa94c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "465685f464d00e6bb598b8fc98aa94c4")).booleanValue() : oVar.c.d;
            }
        };
    }

    @Override // com.meituan.msc.modules.page.e
    public final int T_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eff1ed1e393c3bd4c0140a9c23dde63", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eff1ed1e393c3bd4c0140a9c23dde63")).intValue() : this.c.getNavigationBarHeight();
    }

    @Override // com.meituan.msc.modules.page.e
    public final int u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef16226a1f6e6edf2b17e30fdfaae357", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef16226a1f6e6edf2b17e30fdfaae357")).intValue() : this.c.getWebScrollY();
    }

    @Override // com.meituan.msc.modules.page.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d7197ec27e65dc7dcb1818e9673282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d7197ec27e65dc7dcb1818e9673282");
        } else {
            this.c.a(i);
        }
    }

    @Override // com.meituan.msc.modules.page.e
    public final int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c2c4b8347dfb57deda576d0ddaa956", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c2c4b8347dfb57deda576d0ddaa956")).intValue() : this.c.getPan();
    }

    @Override // com.meituan.msc.modules.page.e
    public final int w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dbd92fda9b3397da0d2d91e1ff0bba8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dbd92fda9b3397da0d2d91e1ff0bba8")).intValue() : this.c.getHeight();
    }

    @Override // com.meituan.msc.modules.page.e
    public final Map<String, String> x() {
        return this.l;
    }
}
