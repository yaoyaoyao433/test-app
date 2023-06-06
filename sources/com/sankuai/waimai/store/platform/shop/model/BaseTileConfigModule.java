package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BaseTileConfigModule implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("mach_id")
    public String machID;
    @SerializedName("tile_config")
    public Object tileConfig;
}
