package com.meituan.mmp.lib.api.input.textarea;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.ae;
import com.meituan.mmp.lib.utils.az;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class d extends com.meituan.mmp.lib.api.input.a implements com.meituan.mmp.lib.api.input.textarea.a, c, com.meituan.mmp.lib.page.c {
    public static PopupWindow A = null;
    public static int D = 0;
    public static boolean F = false;
    public static boolean S = true;
    public static boolean T = true;
    private static int aa;
    private static int af;
    private static int ag;
    public static ChangeQuickRedirect x;
    public boolean B;
    public boolean C;
    public boolean E;
    public boolean G;
    public boolean H;
    public boolean I;
    public String J;
    public int K;
    public long L;
    public long M;
    public int N;
    public Runnable O;
    public boolean P;
    public float Q;
    public float R;
    private String V;
    private TextView W;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private int ah;
    private Handler ai;
    public a y;
    public int z;

    @Override // com.meituan.mmp.lib.api.input.a, com.meituan.mmp.lib.api.input.d
    public int getInputHeight() {
        return 0;
    }

    @Override // com.meituan.mmp.lib.api.input.a
    public String getType() {
        return "textarea";
    }

    public static /* synthetic */ void a(d dVar, final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "227c19708fa07aec122fd5468730f339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "227c19708fa07aec122fd5468730f339");
        } else {
            dVar.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c736a2a99d07db36d3178bce18667da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c736a2a99d07db36d3178bce18667da");
                        return;
                    }
                    int intValue = d.this.u.getTextAreaOriginPositionManager().d.get(d.this.j).intValue();
                    if (intValue <= d.this.getHeight()) {
                        return;
                    }
                    if (i < 0) {
                        Rect rect = new Rect();
                        d.this.getGlobalVisibleRect(rect);
                        if (rect.top + i < intValue) {
                            return;
                        }
                    }
                    int currentWebViewPageHeight = d.this.u.getCurrentWebViewPageHeight();
                    Rect rect2 = new Rect();
                    d.this.getGlobalVisibleRect(rect2);
                    if (rect2.bottom + d.D + p.d(42) > p.e() && currentWebViewPageHeight == d.this.N) {
                        d.this.u.d(i);
                    } else if (currentWebViewPageHeight > d.this.N) {
                        d.this.u.c(i);
                        d.this.N = currentWebViewPageHeight;
                    }
                }
            }, 0L);
        }
    }

    public d(Context context, String str, int i, String str2, com.meituan.mmp.lib.interfaces.c cVar) {
        super(context, str, i, str2, cVar);
        Object[] objArr = {context, str, Integer.valueOf(i), str2, cVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86bbcd9986cedfad8f5569f02df0c2da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86bbcd9986cedfad8f5569f02df0c2da");
            return;
        }
        this.z = 0;
        this.B = false;
        this.C = false;
        this.E = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = true;
        this.K = 0;
        this.L = 0L;
        this.M = 0L;
        this.ah = 0;
        this.ai = new Handler();
        this.N = 0;
        this.O = new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.8
            @Override // java.lang.Runnable
            public final void run() {
                d.this.P = true;
            }
        };
        this.P = false;
        this.R = 0.0f;
        b.a.b("TextArea", "create: " + this.j);
        setSingleLine(false);
        setGravity(GravityCompat.START);
        setInputType(131073);
        setTextSize(15.0f);
        D = 0;
        setOnKeyListener(new View.OnKeyListener() { // from class: com.meituan.mmp.lib.api.input.textarea.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                Object[] objArr2 = {view, Integer.valueOf(i2), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e140efd5404c2bad86cfc3301db5eeff", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e140efd5404c2bad86cfc3301db5eeff")).booleanValue();
                }
                if (i2 == 67) {
                    d.this.L = System.currentTimeMillis();
                }
                if (i2 == 66) {
                    d.this.M = System.currentTimeMillis();
                }
                return false;
            }
        });
    }

    @Override // com.meituan.mmp.lib.api.input.a
    public final void a(com.meituan.mmp.lib.page.e eVar) {
        e textAreaHeightChangeManager;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e26c0a1fcceecc973ea54389525e189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e26c0a1fcceecc973ea54389525e189");
            return;
        }
        super.a(eVar);
        if (this.u != null && this.u.getSwipeRefreshLayout() != null && this.u.getSwipeRefreshLayout().getCoverViewContainer() != null && (textAreaHeightChangeManager = this.u.getSwipeRefreshLayout().getCoverViewContainer().getTextAreaHeightChangeManager()) != null) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, textAreaHeightChangeManager, changeQuickRedirect2, false, "9dd9a74701efc78ada9359090ac9f98d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, textAreaHeightChangeManager, changeQuickRedirect2, false, "9dd9a74701efc78ada9359090ac9f98d");
            } else {
                textAreaHeightChangeManager.b.add(this);
            }
        }
        if (this.u != null) {
            com.meituan.mmp.lib.page.e eVar2 = this.u;
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "0172fd74af34880e2bbe5dbb2d93e7b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "0172fd74af34880e2bbe5dbb2d93e7b5");
            } else if (eVar2.p != null) {
                eVar2.p.c().getContainerObserver().b = this;
            }
        }
    }

    public static boolean e() {
        return F;
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffa45f74014dbfad1766da52df7e07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffa45f74014dbfad1766da52df7e07c");
            return;
        }
        D = i;
        F = true;
        if (this.B) {
            if (az.a()) {
                b.b.c = this;
            }
            if (((Activity) this.u.getContext()).getCurrentFocus() instanceof d) {
                b(p.a(getContext()) / 2, i);
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf70f8056004ec16fe83b4ce423135b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf70f8056004ec16fe83b4ce423135b")).booleanValue() : this.j.equalsIgnoreCase(str);
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b1a3bdd45efd4b986e9a40e3b5e864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b1a3bdd45efd4b986e9a40e3b5e864");
        } else if (A != null && A.isShowing()) {
            c(i, i2);
        } else {
            View inflate = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.soft_keyboard_top_ok_view, (ViewGroup) null);
            this.W = (TextView) inflate.findViewById(R.id.keyboard_top_view_ok_txt);
            this.W.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.input.textarea.d.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7866e0bb91e5a8110a8192b4553e3fc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7866e0bb91e5a8110a8192b4553e3fc");
                        return;
                    }
                    d.this.c();
                    d.this.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcccb80eb3f6ef4ec32909df079bbf71", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcccb80eb3f6ef4ec32909df079bbf71");
                                return;
                            }
                            d.f();
                            y.a((Activity) d.this.getContext());
                        }
                    }, 1000L);
                }
            });
            af = i;
            ag = i2;
            View findViewById = ((Activity) getContext()).findViewById(R.id.container);
            PopupWindow popupWindow = new PopupWindow(inflate, -1, -2, true);
            A = popupWindow;
            popupWindow.setTouchable(true);
            A.setOutsideTouchable(false);
            A.setFocusable(false);
            try {
                com.sankuai.waimai.platform.utils.p.a(A, findViewById, 80, i, i2);
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a("TextArea", e);
            }
        }
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc09c5a4c9572cdcf82addcc8bfef08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc09c5a4c9572cdcf82addcc8bfef08");
        } else if (A == null || !A.isShowing() || Build.MODEL.equalsIgnoreCase("SM-G9209")) {
        } else {
            try {
                A.update(i, i2, A.getWidth(), A.getHeight());
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void G_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02e36abd1dc47cec1538e7fbfaf8039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02e36abd1dc47cec1538e7fbfaf8039");
            return;
        }
        F = false;
        this.H = false;
        if (this.u != null) {
            this.u.clearFocus();
            clearFocus();
        }
        f();
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void b() {
        F = true;
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.c
    public final void H_() {
        F = false;
    }

    public static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b94de858d71648ba20a084320e3e505e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b94de858d71648ba20a084320e3e505e");
        } else if (A == null || !A.isShowing()) {
        } else {
            com.sankuai.waimai.platform.utils.p.b(A);
            A = null;
        }
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70556205b1bb058bb869a644e6c7fe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70556205b1bb058bb869a644e6c7fe9");
        } else if (z) {
            D += az.d(getContext());
        } else {
            D -= az.d(getContext());
        }
    }

    @Override // com.meituan.mmp.lib.api.input.textarea.a
    public final boolean a_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b7288296b9b1db8be4a94f13db6243", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b7288296b9b1db8be4a94f13db6243")).booleanValue();
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb9f4c3f14780cf1556330fbbbdb2bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb9f4c3f14780cf1556330fbbbdb2bcb");
        } else if (A != null && A.isShowing()) {
            try {
                A.update(af, i, A.getWidth(), A.getHeight());
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.meituan.mmp.lib.page.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc5c18e997faddd9957bff49ac6c637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc5c18e997faddd9957bff49ac6c637");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("TextArea", "onContainerTouch");
        if (this.u.getTextAreaOriginPositionManager().e) {
            return;
        }
        postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ecd384443dd5942bef764b3ecfa1d84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ecd384443dd5942bef764b3ecfa1d84");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("TextArea", "onContainerTouch - delayed rawPositionInit = true, 1000");
                d.this.u.getTextAreaOriginPositionManager().e = true;
            }
        }, 1000L);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String A;
        public String B;
        public int C;
        public String D;
        public int E;
        public int F;
        public String G;
        public int H;
        public int I;
        public int J;
        public String K;
        public boolean L;
        public boolean M;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public String j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public int o;
        public boolean p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public String x;
        public String y;
        public int z;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed50cd6191b2174c44c08ee781c276c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed50cd6191b2174c44c08ee781c276c");
                return;
            }
            this.F = -1;
            this.M = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x024c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.meituan.mmp.lib.api.input.textarea.d.a a(org.json.JSONObject r12, com.meituan.mmp.lib.api.input.textarea.d r13) {
            /*
                Method dump skipped, instructions count: 600
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.input.textarea.d.a.a(org.json.JSONObject, com.meituan.mmp.lib.api.input.textarea.d):com.meituan.mmp.lib.api.input.textarea.d$a");
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d8c37b3ce7b7dca53aed4c29976432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d8c37b3ce7b7dca53aed4c29976432");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 != 0) {
            this.G = false;
            if (isCursorVisible()) {
                if (TextUtils.isEmpty(this.j)) {
                    return;
                }
                Log.e("ta-onSizeChanged-c", this.j);
                try {
                    com.meituan.mmp.lib.trace.b.b("TextArea", "onSizeChanged, put " + this.j + " CursorVisible");
                    this.u.getTextAreaOriginPositionManager().c.put(this.j, Integer.valueOf((this.u.getTextAreaOriginPositionManager().c.get(this.j).intValue() + i2) - i4));
                    this.u.getTextAreaOriginPositionManager().a(this.u.getTextAreaOriginPositionManager().d.get(this.j).intValue(), i2 - i4);
                } catch (Exception unused) {
                    return;
                }
            } else if (TextUtils.isEmpty(this.j)) {
                return;
            } else {
                Log.e("ta-onSizeChanged", this.j);
                try {
                    int intValue = this.u.getTextAreaOriginPositionManager().c.get(this.j).intValue();
                    com.meituan.mmp.lib.trace.b.b("TextArea", "onSizeChanged, put " + this.j + ", change " + (i2 - i4));
                    this.u.getTextAreaOriginPositionManager().c.put(this.j, Integer.valueOf((intValue + i2) - i4));
                    this.u.getTextAreaOriginPositionManager().d.put(this.j, Integer.valueOf((this.u.getTextAreaOriginPositionManager().d.get(this.j).intValue() + i2) - i4));
                } catch (Exception unused2) {
                    return;
                }
            }
        }
        if (this.C) {
            this.ah = i2 - i4;
            try {
                JSONObject jSONObject = new JSONObject();
                Log.e("size-change", this.j);
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                Log.e("size-change", sb.toString());
                jSONObject.put("height", p.b(i2));
                jSONObject.put("inputId", this.j);
                jSONObject.put("lineCount", getLineCount());
                this.t.a("onTextAreaHeightChange", jSONObject, this.k);
                postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68ad4a35d7681e36d43fa7104341d3ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68ad4a35d7681e36d43fa7104341d3ff");
                        } else if (d.D != 0 && d.this.u.g) {
                            d.a(d.this, d.this.ah);
                        }
                    }
                }, 0L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.input.a
    public void setValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d9a8bff3c839075c62e02d548a6554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d9a8bff3c839075c62e02d548a6554");
        } else {
            setText(str);
        }
    }

    @Override // com.meituan.mmp.lib.api.input.a, com.meituan.mmp.lib.api.input.d
    public final void a(com.meituan.mmp.lib.api.input.e eVar) {
        this.w = eVar;
    }

    @Override // com.meituan.mmp.lib.api.input.a, com.meituan.mmp.lib.api.input.d
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a466d2d69b47ba4caf47c53ebc9026f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a466d2d69b47ba4caf47c53ebc9026f");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", getText().toString());
            jSONObject.put("inputId", this.j);
            jSONObject.put("cursor", getCursor());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.t.a("onKeyboardComplete", jSONObject, this.k);
    }

    @Override // com.meituan.mmp.lib.api.input.d
    public final void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fde69a57ec8a8ba8a8185161ccf8f57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fde69a57ec8a8ba8a8185161ccf8f57");
        } else if (this.ae) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = x;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4431e28e8c1062f8a27f15af20343fc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4431e28e8c1062f8a27f15af20343fc1");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("TextArea", "tryAdjustPositionInternal");
            postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String sb;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d73102b0800a06efc5b04696b000c2d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d73102b0800a06efc5b04696b000c2d5");
                        return;
                    }
                    com.meituan.mmp.lib.trace.b.b("TextArea", "tryAdjustPositionInternal - delayed rawPositionInit = true， 200");
                    d.this.u.getTextAreaOriginPositionManager().e = true;
                    Rect rect = new Rect();
                    d.this.getGlobalVisibleRect(rect);
                    int[] iArr = new int[2];
                    d.this.getLocationInWindow(iArr);
                    int max = Math.max(iArr[1], rect.top);
                    com.meituan.mmp.lib.trace.b.b("TextArea", "getGlobalVisibleRect: " + rect + ", getLocationInWindow: " + Arrays.toString(iArr) + ", textTop: " + max);
                    int measuredHeight = (!d.this.B || d.A == null) ? 0 : d.A.getContentView().getMeasuredHeight();
                    int unused = d.aa = d.this.z;
                    int height = d.this.getHeight();
                    int i2 = max + height + d.this.z;
                    int e = p.e();
                    int i3 = (e - i) - measuredHeight;
                    int i4 = i2 - i3;
                    com.meituan.mmp.lib.trace.b.b("TextArea", "textBottom " + i2 + " = " + max + " + " + height + " + " + d.this.z + ", keyTop " + i3 + " = " + e + " - " + i + " - " + measuredHeight);
                    if ((i4 > 0 || (i4 < 0 && d.this.u.getPan() > 0 && d.this.u.getPan() >= (-i4))) && !d.this.ad) {
                        d.this.u.getLocationInWindow(iArr);
                        int min = Math.min(i4, (i + measuredHeight) - ((e - (iArr[1] + d.this.u.getHeight())) - (d.this.u.getTabBar() != null ? d.this.u.getTabBar().getHeight() : 0)));
                        int i5 = i4 - min;
                        com.meituan.mmp.lib.trace.b.b("TextArea", "tryAdjustPositionInternal: need adjust " + i4 + ", pan: " + min + ", scroll: " + i5);
                        d.this.u.d(min);
                        if (i5 <= 0) {
                            d.this.u.c(0);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("tryAdjustPositionInternal: currScroll ");
                        sb2.append(d.this.u.getWebScrollY());
                        sb2.append(" + move ");
                        sb2.append(i5);
                        sb2.append(" + height ");
                        sb2.append(d.this.u.getPageAreaHeight());
                        sb2.append(" = ");
                        int webScrollY = d.this.u.getWebScrollY() + i5 + d.this.u.getCurrentWebViewHeight();
                        int currentWebViewPageHeight = d.this.u.getCurrentWebViewPageHeight();
                        Object[] objArr4 = {Integer.valueOf(webScrollY), Integer.valueOf(currentWebViewPageHeight)};
                        ChangeQuickRedirect changeQuickRedirect4 = ae.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c6483bf46c90767360211e7c69bed841", RobustBitConfig.DEFAULT_VALUE)) {
                            sb = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c6483bf46c90767360211e7c69bed841");
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(webScrollY);
                            sb3.append(StringUtil.SPACE);
                            Object[] objArr5 = {Integer.valueOf(webScrollY), Integer.valueOf(currentWebViewPageHeight)};
                            ChangeQuickRedirect changeQuickRedirect5 = ae.a;
                            sb3.append(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "7f7cd15d5e5edc0cfd91a511f740fabd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "7f7cd15d5e5edc0cfd91a511f740fabd") : webScrollY > currentWebViewPageHeight ? ">" : webScrollY < currentWebViewPageHeight ? "<" : "=");
                            sb3.append(StringUtil.SPACE);
                            sb3.append(currentWebViewPageHeight);
                            sb = sb3.toString();
                        }
                        sb2.append(sb);
                        com.meituan.mmp.lib.trace.b.b("TextArea", sb2.toString());
                        int currentWebViewPageHeight2 = (d.this.u.getCurrentWebViewPageHeight() - d.this.u.getCurrentWebViewHeight()) - d.this.u.getWebScrollY();
                        if (currentWebViewPageHeight2 < 0) {
                            currentWebViewPageHeight2 = 0;
                        }
                        if (i5 > currentWebViewPageHeight2) {
                            com.meituan.mmp.lib.trace.b.b("TextArea", "tryAdjustPositionInternal: limit scroll: " + i5 + " -> " + currentWebViewPageHeight2);
                            i5 = currentWebViewPageHeight2;
                        }
                        int webScrollY2 = d.this.u.getWebScrollY();
                        d.this.u.c(i5);
                        com.meituan.mmp.lib.trace.b.b("TextArea", "tryAdjustPositionInternal: try scroll WebView Y: " + i5 + ", actual scroll: " + (d.this.u.getWebScrollY() - webScrollY2));
                    }
                }
            }, 200L);
        }
    }

    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "582424315ca65ce937e8c134583a131f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "582424315ca65ce937e8c134583a131f");
            return;
        }
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        int d = this.B ? p.d(40) : 0;
        if (A != null || (A != null && A.isShowing())) {
            d = 0;
        }
        int i2 = this.z;
        if (this.z < aa) {
            this.z = aa - this.z;
        } else if (this.z > aa) {
            this.z -= aa;
        } else {
            this.z = 0;
        }
        aa = i2;
        int i3 = rect.bottom;
        int b = p.b(getContext()) - i;
        if (i3 > b) {
            int i4 = i3 - b;
            int i5 = this.z + this.ah + d;
            if (i4 > i) {
                this.u.c((i4 - i) + i5);
                return;
            }
            return;
        }
        int i6 = rect.top;
    }

    public final void a(a aVar) {
        SpannableString a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cfe98eac6868997c4be927da2b4e403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cfe98eac6868997c4be927da2b4e403");
            return;
        }
        this.ad = aVar.g;
        this.ae = aVar.h;
        this.y = aVar;
        this.V = aVar.e;
        this.v = aVar.d;
        if (aVar.F >= 0) {
            this.z = aVar.F;
        }
        this.B = aVar.M;
        int i = aVar.v;
        if (i >= 0) {
            setMinHeight(i);
        }
        if (aVar.t > 0) {
            this.K = aVar.t;
            setMaxHeight(aVar.t);
        }
        setPadding(0, -2, 0, 0);
        setBackgroundColor(i.b("#00000000"));
        if (aVar.u > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(aVar.u)});
        }
        this.C = aVar.L;
        if (this.C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            }
            setLayoutParams(layoutParams);
        }
        if (!TextUtils.isEmpty(aVar.x)) {
            setHint(aVar.x);
            setTextSize(1, aVar.z);
        }
        if (aVar.r > 0) {
            setLineSpacing(aVar.r, 1.0f);
        }
        setTextSize(1, aVar.i);
        if (aVar.l) {
            if (!TextUtils.isEmpty(aVar.y)) {
                setHintTextColor(i.b(aVar.y));
            }
            if (!TextUtils.isEmpty(aVar.A)) {
                if (!"normal".equalsIgnoreCase(aVar.A) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equalsIgnoreCase(aVar.A)) {
                    a2 = CustomTypefaceSpan.a(Typeface.defaultFromStyle(1), aVar.x);
                } else {
                    a2 = CustomTypefaceSpan.a(Typeface.defaultFromStyle(0), aVar.x);
                }
                setHint(a2);
            }
            if (aVar.z > 0) {
                setTextSize(1, aVar.z);
            }
            if (!TextUtils.isEmpty(aVar.K)) {
                this.p = true;
                this.q = i.b(aVar.K);
            }
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.mmp.lib.api.input.textarea.d.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16e68c931c6edcde74624b877b17cf8b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16e68c931c6edcde74624b877b17cf8b")).booleanValue();
                }
                if (d.this.a((EditText) d.this)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 1) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            }
        });
        if (aVar.d) {
            this.v = true;
        }
        if (!TextUtils.isEmpty(getText())) {
            setSelection(getText().length());
        }
        if (aVar.m) {
            if (!TextUtils.isEmpty(aVar.b)) {
                this.f = true;
                this.g = i.b(aVar.b);
            }
            if (!TextUtils.isEmpty(aVar.G)) {
                setTextColor(i.b(aVar.G));
            }
            if (aVar.i > 0) {
                setTextSize(1, aVar.i);
            }
            if (TextUtils.equals(aVar.B, "center")) {
                setGravity(17);
            } else if (TextUtils.equals(aVar.B, "left")) {
                setGravity(GravityCompat.START);
            } else if (TextUtils.equals(aVar.B, "right")) {
                setGravity(GravityCompat.END);
            }
            if (!TextUtils.isEmpty(getText())) {
                setSelection(getText().length());
            }
            this.r = aVar.z;
            this.s = aVar.i;
            this.e = true;
            this.m = aVar.J;
            this.n = aVar.H;
            this.o = aVar.I;
        }
        if (aVar.n) {
            this.J = aVar.D;
            this.b = true;
            setText(this.J);
        }
        if (aVar.f) {
            setEnabled(false);
            this.I = false;
        }
        this.ad = aVar.g;
        this.ae = aVar.h;
    }

    @Override // com.meituan.mmp.lib.api.input.a, com.meituan.mmp.lib.api.input.d
    public String getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba84e2125858230af792a18ce9187bc6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba84e2125858230af792a18ce9187bc6") : getText().toString();
    }

    @Override // com.meituan.mmp.lib.api.input.a, com.meituan.mmp.lib.api.input.d
    public int getCursor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3952ea66b1cb45e36d1a27dd4359b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3952ea66b1cb45e36d1a27dd4359b6")).intValue() : getSelectionStart();
    }

    public Rect getCursorRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d151623e409fdd063b4f6d136b082815", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d151623e409fdd063b4f6d136b082815");
        }
        Rect rect = new Rect();
        int selectionStart = getSelectionStart();
        Layout layout = getLayout();
        layout.getLineBounds(layout.getLineForOffset(selectionStart), rect);
        return rect;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        Object[] objArr = {rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677f92391dd106814cc46fc6e9613cf9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677f92391dd106814cc46fc6e9613cf9")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 17 && Build.VERSION.SDK_INT <= 23) {
            rect.offset(-getScrollX(), -getScrollY());
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77bd1c8e1e7c74f83162c3af220f43bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77bd1c8e1e7c74f83162c3af220f43bc")).booleanValue();
        }
        if (editText == null || editText.getLayout() == null) {
            return false;
        }
        int scrollY = editText.getScrollY();
        int height = editText.getLayout().getHeight() - ((editText.getHeight() - editText.getCompoundPaddingTop()) - editText.getCompoundPaddingBottom());
        if (height == 0) {
            return false;
        }
        return scrollY > 0 || scrollY < height - 1;
    }

    @Override // com.meituan.mmp.lib.api.input.a, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ae1e0556800dd7f3270a70b5f420a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ae1e0556800dd7f3270a70b5f420a1")).booleanValue();
        }
        if (i == 67) {
            this.d = '\b';
        }
        if (this.b) {
            this.b = false;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (onKeyDown && i == 66) {
            this.d = '\n';
        }
        return onKeyDown;
    }

    public void setCurosr(int i) {
        this.m = i;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d181ac791e23f1cc5f222d0086a6d0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d181ac791e23f1cc5f222d0086a6d0e")).booleanValue();
        }
        if (this.I) {
            if (isCursorVisible() || !F) {
                if (a((EditText) this)) {
                    return a(motionEvent);
                }
                postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.api.input.textarea.d.9
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "792afa274f944e5b372829850a4a9b69", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "792afa274f944e5b372829850a4a9b69");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent - delayed rawPositionInit = true, 100");
                        d.this.u.getTextAreaOriginPositionManager().e = true;
                    }
                }, 100L);
                int navigationBarHeight = this.u.getNavigationBarHeight() + getStatusBarHeight();
                com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent " + MotionEvent.actionToString(motionEvent.getAction()));
                if (this.u.getTextAreaOriginPositionManager().d.get(this.j) == null) {
                    b.a.c("TextArea", "onTouchEvent - inputId not found, id=" + this.j);
                    return false;
                }
                Rect rect = new Rect();
                ((ViewGroup) getParent().getParent()).getGlobalVisibleRect(rect);
                if (motionEvent.getAction() == 0) {
                    this.N = this.u.getCurrentWebViewPageHeight();
                    this.R = motionEvent.getY();
                    if (!F && !this.H) {
                        this.P = false;
                        setEnabled(false);
                        clearFocus();
                        this.Q = motionEvent.getRawY();
                        this.ai.postDelayed(this.O, ViewConfiguration.getLongPressTimeout());
                    }
                }
                i();
                Rect rect2 = new Rect();
                getGlobalVisibleRect(rect2, new Point());
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                if (motionEvent.getAction() == 2 && !F) {
                    float rawY = motionEvent.getRawY();
                    float rawY2 = this.Q - motionEvent.getRawY();
                    int intValue = this.u.getTextAreaOriginPositionManager().d.get(this.j).intValue();
                    float f = intValue;
                    if (rect2.top - rawY2 > f) {
                        com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent move, " + rect2.top + " - " + rawY2 + " > " + intValue + ", limit swipe down");
                        if (rect2.top > intValue) {
                            com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent move, " + rawY2 + " := 0");
                            rawY2 = 0.0f;
                        } else {
                            com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent move, " + rawY2 + " := " + (rect2.top - intValue));
                            rawY2 = (float) (rect2.top - intValue);
                        }
                    } else {
                        com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent move, " + rect2.top + " - " + rawY2 + " <= " + intValue);
                    }
                    if (rawY2 < 0.0f) {
                        if (rect2.top <= intValue && rect2.top - rawY2 <= f) {
                            rawY2 += 1.0f;
                            com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent scrollWebView-: " + rawY2);
                            this.u.c((int) rawY2);
                        }
                        if (rect2.top - rawY2 <= f) {
                            this.Q = rawY;
                        }
                    } else if (rawY2 > 0.0f) {
                        int height = (iArr[1] + getHeight()) - navigationBarHeight;
                        int currentWebViewPageHeight = this.u.getCurrentWebViewPageHeight() - this.u.getTextAreaOriginPositionManager().c.get(this.j).intValue();
                        if ((rect.height() - height) + rawY2 >= currentWebViewPageHeight) {
                            com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent move+: " + rect.height() + " - " + height + " + " + rawY2 + " >= " + currentWebViewPageHeight + ", limit swipe up");
                            StringBuilder sb = new StringBuilder("onTouchEvent move+: ");
                            sb.append(rawY2);
                            sb.append(" := ");
                            sb.append(currentWebViewPageHeight - (rect.height() - height));
                            com.meituan.mmp.lib.trace.b.b("TextArea", sb.toString());
                            rawY2 = (float) (currentWebViewPageHeight - (rect.height() - height));
                        }
                        com.meituan.mmp.lib.trace.b.b("TextArea", "onTouchEvent scrollWebView+: " + rawY2);
                        this.u.c((int) rawY2);
                        this.Q = rawY;
                    }
                }
                motionEvent.getAction();
                float y = this.R - motionEvent.getY();
                if (!this.P && motionEvent.getAction() == 1) {
                    if (Math.abs(y) >= 1.0f) {
                        return false;
                    }
                    this.ai.removeCallbacks(this.O);
                    setEnabled(true);
                    requestFocus();
                }
                return a(motionEvent);
            }
            return false;
        }
        return false;
    }

    private boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5580ac1d8d424debc809b1bc8ad680", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5580ac1d8d424debc809b1bc8ad680")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.d("TextArea", e.toString());
            return false;
        }
    }

    public int getStatusBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e37c5baf8b4af5b7b30d371193400ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e37c5baf8b4af5b7b30d371193400ab")).intValue();
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public void setAutoFocus(boolean z) {
        this.H = z;
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebcccf4451ee7fbbfd1c277effc36887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebcccf4451ee7fbbfd1c277effc36887");
        } else if (!this.B) {
            if (A == null || !A.isShowing()) {
                return;
            }
            com.sankuai.waimai.platform.utils.p.b(A);
            A = null;
        } else if (((Activity) this.u.getContext()).getCurrentFocus() instanceof d) {
            b(p.a(getContext()) / 2, this.u.getKeyboardHeight() + az.a(getContext()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e58500ee17a29b0a7cc406a3cc30d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e58500ee17a29b0a7cc406a3cc30d04");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        i();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a4d09e875169a3f00f0024afa1cccda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a4d09e875169a3f00f0024afa1cccda");
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[1];
        int height = ((getHeight() + i) - (this.u.getNavigationBarHeight() + getStatusBarHeight())) + this.u.getWebScrollY();
        int webScrollY = i + this.u.getWebScrollY();
        this.u.getTextAreaOriginPositionManager().c.put(this.j, Integer.valueOf(height));
        this.u.getTextAreaOriginPositionManager().d.put(this.j, Integer.valueOf(webScrollY));
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9612562866b231c33725a66918b6bed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9612562866b231c33725a66918b6bed");
        } else {
            super.onMeasure(i, i2);
        }
    }
}
