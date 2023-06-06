package com.sankuai.waimai.business.page.homepage.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends PopupWindow {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final ImageView c;
    private final TextView d;
    private final View e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.homepage.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0797a {
        LEFT,
        CENTER,
        RIGHT;
        
        public static ChangeQuickRedirect a;

        EnumC0797a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811b56494961921dc5ebafe58552b807", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811b56494961921dc5ebafe58552b807");
            }
        }

        public static EnumC0797a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fc5efaed9e86edff80e985cec52272f", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0797a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fc5efaed9e86edff80e985cec52272f") : (EnumC0797a) Enum.valueOf(EnumC0797a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0797a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62e0c72aae86a78b3a7af7d62548bd64", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0797a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62e0c72aae86a78b3a7af7d62548bd64") : (EnumC0797a[]) values().clone();
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b91c8a0a55ab144c9e36e055e16d22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b91c8a0a55ab144c9e36e055e16d22");
            return;
        }
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.takeout_view_popup_bubble, (ViewGroup) null);
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(false);
        setAnimationStyle(R.style.popup_bubble);
        this.c = (ImageView) inflate.findViewById(R.id.popup_bubble_icon);
        this.d = (TextView) inflate.findViewById(R.id.popup_bubble_text);
        this.e = inflate.findViewById(R.id.popup_bubble_arrow);
        inflate.measure(-2, -2);
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a47d5b6f649ae43792fd96dedf66bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a47d5b6f649ae43792fd96dedf66bd");
        } else if (TextUtils.isEmpty(str)) {
            this.c.setImageResource(i);
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = str;
            a2.a(this.c);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee70f074a87c61f9f4587f0b59229fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee70f074a87c61f9f4587f0b59229fe");
        } else {
            this.d.setText(str);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.homepage.view.a$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[EnumC0797a.valuesCustom().length];

        static {
            try {
                a[EnumC0797a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0797a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0797a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void a(View view, EnumC0797a enumC0797a, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        Object[] objArr = {view, enumC0797a, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed4df5098462dcf4f6b44e74e709c4e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed4df5098462dcf4f6b44e74e709c4e6");
            return;
        }
        int i6 = AnonymousClass1.a[enumC0797a.ordinal()];
        if (i6 == 1) {
            i3 = 3;
            i5 = (i2 - i) - a();
            i4 = 0;
        } else if (i6 != 3) {
            i4 = 0;
            i3 = 1;
        } else {
            i4 = (i2 - i) - a();
            i3 = 5;
        }
        a(i3, i5, i4);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        p.a(this, view, i3 | 48, i, iArr[1] - this.b.getResources().getDimensionPixelSize(R.dimen.takeout_popup_bubble_panel_height));
    }

    private void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56439cdbbe48c47376c08d4592fa00ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56439cdbbe48c47376c08d4592fa00ff");
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        try {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.setMargins(i2, 0, i3, 0);
            layoutParams.gravity = i;
            this.e.setLayoutParams(layoutParams);
        } catch (ClassCastException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9847273bbe668019702e4b52c6adf9d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9847273bbe668019702e4b52c6adf9d")).intValue() : this.e.getMeasuredWidth() / 2;
    }
}
