package com.dianping.shield.feature;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.ExposeScope;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ExtraCellExposedInterface {
    long extraCellExposeDuration(int i, CellType cellType);

    long extraCellStayDuration(int i, CellType cellType);

    ExposeScope getExtraCellExposeScope(int i, CellType cellType);

    int maxExtraExposeCount(int i, CellType cellType);

    void onExtraCellExposed(int i, CellType cellType, int i2);
}
