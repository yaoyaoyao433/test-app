package com.sankuai.waimai.business.page.home.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class UUIDMonitoringReporter {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ReportCode {
        public static final int HOME_NEW_RCMDBOARD_CODE = 1;
        public static final int HOME_PAGE_FUTURE_CODE = 4;
        public static final int HOME_PAGE_POILIST_CODE = 2;
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a6f190ecd13c0fb162b771af73ae3c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a6f190ecd13c0fb162b771af73ae3c9");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(((((i * 10) + (1 ^ (TextUtils.isEmpty(com.sankuai.waimai.platform.b.A().c()) ? 1 : 0))) * 10) + (com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? 1 : 0)) * 10000, "waimai_api_uuid_monitoring", SystemClock.elapsedRealtime());
        }
    }
}
