package com.dianping.shield.dynamic.diff.section;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.agent.node.DynamicDiffKt;
import com.dianping.shield.dynamic.diff.DynamicBaseDiff;
import com.dianping.shield.dynamic.items.rowitems.grid.DynamicGridRowItem;
import com.dianping.shield.dynamic.items.rowitems.hover.DynamicHoverRowItem;
import com.dianping.shield.dynamic.items.rowitems.normal.DynamicNormalRowItem;
import com.dianping.shield.dynamic.items.rowitems.scroll.DynamicScrollRowItem;
import com.dianping.shield.dynamic.items.rowitems.tab.DynamicTabRowItem;
import com.dianping.shield.dynamic.items.sectionitems.DynamicSectionBGViewDiff;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.GridCellInfo;
import com.dianping.shield.dynamic.model.cell.HoverCellInfo;
import com.dianping.shield.dynamic.model.cell.ScrollCellInfo;
import com.dianping.shield.dynamic.model.cell.TabCellInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.section.SectionInfo;
import com.dianping.shield.dynamic.model.section.SectionInfo.BaseSectionInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DividerUtil;
import com.dianping.shield.dynamic.utils.LinkTypeUtil;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.j;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002J\u0017\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0015J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\b\b\u0002\u0010\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u0002H\u001d¢\u0006\u0002\u0010 JI\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00012\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0002\u0010*J2\u0010+\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\u0015\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00028\u0001X\u0086.¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00064"}, d2 = {"Lcom/dianping/shield/dynamic/diff/section/BaseSectionDiff;", "T", "Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;", "V", "Lcom/dianping/shield/node/useritem/SectionItem;", "Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "dynamicSectionBGViewDiff", "Lcom/dianping/shield/dynamic/items/sectionitems/DynamicSectionBGViewDiff;", "getDynamicSectionBGViewDiff", "()Lcom/dianping/shield/dynamic/items/sectionitems/DynamicSectionBGViewDiff;", "dynamicSectionBGViewDiff$delegate", "Lkotlin/Lazy;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "sectionItem", "getSectionItem", "()Lcom/dianping/shield/node/useritem/SectionItem;", "setSectionItem", "(Lcom/dianping/shield/node/useritem/SectionItem;)V", "Lcom/dianping/shield/node/useritem/SectionItem;", "bindHeaderFooterRow", "", "computingItem", "bindItems", "createRowItem", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "R", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "cellInfo", "(Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;)Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;Lcom/dianping/shield/node/useritem/SectionItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffHeaderFooter", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "resetProps", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/section/SectionInfo$BaseSectionInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class BaseSectionDiff<T extends SectionInfo.BaseSectionInfo, V extends SectionItem> extends DynamicBaseDiff<T, V> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(BaseSectionDiff.class), "dynamicSectionBGViewDiff", "getDynamicSectionBGViewDiff()Lcom/dianping/shield/dynamic/items/sectionitems/DynamicSectionBGViewDiff;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private final d dynamicSectionBGViewDiff$delegate;
    @NotNull
    private final DynamicChassisInterface hostChassis;
    @NotNull
    public V sectionItem;

    private final DynamicSectionBGViewDiff getDynamicSectionBGViewDiff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (DynamicSectionBGViewDiff) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8790885e4581f7e200f2a186afd27f0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8790885e4581f7e200f2a186afd27f0") : this.dynamicSectionBGViewDiff$delegate.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((BaseSectionDiff<T, V>) ((SectionItem) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseSectionDiff<T, V>) ((SectionInfo.BaseSectionInfo) diffableInfo), (SectionInfo.BaseSectionInfo) ((SectionItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseSectionDiff<T, V>) ((SectionInfo.BaseSectionInfo) diffableInfo));
    }

    public BaseSectionDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb06c2d2ab01a43d8591d96cfe482632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb06c2d2ab01a43d8591d96cfe482632");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.dynamicSectionBGViewDiff$delegate = e.a(kotlin.i.NONE, new BaseSectionDiff$dynamicSectionBGViewDiff$2(this));
    }

    @NotNull
    public final V getSectionItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0677d0175970b3b0f5451e99ff4f483", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0677d0175970b3b0f5451e99ff4f483");
        }
        V v = this.sectionItem;
        if (v == null) {
            h.a("sectionItem");
        }
        return v;
    }

    public final void setSectionItem(@NotNull V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d413d617effea39f653167645ffba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d413d617effea39f653167645ffba4");
            return;
        }
        h.b(v, "<set-?>");
        this.sectionItem = v;
    }

    public void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f81e455a5846bb8794db20dc0725dd66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f81e455a5846bb8794db20dc0725dd66");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        diffHeaderFooter(t, v, arrayList);
        getDynamicSectionBGViewDiff().diff2((SectionInfo.BaseSectionInfo) t, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9768c2a7fdba6fb1bc378f6f422f477b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9768c2a7fdba6fb1bc378f6f422f477b");
        }
        h.b(str, "identifier");
        ArrayList arrayList = new ArrayList();
        DynamicSectionBGViewDiff dynamicSectionBGViewDiff = getDynamicSectionBGViewDiff();
        if (dynamicSectionBGViewDiff != null) {
            arrayList.add(dynamicSectionBGViewDiff);
        }
        V v = this.sectionItem;
        if (v == null) {
            h.a("sectionItem");
        }
        RowItem rowItem = v.headerRowItem;
        if (!(rowItem instanceof DynamicViewItemsHolderInterface)) {
            rowItem = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) rowItem;
        if (dynamicViewItemsHolderInterface != null) {
            arrayList.add(dynamicViewItemsHolderInterface);
        }
        V v2 = this.sectionItem;
        if (v2 == null) {
            h.a("sectionItem");
        }
        RowItem rowItem2 = v2.footerRowItem;
        if (!(rowItem2 instanceof DynamicViewItemsHolderInterface)) {
            rowItem2 = null;
        }
        DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface2 = (DynamicViewItemsHolderInterface) rowItem2;
        if (dynamicViewItemsHolderInterface2 != null) {
            arrayList.add(dynamicViewItemsHolderInterface2);
        }
        V v3 = this.sectionItem;
        if (v3 == null) {
            h.a("sectionItem");
        }
        ArrayList<RowItem> arrayList2 = v3.rowItems;
        if (arrayList2 != null) {
            for (RowItem rowItem3 : arrayList2) {
                if (((DynamicViewItemsHolderInterface) (!(rowItem3 instanceof DynamicViewItemsHolderInterface) ? null : rowItem3)) != null) {
                    arrayList.add(rowItem3);
                }
            }
        }
        return DynamicDiffKt.findDynamicViewItem(arrayList, str);
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void resetProps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e20f536742b5b359e0d6f6b611344d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e20f536742b5b359e0d6f6b611344d9");
            return;
        }
        V v = this.sectionItem;
        if (v == null) {
            h.a("sectionItem");
        }
        v.clear();
    }

    public void bindItems(@Nullable V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce1ff10c2e44f03fed92be24b6ebf444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce1ff10c2e44f03fed92be24b6ebf444");
            return;
        }
        bindHeaderFooterRow(v);
        getDynamicSectionBGViewDiff().onComputingComplete();
    }

    public void updateProps(@NotNull T t) {
        ColorDrawable colorDrawable;
        ColorDrawable colorDrawable2;
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8545b4d57e33922a5ae7e0925ab6f305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8545b4d57e33922a5ae7e0925ab6f305");
            return;
        }
        h.b(t, "info");
        V v = this.sectionItem;
        if (v == null) {
            h.a("sectionItem");
        }
        Integer sectionHeaderHeight = t.getSectionHeaderHeight();
        v.sectionHeaderGapHeight = sectionHeaderHeight != null ? sectionHeaderHeight.intValue() : -1;
        V v2 = this.sectionItem;
        if (v2 == null) {
            h.a("sectionItem");
        }
        Integer sectionFooterHeight = t.getSectionFooterHeight();
        v2.sectionFooterGapHeight = sectionFooterHeight != null ? sectionFooterHeight.intValue() : -1;
        V v3 = this.sectionItem;
        if (v3 == null) {
            h.a("sectionItem");
        }
        v3.sectionTitle = t.getSectionIndexTitle();
        V v4 = this.sectionItem;
        if (v4 == null) {
            h.a("sectionItem");
        }
        ColorUnionType sectionHeaderBackgroundColor = t.getSectionHeaderBackgroundColor();
        if (sectionHeaderBackgroundColor == null) {
            colorDrawable = null;
        } else if (sectionHeaderBackgroundColor instanceof ColorUnionType.StringColor) {
            colorDrawable = new ColorDrawable(ColorUnionTypeKt.parseColor(((ColorUnionType.StringColor) sectionHeaderBackgroundColor).getColor()));
        } else if (!(sectionHeaderBackgroundColor instanceof ColorUnionType.GradientColorInfo)) {
            throw new j();
        } else {
            ColorUnionType.GradientColorInfo gradientColorInfo = (ColorUnionType.GradientColorInfo) sectionHeaderBackgroundColor;
            int parseColor = ColorUnionTypeKt.parseColor(gradientColorInfo.getStartColor());
            int parseColor2 = ColorUnionTypeKt.parseColor(gradientColorInfo.getEndColor());
            Integer orientation = gradientColorInfo.getOrientation();
            int intValue = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
            if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.values()[intValue], new int[]{parseColor, parseColor2});
            } else {
                gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(0);
            }
            colorDrawable = gradientDrawable2;
        }
        v4.sectionHeaderGapDrawable = colorDrawable;
        V v5 = this.sectionItem;
        if (v5 == null) {
            h.a("sectionItem");
        }
        ColorUnionType sectionFooterBackgroundColor = t.getSectionFooterBackgroundColor();
        if (sectionFooterBackgroundColor == null) {
            colorDrawable2 = null;
        } else if (sectionFooterBackgroundColor instanceof ColorUnionType.StringColor) {
            colorDrawable2 = new ColorDrawable(ColorUnionTypeKt.parseColor(((ColorUnionType.StringColor) sectionFooterBackgroundColor).getColor()));
        } else if (!(sectionFooterBackgroundColor instanceof ColorUnionType.GradientColorInfo)) {
            throw new j();
        } else {
            ColorUnionType.GradientColorInfo gradientColorInfo2 = (ColorUnionType.GradientColorInfo) sectionFooterBackgroundColor;
            int parseColor3 = ColorUnionTypeKt.parseColor(gradientColorInfo2.getStartColor());
            int parseColor4 = ColorUnionTypeKt.parseColor(gradientColorInfo2.getEndColor());
            Integer orientation2 = gradientColorInfo2.getOrientation();
            int intValue2 = orientation2 != null ? orientation2.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
            if (parseColor3 != Integer.MAX_VALUE && parseColor4 != Integer.MAX_VALUE) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.values()[intValue2], new int[]{parseColor3, parseColor4});
            } else {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(0);
            }
            colorDrawable2 = gradientDrawable;
        }
        v5.sectionFooterGapDrawable = colorDrawable2;
        Integer linkType = t.getLinkType();
        if (linkType != null) {
            int intValue3 = linkType.intValue();
            V v6 = this.sectionItem;
            if (v6 == null) {
                h.a("sectionItem");
            }
            v6.nextLinkType = LinkTypeUtil.INSTANCE.getNextLinkType(intValue3);
            V v7 = this.sectionItem;
            if (v7 == null) {
                h.a("sectionItem");
            }
            v7.previousLinkType = LinkTypeUtil.INSTANCE.getPreviousLinkType(intValue3);
        } else {
            V v8 = this.sectionItem;
            if (v8 == null) {
                h.a("sectionItem");
            }
            v8.nextLinkType = null;
            V v9 = this.sectionItem;
            if (v9 == null) {
                h.a("sectionItem");
            }
            v9.previousLinkType = null;
        }
        if (this.hostChassis.getHostContext() != null) {
            V v10 = this.sectionItem;
            if (v10 == null) {
                h.a("sectionItem");
            }
            v10.dividerStyle = DividerUtil.Companion.getDividerStyle$default(DividerUtil.Companion, this.hostChassis.getHostContext(), t.getSeparatorLineInfo(), null, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffHeaderFooter(com.dianping.shield.dynamic.model.section.SectionInfo.BaseSectionInfo r12, com.dianping.shield.node.useritem.SectionItem r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.section.BaseSectionDiff.diffHeaderFooter(com.dianping.shield.dynamic.model.section.SectionInfo$BaseSectionInfo, com.dianping.shield.node.useritem.SectionItem, java.util.ArrayList):void");
    }

    private final void bindHeaderFooterRow(SectionItem sectionItem) {
        RowItem rowItem;
        RowItem rowItem2;
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "058d564c372803bc7532b55eec44ea79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "058d564c372803bc7532b55eec44ea79");
            return;
        }
        if (sectionItem != null && (rowItem2 = sectionItem.headerRowItem) != null) {
            if (rowItem2 instanceof DynamicDiff) {
                ((DynamicDiff) rowItem2).onComputingComplete();
            }
            V v = this.sectionItem;
            if (v == null) {
                h.a("sectionItem");
            }
            v.setHeaderRowItem(rowItem2);
        }
        if (sectionItem == null || (rowItem = sectionItem.footerRowItem) == null) {
            return;
        }
        if (rowItem instanceof DynamicDiff) {
            ((DynamicDiff) rowItem).onComputingComplete();
        }
        V v2 = this.sectionItem;
        if (v2 == null) {
            h.a("sectionItem");
        }
        v2.setFooterRowItem(rowItem);
    }

    @NotNull
    public final <R extends CellInfo.BaseCellInfo> DynamicDiff<R> createRowItem(@NotNull R r) {
        Object[] objArr = {r};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d830f49d29722a21dc62c93000dafb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d830f49d29722a21dc62c93000dafb6");
        }
        h.b(r, "cellInfo");
        return r instanceof TabCellInfo ? new DynamicTabRowItem(this.hostChassis, null, 2, null) : r instanceof GridCellInfo ? new DynamicGridRowItem(this.hostChassis, null, 2, null) : r instanceof ScrollCellInfo ? new DynamicScrollRowItem(this.hostChassis, null, 2, null) : r instanceof HoverCellInfo ? new DynamicHoverRowItem(this.hostChassis, null, 2, null) : new DynamicNormalRowItem(this.hostChassis, null, 2, null);
    }
}
