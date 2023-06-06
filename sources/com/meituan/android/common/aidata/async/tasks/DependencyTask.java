package com.meituan.android.common.aidata.async.tasks;

import android.os.SystemClock;
import com.meituan.android.common.aidata.async.AsyncArrayList;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DependencyTask<K, V> implements TaskAsyncNotifier<V>, Runnable {
    private static final int BASIC_CHILD_ATTACH_TIME_MILLIS = 1;
    private static final int BASIC_WAIT_TIME_MILLIS = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long basicChildAttachTimeMillis;
    private long basicWaitTimeMillis;
    protected Map<K, V> childResult;
    private Set<DependencyTask<K, V>> children;
    protected List<Exception> errorList;
    protected volatile boolean isFinish;
    protected volatile boolean isStart;
    protected boolean isSyncTask;
    protected CountDownLatch latch;
    private List<OnTaskFinishListener<K, V>> listeners;
    private Set<DependencyTask<K, V>> parents;
    protected V result;
    protected long startClockTime;
    private TaskAsyncCallable<K, V> taskAsyncCall;
    private TaskSyncCallable<K, V> taskSyncCall;
    private final K taskUniqueId;

    public boolean isOriginalTask() {
        return true;
    }

    public DependencyTask(K k) {
        this(k, false);
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9b96dcf9e142c8a8d83cd222cc0e640", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9b96dcf9e142c8a8d83cd222cc0e640");
        }
    }

    public DependencyTask(K k, boolean z) {
        Object[] objArr = {k, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d36f2b48304591e7e642226aa00e786b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d36f2b48304591e7e642226aa00e786b");
            return;
        }
        this.childResult = new AsyncHashMap();
        this.errorList = new AsyncArrayList();
        this.basicWaitTimeMillis = 5L;
        this.basicChildAttachTimeMillis = 1L;
        this.taskUniqueId = k;
        this.isSyncTask = z;
    }

    public DependencyTask<K, V> setSyncCall(TaskSyncCallable<K, V> taskSyncCallable) {
        this.taskSyncCall = taskSyncCallable;
        this.taskAsyncCall = null;
        return this;
    }

    public DependencyTask<K, V> setAsyncCall(TaskAsyncCallable<K, V> taskAsyncCallable) {
        this.taskAsyncCall = taskAsyncCallable;
        this.taskSyncCall = null;
        return this;
    }

    public K getTaskUniqueId() {
        return this.taskUniqueId;
    }

    public DependencyTask<K, V> setSyncStatus(boolean z) {
        this.isSyncTask = z;
        return this;
    }

    public boolean isSyncTask() {
        return this.isSyncTask;
    }

    public void signTaskSync(boolean z) {
        this.isSyncTask = z;
    }

    public synchronized DependencyTask<K, V> addOnTaskFinishListener(OnTaskFinishListener<K, V> onTaskFinishListener) {
        Object[] objArr = {onTaskFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cb97cc620cea997bba49fd4db233e3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cb97cc620cea997bba49fd4db233e3a");
        } else if (onTaskFinishListener == null) {
            return this;
        } else {
            if (this.isFinish) {
                onTaskFinishListener.onTaskFinish(this.childResult, this.result, SystemClock.elapsedRealtime(), this.errorList);
                return this;
            }
            if (this.listeners == null) {
                this.listeners = new ArrayList();
            }
            this.listeners.add(onTaskFinishListener);
            return this;
        }
    }

    public DependencyTask<K, V> dependencyOn(DependencyTask<K, V> dependencyTask) {
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9b866e0d185ea013d0fb8c5ef9308bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9b866e0d185ea013d0fb8c5ef9308bb");
        }
        if (dependencyTask == null) {
            return this;
        }
        dependencyTask.addParent(this);
        addChild(dependencyTask);
        return this;
    }

    public DependencyTask<K, V> dependencyOn(Collection<DependencyTask<K, V>> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd019b5bf9b927fcfd25475baef98ab4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd019b5bf9b927fcfd25475baef98ab4");
        }
        if (collection == null || collection.size() <= 0) {
            return this;
        }
        for (DependencyTask<K, V> dependencyTask : collection) {
            dependencyTask.addParent(this);
        }
        addChild(collection);
        return this;
    }

    private void addParent(DependencyTask<K, V> dependencyTask) {
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd554721711e79a3df05638fe56eef55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd554721711e79a3df05638fe56eef55");
        } else if (dependencyTask == null) {
        } else {
            if (this.parents == null) {
                this.parents = new HashSet();
            }
            this.parents.add(dependencyTask);
        }
    }

    private void addParent(Collection<DependencyTask<K, V>> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d66f47179428a026925a48195b7b7dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d66f47179428a026925a48195b7b7dd5");
        } else if (collection == null || collection.size() <= 0) {
        } else {
            if (this.parents == null) {
                this.parents = new HashSet();
            }
            this.parents.addAll(collection);
        }
    }

    public DependencyTask<K, V> addChild(DependencyTask<K, V> dependencyTask) {
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b0bc420e704912e5fe8f5ef0f4019a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b0bc420e704912e5fe8f5ef0f4019a8");
        }
        if (dependencyTask == null) {
            return this;
        }
        if (this.children == null) {
            this.children = new HashSet();
        }
        this.children.add(dependencyTask);
        return this;
    }

    private void addChild(Collection<DependencyTask<K, V>> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9ab006d12c915a9dffc9e7f616ba506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9ab006d12c915a9dffc9e7f616ba506");
        } else if (collection == null || collection.size() <= 0) {
        } else {
            if (this.children == null) {
                this.children = new HashSet();
            }
            this.children.addAll(collection);
        }
    }

    public DependencyTask<K, V> setBasicWaitTime(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43e5a94f421d5d9297dc5db63ab7db2", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43e5a94f421d5d9297dc5db63ab7db2");
        }
        this.basicWaitTimeMillis = i;
        return this;
    }

    public DependencyTask<K, V> setChildAttachWaitTime(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94532122e31b607030e138e2066543b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94532122e31b607030e138e2066543b3");
        }
        this.basicChildAttachTimeMillis = i;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20081f3d5508f35f3a1687f39b141f6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20081f3d5508f35f3a1687f39b141f6b");
        } else if (this.isFinish) {
            notifyFinish();
        } else if (this.isStart) {
        } else {
            synchronized (this) {
                if (this.isStart) {
                    return;
                }
                this.isStart = true;
                initLatch();
                this.basicWaitTimeMillis = ConfigManager.getInstance().downloadResourceMaxWaitDuration();
                if (this.latch != null && this.basicWaitTimeMillis > 0) {
                    try {
                        long count = this.basicWaitTimeMillis + (this.latch.getCount() * this.basicChildAttachTimeMillis);
                        if (count < 0) {
                            this.latch.await();
                        } else {
                            z = this.latch.await(count, TimeUnit.SECONDS);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        this.errorList.add(e);
                    }
                }
                onReady(z);
            }
        }
    }

    public void onReady(boolean z) {
        V v;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb45782f11d8c259f3e847bb86bc97bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb45782f11d8c259f3e847bb86bc97bc");
        } else if (this.taskSyncCall == null && this.taskAsyncCall == null) {
            handleParent(this.result);
            notifyFinish();
        } else if (this.taskAsyncCall != null) {
            TaskAsyncCallable<K, V> taskAsyncCallable = this.taskAsyncCall;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.startClockTime = elapsedRealtime;
            taskAsyncCallable.asyncCall(this, this, elapsedRealtime, z);
        } else {
            Exception exc = null;
            try {
                TaskSyncCallable<K, V> taskSyncCallable = this.taskSyncCall;
                K k = this.taskUniqueId;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.startClockTime = elapsedRealtime2;
                v = taskSyncCallable.syncCall(k, elapsedRealtime2, z);
            } catch (Exception e) {
                exc = e;
                v = null;
            }
            notify(v, exc);
        }
    }

    @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncNotifier
    public void notify(V v, Exception exc) {
        Object[] objArr = {v, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43138b82a36eb80c8ee68ef9a24d8fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43138b82a36eb80c8ee68ef9a24d8fc8");
            return;
        }
        if (exc != null) {
            this.errorList.add(exc);
        }
        handleParent(v);
        notifyFinish();
    }

    public void handleParent(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "305ed095ea602d0f4045fa9f435a9946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "305ed095ea602d0f4045fa9f435a9946");
            return;
        }
        this.result = v;
        if (this.parents == null || this.parents.size() <= 0) {
            return;
        }
        for (DependencyTask<K, V> dependencyTask : this.parents) {
            if (dependencyTask != null && !dependencyTask.isFinish) {
                dependencyTask.errorList.addAll(this.errorList);
                dependencyTask.addChildResult(this.taskUniqueId, v);
                if (dependencyTask.latch != null) {
                    dependencyTask.latch.countDown();
                }
            }
        }
    }

    public synchronized void notifyFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ee6a1814b5ca6e1c6c2ce00e5bc1b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ee6a1814b5ca6e1c6c2ce00e5bc1b9f");
            return;
        }
        this.isFinish = true;
        if (this.listeners != null && this.listeners.size() > 0) {
            for (OnTaskFinishListener<K, V> onTaskFinishListener : this.listeners) {
                onTaskFinishListener.onTaskFinish(this.childResult, this.result, this.startClockTime == 0 ? SystemClock.elapsedRealtime() : this.startClockTime, this.errorList);
            }
            this.listeners.clear();
        }
    }

    public void addError(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a52aeff6757df8d8aec8bcbfda17a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a52aeff6757df8d8aec8bcbfda17a1c");
        } else {
            this.errorList.add(exc);
        }
    }

    public void addChildResult(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01b8772344acfc3733f033d5e7dbd98e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01b8772344acfc3733f033d5e7dbd98e");
        } else {
            this.childResult.put(k, v);
        }
    }

    public Map<K, V> getChildResult() {
        return this.childResult;
    }

    public V getResult() {
        return this.result;
    }

    public void initLatch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1110292536f3fb30067bd501642c4d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1110292536f3fb30067bd501642c4d48");
        } else if (this.latch != null || this.children == null || this.children.size() <= 0) {
        } else {
            this.latch = new CountDownLatch(this.children.size());
        }
    }

    public Collection<DependencyTask<K, V>> getChildren() {
        return this.children;
    }

    public Set<DependencyTask<K, V>> getParents() {
        return this.parents;
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19c4bbc50222b91f2d003cd2c1415b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19c4bbc50222b91f2d003cd2c1415b2e")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getTaskUniqueId().equals(((DependencyTask) obj).getTaskUniqueId());
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d90fc19224c4cf2c20bfec042165a678", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d90fc19224c4cf2c20bfec042165a678")).intValue() : Objects.hash(getTaskUniqueId());
    }

    public String getErrorContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ee9fa7311a1a5a10bf509b36632d5dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ee9fa7311a1a5a10bf509b36632d5dd") : AppUtil.getErrorContent(this.errorList);
    }

    public List<Exception> getErrorList() {
        return this.errorList;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9010ad01f3c47a3a54d299e35508e5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9010ad01f3c47a3a54d299e35508e5c");
        }
        return "DependencyTask{taskUniqueId=" + this.taskUniqueId + '}';
    }
}
