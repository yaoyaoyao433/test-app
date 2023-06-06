package com.meituan.android.pay.widget.bankinfoitem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.widget.BankCardNumEditText;
import com.meituan.android.pay.widget.EditTextWithClearAndHelpButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends j {
    public static ChangeQuickRedirect a;
    private BankCardNumEditText b;

    public a(Context context, BankFactor bankFactor, com.meituan.android.paybase.widgets.keyboard.a aVar) {
        super(context, bankFactor, aVar);
        Object[] objArr = {context, bankFactor, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ff266dcca8fa4502a71e64fa64643fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ff266dcca8fa4502a71e64fa64643fd");
        }
    }

    public a(Context context, BankFactor bankFactor, Drawable drawable, EditTextWithClearAndHelpButton.b bVar, com.meituan.android.paybase.widgets.keyboard.a aVar) {
        super(context, bankFactor, aVar);
        Object[] objArr = {context, bankFactor, drawable, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376e83c8d98ffa5674a9467c310c756a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376e83c8d98ffa5674a9467c310c756a");
            return;
        }
        setDrawableHelpButton(drawable);
        setOnClickHelpButton(bVar);
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d03f8f9b8aded25002da27d86ae2f27", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d03f8f9b8aded25002da27d86ae2f27");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.mpay__bankcard_info_item, this);
        this.b = (BankCardNumEditText) inflate.findViewById(R.id.bankinfo_edittext);
        return inflate;
    }

    public final void setAfterTextChangedListener(BankCardNumEditText.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee472abf4becf3685a46408a775229bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee472abf4becf3685a46408a775229bb");
        } else {
            this.b.setAfterTextChangedListener(aVar);
        }
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114384d884ef3e70a78a730065e50aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114384d884ef3e70a78a730065e50aad");
            return;
        }
        if (this.m != null) {
            this.g.setKeyboardBuilder(this.m);
            this.g.setSecurityKeyBoardType(1);
        }
        setInputType(2);
        setFilters(a(23));
        a(12, getContext().getString(R.string.mpay__bank_item_error_tip_bank_card_length));
        this.g.addTextChangedListener(new com.meituan.android.paybase.utils.textwatcher.b(this.g));
    }
}
