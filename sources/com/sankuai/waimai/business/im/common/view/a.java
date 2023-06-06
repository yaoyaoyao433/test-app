package com.sankuai.waimai.business.im.common.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends PopupWindow {
    public static ChangeQuickRedirect a;
    private Handler b;

    public static /* synthetic */ void a(a aVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c2cd35d4d3b90ac93dda3b06c22cea6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c2cd35d4d3b90ac93dda3b06c22cea6e");
            return;
        }
        View contentView = aVar.getContentView();
        contentView.measure(0, 0);
        int measuredWidth = contentView.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        p.a(aVar, view, 51, (iArr[0] + (view.getWidth() / 2)) - ((measuredWidth - g.a(view.getContext(), 31.0f)) - g.a(view.getContext(), 2.5f)), iArr[1] + view.getHeight() + g.a(view.getContext(), 3.5f));
        aVar.b.removeCallbacksAndMessages(null);
        aVar.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.common.view.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d87e0eaddb1c8942a23ca7a4c797a4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d87e0eaddb1c8942a23ca7a4c797a4a");
                } else if (a.this.isShowing()) {
                    p.b(a.this);
                }
            }
        }, PayTask.j);
    }

    public a(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb5e0f3edc87dc53a23a6ee27038430", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb5e0f3edc87dc53a23a6ee27038430");
            return;
        }
        this.b = new Handler();
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R.drawable.wm_im_phone_guide);
        setBackgroundDrawable(new BitmapDrawable());
        setOutsideTouchable(true);
        setContentView(textView);
    }

    public final void a(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd76e2975dca4509a73dab122a9edc3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd76e2975dca4509a73dab122a9edc3a");
        } else if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(view.getContext(), "wm_im_phone_guide_view_show_key", false)) {
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(view.getContext(), "wm_im_phone_guide_view_show_key", true);
            this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.common.view.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a00100c09708cb49eeda2d3ebb102802", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a00100c09708cb49eeda2d3ebb102802");
                    } else if (view.getWindowToken() == null || view.getWidth() == 0 || view.getHeight() == 0) {
                        a.this.b.postDelayed(this, 1000L);
                    } else {
                        a.a(a.this, view);
                    }
                }
            }, 1000L);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a079aab8a9c0cb4caa3f009e7a3714d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a079aab8a9c0cb4caa3f009e7a3714d4");
            return;
        }
        if (isShowing()) {
            p.b(this);
        }
        this.b.removeCallbacksAndMessages(null);
    }
}
