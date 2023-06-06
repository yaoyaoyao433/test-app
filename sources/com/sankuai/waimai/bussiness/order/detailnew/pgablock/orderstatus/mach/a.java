package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    public com.sankuai.waimai.bussiness.order.rocks.d c;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a d;
    public com.sankuai.waimai.bussiness.order.detailnew.controller.c e;

    public a(Context context, com.sankuai.waimai.bussiness.order.rocks.d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221d1e35ef2bf84ad685c00dbde45b6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221d1e35ef2bf84ad685c00dbde45b6e");
            return;
        }
        this.b = context;
        this.c = dVar;
        this.d = this.c.aP.a().b;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7387a3bd77fe8793d9b41294dc9b057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7387a3bd77fe8793d9b41294dc9b057");
            return;
        }
        Boolean bool = this.c.aa.a().b;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        this.c.Z.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
    }
}
