package com.dianping.shield.node.cellnode;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0014\u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/node/cellnode/AppearanceDispatchData;", "T", "", "pos", "", "element", "oldStatus", "Lcom/dianping/shield/node/cellnode/AttachStatus;", "newStatus", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "viewExtraInfo", "Lcom/dianping/shield/entity/ViewExtraInfo;", "(ILjava/lang/Object;Lcom/dianping/shield/node/cellnode/AttachStatus;Lcom/dianping/shield/node/cellnode/AttachStatus;Lcom/dianping/shield/entity/ScrollDirection;Lcom/dianping/shield/entity/ViewExtraInfo;)V", "Ljava/lang/Object;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AppearanceDispatchData<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public T element;
    @JvmField
    @NotNull
    public AttachStatus newStatus;
    @JvmField
    @NotNull
    public AttachStatus oldStatus;
    @JvmField
    public int pos;
    @JvmField
    @NotNull
    public ScrollDirection scrollDirection;
    @JvmField
    @Nullable
    public ViewExtraInfo viewExtraInfo;

    public AppearanceDispatchData(int i, T t, @NotNull AttachStatus attachStatus, @NotNull AttachStatus attachStatus2, @NotNull ScrollDirection scrollDirection, @Nullable ViewExtraInfo viewExtraInfo) {
        h.b(attachStatus, "oldStatus");
        h.b(attachStatus2, "newStatus");
        h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
        this.pos = i;
        this.element = t;
        this.oldStatus = attachStatus;
        this.newStatus = attachStatus2;
        this.scrollDirection = scrollDirection;
        this.viewExtraInfo = viewExtraInfo;
    }
}
