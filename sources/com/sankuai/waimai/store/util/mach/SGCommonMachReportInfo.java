package com.sankuai.waimai.store.util.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGCommonMachReportInfo {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface SGErrorCode {
    }

    public SGCommonMachReportInfo(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f30a1ea62bde88b1a6ac32b0bb24077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f30a1ea62bde88b1a6ac32b0bb24077");
        } else if (a.a() && t.a(str)) {
            throw new IllegalArgumentException("SGModuleId cannot be empty!");
        } else {
            this.b = str;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf773259a01d8e7311c215da5c18b754", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf773259a01d8e7311c215da5c18b754");
        }
        return "SGCustomLog { SGModuleId='" + this.b + "', WMErrorCode='" + this.c + "', SGErrorCode=" + this.d + ", TemplateId='" + this.e + "', ExceptionMsg='" + this.i + "'}";
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20299a41f2326767dc5b1011c639765e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20299a41f2326767dc5b1011c639765e");
        }
        return "SGCustomDescribe {SGModuleId='" + this.b + "', WMErrorCode='" + this.c + "', SGErrorCode=" + this.d + ", TemplateId='" + this.e + "', ExceptionMsg='" + this.i + "', ExprErrorKey='" + this.f + "', ExprErrorValue='" + this.g + "'}";
    }
}
