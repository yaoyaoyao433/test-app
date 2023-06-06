package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter;
import com.sankuai.waimai.business.im.common.plugin.smartreply.SmartReplyPlugin;
import com.sankuai.waimai.business.im.common.rxbus.b;
import com.sankuai.waimai.business.im.group.chat.WMUserGroupChatFragment;
import com.sankuai.waimai.business.im.group.model.h;
import com.sankuai.waimai.business.im.mach.c;
import com.sankuai.xm.imui.common.entity.AtInfo;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMUserMachGroupSendPanelAdapter extends IMSendPanelAdapter {
    public static ChangeQuickRedirect f;
    protected com.sankuai.waimai.business.im.common.contract.a g;
    public View h;
    public h i;
    public WMUserGroupChatFragment.a j;
    public a k;
    private final String m;
    private final String n;
    private final String o;
    private SmartReplyPlugin p;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public c a;
        public FrameLayout b;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return R.layout.wm_im_comon_mach_send_pannel;
    }

    public WMUserMachGroupSendPanelAdapter(com.sankuai.waimai.business.im.common.contract.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88afb7c4341c3a157b00347c68f097b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88afb7c4341c3a157b00347c68f097b");
            return;
        }
        this.m = "waimai_im_im_group_send_style_1";
        this.n = "waimai_im_mach";
        this.o = "c_waimai_reae8s5i";
        this.g = aVar;
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f212d6b03612c5e8cfc91c6f56e2c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f212d6b03612c5e8cfc91c6f56e2c0a");
        }
        View createView = super.createView(context, viewGroup);
        com.meituan.android.bus.a.a().a(this);
        this.p = (SmartReplyPlugin) createView.findViewById(R.id.reply_plugin);
        this.p.setVisibility(8);
        this.e.setVisibility(0);
        this.d.setVisibility(8);
        this.h = createView.findViewById(R.id.framelayout);
        a aVar = new a();
        aVar.b = (FrameLayout) createView.findViewById(R.id.framelayout);
        c cVar = new c(context, this.g, "c_waimai_reae8s5i");
        cVar.a(viewGroup);
        aVar.a = cVar;
        this.h.setTag(aVar);
        return createView;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8c0cb8cb0519b1ee891042158e21a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8c0cb8cb0519b1ee891042158e21a1");
        } else if (j == 0) {
        } else {
            this.c.a(new AtInfo(j, "群主"), true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onIMCouponClick(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c3536cd8dba151260c6093336f5ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c3536cd8dba151260c6093336f5ee9");
        } else if (bVar == null || TextUtils.isEmpty(bVar.a) || this.i == null || this.i.b == null || !this.i.b.containsKey(bVar.a)) {
        } else {
            this.i.b.remove(bVar.a);
            HashMap hashMap = new HashMap();
            if (this.i.b.isEmpty()) {
                hashMap.put("count", 0);
            } else {
                hashMap.put("count", Integer.valueOf(this.i.b.size()));
            }
            this.k.a.d().b("coupon_count_action", hashMap);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.adapter.IMSendPanelAdapter
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c7cf4144029da27b761179c9278ca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c7cf4144029da27b761179c9278ca2");
            return;
        }
        super.b();
        com.meituan.android.bus.a.a().b(this);
    }
}
