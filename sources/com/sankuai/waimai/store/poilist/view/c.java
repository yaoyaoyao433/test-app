package com.sankuai.waimai.store.poilist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.labelview.LabelView;
import com.sankuai.waimai.store.platform.domain.core.poi.ShippingTimeInfo;
import com.sankuai.waimai.store.poi.subscribe.a;
import com.sankuai.waimai.store.poilist.view.b;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.base.b implements b {
    public static ChangeQuickRedirect C;
    @ColorRes
    public final int D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public View I;
    public TextView J;
    public TextView K;
    public TextView L;
    public View M;
    protected boolean N;
    protected boolean O;
    protected boolean P;
    protected int Q;
    protected int R;
    protected int S;
    protected int T;
    protected int U;
    protected int V;
    protected Context W;
    protected TextView X;
    protected View Y;
    protected TextView Z;
    private TagCanvasView a;
    protected ImageView aa;
    protected ImageView ab;
    protected ImageView ac;
    protected ImageView ad;
    protected View ae;
    protected ImageView af;
    protected ImageView ag;
    protected ImageView ah;
    protected LabelView ai;
    protected com.sankuai.waimai.store.poi.list.widget.tag.a aj;
    protected ViewGroup ak;
    protected b.a al;
    public LinearLayout am;
    public ImageView an;
    protected TextView ao;
    public com.sankuai.waimai.store.expose.v2.entity.b ap;
    protected View aq;
    protected e ar;
    private boolean b;

    public int b() {
        return -1;
    }

    public c(@NonNull Context context) {
        this(context, true);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342b8c97bcb7ecf131acf5386d2376af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342b8c97bcb7ecf131acf5386d2376af");
        }
    }

    private c(@NonNull Context context, boolean z) {
        super(context);
        Object[] objArr = {context, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ddd97d6c55daf342ca68131f075ef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ddd97d6c55daf342ca68131f075ef5");
            return;
        }
        this.D = R.color.wm_sg_color_D3D3D4;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = R.drawable.wm_st_poi_status_free_tip_home_bg;
        this.R = R.drawable.wm_st_poi_status_pre_order_tip_bg;
        this.S = R.drawable.wm_st_poi_status_pre_order_only_tip_bg;
        this.T = R.drawable.wm_st_poi_status_close_tip_bg;
        this.V = 0;
        this.b = true;
        this.W = context;
        this.b = true;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f053a9f5a1b1306d8eff92fb298d496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f053a9f5a1b1306d8eff92fb298d496");
            return;
        }
        a();
        if (this.W instanceof SCBaseActivity) {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) this.W;
            this.ap = new com.sankuai.waimai.store.expose.v2.entity.b(sCBaseActivity.b(), "b_waimai_5bz1lkxz_mv", this.ao);
            com.sankuai.waimai.store.expose.v2.b.a().a(sCBaseActivity, this.ap);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86dbbcf6911cd9767a0a9fe93fd0ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86dbbcf6911cd9767a0a9fe93fd0ada");
            return;
        }
        this.K = (TextView) findView(R.id.txt_poiList_adapter_bottom_left);
        this.L = (TextView) findView(R.id.txt_poiList_adapter_bottom_middle);
        this.M = findView(R.id.txt_poiList_adapter_bottom_left_line);
        this.E = (TextView) findView(R.id.txt_poiList_adapter_middle_right);
        this.G = (TextView) findView(R.id.txt_poiList_adapter_info_middle);
        this.F = (TextView) findView(R.id.txt_poiList_poi_rating_num);
        this.H = (TextView) findView(R.id.txt_poiList_adapter_distance);
        this.I = findView(R.id.view_closed);
        this.X = (TextView) findView(R.id.txt_poiList_adapter_middle_desc);
        this.Y = findView(R.id.img_poiList_adapter_poi_image_rest_float);
        this.J = (TextView) findView(R.id.txt_poiList_adapter_name);
        this.Z = (TextView) findView(R.id.txt_order_num);
        this.am = (LinearLayout) findView(R.id.ll_poiList_poi_rating_sales);
        this.aa = (ImageView) findView(R.id.img_poi_promotion);
        this.ab = (ImageView) findView(R.id.img_poi_icon);
        this.an = (ImageView) findView(R.id.poi_ad_icon);
        this.ac = (ImageView) findView(R.id.img_poiList_adapter_distribution);
        this.ah = (ImageView) findView(R.id.img_poiList_adapter_ontime_icon);
        this.ad = (ImageView) findView(R.id.img_activity_num);
        this.ae = findView(R.id.tag_more_container);
        this.ak = (ViewGroup) findView(R.id.layout_bottom_activities_container);
        this.af = (ImageView) findView(R.id.img_poiList_adapter_favorite);
        this.ao = (TextView) findView(R.id.txt_poi_list_subscribe);
        this.a = (TagCanvasView) findView(R.id.tcv_new_tag_view);
        this.ag = (ImageView) findView(R.id.noworries_tag);
        this.ai = (LabelView) findView(R.id.more_lable_view);
        this.ai.setText(R.string.wm_sc_poi_dot_ellipsize);
        this.ai.setTextColor(this.W.getResources().getColor(R.color.wm_sg_color_575859));
        if (this.al != null) {
            getContext();
        }
        this.aq = this.ak;
        this.aj = new com.sankuai.waimai.store.poi.list.widget.tag.a(getContext(), this.a, this.ak, false);
        com.sankuai.waimai.store.poi.list.widget.tag.a aVar = this.aj;
        View view = this.aq;
        ImageView imageView = this.ad;
        LabelView labelView = this.ai;
        Object[] objArr2 = {view, imageView, labelView};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.widget.tag.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "19f2ba8d4d3efd2e6c64c181fbe1174c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "19f2ba8d4d3efd2e6c64c181fbe1174c");
        } else {
            aVar.j = view;
            aVar.k = imageView;
            aVar.l = labelView;
            aVar.j.setOnClickListener(aVar);
        }
        this.aj.o = this.al;
        this.ar = new e(this.W);
    }

    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820474313ef6a473bad7a4d47e6c6cb5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820474313ef6a473bad7a4d47e6c6cb5") : this.aj != null ? this.aj.d : "";
    }

    public final void a(ImageView imageView, String str, int i) {
        Object[] objArr = {imageView, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2fe65f9376bbfb753c178da3813e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2fe65f9376bbfb753c178da3813e6c");
        } else {
            m.a(str, imageView, i);
        }
    }

    private boolean e(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3de895145c4428db88b2186ca8218a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3de895145c4428db88b2186ca8218a")).booleanValue();
        }
        if (TextUtils.isEmpty(poiVerticality.closing_tips)) {
            return false;
        }
        this.E.setText(poiVerticality.closing_tips);
        this.E.setBackgroundResource(this.T);
        this.E.setVisibility(0);
        return true;
    }

    public void c(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd56c62875fbcb91e43a149013758e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd56c62875fbcb91e43a149013758e95");
        } else if (!this.N) {
            this.F.setVisibility(8);
        } else {
            this.F.setVisibility(0);
            if (poiVerticality.wmPoiScore > 0.0d) {
                this.F.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_FF8000));
                this.F.setText(String.valueOf(poiVerticality.wmPoiScore));
                TextPaint paint = this.F.getPaint();
                if (paint != null) {
                    paint.setFakeBoldText(true);
                    return;
                }
                return;
            }
            this.F.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_666666));
            this.F.setText(R.string.wm_sc_no_comment_now);
            TextPaint paint2 = this.F.getPaint();
            if (paint2 != null) {
                paint2.setFakeBoldText(false);
            }
        }
    }

    public void a(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62fd97dd076247ba4b3307e28d4fecfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62fd97dd076247ba4b3307e28d4fecfa");
        } else if (this.O) {
            this.G.setVisibility(0);
            this.G.setText(poiVerticality.monthSalesTip);
        } else {
            this.G.setVisibility(8);
        }
    }

    public void b(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5beeed0e8c767c742960d62cc772364f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5beeed0e8c767c742960d62cc772364f");
        } else if (!TextUtils.isEmpty(poiVerticality.distance)) {
            this.H.setText(poiVerticality.distance);
        } else {
            this.H.setText("");
        }
    }

    public void d(PoiVerticality poiVerticality) {
        boolean z = true;
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8add139daaa7f1579c18ebdf2d242e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8add139daaa7f1579c18ebdf2d242e55");
            return;
        }
        this.X.setVisibility(8);
        this.I.setVisibility(8);
        this.E.setVisibility(8);
        String str = "";
        if (poiVerticality.status == 3) {
            if (e(poiVerticality)) {
                return;
            }
            this.I.setVisibility(0);
            this.Y.setVisibility(0);
            this.J.setTextColor(this.W.getResources().getColor(R.color.wm_sg_color_999999));
            if (TextUtils.isEmpty(poiVerticality.statusDesc)) {
                this.am.setVisibility(0);
            } else {
                str = poiVerticality.statusDesc;
                this.E.setBackgroundResource(this.Q);
                this.E.setVisibility(0);
            }
        } else {
            this.Y.setVisibility(8);
            this.J.setTextColor(this.W.getResources().getColor(R.color.wm_st_common_text_title));
            ShippingTimeInfo shippingTimeInfo = poiVerticality.shippingTimeInfo;
            this.am.setVisibility(0);
            if (shippingTimeInfo == null || TextUtils.isEmpty(shippingTimeInfo.statusContent) || TextUtils.isEmpty(shippingTimeInfo.descContent)) {
                if (e(poiVerticality)) {
                    return;
                }
                this.E.setVisibility(8);
            } else {
                int i = this.R;
                if (poiVerticality.shippingTimeInfo.reservationStatus == 0) {
                    i = this.R;
                    str = shippingTimeInfo.statusContent + StringUtil.SPACE + poiVerticality.shippingTimeInfo.descContent;
                } else if (shippingTimeInfo.reservationStatus == 1) {
                    i = this.S;
                    str = shippingTimeInfo.statusContent;
                }
                String str2 = str;
                this.E.setBackgroundResource(i);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = C;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce88e4c10d56721c6edaaed2e1bcb789", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce88e4c10d56721c6edaaed2e1bcb789")).booleanValue();
                } else if (h.a(this.W) < 720) {
                    z = false;
                }
                if (z) {
                    this.X.setVisibility(0);
                    this.X.setText(poiVerticality.shippingTimeInfo.descContent);
                }
                this.E.setVisibility(0);
                this.E.invalidate();
                str = str2;
            }
        }
        this.E.setText(str);
    }

    public final void g(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd428e0f42b7d8cec15d594160bd7868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd428e0f42b7d8cec15d594160bd7868");
            return;
        }
        int a = com.sankuai.waimai.store.manager.globalcart.a.a().a(poiVerticality.getOfficialPoiId());
        String valueOf = a > 99 ? "99+" : String.valueOf(a);
        if (a > 0 && this.P) {
            this.Z.setText(valueOf);
            this.Z.setVisibility(0);
            return;
        }
        this.Z.setVisibility(8);
    }

    public final void h(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f68a7a6b3acfde542a1a6381db8b64f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f68a7a6b3acfde542a1a6381db8b64f");
            return;
        }
        String str = poiVerticality.promotionPicUrl;
        if (TextUtils.isEmpty(str)) {
            this.aa.setVisibility(8);
            String str2 = poiVerticality.poiTypeIcon;
            if (!TextUtils.isEmpty(str2)) {
                this.ab.setVisibility(0);
                a(this.ab, str2, this.ar.l);
                return;
            }
            this.ab.setVisibility(8);
            return;
        }
        this.aa.setVisibility(0);
        this.ab.setVisibility(8);
        a(this.aa, str, this.ar.n);
    }

    public final void i(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6612e472e7575903bf8fc82c4573b5aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6612e472e7575903bf8fc82c4573b5aa");
        } else if (this.b) {
            String a = com.sankuai.waimai.store.view.banner.bizinfo.a.a();
            if (!poiVerticality.showAdIcon() || TextUtils.isEmpty(a)) {
                this.an.setVisibility(8);
                return;
            }
            this.an.setVisibility(0);
            b.C0608b a2 = m.a(ImageQualityUtil.a(this.W, a, 2, this.ar.k), ImageQualityUtil.a());
            a2.b = this.W;
            a2.a((View) this.an).a(new b.a() { // from class: com.sankuai.waimai.store.poilist.view.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5946e337ec4f331286678dda9cbf30b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5946e337ec4f331286678dda9cbf30b");
                    } else {
                        c.this.an.setImageBitmap(bitmap);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bfbac6ec31dd16c0ebde2d200290221", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bfbac6ec31dd16c0ebde2d200290221");
                    } else {
                        c.this.an.setVisibility(8);
                    }
                }
            });
        }
    }

    public final void j(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626cc241ad61358849a28429e1bcf7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626cc241ad61358849a28429e1bcf7fb");
        } else if (t.a(poiVerticality.deliveryTypeIcon)) {
            this.ac.setVisibility(8);
        } else {
            this.ac.setVisibility(0);
            m.d(poiVerticality.deliveryTypeIcon, this.ar.j).a(this.ac);
        }
    }

    public final void k(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7eea2daad552fac72c0fef4acbecc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7eea2daad552fac72c0fef4acbecc9");
        } else if (t.a(poiVerticality.onTimeIcon)) {
            this.ah.setVisibility(8);
        } else {
            this.ah.setVisibility(0);
            m.d(poiVerticality.onTimeIcon, this.ar.j).a(this.ah);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.sankuai.waimai.store.repository.model.PoiVerticality r20) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poilist.view.c.l(com.sankuai.waimai.store.repository.model.PoiVerticality):void");
    }

    public final void a(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828f25bb14ba12ca7e08363f90c09572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828f25bb14ba12ca7e08363f90c09572");
        } else if (this.aj != null) {
            com.sankuai.waimai.store.poi.list.widget.tag.a aVar = this.aj;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.widget.tag.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "66f9d572f3952caac358e04ecf023c41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "66f9d572f3952caac358e04ecf023c41");
                return;
            }
            aVar.n = aVar.m != i;
            aVar.m = i;
        }
    }

    public final void m(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238c174902f8b89a01f52a10426ddfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238c174902f8b89a01f52a10426ddfac");
        } else {
            this.af.setVisibility(8);
        }
    }

    public final void n(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad625fbec975eff6ab21d9862fa9f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad625fbec975eff6ab21d9862fa9f92");
            return;
        }
        this.K.setVisibility(0);
        this.L.setVisibility(0);
        this.M.setVisibility(0);
    }

    public final void o(PoiVerticality poiVerticality) {
        Object[] objArr = {poiVerticality};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4a3dc3d6698bad6db3931e1bae1330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4a3dc3d6698bad6db3931e1bae1330");
        } else if (poiVerticality.containerTemplate == null || TextUtils.isEmpty(poiVerticality.containerTemplate.tagIcon)) {
            this.ag.setVisibility(8);
        } else {
            this.ag.setVisibility(0);
            a(this.ag, poiVerticality.containerTemplate.tagIcon, (int) this.W.getResources().getDimension(R.dimen.wm_sc_common_dimen_25));
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e353c453ea5f2ec98b4b15b14d4076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e353c453ea5f2ec98b4b15b14d4076");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.J.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        if (z) {
            marginLayoutParams.rightMargin = this.W.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_95);
        } else {
            marginLayoutParams.rightMargin = this.W.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10);
        }
        this.J.setLayoutParams(marginLayoutParams);
    }

    public void a(final PoiVerticality poiVerticality, int i) {
        Object[] objArr = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5bc792a02d406c78e46074eed7efa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5bc792a02d406c78e46074eed7efa4");
            return;
        }
        this.U = i;
        Object[] objArr2 = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = C;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "083ab9281e486eabbc2b95aedcd04977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "083ab9281e486eabbc2b95aedcd04977");
        } else if (this.ao == null) {
            a(false);
        } else if (poiVerticality.subscribe == 0) {
            a(false);
            this.ao.setVisibility(8);
        } else {
            a(true);
            this.ao.setVisibility(0);
            int i2 = poiVerticality.subscribe;
            Object[] objArr3 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = C;
            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a60adaed61e636a4373aa373906e9c33", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i2) {
                    case 1:
                        this.ao.setText(this.W.getString(R.string.wm_sg_poi_can_subscribe));
                        this.ao.setBackground(this.W.getDrawable(R.drawable.wm_sc_bg_poi_can_subscribe));
                        this.ao.setCompoundDrawablesWithIntrinsicBounds(this.W.getDrawable(R.drawable.wm_sc_poi_can_subscribe_icon_left), (Drawable) null, (Drawable) null, (Drawable) null);
                        break;
                    case 2:
                        this.ao.setText(this.W.getString(R.string.wm_sg_poi_have_subscribe));
                        this.ao.setBackground(this.W.getDrawable(R.drawable.wm_sc_bg_poi_have_subscribe));
                        this.ao.setCompoundDrawablesWithIntrinsicBounds(this.W.getDrawable(R.drawable.wm_sc_poi_have_subscribed_icon_left), (Drawable) null, (Drawable) null, (Drawable) null);
                        break;
                    default:
                        this.ao.setVisibility(8);
                        break;
                }
            } else {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a60adaed61e636a4373aa373906e9c33");
            }
            if (this.W instanceof SCBaseActivity) {
                final SCBaseActivity sCBaseActivity = (SCBaseActivity) this.W;
                com.sankuai.waimai.store.expose.v2.entity.b bVar = this.ap;
                bVar.e = "b_waimai_5bz1lkxz_mv_" + i + CommonConstant.Symbol.UNDERLINE + poiVerticality.hashCode() + CommonConstant.Symbol.UNDERLINE + poiVerticality.subscribe;
                bVar.a("poi_id", poiVerticality.getOfficialPoiId()).a("status", Integer.valueOf(poiVerticality.subscribe));
                this.ao.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poilist.view.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "24a66a9a1dd1cb4c4e50a3f912a63944", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "24a66a9a1dd1cb4c4e50a3f912a63944");
                        } else {
                            com.sankuai.waimai.store.poi.subscribe.a.a().a(sCBaseActivity, (a.c) new com.sankuai.waimai.store.poi.subscribe.d(sCBaseActivity, poiVerticality.id, poiVerticality.subscribe) { // from class: com.sankuai.waimai.store.poilist.view.c.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.poi.subscribe.a.c
                                public final void a(int i3) {
                                    Object[] objArr5 = {Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d57b8f9b08aa82236039e6a18d92036e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d57b8f9b08aa82236039e6a18d92036e");
                                    } else {
                                        com.sankuai.waimai.store.manager.judas.b.a(sCBaseActivity.b(), "b_waimai_5bz1lkxz_mc").a("poi_id", poiVerticality.getOfficialPoiId()).a("status", Integer.valueOf(i3)).a();
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }
    }
}
