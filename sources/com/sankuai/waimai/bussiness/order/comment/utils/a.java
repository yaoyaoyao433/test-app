package com.sankuai.waimai.bussiness.order.comment.utils;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.comment.rn.CursorEditText;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public CursorEditText b;
    public char c;
    boolean d;
    private SparseArray e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676c7cb140eef3de1fa59a0f770c3a9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676c7cb140eef3de1fa59a0f770c3a9b");
            return;
        }
        this.c = '#';
        this.e = new SparseArray();
        this.d = false;
    }

    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd9a74b49588d5ee123f4ceb22088df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd9a74b49588d5ee123f4ceb22088df");
        } else if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                this.e.put(i, this.c + list.get(i) + this.c);
            }
        }
    }

    public final void a(CursorEditText cursorEditText) {
        Object[] objArr = {cursorEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd77d1a6331ea6742cfa8671ddcbdc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd77d1a6331ea6742cfa8671ddcbdc6");
            return;
        }
        this.b = cursorEditText;
        g();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d31bee8808f1526cd9082a5f603b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d31bee8808f1526cd9082a5f603b6d");
            return;
        }
        try {
            if (this.b == null && str == null) {
                return;
            }
            int selectionStart = this.b.getSelectionStart();
            Editable editableText = this.b.getEditableText();
            String str2 = this.c + str + this.c;
            if (selectionStart > 0 && editableText.charAt(selectionStart - 1) == this.c) {
                str2 = StringUtil.SPACE + str2;
            }
            if (editableText.length() > 0 && selectionStart < editableText.length() && editableText.charAt(selectionStart) == this.c) {
                str2 = str2 + Constants.SPACE;
            }
            if (selectionStart >= 0 && selectionStart < editableText.length()) {
                editableText.insert(selectionStart, str2);
                return;
            }
            editableText.append((CharSequence) str2);
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-insertWordToEidtText", th.getMessage(), th);
        }
    }

    boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fcddd13dccc95cee194c02509760cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fcddd13dccc95cee194c02509760cc9")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        try {
            if (d()) {
                String obj = this.b.getText().toString();
                int selectionStart = this.b.getSelectionStart();
                int h = h();
                if (h >= 0 && h < selectionStart) {
                    obj.substring(h, selectionStart);
                    this.b.getEditableText().delete(h, selectionStart);
                    return true;
                }
            }
            if (e()) {
                String obj2 = this.b.getText().toString();
                int i = i();
                if (i < 0) {
                    return false;
                }
                int f = f() + 1;
                if (f > obj2.length()) {
                    f = obj2.length();
                }
                obj2.substring(i, f);
                this.b.getEditableText().delete(i, f);
                return true;
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-deleteWordToEditText", e.getMessage(), e);
        }
        return false;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92af531666ae51ee5839a58dd18a6540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92af531666ae51ee5839a58dd18a6540");
            return;
        }
        try {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) this.b.getText().getSpans(0, this.b.getText().length() + 1, ForegroundColorSpan.class);
            if (foregroundColorSpanArr == null || foregroundColorSpanArr.length <= 0) {
                return;
            }
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                this.b.getText().removeSpan(foregroundColorSpan);
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-beforeTextChanged", th.getMessage(), th);
        }
    }

    public void c() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f69977216497d7510ca885b2991410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f69977216497d7510ca885b2991410");
            return;
        }
        try {
            String obj = this.b.getText().toString();
            int i2 = 0;
            for (int i3 = 0; i3 < obj.length(); i3++) {
                if (obj.charAt(i3) == this.c) {
                    if (i2 < 0 || i3 <= 0 || i2 >= i3 || (i = i3 + 1) > obj.length() || !b(obj.substring(i2, i))) {
                        i2 = i3;
                    } else {
                        this.b.getText().setSpan(new ForegroundColorSpan(-24064), i2, i, 33);
                        i2 = i;
                    }
                }
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-setTextSpan", th.getMessage(), th);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f827ca367763043d8d5409693f39d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f827ca367763043d8d5409693f39d5");
        } else if (this.b == null) {
        } else {
            this.b.setOnKeyListener(new View.OnKeyListener() { // from class: com.sankuai.waimai.bussiness.order.comment.utils.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    Integer valueOf = Integer.valueOf(i);
                    boolean z = true;
                    Object[] objArr2 = {view, valueOf, keyEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "845e93c77a7179fecbe92fd0f8fae59a", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "845e93c77a7179fecbe92fd0f8fae59a")).booleanValue();
                    }
                    if (keyEvent.getKeyCode() == 67) {
                        if (keyEvent.getAction() != 0) {
                            if (keyEvent.getAction() == 1 && a.this.d) {
                                return a.this.a();
                            }
                        } else {
                            a.this.d = false;
                            boolean d = a.this.d();
                            boolean e = a.this.e();
                            a aVar = a.this;
                            if (!d && !e) {
                                z = false;
                            }
                            aVar.d = z;
                            return a.this.d;
                        }
                    }
                    return false;
                }
            });
        }
    }

    boolean d() {
        String obj;
        int selectionStart;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423c9b6f107502d738a16ce4e765be6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423c9b6f107502d738a16ce4e765be6a")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        try {
            obj = this.b.getText().toString();
            selectionStart = this.b.getSelectionStart();
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-isInWordEnd", th.getMessage(), th);
        }
        if (selectionStart > 0 && obj.charAt(selectionStart - 1) == this.c) {
            int i = selectionStart - 2;
            while (true) {
                if (i < 0) {
                    i = -1;
                    break;
                } else if (obj.charAt(i) == this.c) {
                    break;
                } else {
                    i--;
                }
            }
            if (i >= 0 && i < selectionStart) {
                if (b(obj.substring(i, selectionStart))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private int h() {
        String obj;
        int selectionStart;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af91d808bfedd3e076145c29f92392e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af91d808bfedd3e076145c29f92392e0")).intValue();
        }
        if (this.b == null) {
            return -1;
        }
        try {
            obj = this.b.getText().toString();
            selectionStart = this.b.getSelectionStart();
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-isInWordEnd", th.getMessage(), th);
        }
        if (selectionStart > 0 && obj.charAt(selectionStart - 1) == this.c) {
            int i = selectionStart - 2;
            while (true) {
                if (i < 0) {
                    i = -1;
                    break;
                } else if (obj.charAt(i) == this.c) {
                    break;
                } else {
                    i--;
                }
            }
            if (i >= 0 && i < selectionStart) {
                if (b(obj.substring(i, selectionStart))) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab1efc4d1653221c7ee3dbdbe52b46ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab1efc4d1653221c7ee3dbdbe52b46ad")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        try {
            String obj = this.b.getText().toString();
            int i = i();
            int f = f();
            if (i >= 0 && i < f) {
                int i2 = f + 1;
                if (i2 > obj.length()) {
                    i2 = obj.length();
                }
                if (b(obj.substring(i, i2))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-isSelectionInWord", th.getMessage(), th);
        }
        return false;
    }

    private int i() {
        int selectionStart;
        String obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a65878ef0243096d75609221ab84866", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a65878ef0243096d75609221ab84866")).intValue();
        }
        if (this.b == null) {
            return -1;
        }
        try {
            selectionStart = this.b.getSelectionStart();
            obj = this.b.getText().toString();
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-getStartWordIndex", th.getMessage(), th);
        }
        if (selectionStart >= 0 && obj != null && !obj.isEmpty()) {
            for (int i = selectionStart - 1; i >= 0; i--) {
                if (selectionStart >= obj.length()) {
                    break;
                } else if (obj.charAt(i) == this.c) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0287e04921a3f0961796874c89027da3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0287e04921a3f0961796874c89027da3")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        try {
            int selectionStart = this.b.getSelectionStart();
            String obj = this.b.getText().toString();
            if (selectionStart >= 0 && obj != null && !obj.isEmpty()) {
                while (selectionStart < obj.length()) {
                    if (obj.charAt(selectionStart) == this.c) {
                        return selectionStart;
                    }
                    selectionStart++;
                }
                return obj.length();
            }
            return 0;
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-getEndWordIndex", th.getMessage(), th);
            return 0;
        }
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764e3860917289dbec49cf9367d3e9d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764e3860917289dbec49cf9367d3e9d0")).booleanValue();
        }
        for (int i = 0; i < this.e.size(); i++) {
            try {
                if (((String) this.e.get(i)).equals(str)) {
                    return true;
                }
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a("InputBoardHelper-isKeyWord", th.getMessage(), th);
            }
        }
        return false;
    }
}
