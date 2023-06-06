package com.sankuai.waimai.store.im.group.view;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.group.manager.c;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupTopBannerBlock implements IBannerAdapter {
    public static ChangeQuickRedirect a;
    public TextView b;
    public a c;
    public View d;
    public View e;
    public ImageView f;
    public String g;
    public String h;
    public ImageView i;
    private ImageView j;

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public boolean isOverlay() {
        return true;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfbd53aaf3e27c71c541c815aed1dc32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfbd53aaf3e27c71c541c815aed1dc32");
        }
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677e1d4cda51a10693b1391afb1875a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677e1d4cda51a10693b1391afb1875a1");
        }
        this.d = layoutInflater.inflate(R.layout.wm_sc_user_group_top_banner, viewGroup, false);
        this.b = (TextView) this.d.findViewById(R.id.wm_sc_user_group_top_banner_warn);
        this.f = (ImageView) this.d.findViewById(R.id.wm_sc_user_group_top_banner_close);
        this.e = this.d.findViewById(R.id.wm_sc_user_group_top_banner_notice_layout);
        this.c = new a(this.d.getContext());
        this.c.bindView(this.e.findViewById(R.id.wm_sc_user_group_top_banner_notice_content));
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.group.view.SGIMUserGroupTopBannerBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a2b82814c623b03c9995925d2112194", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a2b82814c623b03c9995925d2112194");
                    return;
                }
                b.a("c_waimai_4pe066t1", "b_waimai_5xhvwnkz_mc").a("poi_id", SGIMUserGroupTopBannerBlock.this.g).a("group_id", SGIMUserGroupTopBannerBlock.this.h).a();
                c.a.a.a(view.getContext(), SGIMUserGroupTopBannerBlock.this.h, true);
                SGIMUserGroupTopBannerBlock.this.d.setVisibility(8);
            }
        });
        this.j = (ImageView) this.d.findViewById(R.id.wm_sc_user_group_im_notice_horn);
        this.i = (ImageView) this.d.findViewById(R.id.wm_sc_user_group_im_notice_right);
        return this.d;
    }

    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c14017c2a1a3280731fdad862296fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c14017c2a1a3280731fdad862296fc");
        } else if (bool.booleanValue()) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }
}
