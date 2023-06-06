package com.dianping.shield.utils;

import com.dianping.agentsdk.framework.i;
import com.dianping.agentsdk.sectionrecycler.section.b;
import com.dianping.agentsdk.sectionrecycler.section.c;
import com.dianping.shield.entity.CellInfo;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.feature.HotZoneItemListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZoneItemEngine {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected i cell;
    protected HashMap<CellInfo, Integer> endCellMap;
    protected ArrayList<CellInfo> hotZoneCells;
    public HotZoneItemListener hotZoneItemListener;
    protected HotZoneYRange hotZoneYRange;
    protected b mergeRecyclerAdapter;
    protected c ownerAdapter;
    protected HashMap<CellInfo, Integer> startCellMap;
    protected ArrayList<CellInfo> targetCells;

    public HotZoneItemEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6ed9907dcdf39c9a70bda0753b9122d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6ed9907dcdf39c9a70bda0753b9122d");
            return;
        }
        this.hotZoneCells = new ArrayList<>();
        this.targetCells = new ArrayList<>();
        this.endCellMap = new HashMap<>();
        this.startCellMap = new HashMap<>();
    }

    public void setHotZoneItemListener(i iVar, HotZoneItemListener hotZoneItemListener, b bVar) {
        Object[] objArr = {iVar, hotZoneItemListener, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3030d9d11d661b83e83021f03fa8447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3030d9d11d661b83e83021f03fa8447");
            return;
        }
        this.cell = iVar;
        this.hotZoneItemListener = hotZoneItemListener;
        this.hotZoneYRange = hotZoneItemListener.defineHotZone();
        this.targetCells = hotZoneItemListener.targetCells();
        this.mergeRecyclerAdapter = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void scroll(com.dianping.shield.entity.ScrollDirection r13, android.support.v7.widget.RecyclerView r14, com.dianping.agentsdk.sectionrecycler.section.b r15) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.utils.HotZoneItemEngine.scroll(com.dianping.shield.entity.ScrollDirection, android.support.v7.widget.RecyclerView, com.dianping.agentsdk.sectionrecycler.section.b):void");
    }
}
