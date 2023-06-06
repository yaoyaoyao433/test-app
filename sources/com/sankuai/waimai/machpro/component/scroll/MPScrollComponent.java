package com.sankuai.waimai.machpro.component.scroll;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.yoga.YogaFlexDirection;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPScrollComponent extends MPComponent<e> {
    public static ChangeQuickRedirect a;
    public c b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private a i;
    private boolean j;
    private MPComponent k;
    private boolean l;
    private boolean m;
    private final b n;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ e createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4020b77f1bb3c266b4916f2d6670cf4", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4020b77f1bb3c266b4916f2d6670cf4") : new e(this.mMachContext.getContext(), this);
    }

    public MPScrollComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e936fccf9cd3bb670e3e84ef46cc5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e936fccf9cd3bb670e3e84ef46cc5d");
            return;
        }
        this.c = false;
        this.d = false;
        this.e = false;
        this.j = true;
        this.l = false;
        this.m = true;
        this.n = new b() { // from class: com.sankuai.waimai.machpro.component.scroll.MPScrollComponent.1
            public static ChangeQuickRedirect a;
            private boolean c;
            private boolean d;

            @Override // com.sankuai.waimai.machpro.component.scroll.b
            public final void a(boolean z) {
                this.c = z;
                if (z) {
                    this.d = true;
                }
            }

            @Override // com.sankuai.waimai.machpro.component.scroll.b
            public final void a(View view, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "855bc9d07ce49fb703d3b5b2db49b016", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "855bc9d07ce49fb703d3b5b2db49b016");
                    return;
                }
                if (!MPScrollComponent.this.h) {
                    MPScrollComponent.this.h = true;
                    if (MPScrollComponent.this.d) {
                        a("scrollStart", MPScrollComponent.this.f, MPScrollComponent.this.g);
                    }
                }
                MPScrollComponent.this.f = i;
                MPScrollComponent.this.g = i2;
                if (MPScrollComponent.this.c) {
                    a(Constants.FPS_TYPE_SCROLL, i, i2);
                }
            }

            @Override // com.sankuai.waimai.machpro.component.scroll.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2f39c9217d1848a09f4af143beae9bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2f39c9217d1848a09f4af143beae9bb");
                    return;
                }
                MPScrollComponent.this.h = false;
                if (MPScrollComponent.this.e) {
                    a("scrollEnd", MPScrollComponent.this.f, MPScrollComponent.this.g);
                }
                this.c = false;
                this.d = false;
            }

            private void a(String str, int i, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f049aff4bea739cff8d2a2686a7661d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f049aff4bea739cff8d2a2686a7661d3");
                    return;
                }
                MachMap machMap = new MachMap();
                float f = i;
                machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPScrollComponent.this.mMachContext.getContext(), f)));
                float f2 = i2;
                machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPScrollComponent.this.mMachContext.getContext(), f2)));
                machMap.put("scrollLeft", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPScrollComponent.this.mMachContext.getContext(), f)));
                machMap.put("scrollTop", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPScrollComponent.this.mMachContext.getContext(), f2)));
                View view = null;
                if (MPScrollComponent.this.b == null || MPScrollComponent.this.b.getChildCount() <= 0) {
                    if (MPScrollComponent.this.i != null && MPScrollComponent.this.i.getChildCount() > 0) {
                        view = MPScrollComponent.this.i.getChildAt(0);
                    }
                } else {
                    view = MPScrollComponent.this.b.getChildAt(0);
                }
                if (view != null) {
                    machMap.put("scrollWidth", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPScrollComponent.this.mMachContext.getContext(), view.getWidth())));
                    machMap.put("scrollHeight", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(MPScrollComponent.this.mMachContext.getContext(), view.getHeight())));
                }
                machMap.put("isDragging", Boolean.valueOf(this.c));
                if (this.d) {
                    machMap.put("isDecelerating", Boolean.valueOf(!this.c));
                } else {
                    machMap.put("isDecelerating", Boolean.valueOf(this.d));
                }
                MachArray machArray = new MachArray();
                machArray.add(machMap);
                MPScrollComponent.this.dispatchEvent(str, machArray);
            }
        };
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "550615916f7f736d55987b9eec99793d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "550615916f7f736d55987b9eec99793d");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        this.k = mPComponent;
        a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r14.equals(com.meituan.robust.common.CommonConstant.File.CLASS) != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.machpro.component.scroll.MPScrollComponent.a
            java.lang.String r12 = "4f4d88c23413467e848c32f1036e5f63"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L25
            return
        L25:
            r1 = -1
            int r2 = r14.hashCode()
            switch(r2) {
                case -1151046732: goto L58;
                case -502352363: goto L4d;
                case 94742904: goto L44;
                case 184506693: goto L39;
                case 1191457029: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L63
        L2e:
            java.lang.String r0 = "showScrollIndicator"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 1
            goto L64
        L39:
            java.lang.String r0 = "showscrollindicator"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 0
            goto L64
        L44:
            java.lang.String r2 = "class"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L63
            goto L64
        L4d:
            java.lang.String r0 = "pagingEnabled"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 3
            goto L64
        L58:
            java.lang.String r0 = "scrollEnabled"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 4
            goto L64
        L63:
            r0 = -1
        L64:
            switch(r0) {
                case 0: goto La5;
                case 1: goto La5;
                case 2: goto L9e;
                case 3: goto L88;
                case 4: goto L6b;
                default: goto L67;
            }
        L67:
            super.updateAttribute(r14, r15)
            goto Lb1
        L6b:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.m = r14
            com.sankuai.waimai.machpro.component.scroll.c r14 = r13.b
            if (r14 == 0) goto L7c
            com.sankuai.waimai.machpro.component.scroll.c r14 = r13.b
            boolean r15 = r13.m
            r14.setScrollEnbaled(r15)
        L7c:
            com.sankuai.waimai.machpro.component.scroll.a r14 = r13.i
            if (r14 == 0) goto Lb1
            com.sankuai.waimai.machpro.component.scroll.a r14 = r13.i
            boolean r15 = r13.m
            r14.setScrollEnbaled(r15)
            return
        L88:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            boolean r15 = r13.l
            if (r14 == r15) goto Lb1
            r13.l = r14
            com.sankuai.waimai.machpro.component.scroll.c r14 = r13.b
            if (r14 == 0) goto Lb1
            com.sankuai.waimai.machpro.component.scroll.c r14 = r13.b
            boolean r15 = r13.l
            r14.setPagingEnabled(r15)
            return
        L9e:
            super.updateAttribute(r14, r15)
            r13.a()
            return
        La5:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r13.j = r14
            boolean r14 = r13.j
            r13.a(r14)
            return
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.scroll.MPScrollComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5283997ea9e5fad2f67dbe0d52e26ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5283997ea9e5fad2f67dbe0d52e26ba1");
            return;
        }
        if (((e) this.mView).getChildCount() > 0) {
            ((e) this.mView).removeAllViews();
        }
        if (this.k != null && this.k.getView() != null) {
            this.k.getYogaNode().a(getYogaNode().j());
            if (this.k.getView().getParent() != null) {
                ((ViewGroup) this.k.getView().getParent()).removeView(this.k.getView());
            }
            this.b = null;
            this.i = null;
            if (getYogaNode().j() == YogaFlexDirection.COLUMN) {
                this.b = new c(this.mMachContext.getContext());
                ((e) this.mView).addView(this.b, new FrameLayout.LayoutParams(-1, -1));
                this.b.addView(this.k.getView());
                this.b.setContentView(this.k.getView());
                this.b.setPagingEnabled(this.l);
                this.b.setScrollEnbaled(this.m);
            } else if (getYogaNode().j() == YogaFlexDirection.ROW) {
                this.i = new a(this.mMachContext.getContext());
                ((e) this.mView).addView(this.i, new FrameLayout.LayoutParams(-1, -2));
                this.i.addView(this.k.getView());
                this.i.setScrollEnbaled(this.m);
            }
        }
        a(this.j);
        c();
        b();
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1265aad2c3ba7fec130fc1439c53262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1265aad2c3ba7fec130fc1439c53262");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -907680051) {
                if (hashCode != 417766094) {
                    if (hashCode != 1146562627) {
                        if (hashCode == 2054366613 && str.equals("scrollStart")) {
                            c = 1;
                        }
                    } else if (str.equals("shouldStartDrag")) {
                        c = 3;
                    }
                } else if (str.equals("scrollEnd")) {
                    c = 2;
                }
            } else if (str.equals(com.meituan.metrics.common.Constants.FPS_TYPE_SCROLL)) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.c = true;
                    b();
                    return;
                case 1:
                    this.d = true;
                    c();
                    b();
                    return;
                case 2:
                    this.e = true;
                    c();
                    b();
                    return;
                case 3:
                    ((e) this.mView).setShouldStartDrag(str);
                    return;
                default:
                    super.addEventListener(str);
                    return;
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e410fb04081ceff4fd0f019aa73981f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e410fb04081ceff4fd0f019aa73981f");
        } else if (this.c || this.d || this.e) {
            if (this.i != null) {
                this.i.setScrollListener(this.n);
            }
            if (this.b != null) {
                this.b.setScrollListener(this.n);
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa2170e1a90525c06c851d4fbc14045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa2170e1a90525c06c851d4fbc14045");
        } else if (this.d || this.e) {
            if (this.i != null) {
                this.i.a();
            }
            if (this.b != null) {
                this.b.a();
            }
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e84708783ab390a33506fd6e6235b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e84708783ab390a33506fd6e6235b4");
            return;
        }
        if (this.i != null) {
            this.i.setHorizontalScrollBarEnabled(z);
        }
        if (this.b != null) {
            this.b.setVerticalScrollBarEnabled(z);
        }
    }

    @JSMethod(methodName = "scrollToOffset")
    @Keep
    public void scrollToOffset(MachMap machMap, Boolean bool) {
        Object[] objArr = {machMap, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9cfb82488c19b28cd9010c382386336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9cfb82488c19b28cd9010c382386336");
        } else if (machMap == null) {
        } else {
            int a2 = (int) com.sankuai.waimai.machpro.util.b.a(machMap.get(Constants.GestureMoveEvent.KEY_X));
            int a3 = (int) com.sankuai.waimai.machpro.util.b.a(machMap.get(Constants.GestureMoveEvent.KEY_Y));
            if (bool != null ? bool.booleanValue() : true) {
                if (this.i != null) {
                    this.i.smoothScrollTo(a2, a3);
                }
                if (this.b != null) {
                    this.b.smoothScrollTo(a2, a3);
                    return;
                }
                return;
            }
            if (this.i != null) {
                this.i.scrollTo(a2, a3);
            }
            if (this.b != null) {
                this.b.scrollTo(a2, a3);
            }
        }
    }

    @JSMethod(methodName = "contentOffset")
    @Keep
    public MachMap contentOffset() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d945ac680e9fbc85585e3cd766e314d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d945ac680e9fbc85585e3cd766e314d1");
        }
        MachMap machMap = new MachMap();
        if (this.b != null) {
            f = com.sankuai.waimai.machpro.util.b.a(this.b.getScrollY());
        } else {
            r2 = this.i != null ? com.sankuai.waimai.machpro.util.b.a(this.i.getScrollX()) : 0.0f;
            f = 0.0f;
        }
        machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(r2));
        machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(f));
        machMap.put("scrollLeft", Float.valueOf(r2));
        machMap.put("scrollTop", Float.valueOf(f));
        if (this.k != null && this.k.getView() != null) {
            machMap.put("scrollWidth", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.k.getView().getWidth())));
            machMap.put("scrollHeight", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.k.getView().getHeight())));
        }
        return machMap;
    }
}
