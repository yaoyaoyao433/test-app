package com.dianping.shield.dynamic.model.extra;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"addToBundle", "", "Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "bundle", "Landroid/os/Bundle;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class MPTInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void addToBundle(@NotNull MPTInfo mPTInfo, @NotNull Bundle bundle) {
        Object[] objArr = {mPTInfo, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d655f16ca7ef9db9e5627dd377e89d29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d655f16ca7ef9db9e5627dd377e89d29");
            return;
        }
        h.b(mPTInfo, "receiver$0");
        h.b(bundle, "bundle");
        String category = mPTInfo.getCategory();
        if (category != null) {
            bundle.putString("category", category);
        }
        String cid = mPTInfo.getCid();
        if (cid != null) {
            bundle.putString("cid", cid);
        }
        HashMap<String, Object> labs = mPTInfo.getLabs();
        if (labs != null) {
            bundle.putSerializable("labs", labs);
        }
    }
}
