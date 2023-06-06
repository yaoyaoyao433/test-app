package com.dianping.shield.node.cellnode;

import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.utils.ObservableArrayList;
import com.dianping.shield.utils.ObservableList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J8\u0010\f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u0016J&\u0010\u0010\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J.\u0010\u0011\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J8\u0010\u0014\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u0016J@\u0010\u0015\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u0016¨\u0006\u0018"}, d2 = {"Lcom/dianping/shield/node/cellnode/SectionPositionTypeAdjuster;", "Lcom/dianping/shield/utils/ObservableList$OnListChangedCallback;", "Lcom/dianping/shield/utils/ObservableArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "()V", "adjustListAndNeighbor", "", "sender", "positionStart", "", "itemCount", "onChanged", "onItemRangeChanged", "oldItems", "", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "onItemRangeReplaced", "newItemCount", "oldItemCount", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionPositionTypeAdjuster extends ObservableList.OnListChangedCallback<ObservableArrayList<ShieldSection>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
    public final void onChanged(@NotNull ObservableArrayList<ShieldSection> observableArrayList) {
        Object[] objArr = {observableArrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "824b522b6c2cdaf5e41eb7429ea9c25f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "824b522b6c2cdaf5e41eb7429ea9c25f");
        } else {
            h.b(observableArrayList, "sender");
        }
    }

    @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
    public final void onItemRangeMoved(@NotNull ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, int i3) {
        Object[] objArr = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7116c2992ed465dd3b25e9bdcc56bb93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7116c2992ed465dd3b25e9bdcc56bb93");
        } else {
            h.b(observableArrayList, "sender");
        }
    }

    @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
    public final /* bridge */ /* synthetic */ void onItemRangeChanged(ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, List list) {
        onItemRangeChanged2(observableArrayList, i, i2, (List<Object>) list);
    }

    @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
    public final /* bridge */ /* synthetic */ void onItemRangeRemoved(ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, List list) {
        onItemRangeRemoved2(observableArrayList, i, i2, (List<Object>) list);
    }

    @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
    public final /* bridge */ /* synthetic */ void onItemRangeReplaced(ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, int i3, List list) {
        onItemRangeReplaced2(observableArrayList, i, i2, i3, (List<Object>) list);
    }

    /* renamed from: onItemRangeChanged  reason: avoid collision after fix types in other method */
    public final void onItemRangeChanged2(@NotNull ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, @Nullable List<Object> list) {
        Object[] objArr = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df0da286baa15050f62ccb3d61efada0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df0da286baa15050f62ccb3d61efada0");
            return;
        }
        h.b(observableArrayList, "sender");
        adjustListAndNeighbor(observableArrayList, i, i2);
    }

    @Override // com.dianping.shield.utils.ObservableList.OnListChangedCallback
    public final void onItemRangeInserted(@NotNull ObservableArrayList<ShieldSection> observableArrayList, int i, int i2) {
        Object[] objArr = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fda80a9038a4de22e76adf710a9443b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fda80a9038a4de22e76adf710a9443b");
            return;
        }
        h.b(observableArrayList, "sender");
        adjustListAndNeighbor(observableArrayList, i, i2);
    }

    /* renamed from: onItemRangeRemoved  reason: avoid collision after fix types in other method */
    public final void onItemRangeRemoved2(@NotNull ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, @Nullable List<Object> list) {
        Object[] objArr = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfe4740049acd05f9583c7b600439264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfe4740049acd05f9583c7b600439264");
            return;
        }
        h.b(observableArrayList, "sender");
        ShieldSection shieldSection = i > 0 ? (ShieldSection) observableArrayList.get(i - 1) : null;
        if (i < observableArrayList.size()) {
            ShieldSection shieldSection2 = (ShieldSection) observableArrayList.get(i);
            NodeCreator.Companion companion = NodeCreator.Companion;
            h.a((Object) shieldSection2, "nextSection");
            companion.adjustSectionLinkType(shieldSection, shieldSection2);
        }
    }

    /* renamed from: onItemRangeReplaced  reason: avoid collision after fix types in other method */
    public final void onItemRangeReplaced2(@NotNull ObservableArrayList<ShieldSection> observableArrayList, int i, int i2, int i3, @Nullable List<Object> list) {
        Object[] objArr = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e22546409fa95c880ba6147e8e56f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e22546409fa95c880ba6147e8e56f44");
            return;
        }
        h.b(observableArrayList, "sender");
        adjustListAndNeighbor(observableArrayList, i, i2);
    }

    private final void adjustListAndNeighbor(ObservableArrayList<ShieldSection> observableArrayList, int i, int i2) {
        int i3 = 1;
        Object[] objArr = {observableArrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6d779824c444ab88bf1ea2f7a3a4a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6d779824c444ab88bf1ea2f7a3a4a84");
            return;
        }
        ShieldSection shieldSection = null;
        if (i > 0 && i > 0) {
            while (true) {
                int i4 = i - i3;
                if (((ShieldSection) observableArrayList.get(i4)).getRange() <= 0) {
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                } else {
                    shieldSection = (ShieldSection) observableArrayList.get(i4);
                    break;
                }
            }
        }
        int i5 = i2 + i;
        while (i < i5) {
            if (((ShieldSection) observableArrayList.get(i)).getRange() > 0) {
                ShieldSection shieldSection2 = (ShieldSection) observableArrayList.get(i);
                NodeCreator.Companion companion = NodeCreator.Companion;
                h.a((Object) shieldSection2, "insertedSection");
                companion.adjustSectionLinkType(shieldSection, shieldSection2);
                shieldSection = shieldSection2;
            }
            i++;
        }
        if (i5 < observableArrayList.size()) {
            ShieldSection shieldSection3 = (ShieldSection) observableArrayList.get(i5);
            if (shieldSection3.getRange() > 0) {
                NodeCreator.Companion companion2 = NodeCreator.Companion;
                h.a((Object) shieldSection3, "nextSection");
                companion2.adjustSectionLinkType(shieldSection, shieldSection3);
            }
        }
    }
}
