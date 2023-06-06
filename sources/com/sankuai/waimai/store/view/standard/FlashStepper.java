package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashStepper extends FrameLayout {
    public static ChangeQuickRedirect a;
    public boolean b;
    private Context c;
    private ViewGroup d;
    private ImageView e;
    private TextView f;
    private ViewGroup g;
    private ImageView h;
    private TextView i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private a q;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(View view);

        void b(View view);
    }

    public FlashStepper(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b035ee13187316027727ba5f1f57e147", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b035ee13187316027727ba5f1f57e147");
        }
    }

    public FlashStepper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1234349933086003c97e1aecc7357b7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1234349933086003c97e1aecc7357b7c");
        }
    }

    public FlashStepper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a532029adfbdb73e798778fb0a6269", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a532029adfbdb73e798778fb0a6269");
            return;
        }
        this.m = 0;
        this.b = false;
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09de21ad33065696f5d7981239e89ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09de21ad33065696f5d7981239e89ab1");
            return;
        }
        inflate(context, R.layout.wm_sc_ui_stepper, this);
        this.c = context;
        this.d = (ViewGroup) findViewById(R.id.flash_stepper_dec_delegate);
        this.e = (ImageView) findViewById(R.id.flash_stepper_dec);
        this.f = (TextView) findViewById(R.id.flash_stepper_number);
        this.g = (ViewGroup) findViewById(R.id.flash_stepper_add_delegate);
        this.h = (ImageView) findViewById(R.id.flash_stepper_add);
        this.i = (TextView) findViewById(R.id.flash_stepper_bubble_text);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.stepperType, R.attr.stepperEnable, R.attr.stepperMaxCount, R.attr.stepperExpandable}, i, 0);
        this.j = obtainStyledAttributes.getInt(0, 0);
        this.k = obtainStyledAttributes.getBoolean(3, true);
        this.l = obtainStyledAttributes.getBoolean(1, true);
        this.n = obtainStyledAttributes.getInt(2, 0);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38dc4ccac999edad6f86d4ceda3bcd24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "38dc4ccac999edad6f86d4ceda3bcd24");
        } else {
            this.i.setBackground(new e.a().c(this.c.getResources().getColor(R.color.wm_sg_color_FF4A26)).a(this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_7)).a());
        }
        setBubbleCount(0);
        setCount(this.m);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "545af33737778a974cd6bbdc36b801c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "545af33737778a974cd6bbdc36b801c2");
        } else if (this.m != 0 && this.k) {
            a(true);
        } else {
            a(false);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "daf232d20fd7f715519f7c0ab6b58559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "daf232d20fd7f715519f7c0ab6b58559");
        } else {
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.view.standard.FlashStepper.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a1e1dfec1043a037aa26bdc17868070a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a1e1dfec1043a037aa26bdc17868070a");
                    } else if (!FlashStepper.this.l) {
                        if (FlashStepper.this.q != null) {
                            a unused = FlashStepper.this.q;
                        }
                    } else if (FlashStepper.this.q != null) {
                        FlashStepper.this.q.a(view);
                    }
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b9bbd9110a8158378bbb15e3b0751974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b9bbd9110a8158378bbb15e3b0751974");
        } else {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.view.standard.FlashStepper.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "145dfabaeb49dd88d5fd575aba5ff6b2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "145dfabaeb49dd88d5fd575aba5ff6b2");
                    } else if (!FlashStepper.this.l) {
                        if (FlashStepper.this.q != null) {
                            a unused = FlashStepper.this.q;
                        }
                    } else if (FlashStepper.this.q != null) {
                        FlashStepper.this.q.b(view);
                    }
                }
            });
        }
        a();
        obtainStyledAttributes.recycle();
    }

    public void setStepperType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6169987fd6f7a7f1a7755a0e6b93af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6169987fd6f7a7f1a7755a0e6b93af0");
        } else if (this.j != i) {
            this.j = i;
            a();
        }
    }

    public void setEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ef2a0f55e5de9b5151e58959b5a7625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ef2a0f55e5de9b5151e58959b5a7625");
            return;
        }
        this.l = z;
        a();
    }

    public void setCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76fe4fe1f2b267ca27a83a470eb11d3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76fe4fe1f2b267ca27a83a470eb11d3c");
            return;
        }
        if (this.n != 0 && i > this.n) {
            i = this.n;
        }
        this.m = i;
        this.f.setText(String.valueOf(this.m));
        if (this.k) {
            if (this.m != 0 || this.b) {
                a(true);
                return;
            } else {
                a(false);
                return;
            }
        }
        a(false);
    }

    public int getCount() {
        return this.m;
    }

    public void setMaxCount(int i) {
        this.n = i;
    }

    public int getMaxCount() {
        return this.n;
    }

    public void setBubbleCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e736897232d63820d9c65353a13ab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e736897232d63820d9c65353a13ab4");
        } else if (i <= 0) {
            this.i.setVisibility(8);
        } else if (i <= 99) {
            this.i.setVisibility(0);
            this.i.setText(String.valueOf(i));
        } else {
            this.i.setVisibility(0);
            this.i.setText("···");
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4daca77af99bc4b93588770bde2e1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4daca77af99bc4b93588770bde2e1b");
        } else if (this.o != 0 && this.p != 0) {
            this.e.setImageResource(this.o);
            this.h.setImageResource(this.p);
        } else if (this.j == 1) {
            c();
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0057331417d9004a5d0ca533276c9e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0057331417d9004a5d0ca533276c9e0d");
        } else if (this.l) {
            this.h.setImageDrawable(e.a().a(new int[]{16842919}, getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_add_style_yellow_pressed)).a(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_add_style_yellow_normal)).b);
            this.e.setImageDrawable(e.a().a(new int[]{16842919}, getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_dec_style_yellow_pressed)).a(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_dec_style_yellow_normal)).b);
        } else {
            this.h.setImageDrawable(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_add_style_yellow_pressed));
            this.e.setImageDrawable(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_dec_style_yellow_pressed));
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9b4ef5e3df2eaa68c9a22ee58206af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9b4ef5e3df2eaa68c9a22ee58206af");
        } else if (this.l) {
            this.h.setImageDrawable(e.a().a(new int[]{16842919}, getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_add_style_yellow_pressed)).a(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_add_style_yellow_normal)).b);
            this.e.setImageDrawable(e.a().a(new int[]{16842919}, getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_dec_style_yellow_pressed)).a(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_dec_style_yellow_normal)).b);
        } else {
            this.h.setImageDrawable(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_add_style_yellow_pressed));
            this.e.setImageDrawable(getContext().getResources().getDrawable(R.drawable.wm_sg_ui_stepper_dec_style_yellow_pressed));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2703cbb87d49494b72417773bb6aa078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2703cbb87d49494b72417773bb6aa078");
        } else if (this.l) {
            super.setPressed(z);
        } else {
            super.setPressed(false);
        }
    }

    public void setCallback(a aVar) {
        this.q = aVar;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a26bda86b92f31373f449f15dc354a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a26bda86b92f31373f449f15dc354a");
        } else if (z) {
            u.a(this.d, this.f);
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = GravityCompat.END;
                this.g.setLayoutParams(layoutParams);
            }
        } else {
            u.c(this.d, this.f);
            ViewGroup.LayoutParams layoutParams2 = this.g.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = GravityCompat.START;
                this.g.setLayoutParams(layoutParams2);
            }
        }
    }
}
