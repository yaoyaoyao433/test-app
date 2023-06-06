package com.meituan.msc.modules.container.fusion;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.msc.common.utils.y;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.container.fusion.b
    public final boolean a(Context context, String str, String str2, Intent intent) {
        Object[] objArr = {context, str, str2, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e86d6cfe105fd6800144794e942f2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e86d6cfe105fd6800144794e942f2a")).booleanValue();
        }
        Intent a2 = a(str, intent, str2);
        a2.putExtra("relaunch", true);
        return com.meituan.msc.common.utils.b.a(context, a2);
    }

    @Override // com.meituan.msc.modules.container.fusion.b
    public final boolean b(Context context, String str, String str2, Intent intent) {
        Object[] objArr = {context, str, str2, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95f554857848872fe6ae12602859f0c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95f554857848872fe6ae12602859f0c")).booleanValue() : com.meituan.msc.common.utils.b.a(context, a(str, intent, str2));
    }

    private Intent a(String str, Intent intent, String str2) {
        Object[] objArr = {str, intent, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b7655e34f1e9670e704d716d20e088", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b7655e34f1e9670e704d716d20e088");
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
                    g.a("FusionPageManager", e);
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
        }
        intent2.putExtra("appId", str);
        Object[] objArr2 = {intent, intent2};
        ChangeQuickRedirect changeQuickRedirect2 = y.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f2f2bf6dcb5bb4d9e211ff448d29baa6", RobustBitConfig.DEFAULT_VALUE)) {
            Intent intent3 = (Intent) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f2f2bf6dcb5bb4d9e211ff448d29baa6");
        } else {
            y.a(intent, intent2, "checkUpdateUrl");
            y.a(intent, intent2, "debugProxyServer");
            y.a(intent, intent2, "shareEnv");
            y.b(intent, intent2, "reload");
            y.b(intent, intent2, "debug");
        }
        Object[] objArr3 = {intent, intent2};
        ChangeQuickRedirect changeQuickRedirect3 = y.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "38171cf1bcb6bbef2f09f983857bf255", RobustBitConfig.DEFAULT_VALUE)) {
            Intent intent4 = (Intent) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "38171cf1bcb6bbef2f09f983857bf255");
        } else {
            y.b(intent, intent2, "finishByExitMiniProgram");
        }
        intent2.putExtra("isFusionApiStarted", true);
        return intent2;
    }
}
