package com.sankuai.waimai.foundation.core.lifecycle;

import android.app.Activity;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {
    void onAppToBackground(@Nullable Activity activity);

    void onAppToForeground(@Nullable Activity activity);
}
