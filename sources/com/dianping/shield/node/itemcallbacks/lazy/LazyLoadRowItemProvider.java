package com.dianping.shield.node.itemcallbacks.lazy;

import com.dianping.shield.node.useritem.LayoutType;
import com.dianping.shield.node.useritem.RowItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/lazy/LazyLoadRowItemProvider;", "", "getRowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "getRowLayoutType", "Lcom/dianping/shield/node/useritem/LayoutType;", "getRowViewCount", "isPreLoad", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface LazyLoadRowItemProvider {
    @NotNull
    RowItem getRowItem(int i, int i2);

    @NotNull
    LayoutType getRowLayoutType(int i, int i2);

    int getRowViewCount(int i, int i2);

    boolean isPreLoad(int i, int i2);
}
