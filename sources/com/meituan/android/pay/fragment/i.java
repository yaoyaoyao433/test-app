package com.meituan.android.pay.fragment;

import com.meituan.android.pay.model.bean.BankCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Comparator {
    public static ChangeQuickRedirect a;
    private static final i b = new i();

    public static Comparator a() {
        return b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc50c65cfdc712117a07c011b337283e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc50c65cfdc712117a07c011b337283e")).intValue() : MTCBanksFragment.a((BankCard) obj, (BankCard) obj2);
    }
}
