package com.meituan.android.common.locate.fusionlocation.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(Double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2efec9fa5479db13ae7d1c87c511609b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2efec9fa5479db13ae7d1c87c511609b")).doubleValue();
        }
        double d = (dArr[1] == null || dArr[1].doubleValue() < -69.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -51.0d) ? (dArr[1] == null || dArr[1].doubleValue() < -80.0d) ? -0.09294404d : 0.05494506d : (dArr[2] == null || dArr[2].doubleValue() < -46.0d) ? -0.02658228d : 0.02091743d : (dArr[1] == null || dArr[1].doubleValue() < -51.0d) ? (dArr[1] == null || dArr[1].doubleValue() < -53.0d) ? 0.13559322d : 0.06666667d : (dArr[2] == null || dArr[2].doubleValue() < -54.0d) ? 0.09090909d : 0.1723343d;
        double d2 = (dArr[1] == null || dArr[1].doubleValue() < -69.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -51.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -72.0d) ? -0.034924474d : -0.08956018d : (dArr[1] == null || dArr[1].doubleValue() < -74.0d) ? 0.0076732635d : -0.14118537d : (dArr[1] == null || dArr[1].doubleValue() < -51.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -51.0d) ? 0.1413941d : 0.07934392d : 0.15238582d;
        double d3 = (dArr[1] == null || dArr[1].doubleValue() < -69.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -49.0d) ? (dArr[1] == null || dArr[1].doubleValue() < -108.0d) ? -0.06905418d : 0.055462267d : (dArr[1] == null || dArr[1].doubleValue() < -75.0d) ? 0.017221248d : -0.094624124d : (dArr[1] == null || dArr[1].doubleValue() < -59.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -46.0d) ? 0.098754495d : 0.009295649d : (dArr[2] == null || dArr[2].doubleValue() < -54.0d) ? 0.08988252d : 0.14190416d;
        return com.meituan.android.common.locate.fusionlocation.utils.b.d(d + d2 + d3 + ((dArr[1] == null || dArr[1].doubleValue() < -69.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -51.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -76.0d) ? -0.005444281d : -0.07332438d : (dArr[2] == null || dArr[2].doubleValue() < -47.0d) ? -0.016796306d : 0.019822583d : (dArr[1] == null || dArr[1].doubleValue() < -51.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -38.0d) ? 0.09943701d : 0.010925724d : (dArr[1] == null || dArr[1].doubleValue() < -30.0d) ? 0.13844039d : 0.09865603d) + ((dArr[1] == null || dArr[1].doubleValue() < -67.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -51.0d) ? (dArr[2] == null || dArr[2].doubleValue() < -79.0d) ? -0.0016624269d : -0.06776806d : (dArr[2] == null || dArr[2].doubleValue() < -30.0d) ? -0.0069952495d : 0.09906787d : (dArr[1] == null || dArr[1].doubleValue() < -52.0d) ? (dArr[1] == null || dArr[1].doubleValue() < -53.0d) ? 0.09155154d : -0.02542984d : (dArr[2] == null || dArr[2].doubleValue() < -57.0d) ? -0.004684098d : 0.12221018d));
    }
}
