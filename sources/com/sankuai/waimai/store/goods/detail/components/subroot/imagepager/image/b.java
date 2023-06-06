package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.c;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b {
    public static ChangeQuickRedirect a;
    boolean b;
    private b.a c;
    private View d;
    private ImageView e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949fe0fbd1d9d640f23f460f1ef11f75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949fe0fbd1d9d640f23f460f1ef11f75");
        } else {
            this.b = false;
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final View a(ViewGroup viewGroup, e eVar, int i) {
        Object[] objArr = {viewGroup, eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7fb77891028cf7127b47fa869ac3f27", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7fb77891028cf7127b47fa869ac3f27");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_view_product_detail_image, viewGroup, false);
        this.d = inflate.findViewById(R.id.v_drug_super_tag);
        this.e = (ImageView) inflate.findViewById(R.id.iv_drug_super_tag_content);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final void a(View view, final e eVar, final int i, @NonNull final b.a aVar, GoodDetailResponse.PoiExtendAttr poiExtendAttr, c cVar) {
        Object[] objArr = {view, eVar, Integer.valueOf(i), aVar, poiExtendAttr, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6bd889742ada345ed84a117f3814020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6bd889742ada345ed84a117f3814020");
        } else if (eVar == null) {
        } else {
            this.c = aVar;
            final ImageView imageView = (ImageView) view.findViewById(R.id.img_product);
            b.C0608b a2 = m.a(eVar.c, ImageQualityUtil.a());
            a2.b = imageView.getContext();
            final boolean z = eVar.i;
            if (i == 0 && z) {
                this.b = false;
                a2.e = 0;
            } else {
                a2 = a2.b(h.a(imageView.getContext()));
            }
            a2.a(new b.a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0708f12a73286330d8cc1baed4929b86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0708f12a73286330d8cc1baed4929b86");
                    } else if (com.sankuai.waimai.store.util.b.a(imageView.getContext())) {
                    } else {
                        if (z && b.this.b) {
                            return;
                        }
                        if (bitmap != null) {
                            imageView.setImageBitmap(bitmap);
                            if (!eVar.i) {
                                aVar.a(i, new b.C1178b(bitmap.getWidth(), bitmap.getHeight()));
                            }
                        } else {
                            m.a((int) R.drawable.wm_sc_common_poi_error, imageView);
                        }
                        b.this.b = true;
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a44d116be73254867451e39cc7a60b9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a44d116be73254867451e39cc7a60b9b");
                    } else if (b.this.b || com.sankuai.waimai.store.util.b.a(imageView.getContext())) {
                    } else {
                        m.a((int) R.drawable.wm_sc_common_poi_error, imageView);
                    }
                }
            });
            aVar.a(imageView, eVar, i, false);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5098a73f88c6990c8450d22a50a9f0a3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5098a73f88c6990c8450d22a50a9f0a3");
                    } else {
                        aVar.a(eVar, i);
                    }
                }
            });
            if (poiExtendAttr != null) {
                String str = poiExtendAttr.framePicUrl;
                if (!TextUtils.isEmpty(str)) {
                    a(i == 0, str);
                    return;
                }
                String str2 = poiExtendAttr.superDrugStorePicFrameImg;
                if (poiExtendAttr.isSuperDrugStore() && i == 0 && !TextUtils.isEmpty(str2)) {
                    r0 = true;
                }
                a(r0, str2);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eecec7bf0c91cbb93298c1ba71a05615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eecec7bf0c91cbb93298c1ba71a05615");
        } else if (!z || this.c == null) {
        } else {
            this.c.a(true);
        }
    }

    private void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab740467f9ea8f612b98e7b2f9e477b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab740467f9ea8f612b98e7b2f9e477b");
        } else if (this.d == null || this.e == null) {
        } else {
            this.d.setVisibility(z ? 0 : 4);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m.a(str, ImageQualityUtil.a()).a(this.e);
        }
    }
}
