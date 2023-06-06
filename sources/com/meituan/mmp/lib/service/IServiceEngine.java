package com.meituan.mmp.lib.service;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.web.f;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface IServiceEngine extends a {
    public static final int RELEASE_DELAY_MILLIS = 0;

    void evaluateJavascript(String str, String str2, @Nullable ValueCallback<String> valueCallback);

    void evaluateJsFile(DioFile dioFile, @Nullable ValueCallback<String> valueCallback);

    void launch(Context context);

    void relaunch();

    void release();

    void setJsHandler(com.meituan.mmp.lib.interfaces.b bVar);

    void setMiniApp(m mVar);

    void setOnEngineInitFailedListener(f fVar);

    void setOnJsUncaughtErrorHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    void setReporter(h hVar);

    void setSupportMsiApis(Map<String, List<String>> map, Map<String, List<String>> map2);
}
