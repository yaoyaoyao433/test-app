package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ag extends ab {
    @SerializedName(Constants.Environment.KEY_TN)
    @Expose
    public int h;
    @SerializedName(RemoteMessageConst.TO)
    @Expose
    public int i;

    @Override // com.dianping.sdk.pike.packet.ab, com.dianping.sdk.pike.packet.j
    public final int a() {
        return 38;
    }
}
