package com.dianping.nvnetwork.tunnel.Encrypt;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements CacheSecureInfo {
    public static ChangeQuickRedirect a;
    private static final String e = "CGU1EDE1PqRcffkp";
    private Context b;
    private String c;
    private SharedPreferences d;

    public a(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f8b1839bb961d74f0eaf0ed1948940", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f8b1839bb961d74f0eaf0ed1948940");
            return;
        }
        this.b = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b645e0e43dcd1c5ee82727238553e425", 6917529027641081856L)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b645e0e43dcd1c5ee82727238553e425");
        } else {
            String a2 = com.dianping.nvtunnelkit.utils.d.a(this.b);
            if (TextUtils.isEmpty(a2)) {
                str = "Secure";
            } else {
                str = "Secure" + a2;
            }
        }
        sb.append(str);
        this.d = context.getSharedPreferences(sb.toString(), 0);
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4faa8813d6b08238b3883fce5e2955b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4faa8813d6b08238b3883fce5e2955b2");
            return;
        }
        String str2 = "";
        if (context != null) {
            try {
                String androidId = Privacy.createTelephonyManager(context, "nvnetwork").getAndroidId();
                if (!SecureTools.isEmpty(androidId)) {
                    String a3 = com.dianping.nvnetwork.cache.e.a(androidId.getBytes());
                    if (!SecureTools.isEmpty(a3) && a3.length() >= 16) {
                        str2 = a3.substring(0, 16);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str2) && str2.length() == 16) {
            this.c = str2;
        } else {
            this.c = e;
        }
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final String getSecureKey() {
        return this.c;
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final void writeSecureInfo2Cache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a24bfdd72495eafb7e5b8f89900918e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a24bfdd72495eafb7e5b8f89900918e");
            return;
        }
        SharedPreferences.Editor edit = this.d.edit();
        edit.putString("secure_name_key", str);
        edit.commit();
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final String readSecureInfoFromCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fe0b3a96c3dec81b5bb990cd6e45ee3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fe0b3a96c3dec81b5bb990cd6e45ee3") : this.d.getString("secure_name_key", "");
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final void removeSecureInfoFromCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b243d97dc3c6aab4dcbce5188184615", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b243d97dc3c6aab4dcbce5188184615");
            return;
        }
        SharedPreferences.Editor edit = this.d.edit();
        edit.remove("secure_name_key");
        edit.commit();
    }
}
