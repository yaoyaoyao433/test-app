package com.sankuai.waimai.platform.machpro;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.meituan.mtimageloader.utils.b {
    public static ChangeQuickRedirect a;
    final String b;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf53a5ad1aa8502250d8e9cf29f4122c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf53a5ad1aa8502250d8e9cf29f4122c");
        } else {
            this.b = str;
        }
    }
}
