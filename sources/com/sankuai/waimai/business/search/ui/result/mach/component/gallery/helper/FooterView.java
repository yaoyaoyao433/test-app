package com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.c;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FooterView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private ImageView c;
    private c d;
    private boolean e;

    public FooterView(@NonNull Context context, c cVar) {
        this(context, (AttributeSet) null);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b432bbac816cbff9746ef8856d32b7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b432bbac816cbff9746ef8856d32b7b");
            return;
        }
        this.d = cVar;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdc9e94319ae6b6addc2505a182febf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdc9e94319ae6b6addc2505a182febf8");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_nox_aladdin_footer_view, (ViewGroup) this, true);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(g.a(context, this.d.f), -2));
        this.b = (TextView) inflate.findViewById(R.id.tv_hint);
        this.c = (ImageView) inflate.findViewById(R.id.img_arrow);
        a();
    }

    private FooterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc1f0885cdbce9c47050759ebe9bca89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc1f0885cdbce9c47050759ebe9bca89");
        }
    }

    public FooterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d969f12972e33b55e5815bec2b537e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d969f12972e33b55e5815bec2b537e7");
        } else {
            this.e = true;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8460a4822324339df4784a592c0262b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8460a4822324339df4784a592c0262b3");
        } else if (this.e) {
            this.b.setText("查看更多");
        } else {
            this.b.setText("释放查看");
        }
    }

    public void setIsPullStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe68e9bde7b2ba514d62e9cec034b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe68e9bde7b2ba514d62e9cec034b4e");
        } else if (this.e == z) {
        } else {
            this.e = z;
            a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccd81f6f20ada3e5317653a858ae16c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccd81f6f20ada3e5317653a858ae16c2");
            } else if (this.e) {
                ObjectAnimator.ofFloat(this.c, RecceAnimUtils.ROTATION, 180.0f, 0.0f).setDuration(getResources().getInteger(17694720)).start();
            } else {
                ObjectAnimator.ofFloat(this.c, RecceAnimUtils.ROTATION, 0.0f, 180.0f).setDuration(getResources().getInteger(17694720)).start();
            }
        }
    }
}
