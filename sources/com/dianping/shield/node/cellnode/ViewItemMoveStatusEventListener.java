package com.dianping.shield.node.cellnode;

import android.os.Handler;
import com.dianping.shield.expose.MoveStatusExposeEngine;
import com.dianping.shield.node.processor.ExposeMoveStatusEventInfoHolder;
import com.dianping.shield.node.processor.ExposeMoveStatusEventListener;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/node/cellnode/ViewItemMoveStatusEventListener;", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventListener;", "Lcom/dianping/shield/node/useritem/ViewItem;", "infoHolder", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "exposeInfo", "Lcom/dianping/shield/node/useritem/ExposeInfo;", "handler", "Landroid/os/Handler;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "(Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;Lcom/dianping/shield/node/useritem/ExposeInfo;Landroid/os/Handler;Lcom/dianping/shield/node/cellnode/ShieldRow;)V", "getShieldRow", "()Lcom/dianping/shield/node/cellnode/ShieldRow;", "setShieldRow", "(Lcom/dianping/shield/node/cellnode/ShieldRow;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ViewItemMoveStatusEventListener extends ExposeMoveStatusEventListener<ViewItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ExposeInfo exposeInfo;
    private final Handler handler;
    private final ExposeMoveStatusEventInfoHolder infoHolder;
    @Nullable
    private ShieldRow shieldRow;

    @Nullable
    public final ShieldRow getShieldRow() {
        return this.shieldRow;
    }

    public final void setShieldRow(@Nullable ShieldRow shieldRow) {
        this.shieldRow = shieldRow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewItemMoveStatusEventListener(@NotNull ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder, @NotNull ExposeInfo exposeInfo, @NotNull Handler handler, @Nullable ShieldRow shieldRow) {
        super(exposeMoveStatusEventInfoHolder, exposeInfo, handler);
        h.b(exposeMoveStatusEventInfoHolder, "infoHolder");
        h.b(exposeInfo, "exposeInfo");
        h.b(handler, "handler");
        Object[] objArr = {exposeMoveStatusEventInfoHolder, exposeInfo, handler, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c96c2379174a07fd545a2035001821", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c96c2379174a07fd545a2035001821");
            return;
        }
        this.infoHolder = exposeMoveStatusEventInfoHolder;
        this.exposeInfo = exposeInfo;
        this.handler = handler;
        this.shieldRow = shieldRow;
        setMoveStatusExposeEngine(new MoveStatusExposeEngine<ViewItem>(this.infoHolder, this.handler, this.exposeInfo) { // from class: com.dianping.shield.node.cellnode.ViewItemMoveStatusEventListener.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.expose.MoveStatusExposeEngine
            @Nullable
            public final NodePath getPath(@Nullable ViewItem viewItem) {
                Object[] objArr2 = {viewItem};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "718d7332cfc319b2419d0f0fd23869b3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (NodePath) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "718d7332cfc319b2419d0f0fd23869b3");
                }
                if (viewItem != null) {
                    return viewItem.getNodePath(ViewItemMoveStatusEventListener.this.getShieldRow());
                }
                return null;
            }
        });
    }
}
