package com.dianping.shield.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/lifecycle/PageLifecycleDispatcher;", "", "dispatchPageAppear", "", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "dispatchPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "getPageLifecycleObserver", "Lcom/dianping/shield/lifecycle/PageLifecycleObserver;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface PageLifecycleDispatcher {
    void dispatchPageAppear(@NotNull PageAppearType pageAppearType);

    void dispatchPageDisappear(@NotNull PageDisappearType pageDisappearType);

    @NotNull
    PageLifecycleObserver getPageLifecycleObserver();
}
