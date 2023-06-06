package com.sankuai.waimai.store.goods.detail.preload;

import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.preload.c;
import com.sankuai.waimai.store.base.preload.e;
import com.sankuai.waimai.store.goods.detail.SGNewGoodDetailActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;

    public a() {
        super(SGNewGoodDetailActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a72117e9dcb0d5f4c882fb51f43db6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a72117e9dcb0d5f4c882fb51f43db6");
        }
    }

    private void a(String str, MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {str, metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a8983549d398b262d633ce3c0464360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a8983549d398b262d633ce3c0464360");
        } else if (TextUtils.isEmpty(str) || metricsSpeedMeterTask == null) {
        } else {
            metricsSpeedMeterTask.recordStep("preload_start");
            e.a().a(str, metricsSpeedMeterTask);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0333  */
    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull com.sankuai.waimai.router.core.j r34, @android.support.annotation.NonNull com.sankuai.waimai.router.core.g r35) {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.detail.preload.a.a(com.sankuai.waimai.router.core.j, com.sankuai.waimai.router.core.g):void");
    }
}
