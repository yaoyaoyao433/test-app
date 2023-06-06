package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.a;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.g;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.d;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.e;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a<FrameLayout> {
    public static ChangeQuickRedirect i;
    public a j;
    public a.InterfaceC0839a k;
    public a.InterfaceC0838a l;
    public a.InterfaceC0838a m;
    public a.InterfaceC0838a n;
    public a.InterfaceC0838a o;
    private b p;
    private b q;
    private b r;
    private b s;
    private b t;
    private g u;
    private JSONObject v;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c654728a3f322154caa1614dd19abaae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c654728a3f322154caa1614dd19abaae");
        } else if (d.a(context)) {
            this.b = (FrameLayout) e.a(context, R.layout.wm_restaurant_dy_shopping_btn);
        } else {
            this.b = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.wm_restaurant_dy_shopping_btn, (ViewGroup) null);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96126715a79ff0eacd8223de2c9f0d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96126715a79ff0eacd8223de2c9f0d5");
        } else if (jSONObject == null) {
        } else {
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c27c2fedf42ea06e0fd88a83e3ac5f5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c27c2fedf42ea06e0fd88a83e3ac5f5d");
            } else if (jSONObject != null) {
                try {
                    jSONObject.put("height", 40);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
            Object[] objArr3 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = i;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "296bcfc851a4a776a5c822bc310f3b65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "296bcfc851a4a776a5c822bc310f3b65");
            } else if (jSONObject.optBoolean("reset_margin_right", false)) {
                try {
                    jSONObject.put("margin_right", 0);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            super.a(jSONObject);
            this.v = jSONObject;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aaae1e0a00f8010bfb7ad5a9a01857b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aaae1e0a00f8010bfb7ad5a9a01857b");
            return;
        }
        super.b(jSONObject);
        if (jSONObject == null) {
            a(8);
            return;
        }
        int optInt = jSONObject.optInt("type");
        int optInt2 = jSONObject.optInt("ordered_goods_num");
        if (optInt == 0 || (optInt == 2 && optInt2 > 0)) {
            Context context = this.c;
            JSONObject jSONObject2 = this.v;
            Object[] objArr2 = {context, jSONObject2};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2baa59734add403c37516d003b4861bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2baa59734add403c37516d003b4861bd");
            } else {
                if (this.j == null) {
                    this.j = new a(context);
                    ((FrameLayout) this.b).addView(this.j.a());
                    if (jSONObject2 != null) {
                        this.j.a(jSONObject2.optJSONObject("add_button_style"));
                    }
                    a(this.j.a());
                }
                final a aVar = this.j;
                final a.InterfaceC0839a interfaceC0839a = this.k;
                Object[] objArr3 = {interfaceC0839a};
                ChangeQuickRedirect changeQuickRedirect3 = a.i;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d74cb3ab20554557cabfdddd5cf87e90", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d74cb3ab20554557cabfdddd5cf87e90");
                } else {
                    aVar.l.a(new a.InterfaceC0838a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a.InterfaceC0838a
                        public final void a(int i2, View view) {
                            Object[] objArr4 = {-1, view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "997b44a1292548b815f07f6faf05ed03", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "997b44a1292548b815f07f6faf05ed03");
                            } else if (interfaceC0839a != null) {
                                interfaceC0839a.a(view);
                            }
                        }
                    });
                    aVar.m.a(new a.InterfaceC0838a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a.InterfaceC0838a
                        public final void a(int i2, View view) {
                            Object[] objArr4 = {-1, view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8cac14c8caf1e2b7394722d68edd8ed3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8cac14c8caf1e2b7394722d68edd8ed3");
                            } else if (interfaceC0839a != null) {
                                interfaceC0839a.b(view);
                            }
                        }
                    });
                }
                if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                    try {
                        RelativeLayout a = this.j.a();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.getLayoutParams();
                        marginLayoutParams.rightMargin = com.sankuai.waimai.foundation.utils.g.a(a.getContext(), 15.0f);
                        marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(a.getContext(), 5.0f);
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            }
            this.j.b(jSONObject);
            a(this.q, this.p, this.r, this.s, this.u, this.t);
        } else if (optInt == 1) {
            Context context2 = this.c;
            JSONObject jSONObject3 = this.v;
            Object[] objArr4 = {context2, jSONObject3};
            ChangeQuickRedirect changeQuickRedirect4 = i;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ac54d1b507421a803f66e92341a49eb5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ac54d1b507421a803f66e92341a49eb5");
            } else {
                if (this.p == null) {
                    this.p = new b(context2);
                    ((FrameLayout) this.b).addView(this.p.a());
                    if (jSONObject3 != null) {
                        JSONObject optJSONObject = jSONObject3.optJSONObject("sku_btn_style");
                        a(optJSONObject, "background_img", "background_img", R.drawable.wm_restaurant_dy_choose_sku_bg);
                        this.p.a(optJSONObject);
                    }
                    a(this.p.a());
                }
                this.p.a(this.l);
                if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                    try {
                        ConstraintLayout a2 = this.p.a();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                        marginLayoutParams2.rightMargin = com.sankuai.waimai.foundation.utils.g.a(a2.getContext(), 15.0f);
                        marginLayoutParams2.topMargin = com.sankuai.waimai.foundation.utils.g.a(a2.getContext(), 5.0f);
                    } catch (Exception e2) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e2);
                    }
                }
            }
            jSONObject.put("num_in_dot", optInt2);
            this.p.b(jSONObject);
            a(this.q, this.j, this.r, this.s, this.u, this.t);
        } else if (optInt == 2 && optInt2 == 0) {
            Context context3 = this.c;
            JSONObject jSONObject4 = this.v;
            Object[] objArr5 = {context3, jSONObject4};
            ChangeQuickRedirect changeQuickRedirect5 = i;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "074d228d50865acd71c6231764bea861", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "074d228d50865acd71c6231764bea861");
            } else {
                if (this.q == null) {
                    this.q = new b(context3);
                    ((FrameLayout) this.b).addView(this.q.a());
                    if (jSONObject4 != null) {
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("min_btn_style");
                        a(optJSONObject2, "icon_img", "left_icon_img", R.drawable.wm_restaurant_goods_card_add_icon);
                        a(optJSONObject2, "background_img", "background_img", R.drawable.wm_restaurant_dy_min_add_bg);
                        this.q.a(optJSONObject2);
                    }
                    a(this.q.a());
                }
                this.q.a(this.n);
                if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                    try {
                        ConstraintLayout a3 = this.q.a();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) a3.getLayoutParams();
                        marginLayoutParams3.rightMargin = com.sankuai.waimai.foundation.utils.g.a(a3.getContext(), 15.0f);
                        marginLayoutParams3.topMargin = com.sankuai.waimai.foundation.utils.g.a(a3.getContext(), 5.0f);
                    } catch (Exception e3) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e3);
                    }
                }
            }
            this.q.b(jSONObject);
            a(this.p, this.j, this.r, this.s, this.u, this.t);
        } else if (optInt == 3) {
            Context context4 = this.c;
            JSONObject jSONObject5 = this.v;
            Object[] objArr6 = {context4, jSONObject5};
            ChangeQuickRedirect changeQuickRedirect6 = i;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "70afe82edd4f388ce6ff63564666eac3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "70afe82edd4f388ce6ff63564666eac3");
            } else {
                if (this.r == null) {
                    this.r = new b(context4);
                    ((FrameLayout) this.b).addView(this.r.a());
                    if (jSONObject5 != null) {
                        JSONObject optJSONObject3 = jSONObject5.optJSONObject("unsale_btn_style");
                        a(optJSONObject3, "icon_img", "right_icon_img", R.drawable.wm_restaurant_dy_icon_question_mark);
                        this.r.a(optJSONObject3);
                    }
                    a(this.r.a());
                }
                this.r.a(this.m);
                if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                    try {
                        ConstraintLayout a4 = this.r.a();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) a4.getLayoutParams();
                        marginLayoutParams4.rightMargin = com.sankuai.waimai.foundation.utils.g.a(a4.getContext(), 15.0f);
                        marginLayoutParams4.topMargin = com.sankuai.waimai.foundation.utils.g.a(a4.getContext(), 6.0f);
                    } catch (Exception e4) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e4);
                    }
                }
            }
            this.r.b(jSONObject);
            a(this.p, this.j, this.q, this.s, this.u, this.t);
        } else if (optInt == 4) {
            Context context5 = this.c;
            JSONObject jSONObject6 = this.v;
            Object[] objArr7 = {context5, jSONObject6};
            ChangeQuickRedirect changeQuickRedirect7 = i;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5295d82a64ac4b4a82fd9ab740b30493", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5295d82a64ac4b4a82fd9ab740b30493");
            } else {
                if (this.s == null) {
                    this.s = new b(context5);
                    ((FrameLayout) this.b).addView(this.s.a());
                    if (jSONObject6 != null) {
                        this.s.a(jSONObject6.optJSONObject("soldout_btn_style"));
                    }
                    a(this.s.a());
                }
                if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                    try {
                        ConstraintLayout a5 = this.s.a();
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) a5.getLayoutParams();
                        marginLayoutParams5.rightMargin = com.sankuai.waimai.foundation.utils.g.a(a5.getContext(), 15.0f);
                        marginLayoutParams5.topMargin = com.sankuai.waimai.foundation.utils.g.a(a5.getContext(), 6.0f);
                    } catch (Exception e5) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e5);
                    }
                }
            }
            this.s.b(jSONObject);
            a(this.p, this.j, this.q, this.r, this.u, this.t);
        } else if (optInt == 5) {
            Context context6 = this.c;
            JSONObject jSONObject7 = this.v;
            Object[] objArr8 = {context6, jSONObject7};
            ChangeQuickRedirect changeQuickRedirect8 = i;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "43b3d1fc644e4e2de3458c6d84110d3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "43b3d1fc644e4e2de3458c6d84110d3f");
            } else if (this.u == null) {
                this.u = new g(context6);
                ((FrameLayout) this.b).addView(this.u.a());
                if (jSONObject7 != null) {
                    this.u.a(jSONObject7.optJSONObject("custom_btn_style"));
                }
                a(this.u.a());
            }
            this.u.b(jSONObject);
            a(this.p, this.j, this.q, this.r, this.s, this.t);
        } else if (optInt == 6) {
            Context context7 = this.c;
            JSONObject jSONObject8 = this.v;
            Object[] objArr9 = {context7, jSONObject8};
            ChangeQuickRedirect changeQuickRedirect9 = i;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "1bdec738a026ed8ae2a1b2d7624ad48e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "1bdec738a026ed8ae2a1b2d7624ad48e");
            } else {
                if (this.t == null) {
                    this.t = new b(context7);
                    ((FrameLayout) this.b).addView(this.t.a());
                    if (jSONObject8 != null) {
                        JSONObject optJSONObject4 = jSONObject8.optJSONObject("exchange_btn_style");
                        a(optJSONObject4, "background_img", "background_img", R.drawable.wm_restaurant_dy_min_add_bg);
                        this.t.a(optJSONObject4);
                    }
                    a(this.t.a());
                }
                this.t.a(this.o);
            }
            if (jSONObject.has("cover_show")) {
                jSONObject.remove("cover_show");
                jSONObject.put("cover_show", false);
            }
            this.t.b(jSONObject);
            a(this.p, this.j, this.q, this.r, this.u, this.s);
        } else if (optInt == -1) {
            a(8);
        }
        a(0);
    }

    private void a(JSONObject jSONObject, String str, String str2, @DrawableRes int i2) {
        Object[] objArr = {jSONObject, str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e7bb4eb08f90aea2d36d731fffbf78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e7bb4eb08f90aea2d36d731fffbf78");
        } else if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (optJSONObject != null) {
                    optJSONObject.put(ReactTextInputShadowNode.PROP_PLACEHOLDER, i2);
                    jSONObject.put(str2, optJSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac2585ad396460abbe85233ee0e9c16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac2585ad396460abbe85233ee0e9c16");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388629;
        }
    }

    private void a(com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a... aVarArr) {
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f91ba9f4014c1b458d09e7abf5bbe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f91ba9f4014c1b458d09e7abf5bbe1");
            return;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a aVar = aVarArr[i2];
            if (aVar != null) {
                aVar.a(8);
            }
        }
    }
}
