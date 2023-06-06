package com.sankuai.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MultiTaskManager {
    private static final int DEFAULT_POOL_SIZE = 10;
    private static final Executor THREAD_POOL_EXECUTOR = Executors.newFixedThreadPool(10);
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<? extends Callable> callableList;
    private long timeout;

    public MultiTaskManager(List<? extends Callable> list) {
        this(list, 0L);
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d44578580ec79cbe7fe2e99288e8d9b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d44578580ec79cbe7fe2e99288e8d9b1");
        }
    }

    public MultiTaskManager(List<? extends Callable> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0129ca7ed355f7d30a1f6a4c61dc1ef3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0129ca7ed355f7d30a1f6a4c61dc1ef3");
            return;
        }
        this.callableList = list;
        this.timeout = j;
    }

    public Hashtable<? extends Callable, Object> execute() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39f7e4ab46bb97b308690e3ee3bfbebd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Hashtable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39f7e4ab46bb97b308690e3ee3bfbebd");
        }
        if (this.callableList == null) {
            return null;
        }
        final Hashtable<? extends Callable, Object> hashtable = new Hashtable<>();
        final CountDownLatch countDownLatch = new CountDownLatch(this.callableList.size());
        for (final Callable callable : this.callableList) {
            b.a(THREAD_POOL_EXECUTOR, new Runnable() { // from class: com.sankuai.model.MultiTaskManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object obj;
                    Throwable th;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "525c5fe409cab806302f852f96a2f14c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "525c5fe409cab806302f852f96a2f14c");
                        return;
                    }
                    try {
                        try {
                            obj = callable.call();
                            if (obj == null) {
                                try {
                                    e = new Exception("callable return null");
                                } catch (Throwable th2) {
                                    th = th2;
                                    hashtable.put(callable, obj);
                                    countDownLatch.countDown();
                                    throw th;
                                }
                            } else {
                                e = obj;
                            }
                        } catch (Exception e) {
                            e = e;
                        }
                        hashtable.put(callable, e);
                        countDownLatch.countDown();
                    } catch (Throwable th3) {
                        obj = null;
                        th = th3;
                    }
                }
            });
        }
        if (this.timeout > 0) {
            new WatchDog(countDownLatch, this.timeout).start();
        }
        try {
            countDownLatch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hashtable.size() < this.callableList.size()) {
            return null;
        }
        return hashtable;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class WatchDog extends Thread {
        public static ChangeQuickRedirect changeQuickRedirect;
        private CountDownLatch countDownLatch;
        private long timeOut;

        public WatchDog(CountDownLatch countDownLatch, long j) {
            Object[] objArr = {MultiTaskManager.this, countDownLatch, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcb3bbeec002f23c24b38a0e2e85dacc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcb3bbeec002f23c24b38a0e2e85dacc");
                return;
            }
            this.countDownLatch = countDownLatch;
            this.timeOut = j;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e32f9914077f079c420cae34a5405e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e32f9914077f079c420cae34a5405e2");
                return;
            }
            try {
                try {
                    Thread.sleep(this.timeOut);
                    while (this.countDownLatch.getCount() > 0) {
                        this.countDownLatch.countDown();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    while (this.countDownLatch.getCount() > 0) {
                        this.countDownLatch.countDown();
                    }
                }
            } catch (Throwable th) {
                while (this.countDownLatch.getCount() > 0) {
                    this.countDownLatch.countDown();
                }
                throw th;
            }
        }
    }
}
