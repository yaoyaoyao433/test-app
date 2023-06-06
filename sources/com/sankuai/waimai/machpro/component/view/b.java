package com.sankuai.waimai.machpro.component.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends MPComponent<c> {
    public static ChangeQuickRedirect d;
    private boolean a;
    private a b;

    public b(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23d46ccec731b994eafb6a05ca19da8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23d46ccec731b994eafb6a05ca19da8");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public c createView() {
        c remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6869257d5620f523b4131a2ca5526db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6869257d5620f523b4131a2ca5526db6");
        }
        c cVar = null;
        if (this.mMachContext.getInstance().a() != null) {
            com.sankuai.waimai.machpro.view.pool.b a = this.mMachContext.getInstance().a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.view.pool.b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "eda9e9cfcb79c4e2d4038b2c29ae7b3f", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (c) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "eda9e9cfcb79c4e2d4038b2c29ae7b3f");
            } else if (a.b.size() > 0) {
                remove = a.b.remove(0);
            }
            cVar = remove;
        }
        if (cVar == null) {
            cVar = new c(this.mMachContext.getContext(), this.mYogaNode);
        }
        cVar.setYogaNode(this.mYogaNode);
        cVar.a(this);
        com.sankuai.waimai.machpro.view.pool.a aVar = this.mMachContext.getInstance().r;
        Object[] objArr3 = {1};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.machpro.view.pool.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d6e392e30d71a3c351f5c453241c298a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d6e392e30d71a3c351f5c453241c298a");
        } else {
            aVar.f++;
            if (aVar.f > 400) {
                aVar.f = 400;
            }
        }
        cVar.setClipChildren(false);
        return cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r17.equals(com.meituan.android.recce.props.gens.BorderTopLeftRadius.NAME) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateViewStyle(java.lang.String r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.view.b.updateViewStyle(java.lang.String, java.lang.Object):void");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateStyle(String str, Object obj, boolean z) {
        Object[] objArr = {str, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f65a30bb66ae9cf6e3133cae476222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f65a30bb66ae9cf6e3133cae476222");
        } else {
            super.updateStyle(str, obj, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r13.equals("background-size") == false) goto L34;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resetCssProperty(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.view.b.resetCssProperty(java.lang.String):void");
    }

    public final MPContext c() {
        return this.mMachContext;
    }

    private a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e762f44ae8ac0217393e4c27fff0e028", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e762f44ae8ac0217393e4c27fff0e028");
        }
        if (this.b == null) {
            this.b = new a(this);
        }
        this.b.a();
        return this.b;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public com.sankuai.waimai.machpro.view.decoration.b getBackgroundDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b60343b37d15ce48e772b69254c0964", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b60343b37d15ce48e772b69254c0964");
        }
        com.sankuai.waimai.machpro.view.decoration.b backgroundDrawable = super.getBackgroundDrawable();
        backgroundDrawable.d = false;
        return backgroundDrawable;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34acc5c6bbad9eacd0731c6e83d37c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34acc5c6bbad9eacd0731c6e83d37c2");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        ((c) this.mView).a(mPComponent.getView(), mPComponent.getYogaNode(), mPComponent, mPComponent2 != null ? mPComponent2.getView() : null);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onRemoveChild(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416803b32104d51373c44b48cbb9e6fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416803b32104d51373c44b48cbb9e6fe");
            return;
        }
        super.onRemoveChild(mPComponent);
        ((c) this.mView).a(mPComponent.getView(), mPComponent.getYogaNode());
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44bb39c7ca96b9e07cfa1ccbd0ca8d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44bb39c7ca96b9e07cfa1ccbd0ca8d0f");
            return;
        }
        super.onDestroy();
        this.mMachContext.removeBlurComponent(this);
    }
}
