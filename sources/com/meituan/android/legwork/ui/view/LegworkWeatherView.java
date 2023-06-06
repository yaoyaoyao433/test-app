package com.meituan.android.legwork.ui.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.weather.e;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkWeatherView extends FrameLayout implements LifecycleEventListener {
    public static ChangeQuickRedirect a;
    public e b;
    public View c;
    private int d;
    private final Runnable e;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public LegworkWeatherView(@NonNull Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e67a7bcf1ed3db47add58f8eb6d7e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e67a7bcf1ed3db47add58f8eb6d7e8");
        }
    }

    public LegworkWeatherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1163a4d0159886984f65fd1850a5b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1163a4d0159886984f65fd1850a5b2");
            return;
        }
        this.d = -1;
        this.e = c.a(this);
        LayoutInflater.from(context).inflate(R.layout.wm_widget_weather, (ViewGroup) this, true);
        this.c = findViewById(R.id.weather_layout);
        this.b = new e(this.c, context);
        this.c.setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab37967d64a501bc68e5ecdbb672b7f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab37967d64a501bc68e5ecdbb672b7f8");
            return;
        }
        super.onDetachedFromWindow();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84f2f8a76829500c56b572c24e5bd350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84f2f8a76829500c56b572c24e5bd350");
        } else {
            this.b.f();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3663ef7ea066ffbd7362d4b067e38873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3663ef7ea066ffbd7362d4b067e38873");
        } else if (this.d == i) {
        } else {
            this.d = i;
            this.b.f();
            this.b.a(i);
            if (i != 0) {
                this.c.setVisibility(0);
                requestLayout();
                post(d.a(this));
                return;
            }
            this.c.setVisibility(4);
        }
    }

    public static /* synthetic */ void b(LegworkWeatherView legworkWeatherView) {
        Object[] objArr = {legworkWeatherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f546c6e666dc3af24053cff7ea82a59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f546c6e666dc3af24053cff7ea82a59e");
        } else {
            legworkWeatherView.b.e();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6663e623d691ad7b5202ba7f7b10ca2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6663e623d691ad7b5202ba7f7b10ca2e");
            return;
        }
        super.requestLayout();
        post(this.e);
    }

    public static /* synthetic */ void a(LegworkWeatherView legworkWeatherView) {
        Object[] objArr = {legworkWeatherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c4d8a973979c2d0179a109d96f18e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c4d8a973979c2d0179a109d96f18e48");
            return;
        }
        legworkWeatherView.measure(View.MeasureSpec.makeMeasureSpec(legworkWeatherView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(legworkWeatherView.getHeight(), 1073741824));
        legworkWeatherView.layout(legworkWeatherView.getLeft(), legworkWeatherView.getTop(), legworkWeatherView.getRight(), legworkWeatherView.getBottom());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b629bf465d6b37da364f3b4fe8984270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b629bf465d6b37da364f3b4fe8984270");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6674a6bff27510cd4168375049df2eed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6674a6bff27510cd4168375049df2eed");
        } else {
            this.b.b();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c2df96b439a66133009de33c3a49fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c2df96b439a66133009de33c3a49fa");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5f0dc00df7c6b6003c420e5491385f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5f0dc00df7c6b6003c420e5491385f6");
        } else {
            this.b.c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a26d18f2c1bb16ac2903b87b9d09c1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a26d18f2c1bb16ac2903b87b9d09c1bd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e24a84f21410ea00cbf192b7f33e0c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e24a84f21410ea00cbf192b7f33e0c8");
        } else {
            this.b.d();
        }
    }
}
