package com.dianping.agentsdk.framework;

import android.view.View;
import com.dianping.agentsdk.framework.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface o {
    View loadingMoreFailedView();

    View.OnClickListener loadingMoreRetryListener();

    l.a loadingMoreStatus();

    View loadingMoreView();

    void onBindView(l.a aVar);
}
