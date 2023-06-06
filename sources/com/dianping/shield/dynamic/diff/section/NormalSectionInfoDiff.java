package com.dianping.shield.dynamic.diff.section;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.section.NormalSectionInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016JI\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00032\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001aJ0\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00032\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016H\u0002J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0002H\u0016R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/dianping/shield/dynamic/diff/section/NormalSectionInfoDiff;", "Lcom/dianping/shield/dynamic/diff/section/BaseSectionDiff;", "Lcom/dianping/shield/dynamic/model/section/NormalSectionInfo;", "Lcom/dianping/shield/node/useritem/SectionItem;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "rowIdMap", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/node/useritem/RowItem;", "Lkotlin/collections/HashMap;", "bindItems", "", "computingItem", "bindRowItems", "createComputingItem", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/NormalSectionInfo;Lcom/dianping/shield/node/useritem/SectionItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffRowItems", "mappingRowItem", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "id", "", "updateProps", "info", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalSectionInfoDiff extends BaseSectionDiff<NormalSectionInfo, SectionItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, RowItem> rowIdMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalSectionInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f24ae96548d4e2452574d96768630681", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f24ae96548d4e2452574d96768630681");
        } else {
            this.rowIdMap = new HashMap<>();
        }
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2((NormalSectionInfo) diffableInfo, (SectionItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff
    public final /* bridge */ /* synthetic */ void diffChildren(NormalSectionInfo normalSectionInfo, SectionItem sectionItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2(normalSectionInfo, sectionItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* renamed from: diffChildren  reason: avoid collision after fix types in other method */
    public final void diffChildren2(@NotNull NormalSectionInfo normalSectionInfo, @NotNull SectionItem sectionItem, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {normalSectionInfo, sectionItem, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88bb9be941237625da1055d49552bfbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88bb9be941237625da1055d49552bfbd");
            return;
        }
        h.b(normalSectionInfo, "newInfo");
        h.b(sectionItem, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((NormalSectionInfoDiff) normalSectionInfo, (NormalSectionInfo) sectionItem, arrayList, (Integer) 0, (Integer) 0);
        diffRowItems(normalSectionInfo, sectionItem, arrayList);
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final SectionItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30012e0943e75a2ba89bd64a971ebfa7", RobustBitConfig.DEFAULT_VALUE) ? (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30012e0943e75a2ba89bd64a971ebfa7") : new SectionItem();
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable SectionItem sectionItem) {
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de19ffeeab82c2905139239ffd25cb07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de19ffeeab82c2905139239ffd25cb07");
            return;
        }
        super.bindItems((NormalSectionInfoDiff) sectionItem);
        bindRowItems(sectionItem);
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff
    public final void updateProps(@NotNull NormalSectionInfo normalSectionInfo) {
        Object[] objArr = {normalSectionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9953f681fd6f58a90061861225aa006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9953f681fd6f58a90061861225aa006");
            return;
        }
        h.b(normalSectionInfo, "info");
        super.updateProps((NormalSectionInfoDiff) normalSectionInfo);
        SectionItem sectionItem = getSectionItem();
        Boolean enableLayoutAnimation = normalSectionInfo.getEnableLayoutAnimation();
        sectionItem.enableLayoutAnimation = enableLayoutAnimation != null ? enableLayoutAnimation.booleanValue() : false;
        SectionItem sectionItem2 = getSectionItem();
        AnimationType insertAnimationType = normalSectionInfo.getInsertAnimationType();
        if (insertAnimationType == null) {
            insertAnimationType = AnimationType.NONE;
        }
        sectionItem2.insertAnimationType = insertAnimationType;
        SectionItem sectionItem3 = getSectionItem();
        AnimationType deleteAnimationType = normalSectionInfo.getDeleteAnimationType();
        if (deleteAnimationType == null) {
            deleteAnimationType = AnimationType.NONE;
        }
        sectionItem3.deleteAnimationType = deleteAnimationType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffRowItems(com.dianping.shield.dynamic.model.section.NormalSectionInfo r12, com.dianping.shield.node.useritem.SectionItem r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff.changeQuickRedirect
            java.lang.String r10 = "5362cb3b49b394b6cbab087046db117f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            java.util.ArrayList r12 = r12.getChildren()
            if (r12 == 0) goto L8e
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L2d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r12.next()
            com.dianping.shield.dynamic.model.cell.CellInfo r0 = (com.dianping.shield.dynamic.model.cell.CellInfo) r0
            com.dianping.shield.dynamic.model.DiffableInfo r0 = (com.dianping.shield.dynamic.model.DiffableInfo) r0
            java.lang.String r1 = r0.getIdentifier()
            if (r1 == 0) goto L60
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r11
            com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff r2 = (com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.mappingRowItem(r1)
            if (r1 != 0) goto L5e
            if (r0 == 0) goto L56
            r1 = r0
            com.dianping.shield.dynamic.model.cell.CellInfo$BaseCellInfo r1 = (com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo) r1
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.createRowItem(r1)
            goto L5e
        L56:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L5e:
            if (r1 != 0) goto L6c
        L60:
            if (r0 == 0) goto L85
            r1 = r0
            com.dianping.shield.dynamic.model.cell.CellInfo$BaseCellInfo r1 = (com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo) r1
            r2 = r11
            com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff r2 = (com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r1 = r2.createRowItem(r1)
        L6c:
            if (r0 == 0) goto L7d
            r2 = 0
            r1.diff(r0, r14, r2, r2)
            boolean r0 = r1 instanceof com.dianping.shield.node.useritem.RowItem
            if (r0 != 0) goto L77
            r1 = r2
        L77:
            com.dianping.shield.node.useritem.RowItem r1 = (com.dianping.shield.node.useritem.RowItem) r1
            r13.addRowItem(r1)
            goto L2d
        L7d:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L85:
            kotlin.o r12 = new kotlin.o
            java.lang.String r13 = "null cannot be cast to non-null type T"
            r12.<init>(r13)
            throw r12
        L8d:
            return
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.section.NormalSectionInfoDiff.diffRowItems(com.dianping.shield.dynamic.model.section.NormalSectionInfo, com.dianping.shield.node.useritem.SectionItem, java.util.ArrayList):void");
    }

    private final DynamicDiff<CellInfo.BaseCellInfo> mappingRowItem(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf55c5c1fed530c93f50cfba6c16737d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf55c5c1fed530c93f50cfba6c16737d");
        }
        RowItem rowItem = this.rowIdMap.get(charSequence);
        if (!(rowItem instanceof DynamicDiff)) {
            rowItem = null;
        }
        return (DynamicDiff) rowItem;
    }

    private final void bindRowItems(SectionItem sectionItem) {
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acb52417f377607e9f941d131623a9d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acb52417f377607e9f941d131623a9d5");
        } else if (sectionItem != null) {
            this.rowIdMap.clear();
            ArrayList<RowItem> arrayList = sectionItem.rowItems;
            if (arrayList != null) {
                for (RowItem rowItem : arrayList) {
                    if (rowItem instanceof DynamicDiff) {
                        DynamicDiff dynamicDiff = (DynamicDiff) rowItem;
                        dynamicDiff.onComputingComplete();
                        String id = dynamicDiff.getId();
                        if (id != null) {
                            this.rowIdMap.put(id, rowItem);
                        }
                        getSectionItem().addRowItem(rowItem);
                    }
                }
            }
        }
    }
}
