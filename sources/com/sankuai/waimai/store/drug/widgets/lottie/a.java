package com.sankuai.waimai.store.drug.widgets.lottie;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.j;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.widgets.lottie.d;
import com.sankuai.waimai.store.widgets.lottie.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"wm_drug_drug_up.json", "wm_drug_home_drug.json", "wm_drug_home_up.json", "wm_drug_up_drug.json"};
    private final Map<String, com.airbnb.lottie.e> c;
    private e d;
    private final Map<String, String> e;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9e16752c6038ea27c0213ea892170cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9e16752c6038ea27c0213ea892170cf");
            return;
        }
        this.c = new ArrayMap();
        this.e = new HashMap();
        a(context);
    }

    private void a(Context context) {
        String[] strArr;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c3b31bc297e290dd34182c30cabb066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c3b31bc297e290dd34182c30cabb066");
            return;
        }
        for (String str : b) {
            String a2 = j.a(context, str);
            if (!TextUtils.isEmpty(a2)) {
                this.e.put(str, a2);
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.lottie.e
    public final void a(@Nullable Map<String, com.airbnb.lottie.e> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51cb00200751071108bbcba0952fafa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51cb00200751071108bbcba0952fafa");
        } else if (map == null) {
        } else {
            this.c.putAll(map);
            if (this.d != null) {
                this.d.a(this.c);
            }
        }
    }

    public final void a(List<String> list, String str, e eVar) {
        Object[] objArr = {list, str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24cccc6dceb7a453959602c89576f44b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24cccc6dceb7a453959602c89576f44b");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            this.d = eVar;
            this.c.clear();
            al.a(new d(list, this.e, this), str);
        }
    }

    public final com.airbnb.lottie.e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80be8e3a1631cf0a96bd56c5c724dca4", RobustBitConfig.DEFAULT_VALUE) ? (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80be8e3a1631cf0a96bd56c5c724dca4") : this.c.get(str);
    }
}
