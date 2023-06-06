package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
import com.sankuai.waimai.bussiness.order.base.constants.a;
import com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.i;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PushPopupWindowController implements IPushPopupWindowController {
    private static final String TAG = "PushPopupWindowController";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean hasPushPopShowed;
    private boolean isPushPopShowing;
    private Context mContext;
    private List<IPushPopupWindowController.a> mOnDialogHideListeners;
    private com.sankuai.waimai.foundation.utils.e mSp;

    public PushPopupWindowController(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25aff1acaeab73c63fb157c980c83eb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25aff1acaeab73c63fb157c980c83eb8");
            return;
        }
        this.mContext = context;
        this.hasPushPopShowed = false;
        this.mSp = new com.sankuai.waimai.foundation.utils.e("order_detail_status_push_nofity_pop_file_name");
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController
    public void showPermissionPop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48b7fd63456c8df62c6b23c918d0a957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48b7fd63456c8df62c6b23c918d0a957");
            return;
        }
        int b = this.mSp.b((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOFIFY_OPEN_FREQUENCY, 0);
        try {
            if (enableFromServer() && needShowPop()) {
                this.isPushPopShowing = true;
                View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_order_detail_pga_push_notify_pop_layout, (ViewGroup) null, false);
                RooButton rooButton = (RooButton) inflate.findViewById(R.id.btn_open_push);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_pop_close);
                final CustomDialog b2 = new CustomDialog.a(this.mContext).a(false).b();
                int a = g.a(this.mContext) - g.a(this.mContext, 65.0f);
                if (b2 != null) {
                    Window window = b2.getWindow();
                    window.getDecorView().setPadding(0, 0, 0, 0);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = a;
                    attributes.height = -2;
                    window.setAttributes(attributes);
                }
                rooButton.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.PushPopupWindowController.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c082a15f3aabfd6a9df2aa1076b117b0", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c082a15f3aabfd6a9df2aa1076b117b0");
                            return;
                        }
                        i.b(PushPopupWindowController.this.mContext);
                        if (b2 != null && b2.isShowing()) {
                            b2.dismiss();
                            PushPopupWindowController.this.notifyOnDialogHide();
                        }
                        PushPopupWindowController.this.isPushPopShowing = false;
                        JudasManualManager.a("b_waimai_k2zfdr1l_mc").a("c_hgowsqb").a(PushPopupWindowController.this.mContext).a();
                    }
                });
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.PushPopupWindowController.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8dc789dc93a440a47e548802f920000f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8dc789dc93a440a47e548802f920000f");
                            return;
                        }
                        if (b2 != null && b2.isShowing()) {
                            b2.dismiss();
                            PushPopupWindowController.this.notifyOnDialogHide();
                        }
                        PushPopupWindowController.this.isPushPopShowing = false;
                        JudasManualManager.a("b_waimai_q2x242u0_mc").a("c_hgowsqb").a(PushPopupWindowController.this.mContext).a();
                    }
                });
                if (b2 != null) {
                    b2.setContentView(inflate);
                    this.hasPushPopShowed = true;
                    this.mSp.a((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOFIFY_OPEN_FREQUENCY, b + 1);
                    this.mSp.a((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOTIFY_OPEN_TIMESTAMP, com.meituan.android.time.c.b());
                    JudasManualManager.b("b_waimai_4eh4kkzf_mv").a("c_hgowsqb").a(this.mContext).a();
                }
            }
        } catch (Exception e) {
            this.hasPushPopShowed = false;
            this.isPushPopShowing = false;
            com.dianping.judas.util.a.a(TAG, e.getMessage());
        }
    }

    public boolean needShowPop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d49fa2c1c542730c319321031538800", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d49fa2c1c542730c319321031538800")).booleanValue() : (i.a(this.mContext) || this.hasPushPopShowed) ? false : true;
    }

    private boolean enableFromServer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da32c12407bd69b4614da5e4df13176a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da32c12407bd69b4614da5e4df13176a")).booleanValue();
        }
        if (this.mSp.a(a.b.EnumC0884a.PUSH_NOTIFY_DAYS) && this.mSp.a(a.b.EnumC0884a.PUSH_NOTIFY_TIMES)) {
            return com.meituan.android.time.c.b() >= ((((this.mSp.b((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOTIFY_DAYS, 60L) * 24) * 60) * 60) * 1000) + this.mSp.b((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOTIFY_OPEN_TIMESTAMP, 0L) && this.mSp.b((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOFIFY_OPEN_FREQUENCY, 0) < this.mSp.b((com.sankuai.waimai.foundation.utils.e) a.b.EnumC0884a.PUSH_NOTIFY_TIMES, 2);
        }
        return false;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController
    public boolean isPushPopShowing() {
        return this.isPushPopShowing;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController
    public boolean hasPushPopShowed() {
        return this.hasPushPopShowed;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController
    public void addOnDialogHideListener(IPushPopupWindowController.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ad2867da11cb03c07e0240590f18fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ad2867da11cb03c07e0240590f18fa4");
            return;
        }
        if (this.mOnDialogHideListeners == null) {
            this.mOnDialogHideListeners = new ArrayList();
        }
        this.mOnDialogHideListeners.add(aVar);
    }

    public void notifyOnDialogHide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec9ef3f30067e2404adcb54cdefca1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec9ef3f30067e2404adcb54cdefca1d3");
        } else if (this.mOnDialogHideListeners != null) {
            Iterator<IPushPopupWindowController.a> it = this.mOnDialogHideListeners.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
