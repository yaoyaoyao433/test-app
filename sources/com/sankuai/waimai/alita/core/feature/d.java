package com.sankuai.waimai.alita.core.feature;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @SerializedName("bizName")
    public String b;
    @SerializedName("tableKey")
    public String c;
    @SerializedName("features")
    public String d;
    @SerializedName(JSFeatureConfig.KEY_BUNDLE_FEATURE_REALTIME)
    public boolean e;
    @SerializedName("source")
    public String f;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7655a44e0645a6c40e4d37fc7d3cebe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7655a44e0645a6c40e4d37fc7d3cebe");
        } else {
            this.f = AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ccb051cf7f13ca32523c9db58021633", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ccb051cf7f13ca32523c9db58021633");
        }
        return "AlitaGetFeatureConfig{bizName='" + this.b + "', tableKey='" + this.c + "', features='" + this.d + "', isRealTime=" + this.e + "', source=" + this.f + '}';
    }
}
