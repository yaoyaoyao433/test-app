package com.sankuai.waimai.store.drug.consultation;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.store.im.base.j;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.im.entrance.drug.view.c {
    public static ChangeQuickRedirect a;
    j b;
    HashMap<String, Object> c;
    com.sankuai.waimai.store.im.entrance.drug.view.d d;
    private ImageView e;
    private ViewGroup f;
    private ViewGroup g;
    private TextView h;
    private int i;
    private String j;
    private int k;
    private View l;
    private TextView m;
    private ImageView n;

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final void c() {
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final void d() {
    }

    public b(@NonNull Context context, @NonNull String str, @Nullable j jVar) {
        super(context);
        Object[] objArr = {context, str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad00f87bf49f9a0b3ec140e7e38e6df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad00f87bf49f9a0b3ec140e7e38e6df");
            return;
        }
        this.i = 0;
        this.c = new HashMap<>();
        this.j = str;
        this.b = jVar;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "005fe1ca9349350ab7bd4885391a9df0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "005fe1ca9349350ab7bd4885391a9df0") : createView(viewGroup);
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final boolean a(@Nullable final DrugImEntranceEntity drugImEntranceEntity, int i, long j, String str, String str2) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {drugImEntranceEntity, Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b25d3256f1de24dac547216fe9b1584", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b25d3256f1de24dac547216fe9b1584")).booleanValue();
        }
        this.k = i;
        Object[] objArr2 = {drugImEntranceEntity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a46a60c5e97330648c3c8d7b16ca65e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a46a60c5e97330648c3c8d7b16ca65e2");
        } else {
            HashMap<String, Object> hashMap = this.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2a99f5d7201ffa20e7580a425e6d266", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2a99f5d7201ffa20e7580a425e6d266")).booleanValue();
            } else {
                z = this.h.getVisibility() == 0;
            }
            hashMap.put("new_message_badge", Integer.valueOf(z ? 1 : 0));
            this.c.put("cat_id", TextUtils.isEmpty(this.j) ? -999 : this.j);
            this.c.put("stid", (drugImEntranceEntity == null || TextUtils.isEmpty(drugImEntranceEntity.stid)) ? -999 : drugImEntranceEntity.stid);
            this.c.put("status", -999);
            if (drugImEntranceEntity != null && !TextUtils.isEmpty(drugImEntranceEntity.scheme)) {
                this.c.put("source_type", Integer.valueOf(af.a(Uri.parse(drugImEntranceEntity.scheme), "pageSource", this.k)));
            }
        }
        Object[] objArr4 = {drugImEntranceEntity};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8a99e411c3a5452d4b0ae5d94dfcfd01", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8a99e411c3a5452d4b0ae5d94dfcfd01")).booleanValue();
        } else if (drugImEntranceEntity == null || TextUtils.isEmpty(drugImEntranceEntity.text)) {
            u.c(this.mView);
            z2 = false;
        } else {
            u.a(this.mView);
            if (TextUtils.isEmpty(drugImEntranceEntity.subscriptUrl)) {
                u.c(this.n);
            } else {
                m.d(drugImEntranceEntity.subscriptUrl, h.a(this.mContext, 15.0f)).a(this.n);
            }
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
            this.h.setBackground(new e.a().a(dimensionPixelSize).c(this.mContext.getResources().getColor(R.color.wm_sg_color_FF4A26)).e(dimensionPixelSize).a());
            this.l.setBackground(new e.a().a(h.a(this.mContext, 8.0f)).c(this.mContext.getResources().getColor(R.color.wm_sg_color_00CFB1)).e(dimensionPixelSize).a());
            m.b(drugImEntranceEntity.icon).a(this.e);
            if (drugImEntranceEntity.text != null) {
                u.a(this.m, drugImEntranceEntity.text);
            }
            this.i = h.a(this.mContext, 45.0f);
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            layoutParams.width = r0;
            this.g.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
            layoutParams2.width = r0;
            this.f.setLayoutParams(layoutParams2);
            getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.consultation.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "32176ffc90f0e008252b2ffb5651577a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "32176ffc90f0e008252b2ffb5651577a");
                        return;
                    }
                    if (b.this.b != null) {
                        b.this.b.a(b.this.c);
                    }
                    if (b.this.d != null) {
                        com.sankuai.waimai.store.router.d.a(b.this.mContext, drugImEntranceEntity.scheme);
                    }
                }
            });
        }
        if (z2 && this.b != null) {
            this.b.a(drugImEntranceEntity, 0, this.c);
        }
        return z2;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final int a() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.a
    public final ViewGroup b() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05505d714e94673f4f74a1c20b5d837", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05505d714e94673f4f74a1c20b5d837");
        }
        this.g = (ViewGroup) viewGroup.findViewById(R.id.layout_drug_im_entrance_container);
        this.f = (ViewGroup) viewGroup.findViewById(R.id.layout_drug_im_entrance);
        View findViewById = viewGroup.findViewById(R.id.wm_sg_drug_im_entrance_new);
        View findViewById2 = viewGroup.findViewById(R.id.wm_sg_drug_im_entrance);
        u.a(findViewById);
        u.c(findViewById2);
        this.e = (ImageView) viewGroup.findViewById(R.id.drug_im_iv_doctor);
        this.h = (TextView) viewGroup.findViewById(R.id.drug_im_tv_unread_count);
        this.l = viewGroup.findViewById(R.id.drug_im_ll_bottom);
        this.m = (TextView) viewGroup.findViewById(R.id.drug_im_tv_bottom);
        this.n = (ImageView) viewGroup.findViewById(R.id.drug_im_entrance_tag_area);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "777d80a8d0bb3543a8a01eb18013a150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "777d80a8d0bb3543a8a01eb18013a150");
        } else {
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_7);
            this.h.setBackground(new e.a().a(dimensionPixelSize).c(this.mContext.getResources().getColor(R.color.wm_sg_color_f23333)).e(dimensionPixelSize).a());
            this.h.setVisibility(8);
        }
        return viewGroup;
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.view.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37df9e7d0abbc6d0fd723204787dd6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37df9e7d0abbc6d0fd723204787dd6e");
        } else if (this.h != null) {
            if (i <= 0) {
                u.c(this.h);
                u.a(this.n);
                return;
            }
            u.c(this.n);
            u.a(this.h);
            this.h.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }
}
