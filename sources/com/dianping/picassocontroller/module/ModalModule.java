package com.dianping.picassocontroller.module;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.g;
import com.dianping.picassocontroller.widget.ActionSheetDialog;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = UIConfig.MODAL)
/* loaded from: classes.dex */
public class ModalModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class ActionItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String style;
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class ActionSheetArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ActionItem[] actionItems;
        public boolean androidStyle;
        public ActionItem cancelItem;
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class AlertArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String message;
        public String okTitle;
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class ConfirmArgument extends AlertArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String cancelTitle;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class PopoverArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int height;
        public int width;
        public int x;
        public int y;
        public int vcId = -1;
        public boolean cancelable = true;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class PromptArgument extends ConfirmArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String input;
        public String placeholder;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class ToastArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int duration = -1;
        public boolean isSystem;
        public String message;
        public String position;
    }

    @Keep
    @PCSBMethod(name = "toast")
    public void toast(final b bVar, final ToastArgument toastArgument) {
        Object[] objArr = {bVar, toastArgument};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d114a39e3ddc0c004794f7c11f8a7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d114a39e3ddc0c004794f7c11f8a7a6");
        } else if (toastArgument == null || !(bVar instanceof g)) {
        } else {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.ModalModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a62a39a7e4b6ad58a11430516f0d97e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a62a39a7e4b6ad58a11430516f0d97e5");
                    } else if (toastArgument.isSystem) {
                        Toast makeText = Toast.makeText(bVar.b(), toastArgument.message, 0);
                        makeText.setGravity(ModalModule.this.getToastGravity(toastArgument.position), 0, PicassoUtils.dp2px(bVar.b(), "center".equals(toastArgument.position) ? 0 : 50));
                        makeText.show();
                    } else if (bVar.b() instanceof Activity) {
                        com.sankuai.meituan.android.ui.widget.a e = new com.sankuai.meituan.android.ui.widget.a((Activity) bVar.b(), toastArgument.message, toastArgument.duration).a(true).e(ModalModule.this.getToastGravity(toastArgument.position));
                        if ("top".equals(toastArgument.position)) {
                            e.a(0, com.sankuai.meituan.android.ui.widget.a.a(bVar.b(), 50.0f), 0, 0);
                        } else if ("bottom".equals(toastArgument.position) || TextUtils.isEmpty(toastArgument.position)) {
                            e.a(0, 0, 0, com.sankuai.meituan.android.ui.widget.a.a(bVar.b(), 50.0f));
                        }
                        e.a();
                    } else {
                        com.dianping.codelog.b.b(ModalModule.class, "toast host.getContext() != activity");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getToastGravity(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a28102eb4711a7de104fdba9df187d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a28102eb4711a7de104fdba9df187d")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 81;
        }
        if (str.equals("center")) {
            return 17;
        }
        return str.equals("top") ? 49 : 81;
    }

    @Keep
    @PCSBMethod(name = "alert")
    public void alert(final b bVar, final AlertArgument alertArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, alertArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32f34bf43b081e9f45ab947a2ebcc560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32f34bf43b081e9f45ab947a2ebcc560");
        } else if (bVar instanceof g) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.ModalModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a37c7517b78ba90c93082bf89683e72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a37c7517b78ba90c93082bf89683e72");
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(bVar.b(), 2131558947);
                    if (!TextUtils.isEmpty(alertArgument.title)) {
                        builder.setTitle(alertArgument.title);
                    }
                    builder.setMessage(alertArgument.message).setPositiveButton(TextUtils.isEmpty(alertArgument.okTitle) ? PicassoUtils.getOKString(bVar.b()) : alertArgument.okTitle, new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.2.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c10a1a9e6e94558a7b0c34d12c01d57a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c10a1a9e6e94558a7b0c34d12c01d57a");
                            } else {
                                bVar2.a(null);
                            }
                        }
                    });
                    builder.setCancelable(false);
                    try {
                        builder.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "confirm")
    public void confirm(final b bVar, final ConfirmArgument confirmArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, confirmArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a5117b9c4d11a712d2d8dbc51f2c0eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a5117b9c4d11a712d2d8dbc51f2c0eb");
        } else if (bVar instanceof g) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.ModalModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "744fcf98056e60119f5ca271aa4de05d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "744fcf98056e60119f5ca271aa4de05d");
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(bVar.b(), 2131558948);
                    if (!TextUtils.isEmpty(confirmArgument.title)) {
                        builder.setTitle(confirmArgument.title);
                    }
                    builder.setMessage(confirmArgument.message).setPositiveButton(TextUtils.isEmpty(confirmArgument.okTitle) ? PicassoUtils.getOKString(bVar.b()) : confirmArgument.okTitle, new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.3.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8c764c85bd7f73a8e1278672d86ccb0a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8c764c85bd7f73a8e1278672d86ccb0a");
                            } else {
                                bVar2.a(new JSONBuilder().put("clicked", TextUtils.isEmpty(confirmArgument.okTitle) ? PicassoUtils.getOKString(bVar.b()) : confirmArgument.okTitle).toJSONObject());
                            }
                        }
                    }).setNegativeButton(TextUtils.isEmpty(confirmArgument.cancelTitle) ? PicassoUtils.getCancelString(bVar.b()) : confirmArgument.cancelTitle, new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.3.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e8a2205f678db3e86326913499581c72", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e8a2205f678db3e86326913499581c72");
                            } else {
                                bVar2.a(new JSONBuilder().put("clicked", TextUtils.isEmpty(confirmArgument.cancelTitle) ? PicassoUtils.getCancelString(bVar.b()) : confirmArgument.cancelTitle).toJSONObject());
                            }
                        }
                    });
                    builder.setCancelable(false);
                    try {
                        builder.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "prompt")
    public void prompt(final b bVar, final PromptArgument promptArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, promptArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b88ccec4161214d1824911a8bc9f54e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b88ccec4161214d1824911a8bc9f54e0");
        } else if (bVar instanceof g) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.ModalModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60278e9ad873956e35e283d2b05f8998", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60278e9ad873956e35e283d2b05f8998");
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(bVar.b(), 2131558950);
                    if (!TextUtils.isEmpty(promptArgument.title)) {
                        builder.setTitle(promptArgument.title);
                    }
                    View inflate = LayoutInflater.from(bVar.b()).inflate(R.layout.picasso_modal_prompt, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.tv_msg);
                    final EditText editText = (EditText) inflate.findViewById(R.id.edit_input);
                    if (!TextUtils.isEmpty(promptArgument.placeholder)) {
                        editText.setHint(promptArgument.placeholder);
                    }
                    if (!TextUtils.isEmpty(promptArgument.input)) {
                        editText.setText(promptArgument.input);
                        editText.setSelection(promptArgument.input.length());
                    }
                    textView.setText(promptArgument.message);
                    builder.setView(inflate);
                    final String oKString = TextUtils.isEmpty(promptArgument.okTitle) ? PicassoUtils.getOKString(bVar.b()) : promptArgument.okTitle;
                    builder.setPositiveButton(oKString, new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.4.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3c22ba7ad113b5e15ad30a2f290ffef8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3c22ba7ad113b5e15ad30a2f290ffef8");
                            } else {
                                bVar2.a(new JSONBuilder().put("clicked", oKString).put(TensorConfig.KEY_INPUT_ARRAY, editText.getText().toString()).toJSONObject());
                            }
                        }
                    }).setNegativeButton(TextUtils.isEmpty(promptArgument.cancelTitle) ? PicassoUtils.getCancelString(bVar.b()) : promptArgument.cancelTitle, new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.4.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7f339af54ee3ba75f106bca3e9e2b3b9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7f339af54ee3ba75f106bca3e9e2b3b9");
                            } else {
                                bVar2.a(new JSONBuilder().put("clicked", TextUtils.isEmpty(promptArgument.cancelTitle) ? PicassoUtils.getCancelString(bVar.b()) : promptArgument.cancelTitle).put(TensorConfig.KEY_INPUT_ARRAY, editText.getText().toString()).toJSONObject());
                            }
                        }
                    });
                    builder.setCancelable(false);
                    AlertDialog create = builder.create();
                    create.getWindow().setSoftInputMode(5);
                    try {
                        create.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "actionSheet")
    public void actionSheet(final b bVar, final ActionSheetArgument actionSheetArgument, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, actionSheetArgument, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9e33128f98b5b6045b62d1484b5bd12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9e33128f98b5b6045b62d1484b5bd12");
        } else if (bVar instanceof g) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.ModalModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    TextView textView;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1376f9b92958a05606204a2438dd8a8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1376f9b92958a05606204a2438dd8a8e");
                    } else if (actionSheetArgument.androidStyle) {
                        ArrayList arrayList = new ArrayList();
                        for (ActionItem actionItem : actionSheetArgument.actionItems) {
                            arrayList.add(actionItem.title);
                        }
                        new AlertDialog.Builder(bVar.b(), 2131558946).setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.5.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e8931e5a020b86a5228d33da0a9e8eef", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e8931e5a020b86a5228d33da0a9e8eef");
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("index", i);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                bVar2.a(jSONObject);
                                dialogInterface.dismiss();
                            }
                        }).create().show();
                    } else {
                        final ActionSheetDialog actionSheetDialog = new ActionSheetDialog(bVar.b(), 3);
                        ActionSheetArgument actionSheetArgument2 = actionSheetArgument;
                        Object[] objArr3 = {actionSheetArgument2};
                        ChangeQuickRedirect changeQuickRedirect4 = ActionSheetDialog.a;
                        if (PatchProxy.isSupport(objArr3, actionSheetDialog, changeQuickRedirect4, false, "2e954d66af7b6340961e738459fc927c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, actionSheetDialog, changeQuickRedirect4, false, "2e954d66af7b6340961e738459fc927c");
                        } else {
                            actionSheetDialog.b.addView(actionSheetDialog.a(actionSheetArgument2));
                            String cancelString = PicassoUtils.getCancelString(actionSheetDialog.getContext());
                            if (actionSheetArgument2.cancelItem != null && !TextUtils.isEmpty(actionSheetArgument2.cancelItem.title)) {
                                cancelString = actionSheetArgument2.cancelItem.title;
                            }
                            String str = cancelString;
                            LinearLayout linearLayout = actionSheetDialog.b;
                            Object[] objArr4 = {str};
                            ChangeQuickRedirect changeQuickRedirect5 = ActionSheetDialog.a;
                            if (PatchProxy.isSupport(objArr4, actionSheetDialog, changeQuickRedirect5, false, "5c56fd0e0ebdb1501de905ff4356c0e1", RobustBitConfig.DEFAULT_VALUE)) {
                                textView = (TextView) PatchProxy.accessDispatch(objArr4, actionSheetDialog, changeQuickRedirect5, false, "5c56fd0e0ebdb1501de905ff4356c0e1");
                            } else {
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(Color.parseColor("#eeffffff"));
                                gradientDrawable.setCornerRadius(PicassoUtils.dp2px(actionSheetDialog.getContext(), 10.0f));
                                AppCompatTextView a2 = actionSheetDialog.a(PicassoUtils.dp2px(actionSheetDialog.getContext(), 50.0f));
                                a2.setTextColor(Color.parseColor("#327afd"));
                                a2.setText(str);
                                a2.setTextSize(0, actionSheetDialog.getContext().getResources().getDimension(R.dimen.action_sheet_cancel_text_size));
                                a2.setBackground(gradientDrawable);
                                a2.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.widget.ActionSheetDialog.3
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr5 = {view};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "59eda9fd53b79dbf95ea3785f2d5c624", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "59eda9fd53b79dbf95ea3785f2d5c624");
                                        } else {
                                            ActionSheetDialog.this.cancel();
                                        }
                                    }
                                });
                                a2.getPaint().setFakeBoldText(true);
                                textView = a2;
                            }
                            linearLayout.addView(textView);
                        }
                        actionSheetDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.dianping.picassocontroller.module.ModalModule.5.2
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                Object[] objArr5 = {dialogInterface};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "822762583cc801665bcdcf9766069b06", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "822762583cc801665bcdcf9766069b06");
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("index", -1);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                bVar2.a(jSONObject);
                            }
                        });
                        actionSheetDialog.c = new DialogInterface.OnClickListener() { // from class: com.dianping.picassocontroller.module.ModalModule.5.3
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr5 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "a76ccb2d6dea4c9e1c2262e5ac5a888d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "a76ccb2d6dea4c9e1c2262e5ac5a888d");
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("index", i);
                                } catch (JSONException unused) {
                                }
                                bVar2.a(jSONObject);
                                dialogInterface.dismiss();
                            }
                        };
                        actionSheetDialog.show();
                    }
                }
            });
        }
    }

    @Keep
    @PCSBMethod(name = "popover")
    public void popover(final b bVar, final PopoverArgument popoverArgument) {
        Object[] objArr = {bVar, popoverArgument};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8c26525c36b54fdfb10cc00e627300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8c26525c36b54fdfb10cc00e627300");
            return;
        }
        final int i = popoverArgument.vcId;
        if (i >= 0 && (bVar instanceof g)) {
            ((g) bVar).a(new Runnable() { // from class: com.dianping.picassocontroller.module.ModalModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6659ce56dd13974e636a3924a2fb1938", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6659ce56dd13974e636a3924a2fb1938");
                        return;
                    }
                    Context b = bVar.b();
                    Dialog dialog = new Dialog(b, 2131558949);
                    PicassoView picassoView = new PicassoView(b);
                    dialog.requestWindowFeature(1);
                    Window window = dialog.getWindow();
                    window.setContentView(picassoView);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = popoverArgument.width == 0 ? -1 : PicassoUtils.dp2px(b, popoverArgument.width);
                    attributes.height = popoverArgument.height != 0 ? PicassoUtils.dp2px(b, popoverArgument.height) : -1;
                    attributes.x = PicassoUtils.dp2px(b, popoverArgument.x);
                    attributes.y = PicassoUtils.dp2px(b, popoverArgument.y);
                    attributes.gravity = 51;
                    window.getDecorView().setPadding(0, 0, 0, 0);
                    window.setAttributes(attributes);
                    ((g) bVar).a(i, "onLoad", (JSONObject) null);
                    ((g) bVar).a(picassoView, i, (g.a) null);
                    dialog.setCanceledOnTouchOutside(popoverArgument.cancelable);
                    dialog.show();
                }
            });
        }
    }
}
