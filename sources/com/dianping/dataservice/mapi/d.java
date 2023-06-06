package com.dianping.dataservice.mapi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.dianping.util.e {
    public static ChangeQuickRedirect a;

    public d(String... strArr) {
        super(a(strArr), "UTF-8");
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adde3815a390b7c140e7ece2ec33a6bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adde3815a390b7c140e7ece2ec33a6bc");
        }
    }

    private static HashMap<String, String> a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b4f5f84ce4b072350ec50cbb3cefd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b4f5f84ce4b072350ec50cbb3cefd6");
        }
        int length = strArr.length / 2;
        HashMap<String, String> hashMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            hashMap.put(strArr[i2], strArr[i2 + 1]);
        }
        return hashMap;
    }
}
