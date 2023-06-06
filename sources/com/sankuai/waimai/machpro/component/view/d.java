package com.sankuai.waimai.machpro.component.view;

import android.widget.FrameLayout;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.image.b;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.machpro.component.image.b b;
    private b c;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4233ac594a4842b010a12802bb396ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4233ac594a4842b010a12802bb396ec");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        this.b = new com.sankuai.waimai.machpro.component.image.b(this.mMachContext);
        this.b.h = new b.a() { // from class: com.sankuai.waimai.machpro.component.view.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.component.image.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb505c5352a277eea0b167691fd40097", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb505c5352a277eea0b167691fd40097");
                } else if ("widthFix".equals(d.this.b.d)) {
                    d.this.mYogaNode.h(d.this.b.getYogaNode().o().d);
                    d.this.requestLayout();
                } else if ("heightFix".equals(d.this.b.d)) {
                    d.this.mYogaNode.f(d.this.b.getYogaNode().m().d);
                    d.this.requestLayout();
                }
            }
        };
        this.c = new b(this.mMachContext);
        frameLayout.addView(this.b.getView());
        frameLayout.addView(this.c.getView());
        return frameLayout;
    }

    public d(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf516ff3d5529943c66145c2aff48db7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf516ff3d5529943c66145c2aff48db7");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void setNativeNodePtr(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b4745617bf1c36593b6f4aa16c5f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b4745617bf1c36593b6f4aa16c5f74");
            return;
        }
        super.setNativeNodePtr(j);
        this.b.setNativeNodePtr(this.mNativeNodePtr);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b71a6344770ca834574ccb925393d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b71a6344770ca834574ccb925393d7");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        this.c.onAppendChild(mPComponent, mPComponent2);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onRemoveChild(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f4fe3f77382b66bef785cf5f3faf4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f4fe3f77382b66bef785cf5f3faf4e");
            return;
        }
        super.onRemoveChild(mPComponent);
        this.c.onRemoveChild(mPComponent);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed2041bb2c238a587731b7ff1f8218d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed2041bb2c238a587731b7ff1f8218d");
            return;
        }
        super.updateAttribute(str, obj);
        this.b.updateAttribute(str, obj);
        if (this.mpAnimatorManager != null) {
            this.mpAnimatorManager.e.add(Integer.valueOf(this.b.getYogaNode().hashCode()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r13.equals("loadError") != false) goto L20;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.component.view.d.a
            java.lang.String r11 = "f8f5925f6a07d7ae9bf0ec870dd02f45"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L22
            return
        L22:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1428201511(0xffffffffaadf5fd9, float:-3.9679265E-13)
            if (r2 == r3) goto L5b
            r3 = 917719380(0x36b34954, float:5.343152E-6)
            if (r2 == r3) goto L51
            r3 = 1365523650(0x51643cc2, float:6.1266993E10)
            if (r2 == r3) goto L47
            r0 = 1915020349(0x7224e43d, float:3.2660137E30)
            if (r2 == r0) goto L3c
            goto L65
        L3c:
            java.lang.String r0 = "loadSuccess"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L65
            r0 = 0
            goto L66
        L47:
            java.lang.String r2 = "loadError"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L65
            goto L66
        L51:
            java.lang.String r0 = "clipRect"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L65
            r0 = 3
            goto L66
        L5b:
            java.lang.String r0 = "blurRadius"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L65
            r0 = 2
            goto L66
        L65:
            r0 = -1
        L66:
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L6d;
                case 2: goto L6d;
                case 3: goto L6d;
                default: goto L69;
            }
        L69:
            super.addEventListener(r13)
            return
        L6d:
            com.sankuai.waimai.machpro.component.image.b r0 = r12.b
            r0.addEventListener(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.view.d.addEventListener(java.lang.String):void");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateStyle(String str, Object obj, boolean z) {
        Object[] objArr = {str, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888b1101519bad900ae65c73c80b254b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888b1101519bad900ae65c73c80b254b");
            return;
        }
        super.updateStyle(str, obj, z);
        if ("background".equals(str) || BackgroundColor.NAME.equals(str) || "background-image".equals(str)) {
            return;
        }
        this.c.updateStyle(str, obj, z);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5d274d7d2936d88e2c37a5b12b0fb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5d274d7d2936d88e2c37a5b12b0fb9");
            return;
        }
        super.updateViewStyle(str, obj);
        this.b.updateViewStyle(str, obj);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7271c18bb5de8e5bd936de0420c0e1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7271c18bb5de8e5bd936de0420c0e1a4");
            return;
        }
        super.onAttachToParent();
        this.b.onAttachToParent();
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e34ada3ffc633cc6f98e5e26e4fc7ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e34ada3ffc633cc6f98e5e26e4fc7ff");
            return;
        }
        super.onDetachFromParent();
        this.b.onDetachFromParent();
    }
}
