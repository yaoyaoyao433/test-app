package com.dianping.shield.node.itemcallbacks;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AttachStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/ViewStatusWithPrefetchListener;", "", "onStatusChanged", "", "status", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "data", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ViewStatusWithPrefetchListener {
    void onStatusChanged(@NotNull AttachStatus attachStatus, @NotNull ScrollDirection scrollDirection, @Nullable Object obj);
}
