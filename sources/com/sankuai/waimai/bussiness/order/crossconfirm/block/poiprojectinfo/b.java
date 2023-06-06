package com.sankuai.waimai.bussiness.order.crossconfirm.block.poiprojectinfo;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    Activity e;
    View f;
    TextView g;
    ImageView h;
    View i;
    boolean j;
    int k;
    private boolean l;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_cross_order_confirm_poi_project;
    }

    public b(Context context, int i) {
        super(context);
        Object[] objArr = {context, 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c770d6ed50da9cc797f98697fc7caf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c770d6ed50da9cc797f98697fc7caf5");
            return;
        }
        this.l = false;
        this.k = 1;
        this.e = (Activity) context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b99e1cd8bc0586d7829448543ded6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b99e1cd8bc0586d7829448543ded6c8");
            return;
        }
        this.f = a();
        this.g = (TextView) a().findViewById(R.id.txt_wm_order_poi_project_desc);
        this.h = (ImageView) a().findViewById(R.id.img_wm_order_poi_project_icon);
        this.i = a().findViewById(R.id.divider_view);
        this.f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, final String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f245f65500a9426a2fef4423a9a06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f245f65500a9426a2fef4423a9a06f");
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.poiprojectinfo.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a848fd5562813055a4d38fe9016a3d49", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a848fd5562813055a4d38fe9016a3d49");
                        return;
                    }
                    com.sankuai.waimai.foundation.router.a.a(b.this.e, str);
                    if (b.this.k == 1) {
                        JudasManualManager.a("b_n4k5zgnu").a("c_ykhs39e").a(b.this.c).a();
                    }
                }
            });
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8f1f2182c04ba9589c40fed2b413c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8f1f2182c04ba9589c40fed2b413c1");
        } else if (this.l) {
        } else {
            JudasManualManager.b("b_7utor60c").a("c_ykhs39e").a(this.c).a();
            this.l = true;
        }
    }
}
