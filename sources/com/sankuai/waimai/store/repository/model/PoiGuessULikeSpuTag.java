package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiGuessULikeSpuTag implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -14508122950148179L;
    @SerializedName("extra")
    public String extra;
    public int index;
    @SerializedName("tag_id")
    public String tagId;
    @SerializedName("tag_name")
    public String tagName;
    @SerializedName("tag_type")
    public int tagType;

    public PoiGuessULikeSpuTag(String str) {
        this.tagName = str;
    }
}
