package com.sankuai.waimai.machpro.component.body;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.view.c;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    private int b;
    private MPContext f;
    private boolean g;

    public b(MPContext mPContext) {
        super(mPContext.getContext());
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa17cd597ed247eb56cc36ab0787d14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa17cd597ed247eb56cc36ab0787d14");
            return;
        }
        this.b = 1;
        this.f = mPContext;
    }

    @Override // com.sankuai.waimai.machpro.component.view.c
    public final void a() {
        com.sankuai.waimai.machpro.monitor.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "860d3bdd848761b6a6a3cea24e1ac548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "860d3bdd848761b6a6a3cea24e1ac548");
        } else if (this.b > 1 || (bVar = this.f.getInstance().q) == null) {
        } else {
            bVar.a("yogaLayout_start");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.view.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4fc84190374836e123767269e7bd52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4fc84190374836e123767269e7bd52");
        } else if (this.b <= 1) {
            this.b = 2;
            com.sankuai.waimai.machpro.monitor.b bVar = this.f.getInstance().q;
            if (bVar != null) {
                bVar.a("yogaLayout_end");
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.view.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51538de83e76ee8a3f8309cb1757e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51538de83e76ee8a3f8309cb1757e60");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.b == 2) {
            this.b = 3;
            if (this.f.getInstance() != null) {
                this.f.getInstance().b();
            }
        }
        if (this.g || !com.sankuai.waimai.machpro.util.b.a(this, com.sankuai.waimai.machpro.util.b.a(this.f.getContext()))) {
            return;
        }
        this.g = true;
        if (this.f.getInstance() != null) {
            this.f.getInstance().c();
        }
    }
}
