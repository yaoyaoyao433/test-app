package com.sankuai.waimai.store.order.detail.dialog.universaldialog;

import android.support.annotation.Keep;
import android.support.v4.provider.FontsContractCompat;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BtnStyle {
    private static final String NORMAL_STYLE = "normal";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("border_radius")
    public int borderRadius;
    @SerializedName("end_background_color")
    public String endBackgroundColor;
    @SerializedName("font_color")
    public String fontColor;
    @SerializedName("font_size")
    public int fontSize;
    @SerializedName(FontsContractCompat.Columns.WEIGHT)
    public String fontWeight;
    @SerializedName("start_background_color")
    public String startBackgroundColor;

    public boolean isBold() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d79a34ae31c0770643a80b3c19656e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d79a34ae31c0770643a80b3c19656e2")).booleanValue() : !"normal".equals(this.fontWeight);
    }
}
