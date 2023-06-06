package com.sankuai.waimai.addrsdk.manager;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.constants.AddressAuthority;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.addrsdk.constants.AddressType;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressConfig;
import com.sankuai.waimai.addrsdk.utils.e;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a g;
    public String b;
    public String c;
    public String d;
    public HashMap<String, com.sankuai.waimai.addrsdk.base.a> e;
    public HashMap<String, Integer> f;
    private AddressConfig h;
    private boolean i;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a871c67c0e34fecbf91626550a9c1ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a871c67c0e34fecbf91626550a9c1ed");
        }
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a();
                }
            }
        }
        return g;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf896349ba16e25ab840f77c98a8120e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf896349ba16e25ab840f77c98a8120e");
            return;
        }
        this.h = null;
        this.i = false;
        this.e = new HashMap<>();
        this.f = new HashMap<>();
    }

    public final com.sankuai.waimai.addrsdk.base.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49877e487518711feb6abdff665ccbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.addrsdk.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49877e487518711feb6abdff665ccbd");
        }
        if (this.e.containsKey(this.b)) {
            return this.e.get(this.b);
        }
        return null;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047f1984552e501ed8502c36004fdf62", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047f1984552e501ed8502c36004fdf62") : (this.e == null || this.e.size() == 0) ? "" : this.e.get(this.b).i();
    }

    public final String a(String str, String str2, String str3, String str4, Map<String, String> map, String str5) {
        Object[] objArr = {str, str2, str3, str4, map, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2336908b36e9c6f0ffa7c93d645d5f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2336908b36e9c6f0ffa7c93d645d5f7");
        }
        JSONObject jSONObject = new JSONObject(map);
        String d = d();
        String encode = Uri.encode("/pages/" + str + "/" + str + "?statsParam=" + jSONObject.toString() + "&from=" + str2 + "&extraParams=" + Uri.encode(str5) + "&addressScene=" + AddressScene.DEFAULT_SCENE.getValue() + "&addressType=" + AddressType.LBS_TYPE.getValue() + "&apiExtra=&addressBean=&phoneList=" + str4 + "&commonParams=" + d);
        return str3 + "/mmp?appId=be7dcad4cf774fed&targetPath=" + encode;
    }

    public final String a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, int i3, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, Integer.valueOf(i), Integer.valueOf(i2), str6, Integer.valueOf(i3), str7};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f39da6c155958abab49021665097038", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f39da6c155958abab49021665097038");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("waimai_address_create", str7);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String d = d();
        String encode = Uri.encode("/pages/" + str + "/" + str + "?requestCode=" + i3 + "&from=" + str2 + "&extraParams=" + Uri.encode(jSONObject.toString()) + "&addressScene=" + i + "&addressType=" + i2 + "&apiExtra=" + str4 + "&addressBean=" + str5 + "&phoneList=" + str6 + "&commonParams=" + d);
        return str3 + "/mmp?appId=be7dcad4cf774fed&targetPath=" + encode;
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56f28c7615bf8b717ea309cf81586c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56f28c7615bf8b717ea309cf81586c5");
        }
        com.sankuai.waimai.addrsdk.base.a b = b();
        JSONObject jSONObject = new JSONObject();
        String str = "prod";
        String a2 = com.sankuai.waimai.addrsdk.utils.d.a();
        if (a2.contains(".dev.")) {
            str = GetAppInfoJsHandler.PACKAGE_TYPE_DEV;
        } else if (a2.contains(".test.")) {
            str = "qa";
        } else if (a2.contains(".beta.")) {
            str = "beta";
        } else if (a2.contains(".st.") && !a2.contains(".release.")) {
            str = "st";
        }
        try {
            jSONObject.put("env", str);
            jSONObject.put("uuid", b.a());
            jSONObject.put("siua", b.e());
            jSONObject.put("unionid", b.c());
            jSONObject.put("dpid", b.b());
            jSONObject.put("utm_medium", b.d());
            jSONObject.put("platform", b.f());
            jSONObject.put("partner", b.g());
            jSONObject.put("app", b.h());
            jSONObject.put("client_version", b.j());
            jSONObject.put("biz_id", b.k());
            jSONObject.put(Constants.PARAM_CLIENT_ID, b.l());
            jSONObject.put("login_token", b.m());
            jSONObject.put("login_token_type", b.n());
            jSONObject.put("device_version", b.o());
            jSONObject.put("device_type", b.p());
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, e.b(b.q()));
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, e.b(b.r()));
            jSONObject.put("actual_longitude", e.b(b.s()));
            jSONObject.put("actual_latitude", e.b(b.t()));
            jSONObject.put("address_sdk_version", com.sankuai.waimai.addrsdk.constants.a.f);
            jSONObject.put("address_sdk_address_bean_version", com.sankuai.waimai.addrsdk.constants.a.g);
            jSONObject.put("address_sdk_type", com.sankuai.waimai.addrsdk.constants.a.h);
            jSONObject.put("address_sdk_maf_key", b.u());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a(@NonNull com.sankuai.waimai.addrsdk.base.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2309ec0110617e347b208610fbe8f73", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2309ec0110617e347b208610fbe8f73");
        }
        String str = bVar.b;
        String str2 = bVar.h;
        String str3 = bVar.c;
        int i = bVar.d;
        int i2 = bVar.e;
        String str4 = bVar.i;
        String str5 = bVar.j;
        String str6 = bVar.f;
        String str7 = bVar.k;
        String flexValueOf = AddressAuthority.flexValueOf(str4);
        if (flexValueOf.length() == 0) {
            return "";
        }
        String d = d();
        StringBuilder sb = new StringBuilder();
        sb.append("/pages/");
        sb.append(str);
        sb.append("/");
        sb.append(str);
        sb.append("?from=");
        sb.append(str2);
        sb.append("&extraParams=");
        sb.append(str6);
        sb.append("&addressScene=");
        sb.append(i);
        sb.append("&addressType=");
        sb.append(i2);
        sb.append("&apiExtra=");
        sb.append(str5);
        sb.append("&addressBean=");
        sb.append(str3);
        sb.append("&phoneList=");
        sb.append(str7);
        sb.append("&commonParams=");
        sb.append(d);
        if (bVar.g != null && bVar.g.size() > 0) {
            String jSONObject = new JSONObject(bVar.g).toString();
            sb.append("&statsParam=");
            sb.append(jSONObject);
        }
        String encode = Uri.encode(sb.toString());
        return flexValueOf + "/mmp?appId=be7dcad4cf774fed&targetPath=" + encode;
    }
}
