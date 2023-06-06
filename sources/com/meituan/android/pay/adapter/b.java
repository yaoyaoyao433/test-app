package com.meituan.android.pay.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.pay.model.bean.QuickBankDetail;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.paycommon.lib.assist.a<QuickBankDetail> {
    public static ChangeQuickRedirect a;

    public b(Context context, ArrayList<QuickBankDetail> arrayList) {
        super(context, arrayList);
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1077c6695c440d4301c9734ff28131dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1077c6695c440d4301c9734ff28131dc");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public ImageView a;
        public TextView b;
        public View c;

        public a() {
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a7fd0aa85ae60e8050c69084fb3bc25", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a7fd0aa85ae60e8050c69084fb3bc25");
        }
        QuickBankDetail quickBankDetail = (QuickBankDetail) this.k.get(i);
        if (view == null) {
            aVar = new a();
            view2 = this.j.inflate(R.layout.mpay__quickbind_item, viewGroup, false);
            aVar.a = (ImageView) view2.findViewById(R.id.quickbind_button_icon);
            aVar.b = (TextView) view2.findViewById(R.id.quickbind_button_content);
            aVar.c = view2.findViewById(R.id.quickbind_gray_line);
            view2.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        com.meituan.android.paycommon.lib.config.a.a().r().a(quickBankDetail.getIcon()).a(aVar.a);
        aVar.b.setText(quickBankDetail.getName());
        if (i == getCount() - 1) {
            aVar.c.setVisibility(8);
        } else {
            aVar.c.setVisibility(0);
        }
        return view2;
    }
}
