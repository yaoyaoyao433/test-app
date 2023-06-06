package com.sankuai.waimai.business.knb;

import android.util.SparseIntArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d implements com.sankuai.waimai.foundation.core.service.share.listener.b {
    public static ChangeQuickRedirect a;
    private static final SparseIntArray b;

    public abstract void b(int i, int i2);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.put(1, 1);
        b.put(2, 0);
        b.put(4, 2);
        b.put(5, 4);
        b.put(3, 5);
    }

    @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa675b24d48344b2c2749c0f326414d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa675b24d48344b2c2749c0f326414d");
        } else {
            b(b.get(i), i2);
        }
    }
}
