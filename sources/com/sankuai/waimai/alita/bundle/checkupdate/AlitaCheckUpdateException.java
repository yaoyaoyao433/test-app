package com.sankuai.waimai.alita.bundle.checkupdate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaCheckUpdateException extends com.sankuai.waimai.alita.bundle.exception.a {
    public static ChangeQuickRedirect a = null;
    public static String b = "AlitaCheckUpdateException";

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ErrorType {
    }

    @Override // com.sankuai.waimai.alita.bundle.exception.a
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0439682efc1f42b340aafc2334d5201", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0439682efc1f42b340aafc2334d5201");
        }
        switch (i) {
            case 16000:
                return "checkUpdate接口正在请求中";
            case 16001:
                return "checkUpdate接口请求成功";
            case 16002:
                return "checkUpdate接口请求失败";
            case 16003:
                return "checkUpdate接口请求成功但是不包含该模板";
            default:
                return "未知错误";
        }
    }
}
