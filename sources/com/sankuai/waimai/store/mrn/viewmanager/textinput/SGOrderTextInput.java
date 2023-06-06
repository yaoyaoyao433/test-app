package com.sankuai.waimai.store.mrn.viewmanager.textinput;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGOrderTextInput extends AppCompatEditText implements TextWatcher {
    public static ChangeQuickRedirect a;
    a b;
    boolean c;
    int d;
    Map<String, Object> e;
    private int f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void a(String str, int i);

        void a(List<String> list);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public SGOrderTextInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2992d5186522bc10e2e7c5c09244ca7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2992d5186522bc10e2e7c5c09244ca7e");
            return;
        }
        this.c = false;
        this.e = null;
        this.f = -1;
        a();
    }

    public SGOrderTextInput(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bfce3e2a36f03b59533231074b037d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bfce3e2a36f03b59533231074b037d");
            return;
        }
        this.c = false;
        this.e = null;
        this.f = -1;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78da1794c56f941f7208f02c8ea6d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78da1794c56f941f7208f02c8ea6d08");
            return;
        }
        this.e = new HashMap();
        this.d = ColorUtils.a("#858687", -7829368);
        addTextChangedListener(this);
    }

    public void setMaxCount(int i) {
        this.f = i;
    }

    public void setTagChangedListener(a aVar) {
        this.b = aVar;
    }

    public void setTagColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a39c2236ea601a402340a1049d383148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a39c2236ea601a402340a1049d383148");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.d = ColorUtils.a(str, -7829368);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb3db33f465183fe5472e8bb8ed3845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb3db33f465183fe5472e8bb8ed3845");
        } else if (TextUtils.isEmpty(str) || !this.e.containsKey(str)) {
        } else {
            int indexOf = (getText() == null ? "" : getText().toString()).indexOf(str);
            if (indexOf < 0 || !a(str.length() + indexOf)) {
                return;
            }
            this.c = true;
            a(indexOf, str.length() + indexOf);
            this.e.remove(str);
            if (this.b != null) {
                this.b.a(new ArrayList(this.e.keySet()));
            }
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f01faf32f313402c604bb0f0f055ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f01faf32f313402c604bb0f0f055ff0");
            return;
        }
        super.onSelectionChanged(i, i2);
        if (getText() == null || this.e == null) {
            return;
        }
        int selectionStart = getSelectionStart();
        for (Object obj : this.e.values()) {
            int spanStart = getText().getSpanStart(obj);
            int spanEnd = getText().getSpanEnd(obj);
            if (selectionStart > spanStart && selectionStart < spanEnd) {
                setSelection(spanEnd);
                return;
            }
        }
    }

    private int getInputCountExceptTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c760035b30e8a1456342e2ed702b8362", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c760035b30e8a1456342e2ed702b8362")).intValue();
        }
        if (getText() == null) {
            return 0;
        }
        int length = getText().length();
        if (this.e == null) {
            return length;
        }
        for (Object obj : this.e.values()) {
            length -= getText().getSpanEnd(obj) - getText().getSpanStart(obj);
        }
        return length;
    }

    private boolean a(int i) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387c574e89b9acf6c29e34c188556f04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387c574e89b9acf6c29e34c188556f04")).booleanValue();
        }
        if (getText() == null) {
            return true;
        }
        int selectionStart = getSelectionStart();
        ArrayList arrayList = new ArrayList();
        if (this.e != null) {
            for (Object obj : this.e.values()) {
                arrayList.add(Integer.valueOf(getText().getSpanStart(obj)));
            }
        }
        String obj2 = getText().toString();
        while (true) {
            if (i >= obj2.length()) {
                break;
            } else if ('\n' == obj2.charAt(i)) {
                i++;
            } else if (!arrayList.contains(Integer.valueOf(i))) {
                z = true;
            }
        }
        z = false;
        if (z) {
            this.c = true;
            if (this.b != null) {
                this.b.a(1);
            }
            setText(getText());
            setSelection(selectionStart);
            return false;
        }
        return true;
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40da01efa92903b952d94966564da29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40da01efa92903b952d94966564da29");
        } else if (getText() == null) {
        } else {
            CharSequence subSequence = getText().subSequence(0, i);
            CharSequence subSequence2 = getText().subSequence(i2, getText().length());
            if (!TextUtils.isEmpty(subSequence) && subSequence.charAt(subSequence.length() - 1) == '\n') {
                subSequence = subSequence.subSequence(0, subSequence.length() - 1);
            }
            if (TextUtils.isEmpty(subSequence) && !TextUtils.isEmpty(subSequence2) && subSequence2.charAt(0) == '\n') {
                subSequence2 = subSequence2.subSequence(1, subSequence2.length());
            }
            this.c = true;
            setText("");
            append(subSequence);
            append(subSequence2);
            setSelection(getText().length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        char c = 1;
        int i4 = 2;
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a830274d31c98fac49c5012d939b6b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a830274d31c98fac49c5012d939b6b65");
        } else if (getText() != null && !this.c) {
            byte b = i3 > 0 ? (byte) 1 : (byte) 0;
            Object[] objArr2 = {Byte.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32ae2c18eca85d427096e2e38b5fc48b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32ae2c18eca85d427096e2e38b5fc48b")).booleanValue();
            } else {
                if (this.f >= 0 && getText() != null && b != 0) {
                    int selectionStart = getSelectionStart();
                    if (getInputCountExceptTag() >= this.f) {
                        this.c = true;
                        setText(getText());
                        setSelection(selectionStart);
                        if (this.b != null) {
                            this.b.a(2);
                        }
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return;
            }
            int selectionStart2 = getSelectionStart();
            Set<String> keySet = this.e.keySet();
            for (String str : keySet) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = str;
                objArr3[c] = Integer.valueOf(selectionStart2);
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a2303d94071563e8299ef2c4253cd41", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a2303d94071563e8299ef2c4253cd41")).booleanValue();
                } else {
                    z2 = (this.e == null || getText() == null || getText().getSpanEnd(this.e.get(str)) != selectionStart2) ? false : true;
                }
                if (z2 && i3 <= 0) {
                    int length = selectionStart2 - str.length();
                    int length2 = str.length() + length;
                    if (a(length2)) {
                        a(length, length2);
                        this.e.remove(str);
                        if (this.b != null) {
                            this.b.a(new ArrayList(keySet));
                            return;
                        }
                        return;
                    }
                    return;
                }
                c = 1;
                i4 = 2;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69640659c327336944ad7168b0cd30c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69640659c327336944ad7168b0cd30c1");
            return;
        }
        this.c = false;
        if (this.b != null) {
            this.b.a(editable.toString(), getInputCountExceptTag());
        }
        layout(getLeft(), getTop(), getRight(), getBottom());
    }
}
