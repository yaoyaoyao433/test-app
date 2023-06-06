package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.dataupload.AlitaModelDataUploadConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    List<AlitaModelDataUploadConfig.a> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c5d3c9b3b6d631c05433de388de4f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c5d3c9b3b6d631c05433de388de4f5");
        } else {
            this.b = new ArrayList();
        }
    }

    public final boolean a(@Nullable AlitaModelDataUploadConfig.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e7686357e5361a5414a8d8f79351e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e7686357e5361a5414a8d8f79351e4")).booleanValue();
        }
        for (AlitaModelDataUploadConfig.a aVar2 : this.b) {
            if (aVar2 != null && aVar2.a(aVar)) {
                return true;
            }
        }
        return false;
    }
}
