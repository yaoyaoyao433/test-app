package com.sankuai.waimai.platform.domain.manager.chamelon;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    private Context k;

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "557226ec8260622a934d470fd6fdae61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "557226ec8260622a934d470fd6fdae61");
        } else {
            com.sankuai.waimai.foundation.router.a.a(aVar.k, str);
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0be26e463687d9ceca5532bbad338f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0be26e463687d9ceca5532bbad338f");
        } else {
            this.k = context;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public void a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9122cc3b4d18c6434665ebbe35010155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9122cc3b4d18c6434665ebbe35010155");
            return;
        }
        if (!set.contains(str) && set.size() < 50) {
            set.add(str);
        } else if (!set.contains(str) && set.size() == 50) {
            set.remove(set.toArray()[0]);
            set.add(str);
        }
        this.k.getSharedPreferences("wm_chameleon", 0).edit().putStringSet("chameleon_cmd_storage_set", set).commit();
    }
}
