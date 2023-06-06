package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiMemberInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("act_guide")
    public String actGuide;
    @SerializedName("is_poi_member")
    public boolean isPoiMember;
    @SerializedName("is_support_member")
    public boolean isSupportMember;
    @SerializedName("join_text")
    public String joinText;
    @SerializedName("level")
    public String level;
    @SerializedName("level_code")
    public String levelCode;
    @SerializedName("logo_url")
    public String logoUrl;
    @SerializedName("schema")
    public String scheme;
    @SerializedName("status")
    public int status;
}
