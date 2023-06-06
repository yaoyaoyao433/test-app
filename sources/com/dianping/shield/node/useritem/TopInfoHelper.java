package com.dianping.shield.node.useritem;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.TopPositionInterface;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/node/useritem/TopInfoHelper;", "", "()V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TopInfoHelper {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @JvmStatic
    @NotNull
    public static final TopInfo.EndType createEndType(@Nullable TopPositionInterface.AutoStopTop autoStopTop) {
        Object[] objArr = {autoStopTop};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74299aae9f160fb48c9883ad613685c9", RobustBitConfig.DEFAULT_VALUE) ? (TopInfo.EndType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74299aae9f160fb48c9883ad613685c9") : Companion.createEndType(autoStopTop);
    }

    @JvmStatic
    @NotNull
    public static final TopInfo.StartType createStartType(@Nullable TopPositionInterface.AutoStartTop autoStartTop) {
        Object[] objArr = {autoStartTop};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa941993df309ee030d7e2d692149298", RobustBitConfig.DEFAULT_VALUE) ? (TopInfo.StartType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa941993df309ee030d7e2d692149298") : Companion.createStartType(autoStartTop);
    }

    @JvmStatic
    @NotNull
    public static final TopInfo createTopInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "939477914ed57e27e50709d286ce5ab5", RobustBitConfig.DEFAULT_VALUE) ? (TopInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "939477914ed57e27e50709d286ce5ab5") : Companion.createTopInfo();
    }

    @JvmStatic
    @NotNull
    public static final TopInfo createTopInfo(@NotNull TopPositionInterface.TopPositionInfo topPositionInfo) {
        Object[] objArr = {topPositionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ab3f5602d5793542343f6aed8e750a5", RobustBitConfig.DEFAULT_VALUE) ? (TopInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ab3f5602d5793542343f6aed8e750a5") : Companion.createTopInfo(topPositionInfo);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/node/useritem/TopInfoHelper$Companion;", "", "()V", "createEndType", "Lcom/dianping/shield/node/useritem/TopInfo$EndType;", "stopTop", "Lcom/dianping/shield/feature/TopPositionInterface$AutoStopTop;", "createStartType", "Lcom/dianping/shield/node/useritem/TopInfo$StartType;", "startTop", "Lcom/dianping/shield/feature/TopPositionInterface$AutoStartTop;", "createTopInfo", "Lcom/dianping/shield/node/useritem/TopInfo;", "topPositionInfo", "Lcom/dianping/shield/feature/TopPositionInterface$TopPositionInfo;", "parseState", "Lcom/dianping/shield/layoutmanager/TopLinearLayoutManager$TopState;", "hoverState", "Lcom/dianping/shield/node/useritem/HoverState;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                int[] iArr = new int[HoverState.valuesCustom().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[HoverState.HOVER.ordinal()] = 1;
                $EnumSwitchMapping$0[HoverState.NORMAL.ordinal()] = 2;
                $EnumSwitchMapping$0[HoverState.END.ordinal()] = 3;
                int[] iArr2 = new int[TopPositionInterface.AutoStartTop.valuesCustom().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[TopPositionInterface.AutoStartTop.SELF.ordinal()] = 1;
                $EnumSwitchMapping$1[TopPositionInterface.AutoStartTop.ALWAYS.ordinal()] = 2;
                int[] iArr3 = new int[TopPositionInterface.AutoStopTop.valuesCustom().length];
                $EnumSwitchMapping$2 = iArr3;
                iArr3[TopPositionInterface.AutoStopTop.NONE.ordinal()] = 1;
                $EnumSwitchMapping$2[TopPositionInterface.AutoStopTop.MODULE.ordinal()] = 2;
                $EnumSwitchMapping$2[TopPositionInterface.AutoStopTop.SECTION.ordinal()] = 3;
                $EnumSwitchMapping$2[TopPositionInterface.AutoStopTop.CELL.ordinal()] = 4;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TopInfo createTopInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77472eeaa31410de0ee1547e5cf7bc3", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77472eeaa31410de0ee1547e5cf7bc3");
            }
            TopInfo topInfo = new TopInfo();
            topInfo.startType = TopInfo.StartType.SELF;
            topInfo.endType = TopInfo.EndType.NONE;
            return topInfo;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.dianping.shield.node.useritem.TopInfo] */
        @JvmStatic
        @NotNull
        public final TopInfo createTopInfo(@NotNull final TopPositionInterface.TopPositionInfo topPositionInfo) {
            Object[] objArr = {topPositionInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf3b122a5e432d8d56cfbcf866709bb", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf3b122a5e432d8d56cfbcf866709bb");
            }
            h.b(topPositionInfo, "topPositionInfo");
            final t.b bVar = new t.b();
            bVar.a = new TopInfo();
            ((TopInfo) bVar.a).needAutoOffset = topPositionInfo.needAutoOffset;
            ((TopInfo) bVar.a).offset = topPositionInfo.offset;
            ((TopInfo) bVar.a).startType = TopInfoHelper.Companion.createStartType(topPositionInfo.startTop);
            ((TopInfo) bVar.a).endType = TopInfoHelper.Companion.createEndType(topPositionInfo.stopTop);
            ((TopInfo) bVar.a).zPosition = topPositionInfo.zPosition;
            ((TopInfo) bVar.a).onTopStateChangeListener = new TopInfo.OnTopStateChangeListener() { // from class: com.dianping.shield.node.useritem.TopInfoHelper$Companion$createTopInfo$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.useritem.TopInfo.OnTopStateChangeListener
                public final void onTopStageChanged(@Nullable ShieldViewHolder shieldViewHolder, @Nullable CellType cellType, int i, int i2, @Nullable HoverState hoverState) {
                    Object[] objArr2 = {shieldViewHolder, cellType, Integer.valueOf(i), Integer.valueOf(i2), hoverState};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb3536a4c991f102e066bda529fce146", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb3536a4c991f102e066bda529fce146");
                        return;
                    }
                    TopPositionInterface.OnTopStateChangeListener onTopStateChangeListener = topPositionInfo.onTopStateChangeListener;
                    if (onTopStateChangeListener != null) {
                        onTopStateChangeListener.onTopStageChanged(cellType, i, i2, TopInfoHelper.Companion.parseState(hoverState));
                    }
                }
            };
            return (TopInfo) bVar.a;
        }

        @NotNull
        public final TopLinearLayoutManager.TopState parseState(@Nullable HoverState hoverState) {
            Object[] objArr = {hoverState};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d39417d010f042743dc62e111bd0112", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopLinearLayoutManager.TopState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d39417d010f042743dc62e111bd0112");
            }
            if (hoverState != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[hoverState.ordinal()]) {
                    case 1:
                        return TopLinearLayoutManager.TopState.TOP;
                    case 2:
                        return TopLinearLayoutManager.TopState.NORMAL;
                    case 3:
                        return TopLinearLayoutManager.TopState.ENDING_TOP;
                    default:
                        throw new j();
                }
            }
            return TopLinearLayoutManager.TopState.NORMAL;
        }

        @JvmStatic
        @NotNull
        public final TopInfo.StartType createStartType(@Nullable TopPositionInterface.AutoStartTop autoStartTop) {
            Object[] objArr = {autoStartTop};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "235942fda575eeeed14059d4dc9695d3", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopInfo.StartType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "235942fda575eeeed14059d4dc9695d3");
            }
            if (autoStartTop != null) {
                switch (WhenMappings.$EnumSwitchMapping$1[autoStartTop.ordinal()]) {
                    case 1:
                        return TopInfo.StartType.SELF;
                    case 2:
                        return TopInfo.StartType.ALWAYS;
                }
            }
            return TopInfo.StartType.SELF;
        }

        @JvmStatic
        @NotNull
        public final TopInfo.EndType createEndType(@Nullable TopPositionInterface.AutoStopTop autoStopTop) {
            Object[] objArr = {autoStopTop};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70ba5877939525c3cd1c0ba77f450b39", RobustBitConfig.DEFAULT_VALUE)) {
                return (TopInfo.EndType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70ba5877939525c3cd1c0ba77f450b39");
            }
            if (autoStopTop != null) {
                switch (WhenMappings.$EnumSwitchMapping$2[autoStopTop.ordinal()]) {
                    case 1:
                        return TopInfo.EndType.NONE;
                    case 2:
                        return TopInfo.EndType.MODULE;
                    case 3:
                        return TopInfo.EndType.SECTION;
                    case 4:
                        return TopInfo.EndType.CELL;
                }
            }
            return TopInfo.EndType.NONE;
        }
    }
}
