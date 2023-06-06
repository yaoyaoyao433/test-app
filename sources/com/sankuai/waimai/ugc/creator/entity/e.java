package com.sankuai.waimai.ugc.creator.entity;

import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.tencent.connect.share.QzonePublish;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends c {
    @SerializedName("videoCoverId")
    @Deprecated
    public String c;
    @SerializedName("videoCoverKNBUri")
    public String d;
    @SerializedName("videoCoverPath")
    public String e;
    @SerializedName("videoId")
    @Deprecated
    public String f;
    @SerializedName("videoKNBUri")
    public String g;
    @SerializedName(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH)
    public String h;
    @SerializedName("videoWidth")
    public int i;
    @SerializedName("videoHeight")
    public int j;
    @SerializedName(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION)
    public long k;
    @SerializedName(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
    public long l;
}
