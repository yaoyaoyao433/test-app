package com.meituan.metrics.traffic;

import com.meituan.android.common.kitefly.CatchException;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SystemTrafficProviderV27 extends SystemTrafficProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String CIPS_CH_LAST_TRAFFIC_STATS;
    private final String QTAGUID_UID_STATS;
    private final CatchException exception;
    private volatile boolean isInit;

    public SystemTrafficProviderV27() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd99f2cbe18d74d5c99ba62b604375d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd99f2cbe18d74d5c99ba62b604375d6");
            return;
        }
        this.QTAGUID_UID_STATS = "/proc/net/xt_qtaguid/stats";
        this.CIPS_CH_LAST_TRAFFIC_STATS = "metrics_last_traffic_stats";
        this.exception = new CatchException("SystemTrafficV27", 1, 300000L);
        BasicTrafficUnit.initFromCIP("metrics_last_traffic_stats", this.totalUnit);
        if (this.totalUnit.rxBytes == 0 && this.totalUnit.txBytes == 0) {
            parseTotalTrafficFromQtaguid(this.totalUnit);
        }
        this.isInit = true;
    }

    @Override // com.meituan.metrics.traffic.SystemTrafficProvider
    public void updateTotalTraffic(BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "534361bff3160fb913e01cb39a789feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "534361bff3160fb913e01cb39a789feb");
        } else if (this.isInit) {
            BasicTrafficUnit basicTrafficUnit2 = new BasicTrafficUnit();
            parseTotalTrafficFromQtaguid(basicTrafficUnit2);
            calIncreaseTraffic(basicTrafficUnit2, basicTrafficUnit);
        }
    }

    private void calIncreaseTraffic(BasicTrafficUnit basicTrafficUnit, BasicTrafficUnit basicTrafficUnit2) {
        Object[] objArr = {basicTrafficUnit, basicTrafficUnit2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c06d6b3aba9385a82db1ea7db36a962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c06d6b3aba9385a82db1ea7db36a962");
            return;
        }
        String str = CIPS_CH_SYS_TRAFFIC + TimeUtil.currentSysDate();
        BasicTrafficUnit.initFromCIP(str, basicTrafficUnit2);
        basicTrafficUnit2.total += basicTrafficUnit.total - this.totalUnit.total;
        basicTrafficUnit2.rxBytes += basicTrafficUnit.rxBytes - this.totalUnit.rxBytes;
        basicTrafficUnit2.txBytes += basicTrafficUnit.txBytes - this.totalUnit.txBytes;
        basicTrafficUnit2.backgroundBytes += basicTrafficUnit.backgroundBytes - this.totalUnit.backgroundBytes;
        basicTrafficUnit2.foregroundBytes += basicTrafficUnit.foregroundBytes - this.totalUnit.foregroundBytes;
        basicTrafficUnit2.wifiBytes += basicTrafficUnit.wifiBytes - this.totalUnit.wifiBytes;
        basicTrafficUnit2.mobileBytes += basicTrafficUnit.mobileBytes - this.totalUnit.mobileBytes;
        BasicTrafficUnit.saveToCIP(str, basicTrafficUnit2);
        this.totalUnit = basicTrafficUnit;
        BasicTrafficUnit.saveToCIP("metrics_last_traffic_stats", this.totalUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: Throwable -> 0x00ee, TryCatch #1 {Throwable -> 0x00ee, blocks: (B:12:0x0044, B:15:0x0057, B:18:0x0064, B:20:0x006c, B:23:0x0077, B:35:0x00b3, B:36:0x00b6, B:38:0x00c0, B:39:0x00c4, B:41:0x00e1, B:42:0x00e8, B:37:0x00b9, B:28:0x0099, B:31:0x00a5), top: B:64:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[Catch: Throwable -> 0x00ee, TryCatch #1 {Throwable -> 0x00ee, blocks: (B:12:0x0044, B:15:0x0057, B:18:0x0064, B:20:0x006c, B:23:0x0077, B:35:0x00b3, B:36:0x00b6, B:38:0x00c0, B:39:0x00c4, B:41:0x00e1, B:42:0x00e8, B:37:0x00b9, B:28:0x0099, B:31:0x00a5), top: B:64:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1 A[Catch: Throwable -> 0x00ee, TryCatch #1 {Throwable -> 0x00ee, blocks: (B:12:0x0044, B:15:0x0057, B:18:0x0064, B:20:0x006c, B:23:0x0077, B:35:0x00b3, B:36:0x00b6, B:38:0x00c0, B:39:0x00c4, B:41:0x00e1, B:42:0x00e8, B:37:0x00b9, B:28:0x0099, B:31:0x00a5), top: B:64:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: Throwable -> 0x00ee, TRY_LEAVE, TryCatch #1 {Throwable -> 0x00ee, blocks: (B:12:0x0044, B:15:0x0057, B:18:0x0064, B:20:0x006c, B:23:0x0077, B:35:0x00b3, B:36:0x00b6, B:38:0x00c0, B:39:0x00c4, B:41:0x00e1, B:42:0x00e8, B:37:0x00b9, B:28:0x0099, B:31:0x00a5), top: B:64:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseTotalTrafficFromQtaguid(com.meituan.metrics.util.BasicTrafficUnit r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.traffic.SystemTrafficProviderV27.parseTotalTrafficFromQtaguid(com.meituan.metrics.util.BasicTrafficUnit):void");
    }
}
