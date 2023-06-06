package com.meituan.android.aurora;

import android.os.Looper;
import android.os.MessageQueue;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.android.aurora.AuroraProject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class AuroraSecondaryController {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AuroraProject mSecondaryProject;
    private static final Map<String, AuroraTask> mSecondaryTaskMap = new LinkedHashMap();
    private static final Map<String, AuroraTask> secondaryProjectMap = new LinkedHashMap();

    public static /* synthetic */ AuroraProject access$100() {
        return build();
    }

    @MainThread
    public static void start(AuroraProject auroraProject) {
        Object[] objArr = {auroraProject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30241202720f7ec4e0379db8b7076968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30241202720f7ec4e0379db8b7076968");
            return;
        }
        AuroraUtils.assertMainThread();
        if (auroraProject == null) {
            throw new RuntimeException("can no run a task that was null !");
        }
        auroraProject.start();
    }

    public static void addIdleHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "157a1f3ac5aa4f76778e5da008373cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "157a1f3ac5aa4f76778e5da008373cde");
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.meituan.android.aurora.AuroraSecondaryController.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0246963bdb5d9fd31a66c7f3758b7f7f", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0246963bdb5d9fd31a66c7f3758b7f7f")).booleanValue();
                    }
                    if (AuroraSecondaryController.mSecondaryProject == null || AuroraSecondaryController.isEmpty()) {
                        AuroraProject unused = AuroraSecondaryController.mSecondaryProject = AuroraSecondaryController.access$100();
                    }
                    if (AuroraSecondaryController.mSecondaryProject == null) {
                        return false;
                    }
                    List<AuroraTask> behindTasks = AuroraSecondaryController.mSecondaryProject.getStartTask().getBehindTasks();
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(behindTasks.get(0));
                    AuroraSecondaryController.start(AuroraSecondaryController.executeTaskSetFromSecondaryProject(hashSet));
                    return !behindTasks.isEmpty();
                }
            });
        }
    }

    public static boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b777ebc37a12e6e67b668961b77f322e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b777ebc37a12e6e67b668961b77f322e")).booleanValue() : mSecondaryProject.getStartTask().getBehindTasks().isEmpty();
    }

    public static void startSecondaryTaskByTaskId(Set<String> set) {
        AuroraProject executeTaskSetFromSecondaryProject;
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61413d3c425abb8eaad284414cf3865b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61413d3c425abb8eaad284414cf3865b");
        } else if (set != null && !set.isEmpty()) {
            if (mSecondaryProject == null || isEmpty()) {
                mSecondaryProject = build();
            }
            if (mSecondaryProject == null) {
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                AuroraTask auroraTask = secondaryProjectMap.get(str);
                if (auroraTask != null) {
                    hashSet.add(auroraTask);
                }
            }
            if (!mSecondaryTaskMap.isEmpty()) {
                for (AuroraTask auroraTask2 : mSecondaryTaskMap.values()) {
                    if (set.contains(auroraTask2.getId())) {
                        auroraTask2.start();
                        AuroraReporter.smell("AuroraSecondaryDowngrade-ById", auroraTask2.toString(), new RuntimeException());
                    }
                }
            }
            if (hashSet.isEmpty() || (executeTaskSetFromSecondaryProject = executeTaskSetFromSecondaryProject(hashSet)) == null) {
                return;
            }
            start(executeTaskSetFromSecondaryProject);
        }
    }

    public static void startSecondaryTaskByPageInfo(String str, String str2, boolean z) {
        AuroraProject executeTaskSetFromSecondaryProject;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "999a186ccfebc72918b374b6f0870c15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "999a186ccfebc72918b374b6f0870c15");
            return;
        }
        if (mSecondaryProject == null || isEmpty()) {
            mSecondaryProject = build();
        }
        if (mSecondaryProject == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (AuroraTask auroraTask : secondaryProjectMap.values()) {
            if (taskShouldExecute(auroraTask, str, str2, z)) {
                hashSet.add(auroraTask);
            }
        }
        if (!mSecondaryTaskMap.isEmpty()) {
            for (AuroraTask auroraTask2 : mSecondaryTaskMap.values()) {
                if (taskShouldExecute(auroraTask2, str, str2, z)) {
                    auroraTask2.start();
                    AuroraReporter.smell("AuroraSecondaryDowngrade-ByPage", auroraTask2.toString(), new RuntimeException());
                }
            }
        }
        if (hashSet.isEmpty() || (executeTaskSetFromSecondaryProject = executeTaskSetFromSecondaryProject(hashSet)) == null) {
            return;
        }
        start(executeTaskSetFromSecondaryProject);
    }

    private static AuroraProject build() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6777cea29d7ff420184f760ac7a498b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (AuroraProject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6777cea29d7ff420184f760ac7a498b9");
        }
        if (mSecondaryTaskMap.size() <= 0) {
            return null;
        }
        AuroraProject.Builder builder = new AuroraProject.Builder("Secondary");
        for (String str : mSecondaryTaskMap.keySet()) {
            AuroraTask auroraTask = mSecondaryTaskMap.get(str);
            if (auroraTask != null) {
                builder.add(auroraTask);
                if (auroraTask.beforeTaskNames() != null && auroraTask.beforeTaskNames().size() > 0) {
                    for (String str2 : auroraTask.beforeTaskNames()) {
                        if (str2.equals(str)) {
                            throw new RuntimeException(str2 + " has itself as a depend task.");
                        } else if (mSecondaryTaskMap.get(str2) != null) {
                            builder.dependOn(mSecondaryTaskMap.get(str2));
                        } else if (AuroraAnchorsRuntime.debuggable() && mSecondaryTaskMap.get(str2) == null) {
                            throw new RuntimeException("不存在该初始化任务【" + str2 + "】,请检查该初始化任务【" + str + "】的依赖关系");
                        }
                    }
                    continue;
                }
            }
        }
        secondaryProjectMap.putAll(mSecondaryTaskMap);
        mSecondaryTaskMap.clear();
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AuroraProject executeTaskSetFromSecondaryProject(Set<AuroraTask> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d4b3d12d98e78644f75511742b604e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AuroraProject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d4b3d12d98e78644f75511742b604e7");
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        AuroraProject build = new AuroraProject.Builder("Secondary").build();
        build.getEndTask().removeDependence(build.getStartTask());
        AuroraTask startTask = mSecondaryProject.getStartTask();
        AuroraTask endTask = mSecondaryProject.getEndTask();
        ArrayList arrayList = new ArrayList(set);
        int size = arrayList.size();
        HashSet hashSet = new HashSet();
        int i = size;
        for (int i2 = 0; i2 < i; i2++) {
            AuroraTask auroraTask = (AuroraTask) arrayList.get(i2);
            Set<AuroraTask> dependTasks = auroraTask.getDependTasks();
            if (dependTasks.contains(startTask)) {
                auroraTask.removeDependence(startTask);
                build.getStartTask().behind(auroraTask);
                hashSet.add(auroraTask);
            } else {
                for (AuroraTask auroraTask2 : dependTasks) {
                    if (!arrayList.contains(auroraTask2)) {
                        arrayList.add(auroraTask2);
                        i++;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AuroraTask auroraTask3 = (AuroraTask) arrayList2.get(i3);
            List<AuroraTask> behindTasks = auroraTask3.getBehindTasks();
            if (behindTasks.contains(endTask)) {
                endTask.removeDependence(auroraTask3);
                auroraTask3.behind(build.getEndTask());
            } else {
                for (AuroraTask auroraTask4 : behindTasks) {
                    if (!arrayList2.contains(auroraTask4)) {
                        arrayList2.add(auroraTask4);
                        size2++;
                    }
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            secondaryProjectMap.remove(((AuroraTask) it.next()).getId());
        }
        if (AuroraAnchorsRuntime.debuggable()) {
            PrintStream printStream = System.out;
            printStream.println("Secondary Project: " + mSecondaryProject);
            PrintStream printStream2 = System.out;
            printStream2.println("Secondary Execute Project: " + build);
        }
        return build;
    }

    public static boolean taskShouldExecute(AuroraTask auroraTask, String str, String str2, boolean z) {
        boolean isAssignableFrom;
        Object[] objArr = {auroraTask, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e496497d4dc7a42b90e336f78065b97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e496497d4dc7a42b90e336f78065b97")).booleanValue();
        }
        if (auroraTask == null) {
            return false;
        }
        AuroraPageInfo pageInfo = auroraTask.pageInfo();
        if (pageInfo == null) {
            if (AuroraAnchorsRuntime.debuggable()) {
                PrintStream printStream = System.out;
                printStream.println("AuroraLogger>>>【AuroraSecondaryController.start】match default, no config, task:" + auroraTask);
            }
            return true;
        }
        if (pageInfo.getClassNameList() != null) {
            for (String str3 : pageInfo.getClassNameList()) {
                if (!TextUtils.isEmpty(str3) && str3.equals(str)) {
                    if (AuroraAnchorsRuntime.debuggable()) {
                        PrintStream printStream2 = System.out;
                        printStream2.println("AuroraLogger>>>【AuroraSecondaryController.start】match className, execute task:" + auroraTask);
                    }
                    return true;
                }
            }
        }
        if (pageInfo.getPkgNameList() != null) {
            for (String str4 : pageInfo.getPkgNameList()) {
                if (!TextUtils.isEmpty(str4) && str.contains(str4)) {
                    if (AuroraAnchorsRuntime.debuggable()) {
                        PrintStream printStream3 = System.out;
                        printStream3.println("AuroraLogger>>>【AuroraSecondaryController.start】match pkgName, execute task:" + auroraTask);
                    }
                    return true;
                }
            }
        }
        if (pageInfo.getUriStrList() != null && !TextUtils.isEmpty(str2)) {
            for (String str5 : pageInfo.getUriStrList()) {
                if (!TextUtils.isEmpty(str5) && str2.startsWith(str5)) {
                    if (AuroraAnchorsRuntime.debuggable()) {
                        PrintStream printStream4 = System.out;
                        printStream4.println("AuroraLogger>>>【AuroraSecondaryController.start】match uri, execute task:" + auroraTask);
                    }
                    return true;
                }
            }
        }
        if (pageInfo.getBaseClassNameList() != null && !pageInfo.getBaseClassNameList().isEmpty()) {
            for (String str6 : pageInfo.getBaseClassNameList()) {
                try {
                    isAssignableFrom = Class.forName(str6).isAssignableFrom(Class.forName(str));
                    if (AuroraAnchorsRuntime.debuggable()) {
                        PrintStream printStream5 = System.out;
                        printStream5.println("AuroraLogger>>>【AuroraSecondaryController.start】baseClassName:" + str6 + "; paramClassName:" + str + "; r=" + isAssignableFrom);
                    }
                } catch (ClassNotFoundException e) {
                    if (AuroraAnchorsRuntime.debuggable()) {
                        PrintStream printStream6 = System.err;
                        printStream6.println("AuroraLogger>>>【AuroraSecondaryController.start】class not found:" + e.getMessage());
                    }
                }
                if (isAssignableFrom) {
                    if (AuroraAnchorsRuntime.debuggable()) {
                        PrintStream printStream7 = System.out;
                        printStream7.println("AuroraLogger>>>【AuroraSecondaryController.start】match baseClassName, execute task:" + auroraTask);
                    }
                    return true;
                }
                continue;
            }
        }
        if (z || pageInfo.getTaskType() != 1) {
            return false;
        }
        if (AuroraAnchorsRuntime.debuggable()) {
            PrintStream printStream8 = System.out;
            printStream8.println("AuroraLogger>>>【AuroraSecondaryController.start】match preload, execute task:" + auroraTask);
        }
        return true;
    }

    public static void register(AuroraTask auroraTask, int i) {
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d567f5634ddcce3d5509548c28d7698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d567f5634ddcce3d5509548c28d7698");
        } else if (AuroraAnchorsRuntime.debuggable() && mSecondaryTaskMap.containsKey(auroraTask.getId())) {
            throw new RuntimeException(auroraTask.getId() + " is double registered.");
        } else {
            mSecondaryTaskMap.put(auroraTask.getId(), auroraTask);
        }
    }
}
