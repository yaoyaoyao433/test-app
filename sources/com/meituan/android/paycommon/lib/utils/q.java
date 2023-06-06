package com.meituan.android.paycommon.lib.utils;

import android.widget.CompoundButton;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final CommonGuide b;

    private q(CommonGuide commonGuide) {
        this.b = commonGuide;
    }

    public static CompoundButton.OnCheckedChangeListener a(CommonGuide commonGuide) {
        Object[] objArr = {commonGuide};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d6055bafc6061f2f9ee1dd6c1578e3e", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d6055bafc6061f2f9ee1dd6c1578e3e") : new q(commonGuide);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abeec6016fc7b90c245976bb24cc8d0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abeec6016fc7b90c245976bb24cc8d0c");
            return;
        }
        CommonGuide commonGuide = this.b;
        Object[] objArr2 = {commonGuide, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = p.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1f53ad45d8d21b03fae4e4e496533d6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1f53ad45d8d21b03fae4e4e496533d6c");
        } else {
            com.meituan.android.paybase.common.analyse.a.a("c_sjk32ngz", "b_pay_bjvq8l2y_mc", "开通自动扣款", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("title", commonGuide.getTitle()).a("type", z ? "开通" : "关闭").b, a.EnumC0329a.CLICK, -1);
        }
    }
}
