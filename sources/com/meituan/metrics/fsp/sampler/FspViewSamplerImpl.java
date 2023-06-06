package com.meituan.metrics.fsp.sampler;

import android.app.Activity;
import com.meituan.metrics.fsp.FspBean;
import com.meituan.metrics.fsp.FspConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface FspViewSamplerImpl {
    FspBean onActivityCreated(Activity activity, long j);

    void onActivityCreated(Activity activity, FspBean fspBean);

    FspBean onDetectFinish(int i);

    void onDown();

    boolean onScroll();

    void setCallBack(FspViewSamplerCallBack fspViewSamplerCallBack);

    void setFmpConfig(FspConfig fspConfig);
}
