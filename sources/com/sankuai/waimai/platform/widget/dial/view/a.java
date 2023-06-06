package com.sankuai.waimai.platform.widget.dial.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
import com.sankuai.waimai.foundation.utils.ac;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.q;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements DialContract.c {
    public static ChangeQuickRedirect a;
    Context b;
    String c;
    private Dialog d;
    private q e;

    public a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989fe15a19b74f1633d76d4a5b085997", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989fe15a19b74f1633d76d4a5b085997");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a29223ee2105891b5d498e17c1ccc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a29223ee2105891b5d498e17c1ccc1");
        } else if (this.b != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    if (this.b instanceof Activity) {
                        ae.a((Activity) this.b, (int) R.string.wm_widget_no_useable_phones);
                    }
                } else if (ac.a(this.b)) {
                    z.a(this.b, str);
                } else if (this.b instanceof Activity) {
                    ae.a((Activity) this.b, (int) R.string.wm_widget_orderProgress_telephonyDisable);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void a(String str, String str2, String str3, String str4, final DialContract.c.b bVar) {
        Object[] objArr = {str, str2, str3, str4, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7284edde7296e932f471cf921e887fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7284edde7296e932f471cf921e887fd2");
        } else if (this.b == null || bVar == null) {
        } else {
            try {
                new CustomDialog.a(this.b).a(str).b(str2).b(false).a(str3, false, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.6
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5944fe77d2e75bb343183e88122f187f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5944fe77d2e75bb343183e88122f187f");
                        } else if (bVar.b()) {
                            dialogInterface.dismiss();
                        }
                    }
                }).b(str4, false, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "809e76f481bf5f789c93341629f3ac21", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "809e76f481bf5f789c93341629f3ac21");
                        } else if (bVar.c()) {
                            dialogInterface.dismiss();
                        }
                    }
                }).b();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void a(String str, String str2, String str3, String str4, final DialContract.c.d dVar) {
        Object[] objArr = {str, str2, str3, str4, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00bd078929df2e9c5038d46325d1f1dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00bd078929df2e9c5038d46325d1f1dc");
        } else if (this.b != null) {
            try {
                final View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_common_widget_dial_view_expired_dialog_layout, (ViewGroup) null);
                final CustomDialog b = new CustomDialog.a(this.b).a(inflate).b(false).b();
                ((TextView) b.findViewById(R.id.txt_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.7
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dc0345a1707f42de35063f4f43e5ad1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dc0345a1707f42de35063f4f43e5ad1");
                        } else if (dVar.c()) {
                            b.dismiss();
                        }
                    }
                });
                ((TextView) b.findViewById(R.id.txt_confirm)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.8
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49e377d0a2832c92f16951ea8d6b481b", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49e377d0a2832c92f16951ea8d6b481b");
                        } else if (dVar.b()) {
                            b.dismiss();
                        }
                    }
                });
                ((TextView) b.findViewById(R.id.txt_title)).setText(str);
                ((TextView) b.findViewById(R.id.text_message)).setText(str2);
                View findViewById = b.findViewById(R.id.ll_main_tip);
                final TextView textView = (TextView) b.findViewById(R.id.txt_main_tip);
                TextView textView2 = (TextView) b.findViewById(R.id.txt_btn);
                if (TextUtils.isEmpty(str4)) {
                    findViewById.setVisibility(8);
                    return;
                }
                findViewById.setVisibility(0);
                String str5 = TextUtils.isEmpty(str3) ? "或者您仍然想" : str3;
                textView.setText(str5);
                textView2.setText(str4);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.9
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "351391fbe4c7626f63ddca927535ae9f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "351391fbe4c7626f63ddca927535ae9f");
                            return;
                        }
                        dVar.a();
                        b.dismiss();
                    }
                });
                final float measureText = textView2.getPaint().measureText(str4);
                final float measureText2 = textView.getPaint().measureText(str5);
                inflate.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.10
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        LinearLayout.LayoutParams layoutParams;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66292f6ddac87892be64edf743889f1a", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66292f6ddac87892be64edf743889f1a")).booleanValue();
                        }
                        inflate.getViewTreeObserver().removeOnPreDrawListener(this);
                        if ((inflate.getMeasuredWidth() - g.a(a.this.b, 18.0f)) - measureText > measureText2 || (layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams()) == null) {
                            return true;
                        }
                        layoutParams.weight = 1.0f;
                        textView.setLayoutParams(layoutParams);
                        return true;
                    }
                });
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void a(String str, String str2, String str3, String str4, String str5, final DialContract.c.a aVar, String str6) {
        String str7 = str3;
        Object[] objArr = {str, str2, str7, str4, str5, aVar, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5513d13b74edc647052986551e4b445e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5513d13b74edc647052986551e4b445e");
            return;
        }
        if (this.e == null) {
            this.e = new q();
        }
        if (this.b == null || aVar == null) {
            return;
        }
        try {
            int a2 = g.a(this.b) - g.a(this.b, 68.0f);
            final CustomDialog b = new CustomDialog.a(this.b).e(R.layout.wm_common_widget_dial_view_changeable_dialog_layout).b(false).b();
            Window window = b.getWindow();
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = a2;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(17170445);
            b.findViewById(R.id.dialog_root).setMinimumWidth(a2);
            ((RooButton) b.findViewById(R.id.btn_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "422df5db22a99defe28f440a0a6f586a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "422df5db22a99defe28f440a0a6f586a");
                    } else if (aVar.c()) {
                        b.dismiss();
                    }
                }
            });
            ((RooButton) b.findViewById(R.id.btn_confirm)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.12
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd73dee49a4ef7aa6f6caae9cf2b56bc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd73dee49a4ef7aa6f6caae9cf2b56bc");
                    } else if (aVar.b()) {
                        b.dismiss();
                    }
                }
            });
            TextView textView = (TextView) b.findViewById(R.id.text_number);
            if (str7 != null && str3.length() == 11) {
                StringBuilder sb = new StringBuilder(str7);
                sb.insert(7, CommonConstant.Symbol.MINUS).insert(3, CommonConstant.Symbol.MINUS);
                str7 = sb.toString();
            }
            textView.setText(str7);
            this.e.a(textView);
            ((TextView) b.findViewById(R.id.text_change)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.13
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a748158c2aa795a3cca1cd1530e59018", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a748158c2aa795a3cca1cd1530e59018");
                    } else if (aVar.a()) {
                        b.dismiss();
                    }
                }
            });
            TextView textView2 = (TextView) b.findViewById(R.id.txt_privacy_audio_record);
            if (TextUtils.isEmpty(str6)) {
                textView2.setVisibility(8);
                return;
            }
            textView2.setVisibility(0);
            textView2.setText(str6);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void a(String str, String str2, String str3, String str4, final DialContract.c.AbstractC1083c abstractC1083c) {
        Object[] objArr = {str, str2, str3, str4, abstractC1083c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5816e51adcdcbb2904150523113281e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5816e51adcdcbb2904150523113281e");
        } else if (this.b == null || abstractC1083c == null) {
        } else {
            try {
                CustomDialog b = new CustomDialog.a(this.b).e(R.layout.wm_common_widget_dial_view_edit_dialog_layout).b(false).a(str3, false, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d139e88cef1a173c5355f770ea8a1ebf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d139e88cef1a173c5355f770ea8a1ebf");
                        } else if (abstractC1083c.a(a.this.c, r3[0])) {
                            dialogInterface.dismiss();
                        }
                    }
                }).b(str4, false, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17124a1e2288108c3453bc927bb05997", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17124a1e2288108c3453bc927bb05997");
                        } else if (abstractC1083c.b(a.this.c, r3[0])) {
                            dialogInterface.dismiss();
                        }
                    }
                }).b();
                final CustomDialog[] customDialogArr = {b};
                final EditText editText = (EditText) b.findViewById(R.id.edit_number);
                editText.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.4
                    public static ChangeQuickRedirect a;
                    private StringBuilder d = new StringBuilder();
                    private boolean e;
                    private boolean f;

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        Object[] objArr2 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d0db4e8d64bf3c66e9ef7545402988c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d0db4e8d64bf3c66e9ef7545402988c");
                            return;
                        }
                        Object[] objArr3 = {charSequence};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        this.f = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6395e9485d6d1d092243018402e8bcf6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6395e9485d6d1d092243018402e8bcf6")).booleanValue() : charSequence.toString().matches("[0-9]{3}-[0-9]{4}-[0-9]{4}");
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        Object[] objArr2 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78ca4e98fdc64319713521491351ada7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78ca4e98fdc64319713521491351ada7");
                            return;
                        }
                        this.d.delete(0, this.d.length());
                        int length = charSequence.length();
                        for (int i4 = 0; i4 < length; i4++) {
                            char charAt = charSequence.charAt(i4);
                            if (charAt >= '0' && charAt <= '9') {
                                this.d.append(charAt);
                            }
                        }
                        Object[] objArr3 = {charSequence};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        this.e = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9859cb59353912a65b092a5595790913", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9859cb59353912a65b092a5595790913")).booleanValue() : charSequence.toString().matches("[0-9]{11}");
                        if (this.e) {
                            this.d.subSequence(0, 11);
                            editText.setText(this.d.insert(7, CommonConstant.Symbol.MINUS).insert(3, CommonConstant.Symbol.MINUS));
                            editText.setSelection((i < 3 ? i : (3 > i || i >= 7) ? i + 2 : i + 1) + i3);
                        } else if (this.f) {
                            editText.setText(this.d);
                            editText.setSelection((i < 3 ? i : (3 > i || i >= 7) ? i - 2 : i - 1) + i3);
                        }
                    }

                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        Object[] objArr2 = {editable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eba9aeba77e664da3d7525fb9fd0ddf4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eba9aeba77e664da3d7525fb9fd0ddf4");
                        } else {
                            a.this.c = editable.toString();
                        }
                    }
                });
                final InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
                editText.requestFocus();
                editText.post(new Runnable() { // from class: com.sankuai.waimai.platform.widget.dial.view.a.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47a25f506c1566528382f4cd293f594e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47a25f506c1566528382f4cd293f594e");
                        } else {
                            inputMethodManager.showSoftInput(editText, 0);
                        }
                    }
                });
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a159438f5fb947b3fcf1b092fd9004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a159438f5fb947b3fcf1b092fd9004");
        } else if (this.b != null) {
            try {
                if (this.b instanceof Activity) {
                    ae.a((Activity) this.b, str);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4f03f7dec3aa12eed01a4e38bbcf90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4f03f7dec3aa12eed01a4e38bbcf90");
            return;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.d);
        if (z) {
            this.d = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
        }
    }
}
