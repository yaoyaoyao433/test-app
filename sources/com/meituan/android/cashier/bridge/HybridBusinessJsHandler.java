package com.meituan.android.cashier.bridge;

import com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HybridBusinessJsHandler extends NeoWrapperJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void logSC(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cea8f26cf4001ffc790db366ac82634e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cea8f26cf4001ffc790db366ac82634e");
        } else {
            d.a(getNeoCompat(), str, map);
        }
    }

    public void logMV(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4047d2af436ccd9e7651feb02b1b502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4047d2af436ccd9e7651feb02b1b502");
        } else {
            d.a(getNeoCompat(), str, str2, null, map);
        }
    }

    public void logMC(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e92fd740ab98114fe590bc244284ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e92fd740ab98114fe590bc244284ac0");
            return;
        }
        com.meituan.android.neohybrid.core.a neoCompat = getNeoCompat();
        Object[] objArr2 = {neoCompat, str, str2, null, map};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "e79284af86858d128b72444e22d16591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "e79284af86858d128b72444e22d16591");
        } else if (neoCompat != null) {
            neoCompat.h().b(str, str2, null, map);
        } else {
            b.b(str, str2, null, map);
        }
    }

    public void logCat(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3377365cc3a0cc9cc7eb0ad18910b659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3377365cc3a0cc9cc7eb0ad18910b659");
        } else if (map == null) {
            d.c(getNeoCompat(), str, new HashMap());
        }
    }

    public static void logSC(HybridBusinessJsHandler hybridBusinessJsHandler, String str, Map<String, Object> map) {
        Object[] objArr = {hybridBusinessJsHandler, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "480060d32487bc6ec997f42cb4d4caa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "480060d32487bc6ec997f42cb4d4caa9");
        } else if (hybridBusinessJsHandler == null) {
        } else {
            hybridBusinessJsHandler.logSC(str, map);
        }
    }

    public static void logMV(HybridBusinessJsHandler hybridBusinessJsHandler, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {hybridBusinessJsHandler, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd63d7385f053132799fc69d9e862ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd63d7385f053132799fc69d9e862ec5");
        } else if (hybridBusinessJsHandler == null) {
        } else {
            hybridBusinessJsHandler.logMV(str, str2, map);
        }
    }

    public static void logMC(HybridBusinessJsHandler hybridBusinessJsHandler, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {hybridBusinessJsHandler, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cb9e432c28a6286962a0cea7f2b6d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cb9e432c28a6286962a0cea7f2b6d3a");
        } else if (hybridBusinessJsHandler == null) {
        } else {
            hybridBusinessJsHandler.logMC(str, str2, map);
        }
    }

    public static void logCat(HybridBusinessJsHandler hybridBusinessJsHandler, String str, Map<String, Object> map) {
        Object[] objArr = {hybridBusinessJsHandler, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "869010751adf333ee1dd4213d9facd4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "869010751adf333ee1dd4213d9facd4c");
        } else if (hybridBusinessJsHandler == null) {
        } else {
            hybridBusinessJsHandler.logCat(str, map);
        }
    }
}
