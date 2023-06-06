package com.meituan.metrics.util;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScheduleHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ScheduledExecutorService service;
    private final ConcurrentLinkedQueue<Task> tasks;

    public void handleMessage(Task task) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class Task implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ScheduledFuture<?> feature;
        public Object obj;
        private Runnable runnable;
        public int what = -1;
        private volatile boolean canceled = false;

        public Task() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab8bd210187f02e8ef9938b53db0d91f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab8bd210187f02e8ef9938b53db0d91f");
                return;
            }
            try {
                if (this.canceled) {
                    return;
                }
                if (this.runnable != null) {
                    this.runnable.run();
                } else {
                    ScheduleHandler.this.handleMessage(this);
                }
            } finally {
                end();
            }
        }

        private void end() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bdc6f068bd824d23d6278632291c27e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bdc6f068bd824d23d6278632291c27e");
            } else {
                ScheduleHandler.this.tasks.remove(this);
            }
        }

        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d37e8c55cb59571c74a58817ffd7ffc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d37e8c55cb59571c74a58817ffd7ffc");
                return;
            }
            this.canceled = true;
            if (this.feature != null) {
                this.feature.cancel(false);
                this.feature = null;
            }
        }
    }

    public ScheduleHandler(@NonNull ScheduledExecutorService scheduledExecutorService) {
        Object[] objArr = {scheduledExecutorService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40107cd13891134dda76b4b16d72d7e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40107cd13891134dda76b4b16d72d7e8");
            return;
        }
        this.tasks = new ConcurrentLinkedQueue<>();
        this.service = scheduledExecutorService;
    }

    public boolean post(Runnable runnable, String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efd91b645dd572a47ff91e42471743ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efd91b645dd572a47ff91e42471743ee")).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        Task task = new Task();
        task.runnable = runnable;
        this.tasks.add(task);
        this.service.execute(new TrafficScheduleRunnableDelegate(task, str));
        return true;
    }

    public void removeCallbacks(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "061c6d83b961d913ea1760299a7c63b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "061c6d83b961d913ea1760299a7c63b8");
        } else if (runnable == null) {
        } else {
            Iterator<Task> it = this.tasks.iterator();
            while (it.hasNext()) {
                Task next = it.next();
                if (next.runnable == runnable) {
                    next.cancel();
                    it.remove();
                }
            }
        }
    }

    public void sendMsg(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ab2a5011811fdd1bd78387d006f7c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ab2a5011811fdd1bd78387d006f7c60");
        } else {
            sendMsg(i, null);
        }
    }

    public void sendMsg(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66543f51fce97672d0c10451719639a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66543f51fce97672d0c10451719639a5");
            return;
        }
        Task task = new Task();
        task.what = i;
        task.obj = obj;
        this.tasks.add(task);
        this.service.execute(new TrafficScheduleRunnableDelegate(task, String.valueOf(i)));
    }

    public void postDelayed(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eceb2a1449fec78a641d0aa6e964aa22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eceb2a1449fec78a641d0aa6e964aa22");
        } else {
            postDelayed(i, null, j, "emptyObj");
        }
    }

    public void postDelayed(int i, Object obj, long j, String str) {
        Object[] objArr = {Integer.valueOf(i), obj, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9fbacb527cc303b346c7d3664dabcd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9fbacb527cc303b346c7d3664dabcd4");
            return;
        }
        Task task = new Task();
        task.what = i;
        task.obj = obj;
        this.tasks.add(task);
        task.feature = this.service.schedule(new TrafficScheduleRunnableDelegate(task, str), j, TimeUnit.MILLISECONDS);
    }

    public void postDelayed(Runnable runnable, long j, String str) {
        Object[] objArr = {runnable, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34b2327c05817cd2b5198c80b3d7c4fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34b2327c05817cd2b5198c80b3d7c4fd");
            return;
        }
        Task task = new Task();
        task.runnable = runnable;
        this.tasks.add(task);
        task.feature = this.service.schedule(new TrafficScheduleRunnableDelegate(task, str), j, TimeUnit.MILLISECONDS);
    }

    public void scheduleAtFixedRate(Runnable runnable, long j, long j2, String str) {
        Object[] objArr = {runnable, new Long(j), new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5931fa024a4b0d8b8591a295719fd73d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5931fa024a4b0d8b8591a295719fd73d");
            return;
        }
        Task task = new Task();
        task.runnable = runnable;
        this.tasks.add(task);
        task.feature = this.service.scheduleAtFixedRate(new TrafficScheduleRunnableDelegate(task, str), j, j2, TimeUnit.MILLISECONDS);
    }
}
