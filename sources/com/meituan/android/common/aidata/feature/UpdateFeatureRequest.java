package com.meituan.android.common.aidata.feature;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UpdateFeatureRequest extends AbsFeatureRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("features")
    public Map<String, List<ResultRow>> feature;
}
