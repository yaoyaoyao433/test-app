package com.sankuai.waimai.drug.order.confirm.model.mach;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderConfirmMachTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("model_data")
    public String machData;
    @SerializedName(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE)
    public String modelType;
    @SerializedName("native_data")
    public String nativeData;

    public boolean isModelValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "919b682478fae86de39e481840994c55", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "919b682478fae86de39e481840994c55")).booleanValue() : !TextUtils.isEmpty(this.machData);
    }

    public boolean isNativeDataValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "450754e2492c9c7d09d55f4c9a65cbf8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "450754e2492c9c7d09d55f4c9a65cbf8")).booleanValue() : !TextUtils.isEmpty(this.nativeData);
    }
}
