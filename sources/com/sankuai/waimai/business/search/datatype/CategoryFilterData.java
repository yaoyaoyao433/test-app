package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CategoryFilterData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("category_filter_list")
    public List<a> categoryFilterList;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("code")
        public String a;
        @SerializedName("showText")
        public String b;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String c;
        @SerializedName("isHit")
        public boolean d;
        public boolean e;
    }
}
