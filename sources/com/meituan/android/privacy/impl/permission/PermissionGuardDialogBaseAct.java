package com.meituan.android.privacy.impl.permission;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class PermissionGuardDialogBaseAct extends Activity implements View.OnClickListener {
    public static ChangeQuickRedirect b;
    protected LinearLayout c;
    protected FrameLayout d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    protected TextView i;
    protected ImageView j;
    protected RelativeLayout k;
    protected ImageView l;
    protected PermissionGuard m;
    protected com.meituan.android.privacy.interfaces.def.permission.a n;
    protected boolean o;
    protected String p;
    protected String q;
    protected long r;
    protected com.meituan.android.privacy.interfaces.def.permission.b s;

    public abstract void a();

    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e474b74bd30c10564b526a365af86d29", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e474b74bd30c10564b526a365af86d29");
        }
    }

    public PermissionGuardDialogBaseAct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84982d044d15c1688a2aa7489d1dbca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84982d044d15c1688a2aa7489d1dbca");
        } else {
            this.o = false;
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4d5109eb538beceb7fe5872f720a619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4d5109eb538beceb7fe5872f720a619");
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.activity_permission_guard);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba3815efeade88bbcf85f4bd12824665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba3815efeade88bbcf85f4bd12824665");
        } else {
            this.c = (LinearLayout) findViewById(R.id.bottom_layout);
            this.c.setVisibility(4);
            this.d = (FrameLayout) findViewById(R.id.parent_layout);
            this.d.setVisibility(4);
            this.e = (TextView) findViewById(R.id.refuse_tv);
            this.e.setOnClickListener(this);
            this.f = (TextView) findViewById(R.id.agree_tv);
            this.f.setOnClickListener(this);
            this.g = (TextView) findViewById(R.id.bu_name_tv);
            this.h = (TextView) findViewById(R.id.permission_desc_tv);
            this.i = (TextView) findViewById(R.id.use_desc_tv);
            this.j = (ImageView) findViewById(R.id.logo_iv);
            this.k = (RelativeLayout) findViewById(R.id.select_layout);
            this.k.setOnClickListener(this);
            this.l = (ImageView) findViewById(R.id.select_iv);
        }
        a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8a6604893e4711343ce06b5c5d55496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8a6604893e4711343ce06b5c5d55496");
        } else if (this.m != null && this.m.getInitConfig() != null) {
            this.m.getInitConfig();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5a7287b8378b8a54ec892090315ba2b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5a7287b8378b8a54ec892090315ba2b3");
        } else if (this.c == null || this.d == null) {
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.permission_dialog_show);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.privacy.impl.permission.PermissionGuardDialogBaseAct.1
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    Object[] objArr5 = {animation};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8b357dde8ee22b2498e19b340d01ea09", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8b357dde8ee22b2498e19b340d01ea09");
                    } else if (PermissionGuardDialogBaseAct.this.c == null || PermissionGuardDialogBaseAct.this.c.getVisibility() != 4) {
                    } else {
                        PermissionGuardDialogBaseAct.this.c.setVisibility(0);
                    }
                }
            });
            this.c.startAnimation(loadAnimation);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.permission_activity_bg_show);
            loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.privacy.impl.permission.PermissionGuardDialogBaseAct.2
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    Object[] objArr5 = {animation};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1a67ecce5a6e9879063fded71bf5bb02", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1a67ecce5a6e9879063fded71bf5bb02");
                    } else if (PermissionGuardDialogBaseAct.this.d == null || PermissionGuardDialogBaseAct.this.d.getVisibility() != 4) {
                    } else {
                        PermissionGuardDialogBaseAct.this.d.setVisibility(0);
                    }
                }
            });
            this.d.startAnimation(loadAnimation2);
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250a73705f84a40e7be184672863f84b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250a73705f84a40e7be184672863f84b");
        } else if (this.c == null || this.d == null) {
        } else {
            if (z) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.permission_activity_bg_hide);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.privacy.impl.permission.PermissionGuardDialogBaseAct.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr2 = {animation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50c7b4a1b4a199e946805200263b5e36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50c7b4a1b4a199e946805200263b5e36");
                        } else if (z) {
                            PermissionGuardDialogBaseAct.this.finish();
                        }
                    }
                });
                this.d.startAnimation(loadAnimation);
            }
            Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.permission_dialog_hide);
            loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.privacy.impl.permission.PermissionGuardDialogBaseAct.4
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3df931c8ed54d698f683b19febecd500", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3df931c8ed54d698f683b19febecd500");
                    } else if (PermissionGuardDialogBaseAct.this.c != null) {
                        PermissionGuardDialogBaseAct.this.c.setVisibility(8);
                    }
                }
            });
            this.c.startAnimation(loadAnimation2);
        }
    }

    @UiThread
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0934485ff89d504bf757a8a5ccff0c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0934485ff89d504bf757a8a5ccff0c21");
            return;
        }
        this.o = true;
        this.s.a(i, -1);
        if (z) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62fe66b1cab466e81267501cf8e4eda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62fe66b1cab466e81267501cf8e4eda")).booleanValue();
        }
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51427eec1d668aa25b6d7e7dc048f491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51427eec1d668aa25b6d7e7dc048f491");
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9913f9e60e08995d9db4f748fd948d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9913f9e60e08995d9db4f748fd948d");
        } else {
            super.onDestroy();
        }
    }
}
