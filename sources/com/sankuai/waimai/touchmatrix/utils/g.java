package com.sankuai.waimai.touchmatrix.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static boolean a(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "225334d611ac093766cb6b551f222f3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "225334d611ac093766cb6b551f222f3c")).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5fafda31205f9a69aa1b6b2a9d327ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5fafda31205f9a69aa1b6b2a9d327ea")).booleanValue() : TextUtils.isEmpty(str) || StringUtil.NULL.equals(str);
    }

    public static boolean a(Map<?, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "755eb102f9c453bdf4818439bf68c5f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "755eb102f9c453bdf4818439bf68c5f0")).booleanValue() : map == null || map.isEmpty();
    }

    public static String a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "627039d3c5dbc3162323576411d9af7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "627039d3c5dbc3162323576411d9af7b");
        }
        if (aVar != null && aVar.k != null) {
            return aVar.k.bizId;
        }
        return com.sankuai.waimai.touchmatrix.rebuild.biz.a.a();
    }
}
