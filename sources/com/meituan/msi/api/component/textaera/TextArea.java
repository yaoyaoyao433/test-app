package com.meituan.msi.api.component.textaera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.msi.annotations.MsiComponent;
import com.meituan.msi.api.component.input.MSIBaseInputEvent;
import com.meituan.msi.api.component.input.c;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.component.IMsiComponent;
import com.meituan.msi.context.h;
import com.meituan.msi.dispather.e;
import com.meituan.msi.page.ComponentParam;
import com.meituan.msi.util.d;
import com.meituan.msi.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@MsiComponent(name = "MSITextArea", property = TextAreaParam.class)
/* loaded from: classes3.dex */
public class TextArea extends c implements IMsiComponent<TextAreaParam> {
    public static PopupWindow B = null;
    public static int D = 0;
    public static boolean F = false;
    static int I;
    public static ChangeQuickRedirect a;
    public String A;
    public boolean C;
    public boolean E;
    public boolean G;
    public boolean H;
    boolean J;
    boolean K;
    public int L;
    public boolean M;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public float T;
    private a U;
    private TextView V;
    private boolean W;
    private boolean aa;
    private boolean ab;
    private List<String> ac;
    private long ad;
    private Handler ae;
    int z;

    @Override // com.meituan.msi.api.component.input.c
    public int getInputHeight() {
        return 0;
    }

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ View a(String str, String str2, TextAreaParam textAreaParam, MsiContext msiContext) {
        TextAreaParam textAreaParam2 = textAreaParam;
        Object[] objArr = {str, str2, textAreaParam2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e644ef33de24ecfe5da297a5061846", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e644ef33de24ecfe5da297a5061846");
        }
        a(com.meituan.msi.a.f(), str, str2, textAreaParam2, msiContext.getEventDispatcher(), msiContext.getPageContext(), msiContext.getActivityContext());
        return this;
    }

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ boolean a(String str, String str2, TextAreaParam textAreaParam) {
        TextAreaParam textAreaParam2 = textAreaParam;
        Object[] objArr = {str, str2, textAreaParam2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6221ba329e5db41a5db1d997bff4dc23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6221ba329e5db41a5db1d997bff4dc23")).booleanValue();
        }
        a(textAreaParam2);
        return true;
    }

    public static /* synthetic */ void a(TextArea textArea) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, textArea, changeQuickRedirect, false, "09f02e0492b5fe59f380e9d2ae19ece5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, textArea, changeQuickRedirect, false, "09f02e0492b5fe59f380e9d2ae19ece5");
        } else if (B == null || !B.isShowing()) {
        } else {
            p.b(B);
            B = null;
        }
    }

    public static /* synthetic */ void a(TextArea textArea, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, textArea, changeQuickRedirect, false, "21878c27f81407a27bba3716e9cf9449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, textArea, changeQuickRedirect, false, "21878c27f81407a27bba3716e9cf9449");
            return;
        }
        View inflate = textArea.w.a().getLayoutInflater().inflate(R.layout.msi_soft_keyboard_top_view, (ViewGroup) null);
        textArea.V = (TextView) inflate.findViewById(R.id.keyboard_top_view_ok_txt);
        textArea.V.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.component.textaera.TextArea.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3356f8a9a69380ce50e496bb5a13fd2f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3356f8a9a69380ce50e496bb5a13fd2f");
                    return;
                }
                TextArea.this.c();
                TextArea.this.postDelayed(new Runnable() { // from class: com.meituan.msi.api.component.textaera.TextArea.4.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a07f0e274ec015583e671788d48c2f1b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a07f0e274ec015583e671788d48c2f1b");
                            return;
                        }
                        TextArea.this.c();
                        TextArea.a(TextArea.this);
                        TextArea.a(TextArea.this, TextArea.this.w.a());
                    }
                }, 1000L);
            }
        });
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -2, true);
        B = popupWindow;
        popupWindow.setTouchable(true);
        B.setOutsideTouchable(false);
        B.setFocusable(false);
        textArea.P = B.getHeight();
        View decorView = textArea.w.a() != null ? textArea.w.a().getWindow().getDecorView() : null;
        if (decorView == null) {
            com.meituan.msi.log.a.a("rootView is null");
            return;
        }
        try {
            p.a(B, decorView, 80, 0, i);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(TextArea textArea, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, textArea, changeQuickRedirect, false, "7125609f2ee934b218de5802972fa40f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, textArea, changeQuickRedirect, false, "7125609f2ee934b218de5802972fa40f");
        } else if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplication().getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } else {
                inputMethodManager.toggleSoftInput(1, 0);
            }
        }
    }

    public static /* synthetic */ boolean a(TextArea textArea, EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, textArea, changeQuickRedirect, false, "be16dc1c13203f11198f10613e61b0e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, textArea, changeQuickRedirect, false, "be16dc1c13203f11198f10613e61b0e9")).booleanValue();
        }
        if (editText == null || editText.getLayout() == null) {
            return false;
        }
        int scrollY = editText.getScrollY();
        int height = editText.getLayout().getHeight() - ((editText.getHeight() - editText.getCompoundPaddingTop()) - editText.getCompoundPaddingBottom());
        if (height == 0) {
            return false;
        }
        return scrollY > 0 || scrollY < height - 1;
    }

    public TextArea() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc51c1d1055ca80a772b596db23b4157", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc51c1d1055ca80a772b596db23b4157");
            return;
        }
        this.z = 0;
        this.A = "";
        this.W = true;
        this.C = false;
        this.E = false;
        this.G = false;
        this.H = true;
        this.aa = false;
        this.ab = false;
        this.J = false;
        this.K = true;
        this.L = 0;
        this.N = 0L;
        this.O = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.ac = new CopyOnWriteArrayList();
        this.ae = new Handler();
        this.S = false;
        this.T = 0.0f;
    }

    public final void a(Context context, String str, String str2, TextAreaParam textAreaParam, e eVar, h hVar, com.meituan.msi.context.a aVar) {
        Object[] objArr = {context, str, str2, textAreaParam, eVar, hVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a7e1a932333bbe50edae5fb8c2a363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a7e1a932333bbe50edae5fb8c2a363");
            return;
        }
        a(str, str2, eVar, hVar, aVar);
        setSingleLine(false);
        setId(Integer.valueOf(str).intValue());
        setGravity(GravityCompat.START);
        setInputType(131073);
        setTextSize(15.0f);
        a();
        setOnKeyListener(new View.OnKeyListener() { // from class: com.meituan.msi.api.component.textaera.TextArea.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {view, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b170842d2522be18d8ef16decf488cc0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b170842d2522be18d8ef16decf488cc0")).booleanValue();
                }
                if (i == 67) {
                    if (TextArea.this.getLineCount() < TextArea.this.R) {
                        TextArea.this.e();
                    }
                    TextArea.this.N = System.currentTimeMillis();
                }
                if (i == 66) {
                    TextArea.this.O = System.currentTimeMillis();
                }
                return false;
            }
        });
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.meituan.msi.api.component.textaera.TextArea.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "121ba8b2fd91d45d23df3a61f8fc1cc1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "121ba8b2fd91d45d23df3a61f8fc1cc1")).booleanValue();
                }
                if (i == 1 || i == 0 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                    TextArea.this.e();
                }
                return false;
            }
        });
        a(textAreaParam);
    }

    public void setKeyboardHeight(int i) {
        D = i;
    }

    public final void a(TextAreaParam textAreaParam) {
        int i;
        SpannableString a2;
        Object[] objArr = {textAreaParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69a4881615ef31bb6002ed788248c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69a4881615ef31bb6002ed788248c51");
            return;
        }
        if (textAreaParam.autoSize != null) {
            this.C = textAreaParam.autoSize.booleanValue();
        }
        if (textAreaParam.fixed != null) {
            this.J = textAreaParam.fixed.booleanValue();
        }
        if (textAreaParam.fontSize != null) {
            setTextSize(1, (float) textAreaParam.fontSize.doubleValue());
        }
        if (textAreaParam.confirm != null) {
            this.W = textAreaParam.confirm.booleanValue();
        }
        if (textAreaParam.marginBottom != null && textAreaParam.marginBottom.intValue() >= 0) {
            this.z = textAreaParam.marginBottom.intValue();
        }
        if (textAreaParam.adjustPosition != null) {
            this.K = textAreaParam.adjustPosition.booleanValue();
        }
        if (textAreaParam.confirmType != null) {
            setImeOptions(a(textAreaParam.confirmType));
        }
        setImeOptions(6);
        if (textAreaParam.value != null && !TextUtils.equals(getValue(), textAreaParam.value)) {
            if (SystemClock.elapsedRealtime() - this.ad > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                this.ad = SystemClock.elapsedRealtime();
                this.ac.clear();
            }
            if (this.ac.contains(textAreaParam.value)) {
                this.ac.remove(textAreaParam.value);
            } else {
                setText(textAreaParam.value);
            }
        }
        if (textAreaParam.placeholder != null) {
            setHint(textAreaParam.placeholder);
            this.A = textAreaParam.placeholder;
        }
        char c = 65535;
        if (textAreaParam.autoSize != null && textAreaParam.autoSize.booleanValue()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            }
            setLayoutParams(layoutParams);
        }
        if (textAreaParam.color != null) {
            setTextColor(d.b(textAreaParam.color));
        }
        if (textAreaParam.placeholderStyle != null) {
            if (textAreaParam.placeholderStyle.color != null) {
                setHintTextColor(d.b(textAreaParam.placeholderStyle.color));
            }
            if (textAreaParam.placeholderStyle.fontSize != null) {
                setHint(this.A);
                setTextSize(1, (float) textAreaParam.placeholderStyle.fontSize.doubleValue());
            }
            if (textAreaParam.placeholderStyle.fontWeight != null) {
                if (!"normal".equalsIgnoreCase(textAreaParam.placeholderStyle.fontWeight) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equalsIgnoreCase(textAreaParam.placeholderStyle.fontWeight)) {
                    a2 = CustomTypefaceSpan.a(Typeface.defaultFromStyle(1), textAreaParam.placeholder);
                } else {
                    a2 = CustomTypefaceSpan.a(Typeface.defaultFromStyle(0), textAreaParam.placeholder);
                }
                setHint(a2);
            }
        }
        if (textAreaParam.backgroundColor != null) {
            setBackgroundColor(d.b(textAreaParam.backgroundColor));
        }
        if (textAreaParam.fontStyle != null) {
            String str = textAreaParam.fontStyle;
            int hashCode = str.hashCode();
            if (hashCode != -1178781136) {
                if (hashCode != -1039745817) {
                    if (hashCode == 3029637 && str.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)) {
                        c = 0;
                    }
                } else if (str.equals("normal")) {
                    c = 2;
                }
            } else if (str.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC)) {
                c = 1;
            }
            switch (c) {
                case 0:
                    setTypeface(Typeface.defaultFromStyle(1));
                case 1:
                    setTypeface(Typeface.defaultFromStyle(2));
                    break;
                case 2:
                    setTypeface(Typeface.defaultFromStyle(0));
                    break;
            }
        }
        if (textAreaParam.disabled != null && textAreaParam.disabled.booleanValue()) {
            setEnabled(false);
            this.H = false;
        } else {
            this.H = true;
            setEnabled(true);
        }
        if (textAreaParam.maxLength == null || textAreaParam.maxLength.intValue() == 0) {
            i = 140;
        } else {
            i = textAreaParam.maxLength.intValue() < 0 ? Integer.MAX_VALUE : textAreaParam.maxLength.intValue();
        }
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.msi.api.component.textaera.TextArea.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16001f17563f7ebad520179728921d06", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16001f17563f7ebad520179728921d06")).booleanValue();
                }
                if (TextArea.a(TextArea.this, TextArea.this)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 1) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
            }
        });
        this.g = true;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        Object[] objArr = {rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2c9cb3f115d6a743b591e926300060", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2c9cb3f115d6a743b591e926300060")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 17 && Build.VERSION.SDK_INT <= 23) {
            rect.offset(-getScrollX(), -getScrollY());
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    @Override // com.meituan.msi.api.component.input.c, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa13a98d1e32edcd79afd7beaa271606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa13a98d1e32edcd79afd7beaa271606");
        } else if (this.g) {
            this.ac.add(editable.toString());
            b();
        }
    }

    @Override // com.meituan.msi.api.component.input.c, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635bde5ffe129f73eac1d8d0e8bd4135", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635bde5ffe129f73eac1d8d0e8bd4135")).booleanValue();
        }
        if (i == 67) {
            this.f = '\b';
        }
        if (this.d) {
            this.d = false;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        if (onKeyDown && i == 66) {
            this.f = '\n';
        }
        return onKeyDown;
    }

    @Override // com.meituan.msi.api.component.input.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8388f0440e898477174524c8e96581a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8388f0440e898477174524c8e96581a");
        } else if (this.x != null) {
            com.meituan.msi.log.a.a("textArea: success to register KeyBoardProvider");
            this.x.a(new com.meituan.msi.page.d() { // from class: com.meituan.msi.api.component.textaera.TextArea.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.page.d
                public final void a(int i) {
                    Activity a2;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fb22f1058ca335f672d1e34786fb00e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fb22f1058ca335f672d1e34786fb00e");
                        return;
                    }
                    TextArea.this.setKeyboardHeight(i);
                    MSIBaseInputEvent mSIBaseInputEvent = new MSIBaseInputEvent();
                    mSIBaseInputEvent.value = TextArea.this.getValue();
                    mSIBaseInputEvent.height = i;
                    mSIBaseInputEvent.viewId = TextArea.this.k;
                    if (TextArea.this.u != null && TextArea.this.M) {
                        TextArea.this.u.a("onKeyBoardHeightChange", mSIBaseInputEvent);
                    }
                    if (i > 0) {
                        TextArea.F = true;
                    }
                    if (TextArea.this.M && i != 0) {
                        if (TextArea.this.W && (a2 = TextArea.this.w.a()) != null && (a2.getCurrentFocus() instanceof TextArea)) {
                            TextArea.a(TextArea.this, i);
                        }
                        TextArea textArea = TextArea.this;
                        int i2 = i + textArea.P;
                        Object[] objArr3 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = TextArea.a;
                        if (PatchProxy.isSupport(objArr3, textArea, changeQuickRedirect3, false, "e585c57a4d6a96fd070b479637172751", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, textArea, changeQuickRedirect3, false, "e585c57a4d6a96fd070b479637172751");
                            return;
                        } else if (textArea.K) {
                            TextArea.I = textArea.z;
                            if (textArea.J) {
                                return;
                            }
                            if (textArea.x == null) {
                                com.meituan.msi.log.a.a("keyBoardProvider is null");
                                return;
                            }
                            Rect rect = new Rect();
                            textArea.getGlobalVisibleRect(rect);
                            int a3 = rect.bottom + textArea.a(textArea.z);
                            f.a(textArea.w.a());
                            textArea.x.a(a3 - (f.b() - i2), i2, a3 <= textArea.x.b());
                            return;
                        } else {
                            return;
                        }
                    }
                    boolean z = i == 0;
                    TextArea.F = z;
                    if (z) {
                        TextArea.a(TextArea.this);
                    }
                }
            });
        } else {
            com.meituan.msi.log.a.a("textArea: failed to register KeyBoardProvider");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8898f6abdc5bd92da3e7391dabad38", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8898f6abdc5bd92da3e7391dabad38")).booleanValue() : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e9e8182d2f39899aae232713762c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e9e8182d2f39899aae232713762c8f");
            return;
        }
        this.M = z;
        this.h = z;
        if (!z) {
            MSIBaseInputEvent mSIBaseInputEvent = new MSIBaseInputEvent();
            mSIBaseInputEvent.value = getValue();
            mSIBaseInputEvent.cursor = getCursor();
            mSIBaseInputEvent.viewId = this.k;
            if (this.u != null) {
                this.u.a("onBlur", mSIBaseInputEvent);
                return;
            }
            return;
        }
        if (this.x == null) {
            d();
        }
        MSIBaseInputEvent mSIBaseInputEvent2 = new MSIBaseInputEvent();
        mSIBaseInputEvent2.value = getValue();
        mSIBaseInputEvent2.cursor = getCursor();
        mSIBaseInputEvent2.viewId = this.k;
        mSIBaseInputEvent2.height = D;
        if (this.u != null) {
            this.u.a("onFocus", mSIBaseInputEvent2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd85ab763afc190d348f5bbca2427eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd85ab763afc190d348f5bbca2427eb");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public int getStatusBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9ddf1f120ceafada90f91926e77a62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9ddf1f120ceafada90f91926e77a62")).intValue();
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05fa51e567039107642b2896d27c23b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05fa51e567039107642b2896d27c23b0");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        ComponentParam componentParam = new ComponentParam();
        componentParam.w = i;
        componentParam.h = i2;
        componentParam.oldw = i3;
        componentParam.oldh = i4;
        componentParam.viewId = this.k;
        componentParam.autoHeight = this.C;
        componentParam.keyboardShow = F;
        componentParam.keyboardHeight = this.x.a();
        componentParam.lineCount = getLineCount();
        this.x.a(com.meituan.msi.page.a.onSizeChanged, this, this.U, this.u, componentParam);
    }

    public void setMSITextAreaOriginPositionManager(a aVar) {
        this.U = aVar;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2f5be03721b086a4c9340ea793bed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2f5be03721b086a4c9340ea793bed4");
            return;
        }
        MSIBaseInputEvent mSIBaseInputEvent = new MSIBaseInputEvent();
        this.R = getLineCount();
        mSIBaseInputEvent.lineCount = getLineCount();
        mSIBaseInputEvent.height = getHeight();
        mSIBaseInputEvent.viewId = this.k;
        if (this.u != null) {
            this.u.a("onTextAreaHeightChange", mSIBaseInputEvent);
        }
    }
}
