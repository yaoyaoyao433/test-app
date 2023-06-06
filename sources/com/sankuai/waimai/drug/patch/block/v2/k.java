package com.sankuai.waimai.drug.patch.block.v2;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.l;
import com.sankuai.waimai.store.util.m;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public ImageView c;
    public TextView d;
    public View e;
    public View f;
    private TextView g;

    public k(@NonNull @NotNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390d989e6b1fea8ab871fd4371753def", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390d989e6b1fea8ab871fd4371753def");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce2f289f3274390d65fd40346093633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce2f289f3274390d65fd40346093633");
            return;
        }
        super.onViewCreated();
        View findView = findView(R.id.root_view);
        e.a aVar = new e.a();
        float a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 12.0f);
        findView.setBackground(aVar.a(a2, a2, 0.0f, 0.0f).a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFF1CC), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFECB2)}).a());
        this.b = (ImageView) findView(R.id.title_pic);
        this.c = (ImageView) findView(R.id.brand_pic);
        this.d = (TextView) findView(R.id.title_text);
        this.f = findView(R.id.line_divider);
        this.g = (TextView) findView(R.id.new_iv_activity_icon);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6e882961fb51ad3bd680c4798ac0452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6e882961fb51ad3bd680c4798ac0452");
            return;
        }
        int a3 = com.sankuai.shangou.stone.util.h.a(this.mContext, 12.0f);
        e.a aVar2 = new e.a();
        this.e = findView(R.id.title_anim_view);
        float f = a3;
        this.e.setBackground(aVar2.a(f, f, 0.0f, 0.0f).c(-1).a());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4113862d814c30a3e228c62b7f4968f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4113862d814c30a3e228c62b7f4968f6");
            return;
        }
        this.e.clearAnimation();
        this.c.clearAnimation();
        super.hide();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c170f38c43767af7faebbcc3c60071b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c170f38c43767af7faebbcc3c60071b1");
            return;
        }
        this.e.clearAnimation();
        this.c.clearAnimation();
        super.show();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9558437249744d9dc78bea090812fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9558437249744d9dc78bea090812fc");
            return;
        }
        this.e.clearAnimation();
        this.e.setVisibility(8);
    }

    public final void a(com.sankuai.waimai.drug.model.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c804e71dc990ad60607c8a036e5fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c804e71dc990ad60607c8a036e5fc8");
            return;
        }
        if (!TextUtils.isEmpty(dVar.d)) {
            this.g.setVisibility(8);
            this.d.setTextSize(2, 12.0f);
            this.d.setTypeface(Typeface.defaultFromStyle(1));
            this.d.setText(l.a(dVar.d, "#FF4A26"));
        } else if (!TextUtils.isEmpty(dVar.c)) {
            this.g.setVisibility(0);
            this.d.setTextSize(2, 11.0f);
            this.d.setTypeface(Typeface.defaultFromStyle(0));
            this.d.setText(l.a(dVar.c, "#FF4A26"));
        } else {
            this.g.setVisibility(8);
            this.d.setText("");
        }
        b();
        m.d(dVar.j, com.sankuai.shangou.stone.util.h.a(this.mContext, 15.0f)).a(this.b);
        m.d(dVar.k, com.sankuai.shangou.stone.util.h.a(this.mContext, 65.0f)).a(this.c);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8aa8ca2e0327426f3ff5bd728d55759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8aa8ca2e0327426f3ff5bd728d55759");
            return;
        }
        this.b.clearAnimation();
        this.c.clearAnimation();
        this.d.clearAnimation();
        this.f.clearAnimation();
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.f.setVisibility(0);
    }

    public Animation c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de27d84fb07aaa7a0d6384250b723e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de27d84fb07aaa7a0d6384250b723e3");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(130L);
        alphaAnimation.setFillAfter(true);
        return alphaAnimation;
    }
}
