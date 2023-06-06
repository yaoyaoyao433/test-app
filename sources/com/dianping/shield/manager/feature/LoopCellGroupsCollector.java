package com.dianping.shield.manager.feature;

import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.c;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J \u0010\u0014\u001a\u00020\u00062\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\nJ \u0010\u0015\u001a\u00020\u00062\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\nJ \u0010\u0016\u001a\u00020\u00062\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\nJ\u0006\u0010\u0017\u001a\u00020\u0006J$\u0010\u0018\u001a\u00020\u00062\u001a\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a`\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\fH\u0016J'\u0010\u001d\u001a\u00020\u0006*\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\nH\u0082\bJ'\u0010\u001e\u001a\u00020\u0006*\u00020\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\nH\u0082\bJ;\u0010\u001f\u001a\u00020\u0006*\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a`\u00072\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\nH\u0082\bR*\u0010\u0003\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\t\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\n0\u0004j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\n`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\r\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\n0\u0004j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\n`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u000f\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\n0\u0004j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\n`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/dianping/shield/manager/feature/LoopCellGroupsCollector;", "Lcom/dianping/shield/manager/feature/CellManagerFeatureInterface;", "()V", "afterActions", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "", "Lkotlin/collections/ArrayList;", "beforeActions", "cellAction", "Lkotlin/Function2;", "", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "preloadRowActions", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "sectionAction", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "addAfterLoopAction", "action", "addBeforeLoopAction", "addIndexedPreloadRowAction", "addIndexedSectionAction", "addIndexedViewCellAction", "clearAllActions", "onAdapterNotify", "cellGroups", "Lcom/dianping/shield/node/cellnode/ShieldCellGroup;", "onCellNodeRefresh", "shieldViewCell", "forEachIndexedPreLoadRow", "forEachIndexedSection", "forEachIndexedViewCell", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoopCellGroupsCollector implements CellManagerFeatureInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ArrayList<a<r>> afterActions;
    private final ArrayList<a<r>> beforeActions;
    private final ArrayList<c<Integer, ShieldViewCell, r>> cellAction;
    private final ArrayList<c<Integer, ShieldRow, r>> preloadRowActions;
    private final ArrayList<c<Integer, ShieldSection, r>> sectionAction;

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onCellNodeRefresh(@NotNull ShieldViewCell shieldViewCell) {
        Object[] objArr = {shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b035757fb02c650d03b8d5a3582c1852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b035757fb02c650d03b8d5a3582c1852");
        } else {
            h.b(shieldViewCell, "shieldViewCell");
        }
    }

    public LoopCellGroupsCollector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1c8ec2b38df08bd0b10e1949a9a1f78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1c8ec2b38df08bd0b10e1949a9a1f78");
            return;
        }
        this.beforeActions = new ArrayList<>();
        this.afterActions = new ArrayList<>();
        this.cellAction = new ArrayList<>();
        this.sectionAction = new ArrayList<>();
        this.preloadRowActions = new ArrayList<>();
    }

    @Override // com.dianping.shield.manager.feature.CellManagerFeatureInterface
    public final void onAdapterNotify(@NotNull ArrayList<ShieldCellGroup> arrayList) {
        ArrayList<ShieldViewCell> arrayList2;
        LazyLoadShieldRowProvider rowProvider;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9996bf2bafad5f01efba5fa90b4498fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9996bf2bafad5f01efba5fa90b4498fe");
            return;
        }
        h.b(arrayList, "cellGroups");
        Iterator<T> it = this.beforeActions.iterator();
        while (it.hasNext()) {
            ((a) it.next()).invoke();
        }
        for (ShieldCellGroup shieldCellGroup : arrayList) {
            if (shieldCellGroup != null && (arrayList2 = shieldCellGroup.shieldViewCells) != null) {
                int i = 0;
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    ShieldViewCell shieldViewCell = (ShieldViewCell) obj;
                    Iterator<T> it2 = this.cellAction.iterator();
                    while (it2.hasNext()) {
                        ((c) it2.next()).invoke(Integer.valueOf(i), shieldViewCell);
                    }
                    RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = shieldViewCell.shieldSections;
                    if (rangeRemoveableArrayList != null) {
                        int i3 = 0;
                        for (ShieldSection shieldSection : rangeRemoveableArrayList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                kotlin.collections.h.a();
                            }
                            ShieldSection shieldSection2 = shieldSection;
                            h.a((Object) shieldSection2, "shieldSection");
                            Iterator<T> it3 = this.sectionAction.iterator();
                            while (it3.hasNext()) {
                                ((c) it3.next()).invoke(Integer.valueOf(i3), shieldSection2);
                            }
                            if (shieldSection2.isLazyLoad) {
                                RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = shieldSection2.shieldRows;
                                if (rangeRemoveableArrayList2 != null) {
                                    int i5 = 0;
                                    for (ShieldRow shieldRow : rangeRemoveableArrayList2) {
                                        int i6 = i5 + 1;
                                        if (i5 < 0) {
                                            kotlin.collections.h.a();
                                        }
                                        ShieldRow shieldRow2 = shieldRow;
                                        if (shieldRow2 == null) {
                                            int i7 = shieldSection2.hasHeaderCell ? i5 - 1 : i5;
                                            shieldRow2 = (i7 < 0 || (rowProvider = shieldSection2.getRowProvider()) == null || !rowProvider.isPreLoad(i7, shieldSection2)) ? null : shieldSection2.getShieldRow$shieldCore_release(i5);
                                        }
                                        if (shieldRow2 != null) {
                                            Iterator<T> it4 = this.preloadRowActions.iterator();
                                            while (it4.hasNext()) {
                                                ((c) it4.next()).invoke(Integer.valueOf(i5), shieldRow2);
                                            }
                                        }
                                        i5 = i6;
                                    }
                                }
                            } else {
                                RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList3 = shieldSection2.shieldRows;
                                if (rangeRemoveableArrayList3 != null) {
                                    int i8 = 0;
                                    for (ShieldRow shieldRow3 : rangeRemoveableArrayList3) {
                                        int i9 = i8 + 1;
                                        if (i8 < 0) {
                                            kotlin.collections.h.a();
                                        }
                                        ShieldRow shieldRow4 = shieldRow3;
                                        if (shieldRow4 != null) {
                                            Iterator<T> it5 = this.preloadRowActions.iterator();
                                            while (it5.hasNext()) {
                                                ((c) it5.next()).invoke(Integer.valueOf(i8), shieldRow4);
                                            }
                                        }
                                        i8 = i9;
                                    }
                                }
                            }
                            i3 = i4;
                        }
                    }
                    i = i2;
                }
            }
        }
        Iterator<T> it6 = this.afterActions.iterator();
        while (it6.hasNext()) {
            ((a) it6.next()).invoke();
        }
    }

    public final void addBeforeLoopAction(@NotNull a<r> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66db17014d11d492ffa6abd0cae99d56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66db17014d11d492ffa6abd0cae99d56");
            return;
        }
        h.b(aVar, "action");
        this.beforeActions.add(aVar);
    }

    public final void addAfterLoopAction(@NotNull a<r> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dac1a805e4ac1fb2bf7f89c856bc5bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dac1a805e4ac1fb2bf7f89c856bc5bdd");
            return;
        }
        h.b(aVar, "action");
        this.afterActions.add(aVar);
    }

    public final void addIndexedViewCellAction(@NotNull c<? super Integer, ? super ShieldViewCell, r> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b398fe746a41de2ec39c15306e844a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b398fe746a41de2ec39c15306e844a");
            return;
        }
        h.b(cVar, "action");
        this.cellAction.add(cVar);
    }

    public final void addIndexedSectionAction(@NotNull c<? super Integer, ? super ShieldSection, r> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de86dce29eac1c8da493e5b7c3741a8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de86dce29eac1c8da493e5b7c3741a8d");
            return;
        }
        h.b(cVar, "action");
        this.sectionAction.add(cVar);
    }

    public final void addIndexedPreloadRowAction(@NotNull c<? super Integer, ? super ShieldRow, r> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d138cc8c1003252ff19c95672481be15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d138cc8c1003252ff19c95672481be15");
            return;
        }
        h.b(cVar, "action");
        this.preloadRowActions.add(cVar);
    }

    public final void clearAllActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e2af8325941777815fb533be7aec7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e2af8325941777815fb533be7aec7c");
            return;
        }
        this.beforeActions.clear();
        this.afterActions.clear();
        this.cellAction.clear();
        this.sectionAction.clear();
        this.preloadRowActions.clear();
    }

    private final void forEachIndexedViewCell(@NotNull ArrayList<ShieldCellGroup> arrayList, c<? super Integer, ? super ShieldViewCell, r> cVar) {
        ArrayList<ShieldViewCell> arrayList2;
        Object[] objArr = {arrayList, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d006b5f33531bfabd1c716e43f14e6ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d006b5f33531bfabd1c716e43f14e6ef");
            return;
        }
        for (ShieldCellGroup shieldCellGroup : arrayList) {
            if (shieldCellGroup != null && (arrayList2 = shieldCellGroup.shieldViewCells) != null) {
                int i = 0;
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    cVar.invoke(Integer.valueOf(i), (ShieldViewCell) obj);
                    i = i2;
                }
            }
        }
    }

    private final void forEachIndexedSection(@NotNull ShieldViewCell shieldViewCell, c<? super Integer, ? super ShieldSection, r> cVar) {
        int i = 0;
        Object[] objArr = {shieldViewCell, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba28b09bdd0ca0544905be7f401fc9b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba28b09bdd0ca0544905be7f401fc9b2");
            return;
        }
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = shieldViewCell.shieldSections;
        if (rangeRemoveableArrayList != null) {
            for (ShieldSection shieldSection : rangeRemoveableArrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.h.a();
                }
                ShieldSection shieldSection2 = shieldSection;
                Integer valueOf = Integer.valueOf(i);
                h.a((Object) shieldSection2, "shieldSection");
                cVar.invoke(valueOf, shieldSection2);
                i = i2;
            }
        }
    }

    private final void forEachIndexedPreLoadRow(@NotNull ShieldSection shieldSection, c<? super Integer, ? super ShieldRow, r> cVar) {
        LazyLoadShieldRowProvider rowProvider;
        int i = 0;
        Object[] objArr = {shieldSection, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dad85361bb76929c3d7da8af674a1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dad85361bb76929c3d7da8af674a1f9");
        } else if (shieldSection.isLazyLoad) {
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = shieldSection.shieldRows;
            if (rangeRemoveableArrayList != null) {
                for (ShieldRow shieldRow : rangeRemoveableArrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    ShieldRow shieldRow2 = shieldRow;
                    if (shieldRow2 == null) {
                        int i3 = shieldSection.hasHeaderCell ? i - 1 : i;
                        shieldRow2 = (i3 < 0 || (rowProvider = shieldSection.getRowProvider()) == null || !rowProvider.isPreLoad(i3, shieldSection)) ? null : shieldSection.getShieldRow$shieldCore_release(i);
                    }
                    if (shieldRow2 != null) {
                        cVar.invoke(Integer.valueOf(i), shieldRow2);
                    }
                    i = i2;
                }
            }
        } else {
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = shieldSection.shieldRows;
            if (rangeRemoveableArrayList2 != null) {
                for (ShieldRow shieldRow3 : rangeRemoveableArrayList2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        kotlin.collections.h.a();
                    }
                    ShieldRow shieldRow4 = shieldRow3;
                    if (shieldRow4 != null) {
                        cVar.invoke(Integer.valueOf(i), shieldRow4);
                    }
                    i = i4;
                }
            }
        }
    }
}
