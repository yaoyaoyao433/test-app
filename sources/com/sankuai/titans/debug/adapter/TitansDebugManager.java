package com.sankuai.titans.debug.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.debug.adapter.dialog.ITitansDebugDialog;
import com.sankuai.titans.debug.adapter.old.IOldTitansDebug;
import com.sankuai.titans.debug.adapter.plugin.ITitansDebugPlugin;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansDebugManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IOldTitansDebug sOldTitansDebug;
    private static ITitansDebugDialog sTitansDebugDialog;
    private static ITitansDebugPlugin sTitansDebugPlugin;

    static {
        List a = b.a(ITitansDebugDialog.class, null, new Object[0]);
        if (a != null && a.size() > 0) {
            sTitansDebugDialog = (ITitansDebugDialog) a.get(0);
        }
        List a2 = b.a(ITitansDebugPlugin.class, null, new Object[0]);
        if (a2 != null && a2.size() > 0) {
            sTitansDebugPlugin = (ITitansDebugPlugin) a2.get(0);
        }
        List a3 = b.a(IOldTitansDebug.class, null, new Object[0]);
        if (a3 == null || a3.size() <= 0) {
            return;
        }
        sOldTitansDebug = (IOldTitansDebug) a3.get(0);
    }

    public static ITitansDebugDialog getTitansDebugDialog() {
        return sTitansDebugDialog;
    }

    public static ITitansDebugPlugin getTitansDebugPlugin() {
        return sTitansDebugPlugin;
    }

    public static IOldTitansDebug getOldTitansDebug() {
        return sOldTitansDebug;
    }
}
