package com.dianping.shield.entity;

import com.dianping.shield.feature.CellMoveStatusInterface;
import com.dianping.shield.feature.ExtraCellMoveStatusInterface;
import com.dianping.shield.feature.MoveStatusInterface;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MoveStatusAction {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CellMoveStatusInterface cellMoveStatusInterface;
    public CellType cellType;
    public ScrollDirection direction;
    public ExtraCellMoveStatusInterface extraCellMoveStatusInterface;
    public boolean isAppear;
    public boolean isSCI;
    public MoveStatusInterface moveStatusInterface;
    public int row;
    public ExposeScope scope;
    public int section;

    public MoveStatusAction(ExposeScope exposeScope, ScrollDirection scrollDirection, int i, int i2, CellType cellType, boolean z, boolean z2) {
        this.scope = exposeScope;
        this.direction = scrollDirection;
        this.section = i;
        this.row = i2;
        this.cellType = cellType;
        this.isAppear = z;
        this.isSCI = z2;
    }
}
