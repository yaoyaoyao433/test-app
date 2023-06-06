package com.dianping.shield.node.processor;

import android.os.Handler;
import com.dianping.shield.expose.MoveStatusExposeEngine;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/dianping/shield/node/processor/NodeExposeMoveStatusEventListener;", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventListener;", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "infoHolder", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "exposeInfo", "Lcom/dianping/shield/node/useritem/ExposeInfo;", "handler", "Landroid/os/Handler;", "(Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;Lcom/dianping/shield/node/useritem/ExposeInfo;Landroid/os/Handler;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NodeExposeMoveStatusEventListener extends ExposeMoveStatusEventListener<ShieldDisplayNode> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ExposeInfo exposeInfo;
    private final Handler handler;
    private final ExposeMoveStatusEventInfoHolder infoHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeExposeMoveStatusEventListener(@NotNull ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder, @NotNull ExposeInfo exposeInfo, @NotNull Handler handler) {
        super(exposeMoveStatusEventInfoHolder, exposeInfo, handler);
        h.b(exposeMoveStatusEventInfoHolder, "infoHolder");
        h.b(exposeInfo, "exposeInfo");
        h.b(handler, "handler");
        this.infoHolder = exposeMoveStatusEventInfoHolder;
        this.exposeInfo = exposeInfo;
        this.handler = handler;
        setMoveStatusExposeEngine(new MoveStatusExposeEngine<ShieldDisplayNode>(this.infoHolder, this.handler, this.exposeInfo) { // from class: com.dianping.shield.node.processor.NodeExposeMoveStatusEventListener.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.expose.MoveStatusExposeEngine
            @Nullable
            public final NodePath getPath(@Nullable ShieldDisplayNode shieldDisplayNode) {
                Object[] objArr = {shieldDisplayNode};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b6c79ad3b76423a6173ef67bf739d76", RobustBitConfig.DEFAULT_VALUE)) {
                    return (NodePath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b6c79ad3b76423a6173ef67bf739d76");
                }
                if (shieldDisplayNode != null) {
                    return shieldDisplayNode.getPath();
                }
                return null;
            }
        });
    }
}
