package com.sankuai.waimai.sa.ui.assistant.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MultiPersonMealFooterRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public ViewGroup i;
    public TextView j;

    public MultiPersonMealFooterRelativeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f2f71d5583014fbac13d5e3fc14216", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f2f71d5583014fbac13d5e3fc14216");
        }
    }

    public MultiPersonMealFooterRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5626168cb3e325403c5bbeaccba53587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5626168cb3e325403c5bbeaccba53587");
        }
    }

    public MultiPersonMealFooterRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f4ad3d8981ed852e02cdedb167a8f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f4ad3d8981ed852e02cdedb167a8f2");
        }
    }

    public TextView getPackageFee() {
        return this.j;
    }

    public TextView getPrice() {
        return this.d;
    }

    public TextView getOriginPrice() {
        return this.e;
    }

    public TextView getDetailOriginPrice() {
        return this.f;
    }

    public TextView getBuyTxtFromeTemplate() {
        return this.g;
    }

    public TextView getBuyTxtFromeDetail() {
        return this.h;
    }

    public TextView getOnSaleFromTemplate() {
        return this.b;
    }

    public TextView getDiscountPriceFromDetail() {
        return this.c;
    }

    public ViewGroup getOnSaleContainer() {
        return this.i;
    }
}
