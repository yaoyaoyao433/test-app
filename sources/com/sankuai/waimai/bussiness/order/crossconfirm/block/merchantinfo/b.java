package com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantinfo;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.mtimageloader.config.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private LinearLayout i;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_merchant_info;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab83243ce2c58867172748c0e3d14cb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab83243ce2c58867172748c0e3d14cb4");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0808c49b47d209a0c891775b2148a0f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0808c49b47d209a0c891775b2148a0f3");
            return;
        }
        super.b();
        this.f = (ImageView) this.b.findViewById(R.id.poi_type_icon);
        this.e = (TextView) this.b.findViewById(R.id.txt_poi_name);
        this.g = (ImageView) this.b.findViewById(R.id.img_deliver_info);
        this.h = (ImageView) this.b.findViewById(R.id.img_delivery_info_explain);
        this.i = (LinearLayout) this.b.findViewById(R.id.merchant_info);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c122222b38585fcb6e6addd0ddca0b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c122222b38585fcb6e6addd0ddca0b63");
        } else if (!TextUtils.isEmpty(cVar.d)) {
            this.g.setVisibility(0);
            if (cVar.e == 1 || cVar.e == 2 || cVar.e == 7) {
                this.h.setVisibility(0);
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantinfo.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e191f0e16e4d953abae6c9012442a443", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e191f0e16e4d953abae6c9012442a443");
                            return;
                        }
                        String str = cVar.f;
                        int i = cVar.e;
                        String str2 = "";
                        if (i == 1) {
                            str2 = b.this.c.getString(R.string.wm_order_confirm_deliver_service_title_specially);
                        } else if (i == 2) {
                            str2 = b.this.c.getString(R.string.wm_order_confirm_deliver_service_title_fast);
                        } else if (i == 7) {
                            str2 = b.this.c.getString(R.string.wm_order_confirm_deliver_service_title_whole_city);
                        }
                        new RooAlertDialog.a(new ContextThemeWrapper(b.this.c, 2131558963)).a(str2).b(str).a(b.this.c.getString(R.string.wm_order_confirm_deliver_service_confirm), (DialogInterface.OnClickListener) null).b();
                    }
                });
            } else {
                this.h.setVisibility(8);
            }
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.b = this.c;
            a.c = cVar.d;
            a.a(this.g);
        } else {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8cf25109ee8fca5556d34d52c51122a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8cf25109ee8fca5556d34d52c51122a");
        } else if (!TextUtils.isEmpty(cVar.a)) {
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.b = this.c;
            a.c = cVar.a;
            a.a(this.f);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }
}
