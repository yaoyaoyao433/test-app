package com.meituan.android.neohybrid.util;

import com.meituan.android.neohybrid.util.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements l.a {
    public static ChangeQuickRedirect a;
    private final Map b;
    private final boolean c;

    private m(Map map, boolean z) {
        this.b = map;
        this.c = z;
    }

    public static l.a a(Map map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86c6ed9273d2763b0bf0b713f9ac009d", RobustBitConfig.DEFAULT_VALUE) ? (l.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86c6ed9273d2763b0bf0b713f9ac009d") : new m(map, z);
    }

    @Override // com.meituan.android.neohybrid.util.l.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225a2dd7b425478d6e2af80401d81eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225a2dd7b425478d6e2af80401d81eb2");
            return;
        }
        Map map = this.b;
        boolean z = this.c;
        Object[] objArr2 = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "716516a89ecc2ea9e5e5ecad8721162e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "716516a89ecc2ea9e5e5ecad8721162e");
        } else if (map.containsKey(str)) {
        } else {
            if (z && StringUtil.NULL.equalsIgnoreCase(str2)) {
                return;
            }
            map.put(str, str2);
        }
    }
}
