package com.dianping.shield.entity;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AdapterExposedList {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<Pair<Integer, Integer>> completeExposedList;
    public ArrayList<Pair<Integer, Integer>> partExposedList;

    public AdapterExposedList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e55e54177cbcf1187a54b808005ca05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e55e54177cbcf1187a54b808005ca05");
            return;
        }
        this.completeExposedList = new ArrayList<>();
        this.partExposedList = new ArrayList<>();
    }

    public void addToList(ExposedDetails exposedDetails) {
        Object[] objArr = {exposedDetails};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef4721a0a9785c39648459712ca8fb3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef4721a0a9785c39648459712ca8fb3c");
        } else if (exposedDetails.isComplete) {
            this.completeExposedList.add(new Pair<>(Integer.valueOf(exposedDetails.section), Integer.valueOf(exposedDetails.row)));
        } else {
            this.partExposedList.add(new Pair<>(Integer.valueOf(exposedDetails.section), Integer.valueOf(exposedDetails.row)));
        }
    }
}
