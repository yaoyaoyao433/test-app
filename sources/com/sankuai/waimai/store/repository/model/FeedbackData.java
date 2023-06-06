package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FeedbackData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("questions_entrance")
    public List<FeedbackInfo> mFeedbackInfos;
}
