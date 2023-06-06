package com.sankuai.meituan.oauth;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.x;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static d f;
    x b;
    final Gson c;
    final Map<String, b> d;
    Map<String, e> e;

    public static d a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a109db5b6e426af948775302f6129b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a109db5b6e426af948775302f6129b4");
        }
        if (f == null) {
            f = new d(context);
            b(context);
        }
        return f;
    }

    private static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "645bf62458c94db06812dde5ac5027b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "645bf62458c94db06812dde5ac5027b6");
            return;
        }
        b bVar = new b();
        bVar.b = "sina";
        bVar.c = a.a(context);
        bVar.e = a.b(context);
        bVar.d = "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write";
        b bVar2 = new b();
        bVar2.b = UserCenter.OAUTH_TYPE_QQ;
        bVar2.c = a.e(context);
        b bVar3 = new b();
        bVar3.b = UserCenter.OAUTH_TYPE_WEIXIN;
        bVar3.c = a.c(context);
        bVar3.e = a.d(context);
        f.a(bVar);
        f.a(bVar2);
        f.a(bVar3);
    }

    private d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b038dd9e26c618d7fb07bfc815191feb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b038dd9e26c618d7fb07bfc815191feb");
            return;
        }
        this.b = x.a(q.a(context, "homepage_oauth"));
        this.c = new Gson();
        this.d = new LinkedHashMap();
        try {
            this.e = (Map) this.c.fromJson(this.b.b("oauth_result", (String) null, "oauth"), new TypeToken<Map<String, e>>() { // from class: com.sankuai.meituan.oauth.d.1
            }.getType());
        } catch (JsonParseException unused) {
        }
        if (this.e == null) {
            this.e = new LinkedHashMap();
        }
    }

    private void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b400a8cb7891a20b24c487f40b842077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b400a8cb7891a20b24c487f40b842077");
        } else {
            this.d.put(bVar.b, bVar);
        }
    }
}
