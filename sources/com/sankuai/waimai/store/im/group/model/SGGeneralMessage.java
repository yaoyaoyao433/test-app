package com.sankuai.waimai.store.im.group.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGeneralMessage implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public Object data;
    @SerializedName("summary")
    public String summary;
    @SerializedName("type")
    public String type;
}
