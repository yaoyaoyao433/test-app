package com.sankuai.waimai.platform.domain.manager.ugc;

import android.content.Context;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface IWMLivePreloadManager {
    public static final String LIVE_PRELOAD_SERVICE_KEY = "wm_live_preload";
    public static final String PARAM_BIZ = "live-biz";
    public static final String PARAM_LIVE_ID = "live-id";
    public static final String PARAM_SRC = "live-src";

    void cancelPreload(Map<String, String> map);

    void preload(Context context, Map<String, String> map);
}
