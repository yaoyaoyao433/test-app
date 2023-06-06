package com.dianping.shield.dynamic.diff.view;

import com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/ScrollCellAttachViewDiff;", "Lcom/dianping/shield/dynamic/diff/view/ViewInfoDiff;", "Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", "Lcom/dianping/shield/node/useritem/ViewItem;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollCellAttachViewDiff extends ViewInfoDiff<ScrollCellAttachViewInfo, ViewItem> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollCellAttachViewDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
    }
}
