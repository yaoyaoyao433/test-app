package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TopNumberAndPrivacyTag implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6910330239931910032L;
    @SerializedName("label_border_color")
    public String labelBorderColor;
    @SerializedName("label_text")
    public String labelText;
    @SerializedName("label_text_color")
    public String labelTextColor;
}
