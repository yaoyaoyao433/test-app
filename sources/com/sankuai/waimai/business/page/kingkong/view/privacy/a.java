package com.sankuai.waimai.business.page.kingkong.view.privacy;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;
    private FrameLayout s;
    private View t;
    private View u;
    private View v;
    private View w;

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1284b0f9104336f026cabe35e401f54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1284b0f9104336f026cabe35e401f54b");
        } else if (aVar.l() == null || aVar.l().isFinishing()) {
        } else {
            aVar.l().finish();
        }
    }

    public a(com.sankuai.waimai.business.page.kingkong.a aVar, @Nullable ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666862f61a7242a0b062fb9a22fb9ecd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666862f61a7242a0b062fb9a22fb9ecd");
            return;
        }
        aVar.O.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.view.privacy.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b11816074069b7d65f066473f097b96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b11816074069b7d65f066473f097b96");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("PrivacyActionBarBlock", "PrivacyActionBarBlock: " + bool2, new Object[0]);
                if (bool2 == null || a.this.t == null) {
                    return;
                }
                a.this.t.setSelected(bool2.booleanValue());
            }
        });
        aVar.Z.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.view.privacy.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83213629bd84e6d20d4ae5e558ee13dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83213629bd84e6d20d4ae5e558ee13dc");
                } else if (bool2 == null || !bool2.booleanValue() || a.this.t == null) {
                } else {
                    a.this.t.setVisibility(0);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bca9c003572b4b167d883dc939c64e7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bca9c003572b4b167d883dc939c64e7") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.kingkong.view.privacy.a.3
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_fkk_privacy_actionblock;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad932455c9c0f196eaa3fb068d958034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad932455c9c0f196eaa3fb068d958034");
            return;
        }
        super.s();
        this.s = (FrameLayout) i().findViewById(R.id.fl_privacy_content);
        this.t = i().findViewById(R.id.view_bottom);
        this.w = i().findViewById(R.id.iv_wm_logo);
        this.u = i().findViewById(R.id.iv_home);
        this.v = i().findViewById(R.id.kangaroo_icon);
        if (l() != null && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) l())) {
            int e = g.e(com.meituan.android.singleton.b.a);
            this.s.setPadding(0, e, 0, 0);
            ViewGroup.LayoutParams layoutParams = this.s.getLayoutParams();
            layoutParams.height = g.a(m(), 64.0f) + e;
            this.s.setLayoutParams(layoutParams);
        }
        if (!com.sankuai.waimai.foundation.core.a.d()) {
            this.u.setVisibility(0);
            this.v.setVisibility(0);
            this.w.setVisibility(8);
            this.u.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.privacy.a.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f22fe419a0fc2688d6dd80545cedeafa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f22fe419a0fc2688d6dd80545cedeafa");
                    } else {
                        a.b(a.this);
                    }
                }
            });
            return;
        }
        this.w.setVisibility(0);
        this.u.setVisibility(8);
        this.v.setVisibility(8);
    }
}
