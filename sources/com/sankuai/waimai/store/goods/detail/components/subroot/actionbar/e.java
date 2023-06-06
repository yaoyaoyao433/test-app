package com.sankuai.waimai.store.goods.detail.components.subroot.actionbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.share.a;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.StrikeTextView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.share.b {
    public static ChangeQuickRedirect a;
    RelativeLayout b;
    TextView c;
    StrikeTextView d;
    ImageView e;

    @Override // com.sankuai.waimai.store.share.b
    public final int a() {
        return R.id.iv_share_good_detail_picture;
    }

    public e(Context context, String str, String str2) {
        super(context, R.layout.wm_sc_goods_detail_share_template, str, str2);
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f28226b92cbf8da42862d3688386136d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f28226b92cbf8da42862d3688386136d");
        }
    }

    @Override // com.sankuai.waimai.store.share.b, com.sankuai.waimai.store.share.a
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfeaa399ab9d1fc1f08d063a390f62c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfeaa399ab9d1fc1f08d063a390f62c0");
            return;
        }
        super.a(view);
        this.b = (RelativeLayout) view.findViewById(R.id.rl_share_good_detail_price_layout);
        this.c = (TextView) view.findViewById(R.id.tv_share_good_detail_price);
        this.d = (StrikeTextView) view.findViewById(R.id.tv_share_good_detail_origin_price);
        this.e = (ImageView) view.findViewById(R.id.iv_share_label_img);
    }

    @Override // com.sankuai.waimai.store.share.b, com.sankuai.waimai.store.share.a
    public final void a(final a.InterfaceC1326a interfaceC1326a) {
        Object[] objArr = {interfaceC1326a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a3f1c5caaf05076d350a8bdb22a435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a3f1c5caaf05076d350a8bdb22a435");
        } else if (!TextUtils.isEmpty(this.j)) {
            b.C0608b a2 = m.a(this.j, ImageQualityUtil.a());
            a2.b = this.g;
            a2.a(new b.a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea5e5d6a92a7992998b9d1c3fe9813de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea5e5d6a92a7992998b9d1c3fe9813de");
                        return;
                    }
                    e.this.e.setImageBitmap(bitmap);
                    e.this.b(interfaceC1326a);
                }
            }, 1);
        } else {
            b(interfaceC1326a);
        }
    }

    @Override // com.sankuai.waimai.store.share.a
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0b6c4ee84723e01cc35525c08ed0e7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0b6c4ee84723e01cc35525c08ed0e7")).intValue() : View.MeasureSpec.makeMeasureSpec(h.a(this.g, 200.0f), 1073741824);
    }

    @Override // com.sankuai.waimai.store.share.a
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e7967ae19fc91c9e7554d1a6732894", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e7967ae19fc91c9e7554d1a6732894")).intValue() : View.MeasureSpec.makeMeasureSpec(h.a(this.g, 160.0f), 1073741824);
    }
}
