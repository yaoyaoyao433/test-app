package com.meituan.mmp.main.fusion;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.mmp.lib.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.main.fusion.b
    public final boolean a(Context context, String str, String str2, Intent intent) {
        Object[] objArr = {context, str, str2, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130e0c8b10be27b2eff5a5ec37af1d3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130e0c8b10be27b2eff5a5ec37af1d3a")).booleanValue();
        }
        Intent a2 = a(str, intent, str2);
        a2.putExtra("relaunch", true);
        return com.meituan.mmp.lib.utils.b.a(context, a2);
    }

    @Override // com.meituan.mmp.main.fusion.b
    public final boolean b(Context context, String str, String str2, Intent intent) {
        Object[] objArr = {context, str, str2, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d968ff7e63e362c719ca6de00090c3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d968ff7e63e362c719ca6de00090c3e")).booleanValue() : com.meituan.mmp.lib.utils.b.a(context, a(str, intent, str2));
    }

    private Intent a(String str, Intent intent, String str2) {
        Object[] objArr = {str, intent, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c36b8e01b68f67bf1beee88e742dc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c36b8e01b68f67bf1beee88e742dc8");
        }
        Intent intent2 = new Intent();
        String str3 = d.get(str);
        if (str3 != null) {
            intent2.setData(Uri.parse(str3).buildUpon().appendQueryParameter("targetPath", str2).build());
        } else {
            intent2.setComponent(intent.getComponent());
            Uri data = intent.getData();
            if (data != null) {
                try {
                    intent2.setData(data.buildUpon().query(null).build());
                } catch (Exception e) {
                    com.meituan.mmp.lib.trace.b.a("FusionPageManager", e);
                }
            }
            intent2.setAction(intent.getAction());
            intent.setType(intent.getType());
            if (intent.getCategories() != null) {
                for (String str4 : intent.getCategories()) {
                    intent2.addCategory(str4);
                }
            }
            intent2.putExtra("targetPath", str2);
            intent2.putExtra("fusion", true);
        }
        intent2.putExtra("appId", str);
        Object[] objArr2 = {intent, intent2};
        ChangeQuickRedirect changeQuickRedirect2 = z.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c18a1c37bc651b7f37ae1dc2fa57a09", RobustBitConfig.DEFAULT_VALUE)) {
            Intent intent3 = (Intent) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c18a1c37bc651b7f37ae1dc2fa57a09");
        } else {
            z.a(intent, intent2, "localAppPath");
            z.a(intent, intent2, "checkUpdateUrl");
            z.a(intent, intent2, "debugProxyServer");
            z.a(intent, intent2, "shareEnv");
            z.b(intent, intent2, "reload");
            z.b(intent, intent2, "debug");
        }
        Object[] objArr3 = {intent, intent2};
        ChangeQuickRedirect changeQuickRedirect3 = z.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b12ac78e518e818c71c2ad8cebd7784a", RobustBitConfig.DEFAULT_VALUE)) {
            Intent intent4 = (Intent) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b12ac78e518e818c71c2ad8cebd7784a");
        } else {
            z.b(intent, intent2, "finishByExitMiniProgram");
        }
        intent2.putExtra("isFusionApiStarted", true);
        return intent2;
    }
}
