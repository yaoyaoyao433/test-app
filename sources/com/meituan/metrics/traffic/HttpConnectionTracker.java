package com.meituan.metrics.traffic;

import com.meituan.metrics.traffic.TrafficRecord;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface HttpConnectionTracker {
    void disconnect();

    void error(Throwable th);

    void reportDetail(TrafficRecord.Detail detail);

    void reportRequestBody(long j);

    void reportResponseBody(long j);

    void trackRequest(String str, Map<String, List<String>> map);

    OutputStream trackRequestBody(OutputStream outputStream);

    void trackResponse(int i, String str, Map<String, List<String>> map);

    InputStream trackResponseBody(InputStream inputStream);
}
