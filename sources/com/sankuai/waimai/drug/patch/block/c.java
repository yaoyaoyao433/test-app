package com.sankuai.waimai.drug.patch.block;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    com.sankuai.waimai.drug.patch.a f;
    a g;
    private ImageView h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean d();
    }

    public c(@NonNull Context context, com.sankuai.waimai.drug.patch.a aVar, a aVar2) {
        super(context);
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a19e4512a1f3918db02b6f7b57b28fa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a19e4512a1f3918db02b6f7b57b28fa0");
            return;
        }
        this.f = aVar;
        this.g = aVar2;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eafed0e6c897b917eaf069b663d3fcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eafed0e6c897b917eaf069b663d3fcb");
            return;
        }
        super.onViewCreated();
        e.a aVar = new e.a();
        float a2 = h.a(this.mContext, 12.0f);
        this.mView.setBackground(aVar.a(a2, a2, 0.0f, 0.0f).c(this.mContext.getResources().getColor(R.color.wm_st_shopcart_bg_gray_f5)).a());
        this.b = (TextView) findView(R.id.new_iv_activity_icon);
        this.e = (TextView) findView(R.id.new_tv_activity_detail);
        this.c = (TextView) findView(R.id.new_iv_no_activity_title);
        this.d = (TextView) findView(R.id.new_auto_show_tv_patchwork_tip);
        this.h = (ImageView) findView(R.id.new_iv_close);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.patch.block.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b8cbc77e02c7b899b2e55ba7f9f8f45", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b8cbc77e02c7b899b2e55ba7f9f8f45");
                } else if (c.this.f != null) {
                    c.this.f.a(view);
                }
            }
        });
    }
}
