package com.meituan.passport.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class PassportEditText extends AppCompatAutoCompleteTextView implements com.meituan.passport.module.a {
    public static ChangeQuickRedirect a;
    private com.meituan.passport.module.c b;
    private b c;
    private com.meituan.passport.clickaction.c<String> d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        boolean a(Editable editable);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d {
        void a(Editable editable);
    }

    public PassportEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91980b4ead87322179c64deea17a6195", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91980b4ead87322179c64deea17a6195");
        } else {
            a();
        }
    }

    public PassportEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a85b267c4fc086e79af7d5344eb48f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a85b267c4fc086e79af7d5344eb48f");
        } else {
            a();
        }
    }

    public PassportEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de7ede35ac7bcbf6b87ebc12101b3c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de7ede35ac7bcbf6b87ebc12101b3c0");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc47ae21412059c19dfe92e7f007f2ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc47ae21412059c19dfe92e7f007f2ea");
            return;
        }
        this.d = new com.meituan.passport.clickaction.b(this);
        this.b = com.meituan.passport.module.c.a();
        this.c = new a();
    }

    public void setEnableControler(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729ae8d9a154dd51efac81044e5c0a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729ae8d9a154dd51efac81044e5c0a34");
        } else if (bVar != null) {
            this.c = bVar;
            this.b.a(this.c.a(getEditableText()));
        }
    }

    public void setEnableLength(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c49475c79a0038f5b4f9524979b9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c49475c79a0038f5b4f9524979b9d4");
        } else if (this.c == null || !(this.c instanceof a)) {
        } else {
            ((a) this.c).b = i;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc82881e71d2522d9e6c2b1c9fb7dd54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc82881e71d2522d9e6c2b1c9fb7dd54");
        } else if (getVisibility() == i) {
        } else {
            super.setVisibility(i);
            if (i != 0) {
                this.b.a(true);
            } else {
                this.b.a(this.c.a(getText()));
            }
        }
    }

    @Override // com.meituan.passport.module.a
    public final void a(com.meituan.passport.module.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ff8b17804fdb7f62d8c56ee373e94c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ff8b17804fdb7f62d8c56ee373e94c");
            return;
        }
        this.b.a(bVar);
        this.b.a(this.c.a(getEditableText()));
        addTextChangedListener(new c(f.a(this)));
    }

    public static /* synthetic */ void a(PassportEditText passportEditText, Editable editable) {
        Object[] objArr = {passportEditText, editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fab2ea56bcf4ac14c7c3ecf30d999ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fab2ea56bcf4ac14c7c3ecf30d999ddf");
        } else {
            passportEditText.b.a(passportEditText.c.a(editable));
        }
    }

    public String getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d7f40a7df492618ba4c6f426831aa6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d7f40a7df492618ba4c6f426831aa6") : getText().toString();
    }

    public com.meituan.passport.clickaction.c<String> getParamAction() {
        return this.d;
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf44ab470497dd340b4a1cc43f05a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf44ab470497dd340b4a1cc43f05a78");
        } else {
            addTextChangedListener(new c(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements b {
        public static ChangeQuickRedirect a;
        int b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32609af696d30a63e98ba5bb6688d969", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32609af696d30a63e98ba5bb6688d969");
            } else {
                this.b = 0;
            }
        }

        @Override // com.meituan.passport.view.PassportEditText.b
        public final boolean a(Editable editable) {
            Object[] objArr = {editable};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3658ded68e70cfe58d2205ea2e3f7efc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3658ded68e70cfe58d2205ea2e3f7efc")).booleanValue() : !TextUtils.isEmpty(editable) && editable.length() >= this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c implements TextWatcher {
        public static ChangeQuickRedirect a;
        private d b;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948937ae91107d2f772122c76a4bca7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948937ae91107d2f772122c76a4bca7f");
                return;
            }
            String str = "start: " + i + " count: " + i2 + " after: " + i3;
            StringBuilder sb = new StringBuilder("charSequence: ");
            sb.append(TextUtils.isEmpty(charSequence) ? StringUtil.NULL : "not null");
            n.a("VerificationFrameView.beforeTextChanged", str, sb.toString());
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb2a0fb4a45547fe5855d46738d68e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb2a0fb4a45547fe5855d46738d68e6");
                return;
            }
            String str = "start: " + i + " before: " + i2 + " count: " + i3;
            StringBuilder sb = new StringBuilder("charSequence:");
            sb.append(TextUtils.isEmpty(charSequence) ? StringUtil.NULL : "not null");
            n.a("VerificationFrameView.onTextChanged", str, sb.toString());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object[] objArr = {editable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e558eebdcac35d9b9dd86df0c18848a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e558eebdcac35d9b9dd86df0c18848a6");
            } else if (this.b != null) {
                this.b.a(editable);
            }
        }

        public c(d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f9f0171f0217c87ab92daf3b50e5ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f9f0171f0217c87ab92daf3b50e5ea");
            } else {
                this.b = dVar;
            }
        }
    }
}
