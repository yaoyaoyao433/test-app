package com.sankuai.waimai.mach.manager_new.download;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PresetLoadException extends com.sankuai.waimai.mach.manager.exception.a {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624d6da31476cd58119d4566dfdb48ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624d6da31476cd58119d4566dfdb48ca");
        }
        switch (i) {
            case 10001:
                return "zip文件不存在";
            case 10002:
                return "zip解压失败";
            case 10003:
                return "文件读取失败";
            default:
                return "未知错误";
        }
    }

    public PresetLoadException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db574d7bf5f19b448fc1b224a23ec965", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db574d7bf5f19b448fc1b224a23ec965");
        }
    }
}
