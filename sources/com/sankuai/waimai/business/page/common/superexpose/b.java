package com.sankuai.waimai.business.page.common.superexpose;

import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0182f13e6d113f9b8319bab82c709b14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0182f13e6d113f9b8319bab82c709b14")).longValue();
        }
        String str = "wm_ad_super_expose_config_android";
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "wm_ad_super_expose_config_android_in_mt";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "wm_ad_super_expose_config_android_in_dp";
        }
        ABStrategy a2 = a(str, null);
        if (a2 != null) {
            String paramWithKey = a2.getParamWithKey("heavenfall_close_wait_time");
            if (TextUtils.isEmpty(paramWithKey)) {
                return PayTask.j;
            }
            try {
                long parseLong = Long.parseLong(paramWithKey);
                com.sankuai.waimai.foundation.utils.log.a.c("WMUnionTransition", "wait time millisecond from ab platform:%s", Long.valueOf(parseLong));
                return parseLong;
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.b(th);
                return PayTask.j;
            }
        }
        return PayTask.j;
    }
}
