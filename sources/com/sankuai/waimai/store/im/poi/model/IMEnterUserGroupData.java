package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class IMEnterUserGroupData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enter_group_btn_text")
    public String enterGroupBtnText;
    @SerializedName("enter_group_title")
    public String enterGroupTitle;
    @SerializedName("source")
    public String source;
    @SerializedName("enter_group_tip")
    public String tip;
}
