package com.dianping.shield.node.itemcallbacks;

import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u000f\b\u0000\u0010\u0001 \u0001*\u00070\u0002¢\u0006\u0002\b\u00032\u00020\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/ViewRecycledCallback;", "T", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "Lkotlin/jvm/JvmWildcard;", "", "onViewRecycled", "", "viewHolder", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "(Lcom/dianping/shield/node/adapter/ShieldViewHolder;Lcom/dianping/shield/node/cellnode/NodePath;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ViewRecycledCallback<T extends ShieldViewHolder> {
    void onViewRecycled(@NotNull T t, @Nullable NodePath nodePath);
}
