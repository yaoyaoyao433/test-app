package com.meituan.msc.modules.service;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.modules.engine.o;
import java.lang.Thread;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface IServiceEngine extends b {
    public static final int RELEASE_DELAY_MILLIS = 0;

    void evaluateJavascript(String str, String str2, @Nullable ValueCallback<String> valueCallback);

    void evaluateJsFile(DioFile dioFile, String str, @Nullable o oVar, String str2, LoadJSCodeCacheCallback loadJSCodeCacheCallback);

    a getEngineStatus();

    JSInstance getJSInstance();

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    i getJsExecutor();

    void launch(com.meituan.msc.modules.engine.h hVar, Context context, d dVar);

    void relaunch();

    void release();

    void setOnEngineInitFailedListener(com.meituan.msc.modules.page.render.webview.g gVar);

    void setOnJsUncaughtErrorHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);
}
