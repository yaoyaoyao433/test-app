package com.meituan.android.common.aidata.mrn;

import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureRequestBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<GetFeatureRequest> featureRequests = new ArrayList();
    public JSONObject jsFeatureParam;
}
