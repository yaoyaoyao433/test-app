package com.dianping.shield.node.itemcallbacks;

import com.dianping.agentsdk.framework.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/LayoutParamCalAndContentYCallback;", "", "addContentScrollOffsetListener", "", "contentOffsetListener", "Lcom/dianping/shield/node/itemcallbacks/ContentOffsetListener;", "addLayoutParamCalFinishCallBack", "anchorViewLayoutParamInfo", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo;", "removeContentScrollOffsetListener", "removeLayoutParamCalFinishCallBack", "layoutParamCalFinishListener", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo$LayoutParamCalFinishListener;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface LayoutParamCalAndContentYCallback {
    void addContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener);

    void addLayoutParamCalFinishCallBack(@NotNull e eVar);

    void removeContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener);

    void removeLayoutParamCalFinishCallBack(@NotNull e.a aVar);
}
