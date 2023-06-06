package com.meituan.android.aurora;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraAnchorsRuntime {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final InnerThreadPool sPool = new InnerThreadPool();
    private static final Executor sSingleThreadPool = c.a("AuroraS");
    private static final Map<Integer, ConcurrentLinkedQueue<String>> sAnchorTaskIdMap = new ConcurrentHashMap();
    private static final Map<Integer, BlockingQueue<AuroraTask>> sRunBlockMap = new ConcurrentHashMap();
    private static final Handler sHandler = new Handler(Looper.getMainLooper());
    private static final Comparator<AuroraTask> sTaskComparator = AuroraAnchorsRuntime$$Lambda$1.lambdaFactory$();
    private static boolean sDebuggable = false;

    static {
        sRunBlockMap.put(-1, new LinkedBlockingQueue());
        sRunBlockMap.put(1, new LinkedBlockingQueue());
        sRunBlockMap.put(2, new LinkedBlockingQueue());
    }

    public static /* synthetic */ int lambda$static$2(AuroraTask auroraTask, AuroraTask auroraTask2) {
        Object[] objArr = {auroraTask, auroraTask2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ca8dea8bd5ddd7ed4d8e86d7202875a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ca8dea8bd5ddd7ed4d8e86d7202875a")).intValue() : AuroraUtils.compareTask(auroraTask, auroraTask2);
    }

    public static boolean debuggable() {
        return sDebuggable;
    }

    public static void setDebug(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f2187286c18ee086c5c81eba2949794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f2187286c18ee086c5c81eba2949794");
            return;
        }
        sDebuggable = z;
        enableSystemTrace();
    }

    private static void enableSystemTrace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f7105e775297615b806dd7d3643e4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f7105e775297615b806dd7d3643e4fc");
        } else if (sDebuggable) {
            try {
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
    }

    public static Comparator<AuroraTask> getTaskComparator() {
        return sTaskComparator;
    }

    public static Handler getMainHandler() {
        return sHandler;
    }

    public static InnerThreadPool getThreadPool() {
        return sPool;
    }

    public static Executor getSingleThreadPool() {
        return sSingleThreadPool;
    }

    public static long getOffsetTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee928d28248afcd94f7c64ae1934075e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee928d28248afcd94f7c64ae1934075e")).longValue() : j - AuroraApplication.sProcessLaunchTime;
    }

    public static void addAnchorTask(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5d666764f3d4cfeb69c41ac7856a820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5d666764f3d4cfeb69c41ac7856a820");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        addAnchorTasks(i, arrayList);
    }

    public static void addAnchorTasks(int i, List<String> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75d5d2864b3436c043e440d24ee697c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75d5d2864b3436c043e440d24ee697c6");
            return;
        }
        if (i == -2) {
            i = -1;
        }
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = sAnchorTaskIdMap.get(Integer.valueOf(i));
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            sAnchorTaskIdMap.put(Integer.valueOf(i), concurrentLinkedQueue);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        concurrentLinkedQueue.addAll(list);
    }

    public static void removeAnchorTask(AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "680f2af559abb925640f95f82c865775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "680f2af559abb925640f95f82c865775");
        } else if (auroraTask == null || auroraTask.isVirtualNode()) {
        } else {
            int opportunity = auroraTask.getOpportunity();
            if (opportunity == -10) {
                AuroraCustomAnchorsRuntime.removeAnchorTask(auroraTask);
                return;
            }
            if (opportunity == -2) {
                opportunity = -1;
            }
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = sAnchorTaskIdMap.get(Integer.valueOf(opportunity));
            if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty() || TextUtils.isEmpty(auroraTask.getId())) {
                return;
            }
            concurrentLinkedQueue.remove(auroraTask.getId());
        }
    }

    private static boolean hasAnchorTasks(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3f61a22fd534ee494dfe7f9bc4dba71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3f61a22fd534ee494dfe7f9bc4dba71")).booleanValue();
        }
        if (i == -2) {
            i = -1;
        }
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = sAnchorTaskIdMap.get(Integer.valueOf(i));
        return (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) ? false : true;
    }

    private static void addRunTasks(AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0dfe30dc4450d120acf42c0d67ff485b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0dfe30dc4450d120acf42c0d67ff485b");
        } else if (auroraTask == null) {
        } else {
            int opportunity = auroraTask.getOpportunity();
            if (opportunity == -10) {
                AuroraCustomAnchorsRuntime.taskQueue.add(auroraTask);
                return;
            }
            if (opportunity == -2) {
                opportunity = -1;
            }
            BlockingQueue<AuroraTask> blockingQueue = sRunBlockMap.get(Integer.valueOf(opportunity));
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue<>();
                sRunBlockMap.put(Integer.valueOf(opportunity), blockingQueue);
            }
            if (blockingQueue.contains(auroraTask)) {
                return;
            }
            blockingQueue.add(auroraTask);
        }
    }

    public static void tryRunBlockRunnable(int i) {
        AuroraTask auroraTask;
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f3f17c6e913fb01dec5e6c68052de95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f3f17c6e913fb01dec5e6c68052de95");
            return;
        }
        if (i == -2) {
            i = -1;
        }
        while (hasAnchorTasks(i)) {
            if (i2 == 600) {
                System.out.println("3s: Startup Loading " + sAnchorTaskIdMap.get(Integer.valueOf(i)).toString() + " ...");
            } else if (i2 == 1000) {
                System.out.println("5s: Startup Loading " + sAnchorTaskIdMap.get(Integer.valueOf(i)).toString() + " ...");
            } else if (i2 == 2000) {
                System.out.println("10s: Startup Loading " + sAnchorTaskIdMap.get(Integer.valueOf(i)).toString() + " ...");
            }
            i2++;
            BlockingQueue<AuroraTask> blockingQueue = sRunBlockMap.get(Integer.valueOf(i));
            if (blockingQueue == null) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException unused) {
                }
            } else {
                try {
                    auroraTask = blockingQueue.poll(5L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused2) {
                    auroraTask = null;
                }
                if (auroraTask != null) {
                    if (auroraTask.isAnchors()) {
                        auroraTask.run();
                    } else {
                        sHandler.post(auroraTask);
                    }
                }
            }
        }
    }

    public static void executeTask(AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "364c9ab38a7b43366a27956b10d28c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "364c9ab38a7b43366a27956b10d28c72");
        } else if (auroraTask.isAsyncTask()) {
            sPool.executeTask(auroraTask);
        } else if (auroraTask.isVirtualNode()) {
            auroraTask.run();
        } else if (!auroraTask.isAnchors()) {
            sHandler.post(auroraTask);
        } else if (AuroraUtils.isMainThread()) {
            auroraTask.run();
        } else {
            addRunTasks(auroraTask);
        }
    }

    @MainThread
    public static synchronized void start(int i, AuroraTask auroraTask) {
        synchronized (AuroraAnchorsRuntime.class) {
            Object[] objArr = {Integer.valueOf(i), auroraTask};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3b11779335167870ea0d74fd1a3eff4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3b11779335167870ea0d74fd1a3eff4");
                return;
            }
            AuroraUtils.assertMainThread();
            if (auroraTask == null) {
                throw new RuntimeException("can no run a task that was null !");
            }
            auroraTask.start();
            if (-2 != i) {
                tryRunBlockRunnable(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerThreadPool {
        private static final int KEEP_ALIVE_SECONDS = 30;
        public static ChangeQuickRedirect changeQuickRedirect;
        private final ExecutorService mExecutor;
        private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
        private static final int CORE_POOL_SIZE = Math.max(4, Math.min(CPU_COUNT - 1, 8));
        private static final int MAXIMUM_POOL_SIZE = (CPU_COUNT * 2) + 1;
        private static final ThreadFactory sThreadFactory = new ThreadFactory() { // from class: com.meituan.android.aurora.AuroraAnchorsRuntime.InnerThreadPool.1
            public static ChangeQuickRedirect changeQuickRedirect;
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Object[] objArr = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95aa4a462b4f9ce46ebecaf69c444381", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95aa4a462b4f9ce46ebecaf69c444381");
                }
                return new Thread(runnable, "Aurora#" + this.mCount.getAndIncrement());
            }
        };
        private static final BlockingQueue<Runnable> sPoolWorkQueue = new PriorityBlockingQueue(128);

        public InnerThreadPool() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c6f9730ed00d7eef8b84b517b5fe6de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c6f9730ed00d7eef8b84b517b5fe6de");
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.mExecutor = threadPoolExecutor;
        }

        public void executeTask(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a84c4b2a03df6e0e4a3b4e161d062d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a84c4b2a03df6e0e4a3b4e161d062d4");
            } else {
                this.mExecutor.execute(runnable);
            }
        }
    }
}
