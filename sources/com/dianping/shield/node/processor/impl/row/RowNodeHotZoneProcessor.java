package com.dianping.shield.node.processor.impl.row;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.hotzone.HotZone;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.hotzone.OnHotZoneStateChangeListener;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.itemcallbacks.HotZoneStateChangeCallBack;
import com.dianping.shield.node.useritem.HotZoneInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/impl/row/RowNodeHotZoneProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "isInHotZone", "hotZoneLocation", "Lcom/dianping/shield/node/adapter/hotzone/HotZoneLocation;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowNodeHotZoneProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[HotZoneLocation.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[HotZoneLocation.DETACHED.ordinal()] = 1;
            $EnumSwitchMapping$0[HotZoneLocation.US_US.ordinal()] = 2;
            $EnumSwitchMapping$0[HotZoneLocation.BE_BE.ordinal()] = 3;
        }
    }

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull final RowItem rowItem, @NotNull ShieldRow shieldRow) {
        ArrayList<HotZoneInfo> arrayList;
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be4f7cd930dc20b985e60fe0ce684fbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be4f7cd930dc20b985e60fe0ce684fbe")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        ArrayList<HotZone> hotZoneArray = shieldRow.getHotZoneArray();
        if (hotZoneArray != null) {
            hotZoneArray.clear();
        } else {
            shieldRow.setHotZoneArray(new ArrayList<>());
        }
        final ArrayList<HotZone> hotZoneArray2 = shieldRow.getHotZoneArray();
        if (hotZoneArray2 != null && (arrayList = rowItem.hotZoneArrayList) != null) {
            ArrayList<HotZoneInfo> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                HotZoneInfo hotZoneInfo = (HotZoneInfo) obj;
                if ((hotZoneInfo.callBackList == null || hotZoneInfo.callBackList.isEmpty()) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            for (final HotZoneInfo hotZoneInfo2 : arrayList2) {
                HotZone hotZone = new HotZone();
                hotZone.start = hotZoneInfo2.start;
                hotZone.end = hotZoneInfo2.end;
                hotZone.listenerArrayList = new ArrayList<>();
                hotZone.listenerArrayList.add(new OnHotZoneStateChangeListener() { // from class: com.dianping.shield.node.processor.impl.row.RowNodeHotZoneProcessor$handleRowItem$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.adapter.hotzone.OnHotZoneStateChangeListener
                    public final void onHotZoneStateChanged(int i, int i2, int i3, @Nullable ShieldDisplayNode shieldDisplayNode, @Nullable HotZone hotZone2, @Nullable HotZoneLocation hotZoneLocation, @Nullable HotZoneLocation hotZoneLocation2, @Nullable ScrollDirection scrollDirection) {
                        NodePath path;
                        NodePath path2;
                        NodePath path3;
                        NodePath path4;
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), shieldDisplayNode, hotZone2, hotZoneLocation, hotZoneLocation2, scrollDirection};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "730362038ef2908e71b7459afa224b8c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "730362038ef2908e71b7459afa224b8c");
                            return;
                        }
                        boolean isInHotZone = this.isInHotZone(hotZoneLocation);
                        boolean isInHotZone2 = this.isInHotZone(hotZoneLocation2);
                        if (isInHotZone != isInHotZone2) {
                            ArrayList<HotZoneStateChangeCallBack> arrayList3 = HotZoneInfo.this.callBackList;
                            h.a((Object) arrayList3, "hotZoneInfo.callBackList");
                            for (HotZoneStateChangeCallBack hotZoneStateChangeCallBack : arrayList3) {
                                Integer num = null;
                                if (isInHotZone2) {
                                    Integer valueOf = (shieldDisplayNode == null || (path2 = shieldDisplayNode.getPath()) == null) ? null : Integer.valueOf(path2.section);
                                    if (shieldDisplayNode != null && (path = shieldDisplayNode.getPath()) != null) {
                                        num = Integer.valueOf(path.row);
                                    }
                                    hotZoneStateChangeCallBack.scrollReach(valueOf, num, scrollDirection);
                                } else {
                                    Integer valueOf2 = (shieldDisplayNode == null || (path4 = shieldDisplayNode.getPath()) == null) ? null : Integer.valueOf(path4.section);
                                    if (shieldDisplayNode != null && (path3 = shieldDisplayNode.getPath()) != null) {
                                        num = Integer.valueOf(path3.row);
                                    }
                                    hotZoneStateChangeCallBack.scrollOut(valueOf2, num, scrollDirection);
                                }
                            }
                        }
                    }
                });
                hotZoneArray2.add(hotZone);
            }
        }
        return false;
    }

    public final boolean isInHotZone(@Nullable HotZoneLocation hotZoneLocation) {
        Object[] objArr = {hotZoneLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfb720b739abc4345823eb31a5b7b1f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfb720b739abc4345823eb31a5b7b1f1")).booleanValue();
        }
        if (hotZoneLocation != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[hotZoneLocation.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }
}
