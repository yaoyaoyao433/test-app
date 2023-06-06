package com.dianping.nvnetwork.tnold.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements CacheSecureInfo {
    public static ChangeQuickRedirect a;
    private static final String d = "CGU1EDE1PqRcffkp";
    private String b;
    private SharedPreferences c;

    public b(Context context, String str) {
        String str2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68abd62bd6e80006c886a8b2a79ef432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68abd62bd6e80006c886a8b2a79ef432");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(applicationContext.getPackageName());
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87a0057bcec196d40c243baf62605e33", 6917529027641081856L)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87a0057bcec196d40c243baf62605e33");
        } else {
            if (TextUtils.equals(TrafficRecord.Detail.TUNNEL_SHARK, str)) {
                String a2 = com.dianping.nvtunnelkit.utils.d.a();
                if (!TextUtils.isEmpty(a2)) {
                    str2 = str + a2;
                }
            }
            str2 = str;
        }
        sb.append(str2);
        this.c = applicationContext.getSharedPreferences(sb.toString(), 0);
        Object[] objArr3 = {applicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "168eec66da4adfdb848de74354f38dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "168eec66da4adfdb848de74354f38dff");
        } else {
            String str3 = "";
            if (applicationContext != null) {
                try {
                    String androidId = Privacy.createTelephonyManager(applicationContext, "nvnetwork").getAndroidId();
                    if (!SecureTools.isEmpty(androidId)) {
                        String a3 = a.a(androidId.getBytes());
                        if (!SecureTools.isEmpty(a3) && a3.length() >= 16) {
                            str3 = a3.substring(0, 16);
                        }
                    }
                } catch (Exception e) {
                    com.dianping.nvtunnelkit.logger.b.a(e);
                }
            }
            if (!TextUtils.isEmpty(str3) && str3.length() == 16) {
                this.b = str3;
            } else {
                this.b = d;
            }
        }
        Object[] objArr4 = {applicationContext, str};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b054e9139f2af81f51700991c3de96f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b054e9139f2af81f51700991c3de96f5");
        } else if (TextUtils.equals(TrafficRecord.Detail.TUNNEL_SHARK, str) && !this.c.contains("secure_name_key") && com.dianping.nvtunnelkit.utils.d.b(applicationContext)) {
            String string = applicationContext.getSharedPreferences(applicationContext.getPackageName() + "Secure", 0).getString("secure_name_key", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            writeSecureInfo2Cache(string);
            com.dianping.nvtunnelkit.logger.b.b("moveSecureInfo done");
        }
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final String getSecureKey() {
        return this.b;
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final void writeSecureInfo2Cache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f972012f203e079e1901478ae7f9ea5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f972012f203e079e1901478ae7f9ea5");
            return;
        }
        SharedPreferences.Editor edit = this.c.edit();
        edit.putString("secure_name_key", str);
        edit.commit();
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final String readSecureInfoFromCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60744559953cdd2db2b022e9baacc9ca", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60744559953cdd2db2b022e9baacc9ca") : this.c.getString("secure_name_key", "");
    }

    @Override // com.dianping.nvnetwork.tunnel.Encrypt.CacheSecureInfo
    public final void removeSecureInfoFromCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc8ba05b0c3f825a3fc756f0b54e102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc8ba05b0c3f825a3fc756f0b54e102");
            return;
        }
        SharedPreferences.Editor edit = this.c.edit();
        edit.remove("secure_name_key");
        edit.commit();
    }
}
