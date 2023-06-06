package com.meituan.android.common.weaver.impl;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.weaver.impl.listener.LEnd;
import com.meituan.android.common.weaver.impl.listener.LFFPTags;
import com.meituan.android.common.weaver.impl.listener.LReport;
import com.meituan.android.common.weaver.impl.listener.ListenerDispatch;
import com.meituan.android.common.weaver.interfaces.IWeaver;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPRenderEndListener;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.io.Closeable;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsWeaver implements IWeaver, Closeable, Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String CIP_CHANNEL;
    protected Context mContext;
    private final ErrorReporter mErrorReporter;
    @GuardedBy("mUILock")
    private final Queue<WeaverEvent> mEvents;
    private final ExecutorService mService;
    @VisibleForTesting
    public q mStorage;
    private final byte[] mUILock;
    public volatile boolean mWaitingConsumer;

    public abstract void onWeaveBg(@NonNull WeaverEvent weaverEvent);

    public AbsWeaver(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8d2f5441a2aedbf0611cd07ca95a808", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8d2f5441a2aedbf0611cd07ca95a808");
            return;
        }
        this.CIP_CHANNEL = "weaver";
        this.mUILock = new byte[2];
        this.mService = c.a("weaver");
        this.mEvents = new LinkedList();
        this.mErrorReporter = new ErrorReporter("weaverimpl", 2);
        this.mContext = context;
    }

    @Override // com.meituan.android.common.weaver.interfaces.IWeaver
    @AnyThread
    public void weave(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "940b85b669263e4d2d9476c1e7874e78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "940b85b669263e4d2d9476c1e7874e78");
            return;
        }
        try {
            synchronized (this.mUILock) {
                this.mEvents.add(weaverEvent);
                if (this.mWaitingConsumer) {
                    return;
                }
                this.mWaitingConsumer = true;
                this.mService.execute(this);
            }
        } catch (Throwable th) {
            this.mErrorReporter.report(th);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        WeaverEvent poll;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f9714f90c56eeaca75e2aa48dbcd420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f9714f90c56eeaca75e2aa48dbcd420");
            return;
        }
        while (true) {
            synchronized (this.mUILock) {
                poll = this.mEvents.poll();
            }
            if (poll == null) {
                synchronized (this.mUILock) {
                    this.mWaitingConsumer = false;
                }
                return;
            }
            onWeaveBg(poll);
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.IWeaver
    public <T> void registerListener(@NonNull T t, Class<T> cls) {
        Object[] objArr = {t, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b890cca8f355d0e34265a8daa9e1a4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b890cca8f355d0e34265a8daa9e1a4fc");
            return;
        }
        ListenerDispatch dispatch = dispatch(cls);
        if (dispatch != null) {
            dispatch.register(t);
        }
    }

    @Nullable
    private ListenerDispatch dispatch(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34b6281a47dda001ef29087bb2af66d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ListenerDispatch) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34b6281a47dda001ef29087bb2af66d2");
        }
        if (cls == FFPTags.class) {
            return LFFPTags.FFPTagsDispatch.instance;
        }
        if (cls == FFPRenderEndListener.class) {
            return LEnd.LEndDispatch.instance;
        }
        if (cls == FFPReportListener.class) {
            return LReport.LReportDispatch.instance;
        }
        return null;
    }

    @Override // com.meituan.android.common.weaver.interfaces.IWeaver
    public <T> void unregisterListener(@NonNull T t, Class<T> cls) {
        Object[] objArr = {t, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aafe713f4b3d583edff8cba22004bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aafe713f4b3d583edff8cba22004bfe");
            return;
        }
        ListenerDispatch dispatch = dispatch(cls);
        if (dispatch != null) {
            dispatch.unregister(t);
        }
    }

    public synchronized String socketPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ebbc419fb391583682ea7e93aa1d989", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ebbc419fb391583682ea7e93aa1d989");
        }
        if (this.mStorage == null) {
            this.mStorage = q.a(this.mContext, "weaver", 2);
        }
        File a = q.a(this.mContext, "weaver", "weaver.socket", u.e);
        if (!a.exists()) {
            File parentFile = a.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        return a.getAbsolutePath();
    }
}
