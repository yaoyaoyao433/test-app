package com.dianping.shield.node.cellnode.callback.lazyload;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadDisplayNodeProvider;", "", "getShieldDisplayNodeAtPosition", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "viewPosition", "", "rowParent", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface LazyLoadDisplayNodeProvider {
    @NotNull
    ShieldDisplayNode getShieldDisplayNodeAtPosition(int i, @NotNull ShieldRow shieldRow);
}
