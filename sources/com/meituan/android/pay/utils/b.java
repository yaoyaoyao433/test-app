package com.meituan.android.pay.utils;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.widget.BankCardNumEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BankCardNumEditText.a {
    public static ChangeQuickRedirect a;
    private final int b;
    private final com.meituan.android.paybase.retrofit.b c;
    private final Activity d;
    private final BankFactor e;
    private final View f;
    private final boolean g;
    private final Button h;

    public b(int i, com.meituan.android.paybase.retrofit.b bVar, Activity activity, BankFactor bankFactor, View view, boolean z, Button button) {
        this.b = i;
        this.c = bVar;
        this.d = activity;
        this.e = bankFactor;
        this.f = view;
        this.g = z;
        this.h = button;
    }

    @Override // com.meituan.android.pay.widget.BankCardNumEditText.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93670fc39fa8ec38a26465075d5b554b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93670fc39fa8ec38a26465075d5b554b");
        } else {
            a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, str);
        }
    }
}
