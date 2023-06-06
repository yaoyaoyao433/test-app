package com.sankuai.waimai.router.set_id;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public static void a(Context context, String str, String str2, long j) {
        Object[] objArr = {context, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a340dfcb757f5a9c6d3c236695b964d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a340dfcb757f5a9c6d3c236695b964d");
            return;
        }
        q a2 = a(context);
        a2.a("region_id", str);
        a2.a("region_version", str2);
        a2.a("region_user_id", j);
    }

    public static q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df7dde497108a78b9f71d9411056ad3b", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df7dde497108a78b9f71d9411056ad3b") : q.a(context, "waimai_share_setid");
    }

    public static Map<String, String> a(Context context, @Nullable b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0bbb300c2a8dfac8ba4b88106069ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0bbb300c2a8dfac8ba4b88106069ca6");
        }
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        q a2 = a(context);
        long b = a2.b("region_user_id", 0L);
        User user = UserCenter.getInstance(context).getUser();
        if (user == null) {
            return hashMap;
        }
        if (user.id != b) {
            if (bVar != null) {
                bVar.a(true, b != 0 ? 15103 : 15102);
            }
            return hashMap;
        }
        String b2 = a2.b("region_id", (String) null);
        if (b2 != null) {
            hashMap.put("region_id", b2);
        }
        String b3 = a2.b("region_version", (String) null);
        if (b3 != null) {
            hashMap.put("region_version", b3);
        }
        if (bVar != null) {
            boolean isEmpty = TextUtils.isEmpty(b2);
            boolean isEmpty2 = TextUtils.isEmpty(b3);
            if (isEmpty && isEmpty2) {
                bVar.a(true, 15102);
            } else if (isEmpty) {
                bVar.a(true, 15100);
            } else if (isEmpty2) {
                bVar.a(true, 15101);
            } else {
                bVar.a(false, 0);
            }
        }
        return hashMap;
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0169d2d3576e50988310774101474657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0169d2d3576e50988310774101474657");
        } else {
            a(context, "", "", 0L);
        }
    }
}
