package com.sankuai.waimai.bussiness.order.base.widget.picker;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.widget.picker.base.RecyclerWheelPicker;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"ValidFragment"})
/* loaded from: classes4.dex */
public class SingleWheelPicker extends DialogFragment implements View.OnClickListener, RecyclerWheelPicker.a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.platform.ui.a b;
    protected RecyclerWheelPicker c;
    public b d;
    public int e;
    private boolean f;
    private boolean g;
    private List<com.sankuai.waimai.platform.ui.a> h;
    private com.sankuai.waimai.platform.ui.a i;
    private int j;
    private TextView k;
    private TextView l;
    private int m;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(com.sankuai.waimai.platform.ui.a aVar, int i);
    }

    public static /* synthetic */ boolean a(SingleWheelPicker singleWheelPicker, boolean z) {
        singleWheelPicker.g = true;
        return true;
    }

    public static /* synthetic */ boolean b(SingleWheelPicker singleWheelPicker, boolean z) {
        singleWheelPicker.f = true;
        return true;
    }

    private SingleWheelPicker(List<com.sankuai.waimai.platform.ui.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821fdd2ea938d830a4cbeb438218f71f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821fdd2ea938d830a4cbeb438218f71f");
            return;
        }
        this.e = -1;
        this.h = list;
    }

    @MainThread
    @Nullable
    public static SingleWheelPicker a(ArrayList<com.sankuai.waimai.platform.ui.a> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16a0c4902e9c63773b5a061bc98faa51", RobustBitConfig.DEFAULT_VALUE)) {
            return (SingleWheelPicker) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16a0c4902e9c63773b5a061bc98faa51");
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return new SingleWheelPicker(arrayList);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62b75d90ad672fd3cdd331c46b0c4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62b75d90ad672fd3cdd331c46b0c4d0");
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.OrderBottomDialog);
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            getActivity().getWindowManager().getDefaultDisplay().getRealSize(point);
        } else {
            getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        }
        this.m = point.x;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e05da1791c42a3abbcce768260cb173c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e05da1791c42a3abbcce768260cb173c");
            return;
        }
        super.onStart();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        getDialog().getWindow().setLayout(this.m, -2);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e252cfdd1fe358daddb54d781f11b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e252cfdd1fe358daddb54d781f11b7");
        }
        getDialog().requestWindowFeature(1);
        Window window = getDialog().getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setGravity(80);
        return layoutInflater.inflate(R.layout.dialog_wheel_picker_single, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee17eedc91e8361f8dae905a86c6593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee17eedc91e8361f8dae905a86c6593");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c43fecc4d4e285bb169c2a73fb34ec39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c43fecc4d4e285bb169c2a73fb34ec39");
        } else {
            this.l = (TextView) getView().findViewById(R.id.tv_ok);
            this.k = (TextView) getView().findViewById(R.id.tv_cancel);
            this.l.setOnClickListener(this);
            this.k.setOnClickListener(this);
            this.c = (RecyclerWheelPicker) getView().findViewById(R.id.rv_picker1);
            this.c.setOnWheelScrollListener(this);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5ef9365bdd1a001a35bded75d5e7758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5ef9365bdd1a001a35bded75d5e7758");
            return;
        }
        this.c.setData(this.h);
        if (this.e >= 0 && this.e < this.h.size()) {
            this.b = this.h.get(this.e);
            this.c.a(this.e);
        } else {
            this.e = this.b != null ? this.h.indexOf(this.b) : 0;
            this.c.a(this.e);
        }
        this.i = this.b;
        this.j = this.e;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.widget.picker.base.RecyclerWheelPicker.a
    public final void a(RecyclerWheelPicker recyclerWheelPicker, boolean z, int i, com.sankuai.waimai.platform.ui.a aVar) {
        Object[] objArr = {recyclerWheelPicker, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d0258e776e659fc1f0b4c1ef8c2c7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d0258e776e659fc1f0b4c1ef8c2c7e");
        } else if (z || aVar == null) {
        } else {
            this.i = aVar;
            this.j = i;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2da6d93609be11bb18db488b37fba7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2da6d93609be11bb18db488b37fba7");
        } else if (view.getId() != R.id.tv_ok) {
            dismiss();
        } else if (this.c.c) {
        } else {
            dismiss();
            if (this.d != null) {
                this.d.a(this.i, this.j);
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf0f759b7992f74dda5c218a034f8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf0f759b7992f74dda5c218a034f8da");
        } else if (this.f) {
        } else {
            a(getView(), 400L);
            this.f = true;
        }
    }

    public final void a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8ebfede5b97fa0aa02e51adb72ddb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8ebfede5b97fa0aa02e51adb72ddb0");
        } else {
            show(fragmentManager, getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a3b58d9c99512187d2b20751fde2426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a3b58d9c99512187d2b20751fde2426");
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, view.getHeight());
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b38d83028702780cbd561cdf3b780bd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b38d83028702780cbd561cdf3b780bd4");
                } else {
                    view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new a() { // from class: com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c88e787035a616ce0ccacfc5f8228f86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c88e787035a616ce0ccacfc5f8228f86");
                } else {
                    SingleWheelPicker.super.dismiss();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z) {
                Object[] objArr2 = {animator, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa211587850833f79d8c4dd4ba74ae8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa211587850833f79d8c4dd4ba74ae8d");
                    return;
                }
                try {
                    SingleWheelPicker.super.dismiss();
                } catch (Exception unused) {
                }
            }
        });
        ofFloat.start();
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c31958e257435023f86e7e51db8394", RobustBitConfig.DEFAULT_VALUE) ? (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c31958e257435023f86e7e51db8394") : new InnerAnimDialog(getActivity(), getTheme());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class InnerAnimDialog extends Dialog {
        public static ChangeQuickRedirect a;

        public InnerAnimDialog(@NonNull Context context, @StyleRes int i) {
            super(context, i);
            Object[] objArr = {SingleWheelPicker.this, context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fd58aca6fb52ec197c2ed5af6ecdcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fd58aca6fb52ec197c2ed5af6ecdcd");
            } else {
                setCancelable(true);
            }
        }

        @Override // android.app.Dialog, android.view.Window.Callback
        public void onWindowFocusChanged(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78133febc24b3fc00e67b7667195326", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78133febc24b3fc00e67b7667195326");
                return;
            }
            super.onWindowFocusChanged(z);
            if (SingleWheelPicker.this.g || !z) {
                return;
            }
            final SingleWheelPicker singleWheelPicker = SingleWheelPicker.this;
            final View view = SingleWheelPicker.this.getView();
            Object[] objArr2 = {view, 400L};
            ChangeQuickRedirect changeQuickRedirect2 = SingleWheelPicker.a;
            if (PatchProxy.isSupport(objArr2, singleWheelPicker, changeQuickRedirect2, false, "2db032254b09ec4892e2386ff4d985b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, singleWheelPicker, changeQuickRedirect2, false, "2db032254b09ec4892e2386ff4d985b2");
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getHeight(), 0.0f);
                ofFloat.setDuration(400L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker.3
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "544df120bde7110fcb9c57a5de74d300", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "544df120bde7110fcb9c57a5de74d300");
                        } else {
                            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    }
                });
                ofFloat.start();
            }
            SingleWheelPicker.a(SingleWheelPicker.this, true);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bd059cf66377f4a9472b863acf12ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bd059cf66377f4a9472b863acf12ef");
            } else if (SingleWheelPicker.this.f) {
            } else {
                SingleWheelPicker.this.a(SingleWheelPicker.this.getView(), 300L);
                SingleWheelPicker.b(SingleWheelPicker.this, true);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static abstract class a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
        }

        public a() {
        }
    }
}
