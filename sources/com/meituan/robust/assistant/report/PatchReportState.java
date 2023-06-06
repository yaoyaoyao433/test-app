package com.meituan.robust.assistant.report;

import android.util.SparseArray;
import com.meituan.robust.Patch;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchReportState {
    private SparseArray<Set<Patch>> reportedPatches = new SparseArray<>();

    public PatchReportState() {
        this.reportedPatches.put(3, new HashSet());
        this.reportedPatches.put(4, new HashSet());
        this.reportedPatches.put(5, new HashSet());
        this.reportedPatches.put(6, new HashSet());
    }

    public boolean hasReported(Patch patch, int i) {
        Set<Patch> set = this.reportedPatches.get(i);
        return set != null && set.contains(patch);
    }

    public void addReport(Patch patch, int i) {
        Set<Patch> set = this.reportedPatches.get(i);
        if (set == null || set.contains(patch)) {
            return;
        }
        set.add(patch);
    }
}
