package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter;
import com.sankuai.waimai.business.im.common.plugin.smartreply.d;
import com.sankuai.waimai.business.im.model.i;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BadCommentGroupChatSendPanelAdapter extends IMSendPanelAdapter {
    public static ChangeQuickRedirect f;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final boolean a() {
        return true;
    }

    public BadCommentGroupChatSendPanelAdapter(@Nullable d dVar, int i) {
        super((d) null, (i) null, i);
        Object[] objArr = {null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4ebeb782e4939d63defda9b6d0ed5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4ebeb782e4939d63defda9b6d0ed5d");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90552e8535314d20a2ac9605bc1859f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90552e8535314d20a2ac9605bc1859f5");
        }
        View createView = super.createView(context, viewGroup);
        createView.findViewById(R.id.reply_plugin).setVisibility(8);
        return createView;
    }
}
