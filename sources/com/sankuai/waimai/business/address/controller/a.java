package com.sankuai.waimai.business.address.controller;

import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public LinearLayout f;
    public TextView g;
    public LinearLayout h;
    public int i;

    public a(View view, int i) {
        Object[] objArr = {view, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db58da2bb37de658f3c45525aa09d360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db58da2bb37de658f3c45525aa09d360");
            return;
        }
        this.i = 1;
        Object[] objArr2 = {view, 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5eb598604e89e6a9372d71f10477116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5eb598604e89e6a9372d71f10477116");
            return;
        }
        this.f = (LinearLayout) view.findViewById(R.id.confirm_address_list_item_layout);
        this.b = (TextView) view.findViewById(R.id.txt_name);
        this.c = (TextView) view.findViewById(R.id.txt_gender);
        this.d = (TextView) view.findViewById(R.id.txt_phone);
        this.e = (TextView) view.findViewById(R.id.txt_address);
        if (this.i == 2 || this.i == 0) {
            this.h = (LinearLayout) view.findViewById(R.id.ll_address_user_info);
        }
    }
}
