package com.dianping.shield.node.processor;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.PositionType;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/node/processor/NodeCreator;", "", "()V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NodeCreator {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EMPTY_TYPE = "(empty)";
    @NotNull
    public static final String EMPTY_TYPE_CUSTOM = "(emptycustom)";
    @NotNull
    public static final String FAILED_TYPE = "(failed)";
    @NotNull
    public static final String FAILED_TYPE_CUSTOM = "(failedcustom)";
    @NotNull
    public static final String LOADING_MORE_FAILED_TYPE = "(loadingmorefailed)";
    @NotNull
    public static final String LOADING_MORE_FAILED_TYPE_CUSTOM = "(loadingmorefailedcustom)";
    @NotNull
    public static final String LOADING_MORE_TYPE = "(loadingmore)";
    @NotNull
    public static final String LOADING_MORE_TYPE_CUSTOM = "(loadingmorecustom)";
    @NotNull
    public static final String LOADING_TYPE = "(loading)";
    @NotNull
    public static final String LOADING_TYPE_CUSTOM = "(loadingcustom)";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    @NotNull
    public static final String viewTypeSepreator = "*";

    @JvmStatic
    public static final void adjustSectionLinkType(@Nullable ShieldSection shieldSection, @NotNull ShieldSection shieldSection2) {
        Object[] objArr = {shieldSection, shieldSection2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a10de2ecc532d74adb50f9f036a9f573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a10de2ecc532d74adb50f9f036a9f573");
        } else {
            Companion.adjustSectionLinkType(shieldSection, shieldSection2);
        }
    }

    @JvmStatic
    @NotNull
    public static final View createDefaultView(@NotNull Context context, @NotNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96d28e481327aadb5aa83f7612ddd149", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96d28e481327aadb5aa83f7612ddd149") : Companion.createDefaultView(context, str);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyCellId(@NotNull af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08148f4b9f2b7ec622e514d2c8115088", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08148f4b9f2b7ec622e514d2c8115088") : Companion.geneLegacyCellId(afVar);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyRowId(@NotNull af afVar, int i, int i2) {
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "011c94dc02454d49c5472eb48f5e7248", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "011c94dc02454d49c5472eb48f5e7248") : Companion.geneLegacyRowId(afVar, i, i2);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyRowId(@NotNull af afVar, int i, @NotNull CellType cellType) {
        Object[] objArr = {afVar, Integer.valueOf(i), cellType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7010f8b90523fbb2b8b5a2f1226eec8a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7010f8b90523fbb2b8b5a2f1226eec8a") : Companion.geneLegacyRowId(afVar, i, cellType);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyRowIdWithData(@NotNull af afVar, int i, int i2, @NotNull Object obj) {
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8dbfd0d8b426ba09af805ce585e2c1a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8dbfd0d8b426ba09af805ce585e2c1a") : Companion.geneLegacyRowIdWithData(afVar, i, i2, obj);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacySectionId(@NotNull af afVar, int i) {
        Object[] objArr = {afVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "996320b3bfd3e564a280d0c17ba44ad9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "996320b3bfd3e564a280d0c17ba44ad9") : Companion.geneLegacySectionId(afVar, i);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyViewId(@NotNull af afVar, int i, int i2) {
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29d8aabae1e3f4976cb74a24bc557f24", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29d8aabae1e3f4976cb74a24bc557f24") : Companion.geneLegacyViewId(afVar, i, i2);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyViewId(@NotNull af afVar, int i, @NotNull CellType cellType) {
        Object[] objArr = {afVar, Integer.valueOf(i), cellType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e31866f7653c1b56c9a10c53906fd07b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e31866f7653c1b56c9a10c53906fd07b") : Companion.geneLegacyViewId(afVar, i, cellType);
    }

    @JvmStatic
    @NotNull
    public static final String geneLegacyViewIdWithData(@NotNull af afVar, int i, int i2, @NotNull Object obj) {
        Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4da9c4b25c51745764775edd9b14ec51", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4da9c4b25c51745764775edd9b14ec51") : Companion.geneLegacyViewIdWithData(afVar, i, i2, obj);
    }

    @JvmStatic
    private static final boolean isLinkable(ShieldSection shieldSection, ShieldSection shieldSection2) {
        Object[] objArr = {shieldSection, shieldSection2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ce6993d24a8c1484152e92d7f38a7de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ce6993d24a8c1484152e92d7f38a7de")).booleanValue() : Companion.isLinkable(shieldSection, shieldSection2);
    }

    @JvmStatic
    @NotNull
    public static final ShieldDisplayNode repackDisplayNodeWithPositionType(@NotNull ShieldDisplayNode shieldDisplayNode, @NotNull ProcessorHolder processorHolder) {
        Object[] objArr = {shieldDisplayNode, processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5743b5dfd4984f51a447745ecffc4f81", RobustBitConfig.DEFAULT_VALUE) ? (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5743b5dfd4984f51a447745ecffc4f81") : Companion.repackDisplayNodeWithPositionType(shieldDisplayNode, processorHolder);
    }

    @JvmStatic
    @Nullable
    public static final String revertViewType(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afe34a87a472a2ce8ab040e5288220f4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afe34a87a472a2ce8ab040e5288220f4") : Companion.revertViewType(str);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0007J(\u0010\"\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0001H\u0007J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J \u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J \u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0007J(\u0010&\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0001H\u0007J\u0018\u0010'\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0003J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0007J\u0014\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/dianping/shield/node/processor/NodeCreator$Companion;", "", "()V", "EMPTY_TYPE", "", "EMPTY_TYPE_CUSTOM", "FAILED_TYPE", "FAILED_TYPE_CUSTOM", "LOADING_MORE_FAILED_TYPE", "LOADING_MORE_FAILED_TYPE_CUSTOM", "LOADING_MORE_TYPE", "LOADING_MORE_TYPE_CUSTOM", "LOADING_TYPE", "LOADING_TYPE_CUSTOM", "viewTypeSepreator", "adjustSectionLinkType", "", "lastSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "thisSection", "createDefaultView", "Landroid/view/View;", "context", "Landroid/content/Context;", "text", "geneLegacyCellId", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "geneLegacyRowId", "sectionIndex", "", "cellType", "Lcom/dianping/shield/entity/CellType;", "rowIndex", "geneLegacyRowIdWithData", "data", "geneLegacySectionId", "geneLegacyViewId", "geneLegacyViewIdWithData", "isLinkable", "", "repackDisplayNodeWithPositionType", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "dNode", "holder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "revertViewType", "globalViewType", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;
            public static final /* synthetic */ int[] $EnumSwitchMapping$4;
            public static final /* synthetic */ int[] $EnumSwitchMapping$5;
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                int[] iArr = new int[PositionType.valuesCustom().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[PositionType.SINGLE.ordinal()] = 1;
                $EnumSwitchMapping$0[PositionType.LAST.ordinal()] = 2;
                int[] iArr2 = new int[PositionType.valuesCustom().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[PositionType.SINGLE.ordinal()] = 1;
                $EnumSwitchMapping$1[PositionType.FIRST.ordinal()] = 2;
                $EnumSwitchMapping$1[PositionType.UNKNOWN.ordinal()] = 3;
                int[] iArr3 = new int[PositionType.valuesCustom().length];
                $EnumSwitchMapping$2 = iArr3;
                iArr3[PositionType.FIRST.ordinal()] = 1;
                $EnumSwitchMapping$2[PositionType.MIDDLE.ordinal()] = 2;
                int[] iArr4 = new int[PositionType.valuesCustom().length];
                $EnumSwitchMapping$3 = iArr4;
                iArr4[PositionType.LAST.ordinal()] = 1;
                $EnumSwitchMapping$3[PositionType.MIDDLE.ordinal()] = 2;
                $EnumSwitchMapping$3[PositionType.UNKNOWN.ordinal()] = 3;
                int[] iArr5 = new int[CellType.valuesCustom().length];
                $EnumSwitchMapping$4 = iArr5;
                iArr5[CellType.LOADING.ordinal()] = 1;
                $EnumSwitchMapping$4[CellType.LOADING_MORE.ordinal()] = 2;
                $EnumSwitchMapping$4[CellType.HEADER.ordinal()] = 3;
                $EnumSwitchMapping$4[CellType.FOOTER.ordinal()] = 4;
                $EnumSwitchMapping$4[CellType.NORMAL.ordinal()] = 5;
                int[] iArr6 = new int[CellType.valuesCustom().length];
                $EnumSwitchMapping$5 = iArr6;
                iArr6[CellType.LOADING.ordinal()] = 1;
                $EnumSwitchMapping$5[CellType.LOADING_MORE.ordinal()] = 2;
                $EnumSwitchMapping$5[CellType.HEADER.ordinal()] = 3;
                $EnumSwitchMapping$5[CellType.FOOTER.ordinal()] = 4;
                $EnumSwitchMapping$5[CellType.NORMAL.ordinal()] = 5;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isLinkable(ShieldSection shieldSection, ShieldSection shieldSection2) {
            Object[] objArr = {shieldSection, shieldSection2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6004f7bfc1b7f9fac1d02bedacb58352", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6004f7bfc1b7f9fac1d02bedacb58352")).booleanValue();
            }
            ShieldViewCell shieldViewCell = shieldSection.cellParent;
            ShieldCellGroup shieldCellGroup = shieldViewCell != null ? shieldViewCell.groupParent : null;
            ShieldViewCell shieldViewCell2 = shieldSection2.cellParent;
            return shieldCellGroup == (shieldViewCell2 != null ? shieldViewCell2.groupParent : null) ? (shieldSection.adjustedNextType == z.a.DISABLE_LINK_TO_NEXT || shieldSection2.adjustedPreviousType == z.b.DISABLE_LINK_TO_PREVIOUS || (shieldSection.adjustedNextType != z.a.LINK_TO_NEXT && shieldSection2.adjustedPreviousType != z.b.LINK_TO_PREVIOUS)) ? false : true : shieldSection.adjustedNextType == z.a.LINK_UNSAFE_BETWEEN_GROUP && shieldSection2.adjustedPreviousType != z.b.DISABLE_LINK_TO_PREVIOUS;
        }

        @JvmStatic
        public final void adjustSectionLinkType(@Nullable ShieldSection shieldSection, @NotNull ShieldSection shieldSection2) {
            z.a aVar;
            ShieldViewCell shieldViewCell;
            Object[] objArr = {shieldSection, shieldSection2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1626eefe28b7f34655393050f6e5e3e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1626eefe28b7f34655393050f6e5e3e0");
                return;
            }
            h.b(shieldSection2, "thisSection");
            ShieldCellGroup shieldCellGroup = (shieldSection == null || (shieldViewCell = shieldSection.cellParent) == null) ? null : shieldViewCell.groupParent;
            ShieldViewCell shieldViewCell2 = shieldSection2.cellParent;
            if (!h.a(shieldCellGroup, shieldViewCell2 != null ? shieldViewCell2.groupParent : null)) {
                if ((shieldSection != null ? shieldSection.nextLinkType : null) != z.a.LINK_UNSAFE_BETWEEN_GROUP) {
                    if (shieldSection != null) {
                        shieldSection.adjustedNextType = z.a.DISABLE_LINK_TO_NEXT;
                    }
                    shieldSection2.adjustedPreviousType = z.b.DISABLE_LINK_TO_PREVIOUS;
                } else {
                    shieldSection.adjustedNextType = shieldSection.nextLinkType;
                    shieldSection2.adjustedPreviousType = shieldSection2.previousLinkType;
                }
            } else {
                if (!h.a(shieldSection != null ? shieldSection.cellParent : null, shieldSection2.cellParent)) {
                    if (shieldSection != null && (aVar = shieldSection.nextLinkType) != null) {
                        shieldSection.adjustedNextType = aVar;
                    } else if (shieldSection != null) {
                        shieldSection.adjustedNextType = z.a.LINK_TO_NEXT;
                    }
                    z.b bVar = shieldSection2.previousLinkType;
                    if (bVar != null) {
                        shieldSection2.adjustedPreviousType = bVar;
                    } else {
                        shieldSection2.adjustedPreviousType = z.b.LINK_TO_PREVIOUS;
                    }
                } else {
                    if (shieldSection != null) {
                        shieldSection.adjustedNextType = shieldSection.nextLinkType;
                    }
                    shieldSection2.adjustedPreviousType = shieldSection2.previousLinkType;
                }
            }
            if (shieldSection != null) {
                if (NodeCreator.Companion.isLinkable(shieldSection, shieldSection2)) {
                    switch (WhenMappings.$EnumSwitchMapping$0[shieldSection.getSectionPositionType().ordinal()]) {
                        case 1:
                            shieldSection.setSectionPositionType(PositionType.FIRST);
                            break;
                        case 2:
                            shieldSection.setSectionPositionType(PositionType.MIDDLE);
                            break;
                    }
                    switch (WhenMappings.$EnumSwitchMapping$1[shieldSection2.getSectionPositionType().ordinal()]) {
                        case 1:
                            shieldSection2.setSectionPositionType(PositionType.LAST);
                            return;
                        case 2:
                            shieldSection2.setSectionPositionType(PositionType.MIDDLE);
                            return;
                        case 3:
                            shieldSection2.setSectionPositionType(PositionType.LAST);
                            return;
                        default:
                            return;
                    }
                }
                switch (WhenMappings.$EnumSwitchMapping$2[shieldSection.getSectionPositionType().ordinal()]) {
                    case 1:
                        shieldSection.setSectionPositionType(PositionType.SINGLE);
                        break;
                    case 2:
                        shieldSection.setSectionPositionType(PositionType.LAST);
                        break;
                }
                switch (WhenMappings.$EnumSwitchMapping$3[shieldSection2.getSectionPositionType().ordinal()]) {
                    case 1:
                        shieldSection2.setSectionPositionType(PositionType.SINGLE);
                        return;
                    case 2:
                        shieldSection2.setSectionPositionType(PositionType.FIRST);
                        return;
                    case 3:
                        shieldSection2.setSectionPositionType(PositionType.SINGLE);
                        return;
                    default:
                        return;
                }
            }
            shieldSection2.setSectionPositionType(PositionType.SINGLE);
        }

        @JvmStatic
        @NotNull
        public final ShieldDisplayNode repackDisplayNodeWithPositionType(@NotNull ShieldDisplayNode shieldDisplayNode, @NotNull ProcessorHolder processorHolder) {
            Object[] objArr = {shieldDisplayNode, processorHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f4d52bf5382f1c8761efe311142325", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f4d52bf5382f1c8761efe311142325");
            }
            h.b(shieldDisplayNode, "dNode");
            h.b(processorHolder, "holder");
            processorHolder.getDividerProcessorChain().startProcessor(shieldDisplayNode);
            processorHolder.getWaterfallMarginProcessorChain().startProcessor(shieldDisplayNode);
            return shieldDisplayNode;
        }

        @JvmStatic
        @NotNull
        public final View createDefaultView(@NotNull Context context, @NotNull String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "081bf4a9fbb07f06df777167c61ecc4d", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "081bf4a9fbb07f06df777167c61ecc4d");
            }
            h.b(context, "context");
            h.b(str, "text");
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setPadding(aq.a(context, 10.0f), aq.a(context, 10.0f), aq.a(context, 10.0f), aq.a(context, 10.0f));
            textView.setText(str);
            return textView;
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyCellId(@NotNull af afVar) {
            Object[] objArr = {afVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9bb62bb5fc1aa068eef09f74d06fea8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9bb62bb5fc1aa068eef09f74d06fea8");
            }
            h.b(afVar, "sci");
            return afVar.hashCode() + "_cell";
        }

        @JvmStatic
        @NotNull
        public final String geneLegacySectionId(@NotNull af afVar, int i) {
            Object[] objArr = {afVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719029cfe30af05c5ae2f2dc67cff516", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719029cfe30af05c5ae2f2dc67cff516");
            }
            h.b(afVar, "sci");
            return afVar.hashCode() + "_section" + i;
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyRowId(@NotNull af afVar, int i, int i2) {
            Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "064f6b1e408b0576a3c2f24d365010f1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "064f6b1e408b0576a3c2f24d365010f1");
            }
            h.b(afVar, "sci");
            return afVar.hashCode() + "_section" + i + "_row" + i2;
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyRowId(@NotNull af afVar, int i, @NotNull CellType cellType) {
            String str;
            Object[] objArr = {afVar, Integer.valueOf(i), cellType};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5ba946932533239a947c57926bf0c15", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5ba946932533239a947c57926bf0c15");
            }
            h.b(afVar, "sci");
            h.b(cellType, "cellType");
            StringBuilder sb = new StringBuilder();
            sb.append(afVar.hashCode());
            sb.append("_section");
            sb.append(i);
            sb.append('_');
            switch (WhenMappings.$EnumSwitchMapping$4[cellType.ordinal()]) {
                case 1:
                    str = "loading";
                    break;
                case 2:
                    str = "loadingmore";
                    break;
                case 3:
                    str = TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER;
                    break;
                case 4:
                    str = "footer";
                    break;
                case 5:
                    str = "normal";
                    break;
                default:
                    throw new j();
            }
            sb.append(str);
            return sb.toString();
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyRowIdWithData(@NotNull af afVar, int i, int i2, @NotNull Object obj) {
            Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ad3f77858b7e8d816af8d63b1479db", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ad3f77858b7e8d816af8d63b1479db");
            }
            h.b(afVar, "sci");
            h.b(obj, "data");
            return afVar.hashCode() + "_section" + i + "_row" + i2 + "_withdata" + obj.hashCode();
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyViewId(@NotNull af afVar, int i, int i2) {
            Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34de9944f966b1949c839ae5ca82f42e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34de9944f966b1949c839ae5ca82f42e");
            }
            h.b(afVar, "sci");
            return afVar.hashCode() + "_section" + i + "_row" + i2 + "_view";
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyViewId(@NotNull af afVar, int i, @NotNull CellType cellType) {
            String str;
            Object[] objArr = {afVar, Integer.valueOf(i), cellType};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f9a6cfe067f92807efe260719cf7023", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f9a6cfe067f92807efe260719cf7023");
            }
            h.b(afVar, "sci");
            h.b(cellType, "cellType");
            StringBuilder sb = new StringBuilder();
            sb.append(afVar.hashCode());
            sb.append("_section");
            sb.append(i);
            sb.append('_');
            switch (WhenMappings.$EnumSwitchMapping$5[cellType.ordinal()]) {
                case 1:
                    str = "loading";
                    break;
                case 2:
                    str = "loadingmore";
                    break;
                case 3:
                    str = TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER;
                    break;
                case 4:
                    str = "footer";
                    break;
                case 5:
                    str = "normal";
                    break;
                default:
                    throw new j();
            }
            sb.append(str);
            sb.append("_view");
            return sb.toString();
        }

        @JvmStatic
        @NotNull
        public final String geneLegacyViewIdWithData(@NotNull af afVar, int i, int i2, @NotNull Object obj) {
            Object[] objArr = {afVar, Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dd354a2465700623ce82ba2a0656060", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dd354a2465700623ce82ba2a0656060");
            }
            h.b(afVar, "sci");
            h.b(obj, "data");
            return afVar.hashCode() + "_section" + i + "_row" + i2 + "_view_withdata" + obj.hashCode();
        }

        @JvmStatic
        @Nullable
        public final String revertViewType(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0098f937ac981692f3370e630f7516a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0098f937ac981692f3370e630f7516a5");
            }
            if (str != null) {
                h.b(str, "$this$substringAfterLast");
                h.b("*", "delimiter");
                h.b(str, "missingDelimiterValue");
                int b = g.b(str, "*", 0, false, 6, null);
                if (b == -1) {
                    return str;
                }
                String substring = str.substring(b + "*".length(), str.length());
                h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            return null;
        }
    }
}
