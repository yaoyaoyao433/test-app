package com.sankuai.waimai.business.restaurant.base.widget.imagepreview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.meituan.roodesign.widgets.label.RooLabel;
import com.sankuai.waimai.business.restaurant.base.log.d;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.j;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.platform.widget.CommentTextView;
import com.sankuai.waimai.platform.widget.HorizontalFlowLayout;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements a<Comment>, com.sankuai.waimai.foundation.core.service.user.b {
    public static ChangeQuickRedirect a;
    public ArrayList<e> A;
    public com.sankuai.waimai.business.restaurant.base.interfaces.a B;
    private boolean C;
    private TextView D;
    private HorizontalFlowLayout E;
    public final Activity b;
    public String c;
    public ab d;
    public g e;
    public j f;
    public View g;
    public View h;
    public TextView i;
    public FrameLayout j;
    public TextView k;
    public TextView l;
    public TextView m;
    public CommentTextView n;
    public ImageView o;
    public ImageView p;
    public FrameLayout q;
    public ImageView r;
    LottieAnimationView s;
    public TextView t;
    HashMap<String, com.airbnb.lottie.e> u;
    public int v;
    public View w;
    public View x;
    public int y;
    boolean z;

    public c(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e029b6a78b923d718a8a851db62440", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e029b6a78b923d718a8a851db62440");
            return;
        }
        this.u = new HashMap<>();
        this.z = true;
        this.B = new com.sankuai.waimai.business.restaurant.base.interfaces.a() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.interfaces.a
            public final void a(Context context, final View view, String str, GoodsSpu goodsSpu) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
                Object[] objArr2 = {context, view, str, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4b452abca7e788c3d70468855139375", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4b452abca7e788c3d70468855139375");
                } else if (context == null || goodsSpu == null) {
                } else {
                    k.a().a(c.this.b, str, goodsSpu, goodsSpu.getSkuList().get(0), goodsSpu.hasMultiSaleAttr ? goodsSpu.getAttrValuesArr() : null, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "93e0e818d0e6807f8ab5527ca9961b71", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "93e0e818d0e6807f8ab5527ca9961b71");
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1212a88c2573027bb581a908cc03b12", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1212a88c2573027bb581a908cc03b12");
                            } else if (view == null || c.this.d == null) {
                            } else {
                                c.this.d.a(view);
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                            Object[] objArr3 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5309c38ad510f6298cc02d1f2bf596bd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5309c38ad510f6298cc02d1f2bf596bd");
                                return;
                            }
                            if (c.this.b != null && !TextUtils.isEmpty(aVar.getMessage())) {
                                ae.a(c.this.b, aVar.getMessage());
                            }
                            i.d(new d().a("add_food").c(aVar.getMessage()).b());
                        }
                    });
                }
            }
        };
        this.b = activity;
        this.c = ((BaseActivity) this.b).w();
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        this.v = i;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a
    @NonNull
    public final View a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df600aafa7e4dd27e6b153202ec99388", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df600aafa7e4dd27e6b153202ec99388");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_comment_image_activity_preview_ugc_float, (ViewGroup) null);
        this.g = inflate;
        this.h = inflate.findViewById(R.id.ll_page_indicator);
        this.D = (TextView) inflate.findViewById(R.id.txt_image_index_cur);
        this.i = (TextView) inflate.findViewById(R.id.txt_image_index_total);
        this.j = (FrameLayout) inflate.findViewById(R.id.view_close_image_preview);
        this.k = (TextView) inflate.findViewById(R.id.tv_close_icon);
        this.l = (TextView) inflate.findViewById(R.id.view_recommend_image_preview);
        this.q = (FrameLayout) inflate.findViewById(R.id.container_useful_image_preview);
        this.r = (ImageView) inflate.findViewById(R.id.wm_comment_useful_image_preview);
        this.s = (LottieAnimationView) inflate.findViewById(R.id.wm_comment_useful_lottie_image_preview);
        this.t = (TextView) inflate.findViewById(R.id.txt_useful_image_preview);
        this.m = (TextView) inflate.findViewById(R.id.txt_user_name_image_preview);
        this.E = (HorizontalFlowLayout) inflate.findViewById(R.id.wm_comment_user_label_container_float);
        this.n = (CommentTextView) inflate.findViewById(R.id.txt_comment_content_image_preview);
        this.w = inflate.findViewById(R.id.comment_text_bg);
        this.x = inflate.findViewById(R.id.btn_container);
        this.p = (ImageView) inflate.findViewById(R.id.iv_btn_delete);
        this.o = (ImageView) inflate.findViewById(R.id.iv_btn_mute);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1abdaae24b43605c0183aeb59db8d510", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1abdaae24b43605c0183aeb59db8d510");
                } else {
                    c.this.b.onBackPressed();
                }
            }
        });
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22305acfaaa18876c4bdb669a1561ced", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22305acfaaa18876c4bdb669a1561ced");
                } else {
                    new RooAlertDialog.a(new ContextThemeWrapper(context, 2131558958)).b(R.string.wm_restaurant_gallery_delete_alert).a(R.string.wm_restaurant_delete, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.4.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "417c1630b39535df37af6331809df7f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "417c1630b39535df37af6331809df7f0");
                                return;
                            }
                            dialogInterface.dismiss();
                            if (context instanceof Activity) {
                                Intent intent = new Intent();
                                intent.putExtra("deleteIndex", c.this.y - 1);
                                ((Activity) context).setResult(-1, intent);
                                ((Activity) context).finish();
                            }
                        }
                    }).b(R.string.wm_restaurant_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.4.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bbe9a60d0a1cd2244fed2ef38b70a9f1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bbe9a60d0a1cd2244fed2ef38b70a9f1");
                            } else {
                                dialogInterface.dismiss();
                            }
                        }
                    }).b();
                }
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.imagepreview.c.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40bff861938c5daa977753b743b2f248", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40bff861938c5daa977753b743b2f248");
                } else {
                    c.this.b(true ^ c.this.z);
                }
            }
        });
        if (com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) context)) {
            ah.a(inflate.findViewById(R.id.fl_image_preview_actionbar), 0, com.sankuai.waimai.foundation.utils.g.e(context), 0, 0);
        }
        return inflate;
    }

    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2d549435d5f8843f664366ac7115ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2d549435d5f8843f664366ac7115ba");
            return;
        }
        if (this.o != null) {
            this.o.setSelected(z);
        }
        com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b bVar = new com.sankuai.waimai.business.restaurant.goodsdetail.videoview.b(1);
        this.z = z;
        bVar.c = this.z;
        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(bVar);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a7a6277d1a97940c4de2bee5e136da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a7a6277d1a97940c4de2bee5e136da");
        } else if (i == 66 && i2 == -1 && this.d != null) {
            this.d.p();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96927f455a5283508067b25a095046a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96927f455a5283508067b25a095046a1");
        } else if (this.d != null) {
            this.d.c();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcede8997faf6e000ea362b6a711132c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcede8997faf6e000ea362b6a711132c");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        if (this.d != null) {
            this.d.d();
        }
        if (this.f != null) {
            this.f.f();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a
    public final void a(boolean z) {
        this.C = z;
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c89338bc58a2498bc9abfd70ac4746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c89338bc58a2498bc9abfd70ac4746");
            return;
        }
        if (aVar == b.a.LOGIN && this.b != null && this.C && this.d != null) {
            this.d.q();
        }
        if (this.e != null) {
            k.a().n(this.e.f()).b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2540a95c43c6269f471354494fef6e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2540a95c43c6269f471354494fef6e8");
            return;
        }
        if (this.C && this.d != null) {
            this.d.p();
        }
        if (this.e != null) {
            k.a().n(this.e.f()).b();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.widget.imagepreview.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc078deb3f126d2a349dd6070097edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc078deb3f126d2a349dd6070097edc");
            return;
        }
        this.y = i;
        if (this.D != null) {
            this.D.setText(String.valueOf(i));
        }
        if (com.sankuai.waimai.foundation.utils.b.a(this.A) && this.y > 0 && this.A.get(this.y - 1).b == 1) {
            this.o.setVisibility(0);
            a(2.0f);
            return;
        }
        this.o.setVisibility(8);
        a(0.0f);
    }

    public void a(TextView textView, ImageView imageView, Comment comment) {
        String str;
        Object[] objArr = {textView, imageView, comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757a6c793a13d4e52236507ad64c3ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757a6c793a13d4e52236507ad64c3ed7");
            return;
        }
        if (comment.usefulCount <= 0) {
            str = "有用";
        } else if (comment.usefulCount > 999) {
            str = "有用 999+";
        } else {
            str = "有用 " + comment.usefulCount;
        }
        textView.setText(str);
        if (comment.isCurrentUserUseful) {
            textView.setTextColor(ColorUtils.a("#FF8000").intValue());
            imageView.setImageResource(R.drawable.wm_restaurant_ic_like_pressed);
            return;
        }
        textView.setTextColor(ColorUtils.a("#FFFFFF").intValue());
        imageView.setImageResource(R.drawable.wm_restaurant_ic_like_unpressed);
    }

    public void a(Comment comment) {
        View inflate;
        char c = 1;
        Object[] objArr = {comment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08b7bd3005b6a680106ac27b260399a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08b7bd3005b6a680106ac27b260399a");
            return;
        }
        this.E.removeAllViews();
        if (comment.userLabelList == null || comment.userLabelList.isEmpty()) {
            return;
        }
        for (Comment.b bVar : comment.userLabelList) {
            if (!TextUtils.isEmpty(bVar.b)) {
                HorizontalFlowLayout horizontalFlowLayout = this.E;
                HorizontalFlowLayout horizontalFlowLayout2 = this.E;
                Object[] objArr2 = new Object[2];
                objArr2[0] = horizontalFlowLayout2;
                objArr2[c] = bVar;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d336cb6ba5b92241b2b0107ebf43223c", RobustBitConfig.DEFAULT_VALUE)) {
                    inflate = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d336cb6ba5b92241b2b0107ebf43223c");
                } else {
                    inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_comment_user_label, (ViewGroup) horizontalFlowLayout2, false);
                    RooLabel rooLabel = (RooLabel) inflate.findViewById(R.id.roo_label);
                    rooLabel.setText(bVar.b);
                    if (bVar.c == 1) {
                        rooLabel.setBackgroundColor(ColorUtils.a("#4E4E4E").intValue());
                        rooLabel.setTextColor(ColorUtils.a("#F5E1CE").intValue());
                        rooLabel.setIconSize(com.sankuai.waimai.foundation.utils.g.a(this.b, 10.0f));
                        rooLabel.setIconResource(R.drawable.wm_restaurant_comment_vip_icon);
                        rooLabel.setIconPadding(com.sankuai.waimai.foundation.utils.g.a(this.b, 3.0f));
                    } else {
                        rooLabel.setBackgroundColor(ColorUtils.a("#FFCC33").intValue());
                        rooLabel.setTextColor(ColorUtils.a("#222426").intValue());
                    }
                }
                horizontalFlowLayout.addView(inflate);
                c = 1;
            }
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3319aecabaf386f96667d0423afb870e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3319aecabaf386f96667d0423afb870e");
        } else if (this.w != null) {
            ah.a(this.w, 0, 0, 0, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, f));
        }
    }
}
