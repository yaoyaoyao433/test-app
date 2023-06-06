package com.meituan.android.cashier.payresult;

import android.os.CountDownTimer;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.model.bean.OverLoadInfo;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public PayActionListener b;
    public PayBaseActivity c;
    i d;
    public CountDownTimer e;
    public InterfaceC0190a f;
    public String g;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.cashier.payresult.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0190a {
        void a(OverLoadInfo overLoadInfo);
    }

    public a(InterfaceC0190a interfaceC0190a, PayActionListener payActionListener, PayBaseActivity payBaseActivity, i iVar, String str) {
        Object[] objArr = {interfaceC0190a, payActionListener, payBaseActivity, iVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e589b24960576bff7344c26ff90aeb91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e589b24960576bff7344c26ff90aeb91");
            return;
        }
        this.f = interfaceC0190a;
        this.b = payActionListener;
        this.c = payBaseActivity;
        this.d = iVar;
        this.g = str;
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79bc6cc8bca9d206eb4ceac294d37e89", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79bc6cc8bca9d206eb4ceac294d37e89") : this.c != null ? this.c.p() : "";
    }
}
