package com.meituan.android.elderly.payresult;

import android.os.CountDownTimer;
import com.meituan.android.cashier.common.i;
import com.meituan.android.elderly.bean.OverLoadInfo;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public PayActionListener b;
    public PayBaseActivity c;
    i d;
    public CountDownTimer e;
    public InterfaceC0257a f;
    public String g;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.elderly.payresult.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0257a {
        void a(OverLoadInfo overLoadInfo);
    }

    public a(InterfaceC0257a interfaceC0257a, PayActionListener payActionListener, PayBaseActivity payBaseActivity, i iVar, String str) {
        Object[] objArr = {interfaceC0257a, payActionListener, payBaseActivity, iVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f912d953ea2f88c4f267e9134224411a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f912d953ea2f88c4f267e9134224411a");
            return;
        }
        this.f = interfaceC0257a;
        this.b = payActionListener;
        this.c = payBaseActivity;
        this.d = iVar;
        this.g = str;
    }
}
