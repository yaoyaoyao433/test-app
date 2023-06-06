package com.meituan.mtwebkit;

import android.net.Uri;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MTWebResourceRequest {
    String getMethod();

    Map<String, String> getRequestHeaders();

    Uri getUrl();

    boolean hasGesture();

    boolean isForMainFrame();

    boolean isRedirect();
}
