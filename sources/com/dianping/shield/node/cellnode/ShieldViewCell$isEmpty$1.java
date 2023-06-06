package com.dianping.shield.node.cellnode;

import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.reflect.d;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldViewCell$isEmpty$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldViewCell$isEmpty$1(ShieldViewCell shieldViewCell) {
        super(shieldViewCell);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "cellItem";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddc01c6c47bf3b06e7d33c06baa7b049", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddc01c6c47bf3b06e7d33c06baa7b049") : u.a(ShieldViewCell.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getCellItem()Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeeb7a9a9a13582bc9fa665bf932dacf", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeeb7a9a9a13582bc9fa665bf932dacf") : ((ShieldViewCell) this.receiver).getCellItem();
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51d1b861ee1da7555d0dfc5b68b6b3f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51d1b861ee1da7555d0dfc5b68b6b3f0");
        } else {
            ((ShieldViewCell) this.receiver).setCellItem((ShieldSectionCellItem) obj);
        }
    }
}
