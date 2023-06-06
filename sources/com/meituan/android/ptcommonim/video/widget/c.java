package com.meituan.android.ptcommonim.video.widget;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ColorUtils;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public ProgressBar b;
    public final LinearLayout c;
    public final TextView d;
    private PopupWindow e;
    private final LinearLayout f;
    private final TextView g;
    private final boolean h;

    public c(Activity activity, int i, boolean z) {
        Object[] objArr = {activity, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8d36e824a3cab3828aef2db6968e3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8d36e824a3cab3828aef2db6968e3c");
            return;
        }
        this.h = z;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.ptim_commonbus_video_loading_dialog_layout, (ViewGroup) null);
        this.c = (LinearLayout) inflate.findViewById(R.id.video_loading_container);
        this.f = (LinearLayout) inflate.findViewById(R.id.video_loading_progress_container);
        this.b = (ProgressBar) inflate.findViewById(R.id.video_loading_progressbar);
        this.d = (TextView) inflate.findViewById(R.id.video_loading_progress_tv);
        this.g = (TextView) inflate.findViewById(R.id.video_loading_content);
        if (i == 0) {
            this.d.setVisibility(0);
            this.d.setText("0%");
            this.b.setMax(100);
            this.b.setProgress(0);
        } else if (i == 1) {
            this.d.setVisibility(8);
        } else if (i == 2) {
            this.f.setVisibility(8);
        }
        this.e = new PopupWindow(inflate, -1, -1, true);
        if (!z) {
            this.e.setBackgroundDrawable(new ColorDrawable(ColorUtils.parseColor("#99000000", 0)));
        }
        this.e.setFocusable(false);
        this.e.setOutsideTouchable(false);
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da61853990d55dbaf884fec16c9d4c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da61853990d55dbaf884fec16c9d4c72");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            p.a(this.e, activity.getWindow().getDecorView(), 48, 0, 0);
            if (this.h) {
                a(0.0f);
            }
        }
    }

    private void a(float f) {
        View view;
        Object[] objArr = {Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2f161f47e03d39150c410e888b0e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2f161f47e03d39150c410e888b0e11");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                view = (View) this.e.getContentView().getParent().getParent();
            } else {
                view = (View) this.e.getContentView().getParent();
            }
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            layoutParams.flags = 2;
            layoutParams.dimAmount = 0.0f;
            ((WindowManager) view.getContext().getSystemService("window")).updateViewLayout(view, layoutParams);
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9a4426d0d84d4cea9b872b752f8c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9a4426d0d84d4cea9b872b752f8c27");
        } else {
            this.g.setText(str);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186f62822fb78146917ff7ca7b6e4909", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186f62822fb78146917ff7ca7b6e4909")).booleanValue() : this.e != null && this.e.isShowing();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ecbe405e88ecc1612a9ca09e2974b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ecbe405e88ecc1612a9ca09e2974b8");
        } else {
            p.b(this.e);
        }
    }
}
