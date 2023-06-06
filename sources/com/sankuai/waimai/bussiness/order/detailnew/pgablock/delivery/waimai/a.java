package com.sankuai.waimai.bussiness.order.detailnew.pgablock.delivery.waimai;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.util.h;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected h.a b;

    public final void a(h.a aVar) {
        this.b = aVar;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e908fe14c5c7da2fc3fd9a76a74f0ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e908fe14c5c7da2fc3fd9a76a74f0ba");
            return;
        }
        char c = 65535;
        if (str.hashCode() == -1122162742 && str.equals("modify_address_event")) {
            c = 0;
        }
        if (c == 0 && this.b != null) {
            this.b.q();
        }
    }
}
