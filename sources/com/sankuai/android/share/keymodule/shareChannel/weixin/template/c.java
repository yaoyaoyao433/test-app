package com.sankuai.android.share.keymodule.shareChannel.weixin.template;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends a {
    public static ChangeQuickRedirect c;
    private View d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e21c3570bc652010578b8d79dbc122f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e21c3570bc652010578b8d79dbc122f");
        }
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a704ba83d59bf78d21b0a412711daa31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a704ba83d59bf78d21b0a412711daa31");
            return;
        }
        this.d = View.inflate(this.b, R.layout.share_hotel_template_layout, null);
        this.e = (ImageView) this.d.findViewById(R.id.img_back);
        this.f = (TextView) this.d.findViewById(R.id.hotel_score);
        this.g = (TextView) this.d.findViewById(R.id.hotel_desc);
        this.h = (TextView) this.d.findViewById(R.id.hotel_level);
        this.i = (TextView) this.d.findViewById(R.id.hotel_area);
        this.j = (TextView) this.d.findViewById(R.id.hotel_address);
        this.k = (TextView) this.d.findViewById(R.id.hotel_land_market);
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a(MiniProgramBaseBean miniProgramBaseBean, Bitmap bitmap, a.b bVar) {
        boolean z = false;
        Object[] objArr = {miniProgramBaseBean, bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a67b515b01f82096174db63f52caf6e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a67b515b01f82096174db63f52caf6e4");
            return;
        }
        Object[] objArr2 = {miniProgramBaseBean};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b096f063f90501295ced3994b2ccff5d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b096f063f90501295ced3994b2ccff5d")).booleanValue();
        } else {
            int i = (TextUtils.isEmpty(miniProgramBaseBean.hotelScore) && TextUtils.isEmpty(miniProgramBaseBean.hotelDescription) && TextUtils.isEmpty(miniProgramBaseBean.hotelLevel)) ? 0 : 1;
            if (!TextUtils.isEmpty(miniProgramBaseBean.hotelArea)) {
                i++;
            }
            if (!TextUtils.isEmpty(miniProgramBaseBean.addressName) || !TextUtils.isEmpty(miniProgramBaseBean.landMarkName)) {
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
        if (!TextUtils.isEmpty(miniProgramBaseBean.hotelScore)) {
            SpannableString spannableString = new SpannableString(miniProgramBaseBean.hotelScore);
            Matcher matcher = Pattern.compile("^[0-9]+(\\.[0-9]*)").matcher(miniProgramBaseBean.hotelScore);
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(15, true);
            while (matcher.find()) {
                spannableString.setSpan(absoluteSizeSpan, matcher.start(), matcher.end(), 18);
            }
            this.f.setText(spannableString);
        } else {
            this.f.setVisibility(8);
        }
        j.a(this.g, miniProgramBaseBean.hotelDescription);
        this.h.setText(miniProgramBaseBean.hotelLevel);
        j.a(this.j, miniProgramBaseBean.addressName);
        j.a(this.k, miniProgramBaseBean.landMarkName);
        j.a(this.i, miniProgramBaseBean.hotelArea);
        if (bVar != null) {
            bVar.a(a(this.d));
        }
    }

    @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a
    public final void a(MiniProgramBaseBean miniProgramBaseBean, a.b bVar) {
        Object[] objArr = {miniProgramBaseBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e5342f5bbc8fc72f967c66d5e548bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e5342f5bbc8fc72f967c66d5e548bf");
        } else {
            Picasso.g(this.b).d(com.sankuai.android.share.common.util.b.a(miniProgramBaseBean.imageUrl)).a(new a.C0543a(miniProgramBaseBean, bVar));
        }
    }
}
