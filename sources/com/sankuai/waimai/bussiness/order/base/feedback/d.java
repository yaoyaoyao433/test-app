package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    a b;
    private ViewGroup c;
    private ImageView d;
    private TextView e;
    private LinearLayout f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(c.C0753c c0753c);
    }

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e844ad61d0917c7a5a48fafdaa41d0e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e844ad61d0917c7a5a48fafdaa41d0e4");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2f7c4bc5e29abf2a7830dd1eb38122", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2f7c4bc5e29abf2a7830dd1eb38122");
        }
        this.c = (ViewGroup) layoutInflater.inflate(R.layout.wm_order_detail_feed_back_food_comment_block, viewGroup, false);
        this.d = (ImageView) this.c.findViewById(R.id.comment_img);
        this.e = (TextView) this.c.findViewById(R.id.comment_txt);
        this.f = (LinearLayout) this.c.findViewById(R.id.bg_layout);
        return this.c;
    }

    public final void a(final c.C0753c c0753c) {
        Object[] objArr = {c0753c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58410edf5dd70aa0d13f1406d8d53dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58410edf5dd70aa0d13f1406d8d53dc8");
        } else if (c0753c != null) {
            if (c0753c.b == null && c0753c.e == null) {
                return;
            }
            this.e.setText(c0753c.b);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = f();
            a2.c = c0753c.e;
            a2.a(this.d);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4ee6af221903e78fd9541fb84524217", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4ee6af221903e78fd9541fb84524217");
                    } else if (d.this.b != null) {
                        d.this.b.a(c0753c);
                    }
                }
            });
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a236a15062d1a794f73f4f971932ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a236a15062d1a794f73f4f971932ce0");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        layoutParams.width = com.sankuai.waimai.foundation.utils.g.a(f(), 130.0f);
        this.f.setLayoutParams(layoutParams);
        if (z) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.leftMargin = com.sankuai.waimai.foundation.utils.g.a(f(), 20.0f);
            this.c.setLayoutParams(layoutParams2);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54219baafc219afb36920f564dd9bb44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54219baafc219afb36920f564dd9bb44");
            return;
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(f(), 12.0f);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        this.e.setPadding(a2, 0, a2, 0);
        this.e.setLayoutParams(layoutParams);
        if (z) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.leftMargin = com.sankuai.waimai.foundation.utils.g.a(f(), 10.0f);
            this.c.setLayoutParams(layoutParams2);
        }
    }
}
