package com.meituan.android.aurora;

import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraCustomAnchorsRuntime {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final BlockingQueue<AuroraTask> taskQueue = new LinkedBlockingQueue();
    private static final Map<AuroraOpportunity, Queue<String>> anchorTaskIdMap = new HashMap();
    private static Queue<String> anchorTaskQueue = null;

    @MainThread
    public static void start(AuroraOpportunity auroraOpportunity, AuroraProject auroraProject) {
        Object[] objArr = {auroraOpportunity, auroraProject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37be880f74d344a79ae1d57e641d15de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37be880f74d344a79ae1d57e641d15de");
            return;
        }
        AuroraUtils.assertMainThread();
        anchorTaskQueue = getAnchorTaskQueue(auroraOpportunity);
        auroraProject.start();
        while (hasAnchorTasks()) {
            tryRunBlockRunnable();
        }
    }

    public static void tryRunBlockRunnable() {
        AuroraTask auroraTask;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39102b489352904f629f0f241a14f087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39102b489352904f629f0f241a14f087");
            return;
        }
        try {
            auroraTask = taskQueue.poll(5L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            auroraTask = null;
        }
        if (auroraTask == null) {
            return;
        }
        auroraTask.run();
    }

    public static void addAnchorTask(AuroraOpportunity auroraOpportunity, String str) {
        Object[] objArr = {auroraOpportunity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d808f33a6128df497a24a67f5293986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d808f33a6128df497a24a67f5293986");
            return;
        }
        Queue<String> anchorTaskQueue2 = getAnchorTaskQueue(auroraOpportunity);
        if (str != null) {
            anchorTaskQueue2.add(str);
        }
    }

    public static void removeAnchorTask(AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75ff9b6128f49b9e9a59bbe1a1aea753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75ff9b6128f49b9e9a59bbe1a1aea753");
        } else if (auroraTask != null) {
            anchorTaskQueue.remove(auroraTask.getId());
        }
    }

    private static boolean hasAnchorTasks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54253b14fb1ab50b5955623fd321ddf3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54253b14fb1ab50b5955623fd321ddf3")).booleanValue() : (anchorTaskQueue == null || anchorTaskQueue.isEmpty()) ? false : true;
    }

    private static Queue<String> getAnchorTaskQueue(AuroraOpportunity auroraOpportunity) {
        Object[] objArr = {auroraOpportunity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ef35c39d5fc126ec65fc6f83cdd910f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Queue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ef35c39d5fc126ec65fc6f83cdd910f");
        }
        Queue<String> queue = anchorTaskIdMap.get(auroraOpportunity);
        if (queue == null) {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            anchorTaskIdMap.put(auroraOpportunity, concurrentLinkedQueue);
            return concurrentLinkedQueue;
        }
        return queue;
    }
}
