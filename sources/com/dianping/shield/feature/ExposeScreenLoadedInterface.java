package com.dianping.shield.feature;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.CellType;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ExposeScreenLoadedInterface {
    void finishExpose();

    void pauseExpose();

    void resetExposeExtraCell(af afVar, int i, CellType cellType);

    void resetExposeRow(af afVar, int i, int i2);

    void resetExposeSCI(af afVar);

    void resumeExpose();

    void startExpose();

    void startExpose(long j);
}
