package com.sankuai.waimai.bussiness.order.confirm.model.ap;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @SerializedName("model_data")
    public String b;
    @SerializedName("native_data")
    public String c;
    @SerializedName(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE)
    public String d;

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc22d737967e6898c87b80b3f6475848", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc22d737967e6898c87b80b3f6475848")).booleanValue() : !TextUtils.isEmpty(this.b);
    }
}
