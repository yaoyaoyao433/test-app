package com.sankuai.titans.live.video.bridge.rtc.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VolumeEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(DeviceInfo.USER_ID)
    @Expose
    public String userId;
    @SerializedName("volume")
    @Expose
    public int volume;
}
