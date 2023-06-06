package com.dianping.shield.dynamic.model.vc;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"addToBundle", "", "Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "bundle", "Landroid/os/Bundle;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DragRefreshInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void addToBundle(@NotNull DragRefreshInfo dragRefreshInfo, @NotNull Bundle bundle) {
        Object[] objArr = {dragRefreshInfo, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4739f10b0647814342eb84c2c9a4a225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4739f10b0647814342eb84c2c9a4a225");
            return;
        }
        h.b(dragRefreshInfo, "receiver$0");
        h.b(bundle, "bundle");
        Boolean hasDragRefresh = dragRefreshInfo.getHasDragRefresh();
        if (hasDragRefresh != null) {
            bundle.putBoolean("hasDragRefresh", hasDragRefresh.booleanValue());
        }
        Integer offset = dragRefreshInfo.getOffset();
        if (offset != null) {
            bundle.putInt("offset", offset.intValue());
        }
    }
}
