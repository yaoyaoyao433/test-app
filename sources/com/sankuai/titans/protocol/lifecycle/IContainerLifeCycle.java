package com.sankuai.titans.protocol.lifecycle;

import com.sankuai.titans.protocol.context.ITitansContainerContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IContainerLifeCycle {
    void onContainerCreated(ITitansContainerContext iTitansContainerContext);

    void onContainerDestroy(ITitansContainerContext iTitansContainerContext);

    void onContainerPause(ITitansContainerContext iTitansContainerContext);

    void onContainerResume(ITitansContainerContext iTitansContainerContext);

    void onContainerStart(ITitansContainerContext iTitansContainerContext);

    void onContainerStop(ITitansContainerContext iTitansContainerContext);
}
