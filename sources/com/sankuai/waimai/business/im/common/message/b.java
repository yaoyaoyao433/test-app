package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.graphics.Typeface;
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
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private WeakReference<Context> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
    }

    private Typeface a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ca401fc430ee0e31e3d7f0a0ef6384", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ca401fc430ee0e31e3d7f0a0ef6384");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e51f63dd1db35faa635afb8497070208", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e51f63dd1db35faa635afb8497070208");
        }
        this.b = new WeakReference<>(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_nox_im_custom_message_h5, viewGroup);
        a aVar = new a();
        aVar.a = (ImageView) inflate.findViewById(R.id.img_im_custom_message_h5);
        aVar.b = (TextView) inflate.findViewById(R.id.txt_im_custom_message_h5_name);
        aVar.c = (TextView) inflate.findViewById(R.id.txt_im_custom_message_h5_price);
        aVar.d = (TextView) inflate.findViewById(R.id.txt_im_custom_message_h5_origin_price);
        aVar.d.getPaint().setFlags(16);
        Typeface a2 = a(context);
        if (a2 != null) {
            aVar.c.setTypeface(a2);
        }
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Context context;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c056caa639f32a1ef5e87e6ccc1cef88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c056caa639f32a1ef5e87e6ccc1cef88");
            return;
        }
        byte[] data = bVar.b.getData();
        if (data == null) {
            return;
        }
        try {
            com.sankuai.waimai.business.im.model.d a2 = com.sankuai.waimai.business.im.model.d.a(new JSONObject(new String(data, "utf-8")).optJSONObject("data"));
            a aVar = (a) view.getTag();
            if (this.b != null && (context = this.b.get()) != null) {
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
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
