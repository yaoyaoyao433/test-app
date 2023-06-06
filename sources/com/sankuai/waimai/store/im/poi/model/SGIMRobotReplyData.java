package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGIMRobotReplyData extends SGIMRobotPraiseData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("text")
    public String content;
    public long mPoiId;
    public long msgId;
}
