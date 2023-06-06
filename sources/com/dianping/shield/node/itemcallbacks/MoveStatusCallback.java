package com.dianping.shield.node.itemcallbacks;

import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.cellnode.NodePath;
import com.tencent.connect.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J6\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/MoveStatusCallback;", "", "onAppear", "", Constants.PARAM_SCOPE, "Lcom/dianping/shield/entity/ExposeScope;", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "data", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "viewExtraInfo", "Lcom/dianping/shield/entity/ViewExtraInfo;", "onDisappear", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface MoveStatusCallback {
    void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo);

    void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo);
}
