package com.meituan.msc.modules.api.msi.api;

import android.text.TextUtils;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class BackgroundApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class BackgroundColorParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String backgroundColor;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class BackgroundTextStyleParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        @MsiParamChecker(required = true)
        public String textStyle;
    }

    @MsiApiMethod(name = "setBackgroundColor", onUiThread = true, request = BackgroundColorParams.class)
    public void setBackgroundColor(BackgroundColorParams backgroundColorParams, MsiContext msiContext) {
        Object[] objArr = {backgroundColorParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ff7e00e318577ae504b5a7b5a0411f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ff7e00e318577ae504b5a7b5a0411f");
            return;
        }
        int d = d(msiContext);
        e a2 = a(d);
        if (a2 == null) {
            a(msiContext, d);
            return;
        }
        try {
            a2.setBackgroundColor(g.b(backgroundColorParams.backgroundColor));
            e(msiContext);
        } catch (Exception unused) {
            msiContext.onError("illegal argument name: color");
        }
    }

    @MsiApiMethod(name = "setBackgroundTextStyle", onUiThread = true, request = BackgroundTextStyleParams.class)
    public void setBackgroundTextStyle(BackgroundTextStyleParams backgroundTextStyleParams, MsiContext msiContext) {
        Object[] objArr = {backgroundTextStyleParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2642b52079cdc744c3da791077d679d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2642b52079cdc744c3da791077d679d3");
            return;
        }
        int d = d(msiContext);
        e a2 = a(d);
        if (a2 == null) {
            a(msiContext, d);
            return;
        }
        a2.setBackgroundTextStyle(TextUtils.equals(backgroundTextStyleParams.textStyle, "dark"));
        e(msiContext);
    }
}
