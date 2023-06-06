package com.sankuai.waimai.store.mrn;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.l;
import com.sankuai.waimai.store.router.h;
import com.sankuai.waimai.store.util.v;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGRedirectModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNRedirect";
    }

    public SGRedirectModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37040ac088be80681f38b9b46d15e565", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37040ac088be80681f38b9b46d15e565");
        }
    }

    @ReactMethod
    public void redirectionURLString(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54f2e4c67b92510d7886cbbb3fbb7125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54f2e4c67b92510d7886cbbb3fbb7125");
            return;
        }
        try {
            promise.resolve(redirectUrlByHorn(appendTakeoutForScheme(str)));
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    private String appendTakeoutForScheme(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd0e9986f93844aef324c10e27221eaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd0e9986f93844aef324c10e27221eaf");
        }
        if (v.d) {
            String originMatchUrl = getOriginMatchUrl(Uri.parse(str));
            if (t.a(originMatchUrl) || originMatchUrl.contains("/takeout") || originMatchUrl.contains("dianping://mrn")) {
                return str;
            }
            if (originMatchUrl.contains("/smshopcardmrn")) {
                return str.replace("/smshopcardmrn", "/takeout/smshopcardmrn");
            }
            return originMatchUrl.contains("/mrn") ? str.replace(originMatchUrl, "dianping://mrn") : str;
        }
        return str;
    }

    private boolean isMrnScheme(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12f9764ac0269c97f84bb4aa581b1299", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12f9764ac0269c97f84bb4aa581b1299")).booleanValue() : str.toLowerCase().startsWith(h.g);
    }

    private boolean matchMrnUrl(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97112fe73dd724c01a37f2161f8306aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97112fe73dd724c01a37f2161f8306aa")).booleanValue();
        }
        try {
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.equals(parse.getQueryParameter(str2), uri.getQueryParameter(str2))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String mrnSchemeRedirect(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6315adf28c4c7da53a2ba47b86d98624", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6315adf28c4c7da53a2ba47b86d98624");
        }
        try {
            if (!t.a(str) && isMrnScheme(str)) {
                Uri parse = Uri.parse(str);
                for (JsonObject jsonObject : l.e().c.values()) {
                    if (jsonObject != null && !jsonObject.isJsonNull()) {
                        JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive("src_url");
                        String asString = asJsonPrimitive != null ? asJsonPrimitive.getAsString() : null;
                        if (!t.a(asString) && isMrnScheme(asString) && matchMrnUrl(parse, asString)) {
                            JsonPrimitive asJsonPrimitive2 = jsonObject.getAsJsonPrimitive("switch");
                            JsonPrimitive asJsonPrimitive3 = jsonObject.getAsJsonPrimitive("dst_url");
                            if (asJsonPrimitive2 != null && asJsonPrimitive3 != null) {
                                boolean asBoolean = asJsonPrimitive2.getAsBoolean();
                                String asString2 = asJsonPrimitive3.getAsString();
                                if (asBoolean && !t.a(asString2)) {
                                    return asString2;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.dianping.judas.util.a.a(th);
        }
        return null;
    }

    private String redirectUrlByHorn(String str) {
        JsonObject jsonObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7e85410d0c0ccbbfa28072d836bc7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7e85410d0c0ccbbfa28072d836bc7e");
        }
        if (t.a(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String originMatchUrl = getOriginMatchUrl(parse);
        String mrnSchemeRedirect = mrnSchemeRedirect(str);
        if (mrnSchemeRedirect != null) {
            return mrnSchemeRedirect;
        }
        l e = l.e();
        Object[] objArr2 = {originMatchUrl};
        ChangeQuickRedirect changeQuickRedirect3 = l.b;
        if (PatchProxy.isSupport(objArr2, e, changeQuickRedirect3, false, "7da353741521df5cc447ac041aed7a7c", RobustBitConfig.DEFAULT_VALUE)) {
            jsonObject = (JsonObject) PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect3, false, "7da353741521df5cc447ac041aed7a7c");
        } else {
            jsonObject = TextUtils.isEmpty(originMatchUrl) ? null : e.c.get(originMatchUrl);
        }
        if (jsonObject == null) {
            return str;
        }
        boolean b = l.e().b("switch", originMatchUrl);
        String a = l.e().a("dst_url", originMatchUrl);
        if (!b || TextUtils.isEmpty(a)) {
            return str;
        }
        String encodedQuery = parse != null ? parse.getEncodedQuery() : "";
        if (TextUtils.isEmpty(encodedQuery) || TextUtils.isEmpty(a)) {
            return a;
        }
        if (a.indexOf(CommonConstant.Symbol.QUESTION_MARK, a.indexOf(CommonConstant.Symbol.COLON)) > 0) {
            return a + "&" + encodedQuery;
        }
        return a + CommonConstant.Symbol.QUESTION_MARK + encodedQuery;
    }

    private String getOriginMatchUrl(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878e3f037615dd00622686629c93fad3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878e3f037615dd00622686629c93fad3");
        }
        if (uri != null) {
            String host = TextUtils.isEmpty(uri.getHost()) ? "" : uri.getHost();
            String path = TextUtils.isEmpty(uri.getPath()) ? "" : uri.getPath();
            return uri.getScheme() + "://" + host + path;
        }
        return null;
    }
}
