package com.sankuai.android.share.keymodule.shareChannel.weixin.template;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.MiniProgramBaseBean;
import com.sankuai.android.share.keymodule.shareChannel.weixin.template.a;
import com.sankuai.android.share.util.j;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends a {
    public static ChangeQuickRedirect c;
    private View d;
    private ImageView e;
    private RatingBar f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "076f888909918c91f3d26ea238a22aff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "076f888909918c91f3d26ea238a22aff");
        }
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ee0e0a3290113c5533723ab53bdebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ee0e0a3290113c5533723ab53bdebd");
            return;
        }
        this.d = View.inflate(this.b, R.layout.share_poi_template_layout, null);
        this.e = (ImageView) this.d.findViewById(R.id.img_back);
        this.f = (RatingBar) this.d.findViewById(R.id.score_bar);
        this.g = (TextView) this.d.findViewById(R.id.score_text);
        this.h = (TextView) this.d.findViewById(R.id.per_price);
        this.i = (TextView) this.d.findViewById(R.id.poi_category);
        this.j = (TextView) this.d.findViewById(R.id.poi_address);
        this.k = (TextView) this.d.findViewById(R.id.poi_tel);
        this.l = (TextView) this.d.findViewById(R.id.poi_land_market);
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a(MiniProgramBaseBean miniProgramBaseBean, Bitmap bitmap, a.b bVar) {
        boolean z;
        Object[] objArr = {miniProgramBaseBean, bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb34d6a0c898e9b4f099e56071ad518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb34d6a0c898e9b4f099e56071ad518");
            return;
        }
        Object[] objArr2 = {miniProgramBaseBean};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c551a101daba9cc8dc6efbd6bb404d13", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c551a101daba9cc8dc6efbd6bb404d13")).booleanValue();
        } else {
            int i = ((miniProgramBaseBean.poiStar <= 0.0f || miniProgramBaseBean.poiStar > 5.0f) && TextUtils.isEmpty(miniProgramBaseBean.poiPerPrice)) ? 0 : 1;
            if (!TextUtils.isEmpty(miniProgramBaseBean.poiCategory) || !TextUtils.isEmpty(miniProgramBaseBean.addressName)) {
                i++;
            }
            if (!TextUtils.isEmpty(miniProgramBaseBean.poiPhone)) {
                i++;
            }
            z = i < 2;
        }
        if (z) {
            a(bVar, bitmap);
            return;
        }
        if (miniProgramBaseBean.poiStar > 0.0f && miniProgramBaseBean.poiStar <= 5.0f) {
            this.f.setRating(miniProgramBaseBean.poiStar);
            this.g.setText(this.b.getResources().getString(R.string.share_mini_program_poi_template_score, Float.valueOf(miniProgramBaseBean.poiStar)));
        } else {
            this.f.setVisibility(8);
            this.g.setVisibility(8);
        }
        this.h.setText(miniProgramBaseBean.poiPerPrice);
        j.a(this.i, miniProgramBaseBean.poiCategory);
        j.a(this.j, miniProgramBaseBean.addressName);
        j.a(this.l, miniProgramBaseBean.landMarkName);
        j.a(this.k, miniProgramBaseBean.poiPhone);
        this.e.setImageBitmap(bitmap);
        a(bVar, a(this.d));
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a(MiniProgramBaseBean miniProgramBaseBean, a.b bVar) {
        Object[] objArr = {miniProgramBaseBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c174f0f45942105cfafd8b98746bc05c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c174f0f45942105cfafd8b98746bc05c");
        } else {
            Picasso.g(this.b).d(com.sankuai.android.share.common.util.b.a(miniProgramBaseBean.imageUrl)).a(new a.C0543a(miniProgramBaseBean, bVar));
        }
    }

    private void a(a.b bVar, Bitmap bitmap) {
        Object[] objArr = {bVar, bitmap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e63f1554030430ee68a598d4d41e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e63f1554030430ee68a598d4d41e06");
        } else if (bVar != null) {
            bVar.a(bitmap);
        }
    }
}
