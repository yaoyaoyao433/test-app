package com.meituan.android.aurora;

import android.os.Looper;
import android.os.MessageQueue;
import com.meituan.android.aurora.AuroraProject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraHomeController {
    private static final long DELAY_TIME = 500;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isHomeCacheLoaded;
    private boolean isHomeDelayLoaded;
    private boolean isHomeIdleLoaded;
    private boolean isHomeLoadFinishLoaded;
    private final Map<Integer, List<AuroraTask>> mTaskMap;

    public AuroraHomeController() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190d3ebb8b91e3cfec2b9998ec5ad99e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190d3ebb8b91e3cfec2b9998ec5ad99e");
            return;
        }
        this.mTaskMap = new ConcurrentHashMap();
        this.isHomeIdleLoaded = false;
        this.isHomeLoadFinishLoaded = false;
        this.isHomeDelayLoaded = false;
        this.isHomeCacheLoaded = false;
    }

    public boolean isHomeCacheLoaded() {
        return this.isHomeCacheLoaded;
    }

    public void register(AuroraTask auroraTask, int i) {
        boolean z = false;
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0353b91ce96286bfd2862a03425a3d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0353b91ce96286bfd2862a03425a3d5e");
        } else if (auroraTask == null) {
        } else {
            if (i == 1) {
                z = this.isHomeCacheLoaded;
            } else if (i == 4) {
                z = this.isHomeIdleLoaded;
            } else if (i == 2) {
                z = this.isHomeLoadFinishLoaded;
            } else if (i == 3) {
                z = this.isHomeDelayLoaded;
            }
            if (z) {
                if (auroraTask.isAsyncTask()) {
                    AuroraAnchorsRuntime.getThreadPool().executeTask(auroraTask);
                    return;
                } else {
                    auroraTask.run();
                    return;
                }
            }
            List<AuroraTask> list = this.mTaskMap.get(Integer.valueOf(i));
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(auroraTask);
                this.mTaskMap.put(Integer.valueOf(i), arrayList);
            } else if (list.contains(auroraTask)) {
            } else {
                list.add(auroraTask);
            }
        }
    }

    public void start(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "085bcf454c0d089531b50881ddac76a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "085bcf454c0d089531b50881ddac76a6");
        } else if (i == 1) {
            this.isHomeCacheLoaded = true;
            executeHomeCacheTask(i);
        } else if (i == 4) {
            this.isHomeIdleLoaded = true;
            executeInIdle(i);
        } else if (i == 2) {
            this.isHomeLoadFinishLoaded = true;
            executeHomeLoadFinishTask(i);
        } else if (i == 3) {
            this.isHomeDelayLoaded = true;
            executeHomeDelayTask(i);
        }
    }

    private void executeHomeCacheTask(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "207be1361204bb8dd98fc930a32cdb4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "207be1361204bb8dd98fc930a32cdb4d");
            return;
        }
        execute(i);
        AuroraReporter.upload();
    }

    private void executeHomeLoadFinishTask(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab1ce705bf31a9dc0e48918ae8981443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab1ce705bf31a9dc0e48918ae8981443");
            return;
        }
        execute(i);
        AuroraSecondaryController.addIdleHandler();
        start(3);
        start(4);
        AuroraReporter.upload();
        AuroraMainLooper.recordFinish();
    }

    private void executeHomeDelayTask(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0754ea342c18294b170826764a3e1021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0754ea342c18294b170826764a3e1021");
        } else {
            AuroraAnchorsRuntime.getMainHandler().postDelayed(new Runnable() { // from class: com.meituan.android.aurora.AuroraHomeController.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cc4029905c8122165184efa5a873125d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cc4029905c8122165184efa5a873125d");
                    } else {
                        AuroraHomeController.this.execute(i);
                    }
                }
            }, 500L);
        }
    }

    private void executeInIdle(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "373139c859ae5b042e85c1e9400ef873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "373139c859ae5b042e85c1e9400ef873");
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.meituan.android.aurora.AuroraHomeController.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb565ff143d7ad52f77a3863c6f784fb", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb565ff143d7ad52f77a3863c6f784fb")).booleanValue();
                    }
                    List list = (List) AuroraHomeController.this.mTaskMap.get(Integer.valueOf(i));
                    if (list == null || list.size() <= 0) {
                        return false;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AuroraTask auroraTask = (AuroraTask) it.next();
                        if (auroraTask != null) {
                            if (auroraTask.isAsyncTask()) {
                                AuroraAnchorsRuntime.getThreadPool().executeTask(auroraTask);
                            } else {
                                auroraTask.run();
                            }
                        }
                        it.remove();
                        if (!AuroraUtils.isMainThreadIdle()) {
                            return it.hasNext();
                        }
                    }
                    return !list.isEmpty();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void execute(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a420c56b2356e61a16c2988ee033b32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a420c56b2356e61a16c2988ee033b32");
            return;
        }
        List<AuroraTask> list = this.mTaskMap.get(Integer.valueOf(i));
        if (list != null && list.size() > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<AuroraTask> it = list.iterator();
            while (it.hasNext()) {
                AuroraTask next = it.next();
                if (next != null) {
                    linkedHashMap.put(next.getId(), next);
                }
                it.remove();
            }
            if (!linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                AuroraProject.Builder builder = new AuroraProject.Builder("Project_" + i);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    AuroraTask auroraTask = (AuroraTask) entry.getValue();
                    if (auroraTask != null) {
                        builder.add(auroraTask);
                        if (auroraTask.isAnchors()) {
                            arrayList.add(auroraTask.getId());
                        }
                        if (auroraTask.beforeTaskNames() != null && !auroraTask.beforeTaskNames().isEmpty()) {
                            for (String str : auroraTask.beforeTaskNames()) {
                                if (linkedHashMap.get(str) != null) {
                                    builder.dependOn((AuroraTask) linkedHashMap.get(str));
                                } else if (AuroraAnchorsRuntime.debuggable()) {
                                    throw new RuntimeException("DependTask [" + str + "] of [" + auroraTask.getId() + "] not found.");
                                }
                            }
                            continue;
                        }
                    }
                }
                AuroraAnchorsRuntime.addAnchorTasks(i, arrayList);
                AuroraAnchorsRuntime.start(i, builder.build());
            }
        }
    }
}
