package com.sankuai.waimai.store.im.provider;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817bdd88f73bfa0b7948ce5568e369ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817bdd88f73bfa0b7948ce5568e369ee");
        }
        TextView textView = new TextView(context);
        int a2 = g.a(context, 5.0f);
        textView.setPadding(a2, a2, a2, a2);
        String a3 = a(bVar.b);
        if (TextUtils.isEmpty(a3)) {
            textView.setText(R.string.wm_sc_im_general_message_default_text);
        } else {
            textView.setText(a3);
        }
        return textView;
    }

    private static String a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "721b744ef4b36cd0745c432ed8801a43", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "721b744ef4b36cd0745c432ed8801a43");
        }
        if (generalMessage == null) {
            return "";
        }
        try {
            byte[] data = generalMessage.getData();
            return data != null ? new JSONObject(new String(data, "utf-8")).optString("degrade", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
