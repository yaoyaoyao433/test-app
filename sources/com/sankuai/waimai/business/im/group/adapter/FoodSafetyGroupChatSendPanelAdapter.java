package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter;
import com.sankuai.waimai.business.im.common.plugin.smartreply.d;
import com.sankuai.waimai.business.im.model.i;
import com.sankuai.xm.imui.common.processors.LinkProcessor;
import com.sankuai.xm.imui.common.view.LinkTextView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FoodSafetyGroupChatSendPanelAdapter extends IMSendPanelAdapter {
    public static ChangeQuickRedirect f;
    protected LinkTextView g;

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final boolean a() {
        return true;
    }

    public FoodSafetyGroupChatSendPanelAdapter(@Nullable d dVar, int i) {
        super((d) null, (i) null, i);
        Object[] objArr = {null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f5d504ff6d27f9e1c52eb5c7e1a0b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f5d504ff6d27f9e1c52eb5c7e1a0b1");
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b50b47a2ead82e243cc1c5f1f9b5f29", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b50b47a2ead82e243cc1c5f1f9b5f29");
        }
        View createView = super.createView(context, viewGroup);
        createView.findViewById(R.id.reply_plugin).setVisibility(8);
        View findViewById = createView.findViewById(R.id.xm_sdk_send_panel_input_forbidden);
        if (findViewById != null && (findViewById instanceof ViewGroup)) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            viewGroup2.removeAllViews();
            this.g = new LinkTextView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int dimension = (int) context.getResources().getDimension(R.dimen.xm_sdk_send_panel_ic_margin_bottom);
            layoutParams.setMargins(dimension, dimension, dimension, dimension);
            this.g.setLayoutParams(layoutParams);
            this.g.setGravity(17);
            this.g.setTextSize(2, 16.0f);
            this.g.setTextColor(Color.parseColor("#999999"));
            viewGroup2.addView(this.g);
        }
        return createView;
    }

    public final void a(Context context, String str, LinkTextView.b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50f9d942fd839b1b6926587d918210b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50f9d942fd839b1b6926587d918210b");
        } else if (this.g == null) {
        } else {
            com.sankuai.xm.imui.common.processors.d dVar = new com.sankuai.xm.imui.common.processors.d();
            LinkProcessor linkProcessor = new LinkProcessor();
            linkProcessor.c = false;
            linkProcessor.b = context.getResources().getColor(R.color.wm_imbase_text_food_safety_end_status);
            dVar.a(linkProcessor);
            this.g.setText(dVar.a(str));
            this.g.setOnLinkClickListener(bVar);
        }
    }
}
