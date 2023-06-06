package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CouponLabel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content_color")
    public String contentColor;
    @SerializedName("label_background_color")
    public String labelBackgroundColor;
    @SerializedName("label_doc")
    public String labelDoc;
    @SerializedName("label_frame_color")
    public String labelFrameColor;
    @SerializedName("label_type")
    public int labelType;
}
