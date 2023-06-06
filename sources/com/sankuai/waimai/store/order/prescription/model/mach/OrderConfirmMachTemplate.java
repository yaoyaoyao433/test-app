package com.sankuai.waimai.store.order.prescription.model.mach;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderConfirmMachTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("model_data")
    public String machData;
    @SerializedName(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE)
    public String modelType;
    @SerializedName("native_data")
    public String nativeData;
}
