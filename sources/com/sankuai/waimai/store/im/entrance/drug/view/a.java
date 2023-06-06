package com.sankuai.waimai.store.im.entrance.drug.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
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
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.base.j;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b implements c {
    public static ChangeQuickRedirect a;
    int b;
    long c;
    String d;
    String e;
    j f;
    HashMap<String, Object> g;
    d h;
    private ImageView i;
    private LinearLayout j;
    private ViewGroup k;
    private ViewGroup l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private int r;
    private String s;
    private Drawable t;
    private boolean u;

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final void c() {
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final void d() {
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6b0188021faa86335a32e0d8e8448737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6b0188021faa86335a32e0d8e8448737");
            return;
        }
        if ("1".equals(ab.b().b(aVar.mContext, "key_drug_new_user_tip_red_point", "1"))) {
            ab.b().a(aVar.mContext, "key_drug_new_user_tip_red_point", "0");
        }
        aVar.a(false);
    }

    public a(@NonNull Context context, @NonNull String str, @Nullable j jVar) {
        super(context);
        Object[] objArr = {context, str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114f353ec04a708c7c09bc2880cbaa06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114f353ec04a708c7c09bc2880cbaa06");
            return;
        }
        this.r = 0;
        this.g = new HashMap<>();
        this.s = str;
        this.f = jVar;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633b2f13c145f78b2533cf48c790959d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633b2f13c145f78b2533cf48c790959d") : createView(viewGroup);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final boolean a(@Nullable DrugImEntranceEntity drugImEntranceEntity, int i, long j, String str, String str2) {
        boolean z;
        boolean z2;
        int i2;
        int length;
        Object[] objArr = {drugImEntranceEntity, Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45796ba7a69affe30555b2a52d5a7973", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45796ba7a69affe30555b2a52d5a7973")).booleanValue();
        }
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = str2;
        Object[] objArr2 = {drugImEntranceEntity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a62f393791bbbd575896588687879966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a62f393791bbbd575896588687879966");
        } else {
            HashMap<String, Object> hashMap = this.g;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21edf673a2cbb21d5267ad07ed3ecf3a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21edf673a2cbb21d5267ad07ed3ecf3a")).booleanValue();
            } else {
                z = this.o.getVisibility() == 0;
            }
            hashMap.put("new_message_badge", Integer.valueOf(z ? 1 : 0));
            this.g.put("cat_id", TextUtils.isEmpty(this.s) ? -999 : this.s);
            this.g.put("stid", (drugImEntranceEntity == null || TextUtils.isEmpty(drugImEntranceEntity.stid)) ? -999 : drugImEntranceEntity.stid);
            this.g.put("status", -999);
        }
        Object[] objArr4 = {drugImEntranceEntity};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9a1f2e1d3135db6b90047ea5717a0539", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9a1f2e1d3135db6b90047ea5717a0539")).booleanValue();
        } else if (drugImEntranceEntity == null || TextUtils.isEmpty(drugImEntranceEntity.text)) {
            u.c(this.mView);
            z2 = false;
        } else {
            u.a(this.mView);
            if (!TextUtils.isEmpty(drugImEntranceEntity.subscript)) {
                if (this.t == null) {
                    float dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
                    i2 = 2;
                    this.t = new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.sankuai.shangou.stone.util.d.a("#FFC400", -1), com.sankuai.shangou.stone.util.d.a("#FF8D00", -1)}).a(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f).a();
                } else {
                    i2 = 2;
                }
                this.p.setBackground(this.t);
                this.p.setVisibility(0);
                this.p.setText(drugImEntranceEntity.subscript);
            } else {
                i2 = 2;
                this.p.setVisibility(8);
            }
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
            this.o.setBackground(new e.a().a(dimensionPixelSize2).c(this.mContext.getResources().getColor(R.color.wm_sg_color_FF4A26)).e(dimensionPixelSize2).a());
            this.u = drugImEntranceEntity.showNewUserRedPoint;
            a(this.u);
            m.b(drugImEntranceEntity.icon).a(this.i);
            if (drugImEntranceEntity.text != null && (length = drugImEntranceEntity.text.length()) != 1) {
                int i3 = length % 2;
                if (i3 == 0) {
                    int i4 = length / 2;
                    String substring = drugImEntranceEntity.text.substring(0, i4);
                    String substring2 = drugImEntranceEntity.text.substring(i4, length);
                    this.m.setText(substring);
                    this.n.setText(substring2);
                    this.n.setCompoundDrawables(null, null, null, null);
                } else if (i3 != 0) {
                    int i5 = (length + 1) / i2;
                    String substring3 = drugImEntranceEntity.text.substring(0, i5);
                    String substring4 = drugImEntranceEntity.text.substring(i5, length);
                    this.m.setText(substring3);
                    this.n.setText(substring4);
                    Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.wm_sg_drug_im_entrance_arrow);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth());
                    this.n.setCompoundDrawables(null, null, drawable, null);
                }
            }
            float measureText = this.m.getPaint().measureText((String) this.m.getText());
            ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
            layoutParams.width = (int) measureText;
            this.j.setLayoutParams(layoutParams);
            this.r = (int) (h.a(this.mContext, 45.0f) + measureText);
            ViewGroup.LayoutParams layoutParams2 = this.l.getLayoutParams();
            int a2 = (int) (measureText + h.a(this.mContext, 57.0f));
            layoutParams2.width = a2;
            this.l.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.k.getLayoutParams();
            layoutParams3.width = a2;
            this.k.setLayoutParams(layoutParams3);
            z2 = true;
        }
        if (z2 && this.f != null) {
            this.f.a(drugImEntranceEntity, 0, this.g);
        }
        return z2;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final int a() {
        return this.r;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final ViewGroup b() {
        return this.k;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55816c2b723372c9e100ea1497dcd389", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55816c2b723372c9e100ea1497dcd389");
        }
        this.l = (ViewGroup) viewGroup.findViewById(R.id.layout_drug_im_entrance_container);
        this.k = (ViewGroup) viewGroup.findViewById(R.id.layout_drug_im_entrance);
        this.i = (ImageView) viewGroup.findViewById(R.id.iv_drug_enter);
        this.m = (TextView) viewGroup.findViewById(R.id.tv_drug_enter_line1);
        this.n = (TextView) viewGroup.findViewById(R.id.tv_drug_enter_line2);
        this.o = (TextView) viewGroup.findViewById(R.id.tv_unread_count);
        this.q = (TextView) viewGroup.findViewById(R.id.tv_new_user_red_point);
        this.j = (LinearLayout) viewGroup.findViewById(R.id.iv_drug_title);
        this.p = (TextView) viewGroup.findViewById(R.id.tv_time_tag_24);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.entrance.drug.view.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "753a8f6ca97a2e5b236757a167338ad3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "753a8f6ca97a2e5b236757a167338ad3");
                    return;
                }
                if (a.this.f != null) {
                    a.this.f.a(a.this.g);
                }
                if (a.this.h != null) {
                    a.this.h.a(a.this.b, a.this.c, a.this.d, a.this.e);
                }
                a.a(a.this);
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fe5f5ebac48657821c8f0f423e76a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fe5f5ebac48657821c8f0f423e76a64");
        } else {
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
            this.o.setBackground(new e.a().a(dimensionPixelSize).c(this.mContext.getResources().getColor(R.color.wm_sg_color_f23333)).e(dimensionPixelSize).a());
            this.o.setVisibility(8);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c85cba07bdf7620f75affe9233ddfed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c85cba07bdf7620f75affe9233ddfed");
        } else {
            this.q.setBackground(new e.a().a(this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10)).c(this.mContext.getResources().getColor(R.color.wm_sg_color_FF4A26)).a());
            u.c(this.q);
        }
        return viewGroup;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.view.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2dd2bf3c3832c6c648f28d6ff803fbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2dd2bf3c3832c6c648f28d6ff803fbe");
        } else if (this.o != null) {
            if (i <= 0) {
                u.c(this.o);
                a(this.u);
                return;
            }
            u.a(this.o);
            a(false);
            this.o.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a6eea210a2c05ed2fc30f419b7a70e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a6eea210a2c05ed2fc30f419b7a70e");
        } else if (!z) {
            u.c(this.q);
        } else if (this.o == null || this.o.getVisibility() == 0) {
            u.c(this.q);
        } else if ("1".equals(ab.b().b(this.mContext, "key_drug_new_user_tip_red_point", "1"))) {
            u.a(this.q);
        } else {
            u.c(this.q);
        }
    }
}
