package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiContainerTemplate implements Serializable {
    public static final int TEMPLATE_TYPE_DEFAULT = 0;
    public static final int TEMPLATE_TYPE_GUIDE = 2;
    public static final int TEMPLATE_TYPE_SPECIAL = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("type")
    public int type;

    public boolean isDefault() {
        return this.type == 0;
    }

    public boolean isSpecial() {
        return this.type == 1;
    }

    public boolean isGuide() {
        return this.type == 2;
    }
}
