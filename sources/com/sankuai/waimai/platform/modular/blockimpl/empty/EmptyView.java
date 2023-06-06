package com.sankuai.waimai.platform.modular.blockimpl.empty;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.net.d;
import com.sankuai.waimai.platform.widget.emptylayout.b;
import com.sankuai.waimai.router.method.Func2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class EmptyView extends FrameLayout {
    private static final int P = 2131692971;
    private static final int Q = 2131692223;
    public static ChangeQuickRedirect a = null;
    public static final int b = 2131364207;

    /* renamed from: c */
    public static final int wm_common_default_net_error_icon = 2130841221;
    public static final int d = 2131364212;
    public static final int e = 2131364218;

    /* renamed from: f */
    public static final int wm_commom_network_settings = 2131364200;

    /* renamed from: g */
    public static final int wm_common_default_data_error_icon = 2130841219;
    public static final int h = 2131364208;
    public static final int i = 2131364218;

    /* renamed from: j */
    public static final int wm_common_default_empty_icon = 2130841220;

    /* renamed from: k */
    public static final int wm_common_no_content = 2131364213;
    public static final int l = 2131364218;
    protected String A;
    protected String B;
    protected View.OnClickListener C;
    protected int D;
    protected String E;
    protected String F;
    protected String G;
    protected View.OnClickListener H;
    protected int I;
    protected String J;
    protected String K;
    protected String L;
    protected View.OnClickListener M;
    public b N;
    protected View.OnClickListener O;
    private a R;
    private List<Object> S;
    private String T;
    private long U;
    private long V;
    private boolean W;
    private View aa;
    private View ab;
    private View ac;
    protected Context m;
    protected ViewGroup n;
    protected ViewGroup o;
    protected ImageView p;
    protected TextView q;
    protected TextView r;
    protected TextView s;
    protected TextView t;
    protected ImageView u;
    protected ImageView v;
    protected boolean w;
    protected int x;
    protected int y;
    protected String z;

    public View getView() {
        return this;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        INITIAL,
        HIDE,
        PROGRESS,
        DATA_ERROR,
        NET_ERROR,
        EMPTY;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ffa92e0365e0a9af8410ca49f75548", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ffa92e0365e0a9af8410ca49f75548");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13e092081bcdf93ecea437c46bfbb334", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13e092081bcdf93ecea437c46bfbb334") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a85e8d4abb2fb7e8f4dc0ce06f7e9fe", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a85e8d4abb2fb7e8f4dc0ce06f7e9fe") : (a[]) values().clone();
        }
    }

    public EmptyView(@NonNull Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb49a6d32cfc7391d74dff65cbdaa48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb49a6d32cfc7391d74dff65cbdaa48");
        }
    }

    public EmptyView(@NonNull Context context, String str) {
        this(context, null, 0);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c9d95c5e1c79b58134b4bcaa9d1408", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c9d95c5e1c79b58134b4bcaa9d1408");
        } else {
            this.T = str;
        }
    }

    public EmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd3937a4376b8a7323ce47ccc194f5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd3937a4376b8a7323ce47ccc194f5c");
        }
    }

    public EmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c352a7666274fac91a269c95c7bfbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c352a7666274fac91a269c95c7bfbb");
            return;
        }
        this.R = a.INITIAL;
        this.S = new ArrayList(1);
        this.w = false;
        this.x = b;
        this.U = 0L;
        this.W = false;
        this.O = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.modular.blockimpl.empty.EmptyView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49c7180d412b90506136db97877471ec", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49c7180d412b90506136db97877471ec");
                } else {
                    EmptyView.this.m.startActivity(new Intent("android.settings.SETTINGS"));
                }
            }
        };
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32246e736618f3a84b0b2228c016c36e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32246e736618f3a84b0b2228c016c36e");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_modular_empty_layout, (ViewGroup) null);
        this.n = (ViewGroup) inflate.findViewById(P);
        this.o = (ViewGroup) inflate.findViewById(Q);
        if (this.n == null) {
            throw new Resources.NotFoundException("Cannot find NetInfo Layout!");
        }
        if (this.o == null) {
            throw new Resources.NotFoundException("Cannot find NetInfo Layout!");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a722a35366fa937c48a72f15c1f6cfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a722a35366fa937c48a72f15c1f6cfd");
        } else {
            this.m = this.n.getContext();
            this.p = (ImageView) this.n.findViewById(R.id.img_info);
            this.q = (TextView) this.n.findViewById(R.id.txt_info);
            this.r = (TextView) this.n.findViewById(R.id.txt_sub_info);
            this.s = (TextView) this.o.findViewById(R.id.btn_right_info);
            this.t = (TextView) this.o.findViewById(R.id.btn_left_info);
            this.t.setText(wm_commom_network_settings);
            this.t.setOnClickListener(this.O);
            this.v = (ImageView) this.n.findViewById(R.id.progress_info);
            this.u = (ImageView) this.n.findViewById(R.id.progress_round_info);
            this.aa = this.n.findViewById(R.id.info_padding_1);
            this.ab = this.n.findViewById(R.id.info_padding_2);
            this.ac = this.n.findViewById(R.id.info_padding_3);
            setEmpty(null);
            setNetError(null);
            setDataError(null);
            a();
        }
        addView(inflate);
    }

    public void setPageCid(String str) {
        this.T = str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4293809c7aa37a47886d08ab435e334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4293809c7aa37a47886d08ab435e334");
        } else if (this.R != a.HIDE) {
            d();
            a(a.HIDE);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b72cd857ddc922f390bb1f57361c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b72cd857ddc922f390bb1f57361c64");
        } else {
            setVisibility(0);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80585115795106b0febe161dc7dcd25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80585115795106b0febe161dc7dcd25");
            return;
        }
        setVisibility(8);
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798b8ca645c3f45ba1e4fdedf08e4978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798b8ca645c3f45ba1e4fdedf08e4978");
            return;
        }
        if (this.w) {
            ah.a(this.u);
        }
        f();
    }

    private boolean a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47aea134dd5489d8795196afeba87e13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47aea134dd5489d8795196afeba87e13")).booleanValue();
        }
        if (aVar != this.R) {
            this.R = aVar;
            if (!this.S.isEmpty()) {
                Iterator<Object> it = this.S.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            return true;
        }
        return false;
    }

    public final void a(a aVar, int i2, String str, String str2, String str3, final View.OnClickListener onClickListener) {
        String str4;
        Object[] objArr = {aVar, Integer.valueOf(i2), str, str2, str3, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26117259f40ee4b4079ab7b298ca8f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26117259f40ee4b4079ab7b298ca8f3");
            return;
        }
        setVisibility(0);
        this.v.setVisibility(8);
        e();
        ah.a(this.u);
        ah.a(this.p, i2);
        ah.a(this.q, str);
        ah.a(this.r, str2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "336f210814bd64cfd977b1fa3cbd472e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "336f210814bd64cfd977b1fa3cbd472e")).booleanValue() : d.a().d) {
            String string = this.m.getString(R.string.wm_common_refresh);
            this.t.setVisibility(0);
            str4 = string;
        } else {
            str4 = str3;
        }
        if (onClickListener == null || TextUtils.isEmpty(str4)) {
            this.s.setVisibility(8);
        } else {
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.modular.blockimpl.empty.EmptyView.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "509f86c1f8a6af1023c5ee3f2c8b6655", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "509f86c1f8a6af1023c5ee3f2c8b6655");
                    } else {
                        onClickListener.onClick(EmptyView.this.s);
                    }
                }
            });
            this.s.setText(str4);
            this.s.setVisibility(0);
        }
        a(aVar);
    }

    public void setEmpty(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36379832b7cb35588a9464724394b317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36379832b7cb35588a9464724394b317");
            return;
        }
        int i2 = wm_common_default_empty_icon;
        int i3 = wm_common_no_content;
        int i4 = l;
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), 0, Integer.valueOf(i4), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "109a756f33efff039a1bdabcbaec08d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "109a756f33efff039a1bdabcbaec08d9");
            return;
        }
        String b2 = b(i3);
        String b3 = b(0);
        String b4 = b(i4);
        Object[] objArr3 = {Integer.valueOf(i2), b2, b3, b4, onClickListener};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2f06be2dc65d12ef08f2d9fe7cbaebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2f06be2dc65d12ef08f2d9fe7cbaebd");
            return;
        }
        this.y = i2;
        this.z = b2;
        this.A = b3;
        this.B = b4;
        this.C = onClickListener;
    }

    public String getPageName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a02207851f55386e47d4baacf83e062", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a02207851f55386e47d4baacf83e062");
        }
        String str = this.T != null ? com.sankuai.waimai.platform.widget.emptylayout.d.d.get(this.T) : null;
        if (TextUtils.isEmpty(str)) {
            str = com.sankuai.waimai.platform.bizdiagnosis.a.d(this.m);
            if (!TextUtils.isEmpty(str)) {
                str = str + "_page_error";
            }
        }
        return TextUtils.isEmpty(str) ? "EmptyView_page_error" : str;
    }

    public final void a(int i2) {
        String a2;
        Object[] objArr = {Integer.valueOf((int) R.string.wm_common_loading)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e7c9f137668bfca1afd251ee7a18c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e7c9f137668bfca1afd251ee7a18c9");
            return;
        }
        int i3 = this.x;
        Object[] objArr2 = {Integer.valueOf((int) R.string.wm_common_loading), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ec42c951184678774f24457b37b7b32", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ec42c951184678774f24457b37b7b32");
        } else {
            a2 = a(R.string.wm_common_loading, null);
            if (a2 == null) {
                a2 = a(i3, "");
            }
        }
        String str = a2;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccbb2c7242ba199d15dc0bae9fa0b7d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccbb2c7242ba199d15dc0bae9fa0b7d3");
        } else if (this.R != a.PROGRESS) {
            if (this.U == 0) {
                this.U = System.currentTimeMillis();
            }
            this.W = true;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b0c358f9c0932bb0213b3731876f2496", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b0c358f9c0932bb0213b3731876f2496");
            } else {
                this.N = null;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "847b55e6d9b789945ab225e338e8ccb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "847b55e6d9b789945ab225e338e8ccb9");
                } else if (this.w) {
                    ah.b(this.u, (int) R.drawable.wm_common_progress_rotate);
                    this.v.setVisibility(8);
                    this.u.setVisibility(0);
                } else {
                    this.v.setVisibility(0);
                    this.u.setVisibility(8);
                }
                this.p.setVisibility(8);
                this.q.setVisibility(8);
                if (this.w) {
                    this.r.setVisibility(8);
                } else {
                    ah.a(this.r, str);
                }
                this.s.setVisibility(8);
                this.t.setVisibility(8);
                setVisibility(0);
            }
            a(a.PROGRESS);
        } else if (TextUtils.isEmpty(str) || this.w) {
        } else {
            this.r.setText(str);
        }
    }

    public void setNetError(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20cbc25cf9ba357bdeab9f25fa402071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20cbc25cf9ba357bdeab9f25fa402071");
            return;
        }
        int i2 = wm_common_default_net_error_icon;
        int i3 = d;
        int i4 = e;
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), 0, Integer.valueOf(i4), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "027178a5515df437588c640d953a243b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "027178a5515df437588c640d953a243b");
            return;
        }
        String b2 = b(i3);
        String b3 = b(0);
        String b4 = b(i4);
        Object[] objArr3 = {Integer.valueOf(i2), b2, b3, b4, onClickListener};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c4e8c094c1320deb8f1116cd6559de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c4e8c094c1320deb8f1116cd6559de0");
            return;
        }
        this.D = i2;
        this.E = b2;
        this.F = b3;
        this.G = b4;
        this.H = onClickListener;
    }

    public void setDataError(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cda12ef171107af3212daa62f3b1377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cda12ef171107af3212daa62f3b1377");
            return;
        }
        int i2 = wm_common_default_data_error_icon;
        int i3 = h;
        int i4 = i;
        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), 0, Integer.valueOf(i4), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50fe134c5715641a4254bf371563a165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50fe134c5715641a4254bf371563a165");
            return;
        }
        String b2 = b(i3);
        String b3 = b(0);
        String b4 = b(i4);
        Object[] objArr3 = {Integer.valueOf(i2), b2, b3, b4, onClickListener};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08407346c2e936a33dfcfbe01ced7e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08407346c2e936a33dfcfbe01ced7e51");
            return;
        }
        this.I = i2;
        this.J = b2;
        this.K = b3;
        this.L = b4;
        this.M = onClickListener;
    }

    public void setNetAndDataError(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835c74ba75fdef72681ba633dda97760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835c74ba75fdef72681ba633dda97760");
            return;
        }
        setNetError(onClickListener);
        setDataError(onClickListener);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d426f1f738c900991fb3077f318e56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d426f1f738c900991fb3077f318e56")).booleanValue() : getVisibility() == 0;
    }

    private void f() {
        String queryParameter;
        Func2 func2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558999080bc656ff8bd6a935e885b3a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558999080bc656ff8bd6a935e885b3a5");
        } else if (com.sankuai.waimai.foundation.core.a.b() && this.W) {
            this.V = System.currentTimeMillis();
            long j = this.V - this.U;
            if (!(this.m instanceof Activity) || j <= 100) {
                return;
            }
            Activity activity = (Activity) this.m;
            if (activity.getIntent().getData() == null || (queryParameter = activity.getIntent().getData().getQueryParameter("id")) == null || TextUtils.isEmpty(queryParameter) || (func2 = (Func2) com.sankuai.waimai.router.a.a(Func2.class, "_netTest_pageTime_report")) == null) {
                return;
            }
            func2.call(queryParameter, Long.valueOf(j));
        }
    }

    private String b(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c820f7fc9bce63486a01b91db9f0b803", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c820f7fc9bce63486a01b91db9f0b803") : a(i2, "");
    }

    private String a(int i2, String str) {
        Object[] objArr = {Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6147d37fdf6a9896a0ce22e0574dcab4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6147d37fdf6a9896a0ce22e0574dcab4");
        }
        if (i2 != 0) {
            try {
                return this.m.getString(i2);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }
}
