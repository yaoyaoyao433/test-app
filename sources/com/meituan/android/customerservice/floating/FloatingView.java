package com.meituan.android.customerservice.floating;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.customerservice.floating.b;
import com.meituan.android.customerservice.floating.base.BaseFloatingView;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.android.customerservice.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FloatingView extends BaseFloatingView implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private TextView g;
    private LinearLayout h;
    private GradientDrawable i;
    private b j;
    private a k;
    private RelativeLayout l;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ void a(FloatingView floatingView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, floatingView, changeQuickRedirect, false, "938c300b1070ecd1ba7781a4097ecb5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, floatingView, changeQuickRedirect, false, "938c300b1070ecd1ba7781a4097ecb5f");
        } else if (i > 0) {
            if (floatingView.h.getVisibility() != 0) {
                b bVar = floatingView.j;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (!(PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a59e8108c0206323ba611c7eac0b5ed1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a59e8108c0206323ba611c7eac0b5ed1")).booleanValue() : com.meituan.android.customerservice.floating.base.a.a(bVar.b, bVar))) {
                    floatingView.h.setVisibility(0);
                }
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) floatingView.h.getLayoutParams();
            if (i < 10) {
                floatingView.i.setSize(c.a(floatingView.getContext(), 18.0f), c.a(floatingView.getContext(), 18.0f));
                floatingView.g.setText(String.valueOf(i));
                layoutParams.rightMargin = c.a(floatingView.getContext(), 8.0f);
            } else if (i < 99) {
                floatingView.i.setSize(c.a(floatingView.getContext(), 21.0f), c.a(floatingView.getContext(), 18.0f));
                floatingView.g.setText(String.valueOf(i));
                layoutParams.rightMargin = c.a(floatingView.getContext(), 3.0f);
            } else {
                floatingView.i.setSize(c.a(floatingView.getContext(), 28.0f), c.a(floatingView.getContext(), 18.0f));
                floatingView.g.setText(String.valueOf("99+"));
                layoutParams.rightMargin = c.a(floatingView.getContext(), 3.0f);
            }
            floatingView.g.setBackground(floatingView.i);
            floatingView.h.setLayoutParams(layoutParams);
        } else {
            floatingView.g.setText("0");
            floatingView.h.setVisibility(8);
        }
    }

    public FloatingView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc58b3526b07ff2e729fef7220b19ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc58b3526b07ff2e729fef7220b19ad");
        }
    }

    private FloatingView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9913c19833889a47e2af9c93bc49b61d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9913c19833889a47e2af9c93bc49b61d");
        }
    }

    public FloatingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4faad7c4d4c03bdb87127209a5a2a3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4faad7c4d4c03bdb87127209a5a2a3e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab09384a7286a557e5c09c193edb1141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab09384a7286a557e5c09c193edb1141");
            return;
        }
        inflate(getContext(), R.layout.cs_view_floating, this);
        this.l = (RelativeLayout) findViewById(R.id.view_root);
        this.l.setOnClickListener(this);
        this.l.setOnTouchListener(this);
        this.g = (TextView) findViewById(R.id.tv_budget);
        this.h = (LinearLayout) findViewById(R.id.ll_budget);
        ImageView imageView = (ImageView) findViewById(R.id.cs_id_floating_icon);
        if (com.meituan.android.customerservice.utils.b.f() != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            imageView.setLayoutParams(layoutParams);
            imageView.setBackground(com.meituan.android.customerservice.utils.b.f());
        }
        this.i = (GradientDrawable) this.g.getBackground();
        a(85, 0, c.a(getContext(), 49.0f));
        setToEdge(true);
        this.j = new b(getContext());
    }

    public void setRedDotNumber(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea803d2cd1a0e5405403b9ea9eee8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea803d2cd1a0e5405403b9ea9eee8e5");
        } else {
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.FloatingView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1bb182623701390d248b85e328a0a04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1bb182623701390d248b85e328a0a04");
                    } else {
                        FloatingView.a(FloatingView.this, i >= 0 ? i : 0);
                    }
                }
            });
        }
    }

    public final void a(final boolean z, final boolean z2, final String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b366b7d38ce954ab4a80effac25055b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b366b7d38ce954ab4a80effac25055b3");
        } else {
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.FloatingView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String string;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e771f9c91b63322dbca70552e3b810e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e771f9c91b63322dbca70552e3b810e2");
                    } else if (z) {
                        FloatingView.this.h.setVisibility(8);
                        WindowManager.LayoutParams layoutParams = FloatingView.this.e.c;
                        final b bVar = FloatingView.this.j;
                        final b.C0248b c0248b = new b.C0248b();
                        b.a aVar = new b.a();
                        aVar.a = layoutParams.gravity;
                        aVar.b = layoutParams.x;
                        aVar.c = layoutParams.y + FloatingView.this.getCustomSize();
                        c0248b.a = aVar;
                        if (z2) {
                            string = FloatingView.this.getResources().getString(TextUtils.equals(str, "im") ? R.string.cs_im_floating_destroy_tips : R.string.cs_service_floating_destroy_tips);
                        } else {
                            string = FloatingView.this.getResources().getString(TextUtils.equals(str, "im") ? R.string.cs_im_floating_show_tips : R.string.cs_service_floating_show_tips);
                        }
                        c0248b.b = string;
                        Object[] objArr3 = {c0248b};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "680482002effeb1ec89f02f3d3fafceb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "680482002effeb1ec89f02f3d3fafceb");
                        } else {
                            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.b.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5d315c05b9bf6f2c7eece69bb2ae6bae", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5d315c05b9bf6f2c7eece69bb2ae6bae");
                                    } else {
                                        b.a(bVar, c0248b);
                                    }
                                }
                            });
                        }
                    } else {
                        FloatingView.this.j.a();
                        if (z2 || TextUtils.isEmpty(FloatingView.this.g.getText()) || TextUtils.equals(FloatingView.this.g.getText(), "0")) {
                            return;
                        }
                        FloatingView.this.h.setVisibility(0);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.customerservice.floating.base.BaseFloatingView
    public int getCustomSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f071c5763666a61760d2ee22118c8e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f071c5763666a61760d2ee22118c8e5")).intValue() : c.a(getContext(), 81.0f);
    }

    @Override // com.meituan.android.customerservice.floating.base.BaseFloatingView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b7d22d0d69385a8e4352459e32b452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b7d22d0d69385a8e4352459e32b452");
        } else {
            a(false, true, "");
        }
    }

    @Override // com.meituan.android.customerservice.floating.base.BaseFloatingView
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9950bfbb3a7180505337f8b9bfb6470c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9950bfbb3a7180505337f8b9bfb6470c");
        } else {
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.FloatingView.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a7f2a32d95a70ba93587fda30691619", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a7f2a32d95a70ba93587fda30691619");
                        return;
                    }
                    FloatingView.this.j.a();
                    FloatingView.this.e.b();
                }
            });
        }
    }

    public void setOnFloatingClickListener(a aVar) {
        this.k = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e45a84f1442d3ce4b93ed19861c0ede", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e45a84f1442d3ce4b93ed19861c0ede");
        } else if (view.getId() != R.id.view_root || this.k == null) {
        } else {
            this.k.a();
        }
    }
}
