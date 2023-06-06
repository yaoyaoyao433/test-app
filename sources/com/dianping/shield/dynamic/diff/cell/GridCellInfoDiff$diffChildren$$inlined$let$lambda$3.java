package com.dianping.shield.dynamic.diff.cell;

import com.dianping.shield.component.extensions.grid.GridRowItem;
import com.dianping.shield.dynamic.diff.view.ExtraReusableViewInfoDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;", AdvanceSetting.NETWORK_TYPE, "invoke", "com/dianping/shield/dynamic/diff/cell/GridCellInfoDiff$diffChildren$2$1"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridCellInfoDiff$diffChildren$$inlined$let$lambda$3 extends i implements b<ExtraReusableViewInfo, DynamicViewItem<ExtraReusableViewInfo>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GridRowItem $computingItem$inlined;
    public final /* synthetic */ GridCellInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridCellInfoDiff$diffChildren$$inlined$let$lambda$3(GridCellInfoDiff gridCellInfoDiff, GridRowItem gridRowItem) {
        super(1);
        this.this$0 = gridCellInfoDiff;
        this.$computingItem$inlined = gridRowItem;
    }

    @Override // kotlin.jvm.functions.b
    @NotNull
    public final DynamicViewItem<ExtraReusableViewInfo> invoke(@NotNull ExtraReusableViewInfo extraReusableViewInfo) {
        Object[] objArr = {extraReusableViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c60b02885e5f00a2833d5c998313711f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c60b02885e5f00a2833d5c998313711f");
        }
        h.b(extraReusableViewInfo, AdvanceSetting.NETWORK_TYPE);
        return new DynamicViewItem<>(new ExtraReusableViewInfoDiff(this.this$0.getHostChassis()));
    }
}
