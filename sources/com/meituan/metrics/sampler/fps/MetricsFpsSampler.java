package com.meituan.metrics.sampler.fps;

import com.meituan.metrics.sampler.MetricsSampler;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MetricsFpsSampler extends MetricsSampler {
    void changeToFragment(Object obj);

    void startCustomRecordFps(String str);

    void stopCustomRecordFps(String str, Map<String, Object> map);
}
