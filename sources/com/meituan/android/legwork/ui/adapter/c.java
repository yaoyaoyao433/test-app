package com.meituan.android.legwork.ui.adapter;

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
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements f {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.legwork.ui.adapter.f
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd94c012ac678343c367dfa4551db57", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd94c012ac678343c367dfa4551db57") : LayoutInflater.from(context).inflate(R.layout.legwork_im_general_msg, viewGroup, false);
    }

    @Override // com.meituan.android.legwork.ui.adapter.f
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462bfefefe5cf9fdb1ba5b91c27c8eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462bfefefe5cf9fdb1ba5b91c27c8eb1");
        } else {
            ((TextView) view.findViewById(R.id.title_tv)).setText(new String(bVar.a().getData()));
        }
    }
}
