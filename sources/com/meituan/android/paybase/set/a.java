package com.meituan.android.paybase.set;

import android.text.TextUtils;
import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static String b = null;
    private static boolean c = true;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49b5244225ccc0ed6dbbfcef85958752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49b5244225ccc0ed6dbbfcef85958752");
            return;
        }
        af.a(com.meituan.android.paybase.config.a.d().a(), "member_id_storage_name").a("member_id_key", str);
        b = str;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c331bd68893ebebedf7896140155dbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c331bd68893ebebedf7896140155dbb");
        }
        if (TextUtils.isEmpty(b)) {
            b = af.a(com.meituan.android.paybase.config.a.d().a(), "member_id_storage_name").b("member_id_key", "");
        }
        if (!TextUtils.isEmpty(com.meituan.android.paybase.config.a.d().i()) && !TextUtils.isEmpty(b)) {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_upload_memberID", 200);
        } else if (!TextUtils.isEmpty(com.meituan.android.paybase.config.a.d().i()) && TextUtils.isEmpty(b) && c) {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_userset_upload_memberID", -9753);
            c = false;
        }
        if (!TextUtils.isEmpty(b)) {
            c = true;
        }
        return b;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "293781d7c5b39fcc9d6b2b24dbc9a04e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "293781d7c5b39fcc9d6b2b24dbc9a04e");
            return;
        }
        b = null;
        af.a(com.meituan.android.paybase.config.a.d().a(), "member_id_storage_name").b("member_id_key");
    }
}
