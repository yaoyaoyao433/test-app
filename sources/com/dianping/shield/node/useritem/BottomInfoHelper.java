package com.dianping.shield.node.useritem;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.BottomPositionInterface;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.useritem.BottomInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/node/useritem/BottomInfoHelper;", "", "()V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BottomInfoHelper {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @JvmStatic
    @NotNull
    public static final BottomInfo createBottomInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffe8c2e31681230873ef8ad1b932b0c3", RobustBitConfig.DEFAULT_VALUE) ? (BottomInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffe8c2e31681230873ef8ad1b932b0c3") : Companion.createBottomInfo();
    }

    @JvmStatic
    @NotNull
    public static final BottomInfo createBottomInfo(@NotNull BottomPositionInterface.BottomPositionInfo bottomPositionInfo) {
        Object[] objArr = {bottomPositionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "323e91ca30f548af60aa37ba91d55c3b", RobustBitConfig.DEFAULT_VALUE) ? (BottomInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "323e91ca30f548af60aa37ba91d55c3b") : Companion.createBottomInfo(bottomPositionInfo);
    }

    @JvmStatic
    @NotNull
    public static final BottomInfo.EndType createEndType(@Nullable BottomPositionInterface.AutoStopBottom autoStopBottom) {
        Object[] objArr = {autoStopBottom};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9640ccfdf94de953930ceb52fbe52e0d", RobustBitConfig.DEFAULT_VALUE) ? (BottomInfo.EndType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9640ccfdf94de953930ceb52fbe52e0d") : Companion.createEndType(autoStopBottom);
    }

    @JvmStatic
    @NotNull
    public static final BottomInfo.StartType createStartType(@Nullable BottomPositionInterface.AutoStartBottom autoStartBottom) {
        Object[] objArr = {autoStartBottom};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c700405d26d901a59e84ede15f3edc41", RobustBitConfig.DEFAULT_VALUE) ? (BottomInfo.StartType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c700405d26d901a59e84ede15f3edc41") : Companion.createStartType(autoStartBottom);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/node/useritem/BottomInfoHelper$Companion;", "", "()V", "createBottomInfo", "Lcom/dianping/shield/node/useritem/BottomInfo;", "bottomPositionInfo", "Lcom/dianping/shield/feature/BottomPositionInterface$BottomPositionInfo;", "createEndType", "Lcom/dianping/shield/node/useritem/BottomInfo$EndType;", "stopBottom", "Lcom/dianping/shield/feature/BottomPositionInterface$AutoStopBottom;", "createStartType", "Lcom/dianping/shield/node/useritem/BottomInfo$StartType;", "startBottom", "Lcom/dianping/shield/feature/BottomPositionInterface$AutoStartBottom;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                int[] iArr = new int[BottomPositionInterface.AutoStartBottom.valuesCustom().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[BottomPositionInterface.AutoStartBottom.SELF.ordinal()] = 1;
                $EnumSwitchMapping$0[BottomPositionInterface.AutoStartBottom.ALWAYS.ordinal()] = 2;
                int[] iArr2 = new int[BottomPositionInterface.AutoStopBottom.valuesCustom().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[BottomPositionInterface.AutoStopBottom.NONE.ordinal()] = 1;
                $EnumSwitchMapping$1[BottomPositionInterface.AutoStopBottom.MODULE.ordinal()] = 2;
                $EnumSwitchMapping$1[BottomPositionInterface.AutoStopBottom.SECTION.ordinal()] = 3;
                $EnumSwitchMapping$1[BottomPositionInterface.AutoStopBottom.CELL.ordinal()] = 4;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BottomInfo createBottomInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ac10feec9acb42a0aa61d21aaf80a43", RobustBitConfig.DEFAULT_VALUE)) {
                return (BottomInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ac10feec9acb42a0aa61d21aaf80a43");
            }
            BottomInfo bottomInfo = new BottomInfo();
            bottomInfo.startType = BottomInfo.StartType.ALWAYS;
            bottomInfo.endType = BottomInfo.EndType.NONE;
            return bottomInfo;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, com.dianping.shield.node.useritem.BottomInfo] */
        @JvmStatic
        @NotNull
        public final BottomInfo createBottomInfo(@NotNull final BottomPositionInterface.BottomPositionInfo bottomPositionInfo) {
            Object[] objArr = {bottomPositionInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7310f6a375248f27a05a63375aeb9bc2", RobustBitConfig.DEFAULT_VALUE)) {
                return (BottomInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7310f6a375248f27a05a63375aeb9bc2");
            }
            h.b(bottomPositionInfo, "bottomPositionInfo");
            final t.b bVar = new t.b();
            bVar.a = new BottomInfo();
            ((BottomInfo) bVar.a).needAutoOffset = bottomPositionInfo.needAutoOffset;
            ((BottomInfo) bVar.a).offset = bottomPositionInfo.offset;
            ((BottomInfo) bVar.a).startType = BottomInfoHelper.Companion.createStartType(bottomPositionInfo.startBottom);
            ((BottomInfo) bVar.a).endType = BottomInfoHelper.Companion.createEndType(bottomPositionInfo.stopBottom);
            ((BottomInfo) bVar.a).zPosition = bottomPositionInfo.zPosition;
            ((BottomInfo) bVar.a).onBottomStateChangeListener = new BottomInfo.OnBottomStateChangeListener() { // from class: com.dianping.shield.node.useritem.BottomInfoHelper$Companion$createBottomInfo$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.useritem.BottomInfo.OnBottomStateChangeListener
                public final void onBottomStageChanged(@Nullable ShieldViewHolder shieldViewHolder, @Nullable CellType cellType, int i, int i2, @Nullable HoverState hoverState) {
                    Object[] objArr2 = {shieldViewHolder, cellType, Integer.valueOf(i), Integer.valueOf(i2), hoverState};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8cef029a5f455ba7124adda1c0300cc1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8cef029a5f455ba7124adda1c0300cc1");
                        return;
                    }
                    BottomPositionInterface.OnBottomStateChangeListener onBottomStateChangeListener = bottomPositionInfo.onBottomStateChangeListener;
                    if (onBottomStateChangeListener != null) {
                        onBottomStateChangeListener.onBottomStageChanged(cellType, i, i2, hoverState);
                    }
                }
            };
            return (BottomInfo) bVar.a;
        }

        @JvmStatic
        @NotNull
        public final BottomInfo.StartType createStartType(@Nullable BottomPositionInterface.AutoStartBottom autoStartBottom) {
            Object[] objArr = {autoStartBottom};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1b9961980be05c4276e7ba80cbcd47f", RobustBitConfig.DEFAULT_VALUE)) {
                return (BottomInfo.StartType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1b9961980be05c4276e7ba80cbcd47f");
            }
            if (autoStartBottom != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[autoStartBottom.ordinal()]) {
                    case 1:
                        return BottomInfo.StartType.SELF;
                    case 2:
                        return BottomInfo.StartType.ALWAYS;
                }
            }
            return BottomInfo.StartType.SELF;
        }

        @JvmStatic
        @NotNull
        public final BottomInfo.EndType createEndType(@Nullable BottomPositionInterface.AutoStopBottom autoStopBottom) {
            Object[] objArr = {autoStopBottom};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e5b2168440aa183b81d13e1544f0ceb", RobustBitConfig.DEFAULT_VALUE)) {
                return (BottomInfo.EndType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e5b2168440aa183b81d13e1544f0ceb");
            }
            if (autoStopBottom != null) {
                switch (WhenMappings.$EnumSwitchMapping$1[autoStopBottom.ordinal()]) {
                    case 1:
                        return BottomInfo.EndType.NONE;
                    case 2:
                        return BottomInfo.EndType.MODULE;
                    case 3:
                        return BottomInfo.EndType.SECTION;
                    case 4:
                        return BottomInfo.EndType.CELL;
                }
            }
            return BottomInfo.EndType.NONE;
        }
    }
}
