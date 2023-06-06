package com.meituan.android.mrn.config.horn;

import com.meituan.android.mrn.config.t;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static final List<String> c = new ArrayList();
    public static l b = new l();

    public l() {
        com.meituan.android.mrn.utils.config.b a2;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a15521b2d959f6c90bc98c860774855", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a15521b2d959f6c90bc98c860774855");
            return;
        }
        c.add("MRNJSFps");
        c.add("MRNJSScrollFps");
        c.add("MRNFps");
        c.add("MRNScrollFps");
        c.add("MRNBundleLoadExecuteTime");
        c.add("MRNInitSuccess");
        c.add("MRNRenderTime");
        c.add("MRNJSException");
        c.add("MRNSoftException");
        c.add("MRNFatalException");
        c.add(DiagnoseLog.TASK_MRN_BUNDLE_DOWNLOAD);
        c.add("MRNBundlePatch");
        c.add("MRNBundleLoad");
        c.add("MRNInitAppTime");
        c.add("MRNPageLoadSuccess");
        c.add("MRNPageExitSuccess");
        c.add("MRNPageForceStopSuccess");
        c.add("MRNPageFrontExitSuccess");
        c.add("MRNPageLoadTime");
        c.add("MRNCreateBridgeTime");
        c.add("MRNPrepareBundleTime");
        c.add("MRNPageBackgroundLoadTime");
        c.add("MRNJSEMemoryUsage");
        c.add("MRNJSEMemoryGCSize");
        c.add("MRNJSEOOM");
        c.add("MRNBundleDeleted");
        c.add("MRNBridgeInstanceCount");
        c.add("MRNImageMemoryUsage");
        c.add("MRNBundleLoadIntervals");
        c.add("MRNPreBundleInit");
        c.add("MRNBundleStack");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c64132c1fa784f8671a47f721c574ef9", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c64132c1fa784f8671a47f721c574ef9");
        } else {
            a2 = com.meituan.android.mrn.utils.config.a.a();
            String e = com.meituan.android.mrn.config.c.a().e();
            if (a.a.equals(e)) {
                a2.c = a.c;
            } else if (a.b.equals(e)) {
                a2.c = a.d;
            }
        }
        com.meituan.android.mrn.utils.config.b bVar = a2;
        for (String str : c) {
            String b2 = b(str);
            Class cls = Boolean.TYPE;
            Boolean bool = Boolean.TRUE;
            Object[] objArr3 = new Object[5];
            objArr3[c2] = b2;
            objArr3[1] = cls;
            objArr3[2] = bool;
            objArr3[3] = "";
            objArr3[4] = bVar;
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eaebb70f2aadf64b210fa194b2d73660", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eaebb70f2aadf64b210fa194b2d73660");
            } else {
                t.a(b2, cls, bool, "mrn_report_config_android", "", bVar);
            }
            c2 = 0;
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eeb424032900816cd6f886a7a353b89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eeb424032900816cd6f886a7a353b89")).booleanValue();
        }
        if (c.contains(str)) {
            return ((Boolean) t.b.a(b(str))).booleanValue();
        }
        return true;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2c19c6076be816b732e595ecfcbc96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2c19c6076be816b732e595ecfcbc96");
        }
        return "sm_" + str;
    }
}
