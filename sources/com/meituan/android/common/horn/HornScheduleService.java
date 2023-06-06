package com.meituan.android.common.horn;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornScheduleService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ScheduledExecutorService scheduleExecutor = c.c("Horn-HornScheduleService");
    private static final Map<String, PollWrapper> mPollWrapper = new ConcurrentHashMap();

    public static void optPollCallback(String str, MsgCallback msgCallback) {
        Object[] objArr = {str, msgCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4f37d7157483c7ab377ae914110e13a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4f37d7157483c7ab377ae914110e13a");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            mPollWrapper.put(str, new PollWrapper(str, msgCallback));
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    public static void init(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97e765fb16ed4fb34208d6479d4592ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97e765fb16ed4fb34208d6479d4592ee");
            return;
        }
        try {
            scheduleExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.android.common.horn.HornScheduleService.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf71621cafc49fbb454b031029ef9c5a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf71621cafc49fbb454b031029ef9c5a");
                        return;
                    }
                    try {
                        if (HornFetcherBatch.wasErrror) {
                            for (Map.Entry entry : HornScheduleService.mPollWrapper.entrySet()) {
                                ((PollWrapper) entry.getValue()).run();
                            }
                            return;
                        }
                        HashSet hashSet = new HashSet();
                        synchronized (HornScheduleService.mPollWrapper) {
                            for (Map.Entry entry2 : HornScheduleService.mPollWrapper.entrySet()) {
                                if (((PollWrapper) entry2.getValue()).isNeed()) {
                                    hashSet.add(entry2.getKey());
                                }
                            }
                        }
                        if (InnerHorn.isDebug) {
                            PrintStream printStream = System.out;
                            printStream.println("HornDebug>>发送请求 batch_poll " + hashSet);
                        }
                        HornFetcherBatch.getInstance(context).loadConfig(HornInfoHub.obtainMultiPollRequest(hashSet, "batch_poll"));
                    } catch (Throwable th) {
                        if (InnerHorn.isDebug) {
                            th.printStackTrace();
                        }
                    }
                }
            }, 1L, 1L, TimeUnit.MINUTES);
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class PollWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MsgCallback mCallback;
        private int mCount;
        private String mType;

        public PollWrapper(String str, MsgCallback msgCallback) {
            Object[] objArr = {str, msgCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b262eabd7b4c4d0d1f65847da87fe210", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b262eabd7b4c4d0d1f65847da87fe210");
                return;
            }
            this.mCount = 0;
            this.mType = str;
            this.mCallback = msgCallback;
        }

        private boolean innerJudge() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cad3b49e45082d08cfad6c1d6d7ee6fc", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cad3b49e45082d08cfad6c1d6d7ee6fc")).booleanValue();
            }
            if (HornInfoHub.isCacheInvalidate(this.mType)) {
                return true;
            }
            int obtainPollDuration = InnerHorn.obtainCacheCenter().obtainPollDuration(this.mType);
            Logw.d(Logw.TAG, this.mType + " 's pollDuration is " + obtainPollDuration);
            Logw.d(Logw.TAG, this.mType + " 's counts is " + this.mCount);
            if (obtainPollDuration == -1) {
                return false;
            }
            int i = this.mCount + 1;
            this.mCount = i;
            if (i < obtainPollDuration) {
                Logw.d(Logw.TAG, this.mType + "::" + this.mCount + " is silient this time");
                return false;
            }
            Logw.d(Logw.TAG, this.mType + " will request this time");
            this.mCount = 0;
            return true;
        }

        public boolean isNeed() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ef805b902e53d50e743b489df9b3336", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ef805b902e53d50e743b489df9b3336")).booleanValue();
            }
            try {
                return innerJudge();
            } catch (Throwable th) {
                if (InnerHorn.isDebug) {
                    th.printStackTrace();
                }
                return false;
            }
        }

        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d206b509f876194eb057ec3c7528a0b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d206b509f876194eb057ec3c7528a0b6");
                return;
            }
            try {
                if (innerJudge() && this.mCallback != null) {
                    this.mCallback.MsgArrives(0, this.mType, new HashMap());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
