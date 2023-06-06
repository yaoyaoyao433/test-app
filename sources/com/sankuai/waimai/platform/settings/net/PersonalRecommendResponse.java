package com.sankuai.waimai.platform.settings.net;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PersonalRecommendResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("privacySwitches")
    public SingleSwitch[] switches;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SingleSwitch implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("status")
        public int status;
        @SerializedName("type")
        public int type;
    }
}
