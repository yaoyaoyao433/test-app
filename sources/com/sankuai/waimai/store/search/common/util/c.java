package com.sankuai.waimai.store.search.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static int a(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9d68c6437f360c32afabfcb0bb99116", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9d68c6437f360c32afabfcb0bb99116")).intValue();
        }
        if (i == 3) {
            return 0;
        }
        if (i == 1 || i == 2) {
            if (str == null || str.length() <= 0) {
                return 1;
            }
            if (i2 == 0) {
                return 2;
            }
            return i2 == 1 ? 3 : 1;
        }
        return -1;
    }

    public static int a(BaseProductPoi baseProductPoi) {
        Object[] objArr = {baseProductPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0a20af1101eb0eba4f69b2d6c805e38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0a20af1101eb0eba4f69b2d6c805e38")).intValue();
        }
        if (baseProductPoi == null || baseProductPoi.poiInfoItem == null) {
            return -1;
        }
        BaseProductPoi.a aVar = baseProductPoi.poiInfoItem;
        return a(aVar.i, aVar.t != null ? aVar.t.a : null, aVar.t != null ? aVar.t.c : 0);
    }
}
