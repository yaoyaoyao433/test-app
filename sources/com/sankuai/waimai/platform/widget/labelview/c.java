package com.sankuai.waimai.platform.widget.labelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends e {
    public static ChangeQuickRedirect b;

    public c() {
        super(0);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b659c64ad50a825ea1be5fd93954c75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b659c64ad50a825ea1be5fd93954c75");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(ArrayList<Integer> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42202da563a5c1e8f1155dfb6f2f8ad9", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42202da563a5c1e8f1155dfb6f2f8ad9");
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < iArr.length; i++) {
            Integer num = arrayList.get(i);
            iArr[i] = num == null ? 0 : num.intValue();
        }
        return iArr;
    }
}
