package com.meituan.android.common.dfingerprint.raptor;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.a;
import com.dianping.monitor.impl.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RaptorMonitorService extends a {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int gAppID = 0;
    private static RaptorMonitorService gInstance = null;
    private static Context mContext = null;
    private static Map<String, Integer> pkgToAppID = null;
    private static int raptor_give_up_report = -444;
    private static String unionID = "";

    public RaptorMonitorService(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "146662db0215d4246d8440c1d2695bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "146662db0215d4246d8440c1d2695bc3");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        pkgToAppID = hashMap;
        hashMap.put("com.dianping.v1", 1);
        pkgToAppID.put("com.sankuai.meituan", 10);
        pkgToAppID.put("com.sankuai.meituan.takeoutnew", 11);
        pkgToAppID.put("com.sankuai.youxuan", 350);
        pkgToAppID.put("com.wuten.demo.mtguard", 361);
    }

    public static boolean isRaptorValid() {
        return gAppID != raptor_give_up_report;
    }

    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da83558233b8e3f2739928a8fad8ab9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da83558233b8e3f2739928a8fad8ab9e");
            return;
        }
        try {
            mContext = context;
            getInstance(context);
        } catch (Throwable unused) {
        }
    }

    public static int getAppID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa5cf25c9966a21176aaf5cc056f7886", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa5cf25c9966a21176aaf5cc056f7886")).intValue();
        }
        try {
            if (gAppID != 0) {
                return gAppID;
            }
            int appID = NVLinker.getAppID();
            if (appID != 0) {
                gAppID = appID;
                return appID;
            }
            Integer num = pkgToAppID.get(mContext.getPackageName());
            if (num == null) {
                gAppID = raptor_give_up_report;
            } else {
                gAppID = num.intValue();
            }
            return gAppID;
        } catch (Exception unused) {
            return raptor_give_up_report;
        }
    }

    private static RaptorMonitorService getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3a5e0c311b09459af72f4c28e7946c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (RaptorMonitorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3a5e0c311b09459af72f4c28e7946c7");
        }
        if (gInstance == null) {
            synchronized (RaptorMonitorService.class) {
                if (gInstance == null) {
                    int appID = getAppID();
                    if (appID == raptor_give_up_report) {
                        return null;
                    }
                    gInstance = new RaptorMonitorService(context, appID);
                }
            }
        }
        return gInstance;
    }

    public static RaptorMonitorService getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86577a261266119e9a5e4de45a9acc9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RaptorMonitorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86577a261266119e9a5e4de45a9acc9f");
        }
        if (mContext == null) {
            return null;
        }
        return getInstance(mContext);
    }

    public static void setUnionID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a72a4e8bdf26574898a3b60d617e235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a72a4e8bdf26574898a3b60d617e235");
        } else if (TextUtils.isEmpty(str) || str.equals(unionID)) {
        } else {
            unionID = str;
        }
    }

    public static void setDebug(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11dea15ed2be54e766d1c2a8cce7d605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11dea15ed2be54e766d1c2a8cce7d605");
        } else {
            c.a(z);
        }
    }

    @Override // com.dianping.monitor.impl.a
    public String getUnionid() {
        return unionID;
    }
}
