package com.dianping.shield.component.extensions.grid;

import com.dianping.picassomodule.widget.cssgrid.c;
import com.dianping.picassomodule.widget.cssgrid.d;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/shield/component/extensions/grid/GridShieldRow;", "Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "()V", "gridDescription", "Lcom/dianping/picassomodule/widget/cssgrid/GridDescription;", "gridDrawInfo", "Lcom/dianping/picassomodule/widget/cssgrid/GridDrawInfo;", "recommendItemHeight", "", "rowWidth", KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridShieldRow extends CommonContainerRow {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public c gridDescription;
    @JvmField
    @Nullable
    public d gridDrawInfo;
    @JvmField
    public int recommendItemHeight;
    @JvmField
    public int rowWidth;

    public GridShieldRow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1989b0de2ec1122425dad3ed6b91d9e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1989b0de2ec1122425dad3ed6b91d9e4");
        } else {
            this.rowWidth = -1;
        }
    }

    @Override // com.dianping.shield.component.extensions.common.CommonContainerRow, com.dianping.shield.node.cellnode.ShieldRow
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71de7276f49e8582bac815b311e71ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71de7276f49e8582bac815b311e71ac7");
            return;
        }
        super.clear();
        this.recommendItemHeight = 0;
        this.rowWidth = -1;
        this.gridDescription = null;
        this.gridDrawInfo = null;
    }
}
