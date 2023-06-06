package com.sankuai.waimai.business.page.common.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ChannelInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bg_pic_url")
    public String bgPicUrl;
    @SerializedName("name")
    public String name;
    @SerializedName("name_pic_url")
    public String namePicUrl;
}
