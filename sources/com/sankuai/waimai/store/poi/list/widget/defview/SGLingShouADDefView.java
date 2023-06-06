package com.sankuai.waimai.store.poi.list.widget.defview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGLingShouADDefView extends FrameLayout {
    public static ChangeQuickRedirect a;

    public SGLingShouADDefView(@NonNull @NotNull Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "273f3f2ef26e9cae6ea0b0fe86f234d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "273f3f2ef26e9cae6ea0b0fe86f234d0");
        }
    }

    public SGLingShouADDefView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e5cbe94aa49561756fdc0f040b2c8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e5cbe94aa49561756fdc0f040b2c8a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d4b35d36d87a9454774e9a4a7b4aaf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d4b35d36d87a9454774e9a4a7b4aaf1");
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.wm_sg_ling_shou_ad_def1, this);
        }
    }
}
