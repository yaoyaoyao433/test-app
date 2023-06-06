package com.sankuai.waimai.machpro.component.scroll;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.machpro.component.view.b {
    public static ChangeQuickRedirect a;

    public d(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7816f8338b873d388c82560aee5221", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7816f8338b873d388c82560aee5221");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public final com.sankuai.waimai.machpro.component.view.c createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc98822336291fb6456afdb5445539e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.component.view.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc98822336291fb6456afdb5445539e");
        }
        a aVar = new a(this.mMachContext.getContext(), this.mYogaNode);
        aVar.a(this);
        aVar.setClipChildren(false);
        return aVar;
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d082ef9a17791a7c7311cbb678313b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d082ef9a17791a7c7311cbb678313b");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        b();
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    public void onRemoveChild(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a7b497f27d44639296bc6a9bcd4575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a7b497f27d44639296bc6a9bcd4575");
            return;
        }
        super.onRemoveChild(mPComponent);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c8b57d3fe7ced58c371091e0dce363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c8b57d3fe7ced58c371091e0dce363");
        } else if (getParentComponent() instanceof MPScrollComponent) {
            getParentComponent().markDirty();
            if (getParentComponent().getView() != null) {
                getParentComponent().getView().requestLayout();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.machpro.component.view.c {
        public static ChangeQuickRedirect a;

        public a(Context context, com.facebook.yoga.d dVar) {
            super(context, dVar);
            Object[] objArr = {d.this, context, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cadf7acbaf7925382d4e14901cc321de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cadf7acbaf7925382d4e14901cc321de");
            }
        }

        @Override // android.view.View, android.view.ViewParent
        public final void requestLayout() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd40aabfa1a0491bae672a9f34c49b90", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd40aabfa1a0491bae672a9f34c49b90");
                return;
            }
            super.requestLayout();
            d.this.b();
        }
    }
}
