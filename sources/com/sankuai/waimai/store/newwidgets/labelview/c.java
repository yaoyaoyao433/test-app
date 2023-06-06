package com.sankuai.waimai.store.newwidgets.labelview;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8596115f3d74b23d710ae816642a148f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8596115f3d74b23d710ae816642a148f");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] a(ArrayList<Integer> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb0a347255d0269c4a5f53a6a95ce3d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb0a347255d0269c4a5f53a6a95ce3d6");
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < iArr.length; i++) {
            Integer num = arrayList.get(i);
            iArr[i] = num == null ? 0 : num.intValue();
        }
        return iArr;
    }
}
