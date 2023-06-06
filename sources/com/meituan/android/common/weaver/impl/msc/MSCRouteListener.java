package com.meituan.android.common.weaver.impl.msc;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.RemoteConfig;
import com.meituan.android.common.weaver.impl.natives.NativeEndPointManager;
import com.meituan.android.common.weaver.impl.utils.FFPTopPageImpl;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.ContainerEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.msc.lib.interfaces.IMSCNavigationReporter;
import com.meituan.msc.lib.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MSCRouteListener implements IMSCNavigationReporter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ErrorReporter sReporter = new ErrorReporter("MSCRoute", 2);
    private Handler mMainHandler;

    @Override // com.meituan.msc.lib.interfaces.IMSCNavigationReporter
    public void navigationStartTime(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "077b1be685b620783d71e3e169270be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "077b1be685b620783d71e3e169270be1");
        } else if (RemoteConfig.sConfig.enable) {
            try {
                worker(cVar);
            } catch (Throwable th) {
                sReporter.report(th);
            }
        }
    }

    public static String pagePath(MSCParam mSCParam) {
        Object[] objArr = {mSCParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05c085b425c730b1d52cec2d85ad1a08", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05c085b425c730b1d52cec2d85ad1a08");
        }
        String str = mSCParam.pageUrl;
        return (str == null || !str.contains(CommonConstant.Symbol.QUESTION_MARK)) ? str : str.substring(0, str.indexOf(CommonConstant.Symbol.QUESTION_MARK));
    }

    private void worker(c cVar) throws Throwable {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e8df1c9f2473ada35d6dfab4a447dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e8df1c9f2473ada35d6dfab4a447dd1");
            return;
        }
        Logger.getLogger().d("MSCRoute: ", cVar.g, ", ", cVar.a);
        HashMap hashMap = new HashMap();
        hashMap.put(ContainerEvent.EXTRA_TYPE, "start");
        hashMap.put(ContainerEvent.EXTRA_CREATE_MS, Long.valueOf(FFPUtil.currentTimeMillis()));
        MSCParam fromFFP = MSCParam.fromFFP(cVar);
        String pagePath = pagePath(fromFFP);
        hashMap.put("pagePath", pagePath);
        Weaver.getWeaver().weave(ContainerEvent.msc(cVar.h, cVar.b, hashMap));
        if ("WEBVIEW".equals(cVar.g) || "mp-webview".equals(cVar.g)) {
            return;
        }
        FFPTopPageImpl.pagePath = pagePath;
        startFFPDetect(fromFFP, pagePath);
    }

    private void startFFPDetect(@NonNull final MSCParam mSCParam, @NonNull final String str) {
        Object[] objArr = {mSCParam, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e732d766cbe07a9c13b180b199ebe33b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e732d766cbe07a9c13b180b199ebe33b");
            return;
        }
        if (this.mMainHandler == null) {
            this.mMainHandler = new Handler(Looper.getMainLooper());
        }
        this.mMainHandler.postDelayed(new Runnable() { // from class: com.meituan.android.common.weaver.impl.msc.MSCRouteListener.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "108f58b1bf2f014077afffe4679dffc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "108f58b1bf2f014077afffe4679dffc6");
                } else {
                    NativeEndPointManager.getInstance().mscOrFragmentStartDetectFFP(mSCParam.activity, new MSCPagePathHelper(mSCParam, str));
                }
            }
        }, 100L);
    }
}
