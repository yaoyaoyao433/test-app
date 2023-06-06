package com.sankuai.waimai.platform.settings.net;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class UserInfoResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("user")
    public User user;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class User implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("mobile")
        public String mobile;
        @SerializedName("regTime")
        public String regTime;
    }
}
