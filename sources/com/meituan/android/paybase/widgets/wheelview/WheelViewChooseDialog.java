package com.meituan.android.paybase.widgets.wheelview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class WheelViewChooseDialog<T> extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect b;
    private a a;
    private WheelView c;
    private WheelView d;
    private int e;
    private int f;
    private int g;
    private int h;
    private List<T> i;
    private List<T> j;
    private com.meituan.android.paybase.widgets.wheelview.adapter.b k;
    private com.meituan.android.paybase.widgets.wheelview.adapter.b l;
    private b m;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(Object obj, Object obj2);
    }

    public abstract com.meituan.android.paybase.widgets.wheelview.adapter.b a();

    public abstract com.meituan.android.paybase.widgets.wheelview.adapter.b b();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        one,
        two;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b46d09e8d1c7fcf31f80192e47d9330", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b46d09e8d1c7fcf31f80192e47d9330");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adfee4bb263b8ece433adfa3d8fc1839", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adfee4bb263b8ece433adfa3d8fc1839") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d991554e1f438e1c602f30953bebaa55", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d991554e1f438e1c602f30953bebaa55") : (a[]) values().clone();
        }
    }

    public WheelViewChooseDialog(Context context, b bVar) {
        super(context, R.style.paybase__TransparentDialog);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2bb9fe232354602c52f2873cb4363d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2bb9fe232354602c52f2873cb4363d");
            return;
        }
        this.a = a.two;
        this.e = 21;
        this.f = 19;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.m = bVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa343d7e36b8986946e4ad80b8ba46c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa343d7e36b8986946e4ad80b8ba46c");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3319daf31e7440c2a366926cc3f3fc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3319daf31e7440c2a366926cc3f3fc33");
        } else {
            this.l = b();
            this.k = a();
            if (this.k == null) {
                this.a = a.one;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fe9f3fe536e33e303b86180f28623ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fe9f3fe536e33e303b86180f28623ec");
        } else {
            Window window = getWindow();
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.paybase__wheel_choose_dialog, (ViewGroup) null);
            setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
            inflate.findViewById(R.id.datePicker_cancel).setOnClickListener(this);
            inflate.findViewById(R.id.datePicker_confirm).setOnClickListener(this);
            this.g = getContext().getResources().getColor(R.color.paybase__base_green);
            this.h = getContext().getResources().getColor(R.color.paybase__text_color_3);
            this.c = (WheelView) inflate.findViewById(R.id.wheel_left);
            this.d = (WheelView) inflate.findViewById(R.id.wheel_right);
            if (this.a != a.two) {
                this.d.setVisibility(8);
                findViewById(R.id.divider).setVisibility(8);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b9be370db846adfac6a2b8585b1ca87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b9be370db846adfac6a2b8585b1ca87");
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7ec1e11b7f7ad59921adbaa4bd4f0cea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7ec1e11b7f7ad59921adbaa4bd4f0cea");
            } else {
                this.j.clear();
                this.j = this.l.c();
                this.l.p = this.a == a.two ? this.e : 17;
                this.l.g = this.g;
                this.l.f = this.h;
                this.c.setViewAdapter(this.l);
                this.c.setCurrentItem(this.l.b());
            }
            if (this.a == a.two) {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = b;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3419275bb12bcc85ed815a15720319c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3419275bb12bcc85ed815a15720319c0");
                } else if (this.k == null) {
                    this.a = a.one;
                } else {
                    this.i.clear();
                    this.i = this.k.c();
                    this.k.p = this.f;
                    this.k.g = this.g;
                    this.k.f = this.h;
                    this.d.setViewAdapter(this.k);
                    this.d.setCurrentItem(this.k.b());
                }
            }
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = b;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "14c556792cdb79c7eccc33a28d686de1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "14c556792cdb79c7eccc33a28d686de1");
            return;
        }
        if (this.a == a.two) {
            WheelView wheelView = this.d;
            Object[] objArr8 = {this};
            ChangeQuickRedirect changeQuickRedirect8 = d.a;
            wheelView.a(PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "a75ee08445a8b321444b0f5b2367b4d8", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.widgets.wheelview.listener.a) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "a75ee08445a8b321444b0f5b2367b4d8") : new d(this));
            this.d.a(new com.meituan.android.paybase.widgets.wheelview.listener.b() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.widgets.wheelview.listener.b
                public final void a(WheelView wheelView2) {
                    Object[] objArr9 = {wheelView2};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a9f612809101b82bf4e3e7470f9d807d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a9f612809101b82bf4e3e7470f9d807d");
                    } else {
                        WheelViewChooseDialog.this.a((String) WheelViewChooseDialog.this.k.a(wheelView2.getCurrentItem()), WheelViewChooseDialog.this.k);
                    }
                }
            });
        }
        WheelView wheelView2 = this.c;
        Object[] objArr9 = {this};
        ChangeQuickRedirect changeQuickRedirect9 = e.a;
        wheelView2.a(PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "b65672c61716e0964c7dfe8d46a01067", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.widgets.wheelview.listener.a) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "b65672c61716e0964c7dfe8d46a01067") : new e(this));
        this.c.a(new com.meituan.android.paybase.widgets.wheelview.listener.b() { // from class: com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.widgets.wheelview.listener.b
            public final void a(WheelView wheelView3) {
                Object[] objArr10 = {wheelView3};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "d5c510b38d8b5a5dfba2079e518e5823", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "d5c510b38d8b5a5dfba2079e518e5823");
                } else {
                    WheelViewChooseDialog.this.a((String) WheelViewChooseDialog.this.l.a(wheelView3.getCurrentItem()), WheelViewChooseDialog.this.l);
                }
            }
        });
    }

    public static /* synthetic */ void b(WheelViewChooseDialog wheelViewChooseDialog, WheelView wheelView, int i, int i2) {
        Object[] objArr = {wheelViewChooseDialog, wheelView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "948dd35aa73d32301524bb50a5a01d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "948dd35aa73d32301524bb50a5a01d73");
        } else {
            wheelViewChooseDialog.a((String) wheelViewChooseDialog.k.a(wheelView.getCurrentItem()), wheelViewChooseDialog.k);
        }
    }

    public static /* synthetic */ void a(WheelViewChooseDialog wheelViewChooseDialog, WheelView wheelView, int i, int i2) {
        Object[] objArr = {wheelViewChooseDialog, wheelView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "215dbe1a1e431bb6f6215c0ca5a61847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "215dbe1a1e431bb6f6215c0ca5a61847");
        } else {
            wheelViewChooseDialog.a((String) wheelViewChooseDialog.l.a(wheelView.getCurrentItem()), wheelViewChooseDialog.l);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386b533950f8d12bbda589706adbb014", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386b533950f8d12bbda589706adbb014");
            return;
        }
        int id = view.getId();
        if (id == R.id.datePicker_cancel) {
            dismiss();
        } else if (id == R.id.datePicker_confirm) {
            this.m.a(this.j.get(this.l.b()), (this.k == null || this.i == null) ? null : this.i.get(this.k.b()));
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.meituan.android.paybase.widgets.wheelview.adapter.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a874f3c20882c1abfb801be8891959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a874f3c20882c1abfb801be8891959");
            return;
        }
        ArrayList<View> arrayList = bVar.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TextView textView = (TextView) arrayList.get(i);
            if (str.equals(textView.getText().toString())) {
                textView.setTextSize(this.l.m);
                textView.setTextColor(this.g);
            } else {
                textView.setTextSize(this.l.n);
                textView.setTextColor(this.h);
            }
        }
    }
}
