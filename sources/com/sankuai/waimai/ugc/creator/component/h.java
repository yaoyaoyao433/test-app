package com.sankuai.waimai.ugc.creator.component;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public ImageView c;
    boolean d;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf1324669606425bc2dede1c75c011af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf1324669606425bc2dede1c75c011af");
        } else {
            this.d = false;
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604c0cb948d7b7c55469be09c04d0d37", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604c0cb948d7b7c55469be09c04d0d37") : layoutInflater.inflate(R.layout.wm_ugc_camera_viewfinder_actionbar_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff6aebbde4625ea674a0fc1e4d61f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff6aebbde4625ea674a0fc1e4d61f5d");
            return;
        }
        super.a(view);
        this.b = (ImageView) b(R.id.iv_ugc_camera_close);
        this.c = (ImageView) b(R.id.iv_ugc_camera_change_shot);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.component.h.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "624b9ab68a6cea3e788e7d3be122cdea", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "624b9ab68a6cea3e788e7d3be122cdea");
                } else if (o.a(h.this.B())) {
                    h.this.B().onBackPressed();
                }
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.component.h.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "061d403581b5278d406442554179a173", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "061d403581b5278d406442554179a173");
                    return;
                }
                h.this.d = !h.this.d;
                com.sankuai.waimai.ugc.creator.manager.g a2 = com.sankuai.waimai.ugc.creator.manager.g.a();
                boolean z = h.this.d;
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.manager.g.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "5cbcae13fcccdc0e42c00e83d1823946", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "5cbcae13fcccdc0e42c00e83d1823946");
                } else if (a2.b == null || a2.f || a2.e) {
                } else {
                    n.a("switchCamera");
                    a2.b.a(z);
                }
            }
        });
        this.b.setVisibility(0);
        this.c.setVisibility(0);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27a5c3fbe82c46745fd3ef1ee1a91e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27a5c3fbe82c46745fd3ef1ee1a91e7");
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(0);
        }
        if (this.c != null) {
            this.c.setVisibility(0);
        }
    }
}
