package com.sankuai.waimai.bussiness.order.base.feedback;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    Activity b;
    TextView c;
    ImageView d;
    TextView e;
    TextView f;
    String g;
    long h;
    String i;
    j j;
    String k;
    String l;
    private View m;
    private View n;

    public c(@NonNull Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d30970501c59b5503f7a1a1a6ff47f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d30970501c59b5503f7a1a1a6ff47f0");
            return;
        }
        this.b = (Activity) context;
        switch (i) {
            case 1:
                this.k = "c_hgowsqb";
                return;
            case 2:
                this.k = "c_48pltlz";
                return;
            default:
                this.k = "";
                return;
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0595a397a4ef9cb792462c4047c792", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0595a397a4ef9cb792462c4047c792");
        }
        this.m = layoutInflater.inflate(R.layout.wm_order_detail_feed_back_finish_block, viewGroup, false);
        this.c = (TextView) this.m.findViewById(R.id.questionnaireTitle);
        this.d = (ImageView) this.m.findViewById(R.id.complete_icon);
        this.e = (TextView) this.m.findViewById(R.id.complete_txt);
        this.f = (TextView) this.m.findViewById(R.id.comment_des);
        this.n = this.m.findViewById(R.id.order_feedback_close);
        this.n.setContentDescription("关闭");
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f614cb91ee498fbe0c35c8895d6d7c7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f614cb91ee498fbe0c35c8895d6d7c7");
                } else if (c.this.j != null) {
                    c.this.j.a(1);
                }
            }
        });
        return this.m;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6839412d8ffcfafa40f803574d4c3b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6839412d8ffcfafa40f803574d4c3b24");
            return;
        }
        this.c.setVisibility(0);
        this.e.setVisibility(0);
        this.f.setVisibility(0);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d8ebcab6c01fe88144f560e7de4dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d8ebcab6c01fe88144f560e7de4dd1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e903ed4569e6d22dc90f7ec9802bfa24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e903ed4569e6d22dc90f7ec9802bfa24");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.b("b_drvzf8ni").a(this.k).a("order_id", this.g).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(this.h, this.i));
        a2.b = this.l;
        a2.a();
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdbb3f9ebe31ab412bd08c32c55ae501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdbb3f9ebe31ab412bd08c32c55ae501");
        } else {
            this.h = j;
        }
    }
}
