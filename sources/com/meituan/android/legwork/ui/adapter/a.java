package com.meituan.android.legwork.ui.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;
    Context b;

    @Override // com.meituan.android.legwork.ui.adapter.f
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63954298e1fa9bd7734e3d5295073f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63954298e1fa9bd7734e3d5295073f1");
        }
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.legwork_im_general_rider_send_location_msg, viewGroup, false);
        inflate.setTag(new C0272a(inflate));
        return inflate;
    }

    @Override // com.meituan.android.legwork.ui.adapter.f
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4888642d42e365e9fb24e3a2a87b9253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4888642d42e365e9fb24e3a2a87b9253");
            return;
        }
        if (!com.meituan.android.legwork.common.im.g.a().a(bVar.b())) {
            com.meituan.android.legwork.statistics.a.a(ActivityUtils.a(this.b), "b_banma_sqnr9imi_mv", com.meituan.android.legwork.common.im.g.a().a(com.meituan.android.legwork.common.im.g.f), "c_q4u2ijua");
        }
        C0272a c0272a = (C0272a) view.getTag();
        c0272a.b.setVisibility(8);
        c0272a.b.setOnClickListener(null);
        byte[] data = bVar.a().getData();
        if (data == null) {
            c0272a.a.setVisibility(0);
            c0272a.a.setText(R.string.legwork_im_general_require_location_text);
            c0272a.b.setVisibility(8);
            return;
        }
        try {
            String optString = new JSONObject(new String(data, "utf-8")).optJSONObject("data").optString("message");
            if (!TextUtils.isEmpty(optString)) {
                c0272a.a.setVisibility(0);
                c0272a.a.setText(optString);
                c0272a.b.setVisibility(0);
                c0272a.b.setOnClickListener(b.a(this));
                return;
            }
            c0272a.a.setVisibility(0);
            c0272a.a.setText(R.string.legwork_im_general_require_location_text);
            c0272a.b.setVisibility(8);
        } catch (Exception e) {
            c0272a.a.setVisibility(0);
            c0272a.a.setText(R.string.legwork_im_general_require_location_text);
            x.e("GeneralDLocationMsgAdapter.bindView()", "general location message encoding error,exception msg:", e);
            x.a(e);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0272a {
        public TextView a;
        public TextView b;

        public C0272a(View view) {
            this.a = (TextView) view.findViewById(R.id.general_message_rider_location_title);
            this.b = (TextView) view.findViewById(R.id.general_message_rider_location_button);
        }
    }
}
