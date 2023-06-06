package com.sankuai.waimai.store.newcustomer;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.CouponCollectionTip;
import com.sankuai.waimai.store.ui.common.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewCustomerImageDialog extends CustomDialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public CouponCollectionTip e;
    private View f;

    public NewCustomerImageDialog(Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_new_customer_image_dialog, (ViewGroup) null, false), R.style.WmStSkuDialogTheme);
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d214e217b33466cd3b76f85a3fed2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d214e217b33466cd3b76f85a3fed2f");
            return;
        }
        Window window = getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.gravity = 17;
        attributes.height = -1;
        attributes.width = -1;
        window.setAttributes(attributes);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1acabb33fba37b13b4da00d9be8698c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1acabb33fba37b13b4da00d9be8698c5");
            return;
        }
        super.a(view);
        this.b = (ImageView) c(R.id.new_customer_image_coupon);
        this.f = c(R.id.new_customer_iv_close);
        this.c = (TextView) c(R.id.new_customer_title);
        this.d = (TextView) c(R.id.new_customer_sub_title);
        this.b.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f374106d8ea6b54b97ee617205379f93", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f374106d8ea6b54b97ee617205379f93");
            return;
        }
        if (view != this.f) {
            if (view != this.b || this.e == null || com.sankuai.shangou.stone.util.a.b(this.e.getCouponDetailInfoList())) {
                return;
            }
            NewCustomerCouponListDialog newCustomerCouponListDialog = new NewCustomerCouponListDialog(getContext());
            newCustomerCouponListDialog.a(this.e, new a());
            newCustomerCouponListDialog.show();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0650ba9eb094cc48a38b774969440e02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0650ba9eb094cc48a38b774969440e02");
            } else {
                com.sankuai.waimai.store.manager.judas.b.a("c_hgowsqb", "b_waimai_5w0rjvuj_mc").a("order_view_id", this.e == null ? "" : this.e.getOrderId()).a();
            }
        }
        dismiss();
    }
}
