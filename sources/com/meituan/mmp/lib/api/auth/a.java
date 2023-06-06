package com.meituan.mmp.lib.api.auth;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends LinearLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public View.OnClickListener d;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cf3892b965b57a574e2ce59f5d6746", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cf3892b965b57a574e2ce59f5d6746");
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64eff5dc2d2dd1939597a28ac8eedb94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64eff5dc2d2dd1939597a28ac8eedb94");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.mmp_dialog_auth_secondary, this);
        startAnimation(AnimationUtils.loadAnimation(context, R.anim.mmp_slide_in_right));
        this.d = getClickListener();
        findViewById(R.id.mmp_back).setOnClickListener(this.d);
        this.b = (TextView) findViewById(R.id.mmp_mini_app_name);
        this.c = (TextView) findViewById(R.id.mmp_auth_details);
    }

    private View.OnClickListener getClickListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062107c4269f553ef54ff01b91f8721a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062107c4269f553ef54ff01b91f8721a") : new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.auth.a.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7065136b952e08dc9d5f3c77f7e210f9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7065136b952e08dc9d5f3c77f7e210f9");
                } else if (view.getId() == R.id.mmp_back) {
                    final a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "053e76c4555a489d5cc3d69f0ec51e3a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "053e76c4555a489d5cc3d69f0ec51e3a");
                        return;
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(aVar.getContext(), R.anim.mmp_slide_out_right);
                    loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.mmp.lib.api.auth.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            Object[] objArr4 = {animation};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e74bef6fdeeb0fa2f3c1acae3d6d93f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e74bef6fdeeb0fa2f3c1acae3d6d93f0");
                            } else {
                                ((ViewGroup) a.this.getParent()).removeView(a.this);
                            }
                        }
                    });
                    aVar.startAnimation(loadAnimation);
                }
            }
        };
    }
}
