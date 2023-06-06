package com.sankuai.waimai.business.page.kingkong.future.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(BaseResponse baseResponse, String str) {
        Object[] objArr = {baseResponse, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5244ae306d880388dd09512b6fec2ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5244ae306d880388dd09512b6fec2ffb");
        } else if (baseResponse == null) {
            i.d(new a().a("kingkong_network_error").b(str).c(StringUtil.NULL).b());
        } else if (baseResponse.code != 0) {
            a.AbstractC1040a b = new a().a("kingkong_network_error").b(str);
            StringBuilder sb = new StringBuilder();
            sb.append(baseResponse.code);
            i.d(b.c(sb.toString()).b());
        }
    }
}
