package com.sankuai.waimai.alita.core.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;

    @Nullable
    public static List<String> a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af78bd85d61f4e2e26d031662b696440", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af78bd85d61f4e2e26d031662b696440") : a(str, CommonConstant.Symbol.COMMA);
    }

    @Nullable
    private static List<String> a(@Nullable String str, String str2) {
        String[] split;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8d5d4aa043e2e6841de73abb641ad9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8d5d4aa043e2e6841de73abb641ad9f");
        }
        if (str != null) {
            arrayList = new ArrayList();
            for (String str3 : str.split(String.valueOf(str2))) {
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.add(str3.trim());
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public List<String> c;

        public a(@Nullable String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960fd94b7033161845209d024ae84a0f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960fd94b7033161845209d024ae84a0f");
                return;
            }
            this.b = str;
            this.c = new LinkedList();
        }
    }
}
