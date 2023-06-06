package com.dianping.agentsdk.framework;

import android.view.View;
import com.dianping.agentsdk.framework.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface n {
    View emptyView();

    View loadingFailedView();

    View.OnClickListener loadingRetryListener();

    l.b loadingStatus();

    View loadingView();
}
