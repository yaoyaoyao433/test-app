package com.sankuai.waimai.imbase.utils;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ImSP {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e b = new com.sankuai.waimai.foundation.utils.e("waimai_im_common");

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum ImSpKey {
        IM_PUSH_INTERCEPT_INTERVAL,
        IM_PUSH_SHOW_INTERVAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static ImSpKey valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f91e5b0497664315c1478657dca83656", RobustBitConfig.DEFAULT_VALUE) ? (ImSpKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f91e5b0497664315c1478657dca83656") : (ImSpKey) Enum.valueOf(ImSpKey.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ImSpKey[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1193bd69095215c248b41bc0dd86c6e", RobustBitConfig.DEFAULT_VALUE) ? (ImSpKey[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1193bd69095215c248b41bc0dd86c6e") : (ImSpKey[]) values().clone();
        }

        ImSpKey() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19d79a97f47bd222f8e436e1dfe42fcf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19d79a97f47bd222f8e436e1dfe42fcf");
            }
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cbd4d264ddccf946b6421c32eb7f845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cbd4d264ddccf946b6421c32eb7f845");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e) ImSpKey.IM_PUSH_INTERCEPT_INTERVAL, i);
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "213d318b97f91ce7b96504e81a0b2eb3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "213d318b97f91ce7b96504e81a0b2eb3")).intValue() : b.b((com.sankuai.waimai.foundation.utils.e) ImSpKey.IM_PUSH_INTERCEPT_INTERVAL, 0);
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8eede267b4a45cf974f36132b848266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8eede267b4a45cf974f36132b848266");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e) ImSpKey.IM_PUSH_SHOW_INTERVAL, i);
        }
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5b080ca4c87f4b6a6b1b36f29155458", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5b080ca4c87f4b6a6b1b36f29155458")).intValue() : b.b((com.sankuai.waimai.foundation.utils.e) ImSpKey.IM_PUSH_SHOW_INTERVAL, 0);
    }
}
