package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ab;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.entity.AtInfo;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.view.XMEditText;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class InputEditorPlugin extends Plugin implements b, XMEditText.a {
    public static ChangeQuickRedirect b;
    private XMEditText a;
    private boolean c;
    private boolean d;
    private com.sankuai.xm.imui.common.processors.a m;
    private long n;
    private TextWatcher o;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return 0;
    }

    public static /* synthetic */ void a(InputEditorPlugin inputEditorPlugin) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, inputEditorPlugin, changeQuickRedirect, false, "02bc52de458f972b33b890f524dd70b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, inputEditorPlugin, changeQuickRedirect, false, "02bc52de458f972b33b890f524dd70b2");
            return;
        }
        com.sankuai.xm.ui.service.a aVar = (com.sankuai.xm.ui.service.a) m.a(com.sankuai.xm.ui.service.a.class);
        if (aVar != null) {
            aVar.b(com.sankuai.xm.imui.session.b.b(inputEditorPlugin.getContext()).b);
        }
    }

    public InputEditorPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a4b2416081dd15e533cff5fb2cc7ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a4b2416081dd15e533cff5fb2cc7ee");
        }
    }

    public InputEditorPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b2230614fa9705da8735c24c4b762c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b2230614fa9705da8735c24c4b762c");
        }
    }

    public InputEditorPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5c910c44b0f5162c975273411f4330", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5c910c44b0f5162c975273411f4330");
            return;
        }
        this.m = new com.sankuai.xm.imui.common.processors.a();
        this.n = 0L;
        this.o = new TextWatcher() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.1
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eeee91fbdeacfb9ae98eb4af08fe6f9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eeee91fbdeacfb9ae98eb4af08fe6f9");
                } else if (TextUtils.isEmpty(charSequence)) {
                    InputEditorPlugin.this.c(2);
                }
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2156a5d08981928578b7d4867915915", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2156a5d08981928578b7d4867915915");
                } else if (i4 == 1 && charSequence.charAt(i2) == '@') {
                    InputEditorPlugin.this.c(3);
                }
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2373866736296cbe0b8df1a9461a60fc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2373866736296cbe0b8df1a9461a60fc");
                } else if (!TextUtils.isEmpty(editable)) {
                    InputEditorPlugin.this.b(true);
                } else {
                    InputEditorPlugin.a(InputEditorPlugin.this);
                    InputEditorPlugin.this.c(1);
                }
            }
        };
        setUseKeyboardHeight(true);
        if (getOptionLayoutResource() <= 0) {
            setOptionLayoutResource(R.layout.xm_sdk_empty);
        }
        this.d = SessionParams.a(getContext()).m;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c12e32d42deacec53fbfc44cea6c425", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c12e32d42deacec53fbfc44cea6c425");
        }
        this.a = (XMEditText) layoutInflater.inflate(R.layout.xm_sdk_send_panel_plugin_editor, viewGroup, false);
        setIconView(this.a);
        this.a.setOnClickListener(null);
        this.a.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "236549666f48c211bc39dabeabf32b3a", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "236549666f48c211bc39dabeabf32b3a")).booleanValue();
                }
                InputEditorPlugin.this.c = true;
                if (!InputEditorPlugin.this.k && InputEditorPlugin.this.getSendPanel().a()) {
                    InputEditorPlugin.this.g();
                }
                return false;
            }
        });
        this.a.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b36ee77793ded6f4ecba7837366831a8", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b36ee77793ded6f4ecba7837366831a8")).booleanValue();
                }
                if (!InputEditorPlugin.this.k && motionEvent.getAction() == 1) {
                    if (InputEditorPlugin.this.c) {
                        InputEditorPlugin.this.c = false;
                    } else {
                        InputEditorPlugin.this.ae_();
                    }
                }
                return false;
            }
        });
        this.a.setOnPasteListener(this);
        this.a.requestFocus();
        this.a.addTextChangedListener(this.o);
        this.a.post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a39262ae3603c2d2e81198956ec15fb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a39262ae3603c2d2e81198956ec15fb");
                    return;
                }
                int width = (InputEditorPlugin.this.a.getWidth() - InputEditorPlugin.this.a.getPaddingLeft()) - InputEditorPlugin.this.a.getPaddingRight();
                if (InputEditorPlugin.this.a.getPaint() != null) {
                    width = (int) (width - (InputEditorPlugin.this.a.getPaint().getTextSize() * 2.0f));
                }
                InputEditorPlugin.this.m.b = width;
            }
        }));
        return this.a;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be07de8be6484420a940b261c2ab6975", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be07de8be6484420a940b261c2ab6975");
            return;
        }
        this.a.setLongClickable(!z ? 1 : 0);
        this.a.setEnabled(!z ? 1 : 0);
        if (z) {
            this.a.removeTextChangedListener(this.o);
            this.a.setTextColor(getResources().getColor(R.color.xm_sdk_input_hint_color));
            this.a.setTextSize(13.0f);
            return;
        }
        this.a.addTextChangedListener(this.o);
        this.a.setTextColor(getResources().getColor(R.color.xm_sdk_input_color));
        this.a.setTextSize(16.0f);
        this.a.setText((CharSequence) null);
        k();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.b
    public EditText getEditText() {
        return this.a;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.b
    public final TextMessage c() {
        AtInfo atInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ce53707dc3976619d98cf6e2f3134b", 6917529027641081856L)) {
            return (TextMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ce53707dc3976619d98cf6e2f3134b");
        }
        TextMessage a = com.sankuai.xm.imui.common.util.c.a(this.a.getText().toString());
        com.sankuai.xm.imui.common.view.c[] cVarArr = (com.sankuai.xm.imui.common.view.c[]) this.a.getText().getSpans(0, this.a.getText().length(), com.sankuai.xm.imui.common.view.c.class);
        if (!com.sankuai.xm.base.util.b.b(cVarArr)) {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.xm.imui.common.view.c cVar : cVarArr) {
                if (cVar != null) {
                    String str = (String) cVar.a("uid");
                    if (!TextUtils.isEmpty(str)) {
                        char c = 1;
                        if (str.startsWith(CommonConstant.Symbol.BRACKET_LEFT) && str.endsWith(CommonConstant.Symbol.BRACKET_RIGHT)) {
                            str = str.substring(1, str.length() - 1);
                            c = 2;
                        }
                        String[] split = str.split(CommonConstant.Symbol.COMMA);
                        long[] jArr = new long[split.length];
                        for (int i = 0; i < jArr.length; i++) {
                            jArr[i] = ab.a(split[i], 0L);
                        }
                        String str2 = (String) cVar.a("name");
                        if (c == 2) {
                            atInfo = new AtInfo(jArr, str2);
                        } else {
                            atInfo = new AtInfo(jArr[0], str2);
                        }
                        arrayList.add(atInfo);
                    }
                }
            }
            com.sankuai.xm.imui.common.util.c.a(a, (List<AtInfo>) arrayList, false);
        }
        return a;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd265c114343ec11d3266c10bea36e01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd265c114343ec11d3266c10bea36e01");
            return;
        }
        this.a.requestFocus();
        k.a(this.a, 0);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "156395a0eaf7def70414e802de9c6bf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "156395a0eaf7def70414e802de9c6bf2");
        } else {
            k.b(this.a, 0);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74483b32f8c73478170b20e4a6bb1261", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74483b32f8c73478170b20e4a6bb1261") : getResources().getString(R.string.xm_sdk_app_plugin_input_editor);
    }

    @Override // com.sankuai.xm.imui.common.view.XMEditText.a
    public final CharSequence a(@NonNull CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8818ca1077810fd2acf48992a01f6e49", 6917529027641081856L) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8818ca1077810fd2acf48992a01f6e49") : getSendPanel().getEmotionProcessor() != null ? getSendPanel().getEmotionProcessor().a(charSequence) : charSequence;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54084135280a83a049d35cfc7e3c2895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54084135280a83a049d35cfc7e3c2895");
            return;
        }
        super.onAttachedToWindow();
        k();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de236da6312879ef11212b49dd5bff4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de236da6312879ef11212b49dd5bff4");
            return;
        }
        h();
        b(false);
        super.onDetachedFromWindow();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public boolean a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98905b6855330f8cde4727d636b581f3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98905b6855330f8cde4727d636b581f3")).booleanValue();
        }
        if (super.a(i, obj)) {
            return true;
        }
        if (i == 3 && com.sankuai.xm.imui.b.a().e() == 2) {
            Object[] objArr2 = {getActivity(), new Long(com.sankuai.xm.imui.b.a().d()), new Long(IMUIManager.a().e()), new com.sankuai.xm.im.a<Intent>() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj2) {
                    Intent intent = (Intent) obj2;
                    Object[] objArr3 = {intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "6abd1203816ef8f8c035d2cf4eb85c0a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "6abd1203816ef8f8c035d2cf4eb85c0a");
                    } else {
                        InputEditorPlugin.this.onActivityResult(0, 0, intent);
                    }
                }
            }};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.common.util.j.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "720158ecaeb43f39a5aa79a41ac10ed9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "720158ecaeb43f39a5aa79a41ac10ed9");
            } else {
                try {
                    if (com.sankuai.xm.imui.localconfig.a.c().e()) {
                        com.sankuai.xm.imui.common.util.j.a();
                    }
                } catch (Exception e) {
                    d.a(e, "SecondPageUtils::getAtPage", new Object[0]);
                }
            }
        }
        return false;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin, com.sankuai.xm.imui.base.BaseActivity.a
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5f126d0639161e25ceab869a1fe746", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5f126d0639161e25ceab869a1fe746");
        } else if (intent != null && i == 0) {
            this.a.postDelayed(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b8b09b6637377272591b7a5d2ac5751", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b8b09b6637377272591b7a5d2ac5751");
                    } else {
                        InputEditorPlugin.this.g();
                    }
                }
            }), 200L);
            ArrayList<AtInfo> parcelableArrayListExtra = intent.getParcelableArrayListExtra("at_info_list");
            if (com.sankuai.xm.base.util.b.a((Collection<?>) parcelableArrayListExtra)) {
                return;
            }
            for (AtInfo atInfo : parcelableArrayListExtra) {
                a(atInfo, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e1cf7596046542fc9f9673bffedb31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e1cf7596046542fc9f9673bffedb31");
        } else if (this.a == null || !this.d || this.k) {
        } else {
            if (z && System.currentTimeMillis() - this.n < 100) {
                d.a("InputEditorPlugin::saveDraft: not reach interval", new Object[0]);
                return;
            }
            this.n = System.currentTimeMillis();
            Editable text = this.a.getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            d.a("InputEditorPlugin::saveDraft: draft = %s", text);
            com.sankuai.xm.ui.service.a aVar = (com.sankuai.xm.ui.service.a) m.a(com.sankuai.xm.ui.service.a.class);
            if (aVar != null) {
                aVar.a(com.sankuai.xm.ui.entity.a.a(text, com.sankuai.xm.imui.session.b.b(getContext()).b));
            }
        }
    }

    private void k() {
        com.sankuai.xm.ui.entity.a a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f0a7eb25b8374187f82f1e34083450", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f0a7eb25b8374187f82f1e34083450");
        } else if (this.a == null || !this.d || this.k) {
        } else {
            com.sankuai.xm.ui.service.a aVar = (com.sankuai.xm.ui.service.a) m.a(com.sankuai.xm.ui.service.a.class);
            if (!TextUtils.isEmpty(this.a.getText()) || aVar == null || (a = aVar.a(com.sankuai.xm.imui.session.b.b(getContext()).b)) == null) {
                return;
            }
            CharSequence a2 = a.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            this.a.setText(a2);
            this.a.setSelection(a2.length());
            c(2);
            postDelayed(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6f4d5212889b89e3cb4dd61605adc5f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6f4d5212889b89e3cb4dd61605adc5f");
                    } else {
                        InputEditorPlugin.this.g();
                    }
                }
            }), 200L);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.b
    public final void a(AtInfo atInfo, boolean z) {
        CharSequence a;
        Object[] objArr = {atInfo, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd5a800fd181f8c7c040931181f5c8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd5a800fd181f8c7c040931181f5c8d");
        } else if (atInfo == null || atInfo.c == null) {
        } else {
            if (!atInfo.b() && !atInfo.a()) {
                d.c("InputEditorPlugin::insertAtInfo members: %s, uid: %s", atInfo.d, Long.valueOf(atInfo.b));
                return;
            }
            if (!this.i) {
                g();
            }
            String str = atInfo.c;
            if (atInfo.b()) {
                a = this.m.a(str, atInfo.d);
            } else {
                a = this.m.a(str, atInfo.b);
            }
            CharSequence charSequence = a;
            Editable text = this.a.getText();
            int selectionStart = this.a.getSelectionStart();
            int selectionEnd = this.a.getSelectionEnd();
            if (selectionStart > 0 && text.charAt(selectionStart - 1) == '@') {
                selectionStart--;
            }
            text.replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), charSequence, 0, charSequence.length());
        }
    }
}
