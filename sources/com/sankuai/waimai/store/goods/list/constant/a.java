package com.sankuai.waimai.store.goods.list.constant;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.router.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.constant.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1182a {
        public static final String a = i.a + "/msc?appId=7122f6e193de47c1&targetPath=%2Fpages%2Fspec-pop%2Findex";
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a54fc999aba9a575249b6980c8d351e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a54fc999aba9a575249b6980c8d351e");
        }
        if (t.a(str)) {
            return str;
        }
        return str + "&from=2";
    }
}
