package com.sankuai.waimai.platform.machpro.scrollerpull;

import com.facebook.yoga.YogaFlexDirection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.scroll.MPScrollComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.widget.pullrefresh.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.machpro.component.view.b {
    public static ChangeQuickRedirect a;
    private b b;

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "384cb9c10350a960baec5d49b402bb92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "384cb9c10350a960baec5d49b402bb92");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: b */
    public b createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7b3cf10111009cc2ebfbd6be3ca5a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7b3cf10111009cc2ebfbd6be3ca5a3");
        }
        this.b = new b(this.mMachContext.getContext(), this.mYogaNode);
        this.mYogaNode.a(YogaFlexDirection.COLUMN);
        return this.b;
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72ea987d1343f8f7d00df2dbef6b0dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72ea987d1343f8f7d00df2dbef6b0dd4");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        if (mPComponent instanceof MPScrollComponent) {
            this.b.setScrollComponent((MPScrollComponent) mPComponent);
            this.b.setRefreshListener(new c() { // from class: com.sankuai.waimai.platform.machpro.scrollerpull.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
                public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d886182882d2d35b450400e7e5b7051b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d886182882d2d35b450400e7e5b7051b");
                    } else {
                        a.this.b.c();
                    }
                }
            });
        } else if (mPComponent instanceof com.sankuai.waimai.machpro.component.view.b) {
            b bVar = this.b;
            com.sankuai.waimai.machpro.component.view.c view = ((com.sankuai.waimai.machpro.component.view.b) mPComponent).getView();
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "611cd7408502fc057b4283e67ce6f130", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "611cd7408502fc057b4283e67ce6f130");
                return;
            }
            bVar.f = view;
            bVar.setHeaderPullRefreshEnable(true);
        }
    }
}
