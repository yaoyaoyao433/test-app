package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements d {
    public static ChangeQuickRedirect a;
    private WeakReference<Context> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
    }

    private Typeface a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71112b23e55d406e8a7b2503808d8357", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71112b23e55d406e8a7b2503808d8357");
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1bff56aa9adb5ab22a99168a8759ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1bff56aa9adb5ab22a99168a8759ff");
        }
        this.b = new WeakReference<>(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_im_custom_message_send_h5, viewGroup);
        a aVar = new a();
        aVar.a = (ImageView) inflate.findViewById(R.id.img_im_custom_message_send_h5);
        aVar.b = (TextView) inflate.findViewById(R.id.txt_im_custom_message_send_h5_name);
        aVar.c = (TextView) inflate.findViewById(R.id.txt_im_custom_message_send_h5_price);
        aVar.d = (TextView) inflate.findViewById(R.id.txt_im_custom_message_send_h5_origin_price);
        aVar.d.getPaint().setFlags(16);
        aVar.e = (TextView) inflate.findViewById(R.id.img_btn_im_custom_message_send_h5);
        Typeface a2 = a(context);
        if (a2 != null) {
            aVar.c.setTypeface(a2);
        }
        inflate.setTag(aVar);
        JudasManualManager.b(com.sankuai.waimai.business.im.utils.d.i).a(com.sankuai.waimai.business.im.utils.d.a).a();
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, final com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a5b60e91e90d2d0ead6df3c9a0f1fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a5b60e91e90d2d0ead6df3c9a0f1fc");
            return;
        }
        byte[] data = bVar.b.getData();
        if (data == null) {
            return;
        }
        try {
            final com.sankuai.waimai.business.im.model.d a2 = com.sankuai.waimai.business.im.model.d.a(new JSONObject(new String(data, "utf-8")).optJSONObject("data"));
            a aVar = (a) view.getTag();
            Context context = this.b != null ? this.b.get() : null;
            if (context != null) {
                aVar.a.setImageURI(Uri.parse(a2.b));
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = context;
                a3.i = R.drawable.wm_nox_im_pic_loading_fail;
                a3.j = R.drawable.wm_nox_im_pic_loading_fail;
                a3.c = a2.b;
                a3.a(aVar.a);
            }
            aVar.b.setText(a2.c);
            SpannableString spannableString = new SpannableString(view.getContext().getString(R.string.wm_im_rmb_symbol_half, com.sankuai.waimai.foundation.utils.h.a(a2.d)));
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, 1, 17);
            aVar.c.setText(spannableString);
            aVar.d.setVisibility(!com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(a2.d), Double.valueOf(a2.e)) ? 0 : 8);
            aVar.d.setText(view.getContext().getString(R.string.wm_im_rmb_symbol_half, com.sankuai.waimai.foundation.utils.h.a(a2.e)));
            aVar.d.getPaint().setFlags(16);
            aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.message.j.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte[] a4;
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ae82ea19351588e45c3c6bc1f4bc2cb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ae82ea19351588e45c3c6bc1f4bc2cb");
                    } else if (a2 == null || (a4 = a2.a(0)) == null) {
                    } else {
                        IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a4, 0, "[商品]" + a2.c), false);
                        JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.h).a(com.sankuai.waimai.business.im.utils.d.a).a();
                        IMUIManager.a().a(bVar.b);
                    }
                }
            });
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
