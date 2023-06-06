package com.meituan.android.aurora;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.aurora.AuroraProject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraAppController {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<String> mAnchorsList;
    private final Map<String, AuroraTask> mAttachTaskMap;
    private Context mContext;
    private AuroraProject mCreateProject;
    private final Map<String, AuroraTask> mCreateTaskMap;

    public AuroraAppController(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81fcd070f3af7185072e6c4ddbd3199f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81fcd070f3af7185072e6c4ddbd3199f");
            return;
        }
        this.mAttachTaskMap = new LinkedHashMap();
        this.mCreateTaskMap = new LinkedHashMap();
        this.mAnchorsList = new LinkedList();
        this.mContext = context;
    }

    public void startAppAttachTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ec8715e995d5bfe3d27fe11408d337b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ec8715e995d5bfe3d27fe11408d337b");
            return;
        }
        AuroraProject buildAttachProject = buildAttachProject();
        this.mCreateProject = buildCreateProject();
        handleAnchors(-1);
        if (buildAttachProject != null) {
            AuroraAnchorsRuntime.start(-2, buildAttachProject);
        }
    }

    public void startAppCreateTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6eafd3f1569f9e6eaa1c2f67d40e7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6eafd3f1569f9e6eaa1c2f67d40e7b7");
            return;
        }
        if (this.mCreateProject == null) {
            this.mCreateProject = buildCreateProject();
            handleAnchors(-1);
        }
        if (this.mCreateProject != null) {
            AuroraAnchorsRuntime.start(-1, this.mCreateProject);
        }
        clear();
    }

    private AuroraProject buildAttachProject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0595862298a3d2c6f203f3684acafb11", RobustBitConfig.DEFAULT_VALUE) ? (AuroraProject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0595862298a3d2c6f203f3684acafb11") : build(this.mAnchorsList, -2, this.mAttachTaskMap);
    }

    private AuroraProject buildCreateProject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d36eee34031227498eb23f13050e559", RobustBitConfig.DEFAULT_VALUE) ? (AuroraProject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d36eee34031227498eb23f13050e559") : build(this.mAnchorsList, -1, this.mCreateTaskMap);
    }

    private AuroraProject build(@NonNull List<String> list, int i, Map<String, AuroraTask> map) {
        String str;
        Object[] objArr = {list, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0874087674d54c074ba0f35fdfeb2039", RobustBitConfig.DEFAULT_VALUE)) {
            return (AuroraProject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0874087674d54c074ba0f35fdfeb2039");
        }
        AuroraProject.CriticalTask criticalTask = null;
        if (map.size() <= 0) {
            return null;
        }
        if (i == -2) {
            if (ProcessUtils.isMainProcess(this.mContext)) {
                str = "AttachMainProcess";
            } else {
                str = AuroraUtils.isPushProcess(this.mContext) ? "AttachPushProcess" : "AttachOtherProcess";
            }
        } else if (i == -1) {
            if (ProcessUtils.isMainProcess(this.mContext)) {
                str = "CreateMainProcess";
            } else {
                str = AuroraUtils.isPushProcess(this.mContext) ? "CreatePushProcess" : "CreateOtherProcess";
            }
        } else if (i != 5) {
            str = "Unknown";
        } else if (ProcessUtils.isMainProcess(this.mContext)) {
            str = "SecondaryMainProcess";
        } else {
            str = AuroraUtils.isPushProcess(this.mContext) ? "SecondaryPushProcess" : "SecondaryOtherProcess";
        }
        AuroraProject.Builder builder = new AuroraProject.Builder(str);
        if (i == -1) {
            criticalTask = new AuroraProject.CriticalTask("CreateGhostTask");
            builder.add(criticalTask);
        }
        for (String str2 : map.keySet()) {
            AuroraTask auroraTask = map.get(str2);
            if (auroraTask != null) {
                builder.add(auroraTask);
                if (auroraTask.isAnchors() && list != null && !list.contains(str2)) {
                    list.add(str2);
                }
                if (auroraTask.beforeTaskNames() != null && auroraTask.beforeTaskNames().size() > 0) {
                    for (String str3 : auroraTask.beforeTaskNames()) {
                        if (str3.equals(str2)) {
                            throw new RuntimeException(str3 + " has itself as a depend task.");
                        }
                        if (map.get(str3) != null) {
                            builder.dependOn(map.get(str3));
                        } else if (AuroraAnchorsRuntime.debuggable()) {
                            if (i == -2) {
                                if (this.mCreateTaskMap.get(str3) != null) {
                                    throw new RuntimeException("Application#attachBaseContext()阶段不可以依赖Application#onCreate阶段的任务，请检查该初始化任务【" + str2 + "】的依赖关系，确保时机正确");
                                }
                                throw new RuntimeException("不存在该初始化任务【" + str3 + "】, 请检查该初始化任务【" + str2 + "】的依赖关系");
                            } else if (i == -1 && this.mAttachTaskMap.get(str3) == null) {
                                throw new RuntimeException("不存在该初始化任务【" + str3 + "】,请检查该初始化任务【" + str2 + "】的依赖关系");
                            }
                        }
                        if (i == -1 && this.mAttachTaskMap.get(str3) != null) {
                            builder.dependOn(this.mAttachTaskMap.get(str3));
                            builder.dependOn(criticalTask);
                        }
                    }
                    continue;
                }
            }
        }
        return builder.build();
    }

    public void handleAnchors(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f79c9d67f15993a81291a73473156b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f79c9d67f15993a81291a73473156b83");
        } else if (this.mAnchorsList.isEmpty()) {
        } else {
            AuroraAnchorsRuntime.addAnchorTasks(i, this.mAnchorsList);
            this.mAnchorsList.clear();
        }
    }

    private void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78c01c4c5d49853be1e9d815da5e2f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78c01c4c5d49853be1e9d815da5e2f47");
            return;
        }
        this.mAttachTaskMap.clear();
        this.mCreateTaskMap.clear();
        this.mCreateProject = null;
    }

    public void register(AuroraTask auroraTask, int i) {
        Object[] objArr = {auroraTask, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2997f86cf82b67375004787efdb9cd6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2997f86cf82b67375004787efdb9cd6b");
        } else if (AuroraAnchorsRuntime.debuggable() && (this.mAttachTaskMap.containsKey(auroraTask.getId()) || this.mCreateTaskMap.containsKey(auroraTask.getId()))) {
            throw new RuntimeException(auroraTask.getId() + " is double registered.");
        } else if (i == -2) {
            this.mAttachTaskMap.put(auroraTask.getId(), auroraTask);
        } else if (i == -1) {
            this.mCreateTaskMap.put(auroraTask.getId(), auroraTask);
        }
    }
}
