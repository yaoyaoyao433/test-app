package com.sankuai.waimai.platform.encrypt;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public List<String> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b6f73a405bea2aa9bb86414323ffeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b6f73a405bea2aa9bb86414323ffeb");
        } else {
            this.b = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.encrypt.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1051a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b55832953145e50ccc6d62aa9233b0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b55832953145e50ccc6d62aa9233b0") : C1051a.a;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807696ead6a037ce9f86845f850494e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807696ead6a037ce9f86845f850494e8")).booleanValue();
        }
        List<String> list = this.b;
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            String A = com.sankuai.waimai.platform.utils.sharedpreference.a.A();
            if (!TextUtils.isEmpty(A)) {
                list = (List) k.a().fromJson(A, new TypeToken<List<String>>() { // from class: com.sankuai.waimai.platform.encrypt.a.1
                }.getType());
                this.b = list;
            }
        }
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str.endsWith(str2)) {
                    com.dianping.networklog.c.a("InEncryptionApiWhiteList:" + str + " str:" + str2, 3);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(String str) {
        Uri parse;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c852f13838d079935f5591a3143aaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c852f13838d079935f5591a3143aaf")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        if (a(parse)) {
            return true;
        }
        String host = parse.getHost();
        if ("meituaninternaltest".equals(com.meituan.android.base.a.f) || com.sankuai.waimai.foundation.core.a.b()) {
            return "paotui.meituan.com".equals(host) || "paotui.banma.test.sankuai.com".equals(host) || "paotui.banma.st.meituan.com".equals(host);
        }
        return "paotui.meituan.com".equals(host);
    }

    public final boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2143ae690df0062f4350ac3c81830e49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2143ae690df0062f4350ac3c81830e49")).booleanValue();
        }
        return b(uri.getAuthority() + uri.getPath());
    }
}
