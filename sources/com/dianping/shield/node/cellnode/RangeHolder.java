package com.dianping.shield.node.cellnode;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/node/cellnode/RangeHolder;", "", "getOldRange", "", "getRange", "registerObserver", "", "observer", "Lcom/dianping/shield/node/cellnode/RangeChangeObserver;", "unregisterObserver", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface RangeHolder {
    int getOldRange();

    int getRange();

    void registerObserver(@NotNull RangeChangeObserver rangeChangeObserver);

    void unregisterObserver(@NotNull RangeChangeObserver rangeChangeObserver);
}
