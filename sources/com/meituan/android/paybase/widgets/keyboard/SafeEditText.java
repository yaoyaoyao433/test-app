package com.meituan.android.paybase.widgets.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ai;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SafeEditText extends AppCompatEditText implements View.OnFocusChangeListener, View.OnTouchListener {
    public static ChangeQuickRedirect a;
    protected int b;
    protected a c;
    private ViewTreeObserver.OnGlobalLayoutListener d;

    public SafeEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f1a5b11f269c39eb42baff045b4230", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f1a5b11f269c39eb42baff045b4230");
            return;
        }
        this.b = -1;
        a();
    }

    public SafeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c29050e46fb2357d3bac51966c67f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c29050e46fb2357d3bac51966c67f3");
            return;
        }
        this.b = -1;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fb1594b0b00410e898e5b0c38fa25b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fb1594b0b00410e898e5b0c38fa25b6");
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.safeEditTextType});
            this.b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
        a();
    }

    private void setKeyboardBuilder(a aVar) {
        this.c = aVar;
    }

    public void setKeyboardType(int i) {
        this.b = i;
    }

    private a getKeyboardBuilder() {
        return this.c;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dced158e82bdf579998157f04957139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dced158e82bdf579998157f04957139");
            return;
        }
        setOnTouchListener(this);
        setOnFocusChangeListener(this);
        if (this.c == null) {
            this.d = f.a(this);
            getViewTreeObserver().addOnGlobalLayoutListener(this.d);
        }
    }

    public static /* synthetic */ void b(SafeEditText safeEditText) {
        Object[] objArr = {safeEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22e69b70200eb6489152f56720c2e47d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22e69b70200eb6489152f56720c2e47d");
        } else if (safeEditText.c == null) {
            View findViewById = safeEditText.getRootView().findViewById(16908290);
            if (findViewById instanceof ViewGroup) {
                ArrayList arrayList = new ArrayList();
                LinkedList linkedList = new LinkedList();
                linkedList.add((ViewGroup) findViewById);
                loop0: while (true) {
                    if (linkedList.isEmpty()) {
                        break;
                    }
                    ViewGroup viewGroup = (ViewGroup) linkedList.removeFirst();
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                            linkedList.addLast((ViewGroup) viewGroup.getChildAt(i));
                        } else if (viewGroup.getChildAt(i) instanceof SafeEditText) {
                            SafeEditText safeEditText2 = (SafeEditText) viewGroup.getChildAt(i);
                            if (safeEditText2.getKeyboardBuilder() != null) {
                                safeEditText.setKeyboardBuilder(safeEditText2.getKeyboardBuilder());
                                break loop0;
                            }
                            arrayList.add(safeEditText2);
                            if (Build.VERSION.SDK_INT >= 16) {
                                safeEditText2.getViewTreeObserver().removeOnGlobalLayoutListener(safeEditText2.d);
                            } else {
                                safeEditText2.getViewTreeObserver().removeGlobalOnLayoutListener(safeEditText2.d);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (safeEditText.c == null) {
                    try {
                        LinearLayout linearLayout = (LinearLayout) ((ViewGroup) safeEditText.getRootView().findViewById(16908290)).getChildAt(0);
                        ScrollView scrollView = (ScrollView) linearLayout.getChildAt(0);
                        safeEditText.c = new a(safeEditText.getContext(), linearLayout, scrollView);
                        Object[] objArr2 = {safeEditText};
                        ChangeQuickRedirect changeQuickRedirect2 = h.a;
                        scrollView.setOnTouchListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5f486493cdd27db207d811f55c994e38", RobustBitConfig.DEFAULT_VALUE) ? (View.OnTouchListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5f486493cdd27db207d811f55c994e38") : new h(safeEditText));
                    } catch (Exception e) {
                        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SafeEditText_init").a("message", e.getMessage()).b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SafeEditText) it.next()).setKeyboardBuilder(safeEditText.c);
                }
            }
        }
    }

    public static /* synthetic */ boolean a(SafeEditText safeEditText, View view, MotionEvent motionEvent) {
        Object[] objArr = {safeEditText, view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc08ca5225a280adbd76dec4c2d00441", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc08ca5225a280adbd76dec4c2d00441")).booleanValue();
        }
        ai.a(safeEditText);
        safeEditText.c.a();
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f14dddf49f0abdaee14b7900a0ef31c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f14dddf49f0abdaee14b7900a0ef31c")).booleanValue();
        }
        if (this.b != -1 && isFocusable()) {
            if (this.c != null && !this.c.f) {
                this.c.a((EditText) view, this.b);
                this.c.b();
            }
        } else if (isFocused()) {
            ai.b(this);
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306170aa1cdbbb4d944343071db90ced", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306170aa1cdbbb4d944343071db90ced");
        } else if (z) {
            if (this.b == -1) {
                if (this.c != null && this.c.f) {
                    this.c.a();
                }
                new Handler().post(g.a(this));
            } else if (this.c != null) {
                this.c.a((EditText) view, this.b);
                this.c.b();
            }
        }
    }

    public static /* synthetic */ void a(SafeEditText safeEditText) {
        Object[] objArr = {safeEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f10949e54da127199b02e446f6e0d343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f10949e54da127199b02e446f6e0d343");
        } else {
            ai.b(safeEditText);
        }
    }
}
