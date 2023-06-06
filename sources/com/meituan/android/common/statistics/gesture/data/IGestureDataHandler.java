package com.meituan.android.common.statistics.gesture.data;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IGestureDataHandler {
    void clean();

    List<GestureEntity> getGesture();

    void saveGesture(GestureEntity gestureEntity);
}
