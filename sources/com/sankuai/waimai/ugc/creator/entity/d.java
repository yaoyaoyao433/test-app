package com.sankuai.waimai.ugc.creator.entity;

import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.ugc.creator.widgets.tag.TagData;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends c {
    @SerializedName("imageId")
    @Deprecated
    public String c;
    @SerializedName("imagePath")
    public String d;
    @SerializedName("localIdentifier")
    public String e;
    @SerializedName(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
    public long f;
    @SerializedName("selectTime")
    public long g;
    @SerializedName("uploadUrl")
    public String h;
    @SerializedName("picTag")
    public List<TagData> i;
    @SerializedName("imageEditInfo")
    public ImageEditInfo j;
}
