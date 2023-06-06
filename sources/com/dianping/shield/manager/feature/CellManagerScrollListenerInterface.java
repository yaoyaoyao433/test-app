package com.dianping.shield.manager.feature;

import android.support.v7.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/manager/feature/CellManagerScrollListenerInterface;", "", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface CellManagerScrollListenerInterface {
    void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i);

    void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2);
}
