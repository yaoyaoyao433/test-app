package com.sankuai.waimai.platform.urlreplace;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.capacity.log.h;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private static volatile b c;
    private final List<a> d;
    private q e;

    public static /* synthetic */ void a(b bVar, String str) {
        List<a> b2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8f715d5d41b9fdf9a93ac478d791a7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8f715d5d41b9fdf9a93ac478d791a7a5");
            return;
        }
        String str2 = b;
        com.sankuai.waimai.foundation.utils.log.a.b(str2, "update URL config: " + str, new Object[0]);
        synchronized (bVar.d) {
            bVar.d.clear();
            if (str != null && (b2 = b(str)) != null && b2.size() > 0) {
                bVar.d.addAll(b2);
            }
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03b4af1ca61116abc8e39ab5f6e3e243", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03b4af1ca61116abc8e39ab5f6e3e243");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public b() {
        List<a> b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6083aaaa35acc9e07cf3b3d892b8b7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6083aaaa35acc9e07cf3b3d892b8b7f");
            return;
        }
        this.d = new ArrayList();
        this.e = b();
        this.e.a(new ah() { // from class: com.sankuai.waimai.platform.urlreplace.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.ah
            public final void a(String str, u uVar, String str2) {
                Object[] objArr2 = {str, uVar, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07a4ca85358e0b86d99972685c146bb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07a4ca85358e0b86d99972685c146bb9");
                } else if ("config".equals(str2)) {
                    b.a(b.this, b.this.c());
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4d6423dc0e9ca6c846ce6e1d901064d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4d6423dc0e9ca6c846ce6e1d901064d");
            return;
        }
        String c2 = c();
        String str = b;
        com.sankuai.waimai.foundation.utils.log.a.b(str, "init URL config: " + c2, new Object[0]);
        synchronized (this.d) {
            if (c2 != null) {
                try {
                    if (c2.length() > 0 && (b2 = b(c2)) != null && b2.size() > 0) {
                        this.d.addAll(b2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dee14d9d376f72a63e5d6eee86a3fade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dee14d9d376f72a63e5d6eee86a3fade");
            return;
        }
        String str2 = b;
        com.sankuai.waimai.foundation.utils.log.a.b(str2, "save: " + str, new Object[0]);
        q b2 = b();
        if (str == null || str.length() <= 0) {
            b2.b("config");
        } else {
            b2.a("config", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3100dcba020fcdf0d8a5902f25895e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3100dcba020fcdf0d8a5902f25895e") : this.e.b("config", (String) null);
    }

    @Nullable
    private static List<a> b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f4148461168e5f1c9960a8ef125ec48", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f4148461168e5f1c9960a8ef125ec48");
        }
        Gson a2 = k.a();
        try {
            JsonElement parse = new JsonParser().parse(str);
            if (parse != null && parse.isJsonArray()) {
                ArrayList arrayList = new ArrayList();
                Iterator<JsonElement> it = parse.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    MatchRuleModel matchRuleModel = (MatchRuleModel) a2.fromJson(it.next(), (Class<Object>) MatchRuleModel.class);
                    if (matchRuleModel != null) {
                        arrayList.add(new a(matchRuleModel));
                    }
                }
                return arrayList;
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(b, th);
            i.d(new h().a("url_replace_config").b("parse_config_error").b());
        }
        return null;
    }

    @Nullable
    public final a a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8d0828747a6e960e86b8b91a066788", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8d0828747a6e960e86b8b91a066788");
        }
        a aVar = null;
        synchronized (this.d) {
            Iterator<a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (next.a(uri)) {
                    aVar = next;
                    break;
                }
            }
        }
        String str = b;
        StringBuilder sb = new StringBuilder("match: ");
        sb.append(aVar != null);
        sb.append(" uri: ");
        sb.append(uri.toString());
        com.sankuai.waimai.foundation.utils.log.a.b(str, sb.toString(), new Object[0]);
        return aVar;
    }

    @Nullable
    public final Uri b(@Nullable Uri uri) {
        a a2;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c856c046a1c65a7f4e141fe920001e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c856c046a1c65a7f4e141fe920001e7");
        }
        if (uri == null || (a2 = a().a(uri)) == null) {
            return null;
        }
        return a2.b(uri);
    }

    private static q b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f4680d1664cf7dd03dc9dbb2c7a95d9", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f4680d1664cf7dd03dc9dbb2c7a95d9") : q.a(com.meituan.android.singleton.b.a, "waimai_url_replace_config", 1);
    }
}
