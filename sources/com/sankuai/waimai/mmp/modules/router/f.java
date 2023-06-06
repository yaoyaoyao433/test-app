package com.sankuai.waimai.mmp.modules.router;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private Map<String, f> b;
    private Map<String, a> c;
    private f d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public String a;
        public String b;
    }

    private f b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e942231beef2e5ef636606b9c7e59d54", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e942231beef2e5ef636606b9c7e59d54");
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        if (!this.b.containsKey(str)) {
            this.b.put(str, new f());
        }
        return this.b.get(str);
    }

    private void a(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a7717fba2f3374ba7ecd8899dfa305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a7717fba2f3374ba7ecd8899dfa305");
            return;
        }
        if (this.c == null) {
            this.c = new TreeMap(new Comparator<String>() { // from class: com.sankuai.waimai.mmp.modules.router.f.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str2, String str3) {
                    String str4 = str2;
                    String str5 = str3;
                    Object[] objArr2 = {str4, str5};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afbc1ef038d6346bd62c33f98d72f235", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afbc1ef038d6346bd62c33f98d72f235")).intValue() : -Integer.compare(str4.length(), str5.length());
                }
            });
        }
        this.c.put(str, aVar);
    }

    public final a a(Uri uri) {
        f fVar;
        f fVar2;
        int i;
        a a2;
        a b;
        a aVar;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22179d914f0c8d51b2d6143c4a159d4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22179d914f0c8d51b2d6143c4a159d4a");
        }
        a aVar2 = null;
        if (uri == null || this.b == null || !uri.isHierarchical() || (fVar = this.b.get(uri.getScheme())) == null || fVar.b == null || (fVar2 = fVar.b.get(uri.getHost())) == null) {
            return null;
        }
        if (TextUtils.isEmpty(uri.getPath())) {
            a a3 = a(fVar2, uri.getQuery());
            if (a3 != null) {
                return a3;
            }
            return null;
        }
        if (fVar2.d != null && (aVar = fVar2.d.e) != null) {
            aVar2 = aVar;
        }
        int size = uri.getPathSegments().size();
        String query = uri.getQuery();
        if (size == 0) {
            return (fVar2.d == null || fVar2.d.c == null || query == null || (b = b(fVar2.d, query)) == null) ? aVar2 : b;
        }
        while (i < size && fVar2.b != null) {
            fVar2 = fVar2.b.get(uri.getPathSegments().get(i));
            if (fVar2 == null) {
                return aVar2;
            }
            if (i < size - 1) {
                if (fVar2.d != null) {
                    a2 = fVar2.d.e;
                    if (a2 == null) {
                    }
                    aVar2 = a2;
                }
            } else if (uri.getPath().endsWith("/")) {
                if (fVar2.d != null) {
                    a2 = a(fVar2.d, query);
                    if (a2 == null) {
                    }
                    aVar2 = a2;
                }
            } else {
                a2 = a(fVar2, query);
                i = a2 == null ? i + 1 : 0;
                aVar2 = a2;
            }
        }
        return aVar2;
    }

    private a a(f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134b073abf6a906200b4bec080908940", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134b073abf6a906200b4bec080908940");
        }
        a aVar = fVar.e;
        a b = b(fVar, str);
        return b != null ? b : aVar;
    }

    private static a b(f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99d042d0e05b40d2a2491d4af4354c9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99d042d0e05b40d2a2491d4af4354c9d");
        }
        if (fVar != null && fVar.c != null && str != null) {
            for (String str2 : fVar.c.keySet()) {
                if (str.startsWith(str2)) {
                    return fVar.c.get(str2);
                }
            }
        }
        return null;
    }

    public static f a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e17b2b7010c2d9bdbde9c2419217724e", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e17b2b7010c2d9bdbde9c2419217724e");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f fVar = new f();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("appId");
                        String optString2 = optJSONObject.optString("pagePath");
                        Uri parse = Uri.parse(next);
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && parse.isHierarchical()) {
                            f b = fVar.b(parse.getScheme()).b(parse.getHost());
                            String path = parse.getPath();
                            if (!TextUtils.isEmpty(path)) {
                                for (String str2 : parse.getPathSegments()) {
                                    b = b.b(str2);
                                }
                            }
                            a aVar = new a();
                            aVar.a = optString;
                            aVar.b = optString2;
                            boolean z = path != null && path.endsWith("/");
                            String query = parse.getQuery();
                            if (query != null) {
                                if (z) {
                                    Object[] objArr2 = {query, aVar};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "7339fe2828a52cd20f1d77925fc4304c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "7339fe2828a52cd20f1d77925fc4304c");
                                    } else {
                                        if (b.d == null) {
                                            b.d = new f();
                                        }
                                        b.d.a(query, aVar);
                                    }
                                } else {
                                    b.a(query, aVar);
                                }
                            } else if (z) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "10acb3637e69f1e855372f5553559992", RobustBitConfig.DEFAULT_VALUE)) {
                                    f fVar2 = (f) PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "10acb3637e69f1e855372f5553559992");
                                } else {
                                    if (b.d == null) {
                                        b.d = new f();
                                    }
                                    b.d.e = aVar;
                                    f fVar3 = b.d;
                                }
                            } else {
                                b.e = aVar;
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return fVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
