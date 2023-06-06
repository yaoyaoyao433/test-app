package com.meituan.passport.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.passport.exception.skyeyemonitor.module.p;
import com.meituan.passport.plugins.q;
import com.meituan.passport.plugins.u;
import com.meituan.passport.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OuterMopImageView extends AppCompatImageView implements ad.a {
    public static ChangeQuickRedirect a;
    public final ad b;

    public static /* synthetic */ void a(OuterMopImageView outerMopImageView, int i, String str) {
        Object[] objArr = {1, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, outerMopImageView, changeQuickRedirect, false, "6230183dd01648b614335272f7ab31e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, outerMopImageView, changeQuickRedirect, false, "6230183dd01648b614335272f7ab31e4");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("message", str);
        ((p) com.meituan.passport.exception.skyeyemonitor.a.a().a("outer_mop_operator")).b(hashMap);
    }

    public OuterMopImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e94188115f4a3e364037011a5001b2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e94188115f4a3e364037011a5001b2a");
        }
    }

    public OuterMopImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3179bb20330661fc06e0d6f47c4669a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3179bb20330661fc06e0d6f47c4669a8");
        }
    }

    public OuterMopImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d1a3d97dee9bb0f40376c4a6a704f7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d1a3d97dee9bb0f40376c4a6a704f7e");
            return;
        }
        this.b = new ad(getContext());
        this.b.c = this;
    }

    @Override // com.meituan.passport.utils.ad.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c513067239e0097ffe12f03244f391a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c513067239e0097ffe12f03244f391a9");
            return;
        }
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.passport_button_onekey_outer_bg));
        setImageResource(R.drawable.passport_ic_outer_top);
    }

    @Override // com.meituan.passport.utils.ad.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e3b2cf0e3a7fd1472a4f077cc6b335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e3b2cf0e3a7fd1472a4f077cc6b335");
        } else {
            q.a().f().a(str, (u) new a(getContext(), this));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a extends u {
        public static ChangeQuickRedirect a;
        private final Context c;
        private final ImageView d;

        public a(Context context, ImageView imageView) {
            Object[] objArr = {OuterMopImageView.this, context, imageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c548087559f5b72649276a2eb82672c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c548087559f5b72649276a2eb82672c");
                return;
            }
            this.c = context;
            this.d = imageView;
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfe58c064d6a786fe0c04942f6c0134", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfe58c064d6a786fe0c04942f6c0134");
                return;
            }
            this.d.setBackgroundColor(ContextCompat.getColor(this.c, R.color.passport_button_onekey_outer_bg));
            this.d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.d.setImageResource(R.drawable.passport_ic_outer_top);
            OuterMopImageView.a(OuterMopImageView.this, 1, "picasso 加载失败");
            com.meituan.passport.utils.p.a().a(this.c, "失败");
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45a1ca0414992009bb02d3352528676", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45a1ca0414992009bb02d3352528676");
                return;
            }
            this.d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.d.setImageBitmap(bitmap);
            com.meituan.passport.utils.p.a().a(this.c, "成功");
        }
    }
}
