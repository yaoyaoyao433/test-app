package com.dianping.picasso.creator;

import android.view.View;
import com.dianping.picasso.model.PicassoModel;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ViewProcessor {
    void onInitView(View view, PicassoModel picassoModel);

    void onRefreshView(View view, PicassoModel picassoModel);
}
