package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NewMemberInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_poi_member")
    public boolean isPoiMember;
    @SerializedName("is_support_member")
    public boolean isSupportMember;
    @SerializedName("join_text")
    public String joinText;
    @SerializedName("schema")
    public String scheme;
    @SerializedName("show_animation")
    public int showAnimation;
    @SerializedName("join_text_type")
    public String status;
}
