package com.sankuai.waimai.store.view.banner;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class ImageBannerPagerAdapter<T> extends BannerPagerAdapter<T> {
    public static ChangeQuickRedirect f;

    public abstract String a(int i);

    public abstract void a(ImageView imageView, T t, int i);

    public ImageBannerPagerAdapter(Context context, List<T> list, BannerPagerAdapter.a aVar) {
        super(context, list, aVar);
        Object[] objArr = {context, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bbd89eb7a8ec7eb0597683eac272abd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bbd89eb7a8ec7eb0597683eac272abd");
        }
    }

    private View d(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643970d924621bafa3afd92b3f5cd3ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643970d924621bafa3afd92b3f5cd3ef");
        }
        int size = this.c.size();
        View inflate = View.inflate(this.d, R.layout.wm_st_ad_layout, null);
        final UniversalImageView universalImageView = (UniversalImageView) inflate.findViewById(R.id.banner_image_view);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ad_icon);
        Object[] objArr2 = {inflate, universalImageView};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25f9e67e2d008f36ccd54a7e61a06e85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25f9e67e2d008f36ccd54a7e61a06e85");
        } else if (this.e != null) {
            universalImageView.setScaleType(this.e.b());
            if (this.e.a() > 0) {
                universalImageView.setCornerRadius(this.e.a());
            }
        }
        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(size), universalImageView};
        ChangeQuickRedirect changeQuickRedirect3 = f;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "498efda6ad8d06e257597bfedee6f802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "498efda6ad8d06e257597bfedee6f802");
        } else {
            if (i < size) {
                try {
                    String a = a(i);
                    if (TextUtils.isEmpty(a)) {
                        universalImageView.setImageResource(R.drawable.wm_st_widget_banner_default);
                    } else {
                        b.C0608b a2 = m.a(a, h.a(this.d), ImageQualityUtil.a());
                        a2.j = R.drawable.wm_st_widget_banner_default;
                        a2.i = R.drawable.wm_st_widget_banner_default;
                        a2.a((ImageView) universalImageView);
                    }
                } catch (Exception e) {
                    a.a(e);
                }
            }
            Object[] objArr4 = {universalImageView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = f;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ddf30bb18b88a50a1757cf9c8a8c80dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ddf30bb18b88a50a1757cf9c8a8c80dd");
            } else {
                universalImageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.view.banner.ImageBannerPagerAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ee3777eb2f45eb30017a4f3b95c69929", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ee3777eb2f45eb30017a4f3b95c69929");
                        } else {
                            ImageBannerPagerAdapter.this.a(universalImageView, ImageBannerPagerAdapter.this.c(i), i);
                        }
                    }
                });
            }
        }
        Object[] objArr5 = {Integer.valueOf(i), imageView};
        ChangeQuickRedirect changeQuickRedirect5 = f;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7f6976a3bec4cab7200b1f4f043a0410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7f6976a3bec4cab7200b1f4f043a0410");
        } else {
            u.c(imageView);
        }
        return inflate;
    }

    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter
    public View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ee2263eb5a0907c6171b3d64ea94ef", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ee2263eb5a0907c6171b3d64ea94ef") : d(i);
    }
}
