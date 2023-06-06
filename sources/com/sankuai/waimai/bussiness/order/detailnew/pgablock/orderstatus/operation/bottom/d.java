package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    PopupWindow b;
    View c;
    Context d;
    private TextView e;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b8fc4a95918adde602882cb7bcbfa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b8fc4a95918adde602882cb7bcbfa2");
            return;
        }
        this.b = null;
        this.d = context;
        this.c = LayoutInflater.from(context).inflate(R.layout.wm_order_detail_bottom_button_popup, (ViewGroup) null);
        this.e = (TextView) this.c.findViewById(R.id.wm_order_detail_bottom_button_popup_content);
    }

    public final void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09aeb79410622424808820beab120286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09aeb79410622424808820beab120286");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b();
            this.e.setText(str);
            a(view);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4fee060f440dedc506bfab85963c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4fee060f440dedc506bfab85963c45");
        } else if (this.b == null) {
            this.b = new PopupWindow(this.c, -2, -2, true);
            this.b.setBackgroundDrawable(new ColorDrawable(0));
            this.b.setTouchable(false);
            this.b.setOutsideTouchable(false);
            this.b.setFocusable(false);
        }
    }

    private void a(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89431fbbc70b5450bb73a080d236f7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89431fbbc70b5450bb73a080d236f7e9");
        } else if (this.b.isShowing()) {
        } else {
            view.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b7f7732ba5f2fc72d5a37825d2401e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b7f7732ba5f2fc72d5a37825d2401e0");
                    } else if (f.a(d.this.d) || d.this.b.isShowing()) {
                    } else {
                        d.this.c.measure(0, 0);
                        d.this.b.setHeight(d.this.c.getMeasuredHeight());
                        d.this.b.setWidth(d.this.c.getMeasuredWidth());
                        d.this.b.showAsDropDown(view, (view.getMeasuredWidth() - d.this.c.getMeasuredWidth()) / 2, 0, 8388659);
                    }
                }
            });
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf60ab4520cdab9789cbb46f9a9e11f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf60ab4520cdab9789cbb46f9a9e11f");
        } else if (this.b != null) {
            p.b(this.b);
        }
    }
}
