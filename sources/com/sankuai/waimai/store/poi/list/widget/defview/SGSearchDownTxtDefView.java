package com.sankuai.waimai.store.poi.list.widget.defview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.e;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchDownTxtDefView extends LinearLayout {
    public static ChangeQuickRedirect a;

    public SGSearchDownTxtDefView(@NonNull @NotNull Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1789fc5f2b0515d74a3c3c33822f91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1789fc5f2b0515d74a3c3c33822f91");
        }
    }

    public SGSearchDownTxtDefView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa8db33d162edfd407f7fac582e82f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa8db33d162edfd407f7fac582e82f2");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a444acc4a886d8b3e3d949aa30997e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a444acc4a886d8b3e3d949aa30997e");
            return;
        }
        int a2 = h.a(context, 20.0f);
        int a3 = h.a(context, 7.0f);
        setOrientation(0);
        setGravity(16);
        int[] iArr = {38, 60, 82, 38, 70};
        for (int i = 0; i < 5; i++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(context, iArr[i]), a2);
            if (i != 0) {
                layoutParams.leftMargin = a3;
            }
            View view = new View(context);
            view.setBackground(e.b(context, (int) R.color.wm_sg_color_FFFFFF, (int) R.dimen.wm_sc_common_dimen_10));
            addView(view, layoutParams);
        }
    }
}
