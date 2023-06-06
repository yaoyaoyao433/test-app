package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AtmosphereMapFrame implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6910330239931911192L;
    @SerializedName("double_feed")
    public Frame doubleFrame;
    @SerializedName("single_feed")
    public Frame singleFrame;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Frame implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -6910330288931911192L;
        @SerializedName("frame_color2")
        public String endColor;
        @SerializedName("frame_bottom_pic")
        public String pic;
        @SerializedName("frame_color1")
        public String startColor;
    }
}
