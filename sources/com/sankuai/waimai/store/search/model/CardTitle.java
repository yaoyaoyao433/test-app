package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CardTitle implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("main_title")
    public String mainTitle;
    @SerializedName("sub_title")
    public String subTitle;
    public int type;

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
