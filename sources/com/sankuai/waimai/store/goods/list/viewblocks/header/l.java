package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class l {
    public static ChangeQuickRedirect a;
    public final FrameLayout b;
    public final ImageView c;
    private final Context d;
    private final View e;
    private final ImageView f;
    private final ImageView g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public void a(View view) {
    }

    public void b(View view) {
    }

    public l(@NonNull Context context, @NonNull View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c588b1f23f7e1dd1cd368d7e05fbcd53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c588b1f23f7e1dd1cd368d7e05fbcd53");
            return;
        }
        this.d = context;
        this.e = view;
        this.b = (FrameLayout) view.findViewById(R.id.ll_poi_story_icon);
        this.c = (ImageView) view.findViewById(R.id.img_poi_story_icon);
        this.f = (ImageView) view.findViewById(R.id.img_poi);
        this.g = (ImageView) view.findViewById(R.id.img_poi_brand_icon);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6);
        if (com.sankuai.shangou.stone.util.k.a((Activity) this.d)) {
            this.i = context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_78);
        } else {
            this.i = context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_53);
        }
        this.j = (com.sankuai.shangou.stone.util.h.a(context) - context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_89)) / 2;
        this.k = this.i + context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10);
    }

    public final void a(@NonNull Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158eb2075a0b565585ee4417a94d4c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158eb2075a0b565585ee4417a94d4c62");
            return;
        }
        b.C0608b a2 = m.a(poi.getPicture(), this.d.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50), ImageQualityUtil.b());
        a2.b = this.d;
        a2.i = R.drawable.wm_sc_comment_img_load_placeholder;
        a2.j = R.drawable.wm_sc_common_good_img_default;
        a2.a(this.f);
        if (TextUtils.isEmpty(poi.poiTypeIcon)) {
            u.c(this.g);
        } else {
            u.a(this.g);
            b.C0608b a3 = m.a(poi.poiTypeIcon);
            a3.b = this.d;
            a3.a(this.g);
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.l.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c148a2d7d67b80e84a68648b6bb0561", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c148a2d7d67b80e84a68648b6bb0561");
                } else {
                    l.this.b(view);
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.l.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "053b140678dc2c1554cf971f4fa7270a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "053b140678dc2c1554cf971f4fa7270a");
                } else {
                    l.this.a(view);
                }
            }
        });
        if (!TextUtils.isEmpty(poi.getPoiLogoStoryIcon()) && !TextUtils.isEmpty(poi.getPoiStoryUrl())) {
            this.b.setVisibility(0);
            b.C0608b a4 = m.a(poi.getPoiLogoStoryIcon());
            a4.b = this.d;
            a4.a(this.c);
            return;
        }
        this.b.setVisibility(8);
    }
}
