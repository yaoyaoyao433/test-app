package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
import com.meituan.roodesign.widgets.rooswitch.RooSwitch;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.f;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderService;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.widget.RoundedCornerImageView;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a implements DialogInterface.OnKeyListener {
    public static ChangeQuickRedirect e;
    private TablewareSettingsInfo A;
    private AddressItem B;
    private int C;
    private long D;
    private TablewareSettingsInfo.SettingsOption E;
    private TablewareSettingsInfo.SettingsOption F;
    private AppCompatTextView G;
    private AppCompatTextView H;
    private AppCompatTextView I;
    private AppCompatTextView J;
    private a K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private ViewGroup.LayoutParams Q;
    private ViewGroup f;
    private ViewGroup g;
    private RooButton h;
    private ViewGroup i;
    private ViewGroup j;
    private ViewGroup k;
    private f l;
    private AppCompatTextView m;
    private AppCompatTextView n;
    private RooSwitch o;
    private Drawable p;
    private ImageView q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private long w;
    private String x;
    private String y;
    private String z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(int i, int i2, boolean z);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_view_list_diners_count_b_new;
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bd57e2c9c5e6f2a8fa7f29781028bb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bd57e2c9c5e6f2a8fa7f29781028bb28");
            return;
        }
        cVar.g.setVisibility(4);
        Animation makeOutAnimation = AnimationUtils.makeOutAnimation(cVar.c, true);
        makeOutAnimation.setDuration(300L);
        cVar.g.startAnimation(makeOutAnimation);
        cVar.s = false;
    }

    public static /* synthetic */ void a(c cVar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        Object[] objArr = {appCompatTextView, appCompatTextView2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f7b4de36ad254d6501f1c476951a4fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f7b4de36ad254d6501f1c476951a4fad");
            return;
        }
        if (appCompatTextView.getVisibility() == 0) {
            appCompatTextView.setTextColor(cVar.c.getResources().getColor(R.color.wm_order_confirm_table_ware_info_view_sure_select_color));
        }
        if (appCompatTextView2.getVisibility() == 0) {
            appCompatTextView2.setTextColor(cVar.c.getResources().getColor(R.color.wm_order_confirm_title_text_color_auxiliary));
        }
    }

    public static /* synthetic */ void a(c cVar, View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bb1db0e48d04db80e98d81db7acd8fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bb1db0e48d04db80e98d81db7acd8fc0");
            return;
        }
        view.setBackground(cVar.c.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg_selected));
        view2.setBackground(cVar.c.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg_new));
    }

    public static /* synthetic */ void a(c cVar, TablewareSettingsInfo.SettingsOption settingsOption, boolean z) {
        Object[] objArr = {settingsOption, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "70258c75c5db1cce43a19492ded25820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "70258c75c5db1cce43a19492ded25820");
            return;
        }
        cVar.m.setText(settingsOption.description);
        cVar.m.setCompoundDrawables(null, null, null, null);
        if (!TextUtils.isEmpty(settingsOption.sub_description)) {
            cVar.n.setVisibility(0);
            cVar.n.setText(settingsOption.sub_description);
        } else {
            cVar.n.setVisibility(8);
        }
        if (cVar.u != settingsOption.code) {
            cVar.M = true;
            cVar.o.setChecked(false);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f12171bab7f192b53ad06e2b231290af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f12171bab7f192b53ad06e2b231290af");
        } else if (cVar.L) {
        } else {
            JudasManualManager.a("b_waimai_vumeq7lm_mc").a("c_ykhs39e").a("button_name", str).a(cVar.c).a();
        }
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.r = true;
        return true;
    }

    public static /* synthetic */ void b(c cVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "3dd2411694d51a9633abe794e84f6fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "3dd2411694d51a9633abe794e84f6fc6");
        } else if (cVar.M) {
            cVar.M = false;
        } else {
            String str = "";
            if (i == 101) {
                str = cVar.E.select_text;
            } else if (i == 102) {
                str = cVar.F.select_text;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JudasManualManager.a("b_waimai_1rqvy1qi_mc").a("c_ykhs39e").a("button_name", str).a(cVar.c).a();
        }
    }

    public static /* synthetic */ boolean b(c cVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "928888c200192a9bf6044b103f531653", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "928888c200192a9bf6044b103f531653")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object tag = view.getTag();
        if (tag == null) {
            view.setTag(Long.valueOf(currentTimeMillis));
            return true;
        }
        boolean z = currentTimeMillis - ((Long) tag).longValue() > 500;
        if (z) {
            view.setTag(Long.valueOf(currentTimeMillis));
        }
        return z;
    }

    public static /* synthetic */ boolean d(c cVar, boolean z) {
        cVar.L = false;
        return false;
    }

    public static /* synthetic */ void f(c cVar) {
        rx.d<BaseResponse> orderSetTableware;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "30d36e823a21fb00b9e8f3d769fabaad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "30d36e823a21fb00b9e8f3d769fabaad");
            return;
        }
        int i = (!cVar.t || cVar.u == Integer.MIN_VALUE) ? -1 : cVar.u;
        if (cVar.K != null) {
            cVar.K.a(cVar.u, cVar.v, cVar.t);
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(cVar.c);
        if (cVar.A.settingForAddress == 1) {
            orderSetTableware = ((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderSetTablewareForAddress(cVar.w, cVar.x, cVar.A.settingsId, i, cVar.z, cVar.D, cVar.A.settingForAddress, cVar.B != null ? cVar.B.id : -1L);
        } else {
            orderSetTableware = ((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderSetTableware(cVar.w, cVar.x, cVar.A.settingsId, i, cVar.z);
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(orderSetTableware, new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Object[] objArr2 = {(BaseResponse) obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03f80b9aa6f4bc56bd60b635f1fdf65d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03f80b9aa6f4bc56bd60b635f1fdf65d");
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4062adac4232a66d122d7ae383aa8f3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4062adac4232a66d122d7ae383aa8f3b");
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                }
            }
        }, cVar.y);
    }

    public static /* synthetic */ void u(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "163b563690f94c7f8d4dc96211791958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "163b563690f94c7f8d4dc96211791958");
        } else if (cVar.C == 1) {
            cVar.i.setVisibility(0);
            cVar.i.setAlpha(1.0f);
            cVar.b(cVar.P);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public c(Context context, Long l, String str, String str2, String str3, TablewareSettingsInfo tablewareSettingsInfo, boolean z, int i, boolean z2, int i2, AddressItem addressItem, int i3, long j, a aVar) {
        super(context);
        int i4;
        int i5;
        Object[] objArr = {context, l, str, str2, str3, tablewareSettingsInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2), addressItem, Integer.valueOf(i3), new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de6be0b15c3c012a6b21162c779e481", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de6be0b15c3c012a6b21162c779e481");
            return;
        }
        this.u = Integer.MIN_VALUE;
        this.L = false;
        this.M = false;
        this.O = false;
        this.A = tablewareSettingsInfo;
        Iterator<TablewareSettingsInfo.SettingsOption> it = this.A.settingsOptions.iterator();
        while (it.hasNext()) {
            TablewareSettingsInfo.SettingsOption next = it.next();
            if (next.code == 101) {
                this.E = next;
            } else if (next.code == 102) {
                this.F = next;
            }
        }
        this.w = l.longValue();
        this.x = str;
        this.y = str3;
        this.t = z;
        this.u = i2;
        this.v = i;
        this.K = aVar;
        this.N = z2;
        this.P = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_tableware_setting_container_height);
        this.z = str2;
        this.B = addressItem;
        this.C = i3;
        this.D = j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "763f6506d1f275c4f5195c52209a7846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "763f6506d1f275c4f5195c52209a7846");
            i4 = 8;
            i5 = 1;
        } else {
            View findViewById = this.b.findViewById(R.id.order_confirm_tableware_new_tips_layout);
            this.q = (ImageView) this.b.findViewById(R.id.wm_order_confirm_tableware_new_title_quest);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_tips_txt);
            if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_confirm_tableware_settings_tip", false) && this.A != null && !TextUtils.isEmpty(this.A.settingsTip)) {
                appCompatTextView.setText(this.A.settingsTip);
                findViewById.setVisibility(0);
                i4 = 8;
                this.q.setVisibility(8);
                i5 = 1;
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, "order_confirm_tableware_settings_tip", true);
            } else {
                i4 = 8;
                i5 = 1;
                findViewById.setVisibility(8);
                this.q.setVisibility(0);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e8dcaf5729b65ceb63d853e5901487a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e8dcaf5729b65ceb63d853e5901487a1");
        } else {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_address_txt);
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_name_txt);
            AppCompatTextView appCompatTextView4 = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_gender_txt);
            AppCompatTextView appCompatTextView5 = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_phone_txt);
            if (this.C == i5) {
                if (this.B != null) {
                    if (!TextUtils.isEmpty(this.B.userName)) {
                        appCompatTextView3.setText(this.B.userName);
                        appCompatTextView4.setText(StringUtil.SPACE + this.B.gender);
                        appCompatTextView3.setVisibility(0);
                        appCompatTextView4.setVisibility(0);
                    } else {
                        appCompatTextView3.setVisibility(i4);
                        appCompatTextView4.setVisibility(i4);
                    }
                    String str4 = this.B.phone;
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = str4;
                    ChangeQuickRedirect changeQuickRedirect4 = e;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c49705b87ffb0418279f7f13180ccbb", RobustBitConfig.DEFAULT_VALUE)) {
                        str4 = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c49705b87ffb0418279f7f13180ccbb");
                    } else if (!TextUtils.isEmpty(str4) && str4.contains(CommonConstant.Symbol.UNDERLINE)) {
                        str4 = "+" + str4.replaceAll(CommonConstant.Symbol.UNDERLINE, StringUtil.SPACE);
                    }
                    ah.a(appCompatTextView5, str4);
                    if (this.B.addrBrief != null) {
                        appCompatTextView2.setText(this.B.addrBrief + StringUtil.SPACE + this.B.addrBuildingNum);
                        appCompatTextView2.setVisibility(0);
                    } else {
                        appCompatTextView2.setVisibility(i4);
                    }
                }
            } else {
                appCompatTextView2.setText("地址暂未选择");
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = e;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0c916c07ab61dd086ef488e4f8c0674b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0c916c07ab61dd086ef488e4f8c0674b");
        } else {
            this.f = (ViewGroup) this.b.findViewById(R.id.wm_order_confirm_tableware_new_quest_body);
            ((AppCompatTextView) this.f.findViewById(R.id.order_confirm_tableware_quest_txt)).setText(this.A.settingsTip);
            ((ImageView) this.f.findViewById(R.id.order_confirm_tableware_quest_title_back)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7cccc5733678b3275e643c799c424c19", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7cccc5733678b3275e643c799c424c19");
                    } else if (c.b(c.this, view)) {
                        c.this.g();
                    }
                }
            });
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "94c098fcb1ed9a35c9b4f19f45b110f6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "94c098fcb1ed9a35c9b4f19f45b110f6");
                        return;
                    }
                    c.this.f.setVisibility(0);
                    Animation makeInAnimation = AnimationUtils.makeInAnimation(c.this.c, false);
                    makeInAnimation.setDuration(300L);
                    c.this.f.startAnimation(makeInAnimation);
                    c.a(c.this, true);
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = e;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b0f1ca7ef4e5f7e2077cd7daec629b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b0f1ca7ef4e5f7e2077cd7daec629b6c");
        } else {
            ((ImageView) this.b.findViewById(R.id.order_confirm_tableware_new_title_close)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "344cfc23b8cb5886b86347fa660ba73a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "344cfc23b8cb5886b86347fa660ba73a");
                    } else if (c.this.K != null) {
                        c.this.K.a();
                    }
                }
            });
            this.h = (RooButton) this.b.findViewById(R.id.order_confirm_tableware_new_confirm_txt);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9744a65adf77ddaac73f5d4dae7a4bd4", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9744a65adf77ddaac73f5d4dae7a4bd4");
                    } else {
                        c.f(c.this);
                    }
                }
            });
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = e;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9718c27524324345c3b5d00d8d6d1bdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9718c27524324345c3b5d00d8d6d1bdc");
        } else {
            this.j = (ViewGroup) this.b.findViewById(R.id.order_confirm_tableware_new_no_need);
            this.G = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_no_need_txt);
            this.G.setText(this.F.select_text);
            this.H = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_no_need_txt_sub);
            this.I = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_need_txt_sub);
            this.H.setText(this.F.select_sub_text);
            if (!TextUtils.isEmpty(this.E.select_sub_text)) {
                this.I.setVisibility(0);
                this.I.setText(this.E.select_sub_text);
            } else {
                this.I.setVisibility(i4);
            }
            this.k = (ViewGroup) this.b.findViewById(R.id.order_confirm_tableware_new_need);
            this.J = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_need_txt);
            this.J.setText(this.E.select_text);
            this.p = this.c.getDrawable(R.drawable.wm_order_confirm_tableware_icon_neat_2);
            if (this.p != null) {
                this.p.setBounds(0, 0, this.p.getIntrinsicWidth(), this.p.getIntrinsicHeight());
            }
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = e;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4f25bf6e08eb06462c64639e5755c496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4f25bf6e08eb06462c64639e5755c496");
        } else {
            this.l = new f(this.c, this.b.findViewById(R.id.order_confirm_tableware_new_selector));
            this.l.i = new f.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.f.a
                public final void a(int i6) {
                    Object[] objArr9 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "f5c38b35a4e3debef989a47c9408c896", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "f5c38b35a4e3debef989a47c9408c896");
                        return;
                    }
                    c.this.h.setText(!c.this.N ? c.this.c.getString(R.string.wm_order_confirm_tableware_label_save) : c.this.c.getString(R.string.wm_order_confirm_tableware_confirm_submit_order));
                    c.this.v = i6;
                }
            };
        }
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = e;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "93db4837059e1fc6d255d85013956e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "93db4837059e1fc6d255d85013956e45");
        } else {
            this.i = (ViewGroup) this.b.findViewById(R.id.order_confirm_tableware_new_setting_layout);
            this.Q = this.i.getLayoutParams();
            this.m = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_setting_txt);
            this.o = (RooSwitch) this.b.findViewById(R.id.order_confirm_tableware_new_setting_switch);
            this.n = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_setting_txt_sub);
            this.o.setChecked(this.t);
            this.o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.9
                public static ChangeQuickRedirect a;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    Object[] objArr10 = {compoundButton, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "f0607b97eb31febbe1dcb96c6a4870d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "f0607b97eb31febbe1dcb96c6a4870d4");
                        return;
                    }
                    c.b(c.this, c.this.u);
                    c.this.t = z3;
                }
            });
        }
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = e;
        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2c53bb42104d05172f4612bc673b83aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2c53bb42104d05172f4612bc673b83aa");
        } else {
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.10
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr11 = {view};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "acb77b98d9e41e84e6c9e99a82e922e6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "acb77b98d9e41e84e6c9e99a82e922e6");
                        return;
                    }
                    c.a(c.this, c.this.E.select_text);
                    c.a(c.this, c.this.k, c.this.j);
                    c.a(c.this, c.this.J, c.this.G);
                    c.a(c.this, c.this.I, c.this.H);
                    c.this.k.setContentDescription(TextUtils.concat(c.this.J.getText().toString(), c.this.I.getText().toString(), "，已选中").toString());
                    c.this.j.setContentDescription(TextUtils.concat(c.this.G.getText().toString(), c.this.H.getText().toString()).toString());
                    if (!c.this.O && !c.this.L) {
                        c.this.a(101);
                        c.this.O = true;
                    }
                    if (c.this.L) {
                        c.u(c.this);
                        c.this.l.e();
                        c.d(c.this, false);
                        c.this.O = true;
                    }
                    c.a(c.this, c.this.E, false);
                    if (!c.this.h.isEnabled()) {
                        c.this.h.setEnabled(true);
                    }
                    f unused = c.this.l;
                    c.this.h.setText(!c.this.N ? c.this.c.getString(R.string.wm_order_confirm_tableware_label_save) : c.this.c.getString(R.string.wm_order_confirm_tableware_confirm_submit_order));
                    c.this.u = 101;
                }
            });
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr11 = {view};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "2ecf501f53ae5bdb4763b41ee28d23bb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "2ecf501f53ae5bdb4763b41ee28d23bb");
                        return;
                    }
                    c.a(c.this, c.this.F.select_text);
                    c.a(c.this, c.this.G, c.this.J);
                    c.a(c.this, c.this.H, c.this.I);
                    c.a(c.this, c.this.j, c.this.k);
                    c.this.j.setContentDescription(TextUtils.concat(c.this.G.getText().toString(), c.this.H.getText().toString(), "，已选中").toString());
                    c.this.k.setContentDescription(TextUtils.concat(c.this.J.getText().toString(), c.this.I.getText().toString()).toString());
                    f fVar = c.this.l;
                    Object[] objArr12 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect12 = f.d;
                    if (PatchProxy.isSupport(objArr12, fVar, changeQuickRedirect12, false, "eefed995c66adb6d941769bd383d9aa0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, fVar, changeQuickRedirect12, false, "eefed995c66adb6d941769bd383d9aa0");
                    } else {
                        j jVar = fVar.h;
                        Object[] objArr13 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect13 = j.d;
                        if (PatchProxy.isSupport(objArr13, jVar, changeQuickRedirect13, false, "28d2e9821343288aee659cf32230e594", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr13, jVar, changeQuickRedirect13, false, "28d2e9821343288aee659cf32230e594");
                        } else {
                            jVar.a(jVar.f);
                        }
                        fVar.b(fVar.a(0), true);
                        if (fVar.e != 0) {
                            fVar.b(fVar.a(fVar.e), false);
                        }
                        fVar.f = 0;
                        fVar.e = 0;
                    }
                    if (c.this.i.getVisibility() == 8 && !c.this.O) {
                        c.this.a(100);
                    }
                    if (c.this.O && !c.this.L) {
                        c.this.a(102);
                        c.this.O = false;
                    }
                    if (c.this.L) {
                        c.u(c.this);
                        c.this.l.b(8);
                        c.this.O = false;
                        c.d(c.this, false);
                    }
                    c.a(c.this, c.this.F, false);
                    c.this.v = 0;
                    if (!c.this.h.isEnabled()) {
                        c.this.h.setEnabled(true);
                    }
                    if (c.this.N) {
                        c.this.h.setText(c.this.c.getString(R.string.wm_order_confirm_tableware_confirm_submit_order));
                    } else {
                        c.this.h.setText(c.this.c.getString(R.string.wm_order_confirm_tableware_label_save));
                    }
                    c.this.u = 102;
                }
            });
        }
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect11 = e;
        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "3c3c76b7899640853f582127d0a1952c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "3c3c76b7899640853f582127d0a1952c");
        } else if (this.u != Integer.MIN_VALUE) {
            if (this.u == 102) {
                this.h.setEnabled(i5);
                this.L = i5;
                this.j.performClick();
            } else {
                this.h.setEnabled(i5);
                f fVar = this.l;
                int i6 = this.v;
                Object[] objArr12 = new Object[i5];
                objArr12[0] = Integer.valueOf(i6);
                ChangeQuickRedirect changeQuickRedirect12 = f.d;
                if (PatchProxy.isSupport(objArr12, fVar, changeQuickRedirect12, false, "eb8241cb4e57c43333e9cb07e8cdfa58", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, fVar, changeQuickRedirect12, false, "eb8241cb4e57c43333e9cb07e8cdfa58");
                } else {
                    View view = null;
                    if (i6 == 0) {
                        view = fVar.a(0);
                    } else if (i6 > 0 && i6 <= fVar.g) {
                        view = fVar.a(i5);
                        fVar.h.a(i6);
                    }
                    fVar.a(view, (boolean) i5);
                }
                this.L = i5;
                this.k.performClick();
            }
        } else if (this.E.isSelected == i5) {
            this.h.setEnabled(i5);
            this.L = i5;
            this.k.performClick();
        } else if (this.F.isSelected == i5) {
            this.h.setEnabled(i5);
            this.L = i5;
            this.j.performClick();
        } else {
            this.h.setEnabled(false);
        }
        Object[] objArr13 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect13 = e;
        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "3d887efaec7af539aa728da88dc0ac5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "3d887efaec7af539aa728da88dc0ac5f");
            return;
        }
        this.g = (ViewGroup) this.b.findViewById(R.id.wm_order_confirm_tableware_new_daohang_body);
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.c;
        a2.c = this.A.userCenterGuidePic;
        a2.i = R.drawable.wm_restaurant_pic_goods_default;
        a2.j = R.drawable.wm_restaurant_pic_goods_default;
        a2.a((ImageView) ((RoundedCornerImageView) this.g.findViewById(R.id.wm_order_confirm_tableware_daohang_img)));
        ((TextView) this.g.findViewById(R.id.order_confirm_tableware_daohang_title_back)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr14 = {view2};
                ChangeQuickRedirect changeQuickRedirect14 = a;
                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "9e53001ca474089ecbc594a309862002", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "9e53001ca474089ecbc594a309862002");
                } else if (c.b(c.this, view2)) {
                    c.a(c.this);
                }
            }
        });
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_new_daohang_txt);
        String str5 = this.A.userCenterGuideText;
        Object[] objArr14 = new Object[i5];
        objArr14[0] = str5;
        ChangeQuickRedirect changeQuickRedirect14 = e;
        a(appCompatTextView6, PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "00587e09cb882ba7f099b38846a695d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "00587e09cb882ba7f099b38846a695d6") : str5.replaceAll("</underline>", "<underline>"));
        appCompatTextView6.setOnClickListener(d.a(this));
    }

    public static /* synthetic */ void a(c cVar, View view) {
        Object[] objArr = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d035df2814932d5b3bd3108243e9192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d035df2814932d5b3bd3108243e9192");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "cb5f835417414e1733b94d209595d236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "cb5f835417414e1733b94d209595d236");
        } else {
            JudasManualManager.a("b_waimai_ei2fbjpw_mc").a("c_ykhs39e").a(cVar.c).a();
        }
        cVar.g.setVisibility(0);
        Animation makeInAnimation = AnimationUtils.makeInAnimation(cVar.c, false);
        makeInAnimation.setDuration(300L);
        cVar.g.startAnimation(makeInAnimation);
        cVar.s = true;
    }

    private void a(AppCompatTextView appCompatTextView, String str) {
        Object[] objArr = {appCompatTextView, str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788511733f24e7e15dba70841041f9d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788511733f24e7e15dba70841041f9d6");
            return;
        }
        try {
            appCompatTextView.setText(a(str));
        } catch (Throwable unused) {
            appCompatTextView.setText(str);
        }
    }

    private SpannableString a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d9a1563e5958fa058c24879a8e780f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d9a1563e5958fa058c24879a8e780f");
        }
        SpannableString spannableString = new SpannableString(str.replaceAll("<underline>", ""));
        String[] split = str.split("<underline>");
        if (split.length >= 2) {
            spannableString.setSpan(new UnderlineSpan(), split[0].length(), split[0].length() + split[1].length(), 33);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f22c2a4b6a98cea7cb8b5d5f65d18f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f22c2a4b6a98cea7cb8b5d5f65d18f");
            return;
        }
        this.f.setVisibility(4);
        Animation makeOutAnimation = AnimationUtils.makeOutAnimation(this.c, true);
        makeOutAnimation.setDuration(300L);
        this.f.startAnimation(makeOutAnimation);
        this.r = false;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4dc4f1787d4a6a3ce595d0ca17cd16e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4dc4f1787d4a6a3ce595d0ca17cd16e");
            return;
        }
        if (this.r && this.f != null) {
            this.f.clearAnimation();
        }
        if (this.i != null) {
            this.i.clearAnimation();
        }
        if (this.l == null || this.l.a() == null) {
            return;
        }
        this.l.a().clearAnimation();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d31b3f088ba27282e81aa3d82b2cf7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d31b3f088ba27282e81aa3d82b2cf7e")).booleanValue();
        }
        if (i == 4 && this.r) {
            g();
            return true;
        }
        return false;
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0faaf8511466d0dba80ddc3e4bc54fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0faaf8511466d0dba80ddc3e4bc54fbb");
            return;
        }
        AnimatorSet animatorSet = null;
        if (this.C == 1 && this.i.getVisibility() == 8) {
            b(0);
            this.i.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.i, "alpha", 0.0f, 1.0f).setDuration(250L);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.P);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.3
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "603e4100ec685cdd9af25e3c49bd8db8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "603e4100ec685cdd9af25e3c49bd8db8");
                    } else {
                        c.this.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }
            });
            if (i == 100) {
                ofInt.setDuration(200L);
                duration.setStartDelay(100L);
            } else {
                ofInt.setDuration(350L);
                duration.setStartDelay(300L);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofInt, duration);
            animatorSet = animatorSet2;
        }
        if (animatorSet != null && i == 100) {
            animatorSet.start();
            return;
        }
        final f fVar = this.l;
        Object[] objArr2 = {Integer.valueOf(i), animatorSet};
        ChangeQuickRedirect changeQuickRedirect2 = f.d;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "e9f066f517a20d98dc58e493b4bdd997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "e9f066f517a20d98dc58e493b4bdd997");
            return;
        }
        fVar.l = i;
        if (fVar.m != null && fVar.m.isRunning()) {
            fVar.m.cancel();
        }
        fVar.m = new AnimatorSet();
        fVar.a(animatorSet);
        fVar.f();
        if (animatorSet != null && fVar.k != null) {
            fVar.m.playTogether(fVar.j, animatorSet, fVar.k);
        } else if (fVar.k != null) {
            fVar.m.playTogether(fVar.j, fVar.k);
        } else {
            fVar.m.playTogether(fVar.j);
        }
        fVar.m.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.f.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr3 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c2c53978f4c521926625d84096ad623", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c2c53978f4c521926625d84096ad623");
                    return;
                }
                super.onAnimationStart(animator);
                if (i == 101) {
                    f.this.c(0);
                    ((FrameLayout) f.this.b).setAlpha(0.0f);
                    ((FrameLayout) f.this.b).setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr3 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39a8e197efe8cbc5a017f4fd81245211", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39a8e197efe8cbc5a017f4fd81245211");
                    return;
                }
                super.onAnimationEnd(animator);
                if (i == 102) {
                    ((FrameLayout) f.this.b).setVisibility(8);
                }
                f.this.m.removeListener(this);
            }
        });
        fVar.m.start();
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75815315c9e02d8ef77cad3c33538dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75815315c9e02d8ef77cad3c33538dce");
            return;
        }
        this.Q.height = i;
        this.i.setLayoutParams(this.Q);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b2be5c074ce76352ee4cd1e289b84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b2be5c074ce76352ee4cd1e289b84d");
        } else {
            JudasManualManager.b("b_waimai_vumeq7lm_mv").a("c_ykhs39e").a(this.c).a();
        }
    }
}
