package com.sankuai.waimai.store.manager.preload;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ResourcePreloadItem implements Serializable {
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_LOTTIE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("type")
    public int type;
    @SerializedName("url")
    public String url;
}
