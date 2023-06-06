package com.sankuai.waimai.store.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.platform.shop.model.LiveBaseInfo;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LiveView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private ViewGroup b;
    private ViewGroup c;
    private ImageView d;
    private TextView e;
    private TextView f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;

    public LiveView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35606f9fdf6d6d8128afa6a8d295484d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35606f9fdf6d6d8128afa6a8d295484d");
        } else {
            a(context, null, 0);
        }
    }

    public LiveView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df53ac9c242fc27a15a793b103b96c47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df53ac9c242fc27a15a793b103b96c47");
        } else {
            a(context, attributeSet, 0);
        }
    }

    public LiveView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ccf60c041cc41b941239798e96b776", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ccf60c041cc41b941239798e96b776");
        } else {
            a(context, attributeSet, i);
        }
    }

    public LiveView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78737a7ad705fd201a4bc04665b12ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78737a7ad705fd201a4bc04665b12ea");
        } else {
            a(context, attributeSet, i);
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d863fa455db2b66c3b9ca07cefed0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d863fa455db2b66c3b9ca07cefed0b");
            return;
        }
        setOrientation(0);
        setGravity(16);
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_nox_search_live_layout, this);
        this.b = (ViewGroup) inflate.findViewById(R.id.live_left_content_layout);
        this.c = (ViewGroup) inflate.findViewById(R.id.live_right_content_layout);
        this.d = (ImageView) inflate.findViewById(R.id.search_spu_live_img);
        this.e = (TextView) inflate.findViewById(R.id.search_spu_live_text);
        this.f = (TextView) inflate.findViewById(R.id.live_online_count_txt);
        this.b.setBackground(new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{context.getResources().getColor(R.color.wm_sc_nox_search_color_FF6F2A), context.getResources().getColor(R.color.wm_sc_nox_search_color_FF154A)}).a(h.a(context, 4.0f)).a());
        b(context, attributeSet, i);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3851e7dd2a456f23ea955de4c3d77e72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3851e7dd2a456f23ea955de4c3d77e72");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.onlineCountTextColor, R.attr.rightContentBg, R.attr.showRightContent}, i, 0);
        this.j = obtainStyledAttributes.getBoolean(2, false);
        this.c.setVisibility(this.j ? 0 : 8);
        this.i = obtainStyledAttributes.getDrawable(1);
        this.c.setBackground(this.i);
        this.f.setTextColor(obtainStyledAttributes.getColor(0, com.sankuai.waimai.store.util.b.b(context, R.color.white)));
        obtainStyledAttributes.recycle();
    }

    public final void a(LiveBaseInfo liveBaseInfo) {
        Object[] objArr = {liveBaseInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f8643ee76ebefd073d0df012222a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f8643ee76ebefd073d0df012222a1d");
        } else if (liveBaseInfo == null || !liveBaseInfo.isLive) {
            setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
        } else {
            if (!TextUtils.isEmpty(liveBaseInfo.iconUrl)) {
                this.d.setVisibility(0);
                m.a(liveBaseInfo.iconUrl).a(this.d);
            } else {
                this.d.setVisibility(8);
            }
            if (!TextUtils.isEmpty(liveBaseInfo.iconDesc)) {
                this.e.setVisibility(0);
                this.e.setText(liveBaseInfo.iconDesc);
            } else {
                this.e.setVisibility(8);
            }
            if (TextUtils.isEmpty(liveBaseInfo.iconDesc) && TextUtils.isEmpty(liveBaseInfo.iconUrl)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.j && !TextUtils.isEmpty(liveBaseInfo.liveSimpleDesc)) {
                this.c.setVisibility(0);
                this.f.setText(liveBaseInfo.liveSimpleDesc);
                if (this.g == null) {
                    this.g = a();
                }
                this.b.setBackground(this.g);
                return;
            }
            this.c.setVisibility(8);
            if (this.h == null) {
                this.h = b();
            }
            this.b.setBackground(this.h);
        }
    }

    public void setRightContentBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafa400c1314768a1badf9d98bdf8769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafa400c1314768a1badf9d98bdf8769");
            return;
        }
        this.i = drawable;
        this.c.setBackground(drawable);
    }

    private Drawable a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f7c066d011d51710676ff9e87e3fbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f7c066d011d51710676ff9e87e3fbf");
        }
        Context context = getContext();
        int a2 = h.a(context, 4.0f);
        e.a aVar = new e.a();
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        int[] iArr = {context.getResources().getColor(R.color.wm_sc_nox_search_color_FF6F2A), context.getResources().getColor(R.color.wm_sc_nox_search_color_FF154A)};
        float f = a2;
        return aVar.a(orientation, iArr).a(f, 0.0f, 0.0f, f).a();
    }

    private Drawable b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349f3c4c055ee77fbb1871af6e63f051", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349f3c4c055ee77fbb1871af6e63f051");
        }
        Context context = getContext();
        return new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{context.getResources().getColor(R.color.wm_sc_nox_search_color_FF6F2A), context.getResources().getColor(R.color.wm_sc_nox_search_color_FF154A)}).a(h.a(context, 4.0f)).a();
    }
}
