package com.dianping.shield.node.itemcallbacks;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ+\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/itemcallbacks/HotZoneStateChangeCallBack;", "", "scrollOut", "", "sectionPosition", "", "rowPosition", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/dianping/shield/entity/ScrollDirection;)V", "scrollReach", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface HotZoneStateChangeCallBack {
    void scrollOut(@Nullable Integer num, @Nullable Integer num2, @Nullable ScrollDirection scrollDirection);

    void scrollReach(@Nullable Integer num, @Nullable Integer num2, @Nullable ScrollDirection scrollDirection);
}
