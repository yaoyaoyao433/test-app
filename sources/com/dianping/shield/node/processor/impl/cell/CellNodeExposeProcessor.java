package com.dianping.shield.node.processor.impl.cell;

import android.os.Handler;
import com.dianping.agentsdk.framework.f;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.processor.ExposeMoveStatusEventInfoHolder;
import com.dianping.shield.node.processor.ExposeMoveStatusEventListener;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/CellNodeExposeProcessor;", "Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "infoHolder", "Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;", "(Lcom/dianping/shield/node/processor/ExposeMoveStatusEventInfoHolder;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "handleShieldViewCell", "", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellNodeExposeProcessor extends CellNodeProcessor {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(CellNodeExposeProcessor.class), "handler", "getHandler()Landroid/os/Handler;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d handler$delegate;
    private final ExposeMoveStatusEventInfoHolder infoHolder;

    @NotNull
    public final Handler getHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Handler) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0045836f28ef867ba366b13667c24f33", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0045836f28ef867ba366b13667c24f33") : this.handler$delegate.a());
    }

    public CellNodeExposeProcessor(@NotNull ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder) {
        h.b(exposeMoveStatusEventInfoHolder, "infoHolder");
        Object[] objArr = {exposeMoveStatusEventInfoHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1837543e9df812b1038c3a9dcefee23c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1837543e9df812b1038c3a9dcefee23c");
            return;
        }
        this.infoHolder = exposeMoveStatusEventInfoHolder;
        this.handler$delegate = e.a(kotlin.i.NONE, CellNodeExposeProcessor$handler$2.INSTANCE);
    }

    @Override // com.dianping.shield.node.processor.impl.cell.CellNodeProcessor
    public final boolean handleShieldViewCell(@NotNull ShieldSectionCellItem shieldSectionCellItem, @NotNull ShieldViewCell shieldViewCell, @NotNull ArrayList<ShieldSection> arrayList) {
        Object[] objArr = {shieldSectionCellItem, shieldViewCell, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dca7c91581d188bc88cee921674b29c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dca7c91581d188bc88cee921674b29c5")).booleanValue();
        }
        h.b(shieldSectionCellItem, "cellItem");
        h.b(shieldViewCell, "shieldViewCell");
        h.b(arrayList, "addList");
        if (shieldViewCell.moveStatusEventListenerList == null) {
            shieldViewCell.moveStatusEventListenerList = new ArrayList<>();
        }
        ArrayList<ExposeInfo> arrayList2 = shieldSectionCellItem.exposeInfo;
        if (arrayList2 != null) {
            for (ExposeInfo exposeInfo : arrayList2) {
                ArrayList<MoveStatusEventListener<ShieldViewCell>> arrayList3 = shieldViewCell.moveStatusEventListenerList;
                if (arrayList3 != null) {
                    ExposeMoveStatusEventInfoHolder exposeMoveStatusEventInfoHolder = this.infoHolder;
                    h.a((Object) exposeInfo, "exposeInfo");
                    arrayList3.add(new ExposeMoveStatusEventListener(exposeMoveStatusEventInfoHolder, exposeInfo, getHandler()));
                }
            }
        }
        ArrayList<MoveStatusEventListener<ShieldViewCell>> arrayList4 = shieldViewCell.moveStatusEventListenerList;
        if (arrayList4 != null) {
            arrayList4.add(new ExposeMoveStatusEventListener(this.infoHolder, shieldViewCell.getDefaultExposeInfo$shieldCore_release(), getHandler()));
        }
        f.a aVar = shieldSectionCellItem.exposeComputeMode;
        if (aVar == null) {
            aVar = this.infoHolder.getPageExposeComputeMode();
        }
        shieldViewCell.exposeComputeMode = aVar;
        return false;
    }
}
