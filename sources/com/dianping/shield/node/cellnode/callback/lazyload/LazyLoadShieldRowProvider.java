package com.dianping.shield.node.cellnode.callback.lazyload;

import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadShieldRowProvider;", "", "getRowNodeCount", "", "row", "sectionParent", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "getShieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "isPreLoad", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface LazyLoadShieldRowProvider {
    int getRowNodeCount(int i, @NotNull ShieldSection shieldSection);

    @NotNull
    ShieldRow getShieldRow(int i, @NotNull ShieldSection shieldSection);

    boolean isPreLoad(int i, @NotNull ShieldSection shieldSection);
}
