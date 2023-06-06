package com.sankuai.waimai.mach.manager_new.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class _CheckUpdateException extends com.sankuai.waimai.mach.manager.exception.a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ErrorType {
    }

    @Override // com.sankuai.waimai.mach.manager.exception.a
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33442f6eeb34f7e7282ab862b8d64a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33442f6eeb34f7e7282ab862b8d64a5");
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

    public _CheckUpdateException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f08ec64418791b97d6f67a07fee95ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f08ec64418791b97d6f67a07fee95ae");
        }
    }
}
