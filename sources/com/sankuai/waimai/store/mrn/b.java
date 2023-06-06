package com.sankuai.waimai.store.mrn;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @Nullable
    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76f485ed414fecec2ade53b2636e7b11", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76f485ed414fecec2ade53b2636e7b11");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                a aVar = (a) i.a().fromJson(str, (Class<Object>) a.class);
                if (!TextUtils.isEmpty(aVar.c) && !Constants.UNDEFINED.equalsIgnoreCase(aVar.c) && !StringUtil.NULL.equalsIgnoreCase(aVar.c)) {
                    aVar.e = true;
                    return aVar;
                }
                aVar.e = false;
                aVar.c = null;
                return aVar;
            } catch (Exception unused) {
                String trim = str.trim();
                if (TextUtils.equals(trim, Constants.UNDEFINED)) {
                    return null;
                }
                a aVar2 = new a();
                aVar2.b = Long.parseLong(trim);
                aVar2.e = false;
                return aVar2;
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }
}
