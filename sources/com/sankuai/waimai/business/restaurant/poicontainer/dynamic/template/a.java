package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.template;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.ui.d;
import com.sankuai.waimai.business.restaurant.base.ui.e;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.g;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.c;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.a;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements e {
    public static ChangeQuickRedirect a;
    private static final String m = a.class.getCanonicalName();
    public String b;
    private g c;
    private Context d;
    private com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.a e;
    private b f;
    private View g;
    private LinearLayout h;
    private d i;
    private c.a j;
    private boolean k;
    private int l;
    private View n;

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8a6975d6a65854b6a64d784f519e8778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8a6975d6a65854b6a64d784f519e8778");
            return;
        }
        a.C0849a c0849a = new a.C0849a();
        c0849a.a = aVar.l;
        c0849a.b = str;
        com.sankuai.waimai.business.restaurant.poicontainer.utils.a.a(m, c0849a);
    }

    public a(@NonNull Context context, View view, c.a aVar, String str) {
        Object[] objArr = {context, view, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe9e962b9da3e819e0a42f89f05524b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe9e962b9da3e819e0a42f89f05524b0");
            return;
        }
        this.c = g.c();
        this.e = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.a();
        this.d = context;
        this.f = new b();
        this.g = view;
        this.j = aVar;
        this.b = str;
        b();
    }

    public void b() {
        View inflate;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55b688a03bea9710b3920e59fe9de4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55b688a03bea9710b3920e59fe9de4f");
            return;
        }
        try {
            ((ViewGroup) this.g).removeAllViews();
            this.e.a();
            String str = this.b;
            Context context = this.d;
            View view = this.g;
            JSONObject jSONObject = this.c.a(str).e;
            if (jSONObject == null) {
                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(str, 20003, "dynamic layout not found");
                return;
            }
            int a2 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.c.a(jSONObject.optString("layout_template", ""));
            if (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.d.a(context)) {
                inflate = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.e.a(context, a2);
            } else {
                inflate = LayoutInflater.from(context).inflate(a2, (ViewGroup) view, false);
            }
            if (com.sankuai.waimai.platform.utils.d.a(context)) {
                inflate = com.sankuai.waimai.platform.base.c.a(inflate, context, this);
            }
            ((ViewGroup) view).addView(inflate);
            JSONObject optJSONObject = jSONObject.optJSONObject("style");
            if (optJSONObject == null) {
                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(this.b, IjkMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER, "styles json parse null");
                return;
            }
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a.a((float) optJSONObject.optDouble("gray_alpha", 0.5d));
            a(optJSONObject, (ViewGroup) inflate.findViewById(R.id.layout_food_img));
            b(optJSONObject, (ViewGroup) inflate.findViewById(R.id.layout_food_info));
            this.h = (LinearLayout) inflate.findViewById(R.id.layout_package_container);
            this.i = new d(context, this.h);
            if (this.c.b(str)) {
                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(str);
            } else if (TextUtils.isEmpty(str)) {
                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(str, IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, "dynamic id is null");
            } else if ("7.36_decision_info".equals(str)) {
            } else {
                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(str, IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, "dynamic id unavailable");
            }
        } catch (Exception e) {
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log.b.a(this.b, 20005, e.getMessage());
        }
    }

    private void a(JSONObject jSONObject, ViewGroup viewGroup) {
        Object[] objArr = {jSONObject, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69319fdae73fd177a3b119ee0177987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69319fdae73fd177a3b119ee0177987");
        } else if (viewGroup == null) {
        } else {
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a a2 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.b.a(this.d, "food_img_style", jSONObject.optJSONObject("food_img_style"));
            viewGroup.addView(a2.a(), new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) a2.a().getLayoutParams()));
            this.e.a(a2.c(), a2);
        }
    }

    private void b(JSONObject jSONObject, ViewGroup viewGroup) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5791b261c1da3a739151c3f47ebb6095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5791b261c1da3a739151c3f47ebb6095");
        } else if (viewGroup == null || (optJSONObject = jSONObject.optJSONObject("food_info_style")) == null) {
        } else {
            a(optJSONObject, viewGroup, c(optJSONObject, viewGroup));
        }
    }

    private ViewGroup c(JSONObject jSONObject, ViewGroup viewGroup) {
        Object[] objArr = {jSONObject, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47dcdafea9a7b61b426dbeab951993ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47dcdafea9a7b61b426dbeab951993ab");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.layout_button);
        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.c b = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.b.b(this.d, "add_btn_style", jSONObject.optJSONObject("food_button_list"));
        this.e.a(b.c(), b);
        viewGroup2.addView(b.a(), new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) b.a().getLayoutParams()));
        return viewGroup2;
    }

    private ViewGroup a(JSONObject jSONObject, ViewGroup viewGroup, ViewGroup viewGroup2) {
        Object[] objArr = {jSONObject, viewGroup, viewGroup2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ca1b3afc5ba5dbfec8eaf0e1b4d249", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ca1b3afc5ba5dbfec8eaf0e1b4d249");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("food_info_list");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return viewGroup;
        }
        ViewGroup a2 = a(jSONObject);
        viewGroup.addView(a2);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a a3 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.b.a(this.d, optJSONObject.optString("component", "View"), optJSONObject.optJSONObject("style"));
                this.e.a(a3.c(), a3);
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("child");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a a4 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.b.a(this.d, optJSONObject2.optString("component"), optJSONObject2.optJSONObject("style"));
                        a3.a(a4);
                        this.e.a(a4.c(), a4);
                    }
                }
                if (this.f.a(a3)) {
                    this.f.a(a3, viewGroup2);
                    z = true;
                }
                if (z) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) a3.a().getLayoutParams());
                    layoutParams.addRule(3, viewGroup.getChildAt((i2 - i) + 1).getId());
                    if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                        layoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(this.g.getContext(), 10.0f);
                    }
                    viewGroup.addView(a3.a(), layoutParams);
                } else {
                    i++;
                    a2.addView(a3.a(), new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) a3.a().getLayoutParams()));
                }
            }
        }
        return viewGroup;
    }

    private ViewGroup a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19946436621f2fd42f6cefee55460f40", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19946436621f2fd42f6cefee55460f40");
        }
        int optInt = jSONObject.optInt("content_min_height", 0);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setId(View.generateViewId());
        linearLayout.setMinimumHeight(com.sankuai.waimai.foundation.utils.g.a(this.d, optInt));
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:101:0x02ce
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.sankuai.waimai.business.restaurant.base.ui.e
    public final void a(com.sankuai.waimai.platform.domain.core.goods.GoodsSpu r37, boolean r38, com.sankuai.waimai.business.restaurant.base.manager.order.g r39, int r40, com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.template.a.a(com.sankuai.waimai.platform.domain.core.goods.GoodsSpu, boolean, com.sankuai.waimai.business.restaurant.base.manager.order.g, int, com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a$a, boolean):void");
    }

    @Override // com.sankuai.waimai.business.restaurant.base.ui.e
    public final View a() {
        if (this.n != null) {
            return this.n;
        }
        return this.g;
    }
}
