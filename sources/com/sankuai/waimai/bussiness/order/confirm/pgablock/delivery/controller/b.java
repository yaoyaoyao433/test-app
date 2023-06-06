package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private TextView A;
    private a B;
    Activity b;
    View c;
    TextView d;
    String e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private LinearLayout j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private LinearLayout r;
    private LinearLayout s;
    private TextView t;
    private TextView u;
    private LinearLayout v;
    private RelativeLayout w;
    private TextView x;
    private RooButton y;
    private TextView z;

    public b(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3316b14652e746860874b484cc375b20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3316b14652e746860874b484cc375b20");
            return;
        }
        this.b = activity;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "220fcf2e67694c95ac6d04849bb903ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "220fcf2e67694c95ac6d04849bb903ae");
        } else {
            this.r = (LinearLayout) view.findViewById(R.id.layout_cur_address);
        }
        Object[] objArr3 = {view};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ab93ccbcc00137cf979be719176a7d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ab93ccbcc00137cf979be719176a7d4");
        } else {
            this.f = (TextView) view.findViewById(R.id.txt_name);
            this.g = (TextView) view.findViewById(R.id.txt_gender);
            this.h = (TextView) view.findViewById(R.id.txt_phone);
            this.d = (TextView) view.findViewById(R.id.txt_address);
            this.i = (TextView) view.findViewById(R.id.txt_address_tip);
            this.j = (LinearLayout) view.findViewById(R.id.ll_address_user_info);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_cabinet_pop_layout);
            this.x = (TextView) view.findViewById(R.id.txt_cabinet_pop_text);
            this.y = (RooButton) view.findViewById(R.id.btn_add_cabinet_address);
            this.z = (TextView) view.findViewById(R.id.img_cabinet_pop_close);
            this.A = (TextView) view.findViewById(R.id.txt_address_bottom_tips);
        }
        Object[] objArr4 = {view};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b7036a183b31e5fe629c520a3abe7ab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b7036a183b31e5fe629c520a3abe7ab0");
            return;
        }
        this.s = (LinearLayout) view.findViewById(R.id.layout_address_indicator);
        this.t = (TextView) view.findViewById(R.id.txt_empty_address_indicator);
        this.u = (TextView) view.findViewById(R.id.txt_new_address_indicator);
        this.v = (LinearLayout) view.findViewById(R.id.txt_empty_address_indicator_ll);
        this.c = view.findViewById(R.id.layout_address_empty_tip);
        this.k = (TextView) view.findViewById(R.id.txt_empty_address_prefix);
        this.l = (TextView) view.findViewById(R.id.txt_empty_address);
        this.m = (TextView) view.findViewById(R.id.txt_empty_name);
        this.n = (TextView) view.findViewById(R.id.txt_empty_gender);
        this.o = (TextView) view.findViewById(R.id.txt_empty_phone);
        this.p = (TextView) view.findViewById(R.id.txt_address_empty_tip);
        this.q = (ImageView) view.findViewById(R.id.address_empty_tip_close_icon);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr5 = {view2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "31617c5c3532fb59f2549b4421d0419f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "31617c5c3532fb59f2549b4421d0419f");
                    return;
                }
                b.this.c.setVisibility(8);
                b.this.a(false);
            }
        });
    }

    public final void a(AddressItem addressItem, boolean z, boolean z2) {
        Object[] objArr = {addressItem, (byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd582b8cc5cdc2db9b95e4636137e9dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd582b8cc5cdc2db9b95e4636137e9dd");
        } else if (addressItem != null) {
            if (!TextUtils.isEmpty(addressItem.extraInfo)) {
                this.B = c(addressItem.extraInfo);
                if (this.B != null && this.B.a && !TextUtils.isEmpty(this.B.b)) {
                    ae.a(this.r, this.B.b);
                }
            }
            if (!TextUtils.isEmpty(addressItem.userName)) {
                this.f.setText(addressItem.userName);
                this.g.setText(StringUtil.SPACE + addressItem.gender);
                this.f.setVisibility(0);
                this.g.setVisibility(0);
            } else {
                this.f.setVisibility(8);
                this.g.setVisibility(8);
            }
            ah.a(this.h, b(addressItem.phone));
            if (addressItem.addrBrief != null) {
                String str = addressItem.addrBrief + StringUtil.SPACE + addressItem.addrBuildingNum;
                if (addressItem.addressType == 1) {
                    str = this.b.getString(R.string.wm_order_confirm_pick_up_address, new Object[]{str});
                }
                this.e = str;
                if (!TextUtils.isEmpty(addressItem.categoryIcon)) {
                    a(addressItem.categoryIcon);
                } else {
                    this.d.setText(this.e);
                }
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
            this.w.setVisibility(8);
            ah.a(this.A, addressItem.addressBottomTip);
            if (!TextUtils.isEmpty(addressItem.addressTip) && z2) {
                this.i.setVisibility(0);
                this.i.setText(addressItem.addressTip);
            } else {
                this.i.setVisibility(8);
            }
            this.j.setVisibility(addressItem.addressType == 0 ? 0 : 8);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b3e9561736bf8710cf064078dbfe71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b3e9561736bf8710cf064078dbfe71");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = str;
            a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aed447b4df19c7f5abacff6dfe3a0441", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aed447b4df19c7f5abacff6dfe3a0441");
                        return;
                    }
                    try {
                        if (b.this.d == null || TextUtils.isEmpty(b.this.e)) {
                            return;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(b.this.b.getResources(), bitmap);
                        int a3 = g.a(b.this.b, 18.0f);
                        bitmapDrawable.setBounds(0, 0, (int) (a3 * (bitmapDrawable.getIntrinsicWidth() / bitmapDrawable.getIntrinsicHeight())), a3);
                        com.sankuai.waimai.bussiness.order.base.style.a aVar = new com.sankuai.waimai.bussiness.order.base.style.a(bitmapDrawable);
                        SpannableString spannableString = new SpannableString("     " + b.this.e);
                        spannableString.setSpan(aVar, 0, 4, 33);
                        b.this.d.setText(spannableString);
                    } catch (Throwable unused) {
                        b.this.d.setText(b.this.e);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e496cd33184aae7becb63cd74e93f3f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e496cd33184aae7becb63cd74e93f3f9");
                    } else {
                        b.this.d.setText(b.this.e);
                    }
                }
            });
        }
    }

    public final void a(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f2ce9a8e0154762f5e51c56671f822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f2ce9a8e0154762f5e51c56671f822");
        } else if (addressItem != null) {
            if (!TextUtils.isEmpty(addressItem.extraInfo)) {
                this.B = c(addressItem.extraInfo);
                if (this.B != null && this.B.a && !TextUtils.isEmpty(this.B.b)) {
                    ae.a(this.r, this.B.b);
                }
            }
            if (!TextUtils.isEmpty(addressItem.userName)) {
                this.m.setText(addressItem.userName);
                this.m.setVisibility(0);
                if (!TextUtils.isEmpty(addressItem.gender)) {
                    TextView textView = this.n;
                    textView.setText(StringUtil.SPACE + addressItem.gender);
                    this.n.setVisibility(0);
                } else {
                    this.n.setVisibility(8);
                }
            } else {
                this.m.setVisibility(8);
                this.n.setVisibility(8);
            }
            ah.a(this.o, b(addressItem.phone));
            if (addressItem.addrBrief != null) {
                String str = addressItem.addrBrief;
                this.l.setText(str + StringUtil.SPACE + addressItem.addrBuildingNum);
                this.k.setVisibility(0);
                this.l.setVisibility(0);
            } else {
                this.k.setVisibility(8);
                this.l.setVisibility(8);
            }
            if (!TextUtils.isEmpty(addressItem.addressTip)) {
                this.p.setVisibility(0);
                this.p.setText(addressItem.addressTip);
                return;
            }
            this.p.setVisibility(8);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47b0aeb091be6b9d0500f3f3043124e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47b0aeb091be6b9d0500f3f3043124e");
        } else {
            this.p.setVisibility(8);
        }
    }

    public final String a() {
        return this.e != null ? this.e : "";
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129c59a1c2f9a92197ab5ff82f2d913f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129c59a1c2f9a92197ab5ff82f2d913f");
        }
        if (!TextUtils.isEmpty(str) && str.contains(CommonConstant.Symbol.UNDERLINE)) {
            return "+" + str.replaceAll(CommonConstant.Symbol.UNDERLINE, StringUtil.SPACE);
        }
        return str;
    }

    private a c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55522aeb9d27febe3b9b45b5754eea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55522aeb9d27febe3b9b45b5754eea5");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(str);
                aVar.a = jSONObject.optBoolean("hasBadWords");
                aVar.b = jSONObject.optString("hasBadWordsMsg");
                return aVar;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        boolean a;
        String b;

        public a() {
        }
    }
}
