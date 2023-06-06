package com.meituan.android.common.aidata.async;

import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.common.aidata.async.tasks.DependencyTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AsyncManager {
    public static final int ASYNC_BUNDLE = 1;
    public static final int ASYNC_EXECUTE_BUNDLE = 2;
    public static final int ASYNC_FEATURE = 3;
    public static final int ASYNC_OPERATOR = 4;
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static ThreadPoolExecutor bundleExecutor;
    private static final BlockingQueue<Runnable> bundleQueue;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static ThreadPoolExecutor executeBundleExecutor;
    private static final BlockingQueue<Runnable> executeBundleQueue;
    public static ThreadPoolExecutor featureExecutor;
    private static final BlockingQueue<Runnable> featureQueue;
    public static ThreadPoolExecutor operatorExecutor;
    private static final BlockingQueue<Runnable> operatorQueue;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AsyncExecutorType {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int i = (availableProcessors * 2) + 1;
        CORE_POOL_SIZE = i;
        MAXIMUM_POOL_SIZE = i + 1;
        bundleQueue = new LinkedBlockingQueue(256);
        executeBundleQueue = new LinkedBlockingQueue(256);
        featureQueue = new LinkedBlockingQueue(256);
        operatorQueue = new LinkedBlockingQueue(256);
        bundleExecutor = c.a("AIDATA_ASYNC_BUNDLE", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, bundleQueue);
        executeBundleExecutor = c.a("AIDATA_EXECUTE_BUNDLE", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, executeBundleQueue);
        featureExecutor = c.a("AIDATA_ASYNC_FEATURE", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, featureQueue);
        operatorExecutor = c.a("AIDATA_ASYNC_OPERATOR", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, operatorQueue);
        bundleExecutor.allowCoreThreadTimeOut(true);
        executeBundleExecutor.allowCoreThreadTimeOut(true);
        featureExecutor.allowCoreThreadTimeOut(true);
        operatorExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> List<DependencyTask<K, V>> generateTask(K k, CreateTaskListener<K, V> createTaskListener) {
        DependencyTask<K, V> dependencyTask;
        Object[] objArr = {k, createTaskListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "825c52f48aff063b0a9304a0cf053327", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "825c52f48aff063b0a9304a0cf053327");
        }
        if (k == null || createTaskListener == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.add(k);
        while (!linkedList.isEmpty()) {
            Object poll = linkedList.poll();
            if (poll != null) {
                LinkedList linkedList2 = (LinkedList) linkedHashMap.get(poll);
                if (linkedList2 != null) {
                    createTaskListener.onHitCacheTask((DependencyTask) linkedList2.getLast(), poll);
                    linkedHashMap.remove(poll);
                    linkedHashMap.put(poll, linkedList2);
                } else {
                    DependencyTask<K, V> dependencyTask2 = (DependencyTask) hashMap2.get(poll);
                    if (dependencyTask2 == null) {
                        dependencyTask2 = createTaskListener.create(poll);
                        hashMap2.put(poll, dependencyTask2);
                    }
                    LinkedList linkedList3 = new LinkedList();
                    linkedList3.addFirst(dependencyTask2);
                    List<K> childUniqueId = createTaskListener.getChildUniqueId(poll);
                    if (childUniqueId != null && childUniqueId.size() > 0) {
                        for (K k2 : childUniqueId) {
                            if (k2 != null) {
                                if (poll.equals(k2)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(k);
                                    sb.append(" is Cycle");
                                    return null;
                                }
                                LinkedList linkedList4 = (LinkedList) linkedHashMap.get(k2);
                                if (linkedList4 != null) {
                                    Object obj = poll;
                                    while (hashMap.get(obj) != null) {
                                        obj = hashMap.get(obj);
                                        if (obj.equals(k2)) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(k);
                                            sb2.append(" is Cycle");
                                            return null;
                                        }
                                    }
                                    dependencyTask = (DependencyTask) linkedList4.getLast();
                                } else {
                                    dependencyTask = null;
                                }
                                if (dependencyTask == null && (dependencyTask = (DependencyTask) hashMap2.get(k2)) == null) {
                                    dependencyTask = createTaskListener.create(k2);
                                    hashMap2.put(k2, dependencyTask);
                                }
                                hashMap.put(k2, poll);
                                linkedList.push(k2);
                                linkedList3.addFirst(dependencyTask);
                                dependencyTask2.dependencyOn(dependencyTask);
                            }
                        }
                        dependencyTask2.initLatch();
                    }
                    linkedHashMap.put(poll, linkedList3);
                }
            }
        }
        LinkedList linkedList5 = new LinkedList();
        hashMap2.clear();
        ListIterator listIterator = new ArrayList(linkedHashMap.entrySet()).listIterator(linkedHashMap.size());
        while (listIterator.hasPrevious()) {
            LinkedList linkedList6 = (LinkedList) ((Map.Entry) listIterator.previous()).getValue();
            if (linkedList6 != null && linkedList6.size() > 0) {
                Iterator it = linkedList6.iterator();
                while (it.hasNext()) {
                    DependencyTask dependencyTask3 = (DependencyTask) it.next();
                    if (dependencyTask3 != null && !hashMap2.containsKey(dependencyTask3.getTaskUniqueId())) {
                        linkedList5.add(dependencyTask3);
                        hashMap2.put(dependencyTask3.getTaskUniqueId(), dependencyTask3);
                    }
                }
            }
        }
        return linkedList5;
    }

    public static <K, V> List<DependencyTask<K, V>> generateTask(DependencyTask<K, V> dependencyTask) {
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19dd76cc85148f8faeb0a9286ac3c6e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19dd76cc85148f8faeb0a9286ac3c6e0");
        }
        if (dependencyTask == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.add(dependencyTask);
        while (!linkedList.isEmpty()) {
            DependencyTask dependencyTask2 = (DependencyTask) linkedList.poll();
            if (dependencyTask2 != null) {
                LinkedList linkedList2 = (LinkedList) linkedHashMap.get(dependencyTask2);
                if (linkedList2 != null) {
                    linkedHashMap.remove(dependencyTask2);
                    linkedHashMap.put(dependencyTask2, linkedList2);
                } else {
                    LinkedList linkedList3 = new LinkedList();
                    linkedList3.addFirst(dependencyTask2);
                    Collection<DependencyTask<K, V>> children = dependencyTask2.getChildren();
                    if (children != null && children.size() > 0) {
                        for (DependencyTask<K, V> dependencyTask3 : children) {
                            if (dependencyTask3 != null) {
                                if (dependencyTask2.equals(dependencyTask3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dependencyTask2);
                                    sb.append(" is Cycle");
                                    return null;
                                }
                                if (((LinkedList) linkedHashMap.get(dependencyTask3)) != null) {
                                    DependencyTask dependencyTask4 = dependencyTask2;
                                    while (hashMap.get(dependencyTask4) != null) {
                                        dependencyTask4 = (DependencyTask) hashMap.get(dependencyTask4);
                                        if (dependencyTask4.equals(dependencyTask3)) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(dependencyTask4);
                                            sb2.append(" is Cycle");
                                            return null;
                                        }
                                    }
                                }
                                hashMap.put(dependencyTask3, dependencyTask2);
                                linkedList.push(dependencyTask3);
                                linkedList3.addFirst(dependencyTask3);
                            }
                        }
                        dependencyTask2.initLatch();
                    }
                    linkedHashMap.put(dependencyTask2, linkedList3);
                }
            }
        }
        LinkedList linkedList4 = new LinkedList();
        HashSet hashSet = new HashSet();
        ListIterator listIterator = new ArrayList(linkedHashMap.entrySet()).listIterator(linkedHashMap.size());
        while (listIterator.hasPrevious()) {
            LinkedList linkedList5 = (LinkedList) ((Map.Entry) listIterator.previous()).getValue();
            if (linkedList5 != null && linkedList5.size() > 0) {
                Iterator it = linkedList5.iterator();
                while (it.hasNext()) {
                    DependencyTask dependencyTask5 = (DependencyTask) it.next();
                    if (dependencyTask5 != null && !hashSet.contains(dependencyTask5)) {
                        linkedList4.add(dependencyTask5);
                        hashSet.add(dependencyTask5);
                    }
                }
            }
        }
        return linkedList4;
    }

    public static <K, V> void executeByOneLevelRoot(DependencyTask<K, V> dependencyTask, int i) {
        Object[] objArr = {dependencyTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7897fad7b1598cc3810b8421005d49f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7897fad7b1598cc3810b8421005d49f");
        } else if (dependencyTask == null) {
        } else {
            dependencyTask.initLatch();
            executeList(dependencyTask.getChildren(), i);
            executeSingle(dependencyTask, i);
        }
    }

    public static <K, V> void executeByRoot(DependencyTask<K, V> dependencyTask, int i) {
        Object[] objArr = {dependencyTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba5e91b45d7449605d3fdcf0ecc97a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba5e91b45d7449605d3fdcf0ecc97a20");
        } else {
            executeList(generateTask(dependencyTask), i);
        }
    }

    public static <K, V> void executeList(Collection<DependencyTask<K, V>> collection, int i) {
        Object[] objArr = {collection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e9f2e270f84500802ffa13d8e03ec9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e9f2e270f84500802ffa13d8e03ec9a");
        } else if (collection != null && collection.size() > 0) {
            for (DependencyTask<K, V> dependencyTask : collection) {
                executeSingle(dependencyTask, i);
            }
        }
    }

    public static <K, V> void executeSingle(DependencyTask<K, V> dependencyTask, int i) {
        Object[] objArr = {dependencyTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6c83874f71d9537a3af4b0456b03c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6c83874f71d9537a3af4b0456b03c68");
        } else if (dependencyTask == null) {
        } else {
            dependencyTask.initLatch();
            if (dependencyTask.isSyncTask() && notMainThread()) {
                dependencyTask.run();
                return;
            }
            Executor executor = getExecutor(i);
            if (executor != null) {
                b.a(executor, dependencyTask);
            }
        }
    }

    public static void execute(Runnable runnable, int i) {
        Executor executor;
        Object[] objArr = {runnable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b30c460a7f978139d95194dc2c166852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b30c460a7f978139d95194dc2c166852");
        } else if (runnable == null || (executor = getExecutor(i)) == null) {
        } else {
            b.a(executor, runnable);
        }
    }

    public static Executor getExecutor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "46f2793e4470991e5340519e1faeb910", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "46f2793e4470991e5340519e1faeb910");
        }
        switch (i) {
            case 1:
                return bundleExecutor;
            case 2:
                return executeBundleExecutor;
            case 3:
                return featureExecutor;
            case 4:
                return operatorExecutor;
            default:
                return null;
        }
    }

    public static boolean notMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1192e7ae5c84de9583328a3f692ac897", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1192e7ae5c84de9583328a3f692ac897")).booleanValue() : (Looper.getMainLooper() == null || Looper.getMainLooper().getThread() == Thread.currentThread()) ? false : true;
    }

    public static boolean isMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "125d271d9932edd198baeca472685e2e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "125d271d9932edd198baeca472685e2e")).booleanValue() : Looper.getMainLooper() != null && Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void executeAsync(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d999e0929610e5e90394603a4d84f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d999e0929610e5e90394603a4d84f73");
        } else if (runnable == null) {
        } else {
            executeAsync("AIDATA_SINGLE", runnable);
        }
    }

    public static void executeAsync(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "433acc428155222b27b2bf1251c82b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "433acc428155222b27b2bf1251c82b2e");
        } else if (runnable == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "AIDATA_SINGLE";
            }
            c.a(str, runnable).start();
        }
    }
}
