package com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
    public static ChangeQuickRedirect o;
    @NonNull
    com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.d p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75673e33144d181339e440743ae6c7b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75673e33144d181339e440743ae6c7b4");
        } else {
            this.p = new com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c1b407266a7b9a9d368a6c13ad27c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c1b407266a7b9a9d368a6c13ad27c1");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p = com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.d.a((Map) this.c);
            this.p.j = false;
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.d = -1;
        this.p.e = null;
        this.p.g = -1;
    }
}
