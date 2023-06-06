package com.sankuai.titans.live.video.bridge.rtc.entity;

import com.dianping.titans.utils.LocalIdUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class QualityEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(LocalIdUtils.QUERY_QUALITY)
    @Expose
    public int quality;
    @SerializedName(DeviceInfo.USER_ID)
    @Expose
    public String userId;
}
