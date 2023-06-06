package com.meituan.android.common.aidata.ai.bundle;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TimeoutHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile TimeoutHandler sInstance;
    private Map<String, CountDownTask> mCountDownTaskMap;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Listener {
        void onTimeout();
    }

    public TimeoutHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb631dadf5be2bbf78cd2d231a0ee70d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb631dadf5be2bbf78cd2d231a0ee70d");
        } else {
            this.mCountDownTaskMap = new ConcurrentHashMap();
        }
    }

    public static TimeoutHandler get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d2f082a794c2acd7d69668bd02ddadc", RobustBitConfig.DEFAULT_VALUE)) {
            return (TimeoutHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d2f082a794c2acd7d69668bd02ddadc");
        }
        if (sInstance == null) {
            synchronized (TimeoutHandler.class) {
                if (sInstance == null) {
                    sInstance = new TimeoutHandler();
                }
            }
        }
        return sInstance;
    }

    public void submit(final String str, long j, final Listener listener) {
        Object[] objArr = {str, new Long(j), listener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5ceabf3309f74fac580849da28686bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5ceabf3309f74fac580849da28686bf");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!this.mCountDownTaskMap.containsKey(str)) {
                CountDownTask countDownTask = new CountDownTask(j, new Listener() { // from class: com.meituan.android.common.aidata.ai.bundle.TimeoutHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.bundle.TimeoutHandler.Listener
                    public void onTimeout() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3fea5fc32b5312773bc075c9663d2b05", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3fea5fc32b5312773bc075c9663d2b05");
                            return;
                        }
                        if (listener != null) {
                            listener.onTimeout();
                        }
                        TimeoutHandler.this.mCountDownTaskMap.remove(str);
                    }
                });
                countDownTask.start();
                this.mCountDownTaskMap.put(str, countDownTask);
                return;
            }
            new StringBuilder("mCountDownTaskMap.containsKey::").append(str);
        }
    }

    public void registerTimeoutListener(String str, Listener listener) {
        CountDownTask countDownTask;
        Object[] objArr = {str, listener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73cdacce99356951b5743e9e269b4e03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73cdacce99356951b5743e9e269b4e03");
        } else if (TextUtils.isEmpty(str) || listener == null || (countDownTask = this.mCountDownTaskMap.get(str)) == null) {
        } else {
            countDownTask.addListener(listener);
        }
    }

    public void cancel(String str) {
        CountDownTask countDownTask;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04e4f24051111222795dbcdd27354b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04e4f24051111222795dbcdd27354b07");
        } else if (TextUtils.isEmpty(str) || (countDownTask = this.mCountDownTaskMap.get(str)) == null) {
        } else {
            countDownTask.cancel();
            this.mCountDownTaskMap.remove(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CountDownTask {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<Listener> mListenerList;
        private long mTimeoutMills;
        private ExecutorService mTimer;

        public CountDownTask(long j, Listener listener) {
            Object[] objArr = {new Long(j), listener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e6cae858aef92e464e8b18848e38510", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e6cae858aef92e464e8b18848e38510");
                return;
            }
            this.mListenerList = new CopyOnWriteArrayList();
            this.mTimeoutMills = j;
            this.mListenerList.add(listener);
        }

        public void addListener(Listener listener) {
            Object[] objArr = {listener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e7eaf744091fcfd5712808529e86223", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e7eaf744091fcfd5712808529e86223");
            } else if (listener == null || this.mListenerList.contains(listener)) {
            } else {
                this.mListenerList.add(listener);
            }
        }

        public void start() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b758c70b12e67b585d878832f94dcea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b758c70b12e67b585d878832f94dcea");
                return;
            }
            if (this.mTimer == null) {
                this.mTimer = c.c("CountDownTask");
            }
            this.mTimer.submit(new TimerTask() { // from class: com.meituan.android.common.aidata.ai.bundle.TimeoutHandler.CountDownTask.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85ab2a5b3562d06d04d9aa85b0ffae57", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85ab2a5b3562d06d04d9aa85b0ffae57");
                        return;
                    }
                    for (Listener listener : CountDownTask.this.mListenerList) {
                        if (listener != null) {
                            listener.onTimeout();
                        }
                    }
                    CountDownTask.this.mListenerList.clear();
                }
            }, Long.valueOf(this.mTimeoutMills));
        }

        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa7b08c186db80deb11df839af1d5ac0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa7b08c186db80deb11df839af1d5ac0");
            } else if (this.mTimer != null) {
                this.mTimer.shutdown();
                this.mTimer = null;
            }
        }
    }
}
