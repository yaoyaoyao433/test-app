package com.dianping.shield.manager.feature;

import com.dianping.agentsdk.framework.ar;
import com.dianping.shield.entity.SectionTitleInfo;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0010\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RH\u0010\u0007\u001a6\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\f0\bj\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\f`\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/manager/feature/SectionTitleArrayCollector;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "whiteBoard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "looper", "Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "(Lcom/dianping/agentsdk/framework/WhiteBoard;Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;)V", "sectionTitleMap", "Ljava/util/HashMap;", "Lkotlin/Pair;", "", "", "Lcom/dianping/shield/entity/SectionTitleInfo;", "Lkotlin/collections/HashMap;", "getSectionTitleMap", "()Ljava/util/HashMap;", "onAdapterNotify", "", "cellGroups", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "Lkotlin/collections/ArrayList;", "onCellNodeRefresh", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionTitleArrayCollector implements CellManagerFeatureInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoopCellGroupsCollector looper;
    @NotNull
    private final HashMap<k<String, Integer>, SectionTitleInfo> sectionTitleMap;
    private final ar whiteBoard;

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ff5c8f276f0a972c29e33ec1d31a1ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ff5c8f276f0a972c29e33ec1d31a1ae");
        } else {
            h.b(shieldViewCell, "shieldViewCell");
        }
    }

    public SectionTitleArrayCollector(@Nullable ar arVar, @NotNull LoopCellGroupsCollector loopCellGroupsCollector) {
        h.b(loopCellGroupsCollector, "looper");
        Object[] objArr = {arVar, loopCellGroupsCollector};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "570f03d750635097b1ac71bfeb5990ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "570f03d750635097b1ac71bfeb5990ba");
            return;
        }
        this.whiteBoard = arVar;
        this.looper = loopCellGroupsCollector;
        this.sectionTitleMap = new HashMap<>();
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ec67815063f1379e1c11f23987c189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ec67815063f1379e1c11f23987c189");
            return;
        }
        h.b(arrayList, "cellGroups");
        this.looper.addBeforeLoopAction(new SectionTitleArrayCollector$onAdapterNotify$1(this));
        this.looper.addIndexedSectionAction(new SectionTitleArrayCollector$onAdapterNotify$2(this));
        this.looper.addAfterLoopAction(new SectionTitleArrayCollector$onAdapterNotify$3(this));
    }

    @NotNull
    public final HashMap<k<String, Integer>, SectionTitleInfo> getSectionTitleMap() {
        return this.sectionTitleMap;
    }
}
