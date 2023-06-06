package com.sankuai.waimai.store.poi.list.logreport;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.statistic.b {
    public static ChangeQuickRedirect c;
    private final String d;
    private com.sankuai.waimai.store.param.a e;

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String b() {
        return "b_dCrTp";
    }

    public a(@NonNull SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.param.a aVar) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a147dfb76fddc9f184ac3609e937785", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a147dfb76fddc9f184ac3609e937785");
            return;
        }
        this.d = aVar.G;
        this.e = aVar;
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String c() {
        return this.e.aO ? "b_waimai_v7hjhkuz_mc" : "b_ay8J4";
    }
}
