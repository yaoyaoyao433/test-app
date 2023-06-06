package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
import com.meituan.roodesign.widgets.rooswitch.RooSwitch;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.e;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderService;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a {
    public static ChangeQuickRedirect e;
    private TablewareSettingsInfo.SettingsOption A;
    private TablewareSettingsInfo.SettingsOption B;
    private AppCompatTextView C;
    private AppCompatTextView D;
    private AppCompatTextView E;
    private AppCompatTextView F;
    private a G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private AddressItem L;
    private long M;
    private int N;
    private ViewGroup.LayoutParams O;
    public AppCompatTextView f;
    private ViewGroup g;
    private RooButton h;
    private ViewGroup i;
    private ViewGroup j;
    private ViewGroup k;
    private e l;
    private AppCompatTextView m;
    private AppCompatTextView n;
    private RooSwitch o;
    private Drawable p;
    private ImageView q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private long v;
    private String w;
    private String x;
    private String y;
    private TablewareSettingsInfo z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(int i, int i2, boolean z);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_view_list_diners_count_b;
    }

    public static /* synthetic */ void A(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8cf70b7057e4ef52df61ccf2bb4c1bba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8cf70b7057e4ef52df61ccf2bb4c1bba");
            return;
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(bVar.c, "order_confirm_tableware_switch_bubble", (String) null);
        String format = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(new Date());
        if (!bVar.s && bVar.t != Integer.MIN_VALUE) {
            if (bVar.f.getVisibility() != 0) {
                if (b == null || !b.equals(format)) {
                    bVar.f.setVisibility(0);
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(bVar.c, "order_confirm_tableware_switch_bubble", format);
                    return;
                }
                return;
            }
            return;
        }
        bVar.f.setVisibility(8);
    }

    public static /* synthetic */ void a(b bVar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        Object[] objArr = {appCompatTextView, appCompatTextView2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "dc6dc2d757c2fb2cd6c594cc849bfe8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "dc6dc2d757c2fb2cd6c594cc849bfe8a");
            return;
        }
        if (appCompatTextView.getVisibility() == 0) {
            appCompatTextView.setTextColor(bVar.c.getResources().getColor(R.color.wm_order_confirm_table_ware_info_view_sure_select_color));
        }
        if (appCompatTextView2.getVisibility() == 0) {
            appCompatTextView2.setTextColor(bVar.c.getResources().getColor(R.color.wm_order_confirm_title_text_color_auxiliary));
        }
    }

    public static /* synthetic */ void a(b bVar, View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a74c51eb1dcca4d8fa56bade6dae31d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a74c51eb1dcca4d8fa56bade6dae31d9");
            return;
        }
        view.setBackground(bVar.c.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg_selected));
        view2.setBackground(bVar.c.getDrawable(R.drawable.wm_order_confirm_dinners_stepper_bg));
    }

    public static /* synthetic */ void a(b bVar, TablewareSettingsInfo.SettingsOption settingsOption, boolean z) {
        Drawable drawable;
        Object[] objArr = {settingsOption, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c697ea040b311d1378d2ef115cde94be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c697ea040b311d1378d2ef115cde94be");
            return;
        }
        bVar.m.setText(settingsOption.description);
        if (z) {
            drawable = bVar.p;
            bVar.m.setCompoundDrawablePadding(4);
        } else {
            drawable = null;
        }
        bVar.m.setCompoundDrawables(drawable, null, null, null);
        if (!TextUtils.isEmpty(settingsOption.sub_description)) {
            bVar.n.setVisibility(0);
            bVar.n.setText(settingsOption.sub_description);
        } else {
            bVar.n.setVisibility(8);
        }
        if (bVar.t != settingsOption.code) {
            bVar.I = true;
            bVar.o.setChecked(false);
        }
    }

    public static /* synthetic */ void a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b2832e2b646318156c8f33a3acb4dd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b2832e2b646318156c8f33a3acb4dd3f");
        } else if (bVar.H) {
        } else {
            JudasManualManager.a("b_waimai_vumeq7lm_mc").a("c_ykhs39e").a("button_name", str).a(bVar.c).a();
        }
    }

    public static /* synthetic */ boolean a(b bVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ffd6b8dd66058882f4b1e664801b6d2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ffd6b8dd66058882f4b1e664801b6d2c")).booleanValue();
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

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.r = true;
        return true;
    }

    public static /* synthetic */ void b(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "961ec3d4d38c2fe6d34a4332b421fa4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "961ec3d4d38c2fe6d34a4332b421fa4e");
        } else if (bVar.I) {
            bVar.I = false;
        } else {
            String str = "";
            if (i == 101) {
                str = bVar.A.select_text;
            } else if (i == 102) {
                str = bVar.B.select_text;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JudasManualManager.a("b_waimai_1rqvy1qi_mc").a("c_ykhs39e").a("button_name", str).a(bVar.c).a();
        }
    }

    public static /* synthetic */ boolean d(b bVar, boolean z) {
        bVar.H = false;
        return false;
    }

    public static /* synthetic */ void e(b bVar) {
        rx.d<BaseResponse> orderSetTableware;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "74547fcdf0010c5ef34241bcf06a2e3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "74547fcdf0010c5ef34241bcf06a2e3b");
            return;
        }
        int i = (!bVar.s || bVar.t == Integer.MIN_VALUE) ? -1 : bVar.t;
        if (bVar.G != null) {
            bVar.G.a(bVar.t, bVar.u, bVar.s);
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(bVar.c);
        if (bVar.z.settingForAddress == 1) {
            orderSetTableware = ((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderSetTablewareForAddress(bVar.v, bVar.w, bVar.z.settingsId, i, bVar.y, bVar.M, bVar.z.settingForAddress, bVar.L != null ? bVar.L.id : -1L);
        } else {
            orderSetTableware = ((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderSetTableware(bVar.v, bVar.w, bVar.z.settingsId, i, bVar.y);
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(orderSetTableware, new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.10
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Object[] objArr2 = {(BaseResponse) obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ee357ba1951ee8a9e012e6c62ddac35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ee357ba1951ee8a9e012e6c62ddac35");
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aec4b372ac818f6e96c2e5739f7d3231", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aec4b372ac818f6e96c2e5739f7d3231");
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                }
            }
        }, bVar.x);
    }

    public static /* synthetic */ void v(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "be3a19e819c9cffbb38e9affa3a4ae99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "be3a19e819c9cffbb38e9affa3a4ae99");
            return;
        }
        bVar.i.setVisibility(0);
        bVar.i.setAlpha(1.0f);
        bVar.b(bVar.N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public b(Context context, Long l, String str, String str2, String str3, TablewareSettingsInfo tablewareSettingsInfo, boolean z, int i, boolean z2, int i2, AddressItem addressItem, long j, a aVar) {
        super(context);
        int i3;
        int i4;
        View a2;
        Object[] objArr = {context, l, str, str2, str3, tablewareSettingsInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2), addressItem, new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e2dc3dc7bfac7c3e65a89cd211aef9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e2dc3dc7bfac7c3e65a89cd211aef9");
            return;
        }
        this.t = Integer.MIN_VALUE;
        this.H = false;
        this.I = false;
        this.K = false;
        this.z = tablewareSettingsInfo;
        Iterator<TablewareSettingsInfo.SettingsOption> it = this.z.settingsOptions.iterator();
        while (it.hasNext()) {
            TablewareSettingsInfo.SettingsOption next = it.next();
            if (next.code == 101) {
                this.A = next;
            } else if (next.code == 102) {
                this.B = next;
            }
        }
        this.v = l.longValue();
        this.w = str;
        this.x = str3;
        this.s = z;
        this.t = i2;
        this.u = i;
        this.G = aVar;
        this.J = z2;
        this.N = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_tableware_setting_container_height);
        this.y = str2;
        this.L = addressItem;
        this.M = j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5336e78c8830201187052f507eac8b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5336e78c8830201187052f507eac8b9f");
            i3 = 8;
            i4 = 1;
        } else {
            View findViewById = this.b.findViewById(R.id.order_confirm_tableware_tips_layout);
            this.q = (ImageView) this.b.findViewById(R.id.wm_order_confirm_tableware_title_quest);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_tips_txt);
            if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "order_confirm_tableware_settings_tip", false) && this.z != null && !TextUtils.isEmpty(this.z.settingsTip)) {
                appCompatTextView.setText(this.z.settingsTip);
                findViewById.setVisibility(0);
                i3 = 8;
                this.q.setVisibility(8);
                i4 = 1;
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, "order_confirm_tableware_settings_tip", true);
            } else {
                i3 = 8;
                i4 = 1;
                findViewById.setVisibility(8);
                this.q.setVisibility(0);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "61bef40d8a6cd5c2f325af31f8f7c2d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "61bef40d8a6cd5c2f325af31f8f7c2d6");
        } else {
            this.g = (ViewGroup) this.b.findViewById(R.id.wm_order_confirm_tableware_quest_body);
            ((AppCompatTextView) this.g.findViewById(R.id.order_confirm_tableware_quest_txt)).setText(this.z.settingsTip);
            ((ImageView) this.g.findViewById(R.id.order_confirm_tableware_quest_title_back)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "34c6416d27dfbdbd628a42871a64f904", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "34c6416d27dfbdbd628a42871a64f904");
                    } else if (b.a(b.this, view)) {
                        b.this.g();
                    }
                }
            });
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0ce4ebb5da0c80057b5cebe8621a4c93", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0ce4ebb5da0c80057b5cebe8621a4c93");
                        return;
                    }
                    b.this.g.setVisibility(0);
                    Animation makeInAnimation = AnimationUtils.makeInAnimation(b.this.c, false);
                    makeInAnimation.setDuration(300L);
                    b.this.g.startAnimation(makeInAnimation);
                    b.a(b.this, true);
                }
            });
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = e;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5cb12c38b8007ed667d99ed36f21b780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5cb12c38b8007ed667d99ed36f21b780");
        } else {
            ((ImageView) this.b.findViewById(R.id.order_confirm_tableware_title_close)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b4e4088d27ab62a29311164f7003f58c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b4e4088d27ab62a29311164f7003f58c");
                    } else if (b.this.G != null) {
                        b.this.G.a();
                    }
                }
            });
            this.h = (RooButton) this.b.findViewById(R.id.order_confirm_tableware_confirm_txt);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "16613b442bef126eaa528886d4f7ad0f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "16613b442bef126eaa528886d4f7ad0f");
                    } else {
                        b.e(b.this);
                    }
                }
            });
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = e;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "22562788baad3cb65562bbc378546659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "22562788baad3cb65562bbc378546659");
        } else {
            this.j = (ViewGroup) this.b.findViewById(R.id.order_confirm_tableware_no_need);
            this.C = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_no_need_txt);
            this.C.setText(this.B.select_text);
            this.D = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_no_need_txt_sub);
            this.E = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_need_txt_sub);
            this.D.setText(this.B.select_sub_text);
            if (!TextUtils.isEmpty(this.A.select_sub_text)) {
                this.E.setVisibility(0);
                this.E.setText(this.A.select_sub_text);
            } else {
                this.E.setVisibility(i3);
            }
            this.k = (ViewGroup) this.b.findViewById(R.id.order_confirm_tableware_need);
            this.F = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_need_txt);
            this.F.setText(this.A.select_text);
            this.p = this.c.getDrawable(R.drawable.wm_order_confirm_tableware_icon_neat_2);
            if (this.p != null) {
                this.p.setBounds(0, 0, this.p.getIntrinsicWidth(), this.p.getIntrinsicHeight());
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = e;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4ca3a1fc949dcfa6cc8f8f5fb797e113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4ca3a1fc949dcfa6cc8f8f5fb797e113");
        } else {
            this.l = new e(this.c, this.b.findViewById(R.id.order_confirm_tableware_selector));
            this.l.i = new e.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.e.a
                public final void a(int i5) {
                    Object[] objArr7 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f30bdff1285ac9336b6ebf136a0a6d41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f30bdff1285ac9336b6ebf136a0a6d41");
                        return;
                    }
                    b.this.h.setText(!b.this.J ? i5 == 0 ? b.this.c.getString(R.string.wm_order_confirm_tableware_label_auto) : String.format(b.this.c.getString(R.string.wm_order_confirm_tableware_confirm_count), Integer.valueOf(i5)) : b.this.c.getString(R.string.wm_order_confirm_tableware_confirm_submit_order));
                    b.this.u = i5;
                }
            };
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = e;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8ced400704c09df3818beea8ff0c8eda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8ced400704c09df3818beea8ff0c8eda");
        } else {
            this.i = (ViewGroup) this.b.findViewById(R.id.order_confirm_tableware_setting_layout);
            this.O = this.i.getLayoutParams();
            this.f = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_switch_bubble);
            this.m = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_setting_txt);
            this.o = (RooSwitch) this.b.findViewById(R.id.order_confirm_tableware_setting_switch);
            this.n = (AppCompatTextView) this.b.findViewById(R.id.order_confirm_tableware_setting_txt_sub);
            this.o.setChecked(this.s);
            this.o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.7
                public static ChangeQuickRedirect a;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    Object[] objArr8 = {compoundButton, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0e8753f45d76f70a5a67dbe3c4fdfefb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0e8753f45d76f70a5a67dbe3c4fdfefb");
                        return;
                    }
                    b.b(b.this, b.this.t);
                    b.this.s = z3;
                    if (b.this.s && b.this.f.getVisibility() == 0) {
                        b.this.f.setVisibility(8);
                    }
                }
            });
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = e;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "58472260348014ba16179bf84fa57987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "58472260348014ba16179bf84fa57987");
        } else {
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.8
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr9 = {view};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "ffac55bd02a8ca4bf897b4bf7dfe6a6b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "ffac55bd02a8ca4bf897b4bf7dfe6a6b");
                        return;
                    }
                    b.a(b.this, b.this.A.select_text);
                    b.a(b.this, b.this.k, b.this.j);
                    b.a(b.this, b.this.F, b.this.C);
                    b.a(b.this, b.this.E, b.this.D);
                    b.this.k.setContentDescription(TextUtils.concat(b.this.F.getText().toString(), b.this.E.getText().toString(), "，已选中").toString());
                    b.this.j.setContentDescription(TextUtils.concat(b.this.C.getText().toString(), b.this.D.getText().toString()).toString());
                    if (!b.this.K && !b.this.H) {
                        b.this.a(101);
                        b.this.K = true;
                    }
                    if (b.this.H) {
                        b.v(b.this);
                        b.this.l.e();
                        b.d(b.this, false);
                        b.this.K = true;
                    }
                    b.a(b.this, b.this.A, false);
                    if (!b.this.h.isEnabled()) {
                        b.this.h.setEnabled(true);
                    }
                    int i5 = b.this.l.f;
                    b.this.h.setText(!b.this.J ? i5 == 0 ? b.this.c.getString(R.string.wm_order_confirm_tableware_label_auto) : String.format(b.this.c.getString(R.string.wm_order_confirm_tableware_confirm_count), Integer.valueOf(i5)) : b.this.c.getString(R.string.wm_order_confirm_tableware_confirm_submit_order));
                    b.this.t = 101;
                    b.A(b.this);
                }
            });
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr9 = {view};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "19932639639cd7bdeace91aa01828856", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "19932639639cd7bdeace91aa01828856");
                        return;
                    }
                    b.a(b.this, b.this.B.select_text);
                    b.a(b.this, b.this.C, b.this.F);
                    b.a(b.this, b.this.D, b.this.E);
                    b.a(b.this, b.this.j, b.this.k);
                    b.this.j.setContentDescription(TextUtils.concat(b.this.C.getText().toString(), b.this.D.getText().toString(), "，已选中").toString());
                    b.this.k.setContentDescription(TextUtils.concat(b.this.F.getText().toString(), b.this.E.getText().toString()).toString());
                    e eVar = b.this.l;
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = e.d;
                    if (PatchProxy.isSupport(objArr10, eVar, changeQuickRedirect10, false, "000de58a1d24891dff71f0e1bd89df87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, eVar, changeQuickRedirect10, false, "000de58a1d24891dff71f0e1bd89df87");
                    } else {
                        if (eVar.j) {
                            eVar.a(false, false);
                            g gVar = eVar.h;
                            Object[] objArr11 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect11 = g.d;
                            if (PatchProxy.isSupport(objArr11, gVar, changeQuickRedirect11, false, "ea3cb19df032ee0d031e6336b899bf87", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, gVar, changeQuickRedirect11, false, "ea3cb19df032ee0d031e6336b899bf87");
                            } else {
                                gVar.a(gVar.f);
                            }
                        }
                        eVar.b(eVar.a(0), true);
                        if (eVar.e != 0) {
                            eVar.b(eVar.a(eVar.e), false);
                        }
                        eVar.f = 0;
                        eVar.e = 0;
                        eVar.j = false;
                    }
                    if (b.this.i.getVisibility() == 8 && !b.this.K) {
                        b.this.a(100);
                    }
                    if (b.this.K && !b.this.H) {
                        b.this.a(102);
                        b.this.K = false;
                    }
                    if (b.this.H) {
                        b.v(b.this);
                        b.this.l.b(8);
                        b.this.K = false;
                        b.d(b.this, false);
                    }
                    b.a(b.this, b.this.B, true);
                    b.this.u = 0;
                    if (!b.this.h.isEnabled()) {
                        b.this.h.setEnabled(true);
                    }
                    if (b.this.J) {
                        b.this.h.setText(b.this.c.getString(R.string.wm_order_confirm_tableware_confirm_submit_order));
                    } else {
                        b.this.h.setText(b.this.c.getString(R.string.wm_order_confirm_tableware_confirm_no_require));
                    }
                    b.this.t = 102;
                    b.A(b.this);
                }
            });
        }
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = e;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "9a6390c2e4925afd739a868a2b33b388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "9a6390c2e4925afd739a868a2b33b388");
        } else if (this.t != Integer.MIN_VALUE) {
            if (this.t == 102) {
                this.h.setEnabled(i4);
                this.H = i4;
                this.j.performClick();
                return;
            }
            this.h.setEnabled(i4);
            e eVar = this.l;
            int i5 = this.u;
            Object[] objArr10 = new Object[i4];
            objArr10[0] = Integer.valueOf(i5);
            ChangeQuickRedirect changeQuickRedirect10 = e.d;
            if (PatchProxy.isSupport(objArr10, eVar, changeQuickRedirect10, false, "fb6590dede9ac6688b50c10eabe9ea9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, eVar, changeQuickRedirect10, false, "fb6590dede9ac6688b50c10eabe9ea9e");
            } else {
                if (i5 >= 3 && !eVar.j && i5 <= eVar.g) {
                    eVar.a((boolean) i4, (boolean) i4);
                }
                if (i5 >= 7 && i5 <= eVar.g) {
                    eVar.a(7);
                    eVar.h.a(i5);
                } else {
                    a2 = (i5 >= 0 && i5 < 7) ? eVar.a(i5) : a2;
                }
                eVar.a(a2, (boolean) i4);
            }
            this.H = i4;
            this.k.performClick();
        } else if (this.A.isSelected == i4) {
            this.h.setEnabled(i4);
            this.H = i4;
            this.k.performClick();
        } else if (this.B.isSelected == i4) {
            this.h.setEnabled(i4);
            this.H = i4;
            this.j.performClick();
        } else {
            this.h.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3864c99d1451bef9c3e4c9c25a814a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3864c99d1451bef9c3e4c9c25a814a4");
            return;
        }
        this.g.setVisibility(4);
        Animation makeOutAnimation = AnimationUtils.makeOutAnimation(this.c, true);
        makeOutAnimation.setDuration(300L);
        this.g.startAnimation(makeOutAnimation);
        this.r = false;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60de3d2ee9a87f1cf925add3941e5f9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60de3d2ee9a87f1cf925add3941e5f9f");
            return;
        }
        if (this.r && this.g != null) {
            this.g.clearAnimation();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964aeb12aceb24418a6e6d15ec1b4035", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964aeb12aceb24418a6e6d15ec1b4035")).booleanValue();
        }
        if (i == 4 && this.r) {
            g();
            return true;
        }
        return false;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf31ccfd6c2f6c8ef1edaf57e4dd578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf31ccfd6c2f6c8ef1edaf57e4dd578");
            return;
        }
        AnimatorSet animatorSet = null;
        if (this.i.getVisibility() == 8) {
            b(0);
            this.i.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.i, "alpha", 0.0f, 1.0f).setDuration(250L);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.N);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1208919d74f5925499ae8343bb5b3c0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1208919d74f5925499ae8343bb5b3c0d");
                    } else {
                        b.this.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
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
        } else {
            this.l.a(i, animatorSet);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2659b3eff71bde4ad9a888565a79c1ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2659b3eff71bde4ad9a888565a79c1ee");
            return;
        }
        this.O.height = i;
        this.i.setLayoutParams(this.O);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d7fe026c5c6eeccd342c3a93054d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d7fe026c5c6eeccd342c3a93054d15");
        } else {
            JudasManualManager.b("b_waimai_vumeq7lm_mv").a("c_ykhs39e").a(this.c).a();
        }
    }
}
