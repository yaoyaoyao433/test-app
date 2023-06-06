package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiMediaInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("type")
    public int type;
    @SerializedName("url")
    public String url;
    @SerializedName("video_cover")
    public String videoCover;
}
