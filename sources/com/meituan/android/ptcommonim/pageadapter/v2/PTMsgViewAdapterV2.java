package com.meituan.android.ptcommonim.pageadapter.v2;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.pageadapter.message.PTEventMsgAdapter;
import com.meituan.android.ptcommonim.pageadapter.message.PTGeneralMsgAdapter;
import com.meituan.android.ptcommonim.pageadapter.message.PTMsgCommonAdapter;
import com.meituan.android.ptcommonim.pageadapter.message.PTMsgViewAdapter;
import com.meituan.android.ptcommonim.utils.d;
import com.meituan.android.ptcommonim.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTMsgViewAdapterV2 extends PTMsgViewAdapter {
    public static ChangeQuickRedirect b;
    public final PTEventMsgAdapter c;
    private final PTSessionInfo e;

    public PTMsgViewAdapterV2(PTSessionInfo pTSessionInfo) {
        Object[] objArr = {pTSessionInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3a80aaee07b328ebd7b964759fe5c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3a80aaee07b328ebd7b964759fe5c6");
            return;
        }
        this.e = pTSessionInfo;
        this.c = new PTEventMsgAdapter();
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.PTMsgViewAdapter
    public final PTMsgCommonAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a4be95e7f2cc3b6a6eaa5ce24bde74e", RobustBitConfig.DEFAULT_VALUE) ? (PTMsgCommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a4be95e7f2cc3b6a6eaa5ce24bde74e") : new PTMsgCommonAdapter() { // from class: com.meituan.android.ptcommonim.pageadapter.v2.PTMsgViewAdapterV2.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
            public int getBottomSideLayout(Context context, com.sankuai.xm.imui.session.entity.b bVar) {
                return R.layout.ptim_message_bottom_side_layout;
            }

            @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonSideAdapter
            public int getTopSideLayout(Context context, com.sankuai.xm.imui.session.entity.b bVar) {
                return R.layout.ptim_message_top_side_layout;
            }

            @Override // com.sankuai.xm.imui.session.view.adapter.impl.CommonAdapter, com.sankuai.xm.imui.session.view.adapter.ICommonStyleAdapter
            public int getStyle(com.sankuai.xm.imui.session.entity.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a75cb716f9600e2bbc4e3dcdfbab514", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a75cb716f9600e2bbc4e3dcdfbab514")).intValue();
                }
                if (bVar != null && (bVar.a() instanceof GeneralMessage)) {
                    String a = e.a((GeneralMessage) bVar.a());
                    if ("tmp_evaluate".equals(a) || "tmp_guider_tip".equals(a)) {
                        return 3;
                    }
                }
                return super.getStyle(bVar);
            }

            @Override // com.meituan.android.ptcommonim.pageadapter.message.PTMsgCommonAdapter
            public final void a(View view, com.sankuai.xm.imui.session.entity.b bVar) {
                Object[] objArr2 = {view, bVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "789e5b9a2a59d6247ea0755af3676dfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "789e5b9a2a59d6247ea0755af3676dfe");
                    return;
                }
                String packageName = view.getContext().getPackageName();
                if (bVar.f() == 2) {
                    if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                        d.a(view.getContext(), "meituanwaimai://waimai.meituan.com/account");
                    }
                } else if (bVar.f() == 1) {
                    d.a(view.getContext(), PTMsgViewAdapterV2.this.e.merchantInfo.merchantJumpUrl);
                }
            }
        };
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.PTMsgViewAdapter
    public final PTEventMsgAdapter c() {
        return this.c;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.PTMsgViewAdapter
    public final PTGeneralMsgAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "078ebe084ce9e88c3594a83d2dd83586", RobustBitConfig.DEFAULT_VALUE) ? (PTGeneralMsgAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "078ebe084ce9e88c3594a83d2dd83586") : new PTGeneralMsgAdapter() { // from class: com.meituan.android.ptcommonim.pageadapter.v2.PTMsgViewAdapterV2.2
            public static ChangeQuickRedirect b;

            @Override // com.meituan.android.ptcommonim.pageadapter.message.PTGeneralMsgAdapter
            public final /* synthetic */ com.meituan.android.ptcommonim.pageadapter.base.a a(Context context) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f94513f3bef662981724f475aff64db", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f94513f3bef662981724f475aff64db") : new a(context);
            }
        };
    }
}
