package com.dianping.titans.js.jshandler;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PromptJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cada9912f19f772cb878f503be54d560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cada9912f19f772cb878f503be54d560");
        } else if (!jsHost().isActivated()) {
            jsCallbackError(-1, "internal error");
        } else {
            try {
                String optString = jsBean().argsJson.optString("message");
                CharSequence optString2 = jsBean().argsJson.optString("title");
                CharSequence optString3 = jsBean().argsJson.optString("okButton");
                CharSequence optString4 = jsBean().argsJson.optString("cancelButton");
                String optString5 = jsBean().argsJson.optString("text");
                AlertDialog.Builder builder = new AlertDialog.Builder(jsHost().getActivity());
                if (!TextUtils.isEmpty(optString2)) {
                    builder.setTitle(optString2);
                }
                LinearLayout linearLayout = new LinearLayout(jsHost().getContext());
                linearLayout.setOrientation(1);
                TextView textView = new TextView(jsHost().getContext());
                final EditText editText = new EditText(jsHost().getContext());
                String optString6 = jsBean().argsJson.optString(ReactTextInputShadowNode.PROP_PLACEHOLDER);
                if (!TextUtils.isEmpty(optString6)) {
                    editText.setHint(optString6);
                }
                if (!TextUtils.isEmpty(optString5)) {
                    editText.setText(optString5);
                    editText.setSelection(optString5.length());
                }
                editText.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.dianping.titans.js.jshandler.PromptJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e02d7a042fd7a09065604a9eed0c74de", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e02d7a042fd7a09065604a9eed0c74de");
                        } else {
                            ((InputMethodManager) PromptJsHandler.this.jsHost().getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                        }
                    }
                });
                textView.setText(optString);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout);
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = jsHost().getContext().getString(R.string.knb_sure);
                }
                AlertDialog.Builder positiveButton = builder.setPositiveButton(optString3, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.PromptJsHandler.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19495653b0f32004d92c10b3900db40a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19495653b0f32004d92c10b3900db40a");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ret", true);
                            jSONObject.put("text", editText.getText().toString());
                        } catch (JSONException unused) {
                        }
                        PromptJsHandler.this.jsCallback(jSONObject);
                    }
                });
                if (TextUtils.isEmpty(optString4)) {
                    optString4 = jsHost().getContext().getString(R.string.cancel);
                }
                positiveButton.setNegativeButton(optString4, new DialogInterface.OnClickListener() { // from class: com.dianping.titans.js.jshandler.PromptJsHandler.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8cfc80a383525bb0884ef55dcbf0e47c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8cfc80a383525bb0884ef55dcbf0e47c");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ret", false);
                        } catch (JSONException unused) {
                        }
                        PromptJsHandler.this.jsCallback(jSONObject);
                    }
                });
                builder.setCancelable(false);
                builder.show();
            } catch (Exception unused) {
            }
        }
    }
}
