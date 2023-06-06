package com.meituan.mmp.lib.config;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.dio.easy.DioFile;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.mmp.lib.config.f;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.mmp.main.fusion.b;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static String b;
    public static f.a c;
    public static String d;
    public JSONObject e;
    public b f;
    public boolean g;
    public h h;
    public volatile Map<String, String> i;
    public final m j;
    public String k;
    public volatile MMPAppProp l;
    public HashMap<String, d> m;
    private JSONObject n;
    private volatile JSONObject o;
    private JSONObject p;
    private String q;
    private final String r;
    private Map<String, List<String>> s;

    public a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2dd3cc7a24856dbe75c6fea1788c93c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2dd3cc7a24856dbe75c6fea1788c93c");
            return;
        }
        this.k = "release";
        if (TextUtils.isEmpty(mVar.b)) {
            throw new IllegalArgumentException("appId must be not null!");
        }
        this.j = mVar;
        this.r = mVar.b;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8615952cf55176389d24f338f35aef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8615952cf55176389d24f338f35aef");
        }
        return "AppConfig{appid='" + c() + "' , version='" + g() + "'}";
    }

    public final boolean a() {
        return this.l != null && this.l.isInner;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1359326a731ea773b54c1292472e9326", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1359326a731ea773b54c1292472e9326") : MMPEnvHelper.getEnvInfo().getUserID();
    }

    public final String c() {
        return this.l != null ? this.l.appid : this.r;
    }

    public final String d() {
        return this.l != null ? this.l.appName : "";
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca86f0513253a9174922bc1afb653a9c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca86f0513253a9174922bc1afb653a9c")).booleanValue() : this.l != null && this.l.isFusionModeEnabled();
    }

    public final String f() {
        if (this.l != null) {
            return this.l.iconPath;
        }
        return null;
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e663bbca65d1b894e1f5561e155255", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e663bbca65d1b894e1f5561e155255") : (this.l == null || TextUtils.isEmpty(this.l.getPublishId())) ? "0" : this.l.getPublishId();
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598d3441730c093193ce71587a8844dc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598d3441730c093193ce71587a8844dc")).booleanValue() : this.l != null && this.l.shareSupported();
    }

    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e87f87d2396fd60a8b2ccdb1d54dac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e87f87d2396fd60a8b2ccdb1d54dac8");
        }
        return ay.b(context, this.r).getAbsolutePath() + File.separator;
    }

    public final String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3a509dc4e07edf605ed2fd52c023ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3a509dc4e07edf605ed2fd52c023ca");
        }
        return ay.d(context, this.r).getAbsolutePath() + File.separator;
    }

    public final String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfbc8c7cc33c69f4108191f720294407", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfbc8c7cc33c69f4108191f720294407");
        }
        return ay.c(context, this.r).getAbsolutePath() + File.separator;
    }

    public final void d(Context context) throws Exception {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48ee55c0509bb535fcc49b2e7d42788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48ee55c0509bb535fcc49b2e7d42788");
        } else if (this.e == null || !TextUtils.equals(this.q, this.l.getPublishId())) {
            ab.a("AppConfig.initConfig");
            if (this.l == null || !this.l.mainPackage.u) {
                if (this.l != null && this.l.mainPackage.c(context)) {
                    bb.b("mainPackage source not ready when initConfig", new Object[0]);
                } else {
                    com.meituan.mmp.lib.trace.b.d("AppConfig", "mainPackage source is not ready");
                    throw new RuntimeException(this.l == null ? "appProp not Ready" : "mainPackage source is not ready");
                }
            }
            DioFile dioFile = new DioFile(this.l.mainPackage.b(context), "app-config.json");
            if (!dioFile.c()) {
                com.meituan.mmp.lib.trace.b.d("AppConfig", "mainPackage config file is not ready; " + toString());
                throw new RuntimeException("mainPackage config file is not ready ");
            }
            try {
                q(s.a(dioFile));
                this.q = this.l.getPublishId();
                ab.a();
            } catch (IOException e) {
                s.a(this.h, dioFile.g(), e, null, this.r);
                e.printStackTrace();
                throw new IOException("mainPackage config file is not ready ", e);
            }
        }
    }

    public final String a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "421bc428483c553cd189f86abaae111e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "421bc428483c553cd189f86abaae111e");
        }
        if (this.i == null || (str2 = this.i.get(p(str))) == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        if (indexOf > 0) {
            str2 = str2 + str.substring(indexOf);
        }
        com.meituan.mmp.lib.trace.b.c("MMP routeMapping matched! from originUri" + str + "to TargetPath " + str2);
        return str2;
    }

    private void q(String str) throws RuntimeException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df8d3afa6f86860ad283bc2ff1f7c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df8d3afa6f86860ad283bc2ff1f7c50");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppConfig", "initConfig start");
        try {
            this.e = new JSONObject(str);
            this.n = this.e.optJSONObject("window");
            if (this.n != null) {
                this.o = this.n.optJSONObject("pages");
            }
            this.p = this.e.optJSONObject("networkTimeout");
            this.g = this.e.optBoolean("enableShark");
            JSONObject optJSONObject = this.e.optJSONObject("tabBar");
            if (optJSONObject != null) {
                this.f = new b();
                this.f.a = optJSONObject.optBoolean("custom", false);
                this.f.b = optJSONObject.optString("color");
                this.f.c = optJSONObject.optString("selectedColor");
                this.f.d = optJSONObject.optString("backgroundColor");
                this.f.e = optJSONObject.optString(BorderStyle.LOWER_CASE_NAME);
                this.f.f = optJSONObject.optString("position");
                this.f.g = optJSONObject.optJSONArray(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
                ArrayList<String> arrayList = new ArrayList<>();
                int length = this.f.g.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = this.f.g.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(optJSONObject2.optString("pagePath"));
                    }
                }
                b.a aVar = new b.a();
                aVar.a = arrayList;
                aVar.b = arrayList.contains(i());
                aVar.c = e();
                com.meituan.mmp.main.fusion.b.c.put(c(), aVar);
            }
            this.m = d.a(this.e.optJSONObject("preloadRule"));
            com.meituan.mmp.lib.trace.b.b("AppConfig", "initConfig end");
        } catch (JSONException unused) {
            com.meituan.mmp.lib.trace.b.d("AppConfig", String.format("config is not JSON format! config=%s", str));
            throw new RuntimeException(String.format("config is not JSON format! config=%s", str));
        }
    }

    private JSONObject r(String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9447010045de7e963d45d0252a8469a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9447010045de7e963d45d0252a8469a3");
        }
        if (this.e == null || (optJSONObject = this.e.optJSONObject("permission")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str);
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ec315aba0cb0d896476f8274dd013c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ec315aba0cb0d896476f8274dd013c");
        }
        JSONObject r = r(str);
        if (r != null) {
            return r.optString("desc");
        }
        return null;
    }

    public String a(String str, String str2) {
        JSONObject optJSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0cd297e5ba7a71619c47b61a1a1ce97", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0cd297e5ba7a71619c47b61a1a1ce97");
        }
        if (this.n == null && this.o == null) {
            return null;
        }
        if (this.o != null && (optJSONObject = this.o.optJSONObject(p(str))) != null) {
            if (TextUtils.equals(str2, "navigationBarTitleText")) {
                Object opt = optJSONObject.opt(str2);
                if (opt != null) {
                    return opt.toString();
                }
            } else {
                String optString = optJSONObject.optString(str2);
                if (!TextUtils.isEmpty(optString)) {
                    return optString;
                }
            }
        }
        return this.n.optString(str2);
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d89a7029f027234dbc0cd76163c064", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d89a7029f027234dbc0cd76163c064");
        }
        if (this.e == null) {
            return "";
        }
        String optString = this.e.optString("root");
        return TextUtils.isEmpty(optString) ? "" : optString;
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a629306a0899c2875ecd407179e8ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a629306a0899c2875ecd407179e8ec")).booleanValue();
        }
        if (this.o == null) {
            com.meituan.mmp.lib.trace.b.a("AppConfig", (Throwable) null, "mPages is null", this.e);
            return false;
        }
        return this.o.has(p(str));
    }

    @ColorInt
    public final int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3b688ed7980c9ff61f9839304289b2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3b688ed7980c9ff61f9839304289b2")).intValue() : i.a(a(str, "backgroundColor"), -1);
    }

    public final String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a63b6e1cbc0988887397f23616e488c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a63b6e1cbc0988887397f23616e488c") : a(str, "widgetBackgroundColor");
    }

    public final boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e79e8818754c77c8ed62ab22a9725f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e79e8818754c77c8ed62ab22a9725f1")).booleanValue() : !"light".equals(a(str, "backgroundTextStyle"));
    }

    public final String g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b5ae25b36cab0823f1a6e46be42478", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b5ae25b36cab0823f1a6e46be42478");
        }
        String a2 = a(str, "navigationBarBackgroundColor");
        return TextUtils.isEmpty(a2) ? "#FFFFFF" : a2;
    }

    public final String h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3386e48a08520d93f3efe9b05218a67b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3386e48a08520d93f3efe9b05218a67b") : "black".equals(a(str, "navigationBarTextStyle")) ? DiagnoseLog.COLOR_ERROR : "#FFFFFF";
    }

    public final String i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203b5e5e66971466af32ecfb86a19a6a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203b5e5e66971466af32ecfb86a19a6a") : a(str, "navigationBarTitleText");
    }

    public final int j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9689070dbeb6352f34f779022de3a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9689070dbeb6352f34f779022de3a0d")).intValue();
        }
        if (this.p != null) {
            return this.p.optInt(str, 60000);
        }
        return 60000;
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3d7b8359dc98e6c927f9fbd6abdedb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3d7b8359dc98e6c927f9fbd6abdedb")).intValue();
        }
        if (this.p != null) {
            return this.p.optInt(SocialConstants.TYPE_REQUEST, 60000);
        }
        return 60000;
    }

    public final boolean k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1665c671e4bf45770def47e7ac8e98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1665c671e4bf45770def47e7ac8e98")).booleanValue() : "true".equalsIgnoreCase(a(str, "enablePullDownRefresh"));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0404a {
        STATIC,
        DYNAMIC,
        NONE;
        
        public static ChangeQuickRedirect a;

        EnumC0404a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bfdcc851f9793ebedf405f33a5b172f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bfdcc851f9793ebedf405f33a5b172f");
            }
        }

        public static EnumC0404a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426bb3eeb32cf159223ac331eb51b783", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0404a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426bb3eeb32cf159223ac331eb51b783") : (EnumC0404a) Enum.valueOf(EnumC0404a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0404a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7a7b02aaf105b688534df57f44cff4b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0404a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7a7b02aaf105b688534df57f44cff4b") : (EnumC0404a[]) values().clone();
        }
    }

    public final EnumC0404a l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "881c712df62f955d4cbe314e136763b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnumC0404a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "881c712df62f955d4cbe314e136763b1");
        }
        String a2 = a(str, "initialRenderingCache");
        if ("static".equals(a2)) {
            return EnumC0404a.STATIC;
        }
        if (UserCenter.OAUTH_TYPE_DYNAMIC.equals(a2)) {
            return EnumC0404a.DYNAMIC;
        }
        return EnumC0404a.NONE;
    }

    public final boolean m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027fc52df339f645edcea74a86e8ae82", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027fc52df339f645edcea74a86e8ae82")).booleanValue() : "custom".equalsIgnoreCase(a(str, "navigationStyle"));
    }

    @Nullable
    public final List<String> n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae10ee40380a5f8d910234c404539dde", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae10ee40380a5f8d910234c404539dde");
        }
        String p = "/".equals(str) ? "/" : p(str);
        if (this.s == null && this.e != null) {
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject = this.e.optJSONObject("pagePreloadRule");
            if (optJSONObject != null) {
                int w = com.meituan.mmp.lib.config.b.w();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        while (true) {
                            if (i >= optJSONArray.length()) {
                                break;
                            } else if (i >= w) {
                                com.meituan.mmp.lib.trace.b.c("AppConfig", optJSONArray.length() + " resources for page " + next + " exceeds limit " + w + ", ignore more");
                                break;
                            } else {
                                String optString = optJSONArray.optString(i);
                                if (optString != null && c(optString)) {
                                    arrayList.add(optString);
                                } else {
                                    com.meituan.mmp.lib.trace.b.c("AppConfig", "invalid resource path in pagePreloadRules: " + optString);
                                }
                                i++;
                            }
                        }
                        hashMap.put(next, arrayList);
                    }
                }
            }
            this.s = hashMap;
        }
        if (this.s != null) {
            return this.s.get(p);
        }
        return null;
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61065ba386c1442d8c800014f3b73f5d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61065ba386c1442d8c800014f3b73f5d")).booleanValue() : this.f != null && "top".equals(this.f.f);
    }

    public final List<com.meituan.mmp.lib.model.a> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65293b3f76b424695cc1fad66feb341", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65293b3f76b424695cc1fad66feb341");
        }
        if (this.f == null || this.f.g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = this.f.g.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = this.f.g.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.length() != 0) {
                com.meituan.mmp.lib.model.a aVar = new com.meituan.mmp.lib.model.a();
                aVar.a = this.f.b;
                aVar.b = this.f.c;
                aVar.c = optJSONObject.optString("iconPath");
                aVar.d = optJSONObject.optString("selectedIconPath");
                aVar.e = optJSONObject.optString("text");
                aVar.f = optJSONObject.optString("pagePath");
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final boolean o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10c12077d219d224b66a6bd3562a78b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10c12077d219d224b66a6bd3562a78b1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.f == null || this.f.g == null) {
            return false;
        }
        String p = p(str);
        int length = this.f.g.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = this.f.g.optJSONObject(i);
            if (optJSONObject != null && p.equals(optJSONObject.optString("pagePath"))) {
                return true;
            }
        }
        return false;
    }

    public final DioFile a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e87ddd818b9d3aecd6cdf0bd4c490fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e87ddd818b9d3aecd6cdf0bd4c490fd");
        }
        if (TextUtils.isEmpty(str) || this.l == null) {
            com.meituan.mmp.lib.trace.b.d("AppConfig", "null url when getResourcePath:" + str + "props:" + this.l);
            return null;
        }
        return this.l.getResourcePath(context, str);
    }

    public static String p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9211b2abec033d459b5f1e8d72fac8c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9211b2abec033d459b5f1e8d72fac8c1");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String substring = Uri.parse("mmp://www.meituan.com/" + str).getPath().substring(1);
        if (TextUtils.isEmpty(substring)) {
            return "";
        }
        int lastIndexOf = substring.lastIndexOf(CommonConstant.Symbol.DOT);
        return lastIndexOf > 0 ? substring.substring(0, lastIndexOf) : substring;
    }

    public final File e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3feeffc018251a2b6f174de211082141", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3feeffc018251a2b6f174de211082141") : ay.a(context, this.r);
    }

    public final String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f477bbd6deaa76288da88ad657d7686", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f477bbd6deaa76288da88ad657d7686");
        }
        return "mmp_" + this.r;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public boolean a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public JSONArray g;

        public b() {
        }
    }
}
