package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static File a(@NonNull Context context, @NonNull String str, int i) throws Exception {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1f4fe68c25a36b947815cc857f736e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1f4fe68c25a36b947815cc857f736e0");
        }
        File a2 = a(context);
        if (a2 == null) {
            return null;
        }
        File file = new File(a2, "/mach/loading/picture");
        if (!file.exists()) {
            file.mkdirs();
        } else {
            File[] listFiles = file.listFiles();
            if (!com.sankuai.shangou.stone.util.a.b(listFiles)) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isFile()) {
                        String name = file2.getName();
                        if (!TextUtils.isEmpty(name) && name.contains(str)) {
                            file2.delete();
                        }
                    }
                }
            }
        }
        return new File(file, "/" + str + "#" + i + "#.png");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de3fe47ade699a01129789d0595bae09", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de3fe47ade699a01129789d0595bae09") : q.b(context, DefaultHeaderService.KEY_DRUG, "drug_homepage", u.e);
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ed51ecb986ab867c3670d6cd106a4f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ed51ecb986ab867c3670d6cd106a4f2")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("drug_homepage/mach_skeleton_cache_enable", true);
    }
}
