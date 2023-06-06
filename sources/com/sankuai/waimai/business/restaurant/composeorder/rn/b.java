package com.sankuai.waimai.business.restaurant.composeorder.rn;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.e;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private View b;
    private View c;
    private ImageView d;
    private ImageView e;
    private boolean f;
    private View g;
    private Activity h;
    private String i;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1723a73d2932755627870d02febfd85f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1723a73d2932755627870d02febfd85f");
        } else if (bVar.h != null) {
            ae.a(bVar.h, bVar.h.getResources().getString(R.string.wm_restaurant_share_failed));
        }
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e3ac8981d2d438120a4f14807dd1e943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e3ac8981d2d438120a4f14807dd1e943");
        } else if (bVar.h != null) {
            ae.a(bVar.h, bVar.h.getResources().getString(R.string.wm_restaurant_share_success));
        }
    }

    public b(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2fdac19b6a21253c11161f18621a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2fdac19b6a21253c11161f18621a87");
            return;
        }
        this.f = false;
        this.i = str;
        try {
            if (context instanceof ao) {
                this.h = ((ao) context).getCurrentActivity();
                if (this.h != null) {
                    this.f = com.sankuai.waimai.share.b.a(this.h);
                }
            }
        } catch (Exception unused) {
        }
        setUpViews(context);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98cb1d37625517cf3785c0562bea777f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98cb1d37625517cf3785c0562bea777f");
        } else {
            this.b.setOnClickListener(this);
            this.c.setOnClickListener(this);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5bba21e5ff17ec969caef20cf430d1c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5bba21e5ff17ec969caef20cf430d1c1");
        } else if (this.f) {
            this.d.setImageResource(R.drawable.wm_restaurant_common_icon_weixin_friends_logo);
            this.e.setImageResource(R.drawable.wm_restaurant_common_icon_weixin_circle_logo);
        } else {
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = getContext();
            c.c = "http://p0.meituan.net/scarlett/68751897fa2985df387c1e759bbd3fca1297.png";
            c.a(this.d);
            b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
            c2.b = getContext();
            c2.c = "http://p1.meituan.net/scarlett/fc6e8b42f11e105d69152ed5ee72e0991308.png";
            c2.a(this.e);
        }
    }

    private void setUpViews(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ef4b71684c8059a998d587c8748cc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ef4b71684c8059a998d587c8748cc1");
            return;
        }
        this.g = LayoutInflater.from(context).inflate(R.layout.wm_restaurant_rn_we_chat_share_channel_layout, (ViewGroup) this, false);
        addView(this.g, -1, -1);
        this.b = this.g.findViewById(R.id.we_chat_friends_btn);
        this.c = this.g.findViewById(R.id.we_chat_moments_btn);
        this.d = (ImageView) this.b.findViewById(R.id.iv_we_chat_friends_logo);
        this.e = (ImageView) this.c.findViewById(R.id.iv_we_chat_moments_logo);
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3681add8dc921057e4cb3193e7f1e0ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3681add8dc921057e4cb3193e7f1e0ff");
            return;
        }
        super.onMeasure(i, i2);
        this.g.measure(i, i2);
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2711bb16d314967b15406ae9f47f5b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2711bb16d314967b15406ae9f47f5b3e");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.g.layout(i, i2, i3, i4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabfa19244b332d99e6c76db83c8a64c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabfa19244b332d99e6c76db83c8a64c");
        } else if (this.h == null) {
        } else {
            int id = view.getId();
            if (id == R.id.we_chat_friends_btn) {
                a(2);
                JudasManualManager.a a2 = JudasManualManager.a("b_opZUG").a("channel_id", 2).a("c_tyr53cg");
                a2.b = this.i;
                a2.a();
            } else if (id == R.id.we_chat_moments_btn) {
                a(1);
                JudasManualManager.a a3 = JudasManualManager.a("b_opZUG").a("channel_id", 1).a("c_tyr53cg");
                a3.b = this.i;
                a3.a();
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9a5eecab215ed2e389d72b250bb757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9a5eecab215ed2e389d72b250bb757");
            return;
        }
        View shareTargetView = getShareTargetView();
        if (shareTargetView != null) {
            a(i, shareTargetView);
        }
    }

    private View getShareTargetView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f0301fe6f7144de9fdd47873e228f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f0301fe6f7144de9fdd47873e228f7");
        }
        List<View> a2 = a(this.h.getWindow().getDecorView());
        if (com.sankuai.waimai.foundation.utils.b.a(a2)) {
            for (View view : a2) {
                if (view instanceof e) {
                    return ((e) view).getChildAt(0);
                }
            }
            return null;
        }
        return null;
    }

    private List<View> a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255a4076b285d3a2121c6327aba85120", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255a4076b285d3a2121c6327aba85120");
        }
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(a(childAt));
            }
        }
        return arrayList;
    }

    private void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5ab4ade3281addad38b236d7729ae7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5ab4ade3281addad38b236d7729ae7");
        } else if (!this.f && this.h != null) {
            ae.a(this.h, this.h.getResources().getString(R.string.wm_restaurant_we_chat_not_installed));
        } else {
            com.sankuai.waimai.share.b.a(this.h, a.a(view, g.a(com.meituan.android.singleton.b.a, 10.0f), 600.0f), i, 8, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.business.restaurant.composeorder.rn.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                public final void a(int i2, int i3) {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb3f6e64bba40185e92b814e1fb0c11a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb3f6e64bba40185e92b814e1fb0c11a");
                    } else if (i3 != 1) {
                        b.a(b.this);
                    } else {
                        b.b(b.this);
                    }
                }
            }, "c_tyr53cg");
        }
    }
}
