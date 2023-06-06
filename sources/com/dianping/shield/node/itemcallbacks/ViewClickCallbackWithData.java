package com.dianping.shield.node.itemcallbacks;

import android.view.View;
import com.dianping.shield.node.cellnode.NodePath;
import com.meituan.android.common.statistics.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "", "onViewClicked", "", Constants.EventType.VIEW, "Landroid/view/View;", "data", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ViewClickCallbackWithData {
    void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath);
}
