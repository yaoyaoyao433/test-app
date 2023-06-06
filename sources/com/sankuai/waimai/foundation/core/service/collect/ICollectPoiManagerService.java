package com.sankuai.waimai.foundation.core.service.collect;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ICollectPoiManagerService {
    public static final String KEY = "ICollectPoiManagerService";

    void cancelCollectPoi(Activity activity, String str, String str2);

    void checkCollectPoi(Activity activity, String str, String str2);

    void collectPoi(Activity activity, String str, String str2);

    void setCollectPoiListener(a aVar);
}
