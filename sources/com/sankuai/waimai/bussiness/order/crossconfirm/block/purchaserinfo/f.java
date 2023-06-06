package com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public boolean b;
    public long c;
    public String d;
    public int e;
    @Nullable
    public FieldInfo f;
    @Nullable
    public FieldInfo g;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7288105e4489cbe249176dd61a9ea0e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7288105e4489cbe249176dd61a9ea0e5");
        } else {
            this.d = "";
        }
    }
}
