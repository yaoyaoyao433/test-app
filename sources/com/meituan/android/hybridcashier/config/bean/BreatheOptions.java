package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.util.gson.annotation.FailedType;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.neohybrid.util.gson.annotation.Required;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@JsonBean
@JsonCheck(failedType = FailedType.NULL)
/* loaded from: classes2.dex */
public class BreatheOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("breathe_death_options")
    @Required
    private String breatheDeathOptions;
    @SerializedName("breathe_delaymillis")
    @Required
    private long breatheDelayMillis;
    @SerializedName("breathe_interval_timemillis")
    @Required
    private long breatheIntervalTimeMillis;
    @SerializedName("breathe_timeoutmillis")
    @Required
    private long breatheTimeoutMillis;
    @SerializedName("breathe_unresponsive_times_as_broken")
    @Required
    private int breatheUnresponsiveTimesAsBroken;
    @SerializedName("enable_check_dom_count")
    @Required
    private boolean enableCheckDomCount;
    @SerializedName("enable_neo_breathe")
    @Required
    private boolean enableNeoBreathe;
    @SerializedName("enable_pixel_color")
    @Required
    private boolean enablePixelColor;

    public boolean isEnableNeoBreathe() {
        return this.enableNeoBreathe;
    }

    public boolean isEnablePixelColor() {
        return this.enablePixelColor;
    }

    public boolean isEnableCheckDomCount() {
        return this.enableCheckDomCount;
    }

    public int getBreatheUnresponsiveTimesAsBroken() {
        return this.breatheUnresponsiveTimesAsBroken;
    }

    public long getBreatheIntervalTimeMillis() {
        return this.breatheIntervalTimeMillis;
    }

    public long getBreatheDelayMillis() {
        return this.breatheDelayMillis;
    }

    public long getBreatheTimeoutMillis() {
        return this.breatheTimeoutMillis;
    }

    public String getBreatheDeathOptions() {
        return this.breatheDeathOptions;
    }
}
