package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.foundation.utils.e b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb29375919b615eb8d60a46d8411dc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb29375919b615eb8d60a46d8411dc4");
        } else {
            this.b = new com.sankuai.waimai.foundation.utils.e("order_detail_status_operation_file_name");
        }
    }
}
