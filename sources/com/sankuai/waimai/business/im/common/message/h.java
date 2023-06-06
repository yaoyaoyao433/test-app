package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements d {
    public static ChangeQuickRedirect a;
    private boolean b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public TextView b;
        public TextView c;
        public TextView d;
        public String e;
    }

    public h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5fe796ee13a929e6e598e7f762d892a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5fe796ee13a929e6e598e7f762d892a");
        } else {
            this.b = z;
        }
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac85c40fafd7122d59d118f18f16f348", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac85c40fafd7122d59d118f18f16f348");
        }
        final a aVar = new a();
        final boolean z = this.b;
        Object[] objArr2 = {context, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d0e08eec964f60328e6172bc56017e03", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d0e08eec964f60328e6172bc56017e03");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_im_custom_message_modify_address, viewGroup);
        aVar.b = (TextView) inflate.findViewById(R.id.txt_modify_address_title);
        aVar.c = (TextView) inflate.findViewById(R.id.txt_modify_address_content);
        aVar.d = (TextView) inflate.findViewById(R.id.txt_modify_address_btn_jump);
        aVar.d.setVisibility(z ? 0 : 8);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.message.h.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "854cea8b62e63881ad8faeda0a31bd4f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "854cea8b62e63881ad8faeda0a31bd4f");
                } else if (z) {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.common.rxbus.c(com.sankuai.waimai.business.im.common.rxbus.c.b, a.this.e));
                }
            }
        });
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b208dedaf60cd7ebe7974ebd529b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b208dedaf60cd7ebe7974ebd529b26");
            return;
        }
        byte[] data = bVar.b.getData();
        if (data == null) {
            return;
        }
        try {
            com.sankuai.waimai.business.im.model.k a2 = com.sankuai.waimai.business.im.model.k.a(new JSONObject(new String(data, "utf-8")).optJSONObject("data"));
            a aVar = (a) view.getTag();
            if (a2 != null) {
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1333fc3fc848346f5fe17c57d7262f0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1333fc3fc848346f5fe17c57d7262f0c");
                    return;
                }
                aVar.b.setText(a2.b);
                aVar.c.setText(a2.c);
                aVar.d.setText(a2.d);
                aVar.e = a2.e;
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
