package com.sankuai.waimai.machpro.component.body;

import com.facebook.yoga.YogaFlexDirection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.view.c;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.machpro.component.view.b {
    public static ChangeQuickRedirect a;

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb504f8162bc3e4caa33b8f71ca63c0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb504f8162bc3e4caa33b8f71ca63c0b");
            return;
        }
        ((c) this.mView).setClipChildren(false);
        mPContext.setBodyComponent(this);
        this.mYogaNode.a(YogaFlexDirection.COLUMN);
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public final c createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa5290fd282750427387a9c40afc54c", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa5290fd282750427387a9c40afc54c");
        }
        b bVar = new b(this.mMachContext);
        bVar.setYogaNode(this.mYogaNode);
        bVar.a(this);
        return bVar;
    }
}
