package com.meituan.roodesign.widgets.stepper;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooStepper extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private ImageView c;
    private View d;
    private TextView e;
    private View.OnClickListener f;
    private View.OnClickListener g;

    public RooStepper(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf41190543778141cda3387e4e14548", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf41190543778141cda3387e4e14548");
        }
    }

    public RooStepper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooStepperStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "714c046c28fea5009b2686906c52f341", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "714c046c28fea5009b2686906c52f341");
        }
    }

    public RooStepper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbea103d07b3a7ddbb71d86e74a3314", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbea103d07b3a7ddbb71d86e74a3314");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.collapsible}, i, 2131559122);
        this.b = obtainStyledAttributes.getInt(0, 2);
        obtainStyledAttributes.recycle();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a8e3f7077a0765dc968f1d1d7b74fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a8e3f7077a0765dc968f1d1d7b74fff");
            return;
        }
        LayoutInflater.from(new ContextThemeWrapper(getContext(), 2131558963)).inflate(R.layout.roo_stepper_layout, (ViewGroup) this, true);
        this.c = (ImageView) findViewById(R.id.img_foodCount_dec);
        this.e = (TextView) findViewById(R.id.txt_foodCount_number);
        this.d = findViewById(R.id.img_foodCount_add);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.stepper.RooStepper.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f7f62002dcb914f87639cf54987d584", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f7f62002dcb914f87639cf54987d584");
                } else if (RooStepper.this.g != null) {
                    RooStepper.this.g.onClick(view);
                }
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.stepper.RooStepper.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cb8851ab65ba7de9d7f8e93ceeff699", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cb8851ab65ba7de9d7f8e93ceeff699");
                } else if (RooStepper.this.f != null) {
                    RooStepper.this.f.onClick(view);
                }
            }
        });
        a(0);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6104981b5515184b87335a94d65b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6104981b5515184b87335a94d65b59");
            return;
        }
        setDecEnable(i > 0);
        if (i >= 0) {
            this.e.setText(String.valueOf(i));
        }
        b(i);
    }

    public int[] getAnimPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8359ee40d4c2f8b8d23a090a750e3cb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8359ee40d4c2f8b8d23a090a750e3cb2");
        }
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        return iArr;
    }

    public void setIncEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad695bd0a251e9f5c00d063077486f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad695bd0a251e9f5c00d063077486f5");
        } else {
            this.d.setEnabled(z);
        }
    }

    private void setDecEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b9a1db1389c65adb4b38e28219029a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b9a1db1389c65adb4b38e28219029a9");
        } else {
            this.c.setEnabled(z);
        }
    }

    public void setDecResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5b62aff746d24984a5bef9719622a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5b62aff746d24984a5bef9719622a8");
        } else {
            this.c.setImageResource(i);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b08627bf75e496d7981bf6ebab96c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b08627bf75e496d7981bf6ebab96c28");
            return;
        }
        this.c.setVisibility(0);
        this.e.setVisibility(0);
        this.d.setVisibility(0);
        setVisibility(0);
        if (i > 0) {
            return;
        }
        if (this.b == 2) {
            this.c.setVisibility(8);
            this.e.setVisibility(8);
        } else if (this.b == 3) {
            setVisibility(8);
        }
    }

    public void setBackColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae57be8ab586fd47e6be3c8ae7c90e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae57be8ab586fd47e6be3c8ae7c90e65");
        } else {
            this.e.setBackgroundColor(i);
        }
    }

    public void setIncListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public void setDecListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }
}
