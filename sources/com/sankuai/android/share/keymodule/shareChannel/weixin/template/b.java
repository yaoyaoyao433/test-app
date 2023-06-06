package com.sankuai.android.share.keymodule.shareChannel.weixin.template;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
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
public final class b extends a {
    public static ChangeQuickRedirect c;
    private View d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4499eed90bb79f2298945c8c9410c93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4499eed90bb79f2298945c8c9410c93");
        }
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54f85f8e877d641077de547c6503a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54f85f8e877d641077de547c6503a8b");
            return;
        }
        this.d = View.inflate(this.b, R.layout.share_deal_template_layout, null);
        this.e = (ImageView) this.d.findViewById(R.id.img_back);
        this.f = (TextView) this.d.findViewById(R.id.poi_name);
        this.g = (TextView) this.d.findViewById(R.id.group_name);
        this.h = (TextView) this.d.findViewById(R.id.address_name);
        this.i = (TextView) this.d.findViewById(R.id.land_market_name);
        this.j = (TextView) this.d.findViewById(R.id.group_price);
        this.k = (TextView) this.d.findViewById(R.id.market_price);
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a(MiniProgramBaseBean miniProgramBaseBean, Bitmap bitmap, a.b bVar) {
        boolean z = false;
        Object[] objArr = {miniProgramBaseBean, bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf76d3a1d0e5e0d3f30756fae9d8a586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf76d3a1d0e5e0d3f30756fae9d8a586");
            return;
        }
        Object[] objArr2 = {miniProgramBaseBean};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56aa01beb613ed2f63dc8408d404a056", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56aa01beb613ed2f63dc8408d404a056")).booleanValue();
        } else {
            int i = (TextUtils.isEmpty(miniProgramBaseBean.dealPoiName) && TextUtils.isEmpty(miniProgramBaseBean.dealGroupName)) ? 0 : 1;
            if (!TextUtils.isEmpty(miniProgramBaseBean.addressName) || !TextUtils.isEmpty(miniProgramBaseBean.landMarkName)) {
                i++;
            }
            if (!TextUtils.isEmpty(miniProgramBaseBean.dealGroupPrice) || !TextUtils.isEmpty(miniProgramBaseBean.dealMarketPrice)) {
                i++;
            }
            if (i < 2) {
                z = true;
            }
        }
        if (z) {
            if (bVar != null) {
                bVar.a(bitmap);
                return;
            }
            return;
        }
        this.e.setImageBitmap(bitmap);
        j.a(this.f, miniProgramBaseBean.dealPoiName);
        this.g.setText(miniProgramBaseBean.dealGroupName);
        j.a(this.h, miniProgramBaseBean.addressName);
        j.a(this.i, miniProgramBaseBean.landMarkName);
        j.a(this.j, miniProgramBaseBean.dealGroupPrice);
        j.a(this.k, miniProgramBaseBean.dealMarketPrice);
        if (bVar != null) {
            bVar.a(a(this.d));
        }
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a(MiniProgramBaseBean miniProgramBaseBean, a.b bVar) {
        Object[] objArr = {miniProgramBaseBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dcd315b125584e2b2df188ca68b8084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dcd315b125584e2b2df188ca68b8084");
        } else {
            Picasso.g(this.b).d(com.sankuai.android.share.common.util.b.a(miniProgramBaseBean.imageUrl)).a(new a.C0543a(miniProgramBaseBean, bVar));
        }
    }
}
