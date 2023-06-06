package com.dianping.shield.node.processor.impl.displaynode;

import android.os.Handler;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.ExposeMoveStatusEventInfoHolder;
import com.dianping.shield.node.processor.NodeExposeMoveStatusEventListener;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeExposeProcessor;", "Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeProcessor;", "infoHolder", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "(Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "handleViewItem", "", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DisplayNodeExposeProcessor extends DisplayNodeProcessor {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(DisplayNodeExposeProcessor.class), "handler", "getHandler()Landroid/os/Handler;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d handler$delegate;
    private final ExposeMoveStatusEventInfoHolder infoHolder;

    @NotNull
    public final Handler getHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Handler) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d60dac5e9c6cdb0f898c7a34dff51045", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d60dac5e9c6cdb0f898c7a34dff51045") : this.handler$delegate.a());
    }

    public DisplayNodeExposeProcessor(@NotNull ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder) {
        h.b(exposeMoveStatusEventInfoHolder, "infoHolder");
        Object[] objArr = {exposeMoveStatusEventInfoHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e08f562169c9a5fd69cf080db809ad13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e08f562169c9a5fd69cf080db809ad13");
            return;
        }
        this.infoHolder = exposeMoveStatusEventInfoHolder;
        this.handler$delegate = e.a(kotlin.i.NONE, DisplayNodeExposeProcessor$handler$2.INSTANCE);
    }

    @Override // com.dianping.shield.node.processor.impl.displaynode.DisplayNodeProcessor
    public final boolean handleViewItem(@NotNull ViewItem viewItem, @NotNull ShieldDisplayNode shieldDisplayNode) {
        ArrayList<ExposeInfo> exposeInfoArr;
        Object[] objArr = {viewItem, shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ed7ed802123652095897d263f310d0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ed7ed802123652095897d263f310d0c")).booleanValue();
        }
        h.b(viewItem, "viewItem");
        h.b(shieldDisplayNode, "dNode");
        ArrayList<MoveStatusEventListener<ShieldDisplayNode>> arrayList = shieldDisplayNode.moveStatusEventListenerList;
        if (arrayList != null) {
            arrayList.clear();
        } else {
            shieldDisplayNode.moveStatusEventListenerList = new ArrayList<>();
        }
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        if (shieldRow != null && (exposeInfoArr = shieldRow.getExposeInfoArr()) != null) {
            for (ExposeInfo exposeInfo : exposeInfoArr) {
                ArrayList<MoveStatusEventListener<ShieldDisplayNode>> arrayList2 = shieldDisplayNode.moveStatusEventListenerList;
                if (arrayList2 != null) {
                    arrayList2.add(new NodeExposeMoveStatusEventListener(this.infoHolder, exposeInfo, getHandler()));
                }
            }
        }
        return false;
    }
}
