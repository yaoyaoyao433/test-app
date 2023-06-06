package com.sankuai.waimai.platform.domain.core.goods;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("picture_url")
    @Expose
    public String b;
    @SerializedName("width")
    @Expose
    public int c;
    @SerializedName("height")
    @Expose
    public int d;

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }
}
