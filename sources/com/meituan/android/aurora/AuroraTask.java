package com.meituan.android.aurora;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AuroraTask implements IAuroraTask, Comparable<AuroraTask>, Runnable {
    private static final int DEFAULT_ANCHORS_PRIORITY = 1;
    private static final int DEFAULT_PRIORITY = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<AuroraTask> behindTasks;
    private final Set<AuroraTask> dependTasks;
    private long mExecuteTime;
    private final String mId;
    private int mPriority;
    private int mState;
    private int opportunity;
    private String opportunityName;
    private int section;
    private long taskCostTime;
    private long taskOffsetTime;
    private long threadCostTime;
    private String threadName;

    public boolean isVirtualNode() {
        return false;
    }

    public AuroraPageInfo pageInfo() {
        return null;
    }

    public AuroraTask(String str) {
        this(str, 0);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edb9afe9b5f4002f078adef8ce345577", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edb9afe9b5f4002f078adef8ce345577");
        }
    }

    public AuroraTask(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eb8fb898880411686e1dfc4b8cc67c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eb8fb898880411686e1dfc4b8cc67c7");
            return;
        }
        this.mState = 0;
        this.opportunityName = null;
        this.behindTasks = new ArrayList();
        this.dependTasks = Collections.synchronizedSet(new HashSet());
        this.mId = str;
        if (isAnchors() && i <= 0) {
            this.mPriority = 1;
        } else {
            this.mPriority = i;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("task's mId can't be empty");
        }
    }

    public long getExecuteTime() {
        return this.mExecuteTime;
    }

    public void setExecuteTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3050d85671d668eb44c3ca80d7b0c3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3050d85671d668eb44c3ca80d7b0c3d2");
        } else {
            this.mExecuteTime = j;
        }
    }

    public String getId() {
        return this.mId;
    }

    public void setPriority(int i) {
        this.mPriority = i;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int getState() {
        return this.mState;
    }

    public void setState(int i) {
        this.mState = i;
    }

    public long getTaskCostTime() {
        return this.taskCostTime;
    }

    public long getTaskOffsetTime() {
        return this.taskOffsetTime;
    }

    public long getThreadCostTime() {
        return this.threadCostTime;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public void setOpportunity(int i) {
        this.opportunity = i;
    }

    public int getOpportunity() {
        return this.opportunity;
    }

    public void setOpportunityName(String str) {
        this.opportunityName = str;
    }

    public String getOpportunityName() {
        return this.opportunityName;
    }

    public int getSection() {
        return this.section;
    }

    public synchronized void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfdcc750fd5f83e9d4b4ba5de6206262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfdcc750fd5f83e9d4b4ba5de6206262");
        } else if (this.mState != 0) {
        } else {
            toStart();
            setExecuteTime(System.currentTimeMillis());
            AuroraAnchorsRuntime.executeTask(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (isVirtualNode() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (isVirtualNode() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
        com.meituan.android.aurora.AuroraReporter.collectTaskData(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
        toFinish(false);
        notifyBehindTasks();
        recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (com.meituan.android.aurora.AuroraAnchorsRuntime.debuggable() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
        if (android.os.Build.VERSION.SDK_INT < 18) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
        if (com.meituan.android.aurora.AuroraUtils.isMainThread() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r3 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
        r3 = "Aurora##";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
        r0.setName(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ff, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.aurora.AuroraTask.run():void");
    }

    private void toStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8281d3b618fcd478aed1bb0a0416fa74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8281d3b618fcd478aed1bb0a0416fa74");
            return;
        }
        setState(1);
        if (AuroraAnchorsRuntime.debuggable()) {
            if (!isVirtualNode()) {
                PrintStream printStream = System.out;
                printStream.println("AuroraLogger>>>" + ("**** [Start ] taskName = " + getId() + ", startupSection = " + Aurora.getStartupSection()));
            } else if (this.behindTasks.isEmpty()) {
                System.out.println("AuroraLogger>>>Task Project Finished.");
            }
        }
    }

    private void toRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c242c8c9527386e9941154da6dc3585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c242c8c9527386e9941154da6dc3585");
        } else {
            setState(2);
        }
    }

    private void toFinish(boolean z) {
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bab20dac0c9a1e688dcf56f61fea386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bab20dac0c9a1e688dcf56f61fea386");
            return;
        }
        setState(3);
        if (isAnchors()) {
            AuroraAnchorsRuntime.removeAnchorTask(this);
        }
        if (!AuroraAnchorsRuntime.debuggable() || isVirtualNode()) {
            return;
        }
        if (z) {
            str = "---- [Skipped] taskName = " + getId();
        } else {
            str = "---- [Finish] taskName = " + getId() + ", costTime = " + getTaskCostTime() + ", offset = " + getTaskOffsetTime() + ", threadName = " + getThreadName() + ", startupSection = " + Aurora.getStartupSection();
        }
        System.out.println("AuroraLogger>>>" + str);
    }

    public List<AuroraTask> getBehindTasks() {
        return this.behindTasks;
    }

    public void behind(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7df8f841c370ffe366fc01fd3946e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7df8f841c370ffe366fc01fd3946e87");
        } else if (auroraTask == null || auroraTask == this) {
        } else {
            if (auroraTask instanceof AuroraProject) {
                auroraTask = ((AuroraProject) auroraTask).getStartTask();
            }
            this.behindTasks.add(auroraTask);
            auroraTask.dependOn(this);
        }
    }

    public void removeBehind(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f66d23b4aa322dada31afff174618e56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f66d23b4aa322dada31afff174618e56");
        } else if (auroraTask == null || auroraTask == this) {
        } else {
            if (auroraTask instanceof AuroraProject) {
                auroraTask = ((AuroraProject) auroraTask).getStartTask();
            }
            this.behindTasks.remove(auroraTask);
            auroraTask.removeDependence(this);
        }
    }

    public void dependOn(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3325734294e2c63641bcda61b61e37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3325734294e2c63641bcda61b61e37");
        } else if (auroraTask == null || auroraTask == this) {
        } else {
            if (auroraTask instanceof AuroraProject) {
                auroraTask = ((AuroraProject) auroraTask).getEndTask();
            }
            this.dependTasks.add(auroraTask);
            if (auroraTask.behindTasks.contains(this)) {
                return;
            }
            auroraTask.behindTasks.add(this);
        }
    }

    public void removeDependence(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c78a0186b39cf5ddedb7e6033e411c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c78a0186b39cf5ddedb7e6033e411c9");
        } else if (auroraTask == null || auroraTask == this) {
        } else {
            if (auroraTask instanceof AuroraProject) {
                auroraTask = ((AuroraProject) auroraTask).getEndTask();
            }
            this.dependTasks.remove(auroraTask);
            auroraTask.behindTasks.remove(this);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3605353d2008e2e1c53b12e4a3a8442", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3605353d2008e2e1c53b12e4a3a8442")).intValue() : AuroraUtils.compareTask(this, auroraTask);
    }

    private void notifyBehindTasks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83b9cf774d9f9a64e48db77ccda9ea45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83b9cf774d9f9a64e48db77ccda9ea45");
        } else if (!this.behindTasks.isEmpty()) {
            if (this.behindTasks.size() > 1) {
                Collections.sort(this.behindTasks, AuroraAnchorsRuntime.getTaskComparator());
            }
            for (AuroraTask auroraTask : this.behindTasks) {
                auroraTask.dependTaskFinish(this);
            }
        }
    }

    public Set<AuroraTask> getDependTasks() {
        return this.dependTasks;
    }

    private void dependTaskFinish(AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94dd98b528f270c0ee7dd2eb59511577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94dd98b528f270c0ee7dd2eb59511577");
        } else if (this.dependTasks.isEmpty()) {
        } else {
            this.dependTasks.remove(auroraTask);
            if (this.dependTasks.isEmpty()) {
                start();
            }
        }
    }

    public void recycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a4584b394904a6b5ba84942be71ad27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a4584b394904a6b5ba84942be71ad27");
            return;
        }
        this.dependTasks.clear();
        this.behindTasks.clear();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9d2538375c85aeabfbdd5d9c8c81e29", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9d2538375c85aeabfbdd5d9c8c81e29");
        }
        return "taskName =" + this.mId;
    }
}
