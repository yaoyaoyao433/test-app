package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.poi.model.IMEnterUserGroupData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.im.poi.listener.d b;
    private final Set<String> c;
    private long d;

    public e(com.sankuai.waimai.store.im.poi.listener.d dVar, long j) {
        Object[] objArr = {dVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0614626588bc0ee1769ea64e8b6f38a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0614626588bc0ee1769ea64e8b6f38a4");
            return;
        }
        this.c = new HashSet();
        this.b = dVar;
        this.d = j;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d03c63c9134bc031ca205eb0a5a1994", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d03c63c9134bc031ca205eb0a5a1994");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sg_im_layout_poi_enter_user_group_view, viewGroup, false);
        inflate.setTag(new a(inflate, this.b));
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9aa91d363a2d864bff092146f1f06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9aa91d363a2d864bff092146f1f06b");
        } else if (bVar == null || !(view.getTag() instanceof a)) {
        } else {
            final a aVar = (a) view.getTag();
            final IMEnterUserGroupData iMEnterUserGroupData = (IMEnterUserGroupData) com.sankuai.waimai.store.im.util.b.a(bVar.b, IMEnterUserGroupData.class);
            long j = this.d;
            Object[] objArr2 = {iMEnterUserGroupData, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2f98f43d641460e8a914ca3ad0094e72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2f98f43d641460e8a914ca3ad0094e72");
            } else {
                aVar.g = j;
                aVar.f = iMEnterUserGroupData;
                if (aVar.f == null) {
                    aVar.e.setVisibility(8);
                } else {
                    aVar.e.setVisibility(0);
                    aVar.b.setText(aVar.f.tip);
                    aVar.c.setText(aVar.f.enterGroupBtnText);
                    u.a((View) aVar.d, t.a(iMEnterUserGroupData.enterGroupTitle) ? 8 : 0);
                    aVar.b.setTextColor(Color.parseColor(t.a(iMEnterUserGroupData.enterGroupTitle) ? "#E6000000" : "#80000000"));
                    aVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.provider.e.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object[] objArr3 = {view2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3d1158e1de5f124643bf38c441efa95", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3d1158e1de5f124643bf38c441efa95");
                            } else if (a.this.h != null) {
                                a.this.h.a(iMEnterUserGroupData);
                            }
                        }
                    });
                }
            }
            if (this.c.contains(bVar.b())) {
                return;
            }
            Object[] objArr3 = {iMEnterUserGroupData};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "98e1a2e0179be165bf7b1b6600f0178d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "98e1a2e0179be165bf7b1b6600f0178d");
            } else if (iMEnterUserGroupData != null) {
                com.sankuai.waimai.store.manager.judas.b.b(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_dheoia31_mv").a("poi_id", Long.valueOf(aVar.g)).a("group_source", t.a(iMEnterUserGroupData.source) ? "-1" : iMEnterUserGroupData.source).a();
            }
            this.c.add(bVar.b());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public static ChangeQuickRedirect a;
        TextView b;
        TextView c;
        TextView d;
        View e;
        IMEnterUserGroupData f;
        long g;
        com.sankuai.waimai.store.im.poi.listener.d h;

        public a(View view, com.sankuai.waimai.store.im.poi.listener.d dVar) {
            Object[] objArr = {view, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5c73c57440b26d49bf3e09b1e29ad3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5c73c57440b26d49bf3e09b1e29ad3");
                return;
            }
            this.e = view;
            this.b = (TextView) this.e.findViewById(R.id.wm_sg_im_layout_poi_enter_user_group_view_tip);
            this.c = (TextView) this.e.findViewById(R.id.wm_sg_im_layout_poi_enter_user_group_view_enter_group);
            this.d = (TextView) this.e.findViewById(R.id.tv_im_enter_group_title);
            this.h = dVar;
        }
    }
}
