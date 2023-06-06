package com.sankuai.waimai.store.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DeliverView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private float d;
    private float e;
    private float f;
    private float g;

    public DeliverView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc374eab922807fe81c5f46ce04701e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc374eab922807fe81c5f46ce04701e");
        }
    }

    public DeliverView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77349523153fd3eb1050d59778cf45aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77349523153fd3eb1050d59778cf45aa");
        }
    }

    public DeliverView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abce672fcb9ca75c83967c0877da6db4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abce672fcb9ca75c83967c0877da6db4");
            return;
        }
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b95ca0912122258471daa75022089578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b95ca0912122258471daa75022089578");
            return;
        }
        setOrientation(0);
        inflate(context, R.layout.wm_sc_common_widget_deliver_content, this);
        this.b = (TextView) findViewById(R.id.txt_mt_delivery_type);
        this.c = (TextView) findViewById(R.id.txt_mt_delivery_time);
        a(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4), getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4), getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4), getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4));
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b865d4f489605e588120ce78ea4ddb2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b865d4f489605e588120ce78ea4ddb2f");
            return;
        }
        u.a(this.b, str);
        u.a(this.c, str2);
    }

    public void setDeliverTimeImageUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f804e0f8d4f7d3e7a3387fd4136ef302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f804e0f8d4f7d3e7a3387fd4136ef302");
        } else if (!TextUtils.isEmpty(str)) {
            m.a(str, h.a(getContext(), 5.0f), h.a(getContext(), 8.0f), ImageQualityUtil.b()).a(new b.a() { // from class: com.sankuai.waimai.store.view.DeliverView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c05f9a23fc6ef4d82597d24653621868", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c05f9a23fc6ef4d82597d24653621868");
                    } else {
                        DeliverView.this.c.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(DeliverView.this.getContext().getResources(), bitmap), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb97db221ada34a8d6a2b8bd58c3fd4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb97db221ada34a8d6a2b8bd58c3fd4b");
                    } else {
                        DeliverView.this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            });
        } else {
            this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4da54892a1cb8adacb1ce7c31a623da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4da54892a1cb8adacb1ce7c31a623da");
            return;
        }
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public final void a(int i) {
        Drawable a2;
        Drawable a3;
        Drawable drawable;
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc152c1c0cd88bd6effd7dd63352e94f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc152c1c0cd88bd6effd7dd63352e94f");
            return;
        }
        boolean z = this.b.getVisibility() == 0;
        boolean z2 = this.c.getVisibility() == 0;
        int i3 = -14539738;
        switch (i) {
            case 0:
            case 1:
                a2 = new e.a().a(z ? 0.0f : this.d, this.e, this.g, z ? 0.0f : this.f).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFC34D)}).a();
                a3 = new e.a().a(-15028).b(1).a(this.d, z2 ? 0.0f : this.e, z2 ? 0.0f : this.g, this.f).a();
                drawable = a2;
                i2 = -14539738;
                break;
            case 7:
                a2 = new e.a().a(z ? 0.0f : this.d, this.e, this.g, z ? 0.0f : this.f).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-400978, -1855652}).a();
                a3 = new e.a().a(-2312599).b(1).a(this.d, z2 ? 0.0f : this.e, z2 ? 0.0f : this.g, this.g).a();
                drawable = a2;
                i2 = -14539738;
                break;
            case 8:
                Drawable a4 = new e.a().a(z ? 0.0f : this.d, this.e, this.g, z ? 0.0f : this.f).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16728700, -16728700}).a();
                a3 = new e.a().a(-16728700).b(1).a(this.d, z2 ? 0.0f : this.e, z2 ? 0.0f : this.g, this.f).a();
                drawable = a4;
                i2 = -1;
                i3 = -16728700;
                break;
            default:
                a2 = new e.a().a(z ? 0.0f : this.d, this.e, this.g, z ? 0.0f : this.f).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFE14D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFC34D)}).a();
                a3 = new e.a().a(-15028).b(1).a(this.d, z2 ? 0.0f : this.e, z2 ? 0.0f : this.g, this.f).a();
                drawable = a2;
                i2 = -14539738;
                break;
        }
        this.b.setBackground(a3);
        this.b.setTextColor(i3);
        this.c.setTextColor(i2);
        this.c.setBackground(drawable);
    }
}
