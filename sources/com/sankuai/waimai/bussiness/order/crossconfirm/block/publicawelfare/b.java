package com.sankuai.waimai.bussiness.order.crossconfirm.block.publicawelfare;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
import com.sankuai.waimai.log.judas.JudasManualManager;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    ImageView e;
    private ImageView f;
    private ViewGroup g;
    private TextView h;
    private TextView i;
    private boolean j;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_public_welfare;
    }

    public b(@Nonnull Context context, @Nonnull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb37ce350e223fee3c04fbb5682cdb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb37ce350e223fee3c04fbb5682cdb6");
        } else {
            this.j = false;
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c04bd6ba5d4b6186783e8bec558ee4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c04bd6ba5d4b6186783e8bec558ee4b");
            return;
        }
        super.b();
        this.f = (ImageView) this.b.findViewById(R.id.img_public_welfare_icon);
        this.g = (ViewGroup) this.b.findViewById(R.id.layout_public_welfare);
        this.h = (TextView) this.b.findViewById(R.id.txt_public_welfare_name);
        this.e = (ImageView) this.b.findViewById(R.id.img_public_welfare_explain);
        this.i = (TextView) this.b.findViewById(R.id.txt_public_welfare_desc);
    }

    public final void a(@Nonnull final PoiOrderPreviewPoiResult poiOrderPreviewPoiResult) {
        Object[] objArr = {poiOrderPreviewPoiResult};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0bfa2b5d479399da49bff995ae21b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0bfa2b5d479399da49bff995ae21b91");
        } else if (TextUtils.isEmpty(poiOrderPreviewPoiResult.poiProjectDescription)) {
            this.g.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.i.setText(poiOrderPreviewPoiResult.poiProjectDescription);
            if (TextUtils.isEmpty(poiOrderPreviewPoiResult.poiProjectIcon)) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a.b = this.c;
                a.c = poiOrderPreviewPoiResult.poiProjectIcon;
                a.a(this.f);
            }
            this.h.setText("青山公益");
            this.h.setVisibility(0);
            if (TextUtils.isEmpty(poiOrderPreviewPoiResult.poiProjectDescriptionUrl)) {
                this.e.setOnClickListener(null);
            } else {
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.publicawelfare.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b25793e6750011622c0669a3f835ca68", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b25793e6750011622c0669a3f835ca68");
                            return;
                        }
                        JudasManualManager.a("b_n4k5zgnu").a("c_ykhs39e").a(b.this.c).a();
                        String str = poiOrderPreviewPoiResult.poiProjectDescriptionUrl;
                        if (!TextUtils.isEmpty(str)) {
                            com.sankuai.waimai.foundation.router.a.a(b.this.c, str);
                        } else {
                            b.this.e.setVisibility(8);
                        }
                    }
                });
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6659dae2210b933c0bd3dc8ba97393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6659dae2210b933c0bd3dc8ba97393");
        } else if (this.j) {
        } else {
            JudasManualManager.b("b_7utor60c").a("c_ykhs39e").a(this.c).a();
            this.j = true;
        }
    }
}
