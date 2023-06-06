package com.sankuai.waimai.business.im.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "797ac1807ed90d3163f8f0370405b1c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "797ac1807ed90d3163f8f0370405b1c9")).booleanValue();
        }
        String str = "wm_map_new_style";
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "mt_map_new_style";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "dp_map_new_style";
        }
        ABStrategy a2 = a(str, null);
        if (a2 != null) {
            return TextUtils.equals(a2.expName, ErrorCode.ERROR_TYPE_B);
        }
        return false;
    }
}
