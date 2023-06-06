package com.meituan.android.ptcommonim.utils;

import android.text.TextUtils;
import com.meituan.android.ptcommonim.model.PTIMExtensionBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.model.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static List<PTIMExtensionBean.Attacher> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d81e336a4de3585b05a6e0f2d7661c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d81e336a4de3585b05a6e0f2d7661c8");
        }
        try {
            return b(JsonHelper.getString(JsonHelper.toJSONObject(str), "extension"));
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static List<PTIMExtensionBean.Attacher> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        List<PTIMExtensionBean.Attacher> list = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ac43b6e475e9525b1691ee4836612e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ac43b6e475e9525b1691ee4836612e2");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PTIMExtensionBean pTIMExtensionBean = (PTIMExtensionBean) JsonHelper.fromJsonString(str, PTIMExtensionBean.class);
            if (pTIMExtensionBean.getPlatformConfig() != null) {
                List<PTIMExtensionBean.Attacher> attacherList = pTIMExtensionBean.getPlatformConfig().getAttacherList();
                try {
                    return !CollectionUtils.isEmpty(attacherList) ? attacherList : attacherList;
                } catch (Exception e) {
                    e = e;
                    list = attacherList;
                    e.getMessage();
                    return list;
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static PTIMExtensionBean.Attacher a(List<PTIMExtensionBean.Attacher> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67eaa2fdf74a3bca63df1faeb830cce3", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTIMExtensionBean.Attacher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67eaa2fdf74a3bca63df1faeb830cce3");
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (PTIMExtensionBean.Attacher attacher : list) {
                if (TextUtils.equals(attacher.getType(), str)) {
                    return attacher;
                }
            }
        }
        return null;
    }

    public static PTIMExtensionBean.Attacher a(List<PTIMExtensionBean.Attacher> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24489f18f40463ce691ce15ef00b8a87", RobustBitConfig.DEFAULT_VALUE) ? (PTIMExtensionBean.Attacher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24489f18f40463ce691ce15ef00b8a87") : a(list, "refuse");
    }
}
