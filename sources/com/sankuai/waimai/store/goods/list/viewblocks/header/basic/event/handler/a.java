package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.event.handler;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.coupon.a;
import com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.mach.event.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    Context b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private d d;
    private SGPoiServiceDialogBlock e;
    private a.b f;

    public a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, d dVar) {
        Object[] objArr = {context, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd158b13aaf4ea77a52fb656c7cc6ddb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd158b13aaf4ea77a52fb656c7cc6ddb");
            return;
        }
        this.b = context;
        this.c = aVar;
        this.d = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    @Override // com.sankuai.waimai.store.mach.event.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.store.mach.event.a r35, java.lang.String r36, java.util.Map<java.lang.String, java.lang.Object> r37) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.viewblocks.header.basic.event.handler.a.a(com.sankuai.waimai.store.mach.event.a, java.lang.String, java.util.Map):void");
    }
}
