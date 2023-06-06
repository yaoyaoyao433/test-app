package com.sankuai.waimai.sa.ui.assistant.voice;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.sa.ui.assistant.c {
    public static ChangeQuickRedirect c;
    private TextView.OnEditorActionListener A;
    private TextWatcher B;
    private com.sankuai.waimai.sa.ui.assistant.voice.a C;
    Activity d;
    c e;
    public Vibrator f;
    View g;
    EditText h;
    public TextView i;
    public a j;
    LinearLayout k;
    View l;
    public d m;
    public int n;
    com.sankuai.waimai.sa.ui.assistant.d o;
    ImageView p;
    ImageView q;
    LinearLayout r;
    LinearLayout s;
    boolean t;
    private InputMethodManager u;
    private FrameLayout v;
    private int w;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(String str);

        void b(String str);

        boolean b();

        void c();

        void c(String str);
    }

    public b(@NonNull Activity activity, c cVar, com.sankuai.waimai.sa.ui.assistant.d dVar) {
        super(activity.getApplicationContext());
        Object[] objArr = {activity, cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5bce3c079843e189c78cb14106f5255", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5bce3c079843e189c78cb14106f5255");
            return;
        }
        this.w = 1;
        this.n = 1;
        this.t = false;
        this.A = new TextView.OnEditorActionListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47b6e2338dce416f7d6e25b8fd8fa689", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47b6e2338dce416f7d6e25b8fd8fa689")).booleanValue();
                }
                if (i == 4) {
                    String a2 = b.this.a();
                    if (!TextUtils.isEmpty(a2)) {
                        b.this.j.b(a2);
                    }
                }
                return false;
            }
        };
        this.B = new TextWatcher() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.6
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64dc1b581542c5d08ee74ce399617ca2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64dc1b581542c5d08ee74ce399617ca2");
                } else if (editable.toString().trim().length() == 0) {
                    b.this.d(true);
                } else {
                    b.this.d(false);
                }
            }
        };
        this.C = new com.sankuai.waimai.sa.ui.assistant.voice.a() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.a
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d89de96aa62021d852ad6c5c32c51cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d89de96aa62021d852ad6c5c32c51cd");
                } else {
                    b.this.m.c();
                }
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdac09f4226aff7f6baaec0cb6edcf71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdac09f4226aff7f6baaec0cb6edcf71");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.c;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "2f2178a6ddfc2c166f310ba234b3a78a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "2f2178a6ddfc2c166f310ba234b3a78a");
                    return;
                }
                bVar.l.setVisibility(0);
                bVar.q.setVisibility(0);
                bVar.b(1, true);
                bVar.m.a(bVar.n);
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60997b345eae984400598dccdf429d36", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60997b345eae984400598dccdf429d36");
                    return;
                }
                b.this.j.c();
                if (b.this.n == 0) {
                    b.this.b();
                }
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fa48326fa69121f252b7a17374d5d5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fa48326fa69121f252b7a17374d5d5f");
                    return;
                }
                b.this.j.b();
                if (b.this.n == 0) {
                    b.this.b();
                }
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.a
            public final void a(String str, boolean z) {
                Object[] objArr2 = {str, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87a7c639ea2fcae2b8077f410f83e3e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87a7c639ea2fcae2b8077f410f83e3e8");
                    return;
                }
                b.this.a(2, false);
                b.this.j.c(str);
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.voice.a
            public final void a(int i, byte[] bArr) {
                Object[] objArr2 = {Integer.valueOf(i), null};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b980d656e6cb2d08bcda6a6307a026e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b980d656e6cb2d08bcda6a6307a026e");
                } else {
                    b.this.m.c = i;
                }
            }
        };
        this.d = activity;
        this.o = dVar;
        this.e = cVar;
        this.u = (InputMethodManager) this.y.getSystemService("input_method");
        this.f = (Vibrator) this.y.getSystemService("vibrator");
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd51031e693a8663f163528072525a11", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd51031e693a8663f163528072525a11");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_smart_assistant_bottom_layout, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7133827843aff2e1e18da2570235dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7133827843aff2e1e18da2570235dfe");
        } else {
            this.m = new d(inflate.getContext(), inflate.findViewById(R.id.visualizer_wave));
            this.v = (FrameLayout) inflate.findViewById(R.id.sa_voice_bottom_bar);
            this.l = inflate.findViewById(R.id.sa_keyboard_btn);
            this.k = (LinearLayout) inflate.findViewById(R.id.sa_input_bottom_bar);
            this.g = inflate.findViewById(R.id.sa_input_icon);
            this.h = (EditText) inflate.findViewById(R.id.sa_input_edit);
            this.i = (TextView) inflate.findViewById(R.id.sa_input_ok);
            this.p = (ImageView) inflate.findViewById(R.id.sa_close);
            this.q = (ImageView) inflate.findViewById(R.id.sa_voice_close);
            this.s = (LinearLayout) inflate.findViewById(R.id.sa_close_container);
            this.r = (LinearLayout) inflate.findViewById(R.id.sa_voice_container);
            e(this.w == 1);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72f63d641ed90c5fcca97dd7d6f667ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72f63d641ed90c5fcca97dd7d6f667ee");
        } else {
            this.h.setOnEditorActionListener(this.A);
            this.h.addTextChangedListener(this.B);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.8
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1ced5ac9d03f9ee43111adcb5dc13bf1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1ced5ac9d03f9ee43111adcb5dc13bf1");
                        return;
                    }
                    String a2 = b.this.a();
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    b.this.j.a(a2);
                }
            });
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "85547d8b5f5a6e8316eabfa9f2cc3688", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "85547d8b5f5a6e8316eabfa9f2cc3688");
                        return;
                    }
                    b.this.d.finish();
                    b.this.d.overridePendingTransition(R.anim.wm_common_dialog_alpha_in, R.anim.wm_common_popup_window_slide_out);
                    JudasManualManager.a("b_u3gg5de7").a("c_6tg6wz4r").a();
                }
            });
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.10
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7e15bd334b90976f03f322e6f2642ad0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7e15bd334b90976f03f322e6f2642ad0");
                        return;
                    }
                    b.this.d.finish();
                    b.this.d.overridePendingTransition(R.anim.wm_common_dialog_alpha_in, R.anim.wm_common_popup_window_slide_out);
                    JudasManualManager.a("b_u3gg5de7").a("c_6tg6wz4r").a();
                }
            });
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1831d02a0d193b3d3898a9a99bb02043", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1831d02a0d193b3d3898a9a99bb02043");
                        return;
                    }
                    b.this.o.j = false;
                    b.this.j.a();
                    b.this.e(true);
                    b.this.g.setVisibility(8);
                }
            });
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.12
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fdf9b76e027a9ca025de6603d4676866", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fdf9b76e027a9ca025de6603d4676866");
                        return;
                    }
                    b.this.o.j = false;
                    b.this.e(false);
                    b.this.h.requestFocus();
                    b.this.f(true);
                }
            });
            this.h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.13
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    Object[] objArr4 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f46079a13955dacbaa714001d7f82d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f46079a13955dacbaa714001d7f82d8");
                    } else if (!z) {
                        if (!TextUtils.isEmpty(b.this.h.getText().toString())) {
                            b.this.i.setTextColor(-13421773);
                            b.this.i.setBackgroundResource(R.drawable.wm_smart_assistant_send_button_hightlight_background);
                            b.this.t = true;
                        }
                        b.this.p.postDelayed(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.13.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5004d08f2be50e29c6c3c5d7fc980cae", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5004d08f2be50e29c6c3c5d7fc980cae");
                                    return;
                                }
                                b.this.g.setVisibility(0);
                                b.this.p.setVisibility(0);
                                b.this.r.setVisibility(0);
                                b.this.s.setVisibility(0);
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b.this.k.getLayoutParams();
                                layoutParams.setMargins(0, g.a(b.this.y, 10.0f), 0, g.a(b.this.y, 10.0f));
                                b.this.k.setLayoutParams(layoutParams);
                            }
                        }, 300L);
                    } else {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b.this.k.getLayoutParams();
                        layoutParams.setMargins(g.a(b.this.y, 15.0f), g.a(b.this.y, 10.0f), g.a(b.this.y, 15.0f), g.a(b.this.y, 10.0f));
                        b.this.k.setLayoutParams(layoutParams);
                        b.this.r.setVisibility(8);
                        b.this.s.setVisibility(8);
                        b.this.k.startAnimation(AnimationUtils.loadAnimation(b.this.y, R.anim.wm_smart_assistant_input_bottom));
                    }
                }
            });
            this.e.a(this.C);
            this.m.b = new com.sankuai.waimai.sa.ui.assistant.view.b() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.sa.ui.assistant.view.b
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "94f9c45b170d411c43a64e0a61e664fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "94f9c45b170d411c43a64e0a61e664fe");
                    } else if (b.this.n != 0) {
                        if (b.this.j.b()) {
                            final b bVar = b.this;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = b.c;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "ce4595704286e46e1508cc58621d2539", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "ce4595704286e46e1508cc58621d2539");
                                return;
                            }
                            e createPermissionGuard = Privacy.createPermissionGuard();
                            if (createPermissionGuard == null) {
                                bVar.a(bVar.d.getString(R.string.wm_permission_record_never_ask));
                            } else {
                                createPermissionGuard.a(bVar.d, PermissionGuard.PERMISSION_MICROPHONE, "dj-3a597ac932e6c559", new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.3
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.android.privacy.interfaces.d
                                    public final void onResult(String str, final int i) {
                                        Object[] objArr6 = {str, Integer.valueOf(i)};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9df7e008f9911dc9d914e2bab3594fb6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9df7e008f9911dc9d914e2bab3594fb6");
                                        } else {
                                            b.this.d.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.3.1
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr7 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "42326aaa6fbb60f46cf98d231c3074f7", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "42326aaa6fbb60f46cf98d231c3074f7");
                                                    } else if (i > 0) {
                                                        b bVar2 = b.this;
                                                        Object[] objArr8 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect8 = b.c;
                                                        if (PatchProxy.isSupport(objArr8, bVar2, changeQuickRedirect8, false, "f4903f16911dfe30c959db3fd81fe216", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr8, bVar2, changeQuickRedirect8, false, "f4903f16911dfe30c959db3fd81fe216");
                                                            return;
                                                        }
                                                        bVar2.f.vibrate(new long[]{0, 200}, -1);
                                                        bVar2.l.setVisibility(8);
                                                        bVar2.q.setVisibility(8);
                                                        bVar2.b(0, false);
                                                        bVar2.e.a();
                                                    } else {
                                                        b.this.a(b.this.d.getString(R.string.wm_permission_record_never_ask));
                                                    }
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        }
                    } else {
                        b.this.b();
                    }
                }
            };
        }
        return inflate;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e80270187b4c77b8ac1427dbe611ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e80270187b4c77b8ac1427dbe611ca");
        } else {
            new AlertDialog.a(this.d).a(this.d.getString(R.string.wm_permission_dialog_title)).b(str).a(this.d.getString(R.string.wm_permission_dialog_btn_go_setting), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec4347f79c6a6a719338afa3232adf32", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec4347f79c6a6a719338afa3232adf32");
                    } else {
                        com.sankuai.waimai.platform.capacity.permission.b.a((Context) b.this.d, true);
                    }
                }
            }).b(this.d.getString(R.string.dialog_btn_cancel), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.b.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbb04a9466d7b54289acc150ab58dc4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbb04a9466d7b54289acc150ab58dc4e");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).a(false).a().show();
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e192f9a4ee12def1ca5d491e46f8e9db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e192f9a4ee12def1ca5d491e46f8e9db");
        }
        String trim = this.h.getText().toString().trim();
        this.h.setText("");
        return trim;
    }

    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da0864fd3ec375101d779d2bbbd8793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da0864fd3ec375101d779d2bbbd8793");
        } else if (bool.booleanValue() && c()) {
            d(false);
        } else {
            d(true);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7afd06f385a297542a686304442b83", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7afd06f385a297542a686304442b83")).booleanValue() : this.h.getText().length() > 0;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439e7b8c9892f4e95736b3d802446356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439e7b8c9892f4e95736b3d802446356");
            return;
        }
        if (z) {
            this.h.requestFocus();
        } else {
            this.h.clearFocus();
        }
        f(z);
    }

    void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99ef61f4cf59202b10509410fa7e933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99ef61f4cf59202b10509410fa7e933");
        } else if (z) {
            if (!this.t) {
                this.i.setTextColor(1301911961);
                this.i.setBackgroundResource(R.drawable.wm_smart_assistant_send_button_white_background);
                return;
            }
            this.i.setTextColor(-13421773);
            this.i.setBackgroundResource(R.drawable.wm_smart_assistant_send_button_hightlight_background);
            this.t = false;
        } else {
            this.i.setTextColor(-13421773);
            this.i.setBackgroundResource(R.drawable.wm_smart_assistant_send_button_hightlight_background);
        }
    }

    void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9388344d452194ffa7bf099dc165b6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9388344d452194ffa7bf099dc165b6eb");
        } else if (z) {
            this.k.setVisibility(8);
            this.g.setVisibility(8);
            this.p.setVisibility(8);
            this.v.setVisibility(0);
            f(!z ? 1 : 0);
            JudasManualManager.b("b_t3h0lh0k").a("c_6tg6wz4r").a("sa_enter_mode", "audio_mode").a();
            this.o.a(f(), true);
        } else {
            this.k.setVisibility(0);
            this.r.setVisibility(8);
            this.s.setVisibility(8);
            this.v.setVisibility(8);
            JudasManualManager.b("b_t3h0lh0k").a("c_6tg6wz4r").a("sa_enter_mode", "text_mode").a();
            this.o.a(f(), false);
        }
    }

    void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c40e99ffc25eab76a8aa648bb4d420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c40e99ffc25eab76a8aa648bb4d420");
        } else if (z) {
            this.u.showSoftInput(this.h, 1);
        } else {
            this.u.hideSoftInputFromWindow(this.h.getWindowToken(), 0);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a8d1286841cc37918472c58f43b35a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a8d1286841cc37918472c58f43b35a");
            return;
        }
        this.l.setVisibility(0);
        this.q.setVisibility(0);
        b(1, false);
        this.e.b();
        this.m.c();
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3349aadf06944ba724f12d3960cb94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3349aadf06944ba724f12d3960cb94");
            return;
        }
        b(i, false);
        this.m.e = z;
        this.m.a(i);
    }

    void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88dc92379419585f20fc0cd8c91dbe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88dc92379419585f20fc0cd8c91dbe5");
            return;
        }
        this.n = i;
        this.m.a(this.n, z);
    }
}
