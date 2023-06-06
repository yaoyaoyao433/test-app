package com.sankuai.xm.imui.theme;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    public static ChangeQuickRedirect a;
    public static final Set<Integer> b;
    private static c c;
    private b d;
    private HashMap<Short, b> e;
    private List<a> f;
    private Context g;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(b bVar);
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add(0);
        b.add(19);
        b.add(1);
        b.add(18);
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45247cfd06de50a297a70693f4ab7d85", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45247cfd06de50a297a70693f4ab7d85");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5463234c41ee083fea937e2f6ae59bde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5463234c41ee083fea937e2f6ae59bde");
            return;
        }
        this.d = null;
        this.e = new HashMap<>();
        this.f = new ArrayList();
        this.g = f.m().g();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0155bf4b264292c992c93e32bcb73ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0155bf4b264292c992c93e32bcb73ab");
        } else if (this.d == null) {
            this.d = a(this.g, (int) R.style.xm_sdk_theme_style_default_page);
            if (this.d == null) {
                this.d = new b();
                d.c("initDefaultTheme::using empty theme.", new Object[0]);
            }
        }
    }

    public final void a(short s, b bVar) {
        b bVar2;
        b bVar3 = bVar;
        Object[] objArr = {Short.valueOf(s), bVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3b49ea7c6d3853e263c4fefbb4e8db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3b49ea7c6d3853e263c4fefbb4e8db");
            return;
        }
        b();
        synchronized (this) {
            try {
                if (bVar3 == null) {
                    this.e.remove(Short.valueOf(s));
                    bVar3 = a(s);
                } else {
                    HashMap<Short, b> hashMap = this.e;
                    Short valueOf = Short.valueOf(s);
                    b bVar4 = this.d;
                    Object[] objArr2 = {bVar4};
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "bae7ba8467f7728fa61b3a0aa4714f15", 6917529027641081856L)) {
                        bVar2 = (b) PatchProxy.accessDispatch(objArr2, bVar3, changeQuickRedirect2, false, "bae7ba8467f7728fa61b3a0aa4714f15");
                    } else {
                        if (bVar4 != null) {
                            if (bVar3.b == null) {
                                bVar3.b = bVar4.b;
                            }
                            if (bVar3.c == null && bVar3.d == null) {
                                bVar3.c = bVar4.c;
                                bVar3.d = bVar4.d;
                            }
                            if (bVar3.e == null && bVar3.f == null) {
                                bVar3.e = bVar4.e;
                                bVar3.f = bVar4.f;
                            }
                            if (bVar3.g == null && bVar3.h == null) {
                                bVar3.g = bVar4.g;
                                bVar3.h = bVar4.h;
                            }
                            if (bVar3.i == null) {
                                bVar3.i = bVar4.i;
                            }
                            if (bVar3.j == null) {
                                bVar3.j = bVar4.j;
                            }
                            if (bVar3.k == null) {
                                bVar3.k = bVar4.k;
                            }
                            if (bVar3.l == null) {
                                bVar3.l = bVar4.l;
                            }
                            if (bVar3.m == null) {
                                bVar3.m = bVar4.m;
                            }
                        }
                        bVar2 = bVar3;
                    }
                    hashMap.put(valueOf, bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(bVar3);
    }

    public final void a(short s, @StyleRes int i) {
        Object[] objArr = {Short.valueOf(s), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f15eaafe1d3f483c05ba85965e06dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f15eaafe1d3f483c05ba85965e06dd");
        } else {
            a(s, a(this.g, i));
        }
    }

    public final synchronized b a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39351517582bc70905b74f2699e3e50", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39351517582bc70905b74f2699e3e50");
        }
        b();
        b bVar = this.e.get(Short.valueOf(s));
        if (bVar == null && s != -1) {
            bVar = this.e.get((short) -1);
        }
        if (bVar == null) {
            bVar = this.d;
        }
        return bVar;
    }

    public final synchronized void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f58b65da6fba85033daaa587bcedb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f58b65da6fba85033daaa587bcedb0");
        } else if (this.f.contains(aVar)) {
        } else {
            this.f.add(aVar);
        }
    }

    public final synchronized void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7894007d367e6e4500414d829629903e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7894007d367e6e4500414d829629903e");
        } else {
            this.f.remove(aVar);
        }
    }

    private void a(b bVar) {
        ArrayList<a> arrayList;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34118e2f66bd0808178d41589364791e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34118e2f66bd0808178d41589364791e");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.f);
        }
        for (a aVar : arrayList) {
            aVar.a(bVar);
        }
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c70a905b47fb2b52654024f7eb034479", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c70a905b47fb2b52654024f7eb034479");
        } else {
            d.a(str, new Object[0]);
        }
    }

    public static void a(@DrawableRes Integer num, @ColorInt Integer num2, View view) {
        Object[] objArr = {num, num2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3cca1850845a630c87db078ab5aa336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3cca1850845a630c87db078ab5aa336");
        } else if (view == null) {
            a("object null");
        } else if (num != null && num.intValue() != 0) {
            view.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            view.setBackgroundColor(num2.intValue());
        }
    }

    public static void a(Float f, View view) {
        Object[] objArr = {f, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b11e52c1ab53cd928422e850a15c6827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b11e52c1ab53cd928422e850a15c6827");
        } else if (view == null) {
            a("object null");
        } else if (f == null) {
        } else {
            if (view instanceof TextView) {
                ((TextView) view).setTextSize(0, f.floatValue());
                return;
            }
            a("not found class:" + view.getClass().toString());
        }
    }

    public static void a(@ColorInt Integer num, View view) {
        Object[] objArr = {num, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d66a73577159d654f14345e4cbddfba7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d66a73577159d654f14345e4cbddfba7");
        } else if (view == null) {
            a("object null");
        } else if (num == null) {
        } else {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(num.intValue());
                return;
            }
            a("not found class:" + view.getClass().toString());
        }
    }

    public static void b(@DrawableRes Integer num, View view) {
        Object[] objArr = {num, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd7ade2d2131edbb7d3e8620edf620c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd7ade2d2131edbb7d3e8620edf620c1");
        } else if (view == null) {
            a("object null");
        } else if (num == null || num.intValue() == 0) {
        } else {
            Drawable b2 = android.support.v7.content.res.b.b(view.getContext(), num.intValue());
            if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(b2);
                return;
            }
            a("not found class:" + view.getClass().toString());
        }
    }

    public static void a(@ColorInt Integer num, Activity activity) {
        Object[] objArr = {num, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e97b1e2b28e29ce6c45f6f5d6f25fbe8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e97b1e2b28e29ce6c45f6f5d6f25fbe8");
        } else if (num == null) {
        } else {
            com.sankuai.xm.imui.theme.a.a(activity, num.intValue());
        }
    }

    private static b a(Context context, @StyleRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c3ac3580055b30257d9de8b47fb8282", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c3ac3580055b30257d9de8b47fb8282");
        }
        if (context == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.xm_sdk_sys_status_bar_color, R.attr.xm_sdk_page_background, R.attr.xm_sdk_content_area_background, R.attr.xm_sdk_title_bar_background, R.attr.xm_sdk_title_bar_text_color, R.attr.xm_sdk_title_bar_left_text_size, R.attr.xm_sdk_title_bar_middle_text_size, R.attr.xm_sdk_title_bar_right_text_size, R.attr.xm_sdk_title_bar_left_back_image, R.attr.xm_sdk_divider_between_title_bar_and_content, R.attr.xm_sdk_msg_default_avatar, R.attr.xm_sdk_msg_left_bubble_background, R.attr.xm_sdk_msg_right_bubble_background, R.attr.xm_sdk_send_panel_background, R.attr.xm_sdk_msg_send_btn_text_color, R.attr.xm_sdk_msg_send_btn_background, R.attr.xm_sdk_msg_recording_window_background});
        if (obtainStyledAttributes.getIndexCount() <= 0) {
            return null;
        }
        try {
            b bVar = new b();
            for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.b = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    }
                } else if (index == 1) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.d = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        bVar.c = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
                    }
                } else if (index == 2) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.f = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        bVar.e = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
                    }
                } else if (index == 3) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.h = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        bVar.g = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
                    }
                } else if (index == 4) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.i = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    }
                } else if (index == 5) {
                    bVar.j = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 6) {
                    bVar.k = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 7) {
                    bVar.l = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 8) {
                    bVar.m = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
                } else if (index == 10) {
                    bVar.q = Integer.valueOf(obtainStyledAttributes.getResourceId(index, 0));
                } else if (index == 11) {
                    bVar.s = android.support.v7.content.res.b.b(context, obtainStyledAttributes.getResourceId(index, 0));
                } else if (index == 12) {
                    bVar.t = android.support.v7.content.res.b.b(context, obtainStyledAttributes.getResourceId(index, 0));
                } else if (index == 14) {
                    bVar.o = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 15) {
                    bVar.a(obtainStyledAttributes.getResourceId(index, 0));
                } else if (index == 16) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.p = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    }
                } else if (index == 9) {
                    bVar.r = Integer.valueOf(obtainStyledAttributes.getColor(index, context.getResources().getColor(R.color.xm_sdk_divider)));
                } else if (index == 13) {
                    if (h.a(obtainStyledAttributes, index)) {
                        bVar.u = new ColorDrawable(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        bVar.u = android.support.v7.content.res.b.b(context, obtainStyledAttributes.getResourceId(index, 0));
                    }
                }
            }
            obtainStyledAttributes.recycle();
            return bVar;
        } catch (Throwable th) {
            d.a(th);
            com.sankuai.xm.monitor.statistics.a.a("imui", "convertToThemeBeanObject", th);
            return null;
        }
    }
}
