package com.dianping.shield.component.interfaces;

import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/component/interfaces/OnDragStatusListener;", "", "onBeginDrag", "", "recyclerView", "Lcom/dianping/shield/component/widgets/PageContainerRecyclerView;", "onEndDrag", "xVelocity", "", "yVelocity", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface OnDragStatusListener {
    void onBeginDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView);

    void onEndDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView, float f, float f2);
}
