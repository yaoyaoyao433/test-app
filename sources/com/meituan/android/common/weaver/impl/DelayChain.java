package com.meituan.android.common.weaver.impl;

import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DelayChain {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Comparator<WeaverEvent> mComparator;
    private final long mDelay;
    private final ErrorReporter mErrorReporter;
    private final Runnable mFetchOldEvent;
    @GuardedBy("this")
    private final LinkedList<WeaverEvent> mList;
    private final Listener mListener;
    private volatile boolean mRunning;
    private final ScheduledExecutorService mSchedule;
    private final Runnable mScheduleRunnable;
    private final ExecutorService mWorker;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Listener {
        void onEventDeadLine(@NonNull WeaverEvent weaverEvent);
    }

    public DelayChain(Listener listener, long j) {
        Object[] objArr = {listener, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3407815c15d62cc7aa998caff826bc7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3407815c15d62cc7aa998caff826bc7f");
            return;
        }
        this.mList = new LinkedList<>();
        this.mSchedule = c.c("weaver-delay-schedule");
        this.mWorker = c.a("weaver-delay-worker");
        this.mErrorReporter = new ErrorReporter("delaychain", 3);
        this.mComparator = new Comparator<WeaverEvent>() { // from class: com.meituan.android.common.weaver.impl.DelayChain.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.Comparator
            public int compare(WeaverEvent weaverEvent, WeaverEvent weaverEvent2) {
                Object[] objArr2 = {weaverEvent, weaverEvent2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb4bd58ae0fdf874a3c017bab9c32215", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb4bd58ae0fdf874a3c017bab9c32215")).intValue() : (int) (weaverEvent.createMs() - weaverEvent2.createMs());
            }
        };
        this.mFetchOldEvent = new Runnable() { // from class: com.meituan.android.common.weaver.impl.DelayChain.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f52faeeefd4af171b81afa46969bfbb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f52faeeefd4af171b81afa46969bfbb2");
                    return;
                }
                try {
                    DelayChain.this.fetchOldEvent();
                } catch (Throwable th) {
                    DelayChain.this.mErrorReporter.report(th);
                }
            }
        };
        this.mScheduleRunnable = new Runnable() { // from class: com.meituan.android.common.weaver.impl.DelayChain.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "496f65d99174379fa4a5c717793fc529", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "496f65d99174379fa4a5c717793fc529");
                } else {
                    DelayChain.this.mWorker.execute(DelayChain.this.mFetchOldEvent);
                }
            }
        };
        this.mListener = listener;
        this.mDelay = j;
    }

    @AnyThread
    public void append(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d77b99bf28e58563618da5c85ecc476c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d77b99bf28e58563618da5c85ecc476c");
            return;
        }
        synchronized (this) {
            this.mList.add(weaverEvent);
            Collections.sort(this.mList, this.mComparator);
            if (!this.mRunning) {
                long createMs = this.mList.get(0).createMs() + this.mDelay;
                long currentTimeMillis = FFPUtil.currentTimeMillis();
                this.mRunning = true;
                if (createMs <= currentTimeMillis) {
                    this.mWorker.execute(this.mFetchOldEvent);
                } else {
                    this.mSchedule.schedule(this.mScheduleRunnable, createMs - currentTimeMillis, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchOldEvent() {
        WeaverEvent peek;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4421bb3f8032f7fcce542b12d1538f5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4421bb3f8032f7fcce542b12d1538f5c");
            return;
        }
        while (true) {
            synchronized (this) {
                if (this.mList.isEmpty()) {
                    this.mRunning = false;
                    return;
                }
                peek = this.mList.peek();
                long currentTimeMillis = FFPUtil.currentTimeMillis() - peek.createMs();
                if (currentTimeMillis >= this.mDelay) {
                    this.mList.poll();
                } else {
                    this.mSchedule.schedule(this.mScheduleRunnable, this.mDelay - currentTimeMillis, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            try {
                this.mListener.onEventDeadLine(peek);
            } catch (Throwable th) {
                this.mErrorReporter.report(th);
            }
        }
    }
}
