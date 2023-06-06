package com.sankuai.waimai.addrsdk;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "664387f43874dc5507d2f1d45cdf1479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "664387f43874dc5507d2f1d45cdf1479");
        } else {
            com.sankuai.waimai.addrsdk.manager.a.a().b = str;
        }
    }

    public static boolean a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39f964878bc5a6b3afa88706d706ec7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39f964878bc5a6b3afa88706d706ec7a")).booleanValue();
        }
        String str = com.sankuai.waimai.addrsdk.manager.a.a().b;
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c736f862c507b949d9ef3d05a8d2a636", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c736f862c507b949d9ef3d05a8d2a636")).booleanValue();
            } else {
                com.sankuai.waimai.addrsdk.manager.a a2 = com.sankuai.waimai.addrsdk.manager.a.a();
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.addrsdk.manager.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "c083d2c2f594aaff338608e5d403b95c", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "c083d2c2f594aaff338608e5d403b95c")).booleanValue();
                } else {
                    z = a2.e != null && a2.e.size() > 0 && a2.e.containsKey(str);
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
