package com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.CautionInfo;
import com.sankuai.waimai.bussiness.order.base.params.a;
import com.sankuai.waimai.bussiness.order.base.utils.h;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.remark.RemarkInfoResponse;
import com.sankuai.waimai.bussiness.order.confirm.service.OrderRemarkService;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextView e;
    c f;
    ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> g;
    String h;
    String i;
    Activity j;
    int k;
    private ViewGroup l;
    private f m;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_remark_info;
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a6b4eadcbb28d1ae0c26a92cb1a1fb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a6b4eadcbb28d1ae0c26a92cb1a1fb28");
        } else if (bVar.f != null) {
            JudasManualManager.a("b_e64riq44").a("business_type", bVar.m.aL_()).a("c_ykhs39e").a(bVar.c).a();
            final c cVar = bVar.f;
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "242b441c612d139e93a2375fe16680ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "242b441c612d139e93a2375fe16680ce");
            } else if (cVar != null) {
                final a.C0886a c0886a = new a.C0886a();
                c0886a.b = bVar.j;
                c0886a.e = h.b(cVar.f);
                c0886a.j = h.a(cVar.f);
                c0886a.f = bVar.h;
                c0886a.j = cVar.f.detailHint;
                a.C0886a a = c0886a.a(cVar.b);
                a.d = cVar.c;
                a.h = 1;
                a.g = bVar.k + 10000;
                a.o = cVar.d;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "3e53d436984428b437bb8aa623552ea0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "3e53d436984428b437bb8aa623552ea0");
                } else if (bVar.j != null && (bVar.j instanceof BaseActivity)) {
                    ((BaseActivity) bVar.j).u();
                }
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderRemarkService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderRemarkService.class)).requestRemarksInfo(cVar.e, com.sankuai.waimai.foundation.location.v2.h.t(), ""), new b.AbstractC1042b<BaseResponse<RemarkInfoResponse>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.b.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr4 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dec7d613d51e18cb5296df6df5ce2f8f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dec7d613d51e18cb5296df6df5ce2f8f");
                            return;
                        }
                        b.b(b.this);
                        if (baseResponse != null && baseResponse.data != 0 && baseResponse.code == 0) {
                            c0886a.c = h.a(b.this.g, ((RemarkInfoResponse) baseResponse.data).defaultValues, ((RemarkInfoResponse) baseResponse.data).cautionValues);
                            c0886a.l = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).customerValues) ? null : ((RemarkInfoResponse) baseResponse.data).customerValues;
                            c0886a.m = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).cautionValues) ? null : ((RemarkInfoResponse) baseResponse.data).cautionValues;
                            c0886a.k = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).defaultValues) ? null : ((RemarkInfoResponse) baseResponse.data).defaultValues;
                            c0886a.n = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).specialValues) ? null : ((RemarkInfoResponse) baseResponse.data).specialValues;
                        } else {
                            c0886a.c = h.a(b.this.g, cVar.f, (List<CautionInfo>) null);
                        }
                        com.sankuai.waimai.bussiness.order.base.a.a(c0886a.a(), false);
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "632f7d408881c70895e531ea9bda100e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "632f7d408881c70895e531ea9bda100e");
                            return;
                        }
                        b.b(b.this);
                        ae.a(b.this.j, b.this.j.getResources().getString(R.string.wm_order_confirm_remark_request_error_info));
                    }
                }, null);
            }
        }
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "36aa5e69a5ae60a8934c33295f1d4c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "36aa5e69a5ae60a8934c33295f1d4c04");
        } else if (bVar.j == null || !(bVar.j instanceof BaseActivity)) {
        } else {
            ((BaseActivity) bVar.j).v();
        }
    }

    public b(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929d5344dcb4e93e0da2cd8d879f2607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929d5344dcb4e93e0da2cd8d879f2607");
            return;
        }
        this.m = fVar;
        this.j = (Activity) context;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a2785687fd8d1349caf3e24a0a0671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a2785687fd8d1349caf3e24a0a0671");
            return;
        }
        super.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b1a69e211cffd0bb8367882386ac8c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b1a69e211cffd0bb8367882386ac8c3");
            return;
        }
        this.l = (ViewGroup) this.b.findViewById(R.id.layout_remark);
        this.e = (TextView) this.b.findViewById(R.id.txt_order_remark_info);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ba0be245288f43834515cfbf0f4d82b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ba0be245288f43834515cfbf0f4d82b");
                } else {
                    b.a(b.this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0f76005450821e7b1cb51c9d2d3f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0f76005450821e7b1cb51c9d2d3f6a");
            return;
        }
        this.i = null;
        if (!TextUtils.isEmpty(this.h)) {
            this.i = ab.a(this.h, 12);
        }
        this.e.setText(this.i);
    }
}
