package com.meituan.android.ptcommonim.quickbutton;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.session.SessionId;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55a050cfeba56a62d8461a4f8386b3fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55a050cfeba56a62d8461a4f8386b3fb");
        }
        String string = JsonHelper.getString(sessionId != null ? sessionId.a() : null, "chatType");
        return TextUtils.isEmpty(string) ? "-999" : string;
    }

    public static String a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        PTIMCommonBean.UserType userType = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5b05d7444a0c3ed16dc798a92a60224", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5b05d7444a0c3ed16dc798a92a60224");
        }
        if (map != null && (map.get("user_type") instanceof PTIMCommonBean.UserType)) {
            userType = (PTIMCommonBean.UserType) map.get("user_type");
        }
        return userType == PTIMCommonBean.UserType.TYPE_B ? "商家" : userType == PTIMCommonBean.UserType.TYPE_C ? "用户" : "-999";
    }
}
