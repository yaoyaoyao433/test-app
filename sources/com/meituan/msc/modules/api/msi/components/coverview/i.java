package com.meituan.msc.modules.api.msi.components.coverview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class i extends ImageView implements c {
    public static ChangeQuickRedirect c;
    public a d;

    public i(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082ca384d9fd2105888005f47df2aa77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082ca384d9fd2105888005f47df2aa77");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ede4ef64e6c9510a1ae51d093cd877c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ede4ef64e6c9510a1ae51d093cd877c");
            return;
        }
        super.onDetachedFromWindow();
        setOnClickListener(null);
        setOnTouchListener(null);
    }

    @Override // com.meituan.msc.modules.api.msi.components.coverview.c
    public a getCoverUpdateObserver() {
        return this.d;
    }

    @Override // com.meituan.msc.modules.api.msi.components.coverview.c
    public final void a(a aVar) {
        this.d = aVar;
    }
}
