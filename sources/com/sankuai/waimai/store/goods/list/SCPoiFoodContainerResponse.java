package com.sankuai.waimai.store.goods.list;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SCPoiFoodContainerResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("msc_additional_info")
    public HashMap<String, String> additionalInfo;
    @SerializedName(ContainerInfo.ENV_MSC)
    public boolean isMsc;
}
