package com.dianping.shield.feature;

import android.content.Context;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface LoadingAndLoadingMoreWithContextCreator {
    View emptyView(Context context);

    View loadingFailedView(Context context);

    View loadingMoreFailedView(Context context);

    View loadingMoreView(Context context);

    View loadingView(Context context);
}
