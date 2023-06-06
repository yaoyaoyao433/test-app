package com.dianping.shield.node.cellnode;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface MoveStatusEventListener<T> {
    void onAppeared(AppearanceEvent appearanceEvent, AppearanceDispatchData<T> appearanceDispatchData);

    void onDisappeared(AppearanceEvent appearanceEvent, AppearanceDispatchData<T> appearanceDispatchData);

    void reset(T t);
}
