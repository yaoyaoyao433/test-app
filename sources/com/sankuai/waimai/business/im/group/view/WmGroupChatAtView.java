package com.sankuai.waimai.business.im.group.View;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.im.group.model.WmGroupShareData;
import com.sankuai.waimai.business.im.group.rxbus.c;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupChatAtView extends AbstractMsgSideView implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private View b;
    private View e;
    private WmGroupShareData f;
    private a g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(long[] jArr, String str);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void d(b bVar) {
    }

    public WmGroupChatAtView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0540cafa7d6fedb6713faf244bb6b18b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0540cafa7d6fedb6713faf244bb6b18b");
        }
    }

    public WmGroupChatAtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c53d1c2794cc9ec9034183304506389", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c53d1c2794cc9ec9034183304506389");
        }
    }

    public WmGroupChatAtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82848188a84e6ea508769a8b4536202a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82848188a84e6ea508769a8b4536202a");
            return;
        }
        inflate(context, R.layout.wm_im_group_at_layout, this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "422486888f5b782db49210b1182c4ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "422486888f5b782db49210b1182c4ddf");
        } else {
            this.b = findViewById(R.id.tv_at_poi);
            this.e = findViewById(R.id.tv_at_rider);
            this.b.setOnClickListener(this);
            this.e.setOnClickListener(this);
        }
        this.f = WmGroupShareData.a(getContext());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33487aaf500ca6d867f8e795f2fc1ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33487aaf500ca6d867f8e795f2fc1ba7");
            return;
        }
        super.onAttachedToWindow();
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62827ef16b71d54b0e4d412b3fd10e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62827ef16b71d54b0e4d412b3fd10e3c");
            return;
        }
        super.onDetachedFromWindow();
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d81be0e6cb1555582167c9080bdaa3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d81be0e6cb1555582167c9080bdaa3");
            return;
        }
        int id = view.getId();
        if (id == R.id.tv_at_poi) {
            a(1);
            JudasManualManager.a("b_waimai_ghszjt8q_mc").a("c_waimai_wgiu7lrd").a();
        } else if (id == R.id.tv_at_rider) {
            a(2);
            JudasManualManager.a("b_waimai_8vqypdf7_mc").a("c_waimai_wgiu7lrd").a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b13051bd28458088ac2f46d791ac7c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b13051bd28458088ac2f46d791ac7c6");
        } else if (this.f.f == null || this.f.f.c == null || this.f.f.c.a == null || this.f.f.c.a.length == 0) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMemberChanged(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84f29358a577b69582df84deba7148d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84f29358a577b69582df84deba7148d");
        } else if (cVar == null) {
        } else {
            a();
        }
    }

    public void setOnAtClickCallback(a aVar) {
        this.g = aVar;
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b806acff96cad675a404e615f19a130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b806acff96cad675a404e615f19a130");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupAtInfo(this.f.d, this.f.b, this.f.c, String.valueOf(i)), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.b>>() { // from class: com.sankuai.waimai.business.im.group.View.WmGroupChatAtView.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    com.sankuai.waimai.business.im.group.model.b bVar;
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30ccd84d89739a63de3a6fa89db1b94a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30ccd84d89739a63de3a6fa89db1b94a");
                    } else if (baseResponse == null || baseResponse.code != 0 || (bVar = (com.sankuai.waimai.business.im.group.model.b) baseResponse.data) == null || bVar.a == null || bVar.a.length == 0 || !(WmGroupChatAtView.this.getContext() instanceof Activity) || ((Activity) WmGroupChatAtView.this.getContext()).isFinishing() || ((Activity) WmGroupChatAtView.this.getContext()).isDestroyed() || WmGroupChatAtView.this.g == null) {
                    } else {
                        WmGroupChatAtView.this.g.a(bVar.a, i == 1 ? "商家" : "骑手");
                    }
                }
            }, "");
        }
    }
}
