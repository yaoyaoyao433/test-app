package com.meituan.metrics.traffic;

import android.os.Process;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class SystemTrafficProvider {
    public static String CIPS_CH_SYS_TRAFFIC = "metrics_sys_traffic_";
    public static ChangeQuickRedirect changeQuickRedirect;
    public BasicTrafficUnit totalUnit;
    public int uid;

    public abstract void updateTotalTraffic(BasicTrafficUnit basicTrafficUnit);

    public SystemTrafficProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32e984c49371001d98ca0151f5d515da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32e984c49371001d98ca0151f5d515da");
            return;
        }
        this.uid = Process.myUid();
        this.totalUnit = new BasicTrafficUnit();
    }

    public BasicTrafficUnit getIncreaseTrafficUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c587531d1d6c1b8dc1137790fc90030", RobustBitConfig.DEFAULT_VALUE)) {
            return (BasicTrafficUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c587531d1d6c1b8dc1137790fc90030");
        }
        BasicTrafficUnit basicTrafficUnit = new BasicTrafficUnit();
        BasicTrafficUnit.initFromCIP(CIPS_CH_SYS_TRAFFIC + TimeUtil.currentSysDate(), basicTrafficUnit);
        return basicTrafficUnit;
    }
}
