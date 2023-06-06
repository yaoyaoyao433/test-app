package com.meituan.android.legwork.ui.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.im.insertmassage.ImInsertMessageView;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements f {
    public static ChangeQuickRedirect a;
    Context b;

    @Override // com.meituan.android.legwork.ui.adapter.f
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe4edfd68fdd7ebfe1e9c75e6579292", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe4edfd68fdd7ebfe1e9c75e6579292");
        }
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.legwork_im_general_system_send_location_msg, viewGroup, false);
        inflate.setTag(new a(inflate));
        return inflate;
    }

    @Override // com.meituan.android.legwork.ui.adapter.f
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e567a24d5ef12c783320d6bee93c32cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e567a24d5ef12c783320d6bee93c32cb");
            return;
        }
        if (!com.meituan.android.legwork.common.im.g.a().a(bVar.b())) {
            com.meituan.android.legwork.statistics.a.a(ActivityUtils.a(this.b), "b_banma_xa1r2esr_mv", com.meituan.android.legwork.common.im.g.a().a(com.meituan.android.legwork.common.im.g.f), "c_q4u2ijua");
        }
        a aVar = (a) view.getTag();
        aVar.a.setVisibility(8);
        aVar.b.setVisibility(8);
        aVar.c.setVisibility(8);
        aVar.c.setOnClickListener(null);
        byte[] data = bVar.a().getData();
        if (data == null) {
            aVar.b.setVisibility(0);
            aVar.b.setText(R.string.legwork_im_general_system_require_location_content);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(data, "utf-8"));
            ImInsertMessageView imInsertMessageView = (ImInsertMessageView) new Gson().fromJson(jSONObject.toString(), (Class<Object>) ImInsertMessageView.class);
            if (imInsertMessageView != null) {
                if (!TextUtils.isEmpty(imInsertMessageView.title)) {
                    aVar.a.setVisibility(0);
                    aVar.a.setText(imInsertMessageView.title);
                }
                if (!TextUtils.isEmpty(imInsertMessageView.content)) {
                    aVar.b.setVisibility(0);
                    aVar.b.setText(imInsertMessageView.content);
                } else {
                    aVar.b.setVisibility(0);
                    aVar.b.setText(R.string.legwork_im_general_system_require_location_content);
                }
                if (TextUtils.isEmpty(imInsertMessageView.buttonText) || jSONObject.getJSONObject("extraMap") == null) {
                    return;
                }
                ImInsertMessageView.ReceiveAddress receiveAddress = (ImInsertMessageView.ReceiveAddress) new Gson().fromJson(jSONObject.getJSONObject("extraMap").toString(), (Class<Object>) ImInsertMessageView.ReceiveAddress.class);
                if (TextUtils.isEmpty(receiveAddress.orderViewId) || TextUtils.isEmpty(receiveAddress.addressLat) || TextUtils.isEmpty(receiveAddress.addressLng)) {
                    return;
                }
                aVar.c.setVisibility(0);
                aVar.c.setText(imInsertMessageView.buttonText);
                aVar.c.setOnClickListener(e.a(this, receiveAddress));
                return;
            }
            aVar.b.setVisibility(0);
            aVar.b.setText(R.string.legwork_im_general_system_require_location_content);
        } catch (Exception e) {
            aVar.b.setVisibility(0);
            aVar.b.setText(R.string.legwork_im_general_system_require_location_content);
            x.e("GeneralLocationMsgAdapter.bindView()", "general location message encoding error,exception msg:", e);
            x.a(e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a {
        public TextView a;
        public TextView b;
        public TextView c;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.general_message_location_title);
            this.b = (TextView) view.findViewById(R.id.general_message_location_content);
            this.c = (TextView) view.findViewById(R.id.general_message_location_button);
        }
    }
}
