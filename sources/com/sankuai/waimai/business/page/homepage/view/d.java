package com.sankuai.waimai.business.page.homepage.view;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends PopupWindow {
    public static ChangeQuickRedirect a;
    public Context b;
    public TextView c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        LEFT,
        CENTER,
        RIGHT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9f7153c9414d4e7946f4d1c82a3dc6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9f7153c9414d4e7946f4d1c82a3dc6");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62a9f77d26af9872e552a463021faf9f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62a9f77d26af9872e552a463021faf9f") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "861b94252e5c2fa8e5830debbd03cef4", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "861b94252e5c2fa8e5830debbd03cef4") : (a[]) values().clone();
        }
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14d1144526d24984222a227a2bf67d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14d1144526d24984222a227a2bf67d9");
            return;
        }
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_page_main_mine_sky_fall_bubble, (ViewGroup) null);
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(false);
        setAnimationStyle(R.style.popup_bubble);
        this.c = (TextView) inflate.findViewById(R.id.popup_bubble_text);
        inflate.measure(-2, -2);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.homepage.view.d$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[a.valuesCustom().length];

        static {
            try {
                a[a.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }
}
