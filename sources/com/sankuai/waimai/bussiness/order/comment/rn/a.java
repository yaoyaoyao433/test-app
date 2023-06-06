package com.sankuai.waimai.bussiness.order.comment.rn;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.comment.rn.CursorEditText;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.bussiness.order.comment.utils.a b;
    private Context c;
    private View d;
    private CursorEditText e;
    private TextView f;
    private boolean g;
    private boolean h;
    private boolean i;
    private String j;
    @NonNull
    private List<String> k;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.h = false;
        return false;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.g = false;
        return false;
    }

    public a(Context context, Activity activity, String str) {
        super(context);
        Object[] objArr = {context, activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942c21cb2117feee4166fd90687b7f24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942c21cb2117feee4166fd90687b7f24");
            return;
        }
        this.g = true;
        this.h = true;
        this.i = false;
        this.k = new ArrayList();
        this.c = activity;
        this.j = str;
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d68628d13f8badd2a1d7387f9a2c58c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d68628d13f8badd2a1d7387f9a2c58c");
            } else if (f.a(this.c)) {
            } else {
                this.d = LayoutInflater.from(this.c).inflate(R.layout.wm_order_comment_rn_edit, (ViewGroup) this, false);
                addView(this.d);
                this.e = (CursorEditText) this.d.findViewById(R.id.edit_comment);
                this.f = (TextView) this.d.findViewById(R.id.comment_txt_count_tip);
                this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        Object[] objArr3 = {view, motionEvent};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5bd5aff48bc714c5b61d0b4d72803f59", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5bd5aff48bc714c5b61d0b4d72803f59")).booleanValue();
                        }
                        if (a.this.e.isFocused()) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            if ((motionEvent.getAction() & 255) == 1) {
                                view.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                        return false;
                    }
                });
                this.e.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        Object[] objArr3 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "92fabec2d9680943153b4eeccbc2a7f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "92fabec2d9680943153b4eeccbc2a7f0");
                        } else if (a.this.b != null) {
                            com.sankuai.waimai.bussiness.order.comment.utils.a aVar = a.this.b;
                            Object[] objArr4 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.comment.utils.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "7e0cb641f93edca81abe947c706e6bc0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "7e0cb641f93edca81abe947c706e6bc0");
                            } else {
                                aVar.b();
                            }
                        }
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        Object[] objArr3 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96e36c0e3d08d8ffbc24d877acaf747d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96e36c0e3d08d8ffbc24d877acaf747d");
                        } else if (a.this.h) {
                            a.a(a.this, false);
                            JudasManualManager.a a2 = JudasManualManager.a("b_ll8xy6yp").a("c_0f6oqhc");
                            a2.b = a.this.j;
                            a2.a();
                        }
                    }

                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        int color;
                        Object[] objArr3 = {editable};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c190ffb4d0b0a1d182432fdc095f5d21", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c190ffb4d0b0a1d182432fdc095f5d21");
                            return;
                        }
                        if (a.this.b != null) {
                            com.sankuai.waimai.bussiness.order.comment.utils.a aVar = a.this.b;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.comment.utils.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "74dfcb2a5f4ea4e48cd461e0834895a2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "74dfcb2a5f4ea4e48cd461e0834895a2");
                            } else {
                                aVar.b();
                                aVar.c();
                            }
                        }
                        if (editable == null || editable.length() <= 0) {
                            a.this.f.setText(a.this.getResources().getString(R.string.wm_comment_edit_text_limit, 8));
                        } else {
                            String trim = editable.toString().trim();
                            for (String str2 : a.this.k) {
                                if (str2 != null && !str2.isEmpty()) {
                                    while (trim.contains(str2)) {
                                        trim = trim.replace(str2, "");
                                    }
                                }
                            }
                            int i = 0;
                            for (int i2 = 0; i2 < trim.length(); i2++) {
                                if (trim.charAt(i2) != ' ') {
                                    i++;
                                }
                            }
                            if (i >= 8) {
                                TextView textView = a.this.f;
                                textView.setText(i + "/500");
                            } else if (i == 0) {
                                a.this.f.setText(a.this.getResources().getString(R.string.wm_comment_edit_text_limit, 8));
                            } else {
                                a.this.f.setText(a.this.getResources().getString(R.string.wm_comment_edit_need_text_limit, Integer.valueOf(8 - i)));
                            }
                            TextView textView2 = a.this.f;
                            if (i > 500) {
                                color = a.this.getContext().getResources().getColor(R.color.wm_order_confirm_white_red_2);
                            } else {
                                color = a.this.getContext().getResources().getColor(R.color.takeout_white_8);
                            }
                            textView2.setTextColor(color);
                        }
                        if (a.this.e != null) {
                            int height = a.this.e.getLayout().getHeight();
                            int height2 = (a.this.e.getHeight() - a.this.e.getPaddingTop()) - a.this.e.getPaddingBottom();
                            if (height > height2) {
                                a.this.e.scrollTo(0, height - height2);
                            } else {
                                a.this.e.scrollTo(0, 0);
                            }
                            a aVar2 = a.this;
                            String obj = a.this.e.getText() == null ? "" : a.this.e.getText().toString();
                            Object[] objArr5 = {obj};
                            ChangeQuickRedirect changeQuickRedirect5 = a.a;
                            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "533205eb7b6ad3941fe7a7f3ee2552a4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "533205eb7b6ad3941fe7a7f3ee2552a4");
                                return;
                            }
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("user_input", obj);
                            ((RCTEventEmitter) ((ReactContext) aVar2.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(aVar2.getId(), "onTextChange", createMap);
                        }
                    }
                });
                this.e.setOnEditTextCursorListener(new CursorEditText.a() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.comment.rn.CursorEditText.a
                    public final boolean a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cd8ed85150e5f427f58415bcc9f2691", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cd8ed85150e5f427f58415bcc9f2691")).booleanValue();
                        }
                        if (a.this.b != null) {
                            com.sankuai.waimai.bussiness.order.comment.utils.a aVar = a.this.b;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.comment.utils.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "666011a62786e60c00bc8fa703c04deb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "666011a62786e60c00bc8fa703c04deb");
                            } else if (aVar.b != null && aVar.e()) {
                                String obj = aVar.b.getText().toString();
                                int f = aVar.f() + 1;
                                if (f > obj.length()) {
                                    f = obj.length();
                                }
                                aVar.b.setSelection(f);
                            }
                        }
                        return false;
                    }
                });
                this.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.a.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        Object[] objArr3 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e4a25844cce190731d37bcc1cdf6a67", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e4a25844cce190731d37bcc1cdf6a67");
                        } else if (z && a.this.g) {
                            a.b(a.this, false);
                            JudasManualManager.a("b_vpdi7a52").a("c_0f6oqhc").a(a.this.c).a();
                        }
                    }
                });
                this.b = new com.sankuai.waimai.bussiness.order.comment.utils.a();
                this.b.a(this.e);
            }
        } catch (Exception unused) {
        }
    }

    public final void setHintText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fce9f9b0e280d406f97250f04cdfcfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fce9f9b0e280d406f97250f04cdfcfd");
        } else if (this.e != null) {
            this.e.setHint(str);
        }
    }

    public final void setFoodNameList(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5dd79f8118e9493045da47fcc4bfe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5dd79f8118e9493045da47fcc4bfe4");
        } else if (this.b != null) {
            ArrayList arrayList = new ArrayList();
            this.k.clear();
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string != null && !string.isEmpty()) {
                    List<String> list = this.k;
                    list.add("#" + string + "#");
                }
                arrayList.add(readableArray.getString(i));
            }
            this.b.a(arrayList);
        }
    }

    public final void setTextCountTipVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb3c1a84d9a1a5f800a2160b2c6e74ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb3c1a84d9a1a5f800a2160b2c6e74ec");
            return;
        }
        this.i = z;
        if (this.f == null || z) {
            return;
        }
        this.f.setVisibility(8);
    }
}
