package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachBackgroundConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8871808188076579422L;
    @SerializedName("background_color")
    public String backgroundColor;
    @SerializedName("background_image")
    public String backgroundImage;
    @SerializedName("background_image_height")
    public int backgroundImageHeight;
}
