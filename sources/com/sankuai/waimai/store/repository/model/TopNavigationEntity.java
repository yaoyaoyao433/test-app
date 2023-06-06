package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class TopNavigationEntity {
    @SerializedName("slogan")
    public String a;
    @SerializedName("navigate_entry_list")
    public List<NavigationActivity> b;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class NavigationActivity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public String activityId;
        @SerializedName("h5_url")
        public String h5Url;
        @SerializedName("pic_url")
        public String picUrl;
    }
}
