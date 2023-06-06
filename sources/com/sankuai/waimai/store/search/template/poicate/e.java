package com.sankuai.waimai.store.search.template.poicate;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a<ProductItemEntity> {
    public static ChangeQuickRedirect y;
    private TextView A;
    private UniversalImageView B;
    private ImageView C;
    private ProductItemEntity D;
    ImageView z;

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final /* synthetic */ void b(ProductItemEntity productItemEntity) {
        ProductItemEntity productItemEntity2 = productItemEntity;
        Object[] objArr = {productItemEntity2};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803bb9067ce0874bbeeb1e0af785821d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803bb9067ce0874bbeeb1e0af785821d");
        } else if (productItemEntity2 != null) {
            this.D = productItemEntity2;
            this.f = productItemEntity2.productStatus;
            this.g = productItemEntity2.saleOutView;
            this.x = productItemEntity2.mLabelOnPicture;
        }
    }

    public e(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba88f2ea4a9d08901384cd4a12f57903", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba88f2ea4a9d08901384cd4a12f57903");
        }
    }

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd5c6446169f181dbbe394771a67720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd5c6446169f181dbbe394771a67720");
            return;
        }
        super.a(view);
        this.A = (TextView) view.findViewById(R.id.product_rcmd_label);
        this.z = (ImageView) view.findViewById(R.id.product_rcmd_pic);
        this.C = (ImageView) view.findViewById(R.id.img_has_videos);
        this.B = (UniversalImageView) view.findViewById(R.id.label_of_limited_time_spike);
    }

    public final void a(int i) {
        this.d = i;
    }

    @Override // com.sankuai.waimai.store.search.template.poicate.a
    public final void a() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0bee189f2d6c5f684f32b5e3a628c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0bee189f2d6c5f684f32b5e3a628c6");
            return;
        }
        b();
        this.A.setVisibility(8);
        this.z.setVisibility(8);
        this.C.setVisibility(8);
        if (d()) {
            u.c(this.B);
            g();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = y;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79652b8db187c56933a1fbf7e45c4a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79652b8db187c56933a1fbf7e45c4a9c");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = y;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fe3700ee0fbacd87b9fbd4f31faf92c9", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fe3700ee0fbacd87b9fbd4f31faf92c9")).booleanValue();
            } else {
                u.c(this.B);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = y;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "72b811af084ccc02a41e8e1499e17995", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "72b811af084ccc02a41e8e1499e17995")).booleanValue();
                } else if (this.D == null || aa.a(this.D.mLimitedTimeSpikeLabeldUrl)) {
                    z = false;
                } else {
                    u.a(this.B);
                    b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a.b = this.b;
                    a.c = this.D.mLimitedTimeSpikeLabeldUrl;
                    b.C0608b a2 = a.a(com.sankuai.waimai.foundation.utils.g.a(this.b, 14.0f));
                    a2.f = ImageQualityUtil.b();
                    a2.a((ImageView) this.B);
                    z = true;
                }
                z2 = z || g();
            }
            if (z2) {
                u.c(this.A, this.z);
            } else {
                u.c(this.B);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = y;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f5aa800e6ebd70f00abf4df2109178aa", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f5aa800e6ebd70f00abf4df2109178aa")).booleanValue();
                } else if (this.D != null && this.D.mLabelOnPicture != null) {
                    if (!TextUtils.isEmpty(this.D.mLabelOnPicture.labelText)) {
                        this.A.setVisibility(0);
                        this.z.setVisibility(8);
                        this.A.setText(this.D.mLabelOnPicture.labelText);
                    } else if (!TextUtils.isEmpty(this.D.mLabelOnPicture.labelUrl)) {
                        this.A.setVisibility(8);
                        this.z.setVisibility(0);
                        m.b(this.D.mLabelOnPicture.labelUrl).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.poicate.e.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.d
                            public final void a() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "00d6fd2b4b549b6f89550bf41d4b7bb1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "00d6fd2b4b549b6f89550bf41d4b7bb1");
                                } else {
                                    e.this.z.setVisibility(0);
                                }
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.d
                            public final void a(int i, Exception exc) {
                                Object[] objArr6 = {Integer.valueOf(i), exc};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fa054613cb3b66074b23b34b7ec5ec56", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fa054613cb3b66074b23b34b7ec5ec56");
                                } else {
                                    e.this.z.setVisibility(8);
                                }
                            }
                        }).a(this.z);
                    }
                }
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = y;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "919045851df117f1a2bbae93dd009a37", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "919045851df117f1a2bbae93dd009a37")).booleanValue();
        } else if (this.D != null && this.D.hasVideos()) {
            this.C.setVisibility(0);
        } else {
            this.C.setVisibility(8);
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1391ae498298581863d64736e46cbd4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1391ae498298581863d64736e46cbd4a")).booleanValue();
        }
        if (this.D == null || p.a(this.D.mLabelOnPicture) || this.D.mLabelOnPicture.labelType != 1 || TextUtils.isEmpty(this.D.mLabelOnPicture.labelUrl)) {
            return false;
        }
        u.a(this.B);
        b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a.b = this.b;
        a.c = this.D.mLabelOnPicture.labelUrl;
        b.C0608b a2 = a.a(com.sankuai.waimai.foundation.utils.g.a(this.b, 14.0f));
        a2.f = ImageQualityUtil.b();
        a2.a((ImageView) this.B);
        return true;
    }
}
