package com.sankuai.waimai.store.widgets.lottie;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.j;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;
    private static final String[] e = {"wm_sc_home_store.json", "wm_sc_home_up.json", "wm_sc_up_store.json", "wm_sc_store_up.json", "new_home_store.json", "new_rocket_store.json", "new_store_rocket.json"};
    public final Map<String, com.airbnb.lottie.e> b;
    public e c;
    public final Map<String, String> d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d579fdf3fbe53d98f89636615a4e52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d579fdf3fbe53d98f89636615a4e52");
            return;
        }
        this.b = new ArrayMap();
        this.d = new HashMap();
        a(context);
    }

    private void a(Context context) {
        String[] strArr;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad10268970dbca67a35b7c9b7dec94e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad10268970dbca67a35b7c9b7dec94e");
            return;
        }
        for (String str : e) {
            String a2 = j.a(context, str);
            if (!TextUtils.isEmpty(a2)) {
                this.d.put(str, a2);
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.lottie.e
    public final void a(@Nullable Map<String, com.airbnb.lottie.e> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecd7c3325b3ca58dbeaaa6c642f0600b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecd7c3325b3ca58dbeaaa6c642f0600b");
        } else if (map == null) {
        } else {
            this.b.putAll(map);
            if (this.c != null) {
                this.c.a(this.b);
            }
        }
    }

    public final com.airbnb.lottie.e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d55312a6bdba4f8fd06fbb5073e0a2c", RobustBitConfig.DEFAULT_VALUE) ? (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d55312a6bdba4f8fd06fbb5073e0a2c") : this.b.get(str);
    }
}
