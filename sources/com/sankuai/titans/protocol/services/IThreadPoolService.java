package com.sankuai.titans.protocol.services;

import com.sankuai.titans.protocol.bean.AsyncTask;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IThreadPoolService {
    void executeAsyncTask(String str, AsyncTask asyncTask);

    void executeOnThreadPool(String str, int i, Runnable runnable);

    void executeOnThreadPool(String str, Runnable runnable);

    boolean executeOnUIThread(Runnable runnable);

    boolean executeOnUIThread(Runnable runnable, long j);
}
