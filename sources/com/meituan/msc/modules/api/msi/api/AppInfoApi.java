package com.meituan.msc.modules.api.msi.api;

import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.update.f;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class AppInfoApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class AccountInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public MiniProgram miniProgram = new MiniProgram();

        /* compiled from: ProGuard */
        @MsiSupport
        /* loaded from: classes3.dex */
        public static class MiniProgram {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String appId;
            public String appName;
            public String envVersion;
            public String icon;
            public String release;
            public String version;
        }
    }

    @MsiApiMethod(name = "getAccountInfoSync", response = AccountInfo.class)
    public AccountInfo getAccountInfoSync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2aa752078577c0d3e9c2d31f681dda", RobustBitConfig.DEFAULT_VALUE)) {
            return (AccountInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2aa752078577c0d3e9c2d31f681dda");
        }
        AccountInfo accountInfo = new AccountInfo();
        h hVar = this.c;
        f fVar = hVar.r;
        if (fVar.v()) {
            AccountInfo.MiniProgram miniProgram = accountInfo.miniProgram;
            miniProgram.appName = fVar.k();
            miniProgram.appId = hVar.a();
            String y = fVar.y();
            if (y == null) {
                y = "";
            }
            miniProgram.version = y;
            miniProgram.release = fVar.w();
            miniProgram.icon = fVar.l();
            miniProgram.envVersion = fVar.x() ? "develop" : "release";
        }
        return accountInfo;
    }
}
