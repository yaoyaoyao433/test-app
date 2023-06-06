package com.sankuai.waimai.platform.widget.emptylayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.bizdiagnosis.a;
import com.sankuai.waimai.platform.net.d;
import com.sankuai.waimai.router.method.Func2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    private static final int a;
    public static ChangeQuickRedirect c;
    public static HashMap<String, String> d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    protected final TextView A;
    protected final TextView B;
    protected final TextView C;
    protected final TextView D;
    protected final TextView E;
    protected final TextView F;
    protected final ImageView G;
    protected final ImageView H;
    protected boolean I;
    protected int J;
    protected String K;
    protected String L;
    protected com.sankuai.waimai.platform.widget.emptylayout.b M;
    protected int N;
    protected String O;
    protected String P;
    protected String Q;
    protected View.OnClickListener R;
    protected int S;
    protected String T;
    protected String U;
    protected String V;
    protected View.OnClickListener W;
    protected int X;
    protected String Y;
    protected String Z;
    private long aA;
    private com.sankuai.waimai.platform.net.a aB;
    private boolean aC;
    private final View.OnClickListener aD;
    protected String aa;
    protected View.OnClickListener ab;
    protected View.OnClickListener ac;
    protected View.OnClickListener ad;
    protected String ae;
    protected String af;
    public boolean ag;
    public long ah;
    public long ai;
    public boolean aj;
    public boolean ak;
    private int al;
    private final View am;
    private final View an;
    private final View ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private d.b as;
    private long at;
    private long au;
    private long av;
    private boolean aw;
    private Runnable ax;
    private Handler ay;
    private boolean az;
    private ViewStub b;
    public b s;
    public List<a> t;
    protected final Context u;
    protected final View v;
    protected String w;
    protected ViewGroup x;
    public com.sankuai.waimai.platform.modular.block.offline.c y;
    public final ImageView z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public static /* synthetic */ long a(d dVar, long j2) {
        dVar.au = 0L;
        return 0L;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.ap = true;
        return true;
    }

    public static /* synthetic */ boolean b(d dVar, boolean z) {
        dVar.aq = true;
        return true;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        d = hashMap;
        hashMap.put("c_m84bv26", "home_page_error");
        d.put("c_i5kxn8l", "sub_category_page_error");
        d.put("c_48pltlz", "order_list_page_error");
        d.put("c_hgowsqb", "order_status_detail_page_error");
        d.put("c_ykhs39e", "order_confirm_page_error");
        d.put("c_CijEL", "restaurant_page_error");
        d.put("c_u4fk4kw", "goods_detail_page_error");
        d.put("c_nfqbfvw", "search_food_page_error");
        a = R.id.layout_info;
        e = R.string.wm_common_loading;
        f = R.drawable.wm_common_default_net_error_icon;
        g = R.string.wm_common_net_error_info;
        h = R.string.wm_common_reload;
        i = R.string.wm_commom_network_settings;
        j = R.drawable.wm_common_default_net_error_icon;
        k = R.string.wm_common_loading_fail_try_afterwhile;
        l = R.string.wm_common_reload;
        m = R.drawable.wm_common_default_empty_icon;
        n = R.string.wm_common_no_content;
        o = R.string.wm_common_reload;
        p = R.string.wm_common_location_failed_content;
        q = R.string.wm_common_open_location_service_content;
        r = R.string.wm_common_manual_location_failed_content;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum b {
        INITIAL,
        HIDE,
        PROGRESS,
        DATA_ERROR,
        NET_ERROR,
        EMPTY;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d319d1dd464110d9b810526e67d29c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d319d1dd464110d9b810526e67d29c");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b328dbe236cee77a612eb779ac710267", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b328dbe236cee77a612eb779ac710267") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0d9f6f8738a7d3efac718b9634ee218", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0d9f6f8738a7d3efac718b9634ee218") : (b[]) values().clone();
        }
    }

    public d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this(layoutInflater.inflate(R.layout.wm_common_layout_refresh_info, viewGroup, false), a);
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71527483bd7a070cc790082cfe134c06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71527483bd7a070cc790082cfe134c06");
        }
    }

    public d(Activity activity) {
        this(activity.getWindow().getDecorView(), a);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a4f898bdbde8d4aaa3950978b95049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a4f898bdbde8d4aaa3950978b95049");
        }
    }

    public d(Activity activity, int i2) {
        this(activity.getWindow().getDecorView(), i2);
        Object[] objArr = {activity, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035c901f307eadfe358036cee2ac1a50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035c901f307eadfe358036cee2ac1a50");
        }
    }

    public d(View view) {
        this(view, a);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c28c144cc091494f1b759e888adc7b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c28c144cc091494f1b759e888adc7b5");
        }
    }

    public d(View view, int i2) {
        Object[] objArr = {view, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5037ab6e9a17e8a437cbc0662211f9af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5037ab6e9a17e8a437cbc0662211f9af");
            return;
        }
        this.s = b.INITIAL;
        this.t = new ArrayList(1);
        this.al = 0;
        this.I = false;
        this.J = e;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.au = 0L;
        this.aw = false;
        this.az = false;
        this.ag = false;
        this.aA = 0L;
        this.aC = false;
        this.aD = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1256fd83e35b7af79b7470b83500df00", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1256fd83e35b7af79b7470b83500df00");
                    return;
                }
                WeakNetReport.a(1003, d.this.u);
                d.this.u.startActivity(new Intent("android.settings.SETTINGS"));
            }
        };
        this.ah = 0L;
        this.ai = 0L;
        this.aj = false;
        this.ak = false;
        if (view == null) {
            throw new NullPointerException("Parameter rootView cannot be null!");
        }
        this.v = view.findViewById(i2);
        if (this.v == null) {
            throw new Resources.NotFoundException("Cannot find NetInfo Layout!");
        }
        this.at = System.currentTimeMillis();
        this.u = this.v.getContext();
        this.z = (ImageView) this.v.findViewById(R.id.img_info);
        this.A = (TextView) this.v.findViewById(R.id.txt_info);
        this.B = (TextView) this.v.findViewById(R.id.txt_sub_info);
        this.C = (TextView) this.v.findViewById(R.id.txt_error_info);
        this.D = (TextView) this.v.findViewById(R.id.btn_info);
        this.E = (TextView) this.v.findViewById(R.id.btn_info_right);
        this.F = (TextView) this.v.findViewById(R.id.btn_info_left);
        this.H = (ImageView) this.v.findViewById(R.id.progress_info);
        this.G = (ImageView) this.v.findViewById(R.id.progress_round_info);
        this.am = this.v.findViewById(R.id.info_padding_1);
        this.an = this.v.findViewById(R.id.info_padding_2);
        this.ao = this.v.findViewById(R.id.info_padding_3);
        this.b = (ViewStub) this.v.findViewById(R.id.info_skeleton);
        this.x = (ViewGroup) this.v.findViewById(R.id.offline_container);
        if (this.x != null && com.sankuai.waimai.platform.modular.block.offline.c.a("homepage_offline_ui")) {
            this.y = new com.sankuai.waimai.platform.modular.block.offline.c(this.u, LayoutInflater.from(this.u), this.x);
            this.v.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int action;
                    Object[] objArr2 = {view2, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14bd3624ee6293ed17331986b3f32be4", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14bd3624ee6293ed17331986b3f32be4")).booleanValue();
                    }
                    if (d.this.ag) {
                        com.sankuai.waimai.platform.modular.block.offline.c cVar = d.this.y;
                        Object[] objArr3 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.modular.block.offline.c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "a25b7c207ec8367b9f557ba5498ccb8e", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "a25b7c207ec8367b9f557ba5498ccb8e")).booleanValue();
                        }
                        if (motionEvent == null || !cVar.d || cVar.c == null || cVar.c.a() == null || cVar.b.getVisibility() != 0 || !((action = motionEvent.getAction()) == 0 || action == 1)) {
                            return false;
                        }
                        if (cVar.c.e && action == 0) {
                            cVar.c.b();
                        }
                        ((WebView) cVar.c.a()).evaluateJavascript(String.format(Locale.CHINA, "javascript:onKnbTouchEvent(%d)", Integer.valueOf(action)), null);
                        return action == 0;
                    }
                    return false;
                }
            });
        }
        if (this.F != null) {
            this.F.setText(R.string.wm_commom_network_settings);
            this.F.setOnClickListener(this.aD);
        }
        this.ay = new Handler();
        Object[] objArr2 = {null};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bda7fc10c3537274769e7f12d9507b46", RobustBitConfig.DEFAULT_VALUE)) {
            d dVar = (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bda7fc10c3537274769e7f12d9507b46");
        } else {
            a(m, n, 0, o, (View.OnClickListener) null);
        }
        a((View.OnClickListener) null);
        b((View.OnClickListener) null);
        h();
    }

    public d(View view, int i2, int i3) {
        this(view, i2);
        String str;
        boolean z = false;
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3912332f80e38f0be3360e606a766ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3912332f80e38f0be3360e606a766ff");
        } else if (i3 != 0) {
            this.al = i3;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.skeleton.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2a2aa6cf1da3b90b46289ed2e36d5b88", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2a2aa6cf1da3b90b46289ed2e36d5b88")).booleanValue();
            } else {
                if (com.sankuai.waimai.foundation.core.a.e()) {
                    str = "waimai_skeleton_mt_group2";
                } else {
                    str = com.sankuai.waimai.foundation.core.a.f() ? "waimai_skeleton_dp_group2" : "waimai_skeleton_wm_group2";
                }
                ABStrategy a2 = com.sankuai.waimai.skeleton.a.a(str, null);
                if (a2 != null && "A".equalsIgnoreCase(a2.expName)) {
                    z = true;
                }
            }
            this.aC = z;
        }
    }

    public final void a(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ec7fa0fb0d17d56bf2204586cfac25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ec7fa0fb0d17d56bf2204586cfac25");
            return;
        }
        ah.b(this.am, i2);
        ah.b(this.an, i2 * 2);
        ah.b(this.ao, i3 * 3);
    }

    public final void a(String str) {
        this.w = str;
    }

    public final View a() {
        return this.v;
    }

    public final TextView b() {
        return this.A;
    }

    public final TextView c() {
        return this.E;
    }

    public final d a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8b7847063d488615d6ba9385e19041", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8b7847063d488615d6ba9385e19041");
        }
        this.v.setBackgroundResource(i2);
        return this;
    }

    public final d a(boolean z) {
        this.I = true;
        return this;
    }

    public final d b(int i2, String str, String str2, String str3, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i2), str, str2, str3, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd54d9b8af8458c9877f1c6bf4dfddbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd54d9b8af8458c9877f1c6bf4dfddbe");
        }
        this.N = i2;
        this.O = str;
        this.P = str2;
        this.Q = str3;
        this.R = onClickListener;
        return this;
    }

    public final d a(int i2, int i3, int i4, int i5, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20fb5992335c5b0f40c5642008391b62", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20fb5992335c5b0f40c5642008391b62") : b(i2, d(i3), d(i4), d(i5), onClickListener);
    }

    public final d b(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557b78468534dd7328b6be7e6da23879", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557b78468534dd7328b6be7e6da23879") : a(i2, i3, 0, 0, (View.OnClickListener) null);
    }

    private d c(int i2, String str, String str2, String str3, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i2), str, str2, str3, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f4a7e906c7e956f09c060b9bbcdba02", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f4a7e906c7e956f09c060b9bbcdba02");
        }
        this.S = i2;
        this.T = str;
        this.U = str2;
        this.V = str3;
        this.W = onClickListener;
        return this;
    }

    public final d a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        Object[] objArr = {onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03245bfbabac2817b085ffd251096884", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03245bfbabac2817b085ffd251096884");
        }
        this.ac = onClickListener;
        this.ae = d(r);
        this.ad = onClickListener2;
        this.af = d(q);
        return this;
    }

    public final d b(int i2, int i3, int i4, int i5, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e540b3bc48e1a1a238f983033e6823f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e540b3bc48e1a1a238f983033e6823f") : c(i2, d(i3), d(i4), d(i5), onClickListener);
    }

    public final d a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35db00b04852c8e9bb602ef861b688a2", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35db00b04852c8e9bb602ef861b688a2") : b(f, g, 0, h, onClickListener);
    }

    public d a(int i2, String str, String str2, String str3, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i2), str, str2, str3, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f600e99aae7788938a381db201e64654", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f600e99aae7788938a381db201e64654");
        }
        this.X = i2;
        this.Y = str;
        this.Z = str2;
        this.aa = str3;
        this.ab = onClickListener;
        return this;
    }

    private d c(int i2, int i3, int i4, int i5, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), 0, Integer.valueOf(i5), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74138d50e1f20388b3fd431db9573ac", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74138d50e1f20388b3fd431db9573ac") : a(i2, d(i3), d(0), d(i5), onClickListener);
    }

    public final d b(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252495b864f77a204dd2d4ddbd92c4e3", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252495b864f77a204dd2d4ddbd92c4e3") : c(j, k, 0, l, onClickListener);
    }

    public final d c(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf5a970caa736c903f34b56119194c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf5a970caa736c903f34b56119194c6");
        }
        a(onClickListener);
        b(onClickListener);
        return this;
    }

    public final void b(int i2) {
        this.J = R.string.wm_page_poiList_progressbar_loading;
    }

    public final d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986307a5368d761c8be4afa0d29a7ead", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986307a5368d761c8be4afa0d29a7ead") : c(this.J);
    }

    public final d c(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ef28349d483c8ed433cc37b0ed00489", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ef28349d483c8ed433cc37b0ed00489") : b(c(i2, this.J));
    }

    public final d b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8513d1b7a89c7e3e6a6c21481e0073d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8513d1b7a89c7e3e6a6c21481e0073d");
        }
        if (this.az && this.ax == null) {
            this.ax = new Runnable() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd3831eee5e24ab369ebe83cc41fc164", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd3831eee5e24ab369ebe83cc41fc164");
                    } else if (d.this.s == b.PROGRESS && com.sankuai.waimai.platform.net.d.a().d) {
                        ah.a(d.this.B, (int) R.string.wm_commom_weaknet_notice);
                        if (d.this.E != null) {
                            d.this.E.setVisibility(0);
                            d.this.E.setText(R.string.wm_commom_notice_know);
                            d.this.E.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.3.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "16fc07e7881194698b41cf15f42d8cac", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "16fc07e7881194698b41cf15f42d8cac");
                                        return;
                                    }
                                    ah.a(d.this.B, str);
                                    WeakNetReport.a(1002, d.this.u);
                                    if (d.this.F != null) {
                                        d.this.F.setVisibility(8);
                                    }
                                    d.this.E.setVisibility(8);
                                }
                            });
                        }
                    }
                }
            };
        }
        if (this.s != b.PROGRESS) {
            if (this.au == 0) {
                this.au = System.currentTimeMillis();
                if (this.az && this.aA > 0) {
                    this.ay.removeCallbacks(this.ax);
                    this.ay.postDelayed(this.ax, this.aA);
                }
            }
            this.aw = true;
            e(str);
            a(b.PROGRESS);
        } else if (!TextUtils.isEmpty(str) && !this.I && !ad.b()) {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dce45dc159a5ca425d2368a0e8bb2927", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dce45dc159a5ca425d2368a0e8bb2927");
                    } else {
                        d.this.B.setText(str);
                    }
                }
            });
        }
        t();
        m();
        return this;
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f15e0e124bf49284560df3a081150e39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f15e0e124bf49284560df3a081150e39");
        } else if (this.aC && this.b != null) {
            this.b.setVisibility(8);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f8ab92d876077bb8830070cbf74aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f8ab92d876077bb8830070cbf74aa7");
        } else if (!this.aC || this.b == null || this.al == 0) {
        } else {
            this.b.setLayoutResource(this.al);
            this.b.setVisibility(0);
        }
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddfb3c9d23d5cbc0005929bc711c7d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddfb3c9d23d5cbc0005929bc711c7d4a");
            return;
        }
        r();
        n();
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        if (this.I) {
            this.B.setVisibility(8);
        } else {
            ah.a(this.B, str);
        }
        if (this.D != null) {
            this.D.setVisibility(8);
        }
        if (this.F != null) {
            this.F.setVisibility(8);
        }
        if (this.E != null) {
            this.E.setVisibility(8);
        }
        this.v.setVisibility(0);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e815868c324222308b92854198572e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e815868c324222308b92854198572e5");
            return;
        }
        r();
        if (this.I) {
            ah.b(this.G, (int) R.drawable.wm_common_progress_rotate);
            this.H.setVisibility(8);
            this.G.setVisibility(0);
            return;
        }
        this.H.setVisibility(0);
        this.G.setVisibility(8);
    }

    private void o() {
        String queryParameter;
        Func2 func2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb750929687c0b583f412a7b20bc1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb750929687c0b583f412a7b20bc1e1");
            return;
        }
        if (this.I) {
            ah.a(this.G);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84c2d2035c4e1faef490dd7065f5828e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84c2d2035c4e1faef490dd7065f5828e");
        } else if (com.sankuai.waimai.foundation.core.a.b() && this.aw) {
            this.av = System.currentTimeMillis();
            long j2 = this.av - this.au;
            if (!(this.u instanceof Activity) || j2 <= 100) {
                return;
            }
            Activity activity = (Activity) this.u;
            if (activity.getIntent().getData() == null || (queryParameter = activity.getIntent().getData().getQueryParameter("id")) == null || TextUtils.isEmpty(queryParameter) || (func2 = (Func2) com.sankuai.waimai.router.a.a(Func2.class, "_netTest_pageTime_report")) == null) {
                return;
            }
            func2.call(queryParameter, Long.valueOf(j2));
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6479daa55e429ec0813261c6bee35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6479daa55e429ec0813261c6bee35e");
            return;
        }
        if (this.I) {
            ah.a(this.G);
        }
        this.ay.removeCallbacks(this.ax);
        if (this.ag && ((this.s == b.DATA_ERROR || this.s == b.NET_ERROR) && this.aj && this.ai > 0)) {
            com.sankuai.waimai.platform.modular.block.offline.d.a(this.u, "homepage_offline_ui", this.aB, "exit", (int) this.ai);
            this.ah = 0L;
            this.ai = 0L;
            return;
        }
        this.aj = false;
        this.ah = 0L;
        this.ai = 0L;
    }

    public final d f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aaf15bf8a27b4498236a837a0fc9df8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aaf15bf8a27b4498236a837a0fc9df8");
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.b(this.u, "waimai");
        r();
        this.L = this.P;
        a(b.EMPTY, (com.sankuai.waimai.platform.widget.emptylayout.b) null);
        String str = this.L;
        String str2 = this.K;
        return a(b.EMPTY, this.N, this.O, str, this.Q, this.R);
    }

    public final d g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21615691a7afc9670109c5872d62dd2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21615691a7afc9670109c5872d62dd2c");
        }
        this.aq = false;
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u);
        com.sankuai.waimai.platform.bizdiagnosis.a.a("waimai", a.EnumC1038a.Native, this.u, (float) (System.currentTimeMillis() - this.at));
        r();
        a(b.NET_ERROR, (com.sankuai.waimai.platform.widget.emptylayout.b) null);
        String str = this.U;
        String str2 = this.L;
        String str3 = this.K;
        return a(b.NET_ERROR, this.S, this.T, c.a(str, str2), this.V, this.W);
    }

    public final d c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b537a36f37aa5d79b1bc873629da1355", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b537a36f37aa5d79b1bc873629da1355");
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u);
        com.sankuai.waimai.platform.bizdiagnosis.a.a("waimai", a.EnumC1038a.Native, this.u, (float) (System.currentTimeMillis() - this.at));
        r();
        a(b.NET_ERROR, (com.sankuai.waimai.platform.widget.emptylayout.b) null);
        String str2 = this.U;
        String str3 = this.L;
        String str4 = this.K;
        return a(b.NET_ERROR, this.S, str, c.a(str2, str3), this.V, this.W);
    }

    public final d a(String str, @NonNull com.sankuai.waimai.platform.widget.emptylayout.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf3f4537ba97e1b7b7f7866e9a5eb0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf3f4537ba97e1b7b7f7866e9a5eb0d");
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u);
        com.sankuai.waimai.platform.bizdiagnosis.a.a("waimai", a.EnumC1038a.Native, this.u, (float) (System.currentTimeMillis() - this.at));
        r();
        a(b.NET_ERROR, bVar);
        String str2 = this.U;
        String str3 = this.L;
        String str4 = this.K;
        return a(b.NET_ERROR, this.S, str, c.a(str2, str3), this.V, this.W);
    }

    public final d a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438ee3b7c940e67ec62790b387d2f821", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438ee3b7c940e67ec62790b387d2f821");
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u);
        com.sankuai.waimai.platform.bizdiagnosis.a.a("waimai", a.EnumC1038a.Native, this.u, (float) (System.currentTimeMillis() - this.at));
        r();
        this.L = str2;
        a(b.NET_ERROR, (com.sankuai.waimai.platform.widget.emptylayout.b) null);
        String str3 = this.L;
        String str4 = this.K;
        return a(b.NET_ERROR, this.S, str, str3, this.V, this.W);
    }

    public final d a(String str, int i2, String str2) {
        Object[] objArr = {str, Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b75918fcc226965fafeb73f752ecd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b75918fcc226965fafeb73f752ecd8");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.Y;
        }
        if (TextUtils.isEmpty(str)) {
            str = d(k);
        }
        String str3 = str;
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u, "waimai");
        r();
        return a(b.DATA_ERROR, this.X, str3, com.sankuai.waimai.monitor.a.a(this.u, i2).b(str2).a(), this.aa, this.ab);
    }

    public final d a(String str, Throwable th, String str2) {
        Object[] objArr = {str, th, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99776fe78750920047dce0984beabefb", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99776fe78750920047dce0984beabefb");
        }
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u);
        r();
        return a(b.NET_ERROR, this.S, str, com.sankuai.waimai.monitor.a.a(this.u, th).b(str2).a(), this.V, this.W);
    }

    public final d d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a46dc586fced46b3f448a03c690133e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a46dc586fced46b3f448a03c690133e");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.Y;
        }
        if (TextUtils.isEmpty(str)) {
            str = d(k);
        }
        String str2 = str;
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u, "waimai");
        com.sankuai.waimai.platform.bizdiagnosis.a.a("waimai", a.EnumC1038a.Native, this.u, (float) (System.currentTimeMillis() - this.at));
        r();
        a(b.DATA_ERROR, (com.sankuai.waimai.platform.widget.emptylayout.b) null);
        String str3 = this.L;
        String str4 = this.K;
        return a(b.DATA_ERROR, this.X, str2, str3, this.aa, this.ab);
    }

    public final d b(String str, @NonNull com.sankuai.waimai.platform.widget.emptylayout.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b17c2fd852a10fc3d7fa0fcf56be5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b17c2fd852a10fc3d7fa0fcf56be5c");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.Y;
        }
        if (TextUtils.isEmpty(str)) {
            str = d(k);
        }
        String str2 = str;
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u, "waimai");
        com.sankuai.waimai.platform.bizdiagnosis.a.a("waimai", a.EnumC1038a.Native, this.u, (float) (System.currentTimeMillis() - this.at));
        r();
        a(b.DATA_ERROR, bVar);
        String str3 = this.L;
        String str4 = this.K;
        return a(b.DATA_ERROR, this.X, str2, str3, this.aa, this.ab);
    }

    public final d a(String str, String str2, com.sankuai.waimai.platform.widget.emptylayout.b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df29dccccb7822ae16848ce7fe4923e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df29dccccb7822ae16848ce7fe4923e2");
        }
        if (TextUtils.isEmpty(str)) {
            str = this.Y;
        }
        if (TextUtils.isEmpty(str)) {
            str = d(k);
        }
        String str3 = str;
        com.sankuai.waimai.platform.bizdiagnosis.a.a(this.u, "waimai");
        r();
        this.L = str2;
        a(b.DATA_ERROR, bVar);
        return a(b.DATA_ERROR, this.X, str3, str2, this.aa, this.ab);
    }

    public final d h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21869645e66b1da7a61a2e1e0c3f56f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21869645e66b1da7a61a2e1e0c3f56f1");
        }
        if (this.s != b.HIDE) {
            l();
            p();
            if (this.y != null) {
                this.y.b();
            }
            a(b.HIDE);
        }
        return this;
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be12e1c3af44c80931b82253399beab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be12e1c3af44c80931b82253399beab");
            return;
        }
        if (this.ar) {
            if (this.aq) {
                WeakNetReport.a(3001, this.u);
            } else if (this.ap) {
                WeakNetReport.a(2001, this.u);
            }
        }
        this.aq = false;
        this.ap = false;
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e7ae97e9593fd22c0009b56fc27f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e7ae97e9593fd22c0009b56fc27f6f");
            return;
        }
        this.v.setVisibility(8);
        this.H.setVisibility(8);
        o();
    }

    public final boolean j() {
        return this.s != b.HIDE;
    }

    public final String k() {
        return this.K;
    }

    private boolean a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cff094388b8b098e69ab59b8705021d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cff094388b8b098e69ab59b8705021d")).booleanValue();
        }
        if (bVar != this.s) {
            b bVar2 = this.s;
            this.s = bVar;
            if (com.sankuai.waimai.foundation.utils.b.a(this.t)) {
                Iterator<a> it = this.t.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.ag && ((bVar2 == b.DATA_ERROR || bVar2 == b.NET_ERROR) && this.aj)) {
                this.aj = false;
                if (this.ah > 0 || this.ai > 0) {
                    com.sankuai.waimai.platform.modular.block.offline.d.a(this.u, "homepage_offline_ui", this.aB, "statusChange", (int) ((this.ah > 0 ? SystemClock.elapsedRealtime() - this.ah : 0L) + this.ai));
                    this.ah = 0L;
                    this.ai = 0L;
                }
            }
            return true;
        }
        return false;
    }

    public final d a(b bVar, int i2, String str, String str2, String str3, final View.OnClickListener onClickListener) {
        int i3;
        String str4 = str3;
        Object[] objArr = {bVar, Integer.valueOf(i2), str, str2, str4, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18a777106a65a29f269d763fde6d4da", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18a777106a65a29f269d763fde6d4da");
        }
        l();
        this.aB = com.sankuai.waimai.platform.net.d.a().e;
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        o();
        int i4 = a(bVar, false) ? 0 : i2;
        u();
        ah.a(this.z, i4);
        ah.a(this.A, str);
        if (this.C != null) {
            this.B.setVisibility(8);
            ah.a(this.C, str2);
        } else {
            ah.a(this.B, str2);
        }
        if (this.F == null || this.E == null) {
            if (onClickListener == null || TextUtils.isEmpty(str3)) {
                i3 = 0;
                this.D.setVisibility(8);
            } else {
                this.D.setOnClickListener(onClickListener);
                this.D.setText(str4);
                i3 = 0;
                this.D.setVisibility(0);
            }
        } else {
            if (s()) {
                String string = this.u.getString(R.string.wm_common_refresh);
                if (this.F != null) {
                    this.F.setVisibility(0);
                }
                str4 = string;
            }
            if (onClickListener == null || TextUtils.isEmpty(str4)) {
                this.E.setVisibility(8);
            } else {
                this.E.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e77352bc948bd19be454b81d15d9bfa", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e77352bc948bd19be454b81d15d9bfa");
                            return;
                        }
                        if (d.this.ar && !d.this.aq) {
                            WeakNetReport.a(2002, d.this.u);
                        }
                        d.a(d.this, true);
                        d.a(d.this, 0L);
                        d.this.ay.removeCallbacks(d.this.ax);
                        onClickListener.onClick(d.this.E);
                    }
                });
                this.E.setText(str4);
                this.E.setVisibility(0);
                if (this.ar) {
                    WeakNetReport.a(2000, this.u);
                }
            }
            i3 = 0;
        }
        WeakNetReport.a(MapConstant.LayerPropertyFlag_MarkerSpacing, this.u);
        this.v.setVisibility(i3);
        a(bVar);
        if (com.sankuai.waimai.platform.net.d.a().d && com.sankuai.waimai.foundation.core.a.d() && com.sankuai.waimai.platform.net.d.a().c() && (this.v.getContext() instanceof BaseActivity)) {
            if (this.as == null) {
                this.as = new d.a() { // from class: com.sankuai.waimai.platform.widget.emptylayout.d.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.d.a, com.sankuai.waimai.platform.net.d.b
                    public final void a(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "902652dc1cef0ba8caae7b7cf5e762af", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "902652dc1cef0ba8caae7b7cf5e762af");
                        } else if (z) {
                            d.b(d.this, true);
                            WeakNetReport.a(3002, d.this.u);
                            if (d.this.E != null) {
                                d.this.E.performClick();
                            }
                            com.sankuai.waimai.platform.net.d.a().a(this);
                        }
                    }
                };
            }
            com.sankuai.waimai.platform.net.d.a().a((BaseActivity) this.v.getContext(), this.as);
        }
        return this;
    }

    private void a(b bVar, com.sankuai.waimai.platform.widget.emptylayout.b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f2a932fb5b957e6a93d0a5e83d94f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f2a932fb5b957e6a93d0a5e83d94f7");
            return;
        }
        if (bVar2 != null && bVar2.a != null) {
            this.L = com.sankuai.waimai.monitor.a.a(this.u, bVar2.a).a();
        }
        if (!TextUtils.isEmpty(this.L)) {
            this.K = c.a();
        } else {
            this.K = "";
        }
        this.M = bVar2;
        if (this.M == null) {
            this.M = new com.sankuai.waimai.platform.widget.emptylayout.b(true);
        }
        c.a(q(), this.L, this.K, this.M);
    }

    private String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f081bee157a1cea600d25dd79a14ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f081bee157a1cea600d25dd79a14ef");
        }
        String str = this.w != null ? d.get(this.w) : null;
        if (TextUtils.isEmpty(str)) {
            str = com.sankuai.waimai.platform.bizdiagnosis.a.d(this.u);
            if (!TextUtils.isEmpty(str)) {
                str = str + "_page_error";
            }
        }
        return TextUtils.isEmpty(str) ? "NetInfo_page_error" : str;
    }

    private void r() {
        this.L = "";
        this.K = "";
        this.M = null;
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a22e1601c98e14151748668a8136645", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a22e1601c98e14151748668a8136645")).booleanValue();
        }
        this.ar = com.sankuai.waimai.platform.net.d.a().d;
        return this.ar;
    }

    public final String d(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e24c4419bc5a66f14367ddd5b34ae9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e24c4419bc5a66f14367ddd5b34ae9") : a(i2, "");
    }

    private String c(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8875c230aad6499e59f37e5cf8db1111", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8875c230aad6499e59f37e5cf8db1111");
        }
        String a2 = a(i2, (String) null);
        return a2 == null ? a(i3, "") : a2;
    }

    private String a(int i2, String str) {
        Object[] objArr = {Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4278c2c8aa284b437b7ea19a15f32ab5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4278c2c8aa284b437b7ea19a15f32ab5");
        }
        if (i2 != 0) {
            try {
                return this.u.getString(i2);
            } catch (Resources.NotFoundException e2) {
                com.sankuai.waimai.foundation.utils.log.a.a(e2);
            }
        }
        return str;
    }

    private boolean a(b bVar, boolean z) {
        Object[] objArr = {bVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd674275229fe63c186dcfc287c8700", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd674275229fe63c186dcfc287c8700")).booleanValue();
        }
        if (this.ag && bVar == b.NET_ERROR) {
            this.aj = true;
            this.ah = SystemClock.elapsedRealtime();
            this.ai = 0L;
            if (this.y != null) {
                this.y.e = this.aB;
                if (!this.ak) {
                    com.sankuai.waimai.platform.modular.block.offline.d.a(this.u, "homepage_offline_ui", this.aB, "show");
                    this.ak = true;
                }
                this.x.setVisibility(0);
                this.y.a();
                return true;
            }
        } else {
            this.ah = 0L;
            this.ai = 0L;
        }
        t();
        return false;
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9b9fc51348cebd51e7221be499c4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9b9fc51348cebd51e7221be499c4fe");
            return;
        }
        if (this.x != null) {
            this.x.setVisibility(8);
        }
        if (this.y != null) {
            this.y.b();
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e649a910f371c405fdd5d0d4f25b9c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e649a910f371c405fdd5d0d4f25b9c86");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        this.z.setLayoutParams(layoutParams);
    }
}
