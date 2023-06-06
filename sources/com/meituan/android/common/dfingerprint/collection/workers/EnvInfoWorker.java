package com.meituan.android.common.dfingerprint.collection.workers;

import android.content.Context;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class EnvInfoWorker {
    public static ChangeQuickRedirect changeQuickRedirect;

    public EnvInfoWorker(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "629d546ec1821a01938e1e2028af6fbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "629d546ec1821a01938e1e2028af6fbb");
        }
    }

    public static String getUserId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "564ff04299e47edb15935c61d16d3c02", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "564ff04299e47edb15935c61d16d3c02");
        }
        try {
            Class<?> cls = Class.forName("com.meituan.passport.UserCenter");
            Object invoke = cls.getMethod("getInstance", Context.class).invoke(cls, context);
            boolean booleanValue = ((Boolean) cls.getMethod("isLogin", new Class[0]).invoke(invoke, new Object[0])).booleanValue();
            Object invoke2 = cls.getMethod("getUser", new Class[0]).invoke(invoke, new Object[0]);
            return (!booleanValue || invoke2 == null) ? "-1" : Long.toString(Class.forName("com.meituan.passport.pojo.User").getField("id").getLong(invoke2));
        } catch (Throwable unused) {
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }

    public String cellularIP() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26de3f92ea41c8f0a293acc5a278ae25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26de3f92ea41c8f0a293acc5a278ae25");
        }
        try {
            return NBridge.main1(52, new Object[0]);
        } catch (Throwable unused) {
            return DFPConfigs.JAVA_EXCEPTION;
        }
    }
}
