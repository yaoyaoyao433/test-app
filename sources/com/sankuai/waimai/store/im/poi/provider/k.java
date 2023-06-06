package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.store.im.poi.model.ImOrderData;
import com.sankuai.waimai.store.im.poi.model.ImOrderInfo;
import com.sankuai.waimai.store.util.e;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.im.poi.listener.a b;
    private Drawable c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private HashSet<Long> g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public com.sankuai.waimai.store.im.poi.block.c a;
        public LinearLayout b;
        public LinearLayout c;
        public TextView d;
        public TextView e;
        public TextView f;
    }

    public k(com.sankuai.waimai.store.im.poi.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b99ce4ec2e66a188ff80bb76b89e607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b99ce4ec2e66a188ff80bb76b89e607");
            return;
        }
        this.g = new HashSet<>();
        this.b = aVar;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f4179cec9173940ea38e9478040680", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f4179cec9173940ea38e9478040680");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_common_im_send_order_holder, viewGroup, false);
        inflate.setLayoutParams(new AbsListView.LayoutParams(com.sankuai.shangou.stone.util.h.a(context) - (context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12) * 2), -2));
        a aVar = new a();
        aVar.a = new com.sankuai.waimai.store.im.poi.block.c(context, false);
        aVar.a.bindView(inflate.findViewById(R.id.rl_im_order_info_container));
        aVar.b = (LinearLayout) inflate.findViewById(R.id.ll_common_im_send_order_button_container);
        aVar.d = (TextView) inflate.findViewById(R.id.tv_common_im_send_order_button);
        aVar.e = (TextView) inflate.findViewById(R.id.tv_common_im_remind_order_button);
        aVar.c = (LinearLayout) inflate.findViewById(R.id.ll_common_im_send_order_container);
        aVar.f = (TextView) inflate.findViewById(R.id.tv_common_im_modify_address_button);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30723edb3e9ce53e0f38a85161207129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30723edb3e9ce53e0f38a85161207129");
            return;
        }
        Context context = view.getContext();
        a aVar = (a) view.getTag();
        if (aVar == null || bVar == null) {
            return;
        }
        final GeneralMessage generalMessage = bVar.b;
        ImOrderData convert = ImOrderData.convert(generalMessage);
        final ImOrderInfo imOrderInfo = convert.orderInfo;
        aVar.a.a(imOrderInfo);
        if (this.c == null) {
            this.c = new e.a().a(com.sankuai.waimai.store.util.b.b(context, R.color.wm_sg_color_FF8000)).b(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1)).a(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13)).a();
        }
        aVar.d.setBackground(this.c);
        if (this.d == null) {
            this.d = new e.a().a(com.sankuai.waimai.store.util.b.b(context, R.color.wm_sg_color_im_D3D3D3)).b(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1)).a(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13)).a();
        }
        aVar.e.setBackground(this.d);
        if (this.e == null) {
            this.e = new e.a().c(com.sankuai.waimai.store.util.b.b(context, R.color.wm_st_common_white)).a(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_8)).a();
        }
        aVar.c.setBackground(this.e);
        if (this.f == null) {
            this.f = new e.a().a(com.sankuai.waimai.store.util.b.b(context, R.color.wm_sg_color_im_D3D3D3)).b(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1)).a(context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13)).a();
        }
        aVar.f.setBackground(this.f);
        final String string = context.getString(R.string.wm_sc_common_im_send_order);
        if (convert.isShowRemind) {
            aVar.e.setVisibility(0);
            string = string + CommonConstant.Symbol.COMMA + context.getString(R.string.wm_sc_common_im_remind_order);
        } else {
            aVar.e.setVisibility(8);
        }
        if (convert.isShowModifyAddress) {
            u.a(aVar.f);
        } else {
            u.c(aVar.f);
        }
        aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.provider.k.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "119a15036e4c496578206d23edd415d2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "119a15036e4c496578206d23edd415d2");
                } else if (k.this.b != null) {
                    JudasManualManager.a("b_waimai_sjtno37p_mc").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", k.this.b.G()).a("button_nm", string).a();
                    k.this.b.a(imOrderInfo, generalMessage);
                }
            }
        });
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.provider.k.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b535ae74810d2fd790671d706c9beb4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b535ae74810d2fd790671d706c9beb4");
                } else if (k.this.b != null) {
                    JudasManualManager.a("b_waimai_sjtno37p_mc").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", k.this.b.G()).a("button_nm", string).a();
                    k.this.b.b(imOrderInfo, generalMessage);
                }
            }
        });
        aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.provider.k.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acdcac02985390f596fe318d5b9e2b10", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acdcac02985390f596fe318d5b9e2b10");
                } else if (k.this.b != null) {
                    k.this.b.c(imOrderInfo, generalMessage);
                }
            }
        });
        long G = this.b != null ? this.b.G() : 0L;
        if (!this.g.contains(Long.valueOf(imOrderInfo.orderViewID))) {
            JudasManualManager.b("b_waimai_sjtno37p_mv").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", G).a("button_nm", string).a();
            this.g.add(Long.valueOf(imOrderInfo.orderViewID));
        }
        View view2 = aVar.f;
        TextView textView = aVar.e;
        TextView textView2 = aVar.d;
        Object[] objArr2 = {view2, textView, textView2, context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e5dd66c5118998ddae2c5b2a52c797d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e5dd66c5118998ddae2c5b2a52c797d");
            return;
        }
        int i = a(view2) ? 1 : 0;
        if (a(textView)) {
            i++;
        }
        if (a(textView2)) {
            i++;
        }
        int i2 = i;
        if (i2 == 3) {
            int a2 = com.sankuai.shangou.stone.util.h.a(context, 15.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = a2;
            textView.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = a2;
            textView.setLayoutParams(layoutParams2);
        } else if (i2 == 2) {
            int a3 = com.sankuai.shangou.stone.util.h.a(context, 32.0f);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams3.leftMargin = a3;
            textView2.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams4.leftMargin = 0;
            textView.setLayoutParams(layoutParams4);
        } else {
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams5.leftMargin = 0;
            textView2.setLayoutParams(layoutParams5);
        }
    }

    private boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e424347198ea421abfeb286ac14544", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e424347198ea421abfeb286ac14544")).booleanValue() : view.getVisibility() == 0;
    }
}
