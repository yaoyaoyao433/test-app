package com.sankuai.xm.imui.common.view.titlebar;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.adapter.DialogModeSupportable;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.event.e;
import com.sankuai.xm.imui.theme.c;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultTitleBarAdapter implements DialogModeSupportable, TitleBarAdapter {
    public static ChangeQuickRedirect c;
    private int a;
    private ViewStub b;
    public Activity d;
    protected View e;
    protected LinearLayout f;
    protected ImageView g;
    protected TextView h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    protected TextView l;
    protected ImageView m;
    protected ImageView n;
    private ViewStub o;
    private ViewStub p;
    private HashMap<String, Object> q;
    private boolean r;
    private final ViewTreeObserver.OnGlobalLayoutListener s;

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onUnreadCountChanged(int i) {
    }

    public DefaultTitleBarAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7525bcbc7bc3bdcf3f6bcf8098402da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7525bcbc7bc3bdcf3f6bcf8098402da");
            return;
        }
        this.a = 0;
        this.q = new HashMap<>();
        this.r = false;
        this.s = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3087b39db14408f06f9093701327f66e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3087b39db14408f06f9093701327f66e");
                } else {
                    DefaultTitleBarAdapter.a(DefaultTitleBarAdapter.this);
                }
            }
        };
    }

    public static /* synthetic */ void a(DefaultTitleBarAdapter defaultTitleBarAdapter) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, defaultTitleBarAdapter, changeQuickRedirect, false, "4d11b9cdf56bd2163810562a8f582e50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, defaultTitleBarAdapter, changeQuickRedirect, false, "4d11b9cdf56bd2163810562a8f582e50");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) defaultTitleBarAdapter.e.findViewById(R.id.title_bar_middle_view);
        View findViewById = defaultTitleBarAdapter.e.findViewById(R.id.root_view_xm_sdk_title_bar_left);
        View findViewById2 = defaultTitleBarAdapter.e.findViewById(R.id.root_view_xm_sdk_title_bar_right);
        d.a("DefaultTitleBarAdapter::onContentChange(), left:%s, mid:%s, right:%s", findViewById, viewGroup, findViewById2);
        boolean z3 = (defaultTitleBarAdapter.a == 2 || defaultTitleBarAdapter.a == 1) ? false : true;
        if (findViewById != null && findViewById2 != null && viewGroup != null && (viewGroup.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            if (z3) {
                int width = findViewById.getWidth();
                int width2 = findViewById2.getWidth();
                int width3 = defaultTitleBarAdapter.e.getWidth();
                if (width3 == 0) {
                    width3 = k.b(defaultTitleBarAdapter.d);
                }
                int max = (width3 - (Math.max(width + defaultTitleBarAdapter.e.getPaddingLeft(), width2 + defaultTitleBarAdapter.e.getPaddingRight()) * 2)) - (defaultTitleBarAdapter.d.getResources().getDimensionPixelSize(R.dimen.xm_sdk_title_bar_divider) * 2);
                if (viewGroup.getLayoutParams().width != max) {
                    viewGroup.getLayoutParams().width = max;
                    z = true;
                } else {
                    z = false;
                }
                layoutParams.removeRule(1);
                layoutParams.removeRule(0);
                if (layoutParams.getRules()[13] != -1) {
                    layoutParams.addRule(13);
                    z2 = true;
                }
            } else {
                layoutParams.removeRule(13);
                layoutParams.removeRule(14);
                z = (layoutParams.getRules()[1] == R.id.root_view_xm_sdk_title_bar_left && layoutParams.getRules()[0] == R.id.root_view_xm_sdk_title_bar_right) ? false : true;
                layoutParams.addRule(1, R.id.root_view_xm_sdk_title_bar_left);
                layoutParams.addRule(0, R.id.root_view_xm_sdk_title_bar_right);
            }
            z2 = z;
        }
        if ((z2 | defaultTitleBarAdapter.a(defaultTitleBarAdapter.a, defaultTitleBarAdapter.j)) || defaultTitleBarAdapter.a(defaultTitleBarAdapter.a, defaultTitleBarAdapter.k)) {
            if (viewGroup != null) {
                viewGroup.requestLayout();
            } else {
                defaultTitleBarAdapter.e.requestLayout();
            }
        }
    }

    public static /* synthetic */ boolean a(DefaultTitleBarAdapter defaultTitleBarAdapter, Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, defaultTitleBarAdapter, changeQuickRedirect, false, "841ac40225793e5d838c37a2abe19984", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, defaultTitleBarAdapter, changeQuickRedirect, false, "841ac40225793e5d838c37a2abe19984")).booleanValue();
        }
        b b = b.b(context);
        if (b.e()) {
            b.a(e.f.a(false, null));
            return true;
        }
        return false;
    }

    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a76bf895bc6560fe7123c466582fb8", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a76bf895bc6560fe7123c466582fb8");
        }
        if (context == null || viewGroup == null) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.xm_sdk_titlebar_normal, viewGroup, true);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9db0e7630561c1597bf452a9dba6cae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9db0e7630561c1597bf452a9dba6cae");
        } else {
            this.e = inflate.findViewById(R.id.root_view);
            this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.s);
            this.b = (ViewStub) inflate.findViewById(R.id.title_bar_left_view);
            View inflate2 = this.b.inflate();
            this.f = (LinearLayout) inflate2.findViewById(R.id.ly_back_view);
            this.g = (ImageView) inflate2.findViewById(R.id.img_back);
            this.h = (TextView) inflate2.findViewById(R.id.text_back);
            this.i = (TextView) inflate2.findViewById(R.id.text_close);
            this.o = (ViewStub) inflate.findViewById(R.id.title_bar_middle_view);
            View inflate3 = this.o.inflate();
            this.j = (TextView) inflate3.findViewById(R.id.tv_title);
            this.k = (TextView) inflate3.findViewById(R.id.tv_sub_title);
            this.p = (ViewStub) inflate.findViewById(R.id.title_bar_right_view);
            View inflate4 = this.p.inflate();
            this.l = (TextView) inflate4.findViewById(R.id.btn_right_text_button);
            this.m = (ImageView) inflate4.findViewById(R.id.btn_right_image_button);
            this.n = (ImageView) inflate4.findViewById(R.id.btn_right_image_button2);
            b b = b.b(inflate.getContext());
            if (b != null && b.c != null && b.a(inflate) != null && b.c.r) {
                a(R.drawable.xm_sdk_title_bar_dialog_mode_bg);
                l.a(8, this.g);
                if (this.h != null) {
                    this.h.setText(R.string.xm_sdk_title_bar_text_full);
                    this.h.setVisibility(0);
                    this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SessionParams sessionParams;
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d9d9c4bf796654219e49b05035ca2ec", 6917529027641081858L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d9d9c4bf796654219e49b05035ca2ec");
                                return;
                            }
                            SessionFragment a2 = b.a(view);
                            if (a2 != null) {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = SessionFragment.q;
                                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "eeaf1cfc4ebb7c6f154535aaef11ce21", 6917529027641081856L)) {
                                    ((Integer) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "eeaf1cfc4ebb7c6f154535aaef11ce21")).intValue();
                                } else if (a2.r == null || !ActivityUtils.a((Activity) a2.getActivity())) {
                                    d.c("close Session should not call.", new Object[0]);
                                } else if (!a2.r.c.r) {
                                    d.c("only worked in dialog mode.", new Object[0]);
                                } else {
                                    a2.z();
                                    SessionParams sessionParams2 = a2.r.c;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = SessionParams.a;
                                    if (PatchProxy.isSupport(objArr5, sessionParams2, changeQuickRedirect5, false, "afc1a65ae33189454684d6b9ae6f13aa", 6917529027641081856L)) {
                                        sessionParams = (SessionParams) PatchProxy.accessDispatch(objArr5, sessionParams2, changeQuickRedirect5, false, "afc1a65ae33189454684d6b9ae6f13aa");
                                    } else {
                                        Parcel obtain = Parcel.obtain();
                                        obtain.setDataPosition(0);
                                        obtain.setDataSize(0);
                                        sessionParams2.writeToParcel(obtain, 0);
                                        obtain.setDataPosition(0);
                                        sessionParams = new SessionParams(obtain);
                                        obtain.recycle();
                                    }
                                    sessionParams.a(false, 0.0f);
                                    d.c("enterFullScreenMode ret: %s.", Integer.valueOf(IMUIManager.a().a(a2.getActivity(), a2.r.b, IMUIManager.a().a(a2.s), sessionParams)));
                                }
                            }
                        }
                    });
                }
                if (this.m != null) {
                    this.m.setVisibility(0);
                    this.m.setImageResource(R.drawable.xm_sdk_ic_close_black);
                    this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "429c18ac69654138bd815c70d2fa7674", 6917529027641081858L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "429c18ac69654138bd815c70d2fa7674");
                                return;
                            }
                            SessionFragment a2 = b.a(view);
                            if (a2 != null) {
                                a2.z();
                            }
                        }
                    });
                }
            } else if (this.f != null) {
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82888761ee78267c3c946a0e6cf7ba1f", 6917529027641081858L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82888761ee78267c3c946a0e6cf7ba1f");
                            return;
                        }
                        k.b(view, 0);
                        if (DefaultTitleBarAdapter.a(DefaultTitleBarAdapter.this, view.getContext()) || DefaultTitleBarAdapter.this.d == null) {
                            return;
                        }
                        DefaultTitleBarAdapter.this.d.finish();
                    }
                });
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa8714ea2ab4e3243728d2d773ac3b09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa8714ea2ab4e3243728d2d773ac3b09");
            } else {
                b b2 = b.b(this.e.getContext());
                if (this.e == null || b2 == null || b2.c == null || !b2.c.r || this.r) {
                    for (String str : this.q.keySet()) {
                        if (TextUtils.equals(str, "BackgroundColor")) {
                            int intValue = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr4 = {Integer.valueOf(intValue)};
                            ChangeQuickRedirect changeQuickRedirect4 = c;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8337d867c194eaa00c10eb0d5fd1147b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8337d867c194eaa00c10eb0d5fd1147b");
                            } else {
                                this.q.put("BackgroundColor", Integer.valueOf(intValue));
                                if (this.e != null) {
                                    this.e.setBackgroundColor(intValue);
                                }
                            }
                        } else if (TextUtils.equals(str, "BackgroundResource")) {
                            a(((Integer) this.q.get(str)).intValue());
                        } else if (TextUtils.equals(str, "BackImageResource")) {
                            int intValue2 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr5 = {Integer.valueOf(intValue2)};
                            ChangeQuickRedirect changeQuickRedirect5 = c;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c4ff0c25a41ccff05058e6e3c1a51a78", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c4ff0c25a41ccff05058e6e3c1a51a78");
                            } else {
                                this.q.put("BackImageResource", Integer.valueOf(intValue2));
                                if (this.g != null) {
                                    this.g.setImageResource(intValue2);
                                }
                            }
                        } else if (TextUtils.equals(str, "BackText")) {
                            String str2 = (String) this.q.get(str);
                            Object[] objArr6 = {str2};
                            ChangeQuickRedirect changeQuickRedirect6 = c;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6468ca1f7c61e631ac6a1bea9e34bdcb", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6468ca1f7c61e631ac6a1bea9e34bdcb");
                            } else if (str2 != null) {
                                this.q.put("BackText", str2);
                                if (this.h != null) {
                                    this.h.setText(str2);
                                }
                            }
                        } else if (TextUtils.equals(str, "BackTextResource")) {
                            int intValue3 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr7 = {Integer.valueOf(intValue3)};
                            ChangeQuickRedirect changeQuickRedirect7 = c;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a092f81c123e67a2da572addb4757991", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a092f81c123e67a2da572addb4757991");
                            } else {
                                this.q.put("BackTextResource", Integer.valueOf(intValue3));
                                if (this.h != null) {
                                    this.h.setText(intValue3);
                                }
                            }
                        } else if (TextUtils.equals(str, "BackTextVisibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = c;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "19623eff772650e5e60258c404ee425b", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "19623eff772650e5e60258c404ee425b");
                                } else {
                                    this.q.put("BackTextVisibility", 0);
                                    if (this.h != null) {
                                        this.h.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = c;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "f704b41ac67b3bdc9a3abeef49b635e6", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "f704b41ac67b3bdc9a3abeef49b635e6");
                                } else {
                                    this.q.put("BackTextVisibility", 8);
                                    if (this.h != null) {
                                        this.h.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "BackImageVisibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = c;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "5bdc71df37320a0e6fd95d8476ef61c3", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "5bdc71df37320a0e6fd95d8476ef61c3");
                                } else {
                                    this.q.put("BackImageVisibility", 0);
                                    if (this.g != null) {
                                        this.g.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr11 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect11 = c;
                                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "35f05ffc14774dc492d3b583eab5597b", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "35f05ffc14774dc492d3b583eab5597b");
                                } else {
                                    this.q.put("BackImageVisibility", 8);
                                    if (this.g != null) {
                                        this.g.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "BackListener")) {
                            View.OnClickListener onClickListener = (View.OnClickListener) this.q.get(str);
                            Object[] objArr12 = {onClickListener};
                            ChangeQuickRedirect changeQuickRedirect12 = c;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "b553a5e5150cd283d65274a96ed2027b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "b553a5e5150cd283d65274a96ed2027b");
                            } else if (onClickListener != null) {
                                this.q.put("BackListener", onClickListener);
                                if (this.f != null) {
                                    this.f.setOnClickListener(onClickListener);
                                }
                            }
                        } else if (TextUtils.equals(str, "LeftText")) {
                            String str3 = (String) this.q.get(str);
                            Object[] objArr13 = {str3};
                            ChangeQuickRedirect changeQuickRedirect13 = c;
                            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "7021681b92ba9604e6f74ccff66e904d", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "7021681b92ba9604e6f74ccff66e904d");
                            } else if (str3 != null) {
                                this.q.put("LeftText", str3);
                                if (this.i != null) {
                                    this.i.setText(str3);
                                }
                            }
                        } else if (TextUtils.equals(str, "LeftTextResource")) {
                            int intValue4 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr14 = {Integer.valueOf(intValue4)};
                            ChangeQuickRedirect changeQuickRedirect14 = c;
                            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "2a2ac38b66818b411603b7082b2c4b6d", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "2a2ac38b66818b411603b7082b2c4b6d");
                            } else {
                                this.q.put("LeftTextResource", Integer.valueOf(intValue4));
                                if (this.i != null) {
                                    this.i.setText(intValue4);
                                }
                            }
                        } else if (TextUtils.equals(str, "LeftTextVisibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr15 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect15 = c;
                                if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "e1abbe24db55efb972ccda6f26bd619e", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "e1abbe24db55efb972ccda6f26bd619e");
                                } else {
                                    this.q.put("LeftTextVisibility", 0);
                                    if (this.i != null) {
                                        this.i.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr16 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect16 = c;
                                if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "90d8de0969d73be9a947c518d918e270", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "90d8de0969d73be9a947c518d918e270");
                                } else {
                                    this.q.put("LeftTextVisibility", 8);
                                    if (this.i != null) {
                                        this.i.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "LeftTextListener")) {
                            View.OnClickListener onClickListener2 = (View.OnClickListener) this.q.get(str);
                            Object[] objArr17 = {onClickListener2};
                            ChangeQuickRedirect changeQuickRedirect17 = c;
                            if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "b5d814efc4f4f18ea93871fd020fe6ef", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "b5d814efc4f4f18ea93871fd020fe6ef");
                            } else if (onClickListener2 != null) {
                                this.q.put("LeftTextListener", onClickListener2);
                                if (this.i != null) {
                                    this.i.setOnClickListener(onClickListener2);
                                }
                            }
                        } else if (TextUtils.equals(str, "TitleText")) {
                            CharSequence charSequence = (CharSequence) this.q.get(str);
                            Object[] objArr18 = {charSequence};
                            ChangeQuickRedirect changeQuickRedirect18 = c;
                            if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "9486a5b65b96e3a0d4b713bda3c210d2", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "9486a5b65b96e3a0d4b713bda3c210d2");
                            } else if (charSequence != null) {
                                this.q.put("TitleText", charSequence);
                                if (this.j != null) {
                                    this.j.setText(charSequence);
                                }
                            }
                        } else if (TextUtils.equals(str, "TitleTextResource")) {
                            int intValue5 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr19 = {Integer.valueOf(intValue5)};
                            ChangeQuickRedirect changeQuickRedirect19 = c;
                            if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "2e03ae8ef97ed6f9981f976defc81b2a", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "2e03ae8ef97ed6f9981f976defc81b2a");
                            } else {
                                this.q.put("TitleTextResource", Integer.valueOf(intValue5));
                                if (this.j != null) {
                                    this.j.setText(intValue5);
                                }
                            }
                        } else if (TextUtils.equals(str, "TitleTextColorResource")) {
                            int intValue6 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr20 = {Integer.valueOf(intValue6)};
                            ChangeQuickRedirect changeQuickRedirect20 = c;
                            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "c9d664e6c74629b3829266785a6a7b42", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "c9d664e6c74629b3829266785a6a7b42");
                            } else {
                                this.q.put("TitleTextColorResource", Integer.valueOf(intValue6));
                                if (this.j != null) {
                                    this.j.setTextColor(intValue6);
                                }
                            }
                        } else if (TextUtils.equals(str, "TitleListener")) {
                            View.OnClickListener onClickListener3 = (View.OnClickListener) this.q.get(str);
                            Object[] objArr21 = {onClickListener3};
                            ChangeQuickRedirect changeQuickRedirect21 = c;
                            if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "367401ee7174194d67e66c569d2b2922", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "367401ee7174194d67e66c569d2b2922");
                            } else if (onClickListener3 != null) {
                                this.q.put("TitleListener", onClickListener3);
                                if (this.j != null) {
                                    this.j.setOnClickListener(onClickListener3);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightTextButtonText")) {
                            String str4 = (String) this.q.get(str);
                            Object[] objArr22 = {str4};
                            ChangeQuickRedirect changeQuickRedirect22 = c;
                            if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "3fe3dab0ef5e16208fdca38702cc414e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "3fe3dab0ef5e16208fdca38702cc414e");
                            } else if (str4 != null) {
                                this.q.put("RightTextButtonText", str4);
                                if (this.l != null) {
                                    this.l.setText(str4);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightTextButtonTextResource")) {
                            int intValue7 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr23 = {Integer.valueOf(intValue7)};
                            ChangeQuickRedirect changeQuickRedirect23 = c;
                            if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "7cd5d94bc953c9924ef8f6c3a3975f3b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "7cd5d94bc953c9924ef8f6c3a3975f3b");
                            } else {
                                this.q.put("RightTextButtonTextResource", Integer.valueOf(intValue7));
                                if (this.l != null) {
                                    this.l.setText(intValue7);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightTextButtonEnable")) {
                            boolean booleanValue = ((Boolean) this.q.get(str)).booleanValue();
                            Object[] objArr24 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect24 = c;
                            if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "e5b6be5e193ffc9ccf511c10055b1b7d", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "e5b6be5e193ffc9ccf511c10055b1b7d");
                            } else {
                                this.q.put("RightTextButtonEnable", Boolean.valueOf(booleanValue));
                                if (this.l != null) {
                                    this.l.setEnabled(booleanValue);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightTextButtonVisibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr25 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect25 = c;
                                if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "9c64c7966902263bc0cba85a65dd1a76", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "9c64c7966902263bc0cba85a65dd1a76");
                                } else {
                                    this.q.put("RightTextButtonVisibility", 0);
                                    if (this.l != null) {
                                        this.l.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr26 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect26 = c;
                                if (PatchProxy.isSupport(objArr26, this, changeQuickRedirect26, false, "8d1e471acd08d951a5fe940decd74085", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr26, this, changeQuickRedirect26, false, "8d1e471acd08d951a5fe940decd74085");
                                } else {
                                    this.q.put("RightTextButtonVisibility", 8);
                                    if (this.l != null) {
                                        this.l.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "RightTextButtonListener")) {
                            View.OnClickListener onClickListener4 = (View.OnClickListener) this.q.get(str);
                            Object[] objArr27 = {onClickListener4};
                            ChangeQuickRedirect changeQuickRedirect27 = c;
                            if (PatchProxy.isSupport(objArr27, this, changeQuickRedirect27, false, "3dd57c4df59771415d34495120e5d99e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr27, this, changeQuickRedirect27, false, "3dd57c4df59771415d34495120e5d99e");
                            } else if (onClickListener4 != null) {
                                this.q.put("RightTextButtonListener", onClickListener4);
                                if (this.l != null) {
                                    this.l.setOnClickListener(onClickListener4);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightImageButtonResource")) {
                            int intValue8 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr28 = {Integer.valueOf(intValue8)};
                            ChangeQuickRedirect changeQuickRedirect28 = c;
                            if (PatchProxy.isSupport(objArr28, this, changeQuickRedirect28, false, "bc47503ab52b415fc53bb26ca4504a9c", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr28, this, changeQuickRedirect28, false, "bc47503ab52b415fc53bb26ca4504a9c");
                            } else {
                                this.q.put("RightImageButtonResource", Integer.valueOf(intValue8));
                                if (this.m != null) {
                                    this.m.setImageResource(intValue8);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightImageButtonVisibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr29 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect29 = c;
                                if (PatchProxy.isSupport(objArr29, this, changeQuickRedirect29, false, "95bb07e6faad75afdc57d70ea77a1639", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr29, this, changeQuickRedirect29, false, "95bb07e6faad75afdc57d70ea77a1639");
                                } else {
                                    this.q.put("RightImageButtonVisibility", 0);
                                    if (this.m != null) {
                                        this.m.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr30 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect30 = c;
                                if (PatchProxy.isSupport(objArr30, this, changeQuickRedirect30, false, "2e3a3eca391aae99c8b1d3375af46fda", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr30, this, changeQuickRedirect30, false, "2e3a3eca391aae99c8b1d3375af46fda");
                                } else {
                                    this.q.put("RightImageButtonVisibility", 8);
                                    if (this.m != null) {
                                        this.m.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "RightImageButtonListener")) {
                            View.OnClickListener onClickListener5 = (View.OnClickListener) this.q.get(str);
                            Object[] objArr31 = {onClickListener5};
                            ChangeQuickRedirect changeQuickRedirect31 = c;
                            if (PatchProxy.isSupport(objArr31, this, changeQuickRedirect31, false, "66556fe7c685b779e34cf90d9abd2f2b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr31, this, changeQuickRedirect31, false, "66556fe7c685b779e34cf90d9abd2f2b");
                            } else if (onClickListener5 != null) {
                                this.q.put("RightImageButtonListener", onClickListener5);
                                if (this.m != null) {
                                    this.m.setOnClickListener(onClickListener5);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightImageButton2Resource")) {
                            int intValue9 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr32 = {Integer.valueOf(intValue9)};
                            ChangeQuickRedirect changeQuickRedirect32 = c;
                            if (PatchProxy.isSupport(objArr32, this, changeQuickRedirect32, false, "3cb3aafb9ba44c9585e84cceb2e2c525", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr32, this, changeQuickRedirect32, false, "3cb3aafb9ba44c9585e84cceb2e2c525");
                            } else {
                                this.q.put("RightImageButton2Resource", Integer.valueOf(intValue9));
                                if (this.n != null) {
                                    this.n.setImageResource(intValue9);
                                }
                            }
                        } else if (TextUtils.equals(str, "RightImageButton2Visibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr33 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect33 = c;
                                if (PatchProxy.isSupport(objArr33, this, changeQuickRedirect33, false, "46d5ba94e4a8227bc0ead232ee30c75c", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr33, this, changeQuickRedirect33, false, "46d5ba94e4a8227bc0ead232ee30c75c");
                                } else {
                                    this.q.put("RightImageButton2Visibility", 0);
                                    if (this.n != null) {
                                        this.n.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr34 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect34 = c;
                                if (PatchProxy.isSupport(objArr34, this, changeQuickRedirect34, false, "fc5453bf25b082b1aeea60f01c939e64", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr34, this, changeQuickRedirect34, false, "fc5453bf25b082b1aeea60f01c939e64");
                                } else {
                                    this.q.put("RightImageButton2Visibility", 8);
                                    if (this.n != null) {
                                        this.n.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "RightImageButton2Listener")) {
                            View.OnClickListener onClickListener6 = (View.OnClickListener) this.q.get(str);
                            Object[] objArr35 = {onClickListener6};
                            ChangeQuickRedirect changeQuickRedirect35 = c;
                            if (PatchProxy.isSupport(objArr35, this, changeQuickRedirect35, false, "269c042a9a3c1f3a23a8eb9817800f5c", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr35, this, changeQuickRedirect35, false, "269c042a9a3c1f3a23a8eb9817800f5c");
                            } else if (onClickListener6 != null) {
                                this.q.put("RightImageButton2Listener", onClickListener6);
                                if (this.n != null) {
                                    this.n.setOnClickListener(onClickListener6);
                                }
                            }
                        } else if (TextUtils.equals(str, "SubTitleText")) {
                            CharSequence charSequence2 = (CharSequence) this.q.get(str);
                            Object[] objArr36 = {charSequence2};
                            ChangeQuickRedirect changeQuickRedirect36 = c;
                            if (PatchProxy.isSupport(objArr36, this, changeQuickRedirect36, false, "054767eaeac57ef88de4ca6383d53cef", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr36, this, changeQuickRedirect36, false, "054767eaeac57ef88de4ca6383d53cef");
                            } else if (charSequence2 != null) {
                                this.q.put("SubTitleText", charSequence2);
                                if (this.k != null) {
                                    this.k.setText(charSequence2);
                                }
                            }
                        } else if (TextUtils.equals(str, "SubTitleTextResource")) {
                            int intValue10 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr37 = {Integer.valueOf(intValue10)};
                            ChangeQuickRedirect changeQuickRedirect37 = c;
                            if (PatchProxy.isSupport(objArr37, this, changeQuickRedirect37, false, "fe299452be6e19e784ddd9ba547feb69", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr37, this, changeQuickRedirect37, false, "fe299452be6e19e784ddd9ba547feb69");
                            } else {
                                this.q.put("SubTitleTextResource", Integer.valueOf(intValue10));
                                if (this.k != null) {
                                    this.k.setText(intValue10);
                                }
                            }
                        } else if (TextUtils.equals(str, "SubTitleTextColorResource")) {
                            int intValue11 = ((Integer) this.q.get(str)).intValue();
                            Object[] objArr38 = {Integer.valueOf(intValue11)};
                            ChangeQuickRedirect changeQuickRedirect38 = c;
                            if (PatchProxy.isSupport(objArr38, this, changeQuickRedirect38, false, "5b667c8891e8381963e44af8fc1168cf", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr38, this, changeQuickRedirect38, false, "5b667c8891e8381963e44af8fc1168cf");
                            } else {
                                this.q.put("SubTitleTextColorResource", Integer.valueOf(intValue11));
                                if (this.k != null) {
                                    this.k.setTextColor(intValue11);
                                }
                            }
                        } else if (TextUtils.equals(str, "SubTitleListener")) {
                            View.OnClickListener onClickListener7 = (View.OnClickListener) this.q.get(str);
                            Object[] objArr39 = {onClickListener7};
                            ChangeQuickRedirect changeQuickRedirect39 = c;
                            if (PatchProxy.isSupport(objArr39, this, changeQuickRedirect39, false, "fbe9e32aec980f3ffcdb63146e0e9c50", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr39, this, changeQuickRedirect39, false, "fbe9e32aec980f3ffcdb63146e0e9c50");
                            } else if (onClickListener7 != null) {
                                this.q.put("SubTitleListener", onClickListener7);
                                if (this.k != null) {
                                    this.k.setOnClickListener(onClickListener7);
                                }
                            }
                        } else if (TextUtils.equals(str, "SubTitleVisibility")) {
                            if (((Integer) this.q.get(str)).intValue() == 0) {
                                Object[] objArr40 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect40 = c;
                                if (PatchProxy.isSupport(objArr40, this, changeQuickRedirect40, false, "a9f6d1a3457f683b08108e72773739a2", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr40, this, changeQuickRedirect40, false, "a9f6d1a3457f683b08108e72773739a2");
                                } else {
                                    this.q.put("SubTitleVisibility", 0);
                                    if (this.k != null) {
                                        this.k.setVisibility(0);
                                    }
                                }
                            } else {
                                Object[] objArr41 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect41 = c;
                                if (PatchProxy.isSupport(objArr41, this, changeQuickRedirect41, false, "e6e25b5f80f7fd989642be26abcfa743", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr41, this, changeQuickRedirect41, false, "e6e25b5f80f7fd989642be26abcfa743");
                                } else {
                                    this.q.put("SubTitleVisibility", 8);
                                    if (this.k != null) {
                                        this.k.setVisibility(8);
                                    }
                                }
                            }
                        } else if (TextUtils.equals(str, "SubTitleTextSize")) {
                            float floatValue = ((Float) this.q.get(str)).floatValue();
                            Object[] objArr42 = {Float.valueOf(floatValue)};
                            ChangeQuickRedirect changeQuickRedirect42 = c;
                            if (PatchProxy.isSupport(objArr42, this, changeQuickRedirect42, false, "0695276c650676445ab8fc62319b2173", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr42, this, changeQuickRedirect42, false, "0695276c650676445ab8fc62319b2173");
                            } else {
                                this.q.put("SubTitleTextSize", Float.valueOf(floatValue));
                                if (this.k != null) {
                                    c.a(Float.valueOf(floatValue), this.k);
                                }
                            }
                        }
                    }
                }
            }
        }
        return inflate;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onAttach(Activity activity) {
        this.d = activity;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9030213026c271756c9fbdc629445b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9030213026c271756c9fbdc629445b");
            return;
        }
        if (this.e != null) {
            this.e.getViewTreeObserver().removeOnGlobalLayoutListener(this.s);
        }
        this.d = null;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onTitleTextChanged(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6574f2999482c2ec36f585aa6aa760ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6574f2999482c2ec36f585aa6aa760ce");
        } else if (this.q.containsKey("TitleText") || this.q.containsKey("TitleTextResource") || this.j == null) {
        } else {
            this.j.setText(str);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onThemeChanged(com.sankuai.xm.imui.theme.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da89e61c23900944aca5d7fe24dc013", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da89e61c23900944aca5d7fe24dc013");
            return;
        }
        if (!this.q.containsKey("BackgroundColor") && !this.q.containsKey("BackgroundResource")) {
            c.a(bVar.g, bVar.h, this.e);
        }
        if (!this.q.containsKey("TitleTextColorResource")) {
            c.a(bVar.i, this.j);
        }
        if (!this.q.containsKey("BackImageResource")) {
            c.b(bVar.m, this.g);
        }
        c.a(bVar.i, this.h);
        c.a(bVar.i, this.i);
        c.a(bVar.i, this.l);
        c.a(bVar.j, this.h);
        c.a(bVar.j, this.i);
        c.a(bVar.k, this.j);
        c.a(bVar.l, this.l);
    }

    private void a(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058eb7eff6f6e5f22e60988857a1e21e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058eb7eff6f6e5f22e60988857a1e21e");
            return;
        }
        this.q.put("BackgroundResource", Integer.valueOf(i));
        if (this.e != null) {
            this.e.setBackgroundResource(i);
        }
    }

    private boolean a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6efc4526ae711f555f6475a882cc290", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6efc4526ae711f555f6475a882cc290")).booleanValue();
        }
        int i2 = i == 1 ? 9 : i == 2 ? 11 : 14;
        if (view != null && (view.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            r9 = layoutParams.getRules()[i2] != -1;
            layoutParams.removeRule(9);
            layoutParams.removeRule(11);
            layoutParams.removeRule(14);
            layoutParams.addRule(i2);
        }
        return r9;
    }
}
