package com.sankuai.eh.plugins.spa;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.spa.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Animation b;
    public Animation c;
    public View d;
    public ImageView e;

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b14d1b4ad7ce6092e291e0c58648be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b14d1b4ad7ce6092e291e0c58648be");
            return;
        }
        this.d = activity.findViewById(R.id.eh_component_web_content);
        this.d.setBackgroundColor(-1);
        this.e = new ImageView(this.d.getContext());
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e.setVisibility(4);
        ((ViewGroup) activity.findViewById(R.id.eh_container_content)).addView(this.e);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bdc3d871e2f5c4e3c6e0b9770e8dd7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bdc3d871e2f5c4e3c6e0b9770e8dd7f");
            return;
        }
        this.b = b.a(10, new b.a() { // from class: com.sankuai.eh.plugins.spa.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.eh.plugins.spa.b.a
            public final void a(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b7f59b88fa0548795354c0f4f79182a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b7f59b88fa0548795354c0f4f79182a9");
                    return;
                }
                a.this.d.setVisibility(0);
                a.this.d.bringToFront();
            }

            @Override // com.sankuai.eh.plugins.spa.b.a
            public final void b(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c332084ecbd587ac506e9b656ca28f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c332084ecbd587ac506e9b656ca28f9");
                } else {
                    a.this.e.setVisibility(4);
                }
            }
        });
        this.c = b.a(11, new b.a() { // from class: com.sankuai.eh.plugins.spa.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.eh.plugins.spa.b.a
            public final void a(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c340e61303bcfdedbc35ff019cba2470", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c340e61303bcfdedbc35ff019cba2470");
                    return;
                }
                a.this.e.bringToFront();
                a.this.d.setVisibility(0);
            }

            @Override // com.sankuai.eh.plugins.spa.b.a
            public final void b(Animation animation) {
                Object[] objArr3 = {animation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4160fe472a7b8b2c3f42917db05057f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4160fe472a7b8b2c3f42917db05057f");
                    return;
                }
                a.this.e.setVisibility(4);
                a.this.d.bringToFront();
            }
        });
    }
}
