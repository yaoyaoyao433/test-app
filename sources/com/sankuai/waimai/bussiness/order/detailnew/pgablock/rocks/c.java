package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect n;
    private Context a;
    private com.sankuai.waimai.business.order.api.detail.block.a b;

    public c(Context context, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5d53150189126ec8c418e213920b4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5d53150189126ec8c418e213920b4b");
            return;
        }
        this.a = context;
        this.b = aVar;
    }

    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d19869788811a36d397e32edb46dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d19869788811a36d397e32edb46dfe");
            return;
        }
        char c = 65535;
        if (str.hashCode() == -649876731 && str.equals("refresh_order_event")) {
            c = 0;
        }
        if (c == 0 && map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.get("refreshDetail"));
            boolean parseBoolean = Boolean.parseBoolean(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(map.get(TitansBundle.PARAM_SHOW_LOADING));
            boolean parseBoolean2 = Boolean.parseBoolean(sb2.toString());
            if (parseBoolean) {
                this.b.c(parseBoolean2);
            } else {
                this.b.b(parseBoolean2);
            }
        }
    }
}
