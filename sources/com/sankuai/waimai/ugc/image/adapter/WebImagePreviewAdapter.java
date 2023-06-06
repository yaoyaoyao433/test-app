package com.sankuai.waimai.ugc.image.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.imageloader.a;
import com.sankuai.waimai.platform.domain.core.comment.Picture;
import uk.co.senab.photoview.PhotoView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class WebImagePreviewAdapter extends ImagePreviewAdapter<Picture> {
    public static ChangeQuickRedirect g;

    @Override // com.sankuai.waimai.ugc.image.adapter.ImagePreviewAdapter
    public final /* synthetic */ void a(Picture picture, PhotoView photoView) {
        Picture picture2 = picture;
        Object[] objArr = {picture2, photoView};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26668297ecdf0e64ee408b38e99f7473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26668297ecdf0e64ee408b38e99f7473");
            return;
        }
        b.C0608b a = a.a();
        a.b = photoView.getContext();
        a.c = picture2.getFullSizeUrl(this.d);
        a.i = R.drawable.wm_comment_img_load_placeholder;
        a.j = R.drawable.wm_comment_img_load_placeholder;
        a.h = new b.c() { // from class: com.sankuai.waimai.ugc.image.adapter.WebImagePreviewAdapter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.c
            public final void a() {
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97c726f32715555e8a8a40c81f41d5be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97c726f32715555e8a8a40c81f41d5be");
                } else {
                    ae.a(WebImagePreviewAdapter.this.d, (int) R.string.wm_common_load_failed);
                }
            }
        };
        a.a((ImageView) photoView);
    }

    public WebImagePreviewAdapter(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a007ce5d53c9fac1580333503796aab9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a007ce5d53c9fac1580333503796aab9");
        }
    }
}
