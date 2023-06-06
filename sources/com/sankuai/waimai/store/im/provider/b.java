package com.sankuai.waimai.store.im.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.store.im.group.model.CustomMessageData;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.im.base.c<CustomMessageData> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.im.group.a b;

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sc_nox_im_custom_message_h5;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable CustomMessageData customMessageData) {
        final CustomMessageData customMessageData2 = customMessageData;
        Object[] objArr = {view, bVar, customMessageData2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a79bc0c6896e0a7f1490e62afa2147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a79bc0c6896e0a7f1490e62afa2147");
        } else if (customMessageData2 != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.img_im_custom_message_h5);
            TextView textView = (TextView) view.findViewById(R.id.txt_im_custom_message_h5_name);
            TextView textView2 = (TextView) view.findViewById(R.id.txt_im_custom_message_h5_price);
            TextView textView3 = (TextView) view.findViewById(R.id.txt_im_custom_message_h5_origin_price);
            textView3.getPaint().setFlags(16);
            Typeface a2 = a(view.getContext());
            if (a2 != null) {
                textView2.setTypeface(a2);
            }
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = view.getContext();
            a3.i = R.drawable.wm_nox_im_pic_loading_fail;
            a3.j = R.drawable.wm_nox_im_pic_loading_fail;
            a3.c = customMessageData2.imgUrl;
            a3.a(imageView);
            textView.setText(customMessageData2.name);
            SpannableString spannableString = new SpannableString(view.getContext().getString(R.string.wm_im_rmb_symbol_half, h.a(customMessageData2.price)));
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, 1, 17);
            textView2.setText(spannableString);
            textView3.setVisibility(!h.a(Double.valueOf(customMessageData2.price), Double.valueOf(customMessageData2.originalPrice)) ? 0 : 8);
            textView3.setText(view.getContext().getString(R.string.wm_im_rmb_symbol_half, h.a(customMessageData2.originalPrice)));
            textView3.getPaint().setFlags(16);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.provider.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e041264df1050de7dea64cb120dca16", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e041264df1050de7dea64cb120dca16");
                    } else if (b.this.b != null) {
                        b.this.b.a(customMessageData2.spuId);
                    }
                }
            });
        }
    }

    public b(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, com.sankuai.waimai.store.im.group.a aVar2) {
        super(aVar, bundle);
        Object[] objArr = {aVar, bundle, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b213e3459d85c504e88e92f55d3b92c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b213e3459d85c504e88e92f55d3b92c5");
        } else {
            this.b = aVar2;
        }
    }

    private Typeface a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124f7d2a7b9c20245f34f8ea5685ad18", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124f7d2a7b9c20245f34f8ea5685ad18");
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
        } catch (Exception unused) {
            return null;
        }
    }
}
