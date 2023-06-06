package com.meituan.msc.modules.update;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.dio.easy.DioFile;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.modules.container.fusion.b;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
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
@ModuleName(name = "AppConfigModule")
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.modules.manager.k {
    public static ChangeQuickRedirect a;
    public volatile JSONObject b;
    public b c;
    public volatile JSONObject d;
    public String e;
    public Map<String, m> f;
    private String g;
    private JSONObject h;
    private JSONObject i;
    private boolean j;
    private Map<String, List<String>> k;

    public final synchronized void d() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfad7f02f9d6cf3bf57b88f1c96c8f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfad7f02f9d6cf3bf57b88f1c96c8f2f");
            return;
        }
        f fVar = U_().r;
        if (this.b == null || !TextUtils.equals(this.g, fVar.w())) {
            String e = fVar.e();
            DioFile dioFile = new DioFile(e, "app-config.json");
            Object[] objArr2 = {fVar, e, dioFile};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6627648205d5954b39e52fb00e6be711", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6627648205d5954b39e52fb00e6be711");
            } else if (!dioFile.c()) {
                fVar.b(e, new e(fVar.E(), dioFile, "app-config.json"));
                throw new RuntimeException("mainPackage config file not exist:" + e);
            }
            try {
                q(r.a(dioFile));
                this.g = fVar.w();
                com.meituan.msc.modules.reporter.g.d("bundle", "mainPackage initConfig end");
            } catch (IOException e2) {
                throw new IOException("mainPackage config file read error:", e2);
            }
        }
    }

    private void q(String str) throws RuntimeException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8094d303542ffb3d862314b0c689259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8094d303542ffb3d862314b0c689259");
            return;
        }
        try {
            this.b = new JSONObject(str);
            this.h = this.b.optJSONObject("window");
            if (this.h != null) {
                this.d = this.h.optJSONObject("pages");
            }
            this.i = this.b.optJSONObject("networkTimeout");
            this.j = this.b.optBoolean("enableShark");
            this.e = this.b.optString("webLongTapSaveImageToken");
            JSONObject optJSONObject = this.b.optJSONObject("tabBar");
            if (optJSONObject != null) {
                this.c = new b();
                this.c.a = optJSONObject.optBoolean("custom", false);
                this.c.b = optJSONObject.optString("color");
                this.c.c = optJSONObject.optString("selectedColor");
                this.c.d = optJSONObject.optString("backgroundColor");
                this.c.e = optJSONObject.optString(BorderStyle.LOWER_CASE_NAME);
                this.c.f = optJSONObject.optString("position");
                this.c.g = optJSONObject.optJSONArray(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
                ArrayList<String> arrayList = new ArrayList<>();
                int length = this.c.g.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = this.c.g.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(optJSONObject2.optString("pagePath"));
                    }
                }
                b.a aVar = new b.a();
                aVar.a = arrayList;
                aVar.b = arrayList.contains(g());
                aVar.c = true;
                com.meituan.msc.modules.container.fusion.b.c.put(U_().r.j(), aVar);
            }
        } catch (JSONException unused) {
            com.meituan.msc.modules.reporter.g.a("bundle", String.format("config is not JSON format! config=%s", str));
            throw new RuntimeException(String.format("config is not JSON format! config=%s", str));
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad40d4a77c32c01bc2efc698bef5badf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad40d4a77c32c01bc2efc698bef5badf");
        }
        String b2 = b(str, "navigationBarBackgroundColor");
        return TextUtils.isEmpty(b2) ? "#FFFFFF" : b2;
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8077b658be9e6888857d5cd18f1b33d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8077b658be9e6888857d5cd18f1b33d6") : "black".equals(b(str, "navigationBarTextStyle")) ? DiagnoseLog.COLOR_ERROR : "#FFFFFF";
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.update.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0474a {
        STATIC,
        DYNAMIC,
        NONE;
        
        public static ChangeQuickRedirect a;

        EnumC0474a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24fbfb419349475e70dc418678e5882f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24fbfb419349475e70dc418678e5882f");
            }
        }

        public static EnumC0474a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d5e9519d9fcbc48ecadaccccbc88be6", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0474a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d5e9519d9fcbc48ecadaccccbc88be6") : (EnumC0474a) Enum.valueOf(EnumC0474a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0474a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a838ad50d657b70bfe508cdc3fc6bab", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0474a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a838ad50d657b70bfe508cdc3fc6bab") : (EnumC0474a[]) values().clone();
        }
    }

    public final EnumC0474a c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ae7c0cef89baa5dccdd70730dda1ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnumC0474a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ae7c0cef89baa5dccdd70730dda1ca");
        }
        String b2 = b(str, "initialRenderingCache");
        if ("static".equals(b2)) {
            return EnumC0474a.STATIC;
        }
        if (UserCenter.OAUTH_TYPE_DYNAMIC.equals(b2)) {
            return EnumC0474a.DYNAMIC;
        }
        return EnumC0474a.NONE;
    }

    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c21c63bc0e23885b18a4e61a01824c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c21c63bc0e23885b18a4e61a01824c")).booleanValue() : "true".equalsIgnoreCase(b(str, "initialRenderingSnapshot"));
    }

    public final boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693e79b73eec5e0fdca0e0aaf858fb55", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693e79b73eec5e0fdca0e0aaf858fb55")).booleanValue() : "custom".equalsIgnoreCase(b(str, "navigationStyle"));
    }

    public final String j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b892664921a7260f723d6406e58a879", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b892664921a7260f723d6406e58a879") : b(str, "navigationBarTitleText");
    }

    public final boolean k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fe440f00680311b153bbe3956abaf8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fe440f00680311b153bbe3956abaf8f")).booleanValue() : "true".equalsIgnoreCase(b(str, "enablePullDownRefresh"));
    }

    public final int l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae09474d859f91e4217a8b3a5b0e264", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae09474d859f91e4217a8b3a5b0e264")).intValue();
        }
        if (this.i != null) {
            return this.i.optInt(str, 60000);
        }
        return 60000;
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e013a7ad40c9c85553c56662bf6ce68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e013a7ad40c9c85553c56662bf6ce68")).intValue();
        }
        if (this.i != null) {
            return this.i.optInt(SocialConstants.TYPE_REQUEST, 60000);
        }
        return 60000;
    }

    public String b(String str, String str2) {
        JSONObject optJSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce19a692812de41892e4399ef42f3741", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce19a692812de41892e4399ef42f3741");
        }
        if (this.h == null && this.d == null) {
            return null;
        }
        if (this.d != null && (optJSONObject = this.d.optJSONObject(am.b(str))) != null) {
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
        return this.h.optString(str2);
    }

    public final boolean f() {
        return this.b != null;
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ff6497a91c8e23b6b3a77077f0071a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ff6497a91c8e23b6b3a77077f0071a4");
        }
        if (this.b == null) {
            throw new RuntimeException("getRootPath when config null");
        }
        String optString = this.b.optString("root");
        return TextUtils.isEmpty(optString) ? "" : optString;
    }

    public final boolean m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71129fbd481fde9b94b7643a5cfaa97e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71129fbd481fde9b94b7643a5cfaa97e")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return this.d.has(am.b(str));
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d47b45f50e60cda4dd1e4eae682940", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d47b45f50e60cda4dd1e4eae682940")).booleanValue() : this.c != null && "top".equals(this.c.f);
    }

    public final List<com.meituan.msc.modules.page.view.tab.b> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1914bc5c49a7de9f6c7b3be2203ef5d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1914bc5c49a7de9f6c7b3be2203ef5d0");
        }
        if (this.c == null || this.c.g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = this.c.g.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = this.c.g.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.length() != 0) {
                com.meituan.msc.modules.page.view.tab.b bVar = new com.meituan.msc.modules.page.view.tab.b();
                bVar.a = this.c.b;
                bVar.b = this.c.c;
                bVar.c = optJSONObject.optString("iconPath");
                bVar.d = optJSONObject.optString("selectedIconPath");
                bVar.e = optJSONObject.optString("text");
                bVar.f = optJSONObject.optString("pagePath");
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final boolean n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a1fde4c29f0bb1afabb21e7603f777", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a1fde4c29f0bb1afabb21e7603f777")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.c == null || this.c.g == null) {
            return false;
        }
        String b2 = am.b(str);
        int length = this.c.g.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = this.c.g.optJSONObject(i);
            if (optJSONObject != null && b2.equals(optJSONObject.optString("pagePath"))) {
                return true;
            }
        }
        return false;
    }

    public final com.meituan.msc.b o(String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6075636f7aa8b60f78c563077e17805d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6075636f7aa8b60f78c563077e17805d");
        }
        String b2 = am.b(str);
        com.meituan.msc.b bVar = null;
        JSONObject jSONObject = this.d;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject(b2)) != null) {
            bVar = com.meituan.msc.b.a(optJSONObject.optString("rendererType"));
        }
        return bVar == null ? com.meituan.msc.b.WEBVIEW : bVar;
    }

    @Nullable
    public final List<String> p(String str) {
        int i = 1;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037165389134e6143e66e90ca16ebde6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037165389134e6143e66e90ca16ebde6");
        }
        String b2 = "/".equals(str) ? "/" : am.b(str);
        if (this.k == null) {
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject = this.b != null ? this.b.optJSONObject("pagePreloadRule") : null;
            if (optJSONObject != null) {
                int l = com.meituan.msc.common.config.b.l();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= optJSONArray.length()) {
                                break;
                            } else if (i2 >= l) {
                                Object[] objArr2 = new Object[i];
                                objArr2[0] = optJSONArray.length() + " resources for page " + next + " exceeds limit " + l + ", ignore more";
                                com.meituan.msc.modules.reporter.g.e("bundle", objArr2);
                                break;
                            } else {
                                String optString = optJSONArray.optString(i2);
                                if (optString != null && m(optString)) {
                                    arrayList.add(optString);
                                } else {
                                    Object[] objArr3 = new Object[i];
                                    objArr3[0] = "invalid resource path in pagePreloadRules: " + optString;
                                    com.meituan.msc.modules.reporter.g.e("bundle", objArr3);
                                }
                                i2++;
                                i = 1;
                            }
                        }
                        hashMap.put(next, arrayList);
                        i = 1;
                    }
                }
            }
            this.k = hashMap;
        }
        return this.k.get(b2);
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
