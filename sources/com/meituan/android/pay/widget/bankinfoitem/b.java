package com.meituan.android.pay.widget.bankinfoitem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends j {
    public static ChangeQuickRedirect a;

    public b(Context context, BankFactor bankFactor, com.meituan.android.paybase.widgets.keyboard.a aVar) {
        super(context, bankFactor, aVar);
        Object[] objArr = {context, bankFactor, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90afbe085923ddae5c51ba7354582c11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90afbe085923ddae5c51ba7354582c11");
        }
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe80b5f0e55e3184092ed51e9469e1f2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe80b5f0e55e3184092ed51e9469e1f2") : LayoutInflater.from(context).inflate(R.layout.mpay__datepicker_info_item, this);
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa86cda56a8a43764dc30555a4f1088f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa86cda56a8a43764dc30555a4f1088f");
        } else if (e()) {
            hashMap.put((String) getTag(), this.g.getText().toString().trim().replace("/", ""));
        }
    }

    @Override // com.meituan.android.pay.widget.bankinfoitem.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d1a155987f8e0370e6b8168ed18b5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d1a155987f8e0370e6b8168ed18b5b");
            return;
        }
        if (this.m != null) {
            this.g.setKeyboardBuilder(this.m);
        }
        a(1, "");
        this.g.addTextChangedListener(new com.meituan.android.paybase.utils.textwatcher.a(this.g));
    }
}
