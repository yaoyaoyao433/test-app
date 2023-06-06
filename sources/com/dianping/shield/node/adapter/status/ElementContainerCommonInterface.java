package com.dianping.shield.node.adapter.status;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/adapter/status/ElementContainerCommonInterface;", "", "getContainerEdgeRect", "Landroid/graphics/Rect;", "getContainerSpanCount", "", "getElementChildCount", "getElementChildLayoutPosition", "child", "Landroid/view/View;", "getElementChildView", "position", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ElementContainerCommonInterface {
    @NotNull
    Rect getContainerEdgeRect();

    int getContainerSpanCount();

    int getElementChildCount();

    int getElementChildLayoutPosition(@NotNull View view);

    @NotNull
    View getElementChildView(int i);
}
