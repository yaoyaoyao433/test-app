package com.sankuai.waimai.store.orderlist.viewholder;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public Context b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public com.sankuai.waimai.store.expose.v2.entity.b g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.orderlist.viewholder.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1260a {
        void a();
    }

    public a(Context context, View view) {
        super(view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914397aa18fbade7a3a8fb20a7634bb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914397aa18fbade7a3a8fb20a7634bb5");
            return;
        }
        this.b = context;
        this.g = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_fzc8v7me_mv", view);
        this.c = (ImageView) view.findViewById(R.id.default_img_info);
        this.d = (TextView) view.findViewById(R.id.default_txt_info);
        this.e = (TextView) view.findViewById(R.id.default_txt_sub_info);
        this.f = (TextView) view.findViewById(R.id.default_btn_info);
    }
}
