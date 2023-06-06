package com.meituan.android.common.aidata.data;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class SeqBackData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean collect_id_filter;
    @NonNull
    private List<SeqInfo> data;
    public int index;
    public String partition_date;
    public boolean report_id_filter;
    public long tm_end;
    public long tm_start;
    public int total;
    public String trace_id;

    public SeqBackData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5232a0e51173466326b5c0833b1ea475", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5232a0e51173466326b5c0833b1ea475");
        } else {
            this.data = new ArrayList();
        }
    }

    public void addSeqInfoList(@Nullable List<SeqInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "058c9eae124728a8b02aabad568667b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "058c9eae124728a8b02aabad568667b6");
        } else if (list == null || list.isEmpty()) {
        } else {
            this.data.addAll(list);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class SeqInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NonNull
        private List<List<Integer>> gaps;
        public int max;
        public int min;
        public String msid;
        public String req_id;

        public SeqInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d21b8040cac8c874354e59716ecefaed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d21b8040cac8c874354e59716ecefaed");
            } else {
                this.gaps = new ArrayList();
            }
        }

        public void addGap(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b70d1712d1059c0f562caa08200a674", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b70d1712d1059c0f562caa08200a674");
            } else {
                this.gaps.add(Arrays.asList(Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        public int getGapCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb84d084a956d3a674033613f485a77a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb84d084a956d3a674033613f485a77a")).intValue() : this.gaps.size();
        }
    }
}
