package com.meituan.mmp.lib.api.report;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public static a b;
    public Set<String> c;
    public Long d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75de792ae1402ea7a3b56b63cbef1b98", RobustBitConfig.DEFAULT_VALUE)) {
            Set set = (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75de792ae1402ea7a3b56b63cbef1b98");
            return;
        }
        if (this.c == null) {
            String string = MMPEnvHelper.getSharedPreferences("mmp_res_report").getString("accessAppIds", "");
            if (!TextUtils.isEmpty(string)) {
                this.c = (Set) new Gson().fromJson(string, new TypeToken<Set<String>>() { // from class: com.meituan.mmp.lib.api.report.a.1
                }.getType());
            }
            if (this.c == null) {
                this.c = new HashSet();
            }
        }
        Set<String> set2 = this.c;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a81f38ac980d720747bd19d225e6275", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a81f38ac980d720747bd19d225e6275");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }
}
