package com.meituan.android.paybase.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BasePayDialog extends Dialog {
    public static ChangeQuickRedirect f;
    private Context a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(Dialog dialog);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface d {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface e {
        int a();

        d b();
    }

    public int a() {
        return R.layout.paybase__alert_with_button;
    }

    public void a(TextView textView) {
    }

    public int b() {
        return 15;
    }

    public void b(TextView textView) {
    }

    public static /* synthetic */ int[] b(BasePayDialog basePayDialog, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, basePayDialog, changeQuickRedirect, false, "66c35901478215ecea847a7be0bc6d9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, basePayDialog, changeQuickRedirect, false, "66c35901478215ecea847a7be0bc6d9a");
        }
        int[] iArr = {0, 0};
        if (view == null) {
            return iArr;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        iArr[0] = measuredWidth;
        iArr[1] = measuredHeight;
        return iArr;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        SAME,
        DIFF;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d3b261ff828a146972079c58ed33dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d3b261ff828a146972079c58ed33dd");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "322ca1e242af65bce223dcfb5092180f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "322ca1e242af65bce223dcfb5092180f") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14c6431f401378721b4b9fe2f5afa54e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14c6431f401378721b4b9fe2f5afa54e") : (a[]) values().clone();
        }
    }

    public BasePayDialog(Context context) {
        super(context, R.style.paybase__transparent_dialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd34fb43a0b5ad321dd941807d436331", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd34fb43a0b5ad321dd941807d436331");
        } else {
            this.a = context;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33924d5a5e2a7897ecca2fc25247488a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33924d5a5e2a7897ecca2fc25247488a");
        } else if (this.a != null) {
            if ((this.a instanceof Activity) && ((Activity) this.a).isFinishing()) {
                return;
            }
            if ((this.a instanceof BaseActivity) && ((BaseActivity) this.a).m()) {
                return;
            }
            super.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.app.Activity r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, com.meituan.android.paybase.dialog.BasePayDialog.c r39, com.meituan.android.paybase.dialog.BasePayDialog.c r40, com.meituan.android.paybase.dialog.BasePayDialog.c r41, int r42, int r43, boolean r44, boolean r45, com.meituan.android.paybase.dialog.BasePayDialog.a r46, java.util.Map<java.lang.String, com.meituan.android.paybase.dialog.BasePayDialog.e> r47) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.paybase.dialog.BasePayDialog.a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.meituan.android.paybase.dialog.BasePayDialog$c, com.meituan.android.paybase.dialog.BasePayDialog$c, com.meituan.android.paybase.dialog.BasePayDialog$c, int, int, boolean, boolean, com.meituan.android.paybase.dialog.BasePayDialog$a, java.util.Map):void");
    }

    public static /* synthetic */ void c(BasePayDialog basePayDialog, c cVar, View view) {
        Object[] objArr = {basePayDialog, cVar, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f784a27cd4b768849f84dd4087b0203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f784a27cd4b768849f84dd4087b0203");
            return;
        }
        if (cVar != null) {
            cVar.a(basePayDialog);
        }
        if (basePayDialog.isShowing()) {
            basePayDialog.dismiss();
        }
    }

    public static /* synthetic */ void b(BasePayDialog basePayDialog, c cVar, View view) {
        Object[] objArr = {basePayDialog, cVar, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a624c914bae6b9a4c9faf27f6461f667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a624c914bae6b9a4c9faf27f6461f667");
            return;
        }
        if (cVar != null) {
            cVar.a(basePayDialog);
        }
        if (basePayDialog.isShowing()) {
            basePayDialog.dismiss();
        }
    }

    public static /* synthetic */ void a(BasePayDialog basePayDialog, View view) {
        Object[] objArr = {basePayDialog, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab0fb80f305fc78bcc303504cb25353b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab0fb80f305fc78bcc303504cb25353b");
        } else {
            basePayDialog.dismiss();
        }
    }

    public void a(View view, boolean z, c cVar) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ee88c368455a569c02aa622373bbcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ee88c368455a569c02aa622373bbcb");
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.alert_close_icon);
        if (z) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(com.meituan.android.paybase.dialog.d.a(this, cVar));
            return;
        }
        imageView.setVisibility(8);
    }

    public static /* synthetic */ void a(BasePayDialog basePayDialog, c cVar, View view) {
        Object[] objArr = {basePayDialog, cVar, view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7170112e0aca2628792bf3846c623b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7170112e0aca2628792bf3846c623b5");
            return;
        }
        if (cVar != null) {
            cVar.a(basePayDialog);
        }
        if (basePayDialog.isShowing()) {
            basePayDialog.dismiss();
        }
    }

    private SpannableStringBuilder a(String str, Map<String, e> map) {
        int indexOf;
        Object foregroundColorSpan;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "599febf00f030ba4723ae0cb07afce79", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "599febf00f030ba4723ae0cb07afce79");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!i.a(map)) {
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            for (Map.Entry<String, e> entry : map.entrySet()) {
                final String key = entry.getKey();
                final e value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    int i = 0;
                    while (i < spannableStringBuilder2.length() && (indexOf = spannableStringBuilder2.indexOf(key, i)) != -1) {
                        int length = key.length() + indexOf;
                        if (value.b() != null) {
                            foregroundColorSpan = new ClickableSpan() { // from class: com.meituan.android.paybase.dialog.BasePayDialog.2
                                public static ChangeQuickRedirect a;

                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    Object[] objArr2 = {view};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "400efba7a9c39cf6bd722c789a9d2574", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "400efba7a9c39cf6bd722c789a9d2574");
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    Object[] objArr2 = {textPaint};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee818578e236097167f6c02c67159821", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee818578e236097167f6c02c67159821");
                                        return;
                                    }
                                    textPaint.setColor(value.a());
                                    textPaint.setUnderlineText(false);
                                }
                            };
                        } else {
                            foregroundColorSpan = new ForegroundColorSpan(value.a());
                        }
                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf, length, 17);
                        i = length;
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect d;
        protected Activity e;
        protected String f;
        protected String g;
        protected String h;
        protected String i;
        protected String j;
        protected int k;
        protected int l;
        protected c m;
        protected c n;
        protected c o;
        protected boolean p;
        protected boolean q;
        protected boolean r;
        protected a s;
        protected Map<String, e> t;

        public b(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6389cdab03b6e461f99745e9db8f881", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6389cdab03b6e461f99745e9db8f881");
                return;
            }
            this.k = -1;
            this.l = -1;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = a.DIFF;
            this.t = new HashMap();
            this.e = activity;
        }

        public final b b(String str) {
            this.f = str;
            return this;
        }

        public final b c(String str) {
            this.g = str;
            return this;
        }

        public final b d(String str) {
            this.h = str;
            return this;
        }

        public final b a(String str, c cVar) {
            this.i = str;
            this.m = cVar;
            return this;
        }

        public final b b(String str, c cVar) {
            this.j = str;
            this.n = cVar;
            return this;
        }

        public final b a(boolean z, c cVar) {
            this.r = true;
            this.o = cVar;
            return this;
        }

        public final b a(int i) {
            this.k = i;
            return this;
        }

        public final b b(int i) {
            this.l = i;
            return this;
        }

        public final b a(boolean z) {
            this.p = false;
            return this;
        }

        public final b b(boolean z) {
            this.q = z;
            return this;
        }

        public final b a(a aVar) {
            this.s = aVar;
            return this;
        }

        public BasePayDialog a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efacfcb44e11a9c6aad3740ccd089ecf", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efacfcb44e11a9c6aad3740ccd089ecf") : new BasePayDialog(activity);
        }

        public final Dialog a() {
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c31d1cf92f6c06bd46c6e7e5c8f1261", RobustBitConfig.DEFAULT_VALUE)) {
                return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c31d1cf92f6c06bd46c6e7e5c8f1261");
            }
            BasePayDialog a = a(this.e);
            if (!TextUtils.isEmpty(this.h)) {
                if (TextUtils.isEmpty(this.g)) {
                    str = this.h;
                } else {
                    str = this.g + this.h;
                }
                this.g = str;
                String str2 = this.h;
                Object[] objArr2 = {str2, -6710887, null};
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b7cfd141c2da19214c4f31c7a10698a", RobustBitConfig.DEFAULT_VALUE)) {
                    b bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b7cfd141c2da19214c4f31c7a10698a");
                } else if (!TextUtils.isEmpty(str2)) {
                    this.t.put(str2, new e() { // from class: com.meituan.android.paybase.dialog.BasePayDialog.b.1
                        @Override // com.meituan.android.paybase.dialog.BasePayDialog.e
                        public final int a() {
                            return r2;
                        }

                        @Override // com.meituan.android.paybase.dialog.BasePayDialog.e
                        public final d b() {
                            return r3;
                        }
                    });
                }
            }
            a.a(this.e, this.f, this.g, this.h, this.i, this.j, this.r, this.m, this.n, this.o, this.k, this.l, this.p, this.q, this.s, this.t);
            return a;
        }
    }
}
