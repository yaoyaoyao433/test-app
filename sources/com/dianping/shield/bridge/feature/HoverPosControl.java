package com.dianping.shield.bridge.feature;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J!\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/bridge/feature/HoverPosControl;", "", "addHoverPosControlObserver", "", "hoverPosControlObserver", "Lcom/dianping/shield/bridge/feature/HoverPosControlObserver;", "notifyHoverPosControlData", "bottomTranslateY", "", "topTranslateY", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "removeHoverPosControlObserver", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface HoverPosControl {
    void addHoverPosControlObserver(@NotNull HoverPosControlObserver hoverPosControlObserver);

    void notifyHoverPosControlData(@Nullable Integer num, @Nullable Integer num2);

    void removeHoverPosControlObserver(@NotNull HoverPosControlObserver hoverPosControlObserver);
}
