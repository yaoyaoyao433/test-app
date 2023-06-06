package com.meituan.android.yoda.model.behavior.tool;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.android.yoda.util.q;
import com.meituan.android.yoda.util.u;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static final String b = "d";

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "842acbb7eb7cf3f7c34e3eae6ac33a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "842acbb7eb7cf3f7c34e3eae6ac33a41");
        } else {
            b(view);
        }
    }

    private static void b(View view) {
        int i = 0;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dfefabd4bda748b7443214c65c6a384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dfefabd4bda748b7443214c65c6a384");
        } else if (view == null) {
        } else {
            if (view instanceof EditText) {
                EditText editText = (EditText) view;
                if (a(editText)) {
                    return;
                }
                editText.addTextChangedListener(new a(editText));
            }
            if (!(view instanceof ViewGroup)) {
                return;
            }
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                b(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    private static boolean a(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3afb40b3f62f4be84c241c085bf6e9f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3afb40b3f62f4be84c241c085bf6e9f6")).booleanValue();
        }
        try {
            List<TextWatcher> list = (List) u.a(editText, TextView.class, "mListeners");
            if (list != null) {
                for (TextWatcher textWatcher : list) {
                    if (textWatcher instanceof com.meituan.android.yoda.interfaces.a) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements TextWatcher, com.meituan.android.yoda.interfaces.a {
        public static ChangeQuickRedirect a;
        private int b;

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public a(EditText editText) {
            Object[] objArr = {editText};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6ca146e48c3accca8f2c901f5e3c65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6ca146e48c3accca8f2c901f5e3c65");
            } else {
                this.b = y.a(editText);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b37e7b25e82973942faa6466b20513a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b37e7b25e82973942faa6466b20513a");
            } else if (i3 <= 0) {
            } else {
                String str = d.b;
                q.a(str, "s:" + ((Object) charSequence) + ",start:" + i + ",before:" + i2 + ",count:" + i3);
                CharSequence subSequence = charSequence.subSequence(i, i + i3);
                com.meituan.android.yoda.model.behavior.collection.b a2 = com.meituan.android.yoda.model.behavior.collection.b.a();
                int i4 = this.b;
                Object[] objArr2 = {subSequence, Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.model.behavior.collection.b.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "70a160a4fd02c8d10d710780d33e6c23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "70a160a4fd02c8d10d710780d33e6c23");
                } else if (a2.c) {
                    a2.f.a((com.meituan.android.yoda.model.behavior.collection.c<com.meituan.android.yoda.model.behavior.entry.c>) com.meituan.android.yoda.model.behavior.entry.c.a(subSequence, i4, a2.b()));
                }
                com.meituan.android.yoda.model.behavior.b.a(String.valueOf(this.b), subSequence.toString());
            }
        }
    }
}
