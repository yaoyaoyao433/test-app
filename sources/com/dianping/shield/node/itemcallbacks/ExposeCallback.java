package com.dianping.shield.node.itemcallbacks;

import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.cellnode.NodePath;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/ExposeCallback;", "", "onExpose", "", "data", "count", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "viewExtraInfo", "Lcom/dianping/shield/entity/ViewExtraInfo;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ExposeCallback {
    void onExpose(@Nullable Object obj, int i, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo);
}
