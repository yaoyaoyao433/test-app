package com.meituan.android.aurora;

import android.app.Application;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class AuroraProject extends AuroraUITask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AuroraTask endTask;
    private AuroraTask startTask;

    @Override // com.meituan.android.aurora.IAuroraTask
    public void execute(Application application) {
    }

    public AuroraProject(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "086010134dc014801b772cf47d423abe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "086010134dc014801b772cf47d423abe");
        }
    }

    @NonNull
    public AuroraTask getStartTask() {
        return this.startTask;
    }

    @NonNull
    public AuroraTask getEndTask() {
        return this.endTask;
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public void behind(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab19bd2c5891f1aae5039fdd14fecda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab19bd2c5891f1aae5039fdd14fecda");
        } else {
            this.endTask.behind(auroraTask);
        }
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public void dependOn(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0aae061389e69d5917630bcdd21fc11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0aae061389e69d5917630bcdd21fc11");
        } else {
            this.startTask.dependOn(auroraTask);
        }
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public void removeBehind(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69bbb52a39b01ed309b4a771c28603bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69bbb52a39b01ed309b4a771c28603bc");
        } else {
            this.endTask.removeBehind(auroraTask);
        }
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public void removeDependence(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "288c1b1d77bd321f424c08997fabad86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "288c1b1d77bd321f424c08997fabad86");
        } else {
            this.startTask.removeDependence(auroraTask);
        }
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public synchronized void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec1e02de27f7e76a963c1afd20a1e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec1e02de27f7e76a963c1afd20a1e2a");
        } else {
            this.startTask.start();
        }
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8875fa34259a184eaef3fb2f35ef959", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8875fa34259a184eaef3fb2f35ef959");
        }
        StringBuilder sb = new StringBuilder("StartTask: " + this.startTask);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.startTask);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AuroraTask auroraTask = (AuroraTask) arrayList.get(i);
            List<AuroraTask> behindTasks = auroraTask.getBehindTasks();
            sb.append("BehindTasks of ");
            sb.append(auroraTask.getId());
            sb.append(": ");
            sb.append(behindTasks);
            sb.append("\n");
            for (AuroraTask auroraTask2 : behindTasks) {
                if (!arrayList.contains(auroraTask2)) {
                    arrayList.add(auroraTask2);
                    size++;
                }
            }
        }
        return new String(sb);
    }

    @Override // com.meituan.android.aurora.AuroraTask
    public void recycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b29cdfe402749c162102aa9b63f1edbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b29cdfe402749c162102aa9b63f1edbd");
            return;
        }
        super.recycle();
        this.endTask = null;
        this.startTask = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private AuroraTask mCurrentAddTask;
        private boolean mCurrentTaskShouldDependOnStartTask;
        private final AuroraTask mFinishTask;
        private int mPriority;
        private final AuroraProject mProject;
        private final AuroraTask mStartTask;

        public Builder(@NonNull String str, Map<String, AuroraTask> map) {
            this(str);
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32c5bc2ea415670fa8822172b9807627", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32c5bc2ea415670fa8822172b9807627");
                return;
            }
            for (String str2 : map.keySet()) {
                AuroraTask auroraTask = map.get(str2);
                if (auroraTask != null) {
                    add(auroraTask);
                    if (auroraTask.beforeTaskNames() != null && auroraTask.beforeTaskNames().size() > 0) {
                        for (String str3 : auroraTask.beforeTaskNames()) {
                            if (str3.equals(str2)) {
                                throw new RuntimeException(str3 + " has itself as a depend task.");
                            } else if (map.get(str3) != null) {
                                dependOn(map.get(str3));
                            } else if (AuroraAnchorsRuntime.debuggable()) {
                                throw new RuntimeException("不存在该初始化任务【" + str3 + "】,请检查该初始化任务【" + str2 + "】的依赖关系");
                            }
                        }
                        continue;
                    }
                }
            }
        }

        public Builder(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63a1e31601e62c8577d9de38dded39a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63a1e31601e62c8577d9de38dded39a6");
                return;
            }
            this.mCurrentAddTask = null;
            this.mCurrentTaskShouldDependOnStartTask = false;
            this.mProject = new AuroraProject(str);
            long currentTimeMillis = System.currentTimeMillis();
            this.mStartTask = new CriticalTask(str + "_start(" + currentTimeMillis + CommonConstant.Symbol.BRACKET_RIGHT);
            this.mFinishTask = new CriticalTask(str + "_end(" + currentTimeMillis + CommonConstant.Symbol.BRACKET_RIGHT);
        }

        public AuroraProject build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719cda6dc16dbd8f53ca9c55a1e149b0", RobustBitConfig.DEFAULT_VALUE)) {
                return (AuroraProject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719cda6dc16dbd8f53ca9c55a1e149b0");
            }
            if (this.mCurrentAddTask != null) {
                if (this.mCurrentTaskShouldDependOnStartTask) {
                    this.mStartTask.behind(this.mCurrentAddTask);
                }
            } else {
                this.mStartTask.behind(this.mFinishTask);
            }
            this.mStartTask.setPriority(this.mPriority);
            this.mFinishTask.setPriority(this.mPriority);
            if (AuroraAnchorsRuntime.debuggable()) {
                loopDetect();
            }
            this.mProject.startTask = this.mStartTask;
            this.mProject.endTask = this.mFinishTask;
            return this.mProject;
        }

        private void loopDetect() throws RuntimeException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9746e0f75c5acfae3eb4d4fad7db7684", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9746e0f75c5acfae3eb4d4fad7db7684");
            } else if (this.mStartTask.getBehindTasks().size() == 0) {
                throw new RuntimeException("Empty project or looped project. Trace from any task to find the loop.");
            } else {
                AuroraTask auroraTask = this.mFinishTask;
                Iterator<AuroraTask> it = auroraTask.getDependTasks().iterator();
                Stack stack = new Stack();
                Stack stack2 = new Stack();
                stack.push(auroraTask);
                while (!stack.isEmpty()) {
                    AuroraTask next = it.hasNext() ? it.next() : null;
                    if (next != null) {
                        int indexOf = stack.indexOf(next);
                        if (indexOf >= 0) {
                            StringBuilder sb = new StringBuilder("Loop found:");
                            while (indexOf < stack.size()) {
                                sb.append("\n\t\t");
                                sb.append(((AuroraTask) stack.get(indexOf)).toString());
                                indexOf++;
                            }
                            throw new RuntimeException(sb.toString());
                        }
                        stack.push(next);
                        stack2.push(it);
                        Set<AuroraTask> dependTasks = next.getDependTasks();
                        if (dependTasks != null) {
                            it = dependTasks.iterator();
                        }
                    } else {
                        if (!stack2.isEmpty()) {
                            it = (Iterator) stack2.pop();
                        }
                        stack.pop();
                    }
                }
            }
        }

        public Builder add(AuroraTask auroraTask) {
            Object[] objArr = {auroraTask};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14d322337b8de1cc26b71b1efe5630c0", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14d322337b8de1cc26b71b1efe5630c0");
            }
            if (auroraTask.getPriority() > this.mPriority) {
                this.mPriority = auroraTask.getPriority();
            }
            if (this.mCurrentTaskShouldDependOnStartTask && this.mCurrentAddTask != null) {
                this.mStartTask.behind(this.mCurrentAddTask);
            }
            this.mCurrentAddTask = auroraTask;
            this.mCurrentTaskShouldDependOnStartTask = true;
            if (this.mCurrentAddTask.getBehindTasks().isEmpty()) {
                this.mCurrentAddTask.behind(this.mFinishTask);
            }
            return this;
        }

        public Builder dependOn(AuroraTask auroraTask) {
            Object[] objArr = {auroraTask};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c67868a3d795121900be4c36d0fb368", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c67868a3d795121900be4c36d0fb368");
            }
            auroraTask.behind(this.mCurrentAddTask);
            this.mFinishTask.removeDependence(auroraTask);
            this.mCurrentTaskShouldDependOnStartTask = false;
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CriticalTask extends AuroraUITask {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.aurora.IAuroraTask
        public void execute(Application application) {
        }

        @Override // com.meituan.android.aurora.AuroraTask
        public boolean isVirtualNode() {
            return true;
        }

        public CriticalTask(String str) {
            super(str);
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0423b705826afb7d42d9b9976e663b5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0423b705826afb7d42d9b9976e663b5f");
            }
        }
    }
}
