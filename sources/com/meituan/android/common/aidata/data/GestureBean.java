package com.meituan.android.common.aidata.data;

import android.support.annotation.Keep;
import com.meituan.android.common.aidata.utils.GsonProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class GestureBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app;
    public String app_launch_id;
    public String cid;
    public String collect_id;
    public String end_pressure;
    public long end_time;
    public String end_x;
    public String end_y;
    public double lat;
    public double lng;
    public String msid;
    public String report_id;
    public String req_id;
    public String scale;
    public String sdk_ver;
    public long seq;
    public String start_pressure;
    public long start_time;
    public String start_x;
    public String start_y;
    public long stm;
    public long time_gap;
    public long time_interval;
    public long tm;
    public String trail;
    public String x_gap;
    public String y_gap;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32f820865ace5a35d5cee998abe6557", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32f820865ace5a35d5cee998abe6557") : GsonProvider.getInstance().toJson(this);
    }
}
